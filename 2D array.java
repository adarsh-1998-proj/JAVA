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
    //Q2- waveform printing matrix?
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
     // Q3 - You are given a matrix[][] you have to return max of elments?
     /* A : { 12 65 35 24
              22 44 12 30
              10 12 97 19}
         
     }*/
     // op-: 97
     static int max(int[][] mat){
         int max= mat[0][0];
         for(int r = 0;r<mat.length;r++){
             for (int c = 0;c<mat[0].length;c++){
                 if(mat[r][c]>max){
                     max=mat[r][c];
                 }
             }
         }
         return max;
     }
    
    
    public static void main (String args[]){
        //q1 create a 2D array and fill the elements as per user requirements.?
        Scanner scn = new Scanner (System.in);
        int m=scn.nextInt();//rows
        int n=scn.nextInt();//columns
        int[][] mat = new int[m][n];
        
        for(int r= 0; r<m;r++){
            for(int c = 0;c<n;c++){
                mat[r][c]=scn.nextInt();
            }
        }
       // waveform(mat);
       // display(mat);
       System.out.print(max(mat));
        
    }
    

 
}
