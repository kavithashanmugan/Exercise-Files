/*
 * This program is designed to calculate the exterior surface area of a house
 */
//package simplecalculation;
import java.util.Scanner;

/**
 *
 * @author Peggy Fisher
 */
public class SimpleCalculation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double pricePerGallon,totalSurfaceArea,height,length,width,sizeOfWindows,sizeOfDoors,surfaceAreaDoors,surfaceAreaWindows,totalPaintCost,surfaceAreaPainted,feetPerGallon;
        int numberOfWindows,numberOfDoors;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the height of the house");
        height = in.nextDouble();
        System.out.println("Enter the length of the house");
        length = in.nextDouble();
        System.out.println("Enter the width of the house");
        width = in.nextDouble();
        totalSurfaceArea = (width*height*2)+(length*height*2);
        System.out.println("Total Surface area"+totalSurfaceArea);
        System.out.println("Enter the sizeOfWindows of the house");
        sizeOfWindows = in.nextDouble();
        System.out.println("Enter the numberOfWindows of the house");
        numberOfWindows = in.nextInt();
        surfaceAreaWindows = sizeOfWindows * numberOfWindows;
        System.out.println("Enter the sizeOfDoors of the house");
        sizeOfDoors = in.nextDouble();
        System.out.println("Enter the numberOfDoors of the house");
        numberOfDoors = in.nextInt();
        surfaceAreaDoors = sizeOfDoors * numberOfDoors;
        System.out.println("Enter the price per gallon of paint");
        pricePerGallon = in.nextDouble();
        System.out.println("Enter the feet per gallon of paint");
        feetPerGallon = in.nextDouble();
        surfaceAreaPainted = totalSurfaceArea - (surfaceAreaDoors + surfaceAreaWindows);
        System.out.println("Surface area paintable"+surfaceAreaPainted);
        totalPaintCost = (surfaceAreaPainted/feetPerGallon)*pricePerGallon;
        System.out.println("Cost of paint is $"+totalPaintCost);




    }
    
}
