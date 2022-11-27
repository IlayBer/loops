import java.util.Scanner;

public class task7 {
    public static void main(String[]args){
        int total_positive=0;
        int total_negative=0;
        int while_break=0;
        Scanner scanner=new Scanner(System.in);
        while (while_break!=1){
            System.out.println("enter number");
            int num=scanner.nextInt();
            if(num>0){
                total_positive+=num;
            } else if (num<0) {
                total_negative+=num;
            }
            else{
                System.out.println(total_positive);
                System.out.println(total_negative);
                while_break++;
            }
        }
    }
}
