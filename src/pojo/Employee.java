package pojo;


public class Employee {

    private String name;
    private Integer age;
    private String gender;
    private String mobile;
    private String email;
    private String department;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", department='" + department + '\'' +
                '}';
    }

    public Employee(String name, Integer age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    public Employee(String name, Integer age, String gender, String mobile, String email, String department) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.mobile = mobile;
        this.email = email;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getMobile() {
        return mobile;
    }

    public String getEmail() {
        return email;
    }

    public String getDepartment() {
        return department;
    }
}
