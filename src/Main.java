import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Importando a classe Scanner
        Scanner scanner = new Scanner(System.in);

        // Importando as classes accountService, accountLogger e emailService
        AccountService accountService = new AccountService();
        AccountLogger accountLogger = new AccountLogger();
        EmailService emailService = new EmailService();

        // Armazenando dados do Usuario
        System.out.println("Digite seu nome: ");
        String username = scanner.next();

        System.out.println("Digite seu melhor email: ");
        String email = scanner.next();

        // Enviando os dados por parametros
        accountService.createAccount(username, email);
        accountLogger.logAccountCreation(username);
        emailService.sendEmailConfirmation(email);

        // Fechando a classe Scanner
        scanner.close();
    }
}
