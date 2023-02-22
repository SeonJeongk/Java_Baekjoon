import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class N_1008 {
	public static void main(String[] args) throws IOException {
		double A, B;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		A = Double.parseDouble(st.nextToken());
		B = Double.parseDouble(st.nextToken());
		
		System.out.print(A/B);
	}
}
