//https://www.hackerrank.com/challenges/insertionsort2

import java.util.Scanner;
import java.util.Arrays;


public class Solution { 
    public static void main(String arg[]){
        Scanner kb = new Scanner(System.in);
        int tt = kb.nextInt(),arr[] = new int[tt],i,x,emp,j;
        for(i = 0;i<tt;i++){
            arr[i] = kb.nextInt();
        }
        
        for(i = 1;i<arr.length;i++){
            emp = arr[i];
            x = i-1;
        
            while(x>=0 && arr[x]>emp){
                arr[x+1] = arr[x];
                x--;
               

            }
            arr[x+1] = emp;
             for(j = 0;j<tt;j++){
                    System.out.print(arr[j]+" ");
                }
                System.out.println();
        }
        
       
            
    }
    
    
}
