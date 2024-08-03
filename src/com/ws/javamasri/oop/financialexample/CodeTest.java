package com.ws.javamasri.oop.financialexample;

public class CodeTest {

    public static void main(String[] args) {

        // Classes: Stocks, DividendStocks, MutualFund, Cash
        // Relation: DividendStocks is-a Stocks

        Asset amzn = new MutualFunds("AMZN", 300);
        System.out.println(amzn.getMarketValue());
    }

}
