import java.util.Scanner;

public class ProCode {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		String s_final = s.nextLine();
		for(int counter = 0; counter < s_final.length(); counter++)	{
			if (counter == 0)	{
				
			char edit = s_final.charAt(0);
			edit = Character.toUpperCase(edit);
			s_final = s_final.replace(s_final.charAt(0), edit);
		
			}
			
			else if (s_final.charAt(counter) == ' ')	{
				char edit2 = s_final.charAt(++counter);
				edit2 = Character.toUpperCase(edit2);
				s_final = s_final.replace(s_final.charAt(counter), edit2);
				counter = counter - 1;
			}
		}
		System.out.println(s_final);
	}

}