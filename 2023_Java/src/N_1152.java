import java.util.Scanner;

public class N_1152 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String inputString = input.nextLine();
		
		inputString = inputString.trim();	//�� �� ��������
		String[] token = inputString.split(" ");	//���� �������� �ڸ���
		
		int result = token.length;
		if (token[0].equals("")) {
			System.out.println("0");	//�ܾ �� ���� ���� ���
		}
		else {
			System.out.println(result);
		}
	}
}
