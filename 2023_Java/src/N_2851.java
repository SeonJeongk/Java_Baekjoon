import java.util.Scanner;

public class N_2851 {
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int[] score = new int[10];
		for (int i = 0; i < 10; i++) {
			score[i] = input.nextInt();
		}
		
		//100���� ���̰��� ���밪�� ���Ҽ��� �پ��� but Ŀ���ٸ� 100�� �Ѿ ��
		//100�� ���� ������ �������� �������� �������� ���� ��츦 ���Ѵ�
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			sum += score[i];
			//100�� ����� �ִ밪�� ������ ��
			if (Math.abs(sum - score[i] - 100) < sum - 100) {
				sum -= score[i];
				break;
			}
		}
		System.out.println(sum);
	}
}
