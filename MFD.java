import java.util.Scanner;
import java.util.Arrays;
class MFD
{
public static void main(String[] args){
	Scanner sc = new Scanner (System.in);
	int n=sc.nextInt();
	int[] arr = new int[n];
	for(int x=0;x<n;x++){
		arr[x]=sc.nextInt();
	}
	int i =0;
	int key=arr[i];
	int q=0;
	int count=0;
	int cc=count;
	Arrays.sort(arr);
	while (i!=n){
		if(key==arr[i]){
			count++;
			i++;
		}
		else if (key!=arr[i]){
			if (count>=cc){
				q=key;
				cc=count;
			}
			key=arr[i];
			count=1;
			i++;
		}
        }System.out.println(q);
}}

