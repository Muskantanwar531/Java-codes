//Enter the 3no. from user and make a function to print their average?
import java.util.Scanner;
class Average{
    public static void averagefun(int a, int b, int c){
        int avg;
        avg=(a+b+c)/3;
        System.out.println("The average is: " +avg);
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the a,b and c");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        averagefun(a,b,c);
    }
}