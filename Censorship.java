import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Censorship {

	public static void main(String[] args) throws java.lang.Exception{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer line1 = new StringTokenizer(input.readLine());
		StringTokenizer line2 = new StringTokenizer(input.readLine());
		
		String inputWords = line1.nextToken();
		String censor =	line2.nextToken();
		
		String output = inputWords;
		
		for (int i = 0; i < censor.length(); i++)	{
			char temp = censor.charAt(i);
			
			
			String temp1 = Character.toString(temp);
			output = output.replaceAll(temp1, "");
			

		}
		
		System.out.println(output);
	}

}
