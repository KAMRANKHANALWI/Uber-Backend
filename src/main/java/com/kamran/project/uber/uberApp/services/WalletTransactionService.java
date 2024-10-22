package com.kamran.project.uber.uberApp.services;


import com.kamran.project.uber.uberApp.dto.WalletTransactionDto;
import com.kamran.project.uber.uberApp.entities.WalletTransaction;

public interface WalletTransactionService {
    void createNewWalletTransaction(WalletTransaction walletTransaction);
}
