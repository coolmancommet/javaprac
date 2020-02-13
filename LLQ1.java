class LLQ1{
	class Node{
		int data;
		Node next;
		public Node(int d){
			data=d;
		}
	}
	Node head;
	public LLQ1(){head=null;
	}
	public void insert(int da){
		head = insertrec(head,da);
	}
	public Node insertrec (Node head, int dd){
		if (head==null){
			head= new Node(dd);
			return head;
		}
		else {
			head.next=insertrec(head.next,dd);
			return head;
		}
	}
	public void countint(int it){
		int count=0;
		Node n=head;
		while(n!=null){
			if (n.data==it){count+=1;}
			n=n.next;
		}
		System.out.println(count+">>><<<");
	}
	public void printll(){
		Node nn=head;
		while(nn!=null){
			System.out.println(nn.data+"->");
			nn=nn.next;
		}
	}
	public static void main(String args[]){
		LLQ1 list =new LLQ1();
		list.insert(1);
		list.insert(2);
		list.insert(1);
		list.insert(2);
		list.insert(1);
		list.insert(3);
		list.insert(1);
		list.printll();
		list.countint(1);
	}
}
