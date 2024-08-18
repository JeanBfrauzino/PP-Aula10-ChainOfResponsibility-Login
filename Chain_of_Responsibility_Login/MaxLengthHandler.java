package Chain_of_Responsibility_Login;

public class MaxLengthHandler extends AbstractHandler {
    @Override
    public String handle(String login, String password) {
        if (password.length() > 16) {
            return "A senha não pode ter mais de 16 caracteres.";
        }
        return super.handle(login, password);
    }
}
