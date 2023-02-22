import java.util.Scanner;

public class N_2851 {
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int[] score = new int[10];
		for (int i = 0; i < 10; i++) {
			score[i] = input.nextInt();
		}
		
		//diff(차이값)이 작아지다 다시 커지는 시점까지 계속 더한다
		int sum = 0, diff = 1, j = 0;
		while((diff > 0) && (j < 10)) {
			sum += score[j];
			System.out.println(sum);
			diff = 100 - sum;
			
			if ((diff !=0) && (diff < 0)) {
				sum -= score[j];
			}
			j++;
		}
		if(j == 10) {	//모두 더해진 경우
			System.out.println(sum);
		}
		else {
			int checkNext = 100 - (sum + score[j]);	//다음수와 차이값
			//100에 가까운 수가 2개일 경우 큰 값 선택
			if(diff == checkNext) {
				sum += score[j];
			}
			System.out.println(sum);
		}
	}
}
