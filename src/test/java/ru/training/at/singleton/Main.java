package ru.training.at.singleton;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        TransactionLogger transactionLogger = TransactionLogger.getInstance();
        transactionLogger.log("Message");
        TransactionLogger transactionLogger1 = TransactionLogger.getInstance();
    }
}
