import java.util.Scanner;

public class N_2851 {
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int[] score = new int[10];
		for (int i = 0; i < 10; i++) {
			score[i] = input.nextInt();
		}
		
		//100과의 차이값의 절대값은 더할수록 줄어든다 but 커진다면 100을 넘어선 것
		//100을 넘은 버섯을 기준으로 이전값과 다음값의 합한 경우를 비교한다
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			sum += score[i];
			//100에 가까운 최대값이 나왔을 때
			if (Math.abs(sum - score[i] - 100) < sum - 100) {
				sum -= score[i];
				break;
			}
		}
		System.out.println(sum);
	}
}
