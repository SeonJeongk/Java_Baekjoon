import java.util.Scanner;

public class N_2204 {
	
	private static String findWord(int num, String[] words) {
		String firstWord = words[0];
		
		return firstWord;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int wordNum = input.nextInt();	//���̽� �� �ܾ� ����
		int caseNum = 0;	//�׽�Ʈ ���̽� ����
		String[] word = new String[1000];	//�׽�Ʈ ���̽� �ܾ��
		String[] result = new String[1000];	//���̽��� ���� �ռ��� �ܾ��
		
		while(wordNum != 0) {
			input.nextLine();	//buffer ����
			
			for(int i=0; i < wordNum; i++) {
				word[i] = input.nextLine();
				//System.out.println("-> "+ word[i]);
			}
			result[caseNum] = findWord(wordNum, word);	//ù��° �ܾ� ã������ method ȣ��
			wordNum = input.nextInt();
			caseNum++;
		}
		//��� ���
		for(int i = 0; i < caseNum; i++) {
			System.out.println(result[i]);
		}
	}
}
