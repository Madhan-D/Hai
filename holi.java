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
public class holi {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String n=s.nextLine();
        if(n.equalsIgnoreCase("sunday"))
            System.out.println("Holiday");
        else
            if(n.equalsIgnoreCase("monday")||n.equalsIgnoreCase("tuesday")||n.equalsIgnoreCase("wednesday")||n.equalsIgnoreCase("thursday")||n.equalsIgnoreCase("friday")||n.equalsIgnoreCase("saturday"))
        System.out.println("Working day");
    else
         System.out.println("Enter valid day");       
    }
}
