/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package new;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class revstr {
    public static void main(String[] args) {
   Scanner s= new Scanner(System.in);
   String a=s.nextLine();
    StringBuffer b=new StringBuffer(a);
        System.out.println(b.reverse());
        a=b.toString();
        System.out.println(a.replaceAll("[a,e,i,o,u]",""));
}
}