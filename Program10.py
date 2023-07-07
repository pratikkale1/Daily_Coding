
def DivisibleByFive(iNo):

	iAns = iNo % 5
	if(iAns == 0):
		return True
	else:
		return False
	


def main ():

	iValue = int(input("Enter Number \n"))
	
	iRet = DivisibleByFive(iValue)

	if(iRet == False):
		print( iValue,"is not divisible by 5")
	else:
		print( iValue,"is divisible by 5")	



if __name__ == "__main__":
	main()