import java.util.*;
class SpendAmount{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		
		String h1="Items";
		String h2="Price";
		String h3="Item Code";
		String divider="----------------------------------------------------------";
	
		String Items1="product1"; 	float Price1=2.98f; 	String Item_code1="P1";
		String Items2="product2"; 	float Price2=4.50f; 	String Item_code2="P2";
		String Items3="product3"; 	float Price3=9.98f; 	String Item_code3="P3";
		String Items4="product4"; 	float Price4=4.49f; 	String Item_code4="P4";
		String Items5="product5"; 	float Price5=6.87f; 	String Item_code5="P5";
		
		System.out.println();
		System.out.printf("%-15s %10s %14s %n",h1,h2,h3);
		System.out.printf("%-15s %9.2f %8s %n",Items1,Price1,Item_code1);
		System.out.printf("%-15s %9.2f %8s %n",Items2,Price2,Item_code2);
		System.out.printf("%-15s %9.2f %8s %n",Items3,Price3,Item_code3);
		System.out.printf("%-15s %9.2f %8s %n",Items4,Price4,Item_code4);
		System.out.printf("%-15s %9.2f %8s %n",Items5,Price5,Item_code5);
		
		System.out.print("Enter the item code:");
		String s1=scan.nextLine();
		System.out.print("Enter the quantity:");
		int i=scan.nextInt();
		
		System.out.println("The amount to be paid");
		System.out.println("Product\t\tUnit Price\tQuantity\tSub Total");
		
		switch(s1){
			case "P1" :
				System.out.print("Product1\t");
				System.out.print(2.98+"\t\t");
				System.out.print(i+"\t\t");
				double subTotal=(double)i*(double)2.98;
				System.out.println(subTotal);
				break;
			case "P2" :
				System.out.print("Product2\t");
				System.out.print(4.50+"\t\t");
				System.out.print(i+"\t\t");
				subTotal=(double)i*(double)4.50;
				System.out.println(subTotal);
				break;
			case "P3" :
				System.out.print("Product3\t");	
				System.out.print(9.98+"\t\t");
				System.out.print(i+"\t\t");
				subTotal=(double)i*(double)9.98;
				System.out.println(subTotal);
				break;
			case "P4" :
				System.out.print("Product4\t");
				System.out.print(4.49+"\t\t");
				System.out.print(i+"\t\t");
				subTotal=(double)i*(double)4.49;
				System.out.println(subTotal);
				break;
			case "P5" :
				System.out.print("Product5\t");
				System.out.print(6.87+"\t\t");
				System.out.print(i+"\t\t");
				subTotal=(double)i*(double)6.87;
				System.out.println(subTotal);
				break;
			default:
				System.out.println("Error Input");
			
		}
		System.out.println(divider);

		
		
	
	
	
	
	}

}

/*
Items                Price      Item Code
product1             2.98       P1
product2             4.50       P2
product3             9.98       P3
product4             4.49       P4
product5             6.87       P5
Enter the item code:P3
Enter the quantity:450
The amount to be paid
Product         Unit Price      Quantity        Sub Total
Product3        9.98            450             4491.0
----------------------------------------------------------
*/