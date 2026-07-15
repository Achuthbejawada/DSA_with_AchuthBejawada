class Solution {
    public int gcdOfOddEvenSums(int n) {
        int oddsum = n * n;
        int evensum = n * (n + 1);

        return gcdof(oddsum, evensum);
    }

    static int gcdof(int a, int b) {
        if (b == 0)
            return a;
        return gcdof(b, a % b);
    }
}