import java.io.*;
import java.lang.*;
import java.util.*;

class ProblemA {

	public static void main(String[] args) throws java.lang.Exception{
		
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(input.readLine());
		
		int p = Integer.parseInt(st.nextToken());
		int q = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		int counter = 1; 
		if (q > p)	{
			n = n + p;
			for(counter = 1; ((counter*q)+m)<=n;counter++)	{
			}
		}
		
		else if (p > q)	{
		n = n + q;
			for(counter = 1; ((counter*p)+m)<=n;counter++)	{
			}
		}
		
		System.out.println(counter);
		
	}

}
