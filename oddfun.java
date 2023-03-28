//Write function to print the sum of all odd no from 1 to n?
import java.util.Scanner;
class Odd{
    public static void oddSum(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            if(! (i%2==0)){
                 sum=sum+i;
                 System.out.println(i);
            }
        }
                System.out.println("the sum of odd no. is: "+sum);
}
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the n for sum of odd no.");
    int n=sc.nextInt();
    oddSum(n);

}
}