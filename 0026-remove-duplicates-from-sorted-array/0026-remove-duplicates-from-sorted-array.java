class Solution {
    public int removeDuplicates(int[] nums) {
   /*     LinkedHashSet<Integer>seen=new LinkedHashSet<>();
     for(int num: nums){
            seen.add(num);
              }
     
       int i=0;
       for(int num: seen){
        nums[i++]=num;
       }
 return seen.size();
     }
     
}  */
int k=0;
for(int i=1;i<nums.length;i++){
        if(nums[i] != nums[k]){
             nums[++k] = nums[i];
        }

    }

return nums.length == 0 ? 0 : k+1;
    }
}
