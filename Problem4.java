import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;


public class product {

	public static void main(String[] args) throws java.lang.Exception{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(input.readLine());
		StringTokenizer st2 = new StringTokenizer(input.readLine());
		int size = Integer.parseInt(st.nextToken());
		ArrayList<Integer> list = new ArrayList<Integer>();
		int[] big4 = new int[4];
		for(int i = 0; i < size; i++)
		{
			list.add(Integer.parseInt(st2.nextToken()));
			
		}
		int max1 = 0;
		int j;
		int l;
		int p;
		int o;
		int max2 = 0;
		int max3 = 0;
		int max4 = 0;
		for(int i = 0; i < size; i ++)
		{
			if(Math.abs(list.get(i)) > max1)
			{
				max1 = list.get(i); 
				j = i;
		
				
			}
			else if(Math.abs(list.get(i)) > max2)
			{
				max2 = list.get(i);
				l = i;
			}
			else if(Math.abs(list.get(i)) > max3)
			{
				max3 = list.get(i);
				p =i;
			}
			else if(Math.abs(list.get(i)) > max4)
			{
				max4 = list.get(i);
				o = i;
			}
			
				
		}
		list.remove(o);
		list.remove(p);
		list.remove(j);
		list.remove(l);
		
		int numofneg = 0;
		int product = 1;
		for(int i = 0; i < 4; i++ )
		{
			if(big4[i] < 0)
			{
				numofneg++;
			}
		}
		if(numofneg % 2 == 0)
		{
			for(int i = 0; i < big4.length; i++)
			{
				product = product * big4[i];
				System.out.println(product);
			}
		}
		int max5 = 0;
		else
		{
			if(max4 > 0)
			{
				for(int i = 0; i < size; i ++)
				{
					if((list.get(i)) > max5)
					{
						max5 = list.get(i); 
					}	
			}
				for(int i = 0; i < big4.length-1; i++)
				{
					product = product * big4[i]*max5;
					System.out.println(product);
				}
		}
		

}
}
