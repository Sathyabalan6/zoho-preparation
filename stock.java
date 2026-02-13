class Solution {
    public int maxProfit(int[] prices) {
        int count = 0; 
        int a = prices[0];
        for(int i = 1 ; i < prices.length; i++){
            if(prices[i] < a){
                a = prices[i];
            }
            else if ( prices[i] - a > count){
                count = prices[i] - a ; 
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] prices = {7,1,5,3,6,4};
        System.out.println(s.maxProfit(prices));
    }
}