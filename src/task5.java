import java.util.Scanner;

public class task5 {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter number");
        int X=scanner.nextInt();
        int factorial=1;
        if(X==0){
            System.out.println(1);
        } else if (X<0) {
            System.out.println("Error");
        }
        else{
            for(int i=1;i<=X;i++){
                factorial=factorial*i;
            }
            System.out.println(factorial);
        }
    }
}
