
public class Decrypt {
	private int length;
	private String[] numbers;
	private int count;
	
	public Decrypt(int length, String[] numbers) { 
		this.length = length;
		this.numbers = numbers;
	}
	
	public int decrypt(int length, String[] numbers) { 
		//101010101
		 count = 0;
		

		
		for(int i =0; i < length; i++) { 
			
		count += (int)(Math.pow(2, i)) * (Integer.parseInt(numbers[length-1-i]));
			
			
		}
		System.out.println(count);

		return count;
		
	}
	public String[] getNum() { 
		return numbers;
	}
	public String toString() {
	    return count+"";
	}
}
