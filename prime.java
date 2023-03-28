// print the prime no. or not?
//time complexiy=o(n)
//not working
class Prime{
    public static void main(String args[]){
        int n=3;
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                System.out.println("Not a prime no.");
            }if(i>n/2){
                System.out.println("It is a prime no.");
            }
        }
    }
}