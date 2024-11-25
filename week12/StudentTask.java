public class StudentTask {
    private String name;
    public StudentTask(String name){
        this.name = name;
    }
    public StudentTask(){
        this("Irfan");
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public static void main(String[] args){
        StudentTask student1= new StudentTask();
        StudentTask student2= new StudentTask();
        System.out.println(student1.getName());
        System.out.println(student2.getName());
    }
}
