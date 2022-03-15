class Solution {
    public void sortColors(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
        int n = nums.length;  
        int temp = 0;  
         for(int i=0; i < n; i++){  
                 for(int j=1; j < (n-i); j++){  
                          if(nums[j-1] > nums[j]){    
                                 temp = nums[j-1];  
                                 nums[j-1] = nums[j];  
                                 nums[j] = temp;  
                         }  
                          
                 } 
        
    }
        for(int i=0; i<n; i++) {
            arr.add(nums[i]);
            
        }
        System.out.print(arr);

    }
    
}