import java.util.*;

public class Product{

	public static void main(String args[]){
		
		Scanner scan=new Scanner(System.in);
		
	
	ProductDetails p1=new ProductDetails();
	ProductDetails p2=new ProductDetails();
	ProductDetails p3=new ProductDetails();
	ProductDetails p4=new ProductDetails();
	ProductDetails p5=new ProductDetails();
		
		p1.Item="Product1";
		String pi1=p1.Item;
		p1.Price=2.98f; 	
		float pp1=p1.Price;
		p1.Item_code="P1";
		String pic1=p1.Item_code;
		
		p2.Item="Product2";
		String pi2=p2.Item;
		p2.Price=4.50f; 	
		float pp2=p2.Price;
		p2.Item_code="P2";
		String pic2=p2.Item_code;
		
		p3.Item="Product3";
		String pi3=p3.Item;
		p3.Price=9.98f; 	
		float pp3=p3.Price;
		p3.Item_code="P3";
		String pic3=p3.Item_code;
		
		p4.Item="Product4";
		String pi4=p4.Item;
		p4.Price=4.98f; 
		float pp4=p4.Price;		
		p4.Item_code="P4";
		String pic4=p4.Item_code;
		
		p5.Item="Product5";
		String pi5=p5.Item;
		p5.Price=6.87f; 	
		float pp5=p5.Price;
		p5.Item_code="P5";
		String pic5=p5.Item_code;
		
		
		String h1="Items";
		String h2="Price";
		String h3="Item Code";
		String divider="----------------------------------------------------------";
	
		System.out.println();
		System.out.printf("%-15s %10s %14s %n",h1,h2,h3);
		System.out.printf("%-15s %9.2f %8s %n",pi1,pp1,pic1);
		System.out.printf("%-15s %9.2f %8s %n",pi2,pp2,pic2);
		System.out.printf("%-15s %9.2f %8s %n",pi3,pp3,pic3);
		System.out.printf("%-15s %9.2f %8s %n",pi4,pp4,pic4);
		System.out.printf("%-15s %9.2f %8s %n",pi5,pp5,pic5);
		
		System.out.print("Enter the item code:");
		
		// can input lowercase or uppercase of product id
		String s1=scan.nextLine().toUpperCase();

		System.out.print("Enter the quantity:");
		int i=scan.nextInt();
		
		
		// call the function to get sub total
		
		p1.subTotal(i,pp1);
		float stot1=p1.subTotal(i,pp1);
		System.out.println(stot1);
		p2.subTotal(i,pp2);
		float stot2=p2.subTotal(i,pp2);
		p3.subTotal(i,pp3);
		float stot3=p3.subTotal(i,pp3);
		p4.subTotal(i,pp4);
		float stot4=p4.subTotal(i,pp4);
		p5.subTotal(i,pp5);
		float stot5=p5.subTotal(i,pp5);
		
		System.out.println("The amount to be paid");
		System.out.println("Product\t\tUnit Price\tQuantity\tSub Total");
		
		
		
		switch(s1){
			case "P1" :
				System.out.print(pi1+"\t");
				System.out.print(pp1+"\t\t");
				System.out.print(i+"\t\t");
				System.out.println(stot1);
				break;
			case "P2" :
				System.out.print(pi2+"\t");
				System.out.print(pp2+"\t\t");
				System.out.print(i+"\t\t");
				System.out.println(stot2);
				break;
			case "P3" :
				System.out.print(pi3+"\t");
				System.out.print(pp3+"\t\t");
				System.out.print(i+"\t\t");
				System.out.println(stot3);
				break;
			case "P4" :
				System.out.print(pi4+"\t");
				System.out.print(pp4+"\t\t");
				System.out.print(i+"\t\t");
				System.out.println(stot4);
				break;
			case "P5" :
				System.out.print(pi5+"\t");
				System.out.print(pp5+"\t\t");
				System.out.print(i+"\t\t");
				System.out.println(stot5);
				break;
			default:
				System.out.println("Error Input");
			
		}
		System.out.println(divider);

		
		

	}
	
	} 


/*

Items                Price      Item Code
Product1             2.98       P1
Product2             4.50       P2
Product3             9.98       P3
Product4             4.98       P4
Product5             6.87       P5
Enter the item code:P2
Enter the quantity:200
596.0
The amount to be paid
Product         Unit Price      Quantity        Sub Total
Product2        4.5             200             900.0
----------------------------------------------------------


Items                Price      Item Code
Product1             2.98       P1
Product2             4.50       P2
Product3             9.98       P3
Product4             4.98       P4
Product5             6.87       P5
Enter the item code:p1
Enter the quantity:100
298.0
The amount to be paid
Product         Unit Price      Quantity        Sub Total
Product1        2.98            100             298.0
----------------------------------------------------------

*/
