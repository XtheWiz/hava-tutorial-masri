package com.ws.javamasri.oop.financialexample;

public class MutualFunds extends ShareAsset implements Asset {

    private double totalShares;

    public MutualFunds(String symbol, double currentPrice) {
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

    public void purchases(double shares, double pricePerShare) {
        totalShares += shares;
        addCost(shares * pricePerShare);
    }
}
