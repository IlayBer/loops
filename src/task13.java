import java.util.Scanner;

public class task13 {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter number");
        int num= scanner.nextInt();
        for(int i=1;i<=num;i++){
            for(int k=1;k<=10;k++){
                System.out.print(i*k);
                System.out.print(' ');
            }
            System.out.println(' ');
        }
    }
}
