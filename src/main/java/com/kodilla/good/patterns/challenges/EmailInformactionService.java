package com.kodilla.good.patterns.challenges;

public class EmailInformactionService implements InformationService{
    public void inform(User user){
        System.out.println("gratulujemy panie " + user.getUser() + " Zakupu!");
    }
}
