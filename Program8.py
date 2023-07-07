
def DivisibleByFive(iNo):

	iAns = iNo % 5
	if(iAns == 0):
		return 1
	else:
		return 0
	


def main ():

	iValue = int(input("Enter Number \n"))
	
	iRet = DivisibleByFive(iValue)

	if(iRet == 0):
		print( iValue,"is not divisible by 5")
	else:
		print( iValue,"is divisible by 5")	



if __name__ == "__main__":
	main()