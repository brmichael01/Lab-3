
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MichaelRigoOseeBrou
 */
class IsPrimeMethod {
    public static void main (String[] args) {
             Scanner Keyboard = new Scanner (System.in);
             System.out.println("Enter number");
             int number = Keyboard.nextInt();
             if (isPrime(number))
             {
                 System.out.println ("prime number");
             }
             else
             {
                 System.out.println ("not prime number");
             }
  }
             
    public static boolean isPrime (int num) {
      if (num<1) return false;
      for (int i = 2; i <= num/2; i++) {
          if (num% i ==0) return false;
      }
      return true;
   }
}
