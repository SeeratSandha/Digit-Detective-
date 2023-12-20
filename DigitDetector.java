// Assignment Name = CS 160 HW 2
// Author = Seerat, Sandha.
// Date = 02/13/2023
// Email = sand4927@bears.unco.edu
import java.util.Scanner;
public class DigitDetector
{
    
        public static void main(String [] args){
        
        
        System.out.println("Enter a number between 1 and 999,999(without comma)");
        Scanner scnr = new Scanner(System.in);
        
        int desired_Number = scnr.nextInt();   // declaring variable 
                                                //desired_Number.
         
        // using if Else-if statements.
        
        if(desired_Number>=1 && desired_Number<=9)     //using Logical AND (&&) operator to join two conditions.
        {
            System.out.println("The number " + desired_Number + " has one digit.");
        }
        else if (desired_Number>=10 && desired_Number<=99)
        {
            System.out.println("The number " + desired_Number +" has two digits.");
        }
        else if (desired_Number>=100 && desired_Number<=999)
        {
            System.out.println("The number " + desired_Number +" has three digits.");
        }
        else if (desired_Number>=1000 && desired_Number<=9999)
        {
            System.out.println("The number " + desired_Number +" has four digits.");
        }
        else if (desired_Number>=10000 && desired_Number<=99999)
        {
            System.out.println("The number " + desired_Number +" has five digits.");
        }
        else if (desired_Number>=100000 && desired_Number<=999999)
        {
            System.out.println("The number " + desired_Number +" has six digits.");
        }
        else if (desired_Number<1 )
        {
            System.out.println("The number " + desired_Number +" is too small.");
        }
        else if (desired_Number>999999 )
        {
            System.out.println("The number " + desired_Number +" is too big.");
        }
        if(desired_Number%2==0 && desired_Number>=1 && desired_Number<=999999)//using %(modulas) for divisibility check.
        {
            System.out.println("The number  "+desired_Number+"  is divisible  by  2."); 
        }
         if(desired_Number%3==0 && desired_Number>=1 && desired_Number<=999999)
        {
            System.out.println("The number  "+desired_Number+"  is divisible  by  3."); 
        }
         if(desired_Number%4==0 && desired_Number>=1 && desired_Number<=999999)
        {
            System.out.println("The number  "+desired_Number+"  is divisible  by  4."); 
        }
         if(desired_Number%5==0 && desired_Number>=1 && desired_Number<=999999)
        {
            System.out.println("The number  "+desired_Number+"  is divisible  by  5."); 
        }
         if(desired_Number%6==0 && desired_Number>=1 && desired_Number<=999999)
        {
            System.out.println("The number  "+desired_Number+"  is divisible  by  6."); 
        }
         if(desired_Number%7==0 && desired_Number>=1 && desired_Number<=999999)
        {
            System.out.println("The number  "+desired_Number+"  is divisible  by  7."); 
        }
         if(desired_Number%8==0 && desired_Number>=1 && desired_Number<=999999)
        {
            System.out.println("The number  "+desired_Number+"  is divisible  by  8."); 
        }
         if(desired_Number%9==0 && desired_Number>=1 && desired_Number<=999999)
        {
            System.out.println("The number  "+desired_Number+"  is divisible  by  9."); 
        }
         if(desired_Number%10==0 && desired_Number>=1 && desired_Number<=999999)
        {
            System.out.println("The number  "+desired_Number+"  is divisible  by  10."); 
        }
        if(isPrime(desired_Number) && desired_Number>=1 && desired_Number<=999999) 
        {
            System.out.println("The number "+desired_Number + " is prime .");
        }
        else if (isPrime(desired_Number) && desired_Number>=1 && desired_Number<=999999)
        {
            System.out.println("The number "+desired_Number + " is a non-prime .");
        }
    }
    static  boolean isPrime(int primeNum)// Checks whether the parameter integer primeNum is a prime number or not.
    {
        if(primeNum<=1)
        {
            return false;
        }
       for(int n=2;n<=primeNum/2;n++)   // Here, (n<=primeNum/2) as a loop condition. The final statement (n++) 
                                        // increments the variable (n) by 1 each time the loop runs.
       {
           if((primeNum%n)==0)
               return  false;
       }
       return true;
        
        
        
        
        
        
        
    }
    }

