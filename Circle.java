import java.text.DecimalFormat;

class Circle{
	public static void main(String args[]){
		double PI=3.14159;
		double radius=Double.parseDouble(args[0]);
		double area=(PI*radius*radius);
		double circumference=(2*PI*radius);
		DecimalFormat df=new DecimalFormat("0.000");
		
		
		System.out.println("area="+df.format(area));
		System.out.println("circumference="+df.format(circumference));
	
	}
}
/*
Circle 2.350
area=17.349430775000002
circumference=14.765473

when give df
Circle 2.350
area=17.349
circumference=14.765
*/