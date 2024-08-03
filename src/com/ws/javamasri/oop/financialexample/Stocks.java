package com.ws.javamasri.oop.financialexample;

public class Stocks extends ShareAsset {

    private int totalShares;

    public Stocks(String symbol, double currentPrice) {
        super(symbol, currentPrice);

        this.totalShares = 0;
    }

    @Override
    public double getMarketValue() {
        return totalShares * getCurrentPrice();
    }

    @Override
    public double getProfit() {
        return getMarketValue() - getTotalCost();
    }

    public double getTotalShares() {
        return totalShares;
    }

    public void purchase(int share, double pricePerShare) {
        totalShares += share;
        addCost(share * pricePerShare);
    }
}
