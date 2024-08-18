package Chain_of_Responsibility_Login;

public abstract class AbstractHandler implements Handler {
    private Handler nextHandler;

    @Override
    public Handler setNext(Handler handler) {
        this.nextHandler = handler;
        return handler;
    }

    @Override
    public String handle(String login, String password) {
        if (nextHandler != null) {
            return nextHandler.handle(login, password);
        }
        return null;
    }
}
