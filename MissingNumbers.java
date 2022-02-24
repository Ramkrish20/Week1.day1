package week1.day1.Assignments;

public class MissingNumbers {

	public static void main(String[] args)
	{
		int []arr= {1,2,3,4,5,7,8,9};
		
		for(int i=1;i<=arr.length-1;++i)
		{
			if((arr[i]-arr[i-1]!=1))
			{
				int missing =arr[i-1]+1;
				System.out.println("missing number="+missing);
			}
		}
		}

	

			
		
	



	}


