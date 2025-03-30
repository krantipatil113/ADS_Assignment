import java.util.Arrays;
class Q1_SecondLarge
{
	static void second(int a[])
	{
		int i,j,max1=0,max2=0;
		for(i=0;i<a.length;i++)
		{
				if(a[i]>max1)
				{
					max1=a[i];
				}
				if(a[i]>max2 && a[i]!=max1)
				{
					max2=a[i];
				}
		
		}
		System.out.println(max2);
	}
	
	
	static void zero(int a[])
	{
		int temp=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
			if(a[i]==0)
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
			}
					
		}
		System.out.println(Arrays.toString(a));
		
	}
	public static void main(String args[])
	{
		int a[]={10,0,5,20,0,8,15};
		second(a);
		zero(a);
		
	}
	
}