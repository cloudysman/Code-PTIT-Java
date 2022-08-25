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
public class J01001_HinhChuNhat {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long chuVi = (a + b) * 2;
        long dienTich = a * b;
        if (a <= 0 || b <= 0) {
            System.out.println("0");
        } else {
            System.out.println(chuVi + " " + dienTich);
        }
    }
}
