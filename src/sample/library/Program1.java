/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.library;


/**
 *
 * @author Dell
 */
public class Program1 {

    public static void main(String[] args) {
        int a;
        int b;
        a = 10;
        b = 2;
        if (a < 0) {
            System.out.println("Ahihi");
        }
        int resultSub = MyMath.Sub(a, b);
        System.out.printf("Sub: %d - %d = %d", a, b, resultSub);
        System.out.println();
    }
}
