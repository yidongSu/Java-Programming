public class Course {
    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;
    public Course(String courseName){
    this.courseName = courseName;
    }

    public void addstudent(String student){
    students[numberOfStudents] = student;
    numberOfStudents++;
    }

    public String[] getStudents(){
    return students;
    }
    public int getNumberOfStudents(){
    return numberOfStudents;
    }
    public String getCourseName(){
    return courseName;
    }
    public void dropstudent(String student){
    for (int i= 0; i < numberOfStudents; i++){
    if(students[i].equals(student)){
    for (int k =i +1; k< numberOfStudents;k++){
    students[k -1] = students[k];
    }
    numberOfStudents--;
    break;
    }
    }
}

    void addStudent(String anne_Kennedy) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}