
import java.util.*;
class Main {
	static int max(int arr[]){
	int max= 0;
	for(int i = 0;i<arr.length;i++){
		if (arr[i]>max){
			max= arr[i];
		}
		
	}
	return max;
	
 } 
	public static void main (String args[]){
	Scanner scn = new Scanner(System.in);
	int n = scn.nextInt();
	int[] arr= new int[n];
	for (int i = 0 ;i<n;i++){
		arr[i]=scn.nextInt();
	}
	 int res =  max(arr);
	 System.out.print(res);
 }
	
   
}
	
	
