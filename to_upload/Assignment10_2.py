
import os
import sys

def Directory_Watcher1(Dir_Name,File_Extention,Extention):

    for Foldername, Subfolder, Filename in os.walk(Dir_Name):
                  
        for fname in Filename:
            if(fname.endswith(File_Extention)):

                flist = fname.split('.')
                NewFileName = flist[0]+'.'+Extention

                OldName_path = os.path.join(Dir_Name,Foldername,fname)
                NewName_path = os.path.join(Dir_Name,Foldername,NewFileName)
                  
                os.rename(OldName_path,NewName_path)
                
                print("All files Successfully Renamed...")

def main(): 
    print()

    if(sys.argv[1] == "-h"):
        print("This script will travel the directory and rename File with given extention by given other file extention")
        exit()

    if(sys.argv[1] == "-u"):
        print("Usage : <Application_name> <Direcory_Abs_Path> <File_Extention>")
        exit()

    Directory_Watcher1(sys.argv[1],sys.argv[2],sys.argv[3])

    print("All files Successfully Renamed...")

if(__name__ == "__main__"):
    main()
