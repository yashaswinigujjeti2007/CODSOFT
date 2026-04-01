import java.util.Scanner;

public class Task2_StudentGradeCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("===== Student Grade Calculator =====");

        System.out.print("Enter total number of subjects: ");
        int totalSubjects = input.nextInt();

        int sumOfMarks = 0;

        for (int i = 1; i <= totalSubjects; i++) {
            System.out.print("Enter marks for subject " + i + ": ");
            int subjectMarks = input.nextInt();
            sumOfMarks += subjectMarks;
        }

        double averagePercentage = (double) sumOfMarks / totalSubjects;

        char finalGrade;

        if (averagePercentage >= 90) {
            finalGrade = 'A';
        } else if (averagePercentage >= 80) {
            finalGrade = 'B';
        } else if (averagePercentage >= 70) {
            finalGrade = 'C';
        } else if (averagePercentage >= 60) {
            finalGrade = 'D';
        } else {
            finalGrade = 'F';
        }

        System.out.println("\n===== Result =====");
        System.out.println("Total Marks Obtained: " + sumOfMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Your Final Grade is: " + finalGrade);

        input.close();
    }
}
