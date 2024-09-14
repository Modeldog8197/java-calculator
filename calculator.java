import java.util.Scanner;
import java.util.*;



public class calculator {
    public static double sub(double a, double b) {
        return a - b;
        
    }
    public static double add(double a, double b) {
        return a + b;
    }
    public static double mul(double a, double b) {
        return a * b;
    }
    public static double div(double a, double b) {
        return a / b;
    }
    public static double mod(double a, double b) {
        return a % b;
    }
    public static double square(double a){
        return a*a;
    }
    public static double cube(double a){
        return a*a*a;
    }
    public static double sqrt(double a){
        return Math.sqrt(a);
    }
    public static double power(double a, double b){
        return Math.pow(a,b);
    }
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        char cont = 'y';
        System.out.println("Welcome to the calculator");
        do{
            System.out.println("enter the number you would like to perform the operation on");
            double a = ip.nextInt();
            System.out.println("enter another?? (y/n)");
            char y = ip.next().toLowerCase().charAt(0);
            if (y =='y') {
                double b = ip.nextInt();
                System.out.println("enter the operation you would like to perform");
                System.out.println("enter 1 for addition");
                System.out.println("enter 2 for subtraction");
                System.out.println("enter 3 for multiplication");
                System.out.println("enter 4 for division");
                System.out.println("enter 5 for modulus");
                int opt = ip.nextInt();
                switch (opt) {
                    case 1:
                    {
                        double s = add(a, b);
                        System.out.println(s);
                        
                        break;}
        
                    case 2:
                    {
                        double s = sub(a, b);
                        System.out.println(s);
                        break;}
                    case 3:
                    {
                        double s = mul(a, b);
                        System.out.println(s);
                        break;}
                    case 4:
                    {
                        double s = div(a, b);
                        System.out.println(s);
                        break;}
                        case 5:
                    {
                        double s = mod(a, b);
                        System.out.println(s);
                        break;}
        
                
                    default:
                    System.out.println("please enter a number and a number only");
                        break;
                }
                
            }
            else if(y == 'n'){
                System.out.println("what operation would you like to perform??");
                System.out.println("enter 1 for square root");
                System.out.println("enter 2 for power");
                System.out.println("enter 3 for factorial");
                System.out.println("enter 4 for square");
                System.out.println("enter 5 for cube");
                int opt = ip.nextInt();
                switch (opt) {
                    case 1:
                        double s = sqrt(a);
                        System.out.println(s);
                        break;
                    case 2:{
                        System.out.println("enter the power");
                        double b = ip.nextInt();
                        double k = power(a, b);
                        System.out.println(k);
                        break;}
                    case 3:
                        for(double i = a;i>1;i--){
                            a = a*i;
                            
                        }
                        System.out.println(a);
                        break;
                        
                    case 4:
                        double m = square(a);
                        System.out.println(m);
                        break;
                    case 5:
                        double n = cube(a);
                        System.out.println(n);
                        break;
                    default:
                        
                        break;
                
                }
                
        }
        System.out.println("Continue? (y/n)"); 
        cont = ip.next().toLowerCase().charAt(0); 
        ip.nextLine();
            }
            while(cont == 'y');
            System.out.println("Exiting Program");
        
        
       

        ip.close();

    }
    
}
