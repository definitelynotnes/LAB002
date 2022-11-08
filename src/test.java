
public class test {

	public static void main(String[] args) {
		int x = 3666, y = 1;
		int total = x/y;
		int minutes = 800/60;
		int hours = total/3600;
		int seconds = 800 % 60;
		System.out.println(hours + " hour " + minutes + " + " +seconds);
	}

}
