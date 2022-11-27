import java.util.Scanner;

public class task10 {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter number");
        int num= scanner.nextInt();
        int biggest_num=0;
        while (num>=1){
            if((num%10)>biggest_num){
                biggest_num=(num%10);
            }
            num=num/10;
        }
        System.out.println(biggest_num);
    }
}
