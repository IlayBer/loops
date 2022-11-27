import java.util.Scanner;

public class task4 {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        int positive_check=0;
        int num;
        while (positive_check==0){
            System.out.println("enter a positive number");
            num= scanner.nextInt();
            if(num>=0){
               System.out.println(num);
               positive_check++;
            }
        }
    }
}
