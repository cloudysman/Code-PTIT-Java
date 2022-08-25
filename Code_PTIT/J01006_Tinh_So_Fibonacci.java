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
public class J01006_Tinh_So_Fibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        while (t-- > 0) {
            long n = sc.nextLong();
            if(n==1 || n==2){
                System.out.println("1");
            }
            else if (n > 2) {
                long fn=0, f0 = 1, f1 = 1;
                for (int i = 2; i < n; i++) {
                    fn = f0 + f1;
                    f0 = f1;
                    f1 = fn;
                }
                System.out.println(fn);
            }
        }
   }
}
