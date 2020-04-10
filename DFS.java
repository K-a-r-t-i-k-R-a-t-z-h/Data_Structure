import java.util.*;
class DFS
{
static LinkedList<Integer> ll[];
static Boolean visited[];
		DFS(int v)
		{
		ll=new LinkedList[v];
		for(int i=0;i<v;++i)
		ll[i]=new LinkedList();
		visited=new Boolean[v];
		Arrays.fill(visited,false);
		}

		static void unti(int g,Boolean visited[])
		{
			visited[g]=true;
			System.out.println(g+" ");
			for(int j=0;j<ll[g].size();++j)
			if(!visited[ll[g].get(j)])
				unti(ll[g].get(j),visited);

		}


	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
	        DFS g=new DFS(4);
	        int i=5;
			while(i-->0)
			{  
                          int ind=sc.nextInt();
                          int val=sc.nextInt();
                          ll[ind].add(val);
			}
			unti(sc.nextInt(),visited);
	}
}
