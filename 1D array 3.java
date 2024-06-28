
import java.util.*;

public class Main {
    static ArrayList<Integer> even(ArrayList<Integer> List){
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=0;i<List.size();i++){
            int ele= List.get(i);
            if (ele%2==0){
                res.add(ele);
            }
            
        }
        return res;
    }
    public static void main (String[] args){
        Scanner scn= new Scanner (System.in);
        //ArrayList;
        
        ArrayList<Integer> List = new ArrayList<>();
        for (int i=0;i<5;i++){
           int val =scn.nextInt();
            List.add(val);
        }
        System.out.print(even(List));
        
        // List.add(10);
        // List.add(20);
        // List.add(40);
        // List.add(20000);
        // List.add(2000001);
        // List.size();
        // List.remove(1);
        // System.out.println(List.size());
        // System.out.print(List);
        
    }
    
}
