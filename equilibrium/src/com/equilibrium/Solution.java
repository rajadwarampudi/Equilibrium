package com.equilibrium;

public class Solution {
	public int solution(int[] A) {
        // write your code in Java SE 8
		int i = 0;
		int j = A.length-1;
		int leftSum = 0,rightSum = 0;
		while(i < j)
			leftSum += A[i++];
		i = 0;
		while(j>1)
		{
			if(rightSum == leftSum)
				return j;
			else{
				rightSum += A[j];
				leftSum -= A[j-1];
				--j;
			}
			
		}
		return -1;
    }
}
