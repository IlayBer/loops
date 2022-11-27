import java.util.Scanner;

public class task8 {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter number");
        int num= scanner.nextInt();
        int isnt_prime=0;
        if((num==1)||(num==2)){
            System.out.println("number is prime");
        }
        else {
            for(int i=2;i<num;i++){
                if(num%i==0){
                    System.out.println("Number is not prime");
                    isnt_prime++;
                    break;
                }
            }
            if(isnt_prime==0){
                System.out.println("Number is prime");
            }
        }
    }
}
