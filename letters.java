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
public class letters {
    public static void main(String[] args) {
        String l="abcdefghijklmnopqrstuvwxyz";
        
        Scanner s= new Scanner(System.in);
        
        char [] k= s.nextLine().toCharArray();
        //System.out.println(k);
        //System.out.println(k.length);
        int ln = k.length;
        int m= l.indexOf(Character.toLowerCase(k[ln-1]));
        //System.out.println(k[ln-1]);
        for (int i=0;i<ln;i++)
        {int n=l.indexOf(Character.toLowerCase(k[i]))-(m+1);
            if(n<=0)
            {if(k[i]==Character.toLowerCase(k[i]))
                k[i]=l.charAt(26+n);
            else
                k[i]=Character.toUpperCase(l.charAt(26+n));
            }else
            {if(k[i]==Character.toLowerCase(k[i]))
                k[i]=l.charAt(n);
            else
                k[i]=Character.toUpperCase(l.charAt(n));
            }
        }
       System.out.println(k); 
}
}