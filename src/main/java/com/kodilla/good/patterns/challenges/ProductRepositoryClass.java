package com.kodilla.good.patterns.challenges;

public class ProductRepositoryClass implements ProductRepository{
    public boolean createTransaction(User user, Product product){
        System.out.println("Stworzono transakcję dla użytkownika " + user.getUser() + " i produktu " + product.getName());
        return true;
    }
}
