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
public class J01011_Boi_So_Chung_Uoc_So_Chung {
    static Long gcd(Long a, Long b) {
        
        // if b=0, a is the GCD
        if (b == 0)
            return a;
        
        // call the gcd() method recursively by
        // replacing a with b and b with
        // modulus(a,b) as long as b != 0
        else
            return gcd(b, a % b);
    }
  
    // lcm() method returns the LCM of a and b
    static long lcm(Long a, Long b)
    {
        return Math.abs(a * b) / gcd(a,b);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long t=sc.nextLong();
        while(t-->0){
            long n=sc.nextLong();
            long m=sc.nextLong();
            System.out.println(lcm(n, m)+" "+gcd(n,m));
        }
    }
}
