import java.util.*;

public class DistencePoint{

	public static void main(String args[]){
	
	Scanner scan=new Scanner(System.in);
								
	// Get Input by Scanner
	
	System.out.print("Enter X1 coordinates :");	
	double x1=scan.nextDouble();
	System.out.print("Enter Y1 coordinates :");
	double y1=scan.nextDouble();
	System.out.print("Enter X2 coordinates :");
	double x2=scan.nextDouble();
	System.out.print("Enter Y2 coordinates :");
	double y2=scan.nextDouble();
	
	PointX x=new PointX(x1,x2);
	PointY y=new PointY(y1,y2);
	double xd=x.XcoorDifference(x1,x2);
	double yd=y.YcoorDifference(y1,y2);
	
	double d=Math.sqrt(Math.pow((xd),1.00/2.00)+Math.pow((yd),(1.00/2.00)));
	
	System.out.println("Distence Between 2 Points:"+d);

	
	
	
	
	}



}
/*
Enter X1 coordinates :1.1
Enter Y1 coordinates :3.3
Enter X2 coordinates :2.2
Enter Y2 coordinates :4.4
X coordinate Difference :1.1
y coordinate Difference :1.1000000000000005
Distence Between 2 Points:1.4483154685151656
*/
