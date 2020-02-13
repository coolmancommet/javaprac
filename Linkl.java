class Linkl{
	class Node {
		int data;
		Node next;
		public Node(int d){
			data=d;
			next=null;
		}
	}
	Node head;
	public void Linkl(){
		head=null;
	}
	public void insert(int d){
		head=insertrec(head,d);
	}
	public Node insertrec(Node head, int da){
		if (head==null){
			head = new Node(da);
			return head;
		}
		else{
			head.next = insertrec(head.next,da);
		}
		return head;
	}
	public void printll(){
		Node n = head;
		while(n!=null){
			System.out.println(n.data+" -> ");
			n=n.next;
		}
	}
	public static void main(String args[]){
		Linkl list =new Linkl();
		list.insert(1);
		list.insert(2);
		list.insert(3);
		list.insert(4);
		list.printll();
	}
}
