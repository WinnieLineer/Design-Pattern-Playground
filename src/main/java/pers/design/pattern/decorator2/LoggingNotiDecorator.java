package pers.design.pattern.decorator2;

public class LoggingNotiDecorator implements NotiService {

    private final NotiService delegate;

    public LoggingNotiDecorator(NotiService delegate) {
        this.delegate = delegate;
    }

    @Override
    public void send(String message) {
        System.out.println("Logging message: " + message);
        delegate.send(message);  // call the actual service
    }
}

