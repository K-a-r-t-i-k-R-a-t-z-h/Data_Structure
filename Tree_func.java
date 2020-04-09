import java.util.Scanner;
class Tree_func
{ 
	static int count=0;
	static int k;
	class Node                                      
	{
			Node left,right;
			int val;
			Node(int val)
			{
			this.val=val;
			left=right=null;

			}
	}
   Node root;

	Node inserval(Node current,int val)         //construction of tree
	{
			if(current==null)
			return new Node(val);
			else
			{
			if(val<current.val)
			current.left=inserval(current.left,val);
			else if(val>current.val)
			current.right=inserval(current.right,val);
			}

			return current;
	}

	void insert(int val){
	root=inserval(root,val);
     }


	static int findsum(Node current){             //sum of the tree
	            if(current==null)
	            	return 0;
	            int lf=findsum(current.left);
	            int rh=findsum(current.right);
	            return current.val+lf+rh;

	}
	static int findlar(Node current)             //largest number of the tree
	{
		if(current.right==null)
			return current.val;
		int lar=findlar(current.right);
		return lar;

	}
	static int findsmall(Node current)           //smallest number of the tree
	{
		if(current.left==null)
			return current.val;
		int sm= findsmall(current.left);

		return sm;
	}
	static void find_k_ele(Node current,int k)   //find kth element of the tree
	{
		if(current==null)
			return;

		find_k_ele(current.left,k);
		count++;
		if(count==k)
			System.out.println(current.val);
		find_k_ele(current.right,k);

	} 

	static int depth(Node current)               //maximum depth of the tree
	{    if(current==null)
		     return 0;
		int ldepth=depth(current.left);

		int rdepth=depth(current.right);

		if(ldepth>rdepth)
			return ldepth+1;
		else
			return rdepth+1;
	}


	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
	try{
				Tree_func r=new Tree_func();
				r.insert(6);
			    r.insert(5);
			    r.insert(3);
			    r.insert(4);
			    System.out.println(findsum(r.root));
			    System.out.println(findsmall(r.root));
			    System.out.println(findlar(r.root));
			    int k=sc.nextInt();
			    //System.out.println(k);
			    find_k_ele(r.root,k);
			    System.out.println(depth(r.root));
        }
    catch(Exception e)
    {
    	System.out.println(e);
    }

}
}