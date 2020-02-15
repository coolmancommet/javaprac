class Dll{
    class node{
        int data;
        node next,prev;
        public node(int da){
            data=da;
            next=prev=null;
        }
    }
    node head;
    public Dll(){
        head=null;
    }
    public void insert(int key){
        if (head==null){
            head = new  node(key);
        }
        else{
            node n=head;
            while (n.next!=null){
                n=n.next;
            }
            n.next=new node(key);
            n.next.prev=n;
        }
    }
    public void print(){
        node nn=head;
        while(nn!=null){
            System.out.println(nn.data);
            System.out.println(nn.prev);
            nn=nn.next;
        }
    }
    public static void main(String args[]){
        Dll list=new Dll();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.print();
    }
    
}
