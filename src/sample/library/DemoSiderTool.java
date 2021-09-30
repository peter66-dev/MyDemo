/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.library;

import java.util.Scanner;
import sample.library.MyMath;

/**
 *
 * @author Dell
 */
public class DemoSiderTool {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = Integer.parseInt(scan.nextLine());
        System.out.print("Enter b: ");
        int b = Integer.parseInt(scan.nextLine());
        a = 10;
        b = 2;
        int resultSum = MyMath.Sum(a, b);
        int resultSub = MyMath.Sub(a, b);
        System.out.printf("Sub: %d - %d = %d", a, b, resultSub);
        System.out.println();
    }

}
