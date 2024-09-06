class Person {

  private String name;
  private int age;

  public String getName() {
      return name;
  }

  public void setName(String name) {
      this.name = name;
  }

  public int getAge() {
      return age;
  }

  public void setAge(int age) {
      this.age = age;
  }
}

class Employee extends Person {
  private String employeeId;
  private String department;

  public String getEmployeeId() {
      return employeeId;
  }

  public void setEmployeeId(String employeeId) {
      this.employeeId = employeeId;
  }

  public String getDepartment() {
      return department;
  }

  public void setDepartment(String department) {
      this.department = department;
  }
}

public class single_inheritance {
  public static void main(String[] args) {

      Employee obj = new Employee();

      obj.setName("John Wick");
      obj.setAge(30);
      obj.setEmployeeId("E69");
      obj.setDepartment("Chairman");

      System.out.println("Name: " + obj.getName());
      System.out.println("Age: " + obj.getAge());
      System.out.println("Employee ID: " + obj.getEmployeeId());
      System.out.println("Department: " + obj.getDepartment());
  }
}
