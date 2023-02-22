import java.util.Scanner;

public class N_8958 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt(); //the number of case
		int[] score = new int[num];	//scores of each cases
		int leng, count = 1;
		String result;
		result = input.nextLine();
		
		for(int i = 0; i < num; i++) {
			count = 1;
			result = input.nextLine();	//case
			leng = result.length();	//the length of case
			for(int j = 0; j < leng; j++) {
				if(result.substring(j,j+1).equals("O")) {
					score[i] += count;
					count++;
				}
				else {
					count = 1;
				}
			}
		}
		for(int i = 0; i < num; i++) {
			System.out.println(score[i]);
		}
	}
}

