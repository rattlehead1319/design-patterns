package Exercises.src.com.codewithmosh.adapter;

import Exercises.src.com.codewithmosh.adapter.Gmail.GmailClient;

public class GmailAdapter implements EmailProvider {
    GmailClient gmailClient;
    public GmailAdapter(GmailClient gmailClient) {
        this.gmailClient = gmailClient;
    }

    @Override
    public void downloadEmails() {
        gmailClient.connect();
        gmailClient.getEmails();
        gmailClient.disconnect();
    }
}
