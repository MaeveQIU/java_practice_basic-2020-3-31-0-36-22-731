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
}
