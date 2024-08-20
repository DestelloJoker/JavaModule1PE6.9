/*Program Name:FTtoMandMtoFT.java
 * Authors: Austin P
 * Date last Updated: 8/20/2024
 * Purpose: This program is meant to convert feet to meters and meters to feet using Java.
 */

// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

// public class FTtoMandMtoFT MUST be the same name as the file
public class FTtoMandMtoFT {
  public static void main(String[] args) {
    // System.out.println("Hello world!");

    //Code block to use the method footToMeter to convert feet from range 1 to 10
    //into meters and then print the result.
    System.out.println("The conversion from feet to meters from 1 foot to 10 feet: ");
    System.out.println("------------------------------");
    for (double FT = 1, i = 0; i < 10; i++, FT++) {
      double ConvertMeters = footToMeter(FT);
      if (FT == 1) {
        System.out.println(FT + " foot is " + ConvertMeters + " meters. \n");
      } else {
        System.out.println(FT + " feet is " + ConvertMeters + " meters.\n");
      }
    }
    
    //Code block to use the method meterToFoot to convert meters from range 20 to 65
    //in increments of 5 into feet and then print the result.
    System.out.println("------------------------------");
    System.out.println("The conversion from meters to feet from 20 meters to 65 meters in increments of 5 meters: ");
    System.out.println("------------------------------");
    for (double m = 20, i = 0; i < 10; i++, m += 5) {
      double ConvertFeet = meterToFoot(m);
        System.out.println(m + " meters is  " + ConvertFeet + " feet.\n");
      
    }
    System.out.println("------------------------------");
  }

  // Methods for obtaining the conversion for feet to meters or
  // meters to feet.
  public static double footToMeter(double foot) {
    return foot * 0.305;
  }

  public static double meterToFoot(double meter) {
    return meter * 3.279;
  }
}