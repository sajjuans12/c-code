import java.io.*;
public class chr {
	public static void main(String[] args) throws IOException {
		System.out.println("Enter a String");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		System.out.println("enter the character you want to replace");
		char r = br.readLine().charAt(0);
		System.out.println("enter the new character");
		char n = br.readLine().charAt(0);
		String x = s.replace(r, n);
		System.out.println(x);

	}
}
