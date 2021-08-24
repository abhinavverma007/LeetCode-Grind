/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class LC128
{
	/*
        Given an unsorted array of integers nums, return the length of the longest consecutive
        elements sequence.

        You must write an algorithm that runs in O(n) time.

 
    */
    
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] nums=new int[n];
        for(int i=0; i<n; i++){
            nums[i]=scn.nextInt();
        }
        System.out.println(longestConsecutive(nums));
	}
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> map=new HashSet<>();
        
        int len=nums.length;
        for(int i=0; i<len; i++){
            map.add(nums[i]);
            
        }
        Queue<Integer> q=new LinkedList<>();
        int currsize=0;
        int maxsize=0;
        for(Integer y: nums){
           // System.out.println("N:"+nums[i]);
            q.add(y);
            currsize=1;
            while(q.isEmpty()==false){
                int top=q.poll();
                map.remove(top);
                int prev=top-1;
                int next=top+1;
                if(map.contains(prev)){
                    currsize+=1;
                    q.add(prev);
                }
                if(map.contains(next)){
                    currsize+=1;
                    q.add(next);
                }
            }
            if(currsize>maxsize){
                maxsize=currsize;
            }
            
        }
        return maxsize;
        
    }
        
        
    
}