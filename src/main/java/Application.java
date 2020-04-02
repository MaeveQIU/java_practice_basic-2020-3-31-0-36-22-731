import java.sql.SQLException;
import java.util.Scanner;

public class Application {

  public static void main(String[] args) throws SQLException {
    Scanner scanner = new Scanner(System.in);
    System.out.println(Message.WELCOME);

    String account = scanner.next();
    boolean isUserExist = UserRepository.checkUser(account);
    if (isUserExist) {
      System.out.println(Message.OPTIONS);
      String option = scanner.next();
      Operator.operate(option);
    } else {
      System.out.println(Message.SYSTEM_CLOSE);
    }
    scanner.close();
  }
}
