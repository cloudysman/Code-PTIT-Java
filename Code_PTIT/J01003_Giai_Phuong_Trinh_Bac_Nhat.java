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
public class J01003_Giai_Phuong_Trinh_Bac_Nhat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long a=sc.nextLong();
        long b=sc.nextLong();
        if(a==0 &&b==0){
            System.out.println("VSN");
        }
        else if(a==0&&b!=0){
            System.out.println("VN");
        }
        else{
            System.out.printf("%.2f",(float)-b/a);
        }
    }
}
