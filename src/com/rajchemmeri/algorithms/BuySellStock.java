package array;

public class BuySellStock {

	public static void main(String[] args) {
		    int[] prices = new int[] { 7,6,4,3,1 };
		    System.out.println(maxProfit(prices));
	}
	public static int maxProfit(int[] prices) {

		if ( prices == null || prices.length == 0)
			return 0;
		
		int low_buy_price = prices[0];
    
		int max_profit = 0;

		for(int i =0 ;i< prices.length;++i){
    
        if( prices[i] <  low_buy_price){
            low_buy_price = prices[i];
        }

        if( (prices[i] - low_buy_price) >  max_profit){
            max_profit = prices[i] - low_buy_price;
        }
		}
		return max_profit;

	}
}
