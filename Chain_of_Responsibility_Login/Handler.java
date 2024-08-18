package Chain_of_Responsibility_Login;

public interface Handler {
    Handler setNext(Handler handler);
    String handle(String login, String password);
}
