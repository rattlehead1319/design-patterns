package Exercises.src.com.codewithmosh.adapter;

import Exercises.src.com.codewithmosh.adapter.Gmail.GmailClient;

public class AdapterDemo {
    public static void main(String[] args) {
        EmailClient emailClient = new EmailClient();
        emailClient.addProvider(new GmailAdapter(new GmailClient()));
        emailClient.downloadEmails();
    }
}
