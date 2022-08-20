class Main {
  public static void main(String[] args) {

  /**
      Given a binary array nums, return the maximum number of consecutive 1's in the array.


    Input: nums = [1,1,0,1,1,1]
    Output: 3
    Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.


  **/

    int[] nums = {1,1,0,1,1,1};

    System.out.println(findMaxConsecutiveOnes(nums));

    /**

      SOLUTION: 
      - 

    **/
  }


  public static int findMaxConsecutiveOnes(int[] nums) {
        
        int count = 0;
        int max_count = Integer.MIN_VALUE;
        
        
        for (int i = 0; i < nums.length; i++)
        {
            
            
            if (nums[i] == 1)
            {
                count++;
            }
            
            if (nums[i] != 1)
            {
                count = 0;   
            }
            
            max_count = Math.max(count, max_count);
        
        }
        
        
        return max_count;
    }
}