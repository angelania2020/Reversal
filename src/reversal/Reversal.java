/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reversal;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Angelina
 */
public class Reversal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Enter a string: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char[] charStr = str.toCharArray();
//        System.out.println("charStr = " + Arrays.toString(charStr));
//charStr = [h, o, m, e]
        char[] charStr2 = new char[charStr.length];
//        System.out.println("charStr2 = " + Arrays.toString(charStr2));
//charStr2 = [ ,  ,  ,  ]
        for (int i=0; i < charStr.length; i++) {
            charStr2[(charStr.length - i)-1] = charStr[i];
        }
//        System.out.println("charStr2 = " + Arrays.toString(charStr2));
//charStr2 = [e, m, o, h]
        String str2 = new String(charStr2);
        System.out.println("Reversed string: " + str2);
    }
    
}
