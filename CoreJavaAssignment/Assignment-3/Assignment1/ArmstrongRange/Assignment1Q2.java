package Assignment1.ArmstrongRange;

import java.util.Scanner;



public class Assignment1Q2 {
    public static void main(String[] args) {

        ArmstrongNumberRange A = new ArmstrongNumberRange();
        Scanner sc = new Scanner(System.in);

        int[] arr1 = new int[13];
        int minimum,maximum;
        System.out.println("Enter the Minimum limit:");
        minimum  = sc.nextInt();
        System.out.println("Enter the Maximum Limit:");
        maximum = sc.nextInt();

        System.out.println("The armstrong Number between " +minimum +" and " +maximum +" is: ");

        arr1 = A.armstrongNumberInRange(minimum,maximum);

        for(int i = 0; arr1[i] !=0 ;i++){
            System.out.print(arr1[i]);
            System.out.println("\n");
        }
    }
}
