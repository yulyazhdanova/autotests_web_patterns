package ru.training.at.factory;

public class EmailNotification extends NotificationFactory{

    public EmailNotification() {
        super();
    }

    @Override
    public String toString() {
        return "EmailNotification{} " + super.toString();
    }
}
