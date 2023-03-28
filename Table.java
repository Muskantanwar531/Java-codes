// Print the table of a  no. input by the user?
//Time complexity=O(n)
import java.util.Scanner;
class Table{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n");
        int n=sc.nextInt();
        int c,i;
        for(i=1;i<=10;i++){
            c=i*n;
            System.out.println(c);
        }
    }
}