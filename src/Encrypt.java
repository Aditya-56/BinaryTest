import java.util.ArrayList;
import java.util.Collections;

public class Encrypt {
	private int binary;

	public Encrypt(int binary) {
		this.binary = binary;
	}

	public String solutions(int binary) {
		// 57
		String answer = "";
		int count = 0;
		int i = 0;
		int j = 0;
		ArrayList<Integer> check = new ArrayList<Integer>();
		while (true) {
			// 5 i =2 4<5 && 8>5

			if (((int) (Math.pow(2, i)) <= binary && (int) (Math.pow(2, i + 1)) > binary)) {
				// 57 it is 1XXXX
				binary = binary - (int) Math.pow(2, i);
				check.add(i);
				i = 0;

				if (binary == 0) {
					break;
				}
				if (binary - 1 == 0) {
					check.add(0);
					break;
				}
			}
			i++;

		}
		i = check.size() - 1;

		int d = 0;
		int c = 0;// 5,4,3,0
		/*
		 * while(true) { if (c == check.get(i)) { answer = answer + "1"; i++;
		 * 
		 * } else { answer = answer + "0"; d--; } d++; c--; if(d==check.size()) { break;
		 * } }
		 */
		// 0==2 place 1 and subtract i by 1, i is currently size so 1
		while (true) {

			if (c == check.get(i)) {
				answer = "1" + answer;

				i--;
				


			} else {
				answer = "0" + answer;
				d--;
			}
			d++;
			c++;
			if (d == check.size()) {
				break;
			}
		}
		System.out.println(answer);
		return answer;

	}

}
