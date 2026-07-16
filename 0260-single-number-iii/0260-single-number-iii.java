class Solution {
    public int[] singleNumber(int[] nums) {
        ArrayList<Integer>list=new ArrayList<>();
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int num: nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int num: nums){
            if(map.get(num) == 1){
                list.add(num);
            }
        }
        int[] result = new int[list.size()];
        int i=0;
        for(int num: list){
            result[i++] = num;
        }
        return result;
    }
}