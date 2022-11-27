import java.util.Scanner;

public class task11 {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter number");
        int num= scanner.nextInt();
        int count=0;
        if(num==0){
            System.out.println(1);
        } else if (num>0) {
            while (num>=1){
                count++;
                num=num/10;
            }
            System.out.println(count);
        }
        else{
            while (num<=-1){
                count++;
                num=num/10;
            }
            System.out.println(count);
        }
    }
}
