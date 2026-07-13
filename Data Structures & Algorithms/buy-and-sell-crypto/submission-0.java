class Solution {
    public int maxProfit(int[] prices) {
        int n =0;
        for (int i=0; i<prices.length; i++){
            int b = prices[i];
            for(int j=i+1;j<prices.length;j++){
                int s = prices[j];
                n = Math.max(n,s-b);

            }


        }
        return n;
    }
}
