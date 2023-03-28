import java.util.Scanner;
class strings{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 2 string");
        String name=sc.nextLine();
        String surname=sc.nextLine();
        String c=name+" "+surname;  //concatenation of two strings.
        System.out.println(c);
        System.out.println(c.length());// find length of a string.
        for(int i=0;i<c.length();i++){
        System.out.println(c.charAt(i));//charAt used to print individual character.
        }
        if(name.compareTo(surname)==0){   // compare two strings
            System.out.println("Strings are equal");
        }else{
            System.out.println("strings are not equal");
        }
    }
}