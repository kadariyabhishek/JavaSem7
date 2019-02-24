package Class4;

import java.util.Scanner;

/**
 * Created by a-19-k on 2/7/19.
 */

class CheckPalindrome{
    public void method(){
        int r,sum=0,temp,n;
        /*int n=454;//It is the number variable to be checked for palindrome*/
        System.out.print("Enter the number to be checked: ");
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        temp=n;
        while(n>0){
            r=n%10;  //getting remainder
            sum=(sum*10)+r;
            n=n/10;
        }
        if(temp==sum)
            System.out.println(temp+"is a palindrome number");
        else
            System.out.println(temp+"is not a palindrome number");
    }
}
public class Palindrome {
    public static void main(String[] args) {
        CheckPalindrome c = new CheckPalindrome();
        c.method();
    }
}
