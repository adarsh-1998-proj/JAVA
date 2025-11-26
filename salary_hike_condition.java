import java.util.Scanner;

public class salary_hike_condition {
    public static void main(String[] args){
        Scanner scn =new Scanner (System.in);
        int salary = scn.nextInt();
        int rating = scn.nextInt();
        if(rating<3){
            System.out.println(salary);
        }
        else if(rating==3){
            System.out.print(salary+0.05 * salary);
        }
        else if(rating==4){
            System.out.print(salary+0.10*salary);

        
        }
        else if(rating==5){
            System.out.print(salary+0.15*salary);
        }
    }
}
