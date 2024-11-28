import java.util.Scanner;

class Admin {
    private static Scanner sc = new Scanner(System.in);
    private static Admin instance;
    private static final String log = "admin", pass = "admin";
    private Admin(){
        
    }

    private static void authenticate() throws AdminAuthenticationException {
        String login = sc.nextLine();
        String password = sc.nextLine();
        if (!log.equals(login) || !pass.equals(password)) {
            throw new AdminAuthenticationException("Неверный логин или пароль!");
        }
    }
    public static Admin getInstance() throws AdminAuthenticationException {
        if (instance == null) {
            authenticate();  // Проверка логина и пароля
            instance = new Admin();
        }
        return instance;
    }

    public void manageMenu() {
        System.out.println("Управление меню администратора");
    }
}

class AdminAuthenticationException extends Exception{
    public AdminAuthenticationException(String mes){
        super(mes);
    }
}
