
//program to replace element with greatest element on its right leetcode.

import java.util.*;
import java.util.Scanner;

public class replacegreatest {
    
    public static void main(String args[]){
    int max=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array:");
        int n = sc.nextInt();
        int [] arr = new int[n];
       for(int i=0;i<n;i++){
        arr[i]= sc.nextInt();
       }
     
       for(int i=0;i<n;i++){
        System.out.println(" "+ arr[i]);
       }
       
       for(int i=0;i<n-1;i++){
        max = arr[i+1];
        for(int j=i+1;j<n;j++){
            
            if(arr[j]>max){
                max = arr[j];
                
            }
          

           }
           arr[i]=max; 
        
       }
       arr[n-1]=-1;
       for(int i=0;i<n;i++){
        System.out.println( arr[i]);
       }
       
    }
}
