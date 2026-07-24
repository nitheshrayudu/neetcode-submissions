class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int[] oneWith = null;
        for(int i=0;i<matrix.length;i++){
            if(matrix[i][0] <= target && matrix[i][matrix[i].length-1] >= target){
                oneWith = matrix[i];
            } 
        }
        if(oneWith == null){
            return false;
            // doesnt exist
        }

        return isPresent(oneWith,target);
    }

    public boolean isPresent(int [] ionic, int target){
        int left=0;
        int right = ionic.length-1;

        while(left <= right){
            int mid = left + (right-left) /2;

            if(ionic[mid] == target){
                return true;
            }

            if(ionic[mid] < target){
                left = mid+1;
            } else{
                right = mid -1;
            }
        }
        return false;

    }
}
