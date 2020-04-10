import java.util.*;
class BFS
{
static LinkedList<Integer> ll[];
int V;
			static Boolean visited[];
			BFS(int v)
			{
			    V=v;
				ll=new LinkedList[v];
				for(int i=0;i<v;++i)
				ll[i]=new LinkedList();
			visited=new Boolean[v];
			Arrays.fill(visited,false);
			}

		static void unti(int g,Boolean visited[])
		{
			
                 Queue<Integer> qu=new LinkedList<Integer>();
                 qu.add(g);
                 System.out.print(g+" ");
                 visited[g]=true;
		   while(!(qu.isEmpty()))
		   {
			int n=qu.poll();
			for(int i=0;i<ll[n].size();i++)
			{  
				if(!(visited[ll[n].get(i)])){
				qu.add(ll[n].get(i));
				System.out.print(ll[n].get(i)+" ");
				visited[ll[n].get(i)]=true;
							}
			}
		   }
		}


	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
	BFS g=new BFS(5);
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
