/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code_PTIT;

import java.util.Scanner;

/**
 *
 * @author tin
 */
public class J01025_Hinh_Vuong {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        int b1 = sc.nextInt();
        int c1 = sc.nextInt();
        int d1 = sc.nextInt();
        int a2 = sc.nextInt();
        int b2 = sc.nextInt();
        int c2 = sc.nextInt();
        int d2 = sc.nextInt();
        int x1 = Math.min(a1, a2);
        int x2 = Math.min(b1, b2);
        int y1 = Math.max(c1, c2);
        int y2 = Math.max(d1, d2);
        int x = Math.max(Math.abs(y1 - x1), Math.abs(y2 - x2));
        System.out.print(x * x);
    }
}
        