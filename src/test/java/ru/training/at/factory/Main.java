package ru.training.at.factory;

public class Main {

    public static void main(String[] args) {

        Notification notification = NotificationFactory.createNotification("push");
        notification.send("Ваш платёж прошёл успешно.");
        System.out.println(notification);
    }
}
