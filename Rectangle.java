public class Rectangle{

	public float height;
	public float width;
	Point origin;
	
	
	// Constructor
	public Rectangle(float w,float h){
		w=0.0f;
		h=0.0f;
		
		
	}
	public float getArea(float w,float h){
		float area=w*h;
		System.out.println("Height of Rectangle    :\t"+h +"\nWidth of Rectangle     :\t"
		+w+"\nArea of the Rectangle  :\t"+area);
		return area;
	}

	

	
	
	
}

/*
Height of Rectangle    :        12.5
Width of Rectangle     :        10.1
Area of the Rectangle  :        126.25001
*/