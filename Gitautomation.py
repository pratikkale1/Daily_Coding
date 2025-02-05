import os
import time
import git
from watchdog.observers import Observer
from watchdog.events import FileSystemEventHandler

# Change these values
LOCAL_REPO_PATH = "E:\Github_automation\Daily_Coding"  # Update with your actual local Git repository path
BRANCH = "main"  # Change if your branch is different

class GitHandler(FileSystemEventHandler):
    new_files = []  # List to store newly added files

    def on_created(self, event):
        """Triggered when a new file is added."""
        if event.is_directory:
            return  # Ignore directory changes
        
        file_path = event.src_path
        print(f"🆕 New file detected: {file_path}")
        self.new_files.append(file_path)  # Store newly added files

    def push_to_git(self):
        """Adds, commits, and pushes all new files in batch."""
        try:
            repo = git.Repo(LOCAL_REPO_PATH)

            # Get all untracked files (new files)
            new_files = repo.untracked_files
            if not new_files:
                print("⚠️ No new files detected, skipping push.")
                return False

            # Stage all new files
            repo.git.add(new_files)
            commit_message = f"Auto-commit: {len(new_files)} new files added"
            repo.index.commit(commit_message)

            print(f"✅ {len(new_files)} files committed: {commit_message}")

            # Push to GitHub
            repo.remote(name="origin").push(BRANCH)
            print(f"🚀 {len(new_files)} new files pushed to GitHub successfully!")
            return True

        except git.exc.GitCommandError as e:
            print(f"❌ Git Error: {e}")
            return False
        except Exception as e:
            print(f"❌ Error: {e}")
            return False

if __name__ == "__main__":
    if not os.path.exists(LOCAL_REPO_PATH):
        print(f"❌ Error: Directory '{LOCAL_REPO_PATH}' does not exist.")
        exit(1)

    try:
        repo = git.Repo(LOCAL_REPO_PATH)
        print(f"📂 Monitoring Git repository: {repo.working_tree_dir}")
        print(f"🌍 Remote URL: {repo.remotes.origin.url}")

        event_handler = GitHandler()
        observer = Observer()
        observer.schedule(event_handler, path=LOCAL_REPO_PATH, recursive=False)
        
        print("👀 Monitoring directory for new files...")
        observer.start()

        try:
            while True:
                time.sleep(5)  # Check for new files every 5 seconds
                if event_handler.new_files:
                    event_handler.push_to_git()
                    event_handler.new_files = []  # Clear the list after uploading

        except KeyboardInterrupt:
            print("🛑 Stopping file watcher...")
            observer.stop()

        observer.join()

    except Exception as e:
        print(f"❌ Error: {e}")

