
public class PointX{
	
	//X coordinates
	
	double x1;
	double x2;

	public PointX(double x1,double x2){
		
		this.x1=x1;
		this.x2=x2;
		
	}
	public double XcoorDifference(double x1,double x2){
		double x=x2-x1;
		System.out.println("X coordinate Difference :"+x);
		return x;
		
	}
	
}