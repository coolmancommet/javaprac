class BSTPR{
	class Node {
		int key;
		Node left, right ;
		public Node(int it){
			key=it;
			left=right=null;
		}
	}
	Node root;
	public BSTPR(){
		root=null;
	}
	public void insert(int kk){
		root=insertrec(root,kk);
	}
	public Node insertrec(Node root,int ki){
		if (root==null){
			root=new Node(ki);
			return root;
		}
		if (root.key<ki){
			root.right =insertrec(root.right,ki);
		}
		else if (root.key>ki){
			root.left=insertrec(root.left,ki);
		}
		return root;
	}
	public void inorder(){
		inorderrec(root);
	}
	public Node inorderrec(Node rr){
		if(rr==null){
			return ;
		}
		inorderrec(rr.left);
		System.put.println(rr.key + " ");
		inorderrec(rr.right);
	}
	public void postorder(){
		postorderrec(root);
	}
	public void postorderrec(Node rr){
		if (rr==null){
			return;
		}
		postorderrec(rr.left);
		postorderrec(rr.right);
		System.out.println(rr.key + " ");
	}
	public void preorder(){
		preorderrec(root);
	}
	public void preorderrec(Node rr){
		if (rr==null){
			return;
		}
		System.out.println(rr.key + " ");
		preorderrec(rr.left);
		preorderrec(rr.right);
	}
	public void delete(int ky){
		root=deleterec(root,ky);
	}
	public void deleterec(Node rr,int ki){
		if(rr==null){
			return  root;
		}
		if(rr.key<ki){
			rr.right=deleterec(rr.right,ki);
		}
		else if(rr.key>ki){
			rr.left=deleterec(rr.left,ki);
		}
		else{
			if (rr.left==null){
				return rr.right;
			}
			else if (rr.right==null){
				return rr.left;
			}
			rr.key =minvalue(rr.right);
			rr.right=deleterec(rr.right,rr.key);
		}
		return rr;
	}
	public int minvlaue(Node root){
		int minv=root.key;
		while (root.left != null){
			minv=root.left.key;
			root =root.left;
		}
		return minv;
	}
	public static void main(String args[]){
		BSTPR tree=new BSTPR();
		
	}
}
