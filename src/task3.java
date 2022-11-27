import java.util.Scanner;

public class task3 {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter number");
        int N= scanner.nextInt();
        if(N>=1){
            for(int i=1;i<=N;i++){
                System.out.println(i);
            }
        }
    }
}
