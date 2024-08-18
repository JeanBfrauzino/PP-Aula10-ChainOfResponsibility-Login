package Chain_of_Responsibility_Login;

public class SpecialCharacterHandler extends AbstractHandler {
    @Override
    public String handle(String login, String password) {
        if (!password.matches(".*[@#$%&*].*")) {
            return "A senha deve conter pelo menos um caractere especial.";
        }
        return super.handle(login, password);
    }
}
