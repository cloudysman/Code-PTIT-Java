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
public class J01004_So_Nguyen_To {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long t=sc.nextLong();
        while(t-- >0){
            long ok=1;
            long n=sc.nextLong();
            if(n<2){
                ok=0;
            }
            else{
                for(int i=2;i<=Math.sqrt(n);i++){
                    if(n%i==0){
                        ok=0;
                    }
                }
            }
            if(ok==0){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
        }
    }
}
