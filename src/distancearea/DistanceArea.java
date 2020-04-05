/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distancearea;

import java.util.Scanner;

/**
 *
 * @author Spy Hacker
 */
class Distance{
    int feet;
    int inch;
}
public class DistanceArea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scnrObj = new Scanner(System.in);
        Distance crtObj = new Distance();
        Distance crtObj1 = new Distance();
        
        System.out.print("Enter feet: ");
        crtObj.feet = scnrObj.nextInt();
        
        System.out.print("Enter inch: ");
        crtObj.inch = scnrObj.nextInt();
        
        System.out.print("\nEnter feet: ");
        crtObj1.feet = scnrObj.nextInt();
        
        System.out.print("Enter inch: ");
        crtObj1.inch = scnrObj.nextInt();
        
        int inch = crtObj.inch + crtObj1.inch;
        int feet = crtObj.feet + crtObj1.feet;
        int totalfeet = (inch/12)+feet;
        int totalinch = (inch%12);
        
       
        System.out.println("\nFeet:"+totalfeet +" Inch:"+totalinch);
       
        
    }
    
}
