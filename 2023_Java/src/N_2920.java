import java.util.Scanner;

public class N_2920 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] song = new int[8];
		int ascen = 1, descen = 1;
		
		song[0] = input.nextInt();
		
		for(int i=1; i < 8; i++) {
			song[i] = input.nextInt();
			if((song[0] == 8) && (song[i] == song[i-1] - 1)) {
				descen++;
			}
			else if((song[0] == 1) && (song[i] == song[i-1] + 1)) {
				ascen++;
			}
		}
		
		if(ascen == 8) {
			System.out.println("ascending");
		}
		else if(descen == 8) {
			System.out.println("descending");
		}
		else {
			System.out.println("mixed");
		}
	}
}
