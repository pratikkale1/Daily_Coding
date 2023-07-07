
def DivisibleByThreeAndFive(iNo):

	iAns1 = 0

	iAns2 = 0

	iAns1 = iNo % 3
	iAns2 = iNo % 5
	if((iAns1 == 0) & (iAns2 == 0) ):
		return True
	else:
		return False
	


def main ():

	iValue = int(input("Enter Number \n"))
	
	iRet = DivisibleByThreeAndFive(iValue)

	if(iRet == False):
		print( iValue,"is not divisible by 5 & 3")
	else:
		print( iValue,"is divisible by 5 & 3")	



if __name__ == "__main__":
	main()