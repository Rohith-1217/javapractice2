import java.util.Scanner;

public class Palreverse {
    public static int checkPalindrome(String s) {

        String reverse = new StringBuffer(s).reverse().toString();


        if (s.equals(reverse)) {
            return 1;
        } else {
            return 0;
        }

    }
    public static void main (String[] args)
            throws java.lang.Exception
    {
        System.out.println("Enter a string");

        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();

        int i=checkPalindrome(s);
        if(i==1)
        {
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }
}