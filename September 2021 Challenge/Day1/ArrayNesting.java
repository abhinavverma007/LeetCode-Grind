import java.util.*;
import java.lang.*;
import java.io.*;


class Solution {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int [] nums=new int[n];
        for(int i=0; i<n; i++){
            nums[i]=scn.nextInt();
        }
        System.out.println(arrayNesting(nums));
	}
    
    
    public int arrayNesting(int[] nums) {
        int sz=nums.length;
        boolean[] visited=new boolean[sz];
        int maxsize=0;
        int csize=0;
        
        for(int i=0; i<sz; i++){
            int startindex=i;
            csize=0;
            int newindex=startindex;
            do
            {
                visited[newindex]=true;
                startindex=newindex;
                newindex=nums[startindex];
                csize++;
                
                
            }while(visited[newindex]==false);
            if(csize>maxsize){
                maxsize=csize;
            }
        }
        return maxsize;
        
    }
}