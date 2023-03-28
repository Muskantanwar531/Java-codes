// Print the sum of first n natural number?
import java.util.Scanner;
class Natural{
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
        System.out.println("enter the n ");
       int n = sc.nextInt();
       int i,s=0;
        for(i=1;i<=n;i++){
            s=i+s;
        }
        System.out.println(s);
    }
}