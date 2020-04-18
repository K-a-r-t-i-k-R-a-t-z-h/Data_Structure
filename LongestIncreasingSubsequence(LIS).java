import java.util.Scanner;
import java.util.Arrays;
class Lis
{   
static int tail[];
    static void long1(int arr[],int n)
    {
     if(n==0)
     return;
     else
     {
     long1(arr,n-1);

		     for(int i=0;i<n;i++)
		     {
	              if(arr[i]<arr[n])
	              {
	                if(tail[i]+1>tail[n])
	                tail[n]=tail[i]+1;
	              }
		     }
       
     }
    } 
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	tail=new int[n];
	Arrays.fill(tail,1);
	int arr[]=new int[n];
	for(int i=0;i<n;i++)
	arr[i]=sc.nextInt();
	long1(arr,n-1);
	int max=Integer.MIN_VALUE;
		for(int i=0;i<n;i++)
		{
          if(max<tail[i])
          	max=tail[i];
		}
		System.out.println(max);
	}
}
