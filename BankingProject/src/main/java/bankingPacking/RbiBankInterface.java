package bankingPacking;

public interface RbiBankInterface extends GovtOfIndia {
	
	static float homeInterestRate = 8.5f;
	static int personalInterestRate = 11;

	public float interestcalc(int principal,int years);
	
	default float PersonalLoanInterestcalc(int principal,int years)
	{ 
	 float homeLoanCalc ;
	 homeLoanCalc = (principal * years * personalInterestRate )/ 100;
	 return homeLoanCalc;
	}
	
	public static void method1()
	{
		System.out.println("Static Method calling o/p");
		
	}

}
