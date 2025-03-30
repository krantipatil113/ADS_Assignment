import java.util.Arrays;
class Q2_anagram
{
	static void anagram_check(String s1,String s2)
	{
		int i,j;
		if(s1.length()!=s2.length())
		{
			System.out.println("not anagram");
		}
		else
		{
			char c1[]=s1.toCharArray();
			char c2[]=s2.toCharArray();
			int cn=0;
			System.out.println(Arrays.toString(c1));
			System.out.println(Arrays.toString(c2));
			
			for( i=0;i<c1.length;i++)
			{
				for(j=0;j<c2.length;j++)
				{
					if(c1[i]==c2[j])
					{
						cn++;
					}
				}
			}
			//System.out.println(cn);
			if(cn==s1.length())
			{
				System.out.println("anagram");
			}
			else{
				System.out.println("not anagram");
			}
			
		}
		
	}
	
	static void large_string(String s3)
	{
		String s1[]=s3.split(" ");
		String longw="";
		System.out.println(Arrays.toString(s1));
		for(int i=0;i<s1.length;i++)
		{
		  if(s1[i].length()>longw.length())
		  {
			longw=s1[i];  
		  }
		}
		System.out.println(longw);
		
		
	}
	
	static void vowel_con(String s3)
	{
		String[] s1 = s3.split(" ");
		int count1=0, count2=0;
		for(int i=0; i<s1.length; i++){
			for(int j=0; j<s1[i].length(); j++){
				if(s1[i].charAt(j)=='a' || s1[i].charAt(j)=='i' || s1[i].charAt(j)=='e' || s1[i].charAt(j)=='o' || s1[i].charAt(j)=='u'){
					count1++;
				} else {
					count2++;
				}
			}
		}
		System.out.println("vowel:"+count1+" consonant:"+count2);
	}
	
	public static void main(String args[])
	{
		String s1="listen";
		String s2="silent";
		String s3="Practice makes a man perfect";
		//anagram_check(s1,s2)
		large_string(s3);
		vowel_con(s3);
		
	}
}