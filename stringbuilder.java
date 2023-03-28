// Declaration of string builder
import java.util.*;
class Strbuild{
    public static void main(String args[]){
        StringBuilder sb=new StringBuilder("Muskan");
        System.out.println("Print the charcter of particular index "+sb.charAt(0));
        System.out.println("set the charater in that index "+sb.setCharAt(0,'V'));
        System.out.println("Insert the new charcter in string "+sb.insert(6,'t'));
        System.out.println("Delete the string b/w 3 to 5 "+sb.delete(3,5));
        System.out.println("Add a string in the end "+sb.append("e"));
    }
}