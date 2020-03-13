class Heap{
	//min heap 
	int heap_size,capacity,harr[];
	Heap(int capa){
		heap_size=0;
		capacity =capa;
		harr=new int[capa];
	}
	int parent(int i){
		return ((i-1)/2);
	}
	void decrease(int i,int nval){
		harr[i]=nval;
		while(i!=0 && harr[parent(i)]>harr[i]){
			int temp=harr[parent(i)];
			harr[parent(i)]=harr[i];
			harr[i]=temp;
			i=parent(i);
		}
	}
	void minheapify(int i){
		int l=(2*i)+1;
		int r=(2*i)+2;
		int smallest=i;
		if (l<heap_size && harr[l]<harr[smallest]){
			smallest=l;
		}
		if (r<heap_size && harr[r]<harr[smallest]){
			smallest=r;
		}
		if (smallest!=i){
			int temp=harr[i];
			harr[i]=harr[smallest];
			harr[smallest]=temp;
			minheapify(smallest);
		}
	}
	int getmin(){return harr[0];}
	void pp(){
	for(int i=0 ;i<heap_size;i++){System.out.println(harr[i]);}
	}
	int extractmin(){
		if (heap_size<=0){return -1;}
		if (heap_size==1){heap_size--;return harr[heap_size];}
		int root =harr[0];
		harr[0]=harr[heap_size-1];
		heap_size--;
		minheapify(0);
		return root;
	}
	void insert_key(int k){
		if (heap_size==capacity){
			System.out.println("heap over flow");
			return;
		}
		heap_size++;
		int i =heap_size-1;
		harr[i]=k;
		while(i!=0 && harr[parent(i)]>harr[i]){
			int temp =0;
			temp=harr[parent(i)];
			harr[parent(i)]=harr[i];
			harr[i]=temp;
			i=parent(i);
		}
	}
	public static void main(String args[]){
		Heap HH=new Heap(6);
		HH.insert_key(8);
		HH.insert_key(9);
		HH.insert_key(6);
		HH.insert_key(5);
		HH.insert_key(3);
		HH.insert_key(1);
		HH.pp();
		System.out.println("->"+HH.getmin());
		System.out.println("--->"+HH.extractmin());
		HH.pp();
	}
}
