import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
class Bell
{   

    static void bell(ArrayList<ArrayList<Integer>> arr,int fin,int n,int edge)   //Bellman-ford Algorithm Implementation
    {
      int dis[]=new int[n];
      Arrays.fill(dis,Integer.MAX_VALUE);
      dis[fin]=0;
      ArrayList<Integer> temp;
      for(int i=0;i<n-1;i++)
      {      

		      for(int j=0;j<edge;j++)
		      {
			      temp=new ArrayList<>();
			      temp=arr.get(j);
			      int src=temp.get(0);
			      int des=temp.get(1);
			      int wei=temp.get(2);

			      if(dis[src]!=Integer.MAX_VALUE && wei+dis[src]<dis[des])
			      dis[des]=wei+dis[src];  
		      }
      }
    
       for(int i=1;i<dis.length;i++)
       	System.out.println(i+"  "+dis[i]);

    }




	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	
	int edge=sc.nextInt();
	ArrayList<ArrayList<Integer>> arr=new ArrayList<>();
	ArrayList<Integer> temp;
	for(int i=0;i<edge;i++)
	{
	temp=new ArrayList<>();
	temp.add(sc.nextInt());
	temp.add(sc.nextInt());
	temp.add(sc.nextInt());
	arr.add(temp);
	}
    int fin=sc.nextInt();
    bell(arr,fin,n+1,edge);
	}
}


output:
3
3
1 2 -10
1 3 2
3 2 4
1
1  0
2  -10
3  2
