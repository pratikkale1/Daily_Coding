def check(x):
    if (x%5==0):
        return True
    else:
        return False

def main():
    print("Enter the number:")
    no1 = input()
    Ans = check(int(no1))
    print(Ans)

if __name__ == "__main__":
    main()


