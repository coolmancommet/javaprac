class Stack{
	static final int MAX = 1000;
	int top;
	int a[]=new int[MAX];
	
	boolean isEmpty(){
		return (top<0);
	}
	Stack(){
		top=-1;
	}
	
	boolean push(int x){
		if(top>=(MAX-1)){
			System.out.println("stack overflow");
			return false;
		}
		else {
			a[++top]=x;
			System.out.println(x+"element is pushed");
			return true;
		}
	}
	int pop(){
		if (isEmpty()){
			System.out.println("stack is empty");
			return 0;
		}

		else{
			int t = a[top--];
			return t;
		}
	}
	public static void main(String args[]){
		Stack s= new Stack();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		s.push(6);
		s.push(7);
		s.push(8);
		s.push(9);
		s.push(10);
		System.out.println(s.pop()+"item is poped");
	}
}
