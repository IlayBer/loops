import java.util.Scanner;

public class task12 {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter number");
        int num= scanner.nextInt();
        while ((num>10)||(num<1)){
            System.out.println("enter number");
            num= scanner.nextInt();
        }
        for(int i=1;i<=100;i++){
            for(int k=1;k<=10;k++){
                System.out.print(num*k);
                System.out.print(' ');
            }
            System.out.println(' ');
        }
    }
}
