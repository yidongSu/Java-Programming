public class Task4 {
    public static void main(String[] args){
        System.out.println("The grade is " + getGrade(59.5));
        System.out.println("\nThe grade is " + getGrade(78.5));
    }

    public static char getGrade(double score){
        char grade;
        if(score >= 90)
            grade = 'A';
        else if(score >= 80)
            grade = 'B';
        else if(score >= 70)
            grade = 'C';
        else if(score >= 60)
            grade = 'D';
        else
            grade = 'F';
        return grade;
    }
    
}
