/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class PrNrZ {
    public static void main(String[] args) {
        Scanner s= new Scanner (System.in);
        int n=s.nextInt();
        if(n==0)
            System.out.println("It is zero.");
        else 
            if(n<0)
              System.out.println("It is a negative number.");
            else 
              System.out.println("It is a positive number.");  
    }
}
