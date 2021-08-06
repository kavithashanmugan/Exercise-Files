/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travelcost;
import java.util.Scanner;



/**
 *
 * @author Peggy Fisher
 */
public class TravelCost {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double distance;
        double mpg;
        double pricePerGallon;
        double totalCost;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the total distance in miles");
        distance = in.nextDouble();
        System.out.println("Enter mpg");
        mpg = in.nextDouble();
        System.out.println("Enter price per gallon");
        pricePerGallon = in.nextDouble();
        totalCost = (distance/mpg) * pricePerGallon;
        System.out.printf("total cost",totalCost);
    }
    
}
