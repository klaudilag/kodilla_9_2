package com.kodilla.good.patterns.challenges;

public class BuyRequestReceiver {
    public BuyRequest buyRequest() {
        User user = new User("Klaudiusz", "Lagodziński");
        Product product = new Product(1, "Pralka");
        return new BuyRequest(user, product);
    }


}
