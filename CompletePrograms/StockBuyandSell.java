public class StockBuyandSell{

    public static void main(String[] args) {
        
        int prices[] = {1,2,4,-6,3,4,6};
        int min = prices[0];
        int profit =0;

        for(int i=0;i<prices.length;i++){
            if(prices[i]<min){
                min = prices[i];
            }
            int currentProfit = prices[i] -min;
            if(currentProfit>profit){
                profit = currentProfit;
            }
        }
        System.out.println("the  profit is: "+ profit);

    }
}