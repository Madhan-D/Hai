/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import com.sun.xml.internal.ws.util.StringUtils;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author Student
 */
public class Happynumber {


  	public static void main(String[] args) {

Scanner s= new Scanner(System.in);


int n=s.nextInt();
int a=hpy(n);
if(a==1||a==7)
                System.out.println("happy");
else
                System.out.println("not happy");


    } 
        public static int hpy(int n)
        {
            int s=0;
            while (n!=0)
            {
                s+=Math.pow(n%10,2);
                n=n/10;
            }
            if(s<10)
                return s;
            else
            {
                n=s;
                return hpy(n);
            }
        }
}



