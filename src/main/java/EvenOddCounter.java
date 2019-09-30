/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MichaelRigoOseeBrou
 */
import java.util.Random;

public class EvenOddCounter {
  public static boolean isEven( int number ) {
      if( ( number % 2 ) == 0 ) {
          return true;
      } else {
          return false;
      }
  } 
  public static void main( String [ ] args ) {
      Random random = new Random();
      int randomNumberGenerated; 
      int numberOfEvenNumbers = 0;
      int numberOfOddNumbers = 0;
      
      for( int currentNumber = 1; currentNumber <= 100; currentNumber++) {
          randomNumberGenerated = random.nextInt(10) + 1;
          if( isEven( randomNumberGenerated)) {
              numberOfEvenNumbers += 1;
          } else{
              numberOfOddNumbers += 1;
          }
      }
      System.out.println( "There were " + numberOfEvenNumbers + " even numbers and" + numberOfOddNumbers + "add numbers");
  }
}