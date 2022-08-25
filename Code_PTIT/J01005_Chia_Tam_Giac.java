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
public class J01005_Chia_Tam_Giac {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        while (t-- > 0) {
            long n = sc.nextLong();
            long h = sc.nextLong();
            for (int i = 1; i < n; i++) {
                System.out.printf("%.6f ", h * Math.sqrt((double) i / n));
            }
            System.out.println("");
        }
    }
}
