import java.util.Scanner;
class Merge_sort
{   
   static int arr[];


   static void merge(int b,int mid,int e)  //Making 2 temporary array for sorting as a single array
   {
    
     int n1=mid-b+1;
     int n2=e-mid;
    int l[]=new int[n1];
    int r[]=new int[n2];

    for(int i=0;i<n1;i++)
    l[i]=arr[i+b];

    for(int i=0;i<n2;i++)
    r[i]=arr[i+mid+1];

    int i=0,j=0,k=b;
	    while(i<n1&&j<n2)
	    {
	       if(l[i]<=r[j])
	       arr[k++]=l[i++];
	       else
	       arr[k++]=r[j++];
	       
	    }
	while(i<n1)
	arr[k++]=l[i++];

	while(j<n2)
	arr[k++]=r[j++];

  

   }
    
    static void divide(int b,int e)    //recursive function to divide and conquer
    {
       if(b<e)
       {
       int mid=(b+e)/2;
       divide(b,mid);
       divide(mid+1,e);

       merge(b,mid,e);
    }

    }
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	arr=new int[n];
    for(int i=0;i<n;i++)
     arr[i]=sc.nextInt();

    divide(0,n-1);

    for(int i=0;i<n;i++)
    	System.out.print(arr[i]+" ");
    	}
}