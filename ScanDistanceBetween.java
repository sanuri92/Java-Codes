import java.util.*;

class ScanDistanceBetween{

	public static void main(String args[]){
	
	Scanner scan=new Scanner(System.in);
	System.out.print("Enter X1 coordinates :");	
	double x1=scan.nextDouble();
	System.out.print("Enter Y1 coordinates :");
	double y1=scan.nextDouble();
	System.out.print("Enter X2 coordinates :");
	double x2=scan.nextDouble();
	System.out.print("Enter Y2 coordinates :");
	double y2=scan.nextDouble();
	
	double d=Math.sqrt(Math.pow((x2-x1),(double)1/(double)2)+Math.pow((y2-y1),(double)1/(double)2));
	
	System.out.println("Distence Between 2 Points:"+d);
	
	}


}
/*
Enter X1 coordinates :8
Enter Y1 coordinates :4
Enter X2 coordinates :16
Enter Y2 coordinates :8
Distence Between 2 Points:2.19736822693562
*/