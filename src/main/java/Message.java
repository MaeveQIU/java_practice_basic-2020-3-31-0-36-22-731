public class Message {

  public static final String WELCOME = "您好，欢迎登陆学生考试系统，请输入您的用户名和密码(用户名:密码)：";
  public static final String SYSTEM_CLOSE = "您不是本系统的用户，系统关闭";
  public static final String OPTION_OUT_OF_RANGE = "请输入范围以内的数字";
  public static final String INSERT_STUDENT_MESSAGE = "请输入学生信息(学号:姓名:性别:年龄)： ";
  public static final String INSERT_COURSE_MESSAGE = "请输入课程信息(课程编号:课程名称)： ";
  public static final String INSERT_SUCCESS_MESSAGE = "信息更新成功";
  public static final String UPDATE_MESSAGE = "请输入学生信息(学号:课程号:成绩)： ";
  public static final String UPDATE_SUCCESS_MESSAGE = "成绩修改成功";
  public static final String DELETE_STUDENT_MESSAGE = "请输入需要删除的学生信息(学号:姓名)： ";
  public static final String DELETE_TEACHER_MESSAGE = "请输入需要删除的老师信息(编号:姓名)： ";
  public static final String DELETE_COURSE_MESSAGE = "请输入需要删除的课程信息(课程编号:课程名称)： ";
  public static final String DELETE_SUCCESS_MESSAGE = "信息删除成功";
  public static final String OPTIONS = "您好，超级管理员，请选择你需要进行的操作：\n" +
          "    1. 查询   \n" +
          "      1.1 查询学生信息以及成绩  \n" +
          "        1.1.1 所有学生信息  \n" +
          "        1.1.2 指定学生姓名的信息以及所有课程的成绩  \n" +
          "        1.1.3 指定老师的所有学生及其成绩  \n" +
          "      1.2 查询课程信息  \n" +
          "        1.2.1 所有课程信息  \n" +
          "        1.2.2 指定课程名称的信息  \n" +
          "        1.2.3 指定老师的所有课程信息   \n" +
          "      1.3 查询老师信息  \n" +
          "        1.3.1 所有老师信息  \n" +
          "        1.3.2 指定老师信息  \n" +
          "    2. 新增  \n" +
          "      2.1 新增学生信息  \n" +
          "      2.2 新增课程信息     \n" +
          "    3. 修改    \n" +
          "      3.1 修改指定学生的成绩  \n" +
          "    4. 删除  \n" +
          "      4.1 删除指定学生  \n" +
          "      4.2 删除指定课程  \n" +
          "      4.3 删除指定老师 ";
}
