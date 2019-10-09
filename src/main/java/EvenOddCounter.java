
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MichaelRigoOseeBrou
 */
public class EvenOddCounter {
  public static void main (String[] args) {
Random number = new Random () ;
int evencount = 0;
  int oddcount = 0;
  for ( int i = 1; i <100; i++) {
      if (isEven (number.nextInt(i)))
      {
          evencount++;
      }
      else
      {
          oddcount++;
      }
  }
  System.out.println(evencount);
  System.out.println(oddcount);
    }
  public static boolean isEven(int num) {
  boolean number = false;
  if ((num % 2)==0)
  {
      number = true;
  }
      return number;
  }
}