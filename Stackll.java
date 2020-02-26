class Stackll{
	class node{
		int data;
		node next;
		node(int key){
		data=key;
		next=null;
		}
	}
	node root;
	Stackll(){
	root=null;
	}
	void push(int x){
		if(root==null){
			root=new node(x);
			System.out.println(x+"element is pushed");
		}
		else{
			node nnn= new node(x);
			node temp=root;
			root=nnn;
			nnn.next=temp;
			System.out.println(x+"element is entered");
		}
	}
	void pop(){
		int a = root.data;
		if (root ==null){
			System.out.println("stack iis empty");
		}
		root=root.next;
		System.out.println(a+"poped");
	}
	public static void main(String args[]){
		Stackll s= new Stackll();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		s.push(6);
		s.pop();
	}
}
