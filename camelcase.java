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
public class camelcase {
    public static void main(String[] args) {
        Scanner s= new Scanner (System.in);
        String n= s.nextLine();
        String n1=Character.toUpperCase(n.charAt(0))+"";
        for(int i=1;i<n.length();i++)
        {
            if(n.charAt(i-1)==' ')
            n1+=Character.toUpperCase(n.charAt(i));
            else
            n1+=Character.toLowerCase(n.charAt(i));
   
        }
        System.out.println(n1);
    }
}
