class Heapsort{
	int heap_size;
	int capacity;
	int[] harr;
	Heapsort(int cap){
	heap_size=0;
	capacity=cap;
	harr=new int[cap];
	}
	int parent(int i){return (i-1)/2;}
	int left(int i){return (2*i)+1;}
	int right(int i){return (2*i)+2;}
	int get_min(){return harr[0];}
	void insert(int i){
		if (heap_size==capacity){
		 System.out.println("overflow");
		 return;
		}
		heap_size++;
		int x =heap_size-1;
		harr[x]=i;
		while(i!=0 && harr[x]<harr[parent(x)]){
			int temp=harr[parent(x)];
			harr[parent(x)]=harr[x];
			harr[x]=temp;
			x=parent(x);
		}
	}
	int extract(){
		if (heap_size<=0){
			return -1;
		}
		if (heap_size==1){
			heap_size--;
			return harr[0];
		}
		int root =harr[0];
		harr[0]=harr[heap_size-1];
		heap_size--;
		minheapify(0);
		return root;
	}
	void minheapify(int i){
		int l=left(i);
		int r=right(i);
		int smallest=i;
		if (l<heap_size && harr[l]<harr[smallest]){smallest=l;}
		if (r<heap_size && harr[r]<harr[smallest]){smallest=r;}
		if (smallest!=i){
			int temp=harr[i];
			harr[i]=harr[smallest];
			harr[smallest]=temp;
			minheapify(smallest);
		}
	}
	void sort(int at[]){
		for(int t=0;t<at.length;t++){
			insert(at[t]);
		}
		for(int n=0;n<at.length;n++){
			System.out.println(extract());
		}
	}
	public static void main(String args[]){
		Heapsort hh=new Heapsort(6);
		int argg[]=new int[]{10,9,8,7,6,5};
		hh.sort(argg);
	}
}
