//Best time to buy and sell stock
//sliding window approach
class Solution {
    public int maxProfit(int[] prices) {
        int l=0;
        int r=1;
        int maxp=0;
        while(r<prices.length){
            if(prices[l]<prices[r]){
                int profit=prices[r]-prices[l];
                maxp=Integer.max(maxp,profit);
            }
            else l=r;
            r+=1;
        }
        return maxp;
    }
}
