class Solution {
    public int maxProduct(int n) {
      int[] result = new int[10];
      int i=0;
      while(n > 0){
        result[i] = n % 10;
        i++;
        n = n/10;
      }
    Arrays.sort(result);
    return result[9] * result[8];
    
    }
}