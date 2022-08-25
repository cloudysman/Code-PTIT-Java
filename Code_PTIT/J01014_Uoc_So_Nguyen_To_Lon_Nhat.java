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
public class J01014_Uoc_So_Nguyen_To_Lon_Nhat {
    public static long solve(long n){
        long res=0;
        for(int i=2;i<=Math.sqrt(n);i++){
            while(n%i==0){
                res=i;
                n/=i;
            }
        }
        if(n!=1){
            res=n;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long t=sc.nextLong();
        while(t-- >0){
            long n=sc.nextLong();
            System.out.println(solve(n));
        }
    }
}
