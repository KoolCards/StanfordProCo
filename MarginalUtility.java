import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.Collections;

public class MarginalUtility {
	public static void main (String[]args) throws java.lang.Exception	{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer line1 = new StringTokenizer(input.readLine());
		StringTokenizer line2 = new StringTokenizer(input.readLine());
		
		int numberOfCookiesA = Integer.parseInt(line1.nextToken()); //A = Unkar Plutt's Junkyard
		int priceOfA = Integer.parseInt(line1.nextToken());
		ArrayList<Double> MarginalUtilityA = new ArrayList<Double>();
		
		for (int counter = 0; counter < numberOfCookiesA; counter++)	{
			MarginalUtilityA.add(Double.parseDouble(line2.nextToken())/priceOfA);
		}
		
		StringTokenizer line3 = new StringTokenizer(input.readLine());
		StringTokenizer line4 = new StringTokenizer(input.readLine());
		
		int numberOfCookiesB = Integer.parseInt(line3.nextToken());
		int priceOfB = Integer.parseInt(line3.nextToken());
		ArrayList<Double> MarginalUtilityB = new ArrayList<Double>();
		
		for (int counter = 0; counter < numberOfCookiesB; counter++)	{
			MarginalUtilityB.add(Double.parseDouble(line4.nextToken())/priceOfB);
		}
		
		StringTokenizer line5 = new StringTokenizer(input.readLine());
		int budget = Integer.parseInt(line5.nextToken());
		
		for (int counter = 0; counter < numberOfCookiesA; counter++)	{
			System.out.println(MarginalUtilityA.get(counter));
		}
		
		Collections.sort(MarginalUtilityA);
		
		for (int counter = 0; counter < numberOfCookiesA; counter++)	{
			System.out.println(MarginalUtilityA.get(counter));
		}
		
	}
}
