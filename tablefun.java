//print table through function
import java.util.Scanner;
class table{
    public static void tablefun(int n){
    int c,i;
        for(i=1;i<=10;i++){
            c=i*n;
            System.out.println(c);
        }
        
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
        tablefun(i);
        }
    }
}