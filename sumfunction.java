//make a function to add two no.?
import java.util.Scanner;
class sum{
    public static void sum(int a, int b){
        int c;
        c=a+b;
        System.out.println(c);

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a and b");
        int a=sc.nextInt();
        int b=sc.nextInt();
        sum(a,b);//calling function
    }
}