import java.util.Scanner;

public class task2 {
    public static void main(String []args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter a min and max number");
        int X=scanner.nextInt();
        int Y=scanner.nextInt();
        if(Y>X){
            for(int i=X;i<=Y;i++){
                System.out.println(i);
            }}
    }
}
