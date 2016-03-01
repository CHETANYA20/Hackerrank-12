//https://www.hackerrank.com/challenges/runningtime

import java.util.Scanner;
import java.util.Arrays;


public class Solution { 
    public static void main(String arg[]){
        Scanner kb = new Scanner(System.in);
        int tt = kb.nextInt(),arr[] = new int[tt],i,x,emp,j;
        for(i = 0;i<tt;i++){
            arr[i] = kb.nextInt();
        }
        int cnt=0;
        for(i = 1;i<arr.length;i++){
            emp = arr[i];
            x = i-1;
        
            while(x>=0 && arr[x]>emp){
                arr[x+1] = arr[x];
                cnt++;
                x--;
               

            }
            arr[x+1] = emp;
           
               
        }
         System.out.println(cnt); 
       
            
    }
    
    
}
