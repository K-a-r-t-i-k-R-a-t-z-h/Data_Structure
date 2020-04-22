//Finding shortest path from source to all node....using Dijkstra's algorithm
import java.util.*;
class Short
{
static int graph[][];
static int n;
    
    static int min(int dis[],Boolean visited[])       //Finding Minimum value Index
    {

    int min=Integer.MAX_VALUE;
    int min_index=-1;
    for(int i=0;i<n+1;i++)
	    if(dis[i]<min&&visited[i]==false)
	    {
	      min=dis[i];
	      min_index=i;
	    }

	    return min_index;
    }

    static void diji(int m,int src)           //applying Dijkstra's Algorithm
    { 
    int dis[]=new int[m];
    Boolean visited[]=new Boolean[m];
    Arrays.fill(dis,Integer.MAX_VALUE);
    Arrays.fill(visited,false);
    dis[src]=0;


		    for(int i=0;i<m-1;i++)
		    {
		      int u=min(dis,visited);
		      visited[u]=true;

		      for(int v=0;v<m;++v)
		      if(!visited[v]&&graph[u][v]!=0&&dis[u]!=Integer.MAX_VALUE&&dis[u]+graph[u][v]<dis[v])
		      dis[v]=dis[u]+graph[u][v];


		    }

		    for(int i=0;i<m;i++)
		    	System.out.println(i+" "+dis[i]);
    }
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	graph=new int[n+1][n+1];
	for(int i=0;i<n+1;i++)
	Arrays.fill(graph[i],0);

	int inp=sc.nextInt();
	for(int i=0;i<inp;i++)
	{
	int src=sc.nextInt();
	int des=sc.nextInt();
	int dis=sc.nextInt();
	graph[src][des]=dis;
	}
	int src=sc.nextInt();
	diji(n+1,src);
	}
}


output:
3
3
1 2 10
1 3 2
3 2 2
1
0 2147483647
1 0
2 4
3 2
