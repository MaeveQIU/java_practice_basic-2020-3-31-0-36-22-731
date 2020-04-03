import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Operator {

  private static Scanner scanner = new Scanner(System.in);
  private static Formatter formatter = new Formatter();

  public static void operate(String option) throws SQLException {
    if (option.startsWith("1")) {
      operateSelectStatement(option);
    } else if (option.startsWith("2")) {
      operateInsertStatement(option);
    } else if (option.startsWith("3")) {
      System.out.println(Message.UPDATE_MESSAGE);
      operateUpdateStatement(option);
    } else if (option.startsWith("4")) {
      operateDeleteStatement(option);
    } else {
      System.out.println(Message.OPTION_OUT_OF_RANGE);
    }
  }

  public static void operateSelectStatement(String option) throws SQLException {
    ResultSet resultSet;
    String newInfo;
    switch (option) {
      case "1.1.1":
        resultSet = UserRepository.outputAllValues("student");
        System.out.println(formatter.formatIntoUser(resultSet));
        break;

      case "1.1.2":
        System.out.println(Message.QUERY_STUDENT_SCORE);
        newInfo = scanner.next();
        resultSet = UserRepository.outputStudentScore(newInfo);
        System.out.println(formatter.formatIntoStudentScore(resultSet));
        break;

      case "1.1.3":
        System.out.println(Message.QUERY_TEACHER_INFO);
        newInfo = scanner.next();
        resultSet = UserRepository.outputTeacherAndStudentScore(newInfo);
        System.out.println(formatter.formatIntoTeacherWithStudent(resultSet));
        break;

      case "1.2.1":
        resultSet = UserRepository.outputAllValues("course");
        System.out.println(formatter.formatIntoCourse(resultSet));
        break;

      case "1.2.2":
        System.out.println(Message.QUERY_COURSE_INFO);
        newInfo = scanner.nextLine();
        resultSet = UserRepository.outputUserDefinedValues(newInfo, "course");
        System.out.println(formatter.formatIntoCourse(resultSet));
        break;

      case "1.2.3":
        System.out.println(Message.QUERY_TEACHER_INFO);
        newInfo = scanner.nextLine();
        resultSet = UserRepository.outputCourseForTeacher(newInfo);
        System.out.println(formatter.formatIntoCourseWithTeacher(resultSet));
        break;

      case "1.3.1":
        resultSet = UserRepository.outputAllValues("teacher");
        System.out.println(formatter.formatIntoUser(resultSet));
        break;

      case "1.3.2":
        System.out.println(Message.QUERY_TEACHER_INFO);
        newInfo = scanner.next();
        resultSet = UserRepository.outputUserDefinedValues(newInfo, "teacher");
        System.out.println(formatter.formatIntoUser(resultSet));
        break;

      default:
        System.out.println(Message.OPTION_OUT_OF_RANGE);
    }
  }

  public static void operateInsertStatement(String option) {
    String newInfo;
    switch (option) {
      case "2.1":
        System.out.println(Message.INSERT_STUDENT_MESSAGE);
        newInfo = scanner.next();
        UserRepository.insertStudent(newInfo);
        System.out.println(Message.INSERT_SUCCESS_MESSAGE);
        break;

      case "2.2":
        System.out.println(Message.INSERT_COURSE_MESSAGE);
        newInfo = scanner.nextLine();
        UserRepository.insertCourse(newInfo);
        System.out.println(Message.INSERT_SUCCESS_MESSAGE);
        break;

      default:
        System.out.println(Message.OPTION_OUT_OF_RANGE);
    }
  }

  public static void operateUpdateStatement(String option) {
    if (option.equals("3.1")) {
      String newInfo = scanner.next();
      UserRepository.updateStudentScore(newInfo);
      System.out.println(Message.UPDATE_SUCCESS_MESSAGE);
    } else {
      System.out.println(Message.OPTION_OUT_OF_RANGE);
    }
  }

  public static void operateDeleteStatement(String option) {
    String newInfo;
    switch (option) {
      case "4.1":
        System.out.println(Message.DELETE_STUDENT_MESSAGE);
        newInfo = scanner.next();
        UserRepository.deleteValue(newInfo, "student");
        System.out.println(Message.DELETE_SUCCESS_MESSAGE);
        break;

      case "4.2":
        System.out.println(Message.DELETE_COURSE_MESSAGE);
        newInfo = scanner.nextLine();
        UserRepository.deleteValue(newInfo, "course");
        System.out.println(Message.DELETE_SUCCESS_MESSAGE);
        break;

      case "4.3":
        System.out.println(Message.DELETE_TEACHER_MESSAGE);
        newInfo = scanner.next();
        UserRepository.deleteValue(newInfo, "teacher");
        System.out.println(Message.DELETE_SUCCESS_MESSAGE);
        break;

      default:
        System.out.println(Message.OPTION_OUT_OF_RANGE);
    }
  }
}
