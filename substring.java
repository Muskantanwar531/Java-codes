class substrings{
    public static void main(String args[])
{
    String sentence="My name is muskan.";
    String name=sentence.substring(11,sentence.length()); 
       String n=sentence.substring(0,10);  //Substring(beg index,end index).
    System.out.println(name+" "+n);
}}