import java.util.*;

class ScanMortage{

	public static void main(String args[]){
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter principal Amount :");
		double principal=scan.nextDouble();
		System.out.print("Enter Rate :");
		double rate=scan.nextDouble();
		System.out.print("Enter No of Years :");
		int years=scan.nextInt();
		int N=years*12;//Number of payments
		double R=rate/((double)12*(double)100); //Monthly interest
		
		//double monthly_payment=principal*(R/((double)1-Math.pow(((double)1+R),-N)));  //1st way
		double monthly_payment=principal*(R/((double)1-((Math.pow((R),N)))));
		System.out.println("Monthly Payment :"+monthly_payment);
		
		
		
		
		
		
	}
	
	
	
}
/*
Enter principal Amount :75000
Enter Rate :10.25
Enter No of Years :5
Monthly Payment :640.625

*/