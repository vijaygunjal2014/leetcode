class Solution {
    public int distinctAverages(int[] nums) {
       Arrays.sort(nums);
       int i=0;
       int j=nums.length-1;
       HashSet<Double>set=new HashSet<>();
       while(i<j)
       {
        double average=(nums[i]+nums[j])/2.0;
        set.add(average);
        i++;
        j--;
       }
       return set.size();
    }
  }

