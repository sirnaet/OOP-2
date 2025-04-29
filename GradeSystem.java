public class GradeSystem {
    String name;
    int score;
    String status;

    public static void main(String[] args) {
        GradeSystem student = new GradeSystem();
        student.name = "Dennis Kimani";
        student.score = 85;
        student.status = student.checkGrade(student.score);
        System.out.println("Student Name: " + student.name);
        System.out.println("Grade: " + student.score);
    }

    public String checkGrade(int grade) {
        if (score >= 70 && score <= 100) {
            System.out.println("Grade: A");
        } else if (score >= 60) {
            System.out.println("Grade: B");
        } else if (score >= 50) {
            System.out.println("Grade: C");
        } else if (score >= 40) {
            System.out.println("Grade: D");
        } else if (score >= 0) {
            System.out.println("Grade: F");
        } else {
            System.out.println("Invalid score.");
        }
    return status;
    }
    
}
