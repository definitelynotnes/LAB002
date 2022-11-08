import java.util.Scanner;

public class Answer1 {

	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Welcome to the Invoice Total Calculator");
		String choice = "";
		float totalInvoice = 0;
		float totalDiscount = 0;
		int transactionNumber = 0;
		float averageInvoice;
		float averageDiscount;
	    do
	    {    
	        ++transactionNumber;
	        
	    	System.out.print("\nEnter subtotal      : ");
			String stringAmount = scanner.nextLine();
			float amount = Float.parseFloat(stringAmount);
			
			System.out.print("Discount percent    : ");
			String discountPercent = scanner.nextLine();
			float discount = Float.parseFloat(discountPercent);
			
			float discountAmount = amount * discount;
			System.out.println("Discount amount     : " + discountAmount);
			
			float invoiceTotal = amount - discountAmount;
			System.out.println("Invoice total       : " + invoiceTotal);
	    	
			totalInvoice = totalInvoice + invoiceTotal;
			totalDiscount = totalDiscount + discountAmount;
			
			System.out.print("\nContinue? (y/n): ");
			choice = scanner.nextLine();
				if (choice.equals("n"))
				{
					break;
				}
	    }while(choice.equals("y"));  
	    
	    averageInvoice = (totalInvoice/transactionNumber);
		averageDiscount = (totalDiscount/transactionNumber);
		System.out.println("\nNumber of invoices  : " + transactionNumber);
		System.out.println("Average invoice     : " + averageInvoice);
		System.out.println("Average discount    : " + averageDiscount);
	}    
}

