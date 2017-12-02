class DistanceBetween{

	public static void main(String args[]){
	
	double x1=Double.parseDouble(args[0]);
	double y1=Double.parseDouble(args[1]);
	double x2=Double.parseDouble(args[2]);
	double y2=Double.parseDouble(args[3]);
	
	double d=Math.sqrt(Math.pow((x2-x1),(double)0.5)+Math.pow((y2-y1),(double)0.5));
	
	System.out.println("Distence Between 2 Points:"+d);
	
	}


}
/*
DistanceBetween 1 1 3 3
1.6817928305074292
*/