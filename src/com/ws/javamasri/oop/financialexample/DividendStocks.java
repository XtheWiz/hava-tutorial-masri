package com.ws.javamasri.oop.financialexample;

public class DividendStocks extends Stocks {

    private double dividend;

    public DividendStocks(String symbol, double currentPrice) {
        super(symbol, currentPrice);
        this.dividend = 0;
    }

    @Override
    public double getMarketValue() {
        return super.getMarketValue() + dividend;
    }

    public void payDividend(double amountPerShare) {
        dividend += amountPerShare * getTotalShares();
    }
}
