package Solutions.src.com.codewithmosh.adapter;


import Exercises.src.com.codewithmosh.adapter.Gmail.GmailClient;

public class GmailAdapter implements EmailProvider {
  private GmailClient client = new GmailClient();

  @Override
  public void downloadEmails() {
    client.connect();
    client.getEmails();
    client.disconnect();
  }
}
