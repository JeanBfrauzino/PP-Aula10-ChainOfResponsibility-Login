package Chain_of_Responsibility_Login;

public class Main {
    public static void main(String[] args) {
        Handler loginHandler = new LoginHandler();
        loginHandler.setNext(new UppercaseHandler())
                    .setNext(new LowercaseHandler())
                    .setNext(new SpecialCharacterHandler())
                    .setNext(new NumberHandler())
                    .setNext(new ConsecutiveNumbersHandler())
                    .setNext(new MinLengthHandler())
                    .setNext(new MaxLengthHandler());

        String login = "user1";
        String password = "Abc123@";

        String result = loginHandler.handle(login, password);

        if (result != null) {
            System.out.println(result);  // Exibe a primeira falha encontrada
        } else {
            System.out.println("Login e senha válidos!");
        }
    }
}

