import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ride {

	public static void main(String[] args) throws java.lang.Exception {
		// TODO Auto-generated method stub
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer line1 = new StringTokenizer(input.readLine());
		StringTokenizer line2 = new StringTokenizer(input.readLine());
		
		int[] Conversion = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26};
		
		String comet = line1.nextToken();
		String group =	line2.nextToken();
		
		int length = comet.length();
		
		for (int i = 0; i < length; i++)	{
			for (int j = 0; j < Conversion.length; j++)	{
				
			}
		}

	}

}
