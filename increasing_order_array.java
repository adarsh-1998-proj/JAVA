import java.util.*;
class Main {
	
	static boolean is_increasing(int[] a){
		for (int i = 0 ; i <(a.length-1);i++){
			if (a[i]>a[i+1]){
				return false;
			}
			
		}
		return true;
	}
	public static void main (String argsp[]){
		Scanner scn =  new Scanner (System.in);
		
		int n =  scn.nextInt();
		int arr[] = new int[n];
		for (int i = 1 ;i<n ;i++){
			arr[i]= scn.nextInt();
		}
		
		System.out.print(is_increasing(arr));
	}
}
