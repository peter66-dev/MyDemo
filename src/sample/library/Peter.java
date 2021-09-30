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
public class Peter {

    public static void main(String[] args) {
        int a;
        int b;
        a = 10;
        b = 2;
        int resultSum = MyMath.Sum(a, b);
        int resultSub = MyMath.Sub(a, b);
        System.out.printf("Sub: %d - %d = %d", a, b, resultSub);
        System.out.println();
    }
}
