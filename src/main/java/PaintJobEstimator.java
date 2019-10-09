
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
public class PaintJobEstimator {
public static void main(String[] args) {
             Scanner keyboard = new Scanner(System.in);
            System.out.print("number of rooms to be painted");
            int numberofpaintedroom = keyboard.nextInt();
            System.out.print("paint price per gallon");
            double paintpricepergallon = keyboard.nextDouble();
            System.out.print("Sqr feet of wall space");
            double sqrFeetWallSpace = keyboard.nextDouble();
            double totalSqrFeetOfAllRoom = (numberofpaintedroom * sqrFeetWallSpace);
            double gallonofpaintrequired = totalSqrFeetOfAllRoom/115;
                System.out.println("Gallons of paint required="+gallonofpaintrequired);
                double labourhoursrequired = getlabourhours(gallonofpaintrequired);
                System.out.println("Labour hour required="+labourhoursrequired);
                double paintcost = getpaintcost(gallonofpaintrequired, paintpricepergallon);
                System.out.println("Paint cost=" + paintcost);
                double labourcharge = getlabourcharge(labourhoursrequired);
                System.out.println("Labour charges=" + labourcharge);
                double totatpaintjobcost = gettotatpaintjobcost(paintcost, labourcharge);
                System.out.println("Total cost of paint job=" + totatpaintjobcost);
    }
     public static double getlabourhours(double gallonofpaintrequired) {
        double labourhours = (gallonofpaintrequired * 8);
        return labourhours;
    }
    public static double getpaintcost(double gallonofpaintrequired, double paintpricepergallon) {
        double paintcost = (paintpricepergallon*gallonofpaintrequired);
        return paintcost;
    }
    public static double getlabourcharge(double labourhoursrequired) {
        double labourcharge = (labourhoursrequired * 18);
        return labourcharge;
    }
      public static double gettotatpaintjobcost(double paintcost, double labourcharge) {
        double totalpaintjobcost = (labourcharge+paintcost);
        return totalpaintjobcost;
    }
    
}
