import java.sql.ResultSet;
import java.sql.SQLException;

public class Formatter {

  public String formatIntoUser(ResultSet set) throws SQLException {
    StringBuilder result = new StringBuilder();

    while (set.next()) {
      result.append(String.format("编号：%s，姓名： %s, 年龄： %d, 性别： %s\n",
              set.getString("id"),
              set.getString("name"),
              set.getInt("age"),
              set.getString("gender")));
    }
    return result.toString();
  }

  public String formatIntoCourse(ResultSet set) throws SQLException {
    StringBuilder result = new StringBuilder();

    while (set.next()) {
      result.append(String.format("课程编号：%s，课程： %s\n",
              set.getString("course_id"),
              set.getString("course_name")));
    }
    return result.toString();
  }

  public String formatIntoStudentScore(ResultSet set) throws SQLException {
    StringBuilder result = new StringBuilder();

    while (set.next()) {
      result.append(String.format("学生姓名：%s，课程： %s，成绩：%d\n",
              set.getString("name"),
              set.getString("course_name"),
              set.getInt("score")));
    }
    return result.toString();
  }

  public String formatIntoCourseWithTeacher(ResultSet set) throws SQLException {
    StringBuilder result = new StringBuilder();

    while (set.next()) {
      result.append(String.format("老师姓名：%s，课程名称： %s\n",
              set.getString("name"),
              set.getString("course_name")));
    }
    return result.toString();
  }

  public String formatIntoTeacherWithStudent(ResultSet set) throws SQLException {
    StringBuilder result = new StringBuilder();

    while (set.next()) {
      result.append(String.format("老师姓名：%s，学生姓名：%s，学生分数：%d\n",
              set.getString("name"),
              set.getString("student_name"),
              set.getInt("score")));
    }
    return result.toString();
  }
}
