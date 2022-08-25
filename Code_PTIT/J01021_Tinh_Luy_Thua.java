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
public class J01021_Tinh_Luy_Thua {
    public static long pow(long a,long b){
        long res=1;
        while(b!=0){
            if(b%2==1){
               res*=a; 
            }
            b/=2;
            a*=a;
        }
        return res;
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true){
            long a=sc.nextLong();
            long b=sc.nextLong();
            if(a==0&&b==0){
                break;
            }
            else{
                System.out.println(pow(a, b));
            }
        }
    }
}
