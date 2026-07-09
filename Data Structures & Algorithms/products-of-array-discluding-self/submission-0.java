class Solution {
    public int[] productExceptSelf(int[] nums) {

        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        int[] output = new int[nums.length];

        // Easy way, get product
        left[0] = 1;
        System.out.println(left[0]);
        for(int i=1; i< nums.length; i++){
            left[i] = left[i-1] * nums[i-1];
            System.out.println(left[i]);
        }
        right[nums.length-1] =1;
        for(int j=nums.length-2; j>= 0; j--){
             right[j] = right[j+1] * nums[j+1];
             System.out.println(right[j]);
        }

         for (int k = 0; k < nums.length; k++) {
            output[k] = left[k] * right[k];
        }
        
        return output;
    }
}  
