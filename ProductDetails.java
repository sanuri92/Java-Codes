public class ProductDetails{
	
			public String Item;
			public float Price; 	
			public String Item_code;
			
			public float subTotal(int Quantity,float Price){
				float Total=Quantity*Price;
				
				return Total;
				
				
			}

}