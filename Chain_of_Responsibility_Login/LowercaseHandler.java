package Chain_of_Responsibility_Login;

public class LowercaseHandler extends AbstractHandler {
    @Override
    public String handle(String login, String password) {
        if (!password.matches(".*[a-z].*")) {
            return "A senha deve conter pelo menos uma letra minúscula.";
        }
        return super.handle(login, password);
    }
}

