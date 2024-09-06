class Student {
  private String name;
  private int id;
  
  private static int totalStudentsEnrolled = 0;

  public Student(String name, int id) {
      this.name = name;
      this.id = id;
      totalStudentsEnrolled++;
  }

  public static int getTotalStudentsEnrolled() {
      return totalStudentsEnrolled;
  }
}

class Course {
  private String title;
  private String code;
  
  private static int totalCoursesOffered = 0;

  public Course(String title, String code) {
      this.title = title;
      this.code = code;
      totalCoursesOffered++;
  }

  public static int getTotalCoursesOffered() {
      return totalCoursesOffered;
  }
}

public class univ_mgmt {
  public static void main(String[] args) {
      
      Student student1 = new Student("Shree Prajan", 101);
      Student student2 = new Student("John Wick", 102);

      
      System.out.println("Total Students Enrolled: " + Student.getTotalStudentsEnrolled());

      
      Course course1 = new Course("Mathematics", "MATH101");
      Course course2 = new Course("Physics", "PHYS101");

      
      System.out.println("Total Courses Offered: " + Course.getTotalCoursesOffered());
  }
}
