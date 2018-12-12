import java.util.Scanner;

public class Convert {

	public static void main(String[] args) {
		int x =0;
		Scanner input = new Scanner(System.in);
		while (true) {
			System.out.println("Press 1 to Convert to decimal, Press 2 to convert to binary. Enter -1 to quit. ");
			while (!input.hasNextInt()) {
				input.next();
				System.out.println("Enter a valid number");
				if (input.hasNextInt()) {
					x = input.nextInt();
					break;
				}
			}
			x=input.nextInt();
			if (x == 1 || x==2) {
				run(x);

			}
			if(x==-1) { 
				break;
			}
		}
	}

	public static void run(int solve) {
		Scanner input = new Scanner(System.in);
		int countCheck = 0;

		while (true) {
			
			if (solve == 1 || solve == 2) {
				break;
			}
		}

		if (solve == 1) {
			int x = 0;
			while(true) { 
			while (true) {
				countCheck = 0;
				System.out.println("Enter a number in binary");
				while (!input.hasNextInt()) {
					input.next();
					System.out.println("Enter a number in binary");
					if (input.hasNextInt()) {
						
						break;
					}
					
				} 
				
			x=input.nextInt();
			if(x>=0) {
				break;
			}
			}
				String check = x + "";
				Count count = new Count(x);
				String[] array = count.length(x);
				for (int i = 0; i < array.length; i++) {
					if (Integer.parseInt(array[i]) == 1 || Integer.parseInt(array[i]) == 0)
						countCheck++;
				}
				if (countCheck == check.length()) {
					break;
				}
			}

			Count count = new Count(x);
			String[] array = count.length(x);

			Decrypt decrypt = new Decrypt(array.length, array);
			decrypt.decrypt(array.length, array);
		}
		
		if (solve == 2) {
			int j=0;
			while(true) { 
			countCheck = 0;
			System.out.println("Enter a number in decimal greater than 0");
			while (!input.hasNextInt()) {
				input.next();
				System.out.println("Enter a number in decimal greater than 0");
				if (input.hasNextInt()) {
					break;
				}
			}
			

			 j = input.nextInt();
			if(j>0) { 
				break;
			}
			}
			Encrypt encrypt = new Encrypt(j);
			encrypt.solutions(j);
		}
	}

}

