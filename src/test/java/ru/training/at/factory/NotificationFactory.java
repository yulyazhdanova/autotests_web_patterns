package ru.training.at.factory;

public class NotificationFactory implements Notification {

    public NotificationFactory() {
    }

    @Override
    public void send(String message) {
        System.out.println(message);
    }
    public static Notification createNotification(String type){
        switch (type.toLowerCase()) {
            case "email":
                System.out.println("Отправлен email");
                return new EmailNotification();
            case "sms":
                System.out.println("Отправлен sms");
                return new SmsNotification();
            case "push":
                System.out.println("Отправлен push");
                return new PushNotification();
            default:
                throw new IllegalArgumentException("Неизвестный тип уведомления");
        }
    }

    @Override
    public String toString() {
        return "создан";
    }
}
