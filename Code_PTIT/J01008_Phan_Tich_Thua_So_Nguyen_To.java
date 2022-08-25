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
public class J01008_Phan_Tich_Thua_So_Nguyen_To {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        for (int i = 1; i <= t; i++) {
            int n = sc.nextInt();
            System.out.printf("Test %d: ", i);
            for (int j = 2; j <= Math.sqrt(n); j++) {
                int s = 0;
                while (n % j == 0) {
                    s++;
                    n /= j;
                }
                if (s > 0) {
                    System.out.printf("%d(%d) ", j, s);
                }
            }
            if (n > 1) {
                System.out.printf("%d(1) ", n);
            }
            System.out.println("");
        }
    }
}
