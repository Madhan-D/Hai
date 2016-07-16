/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mech;

import com.sun.xml.internal.ws.encoding.soap.SOAP12Constants;
import java.util.Scanner;

/**
 *
 * @author Student
 */
public class fon {static int n; 

   public  static void main (String[]args)
   {
       int f=1; 
       Scanner s = new Scanner (System.in);
      System.out.println("enter no.");
       n=s.nextInt();
      
       for (int i=1;i<=n;i++)
       {
       f*=i;
       }
       System.out.println(f);
       System.out.println(we);
       
       main();
   }static int we=3;
   public  static void main()
   {
   
       System.out.println(we);
   }
}
           
