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
public class swapchar {
    public static void main(String[] args) {
       Scanner s= new Scanner (System.in);
       System.out.print("Enter a string:");
       String n= s.nextLine(),m="";
       for(int i=0;i<n.length()-1;i=i+2)
       {
           m=m+n.charAt(i+1)+n.charAt(i);
       }
       if(n.length()%2!=0)
           m=m+n.charAt(n.length()-1);
        System.out.println(m);
       
    }
}
