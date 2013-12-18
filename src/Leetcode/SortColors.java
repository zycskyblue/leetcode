package Leetcode;

public class SortColors {
    public void sortColors(int[] A) {
        int left = 0, right = A.length-1, temp;
        while(left <= right){
            if(A[left] == 0)
                left++;
            else{
                temp = A[right];
                A[right] = A[left];
                A[left] = temp;
                right--;
            }
        }
        right = A.length - 1;
        while(left <= right){
            if(A[left] == 1)
                left++;
            else{
                temp = A[right];
                A[right] = A[left];
                A[left] = temp;
                right--;
            }
        }
    }	
}
