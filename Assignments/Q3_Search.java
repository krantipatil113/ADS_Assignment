class Q3_Search
{
	public static int BinarySearch(int[] arr, int x){
		int low = 0, high = arr.length-1;
		while(low<=high){
			int mid = low + (high - low)/2;
			if(arr[mid]==x)
				return mid;
			else if(arr[mid]<x)
				high = mid-1;
			else
				low = mid + 1;
		}
		return -1;	
	}
	
	static void findOccurance(int a[],int key)
	{
		int frst=-1,lst=-1,i;
		for(i=0;i<a.length;i++)
		{
			if(a[i]==key)
			{
				if(frst==-1)
				{
					frst=i;
				}
				lst=i;
			}
			
		}
		System.out.println("first occurance:"+frst+":last occurance:"+lst);
		
	}
	static void countAppears(int a[],int key)
	{
		int cn=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==key)
			{
				cn++;
			}
		}
		System.out.println("key:"+cn);
		
	}
	
	static void peakElement(int a[])
	{
		
		int i,j;
		int peak=a[0];
		for(i=0;i<a.length;i++)
		{
			
			if(a[i]>peak)
			{
				peak=a[i];
			}
		}
		System.out.println(peak);
	}

	public static void main(String args[])
	{
		int arr[] = {1,3,3,3,5,6,8};
		int ans = BinarySearch(arr, 3);
		if(ans!=-1)
		{
		System.out.println("element found:");
		}else{
		System.out.println("Element not found:");
		}
		
		findOccurance(arr,3);
		countAppears(arr,3);
		
		int peak[]={1,2,18,4,5,0};
		peakElement(peak);
	}

}