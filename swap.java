/**Author...Ahmed
 * Date of creation 21-03-2024
 * vertion 1.0 name swap.java
 * debre birhan university
 * this program works swaping of to number with and without third variable
 * 
 */


import java.util.Scanner;
public class swap{
    public static void main(String args[]){
        int temp;
        Scanner swap=new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int num1=swap.nextInt();
        System.out.print("Enter the second number : ");
        int num2=swap.nextInt();
        System.out.println("befor swaping: "+ "number1= "+num1 + " number2= "+ num2);
        temp=num1;
        num1=num2;
        num2=temp;

        System.out.println("after swaping: "+" number1= " +num1 + "  number2= "+ num2);

        // num1=num1+num2;
        // num2=num1-num2;
        swap.close();
    }
}