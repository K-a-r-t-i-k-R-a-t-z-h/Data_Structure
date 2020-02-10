import java.util.*;
class Graph
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Hi welcome!!!!");
		LinkedList<HashMap<Integer,Integer>> arg[];
		HashMap<Integer,Integer> hh;
		//int arr[][]=new int[vert][vert-1];
		Boolean var=true;
		System.out.println("Enter the Number of vertices node---");
	    int vert=sc.nextInt();
	    arg=new LinkedList[vert];

	        for(int i=0;i<vert;i++)
		    {
			arg[i]=new LinkedList();
		    }
		while(true)
		{
	    System.out.println("Select an options--");
	    System.out.println("1.Data entry\n2.search details");
	    int chc=sc.nextInt();

	    switch(chc)
	    {
	    	case 1:
	    	{
	    		
	   
		while(var)
		{
			System.out.println("Enter source----");
			int src=sc.nextInt();
			System.out.println("Enter destination----");
			int des=sc.nextInt();
			System.out.println("Distance between----");
			int dis=sc.nextInt();
			hh=new HashMap<>();
			hh.put(des,dis);
			arg[src].add(hh);
			hh=new HashMap<>();
			hh.put(src,dis);
			arg[des].add(hh);

	        System.out.println("Do you want to continue----");
			String h=sc.next();
			h=h.toLowerCase();
			if(h.equals("no"))
				var=false;

		
		}
		break;
	   }
	    	case 2:

	    	{
	    	var=true;
		while(var)
		{
			System.out.println("Enter source----");
			int src=sc.nextInt();
			System.out.println("Enter destination----");
			int des=sc.nextInt();
			Boolean chk=false;
			HashMap<Integer,Integer> tem;
			for(int i=0;i<arg[src].size();i++)
			{
			 tem=new HashMap<Integer,Integer>();
	         tem=arg[src].get(i);
	         if(tem.containsKey(des)){
	        	System.out.println(tem.get(des));
	        	chk=true;
	        	break;
	        
	        }}
	        if(chk==false)
	        	System.out.println("There is no way to Travel!;");
	         System.out.println("May you want any other information----");
			String h=sc.next();
			h=h.toLowerCase();
			if(h.equals("no"))
				var=false;
			}
			break;	
	    	}
	}    }
}
}
