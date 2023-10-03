import java.util.*;

enum Grade {
    O(90, 100),
    A(80, 89),
    B(70, 79),
    C(60, 69),
    D(50, 59),
    F(0, 49);

    private final int lb;
    private final int ub;

    Grade(int lb, int ub) {
        this.lb = lb;
        this.ub = ub;
    }

    public static Grade getGrade(int score) {
        for (Grade grade : Grade.values()) {
            if (score >= grade.lb && score <= grade.ub) {
                return grade;
            }
        }
        return null;
    }
}

public class Grade_Calc {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Total Number of Subjects :");
        int numSubjects = sc.nextInt();

        int[] sub = new int[numSubjects];
        int total = 0;
        int avg;

        System.out.println("Enter Your Marks for 100");
        for (int i = 1; i <= numSubjects; i++) {
            System.out.println("Enter Mark for Subject " +i+ ":");
            sub[i - 1] = sc.nextInt();
            total += sub[i-1];
        }
        avg = total / numSubjects;
        System.out.println("Average Score: " + avg);

        Grade grade = Grade.getGrade(avg);

        if (grade != null) {
            System.out.println("Your Grade is: " + grade);
        } else {
            System.out.println("Invalid score range.");
        }

        sc.close();
    }
}
