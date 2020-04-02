import java.sql.ResultSet;
import java.sql.SQLException;

public class UserRepository {

  public final static DatabaseUtils utils = new DatabaseUtils();

  public static boolean checkUser(String account) throws SQLException {
    String[] accountAndPassword = account.split(":");
    String sql = String.format("SELECT * FROM administrator where name = '%s' AND password = %s;",
            accountAndPassword[0], accountAndPassword[1]);

    ResultSet resultSet = utils.executeSelectStatement(sql);
    return resultSet.next();
  }

  public static ResultSet outputAllValues(String category) throws SQLException {
    String sql;
    if (category.equals("course")) {
      sql = "SELECT DISTINCT course_id, course_name FROM course";
    } else {
      sql = String.format("SELECT id, name, gender, age FROM %s;", category);
    }
    ResultSet resultSet = utils.executeSelectStatement(sql);
    return resultSet;
  }

  public static void insertStudent(String newInfo) {
    String[] infoArray = newInfo.split(":");
    String sql = String.format("INSERT INTO student (id, name, gender, age) VALUES ('%s', '%s', '%s', %d);",
            infoArray[0], infoArray[1], infoArray[2], Integer.parseInt(infoArray[3]));
    utils.executeStatement(sql);
  }

  public static void insertCourse(String newInfo) {
    String[] infoArray = newInfo.split(":");
    String sql = String.format("INSERT INTO course (course_id, course_name) VALUES ('%s', '%s');",
            infoArray[0], infoArray[1]);
    utils.executeStatement(sql);
  }

  public static void updateStudentScore(String newInfo) {
    String[] infoArray = newInfo.split(":");
    String sql = String.format("UPDATE score SET score = %d WHERE course_id = '%s' AND student_id = '%s';",
            Integer.parseInt(infoArray[2]), infoArray[1], infoArray[0]);
    utils.executeStatement(sql);
  }

  public static void deleteValue(String newInfo, String category) {
    String[] infoArray = newInfo.split(":");
    String sql;

    if (category.equals("course")) {
      sql = String.format("DELETE FROM course WHERE course_id = '%s' AND course_name = '%s';",
              infoArray[0], infoArray[1]);
    } else {
      sql = String.format("DELETE FROM %s WHERE id = '%s' AND name = '%s';",
              category, infoArray[0], infoArray[1]);
    }
    utils.executeStatement(sql);
  }
}
