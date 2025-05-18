package pers.design.pattern.decorator2;

public class EmailNotiService implements NotiService {
    @Override
    public void send(String message) {
        System.out.println("Sending email: " + message);
    }
}
