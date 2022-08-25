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
public class J01007_Kiem_tra_So_Fibonacci {
    public static boolean fibo(long n){
        if(n<=3){
            return true;
        }
        long a=1,b=1,c=0;
        while(c<n){
            c=a+b;
            a=b;
            b=c;
        }
        return c==n;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        while(t-- >0){
            long n=sc.nextLong();
            if(fibo(n)==true){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
