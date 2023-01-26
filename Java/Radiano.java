import java.util.Scanner;

    public class Radiano {

    public static void main(String[] args) {

    double degrees = 45;
    double radians = Math.toRadians(degrees);
    
    /*Seno*/
    double sinValue = Math.sin(radians);
    System.out.println("sin(" + degrees + ") = " + sinValue);

    /*Cos*/
    double cosValue = Math.cos(radians);
    System.out.println("cos(" + degrees + ") = " + cosValue);

    /*Tan*/
    double tanValue = Math.tan(radians);
    System.out.println("tan(" + degrees + ") = " + tanValue);

    /*Secante*/
    double asinValue = Math.asin(radians);
    System.out.println("asin(" + degrees + ") = " + asinValue);

    /*Cosecante*/
    double acosValue = Math.acos(radians);
    System.out.println("acos(" + degrees + ") = " + acosValue);
    
    /*Cotangente*/
    double atanValue = Math.atan(radians);
    System.out.println("atan(" + degrees + ") = " + atanValue);

    }
}   


