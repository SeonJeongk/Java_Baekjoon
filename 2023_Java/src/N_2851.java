import java.util.Scanner;

public class N_2851 {
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int[] score = new int[10];
		for (int i = 0; i < 10; i++) {
			score[i] = input.nextInt();
		}
		
		//diff(���̰�)�� �۾����� �ٽ� Ŀ���� �������� ��� ���Ѵ�
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
		if(j == 10) {	//��� ������ ���
			System.out.println(sum);
		}
		else {
			int checkNext = 100 - (sum + score[j]);	//�������� ���̰�
			//100�� ����� ���� 2���� ��� ū �� ����
			if(diff == checkNext) {
				sum += score[j];
			}
			System.out.println(sum);
		}
	}
}
