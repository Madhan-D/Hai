/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mech;


import java.util.Scanner;

/**
 *
 * @author Student
 */
public class fon {static int n; 

   public  static void main (String[]args)
   {
       int f=1,n; 
       Scanner s = new Scanner (System.in);
      System.out.println("enter no.");
       n=s.nextInt();
      
       for (int i=1;i<=n;i++)
       {
       f*=i;
       }
       if(n>0)
       System.out.println(f);
       else
           System.out.println("invalid number");
   }
       
       
   
}
           
