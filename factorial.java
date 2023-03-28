//find the factorial of a given no.?
import java.util.Scanner;
class factorial{
    public static void factorialNum(int n){
        int i,f=1;
        for(i=n;i>=1;i--){
            f=f*i;
        }
        System.out.println("factorial of given no. is:"+ f);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n");
        int n=sc.nextInt();
        factorialNum(n);
    }
    
}