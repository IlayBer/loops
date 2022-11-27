import java.util.Scanner;

public class task6 {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter 2 numbers");
        double X=scanner.nextInt();
        double Y=scanner.nextInt();
        if(Y==0){
            System.out.println(1);
        } else if (Y < 0) {
            double X_power_Y=1;
            for(int i=-1;i>=Y;i--){
                X_power_Y=(X_power_Y)/X;
            }
            System.out.println(X_power_Y);
        }
        else {
            double X_power_Y=1;
            for(int i=1;i<=Y;i++){
                X_power_Y=(X_power_Y)*X;
            }
            System.out.println(X_power_Y);
        }
    }
}
