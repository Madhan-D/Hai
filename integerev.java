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
public class integerev {
    public static void main(String[] args) {
        Scanner s= new Scanner (System.in);
        String n2= s.next(); 
        int n= Integer.parseInt(n2); int []n1;int i=0;
       if(n<0)
          n1= new int[n2.length()-1];
       else
           n1= new int[n2.length()];
       if(n2.charAt(0)==0)
           n1[n2.length()-1]=0;
        
        
while(i<n1.length)
{if(n<0&&i!=0)
    n1[i]=Math.abs(n%10);
else
n1[i]=n%10;
    n/=10;
   i++;
}if(n2.charAt(0)=='-'&&n1[0]==0)
            System.out.print('-');
for( i=0;i<n1.length;i++)
        System.out.print(n1[i]);
    }
}
