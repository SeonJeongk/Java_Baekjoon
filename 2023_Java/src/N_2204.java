import java.util.Scanner;

public class N_2204 {
	
	private static String findWord(int num, String[] words) {
		String firstWord = words[0];
		
		return firstWord;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int wordNum = input.nextInt();	//케이스 당 단어 개수
		int caseNum = 0;	//테스트 케이스 개수
		String[] word = new String[1000];	//테스트 케이스 단어들
		String[] result = new String[1000];	//케이스당 가장 앞서는 단어들
		
		while(wordNum != 0) {
			input.nextLine();	//buffer 비우기
			
			for(int i=0; i < wordNum; i++) {
				word[i] = input.nextLine();
				//System.out.println("-> "+ word[i]);
			}
			result[caseNum] = findWord(wordNum, word);	//첫번째 단어 찾기위한 method 호출
			wordNum = input.nextInt();
			caseNum++;
		}
		//결과 출력
		for(int i = 0; i < caseNum; i++) {
			System.out.println(result[i]);
		}
	}
}
