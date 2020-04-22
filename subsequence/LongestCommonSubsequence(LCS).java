import java.util.Scanner;
class Lcs
{
static char arr[];
static char arr1[];
    static int lcs(int n,int m)
    {

    if(n==0||m==0)
    return 0;
    else if(arr[n-1]==arr1[m-1])
    return 1+lcs(n-1,m-1);
    else
    return max(lcs(n,m-1),lcs(n-1,m));
    } 
    static int max(int a, int b) 
     { 
    return (a > b)? a : b; 
     } 
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	String inp=sc.next();
	String inp1=sc.next();
	arr=inp.toCharArray();
    arr1=inp1.toCharArray();
    int val=lcs(arr.length,arr1.length);
    System.out.println(val);
	}
}


//https://www.geeksforgeeks.org/wp-content/uploads/Longest-Common-Subsequence.png

/* output

AGGTAB
GXTXAYB
4 */
