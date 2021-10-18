
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Muhamad Yamin
 */
public class PalindromeKata {
   public static boolean palindrome(String s)
      {
            if(s.length() == 0 || s.length() == 1)
                  return true;
            if(s.charAt(0) == s.charAt(s.length()-1))
                  return palindrome(s.substring(1, s.length()-1));
            return false;
      }

      public static void main(String[]args)
      {
            Scanner input = new Scanner(System.in);
            System.out.println("Tuliskan kata untuk mengecek palindrome :");
            String x = input.nextLine();
            if(palindrome(x))
                  System.out.println(x + " Adalah palindrome ");
            else
                  System.out.println(x + " Bukan palindrome");
      }
}  

