import java.util.Scanner;
class Quicksort
{  
	static int swap(int arr[],int st,int end)
	{
		int i=st-1;
		int pi=arr[end];
		for(int j=st;j<end;j++)
		{
			if(arr[j]<pi)
			{

				++i;
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		int temp=arr[i+1];
		arr[i+1]=arr[end];
		arr[end]=temp;
		return i+1;
	}
	static void sort(int arr[],int st,int end)
	{
		if(st<end){
		int pi=swap(arr,st,end);
		sort(arr,st,pi-1);
		sort(arr,pi+1,end);
	    }
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;++i)
			arr[i]=sc.nextInt();
		sort(arr,0,arr.length-1);
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+" ");
	}
}
