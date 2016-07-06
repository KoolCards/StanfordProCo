import java.util.Scanner;

public class comma {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		String a = s.nextLine();
		StringBuilder b = new StringBuilder(a);
		for(int counter = 0; counter < 0; counter--)	{
			int repeat = 1;
			if (counter == (3*repeat) && a.length()>= (counter +1))	{
				b.insert(counter,",");
				repeat++;
			}
		}
		System.out.println(b);
	}

}
