package bankingPacking;

public class HdfcClass implements RbiBankInterface {

	static int principal;
	static float amountCalc;
	static float PlAmt;
	float b;
	
	public static void main(String[] args) {
		HdfcClass obj = new HdfcClass();
		System.out.println("Home Loan method calling");
		amountCalc = obj.interestcalc(14000,8 );
		System.out.println("HomeLoan Rate calculation:  "+amountCalc);
		System.out.println("Personal Loan method calling");
		PlAmt= obj.PersonalLoanInterestcalc(12000,10);
		System.out.println("Personal Amount calc: " +PlAmt);
		obj.incomeTaxpaid();
		System.out.println("Class variable and its calc below ");
		System.out.println( obj.b = amountCalc + homeInterestRate);
		System.out.println("Family Details");
		obj.familyDetails();
		float f= RbiBankInterface.homeInterestRate;
	    System.out.println("Interface varible display : " +f);
	    RbiBankInterface.method1();
	    
	}
	
	public void incomeTaxpaid() {
	System.out.println("Income tax method calling: " + incomeTax);
	System.out.println("Class variable: " + b);
	
	}

	public float interestcalc(int principal,int years) {
		float homeInterestCalc;
		homeInterestCalc = (principal * homeInterestRate* years)/100;
		System.out.println("principal :   " + principal + "  Rate of interetest: " + homeInterestRate + " No of years : "+ years);
		return homeInterestCalc;
	}

	public void familyDetails()
	{
		String name = "Vino";
		String gender = "M";
		int Age = 23; 
		System.out.println("Name: "+ name + " Gender: "+gender + " age: "+ Age);
		
		
		
		
	}
}
