
def Multiplication(iValue1,iValue2):
	iAns = iValue1 * iValue2
	return iAns


def main ():

	iNo1 = int(input("Enter 1st Number \n"))
	iNo2 = int(input("Enter 2nd Number \n"))

	iMult = Multiplication(iNo1,iNo2)

	print("Mulyiplication is ",iMult)


if __name__ == "__main__":
	main()