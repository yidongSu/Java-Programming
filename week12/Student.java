public class Student {
    private String name;
    private int age;
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
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
        if (age > 0) {
        this.age = age;
    } else {
        System.out.println("Invalid age");
    }
}
public static void main(String[] args) {
    Student student = new Student("John", 20);
    System.out.println("Name: " + student.getName());
    System.out.println("Age: " + student.getAge());
    student.setName("Jane");
    student.setAge(21);
    student.setAge(-5); 
    System.out.println("New Name: " + student.getName());
    System.out.println("New Age: " + student.getAge());
}
}



