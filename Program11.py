
def DivisibleByThreeAndFive(iNo):

	
	if((iNo % 5 == 0) & (iNo % 3 == 0) ):
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