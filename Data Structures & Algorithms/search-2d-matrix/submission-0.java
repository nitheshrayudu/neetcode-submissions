class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int left = 0;
        int right = matrix.length;

        for(int i=0;i< matrix.length; i++){
            if(isHaving(matrix[i], target)){
                return true;
            }
        }
        return false;

    }

    public boolean isHaving(int[] input,int  target){
        int left =0;
        int right =input.length-1;

        while(left <= right){
            int mid = left + (right-left)/2;

            if(input[mid] == target){
                return true;
            }

            if(input[mid] < target){
                left = mid +1;
            } else {
                right = mid -1;
            }

        }
        return false;
    }
}
