import java.util.Scanner;

public class Answer2 {

	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Welcome to the Download Time Estimator");
		String choice = "";
		int hours;
		int minutes;
		int seconds;
	    do
	    {         
	    	System.out.print("\nEnter file size: ");
			String fileAmount = scanner.nextLine();
			float fileSize = Float.parseFloat(fileAmount);
			
			System.out.print("Enter download speed (MB/sec): ");
			String speed = scanner.nextLine();
			float totalSpeed = Float.parseFloat(speed);

			float fileDownload = fileSize/totalSpeed;
			minutes = (int) (fileDownload/60);
			hours = (int) (fileDownload/3600);
			seconds = (int) (fileDownload % 60);
			
			System.out.println(String.format("This download will take approximately %s hours %s minutes %s seconds", hours, minutes, seconds));
			
			System.out.print("\nContinue? (y/n): ");
			choice = scanner.nextLine();
				if (choice.equals("n"))
				{
					break;
				}
	    }while(choice.equals("y"));
	    
	    
	}    
}

