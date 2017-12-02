class Mortage{

	public static void main(String args[]){
		
		double principal=Double.parseDouble(args[0]);
		double rate=Double.parseDouble(args[1]);
		int years=Integer.parseInt(args[2]);
		int N=years*12;//Number of payments
		double R=rate/((double)12*(double)100); //Monthly interest
		
		//double monthly_payment=principal*(R/((double)1-Math.pow(((double)1+R),-N)));  //1st way
		double monthly_payment=principal*(R/((double)1-((Math.pow((R),N)))));
		System.out.println(monthly_payment);
		
		
		
		
		
		
	}
	
	
	
}
/* 1st way
100000.00 12.5 3
3345.3625576716327

2nd Way
100000.00 12.5 3
1041.6666666666665
*/