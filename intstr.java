/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package codes;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class intstr {
    public static void main(String[] args) {
        Scanner s= new Scanner (System.in);
        System.out.println("Enter a valid number:");
        String n=s.nextLine();
        System.out.println(Integer.parseInt(n));
    }
}
