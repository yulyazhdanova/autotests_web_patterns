package ru.training.at.singleton;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TransactionLogger {

    private static TransactionLogger instance;
    private static final String FILE = "C:\\Users\\Zhdanova_Juliya\\Desktop\\back2\\Homework\\src\\test\\resources\\text2.txt";
    private static final DateTimeFormatter FORMAT = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");

    private TransactionLogger() {
    }

    public static TransactionLogger getInstance() {
        if (instance == null) {
            instance = new TransactionLogger();
        }
        return instance;
    }

    public void log(String message) throws IOException {
        String currentTime = LocalDateTime.now().format(FORMAT);
        String log1 = currentTime + " " + message;
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(FILE, true))) {
            bufferedWriter.write(log1);
            bufferedWriter.newLine();
        } catch (IOException ioe) {
            throw new RuntimeException();
        }
        System.out.println(FILE);
    }
}
