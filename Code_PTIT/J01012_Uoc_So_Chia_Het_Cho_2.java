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
public class J01012_Uoc_So_Chia_Het_Cho_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int count=0;
            for(int i=1;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    if(i%2==0){
                        ++count;
                    }
                    if((n/i)%2==0){
                        ++count;
                    }
                    if(i*i==n&&i%2==0){
                        --count;
                    }
                }
            }
            System.out.println(count);
        }
    }
}
