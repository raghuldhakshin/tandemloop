
package javaApplication6;

import java.util.Scanner;


public class JavaApplication6 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Calculator");
        System.out.println("Enter first number");
        int a = s.nextInt();
        System.out.println("Enter second number");
        int b = s.nextInt();
        System.out.println("Enter the type of operation(+,-,*,/)");
        String op = s.next();
        switch(op){
            case "+":
                int add = a+b;
                System.out.println(add);
                break;
            case "-":
                System.out.println(a-b);
                break;
            case "*":
                System.out.println(a*b);
                break;
            case "/":
                System.out.println(a/b);
                break;
            default:
                System.out.println("Enter correct operation to proceed");
                  
        }
        
        
       
    }
}
       
    
   