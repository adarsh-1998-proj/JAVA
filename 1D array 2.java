import java.util.*;

public class Main {
    
    static boolean IsIncreasing(int a[]){
        for(int i =0 ;i<a.length-1;i++){
            if (a[i]>a[i+1]){
                return false;
            }
        }
        return true;
    }
    static boolean PairSum(int a[], int k){
        for (int i=0;i<a.length-1;i++){
            if(a[i]+a[i+1]==k){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
    Scanner scn= new Scanner(System.in);
        int n= scn.nextInt();
        int arr[]= new int[n];
        for (int i =0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int k= scn.nextInt();
        System.out.print(PairSum(arr,k));
        // System.out.print(IsIncreasing(arr));
        
    
    }
}
