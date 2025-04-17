import java.util.Scanner;
public class ReverseDigit{
public static void main(String[] args) {
  Scanner digit=new Scanner(System.in);
  System.out.print("pls enter the digit to reverse : ");
  int num1=digit.nextInt();
  int num2;
  int num3=0;
  while(num1 >0){
   num2=num1 %10;
   num1=num1/10;
   num3=(num3*10)+num2;
  }
  System.out.println("the reverse of the digit is "+num3);
  digit.close();
}
}