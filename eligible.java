//Write a function take in age as  input & return if that person is eligible to vote or not if age>18 is eligible to vote?
import java.util.Scanner;
 class Age{
    public static void eligible(int age){
        if(age>18){
            System.out.println("A person is eligible for vote.");
        }else{
            System.out.println("A person is not eligible for vote.");
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the age");
        int age=sc.nextInt();
        eligible(age);
    }
 }