class Q4_palindrome
{
	static boolean checkpalindrome(String s,int low, int high)
	{
		if(low>=high){
			return true;
		} else {
			if(s.charAt(low)!=s.charAt(high))
				return false;
			return checkPalindrome(s,low+1,high-1);	
		}
	}
	static int sum_digit(int n)
	{
		if(n==0)
		{
			return 0;
		}else{
			return (n%10)+sum_digit(n/10);
		}
	}
	
	static int febbonacci(int num)
	{
		if(num<=1)
		{
			return 1;
		}
		return (febbonaci(num-1)+febbonacci(num-2));
		
	}

	public static void main(String aregs[])
	{
		int x=7;
		String s="racecar";
		System.out.println("String palindrome:"+checkpalindrome(s,0,s.length()-1));
		
		int n=1234;
		System.out.println("sum of digit:"+sum_digit(n));
		
	     int num=6;
		 for(int i=0;i<num;i++)
		 {
		System.out.println( febbonacci(num));
		 }
	}

}