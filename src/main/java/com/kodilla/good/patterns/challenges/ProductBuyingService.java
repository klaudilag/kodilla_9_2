package com.kodilla.good.patterns.challenges;

public class ProductBuyingService implements TransactionService{
    public boolean buy(User user, Product product){
        System.out.println("Użytkownik " + user.getUser() + " zakupił produkt " + product.getName() + " o id: " + product.getId());
        return true;
    }
}
