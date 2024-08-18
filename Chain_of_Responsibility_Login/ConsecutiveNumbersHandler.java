package Chain_of_Responsibility_Login;

public class ConsecutiveNumbersHandler extends AbstractHandler {
    @Override
    public String handle(String login, String password) {
        if (password.matches(".*\\d{3}.*")) {
            return "A senha não pode conter 3 números consecutivos.";
        }
        return super.handle(login, password);
    }
}
