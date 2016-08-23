/*
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution.

Example:
Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
*/


import java.util.*;
import java.lang.Integer;

public class Solution
{
    public int[] twoSum(int[] numbers, int target)
    {
        HashMap <Integer, Integer> map = new HashMap <Integer, Integer>();
        int[] result = new int[2];
    
        for(int i=0;i < numbers.length;i++)
        {
            if (map.containsKey(target-numbers[i]))
            {
                result[0]= map.get(target-numbers[i]);
                result[1]= i;
                break;
            }else{
                     map.put(numbers[i],i);
                 }		
        //:System.out.println(i);
        }
        return result;
}
    public static void main(String[] args)
    {
        Solution s = new Solution();
        int[] numbers = {2,7,11,19};
        int target = 30;  
        int[] result = s.twoSum(numbers,target);
        System.out.println(Arrays.toString(result));
    }
}
