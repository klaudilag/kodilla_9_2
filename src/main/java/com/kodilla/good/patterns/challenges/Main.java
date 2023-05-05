package com.kodilla.good.patterns.challenges;

public class Main {
    public static void main(String[] args) {
        BuyRequestReceiver buyRequestReceiver = new BuyRequestReceiver();
        BuyRequest buyRequest = buyRequestReceiver.buyRequest();
        BuyingProcessor buyingProcessor = new BuyingProcessor(new ProductRepositoryClass(), new ProductBuyingService(),new EmailInformactionService());
        buyingProcessor.process(buyRequest);
    }
}