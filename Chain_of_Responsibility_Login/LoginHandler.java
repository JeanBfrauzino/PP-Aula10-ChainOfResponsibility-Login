package Chain_of_Responsibility_Login;

import java.util.Arrays;
import java.util.List;

public class LoginHandler extends AbstractHandler {
    private List<String> validLogins = Arrays.asList("user1", "user2", "user3");

    @Override
    public String handle(String login, String password) {
        if (!validLogins.contains(login)) {
            return "Login não cadastrado.";
        }
        return super.handle(login, password);
    }
}

