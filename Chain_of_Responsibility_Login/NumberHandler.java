package Chain_of_Responsibility_Login;

public class NumberHandler extends AbstractHandler {
    @Override
    public String handle(String login, String password) {
        if (!password.matches(".*\\d.*")) {
            return "A senha deve conter pelo menos um número.";
        }
        return super.handle(login, password);
    }
}
