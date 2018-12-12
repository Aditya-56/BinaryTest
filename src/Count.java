
public class Count {
	private int x;
	private String[] array;
	public Count(int x) { 
		this.x = x;
		
	}

	public String[] length (int x) { 
		
		  String binary = x + "";
		array = new String[binary.length()];
		for(int i = 0; i < binary.length(); i++) { 
			array[i] = binary.substring(i,i+1);
		
		}
		return array;
		
}

	
}
