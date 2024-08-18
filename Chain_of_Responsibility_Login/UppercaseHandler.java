package Chain_of_Responsibility_Login;

public class UppercaseHandler extends AbstractHandler {
    @Override
    public String handle(String login, String password) {
        if (!password.matches(".*[A-Z].*")) {
            return "A senha deve conter pelo menos uma letra maiúscula.";
        }
        return super.handle(login, password);
    }
}
