import java.util.*;
public class BuyandSellStock {
    public static int Profit(int price[]){

        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < price.length; i++) {
            if(buyPrice < price[i]){ // profit
                int profit = price[i] - buyPrice; // todays profit
                maxProfit = Math.max(maxProfit, profit); // global profit
            }
            else{
                buyPrice = price[i]; //updating buy price to current price
            }
            
        }
        return maxProfit;

    }
    public static void main(String[] args) {
        int price[] = {7,1,5,3,6,4};
        System.out.println(Profit(price));
        
    }
    
}
