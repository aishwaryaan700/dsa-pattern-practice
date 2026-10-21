package arrays;

public class BestTimeToBuyAndSellStock {
    public int BestTime(int prices[]){
    int maxProfit=0;
    int minPrice=Integer.MAX_VALUE;
    for(int price:prices){
        if(price<minPrice){
            minPrice=price;
        }
        int curProfit=minPrice-price;
        if(curProfit>maxProfit){
            maxProfit=curProfit;
        }
    }
    return maxProfit;
}
}