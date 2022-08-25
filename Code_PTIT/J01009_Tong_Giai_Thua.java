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
public class J01009_Tong_Giai_Thua {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long tich=1;
        long tong=0;
        for(int i=1;i<=n;i++){
            tich*=i;
            tong+=tich;
        }
        System.out.println(tong);
    }
}
