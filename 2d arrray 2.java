
import java.util.*;

class Main{
    static int[][] sum(int[][] a, int[][] b){
        
        int n = a.length;
        int m = a[0].length;
        int[][] res = new int[n][m];
        for(int r = 0; r<n;r++){
            for(int c=0;c<m;c++){
                res[r][c]=a[r][c]+b[r][c];
                
            }
        }
        return res;
    }
    
    static void display(int[][] mat){
        for(int r = 0; r<mat.length;r++){
            for(int c=0;c<mat[0].length;c++){
                System.out.print(mat[r][c]+ " ");
            }
            System.out.println();
        }
    }
    
    
    
    
    public static void main (String args[]){
        //create a 2D array and fill the elements as per user requirements.
        Scanner scn = new Scanner (System.in);
        
        int[][] mat1 = {
                 {1, 2, 3},
                 {4, 5, 6},
                 {7, 8, 9}
        };
        int[][] mat2= {
                 {1, 2, 3},
                 {4, 5, 6},
                 {7, 8, 9}
        };
        
        int[][] ans= sum(mat1, mat2);
        display(ans);
        
        
    }
    

 
}
