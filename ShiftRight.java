//Q shifting all the elemts to right ?

import java.util.*;
class Main {
	
	// static void shiftright(int[] a){
	// 	int lastel=a[a.length-1];
	// 	for (int i=0;i<a.length-1;i++){
	// 		a[i+1]=a[i];
	// 	}
	// 	a[0]=lastel;
	// }
	static void shiftright(int[] a){
		int lastel = a[a.length-1];
    for (int i= a.length-1;i>0;i--){
		a[i]= a[i-1];
		
	}
	a[0]=lastel;
		
}
	
	
	
	
	public static void main(String args[]){
	   Scanner scn= new Scanner (System.in);
	   int n = scn.nextInt();
	   int[] arr= new int[n];
	   for (int i=0;i<n;i++){
		   arr[i]= scn.nextInt();
	   }
	   shiftright(arr);
	   for (int i = 0;i<n;i++ ){
		   System.out.print(arr[i] + " ");
	   }
	}
}
