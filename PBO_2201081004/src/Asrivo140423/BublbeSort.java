/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Asrivo140423;

/**
 *
 * @author Asrivo MKP
 */
import java.util.Scanner;
import java.util.Random;

public class BublbeSort {
    public static void main(String[] args)
    {
        int[] data;
        int n,i,temp,j;
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("Banyak data =");
        n = in.nextInt();
        data = new int[n];
        //mengisi array
        System.out.println("===Isi Array Sebelum Diurutkan===");
        for(i=0;i<n;i++)
        {
            data[i]=rand.nextInt(100)+1;
            System.out.print(data[i]+"\t");
            //int enter = i%10;
            //if(i!=0 && enter==0){
            //System.out.println()
      
        }
        //buble sort
        for(i=0;i<n;i++)
        {
            for(j=n-1;j>=i+1;j--)
            {
                if(data[j]<data[j-1]) //tukar
                {
                    temp = data[j];
                    data[j] = data[j-1];
                    data[j-1] = temp;
                }
            }
        }
        
      System.out.println("\n===Isi Array Setelah Diurutkan===");
        for(i=0;i<n;i++)
        {
            System.out.print(data[i]+"\t");
        }
    }
    
}
