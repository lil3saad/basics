public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        int n = 1521;
        int og=151;
        int rev=0;
        while (n!=0){
            rev = rev * 10 + n%10;
            n=n/10;
        }
        System.out.println("The rev number = "+rev);
        if(og==rev){
            System.out.println("It is a palindrome");
        }
        else System.out.println("It is not a palindrome");
    }
}