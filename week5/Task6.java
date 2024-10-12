public class Task6 {
    public static void main(String[] args) {
        char ch = 'B'; 
        
        if (ch >= 'A' && ch <= 'Z') {
            System.out.println(ch + " is an uppercase letter");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println(ch + " is a lowercase letter");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println(ch + " is a numeric character");
        } else {
            System.out.println(ch + " is not a letter or digit");
        }
    }
}