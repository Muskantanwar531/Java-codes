//take an array as input from the user search a given no. & print the index at which it occurs.
import java.util.Scanner;
class Search{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int size=sc.nextInt();
        int number[]=new int[size];
        for(int i=0;i<size;i++){
            number[i]=sc.nextInt();
        }
      System.out.println("enter you want to search");
      int x=sc.nextInt();
      for(int i=0;i<number.length;i++){
        if(number[i]==x)
        System.out.println("no. found at index:" +i);
      }
    }
}