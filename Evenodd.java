/**Author...Ahmed
 * Date of creation 22-03-2024
 * vertion 1.0 name Evenodd.java
 * debre birhan university
 * this program works accepting the number and chech the number is even or odd
 * 
 */
import java.util.Scanner;
public class Evenodd {
    public static void main(String[] args) {
       Scanner evenodd=new Scanner(System.in) ;
       System.out.println("pls the intiger number to check odd and even");
       int number=evenodd.nextInt();
       if(number%2==0){
        System.out.println(number +" is Even");
       }
       else {
        System.out.println(number +" is Odd");
       }
       evenodd.close();
    }
}
