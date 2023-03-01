import java.io.BufferedReader;
import java.io.InputStreamReader;

public class N_2751 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		int num = Integer.parseInt(br.readLine());	//the number of number
		int[] ascend = new int[num];
		
		for(int i = 0; i < num; i++) {
			ascend[i] = Integer.parseInt(br.readLine()); //get integer number
			for(int j = 0; j < i; j++) {
				if(ascend[j] > ascend[i]) {
					int temp = ascend[j];
					ascend[j] = ascend[i];
					ascend[i] = temp;
				}
			}
		}
		for(int i = 0; i < num; i++) {
			System.out.println(ascend[i]);
		}
	}
}