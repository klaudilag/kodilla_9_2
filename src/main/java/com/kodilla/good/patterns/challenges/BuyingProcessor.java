package com.kodilla.good.patterns.challenges;

public class BuyingProcessor {
    private ProductRepository productRepository;
    private TransactionService transactionService;
    private InformationService informationService;

    public BuyingProcessor(ProductRepository productRepository, TransactionService transactionService, InformationService informationService) {
        this.productRepository = productRepository;
        this.transactionService = transactionService;
        this.informationService = informationService;
    }
    public TransactionDto process(final BuyRequest buyRequest){
        boolean isBought = transactionService.buy(buyRequest.getUser(),buyRequest.getProduct());
        if(isBought){
            informationService.inform(buyRequest.getUser());
            productRepository.createTransaction(buyRequest.getUser(),buyRequest.getProduct());
            return new TransactionDto(buyRequest.getUser(),buyRequest.getProduct(),true);
        } else {
            return new TransactionDto(buyRequest.getUser(),buyRequest.getProduct(),false);
        }
    }
}
