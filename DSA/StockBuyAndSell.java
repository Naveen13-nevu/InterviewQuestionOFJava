public class StockBuyAndSell {
    public static void main(String[] args) {
        int prices [] = {1200,1400,330,400,500,600};
        int min = prices[0];
        int profit =0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<min)
            {
                min = prices[i];
            }
            else if(prices[i] - min >0){
                profit = prices[i]-min;
            }
        }

        System.out.println(profit);
    }
}
