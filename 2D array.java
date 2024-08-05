import java.util.*;

class Main{
    static void display (int[][] mat){
        for(int r=0;r<mat.length;r++){
            for(int c=0;c<mat[0].length;c++){
                System.out.print(mat[r][c] + " ");
            }
            System.out.println();
        }
        
    }
    //Q- waveform printing matrix
    /*1 2 3 4 
      4 5 6 21
      7 8 9 23
    */
    // o/p 1 4 7 8 5 2 9 6 3 23 21 4
      static void waveform(int[][] mat){
          for(int c = 0;c<mat[0].length;c++) {
              if(c%2==0){
                  //top to bottom
                  for(int r= 0 ;r<mat.length;r++){
                      System.out.print(mat[r][c] + " ");
                  }
              }
              else{
                  //bottom to top
                  for(int r=mat.length-1;r>=0;r--){
                      System.out.print(mat[r][c] + " ");
                  }
              }
          }
      }
    
    
    public static void main (String args[]){
        //create a 2D array and fill the elements as per user requirements.
        Scanner scn = new Scanner (System.in);
        int m=scn.nextInt();//rows
        int n=scn.nextInt();//columns
        int[][] mat = new int[m][n];
        
        for(int r= 0; r<m;r++){
            for(int c = 0;c<n;c++){
                mat[r][c]=scn.nextInt();
            }
        }
        waveform(mat);
       // display(mat);
        
    }
    

 
}
