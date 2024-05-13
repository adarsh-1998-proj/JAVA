
import java.util.*;
class Main {
	//function to search k in an array
	
	
    static boolean search(int arr[] ,int k){
		for (int i = 0 ;i<arr.length;i++){
			if (arr[i]==k){
				return true;
			}
		}
		return false;
	}
	public static void main(String args[]){
		Scanner scn= new Scanner (System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for(int i = 0 ;i<n;i++	){
			arr[i]=scn.nextInt();
		}
		boolean ans= search(arr,2);
		if (ans){
			System.out.print("K is present in the search function");
		}
		else{
			System.out.print("K is not present in the search function");
		}
	}
   
}
	
	
