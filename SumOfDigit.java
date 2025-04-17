import java.util.Scanner;
public class SumOfDigit {
    public static void main(String[] args) {
        Scanner sum1=new Scanner(System.in);
        System.out.print("pls enter the number to sum the digit : ");
        int num=sum1.nextInt();
        int sum=0;
        int b;
        while(num>0){
            b=num%10;
            sum+=b;
            num/=10;
        }
        System.out.println("the sum of the digit "+ num +"is: "+sum);
        sum1.close();
    }
}
