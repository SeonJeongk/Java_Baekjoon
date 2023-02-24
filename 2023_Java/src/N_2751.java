import java.util.Scanner;

public class N_2751 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();	//the number of number
		int[] ascend = new int[num];
		
		for(int i = 0; i < num; i++) {
			ascend[i] = input.nextInt(); //get integer number
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
