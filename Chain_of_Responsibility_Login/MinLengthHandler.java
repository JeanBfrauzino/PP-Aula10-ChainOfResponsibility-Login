package Chain_of_Responsibility_Login;

public class MinLengthHandler extends AbstractHandler {
    @Override
    public String handle(String login, String password) {
        if (password.length() < 8) {
            return "A senha deve ter pelo menos 8 caracteres.";
        }
        return super.handle(login, password);
    }
}
