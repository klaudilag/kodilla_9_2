package com.kodilla.good.patterns.challenges;

public class ProductOrderService {
    public boolean buy(User user, Product product){
        System.out.println("Sprzedano " + product.getName() + " do " + user.getUser() + " " + user.getSurname());
        return true;
    }
}
