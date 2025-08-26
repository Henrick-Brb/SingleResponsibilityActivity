public class AccountLogger {
    public void logAccountCreation(String username) {
        // Lógica para registrar a criacao da conta
        if (username.isEmpty()) {
            System.out.println("Usuario nao registrado");
        } else {
            System.out.println("Seja Bem-vindo! " + username);
        }
    }
}
