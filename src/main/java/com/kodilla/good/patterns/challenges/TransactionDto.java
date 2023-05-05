package com.kodilla.good.patterns.challenges;

public class TransactionDto {
    private User user;
    private Product product;
    private boolean isBought;

    public TransactionDto(User user, Product product, boolean isBought) {
        this.user = user;
        this.product = product;
        this.isBought = isBought;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public boolean isBought() {
        return isBought;
    }
}
