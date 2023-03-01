import java.util.Scanner;

public class N_1152 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String inputString = input.nextLine();
		
		inputString = inputString.trim();	//앞 뒤 공백제거
		String[] token = inputString.split(" ");	//공백 기준으로 자른다
		
		int result = token.length;
		if (token[0].equals("")) {
			System.out.println("0");	//단어가 한 개도 없을 경우
		}
		else {
			System.out.println(result);
		}
	}
}
