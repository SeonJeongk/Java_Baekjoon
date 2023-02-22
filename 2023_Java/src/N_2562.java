import java.util.Scanner;

public class N_2562 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int max = 0, num = 0, temp;
		int[] arr = new int[9];

		for(int i = 0; i < 9; i++) {
			temp = input.nextInt();
			arr[i] = temp;
			
			if(arr[i] > max) {
				max = arr[i];
				num = i + 1; //최대값 몇번째 수인가
			}
		}
		
		System.out.println(max);
		System.out.println(num);
	}
}
