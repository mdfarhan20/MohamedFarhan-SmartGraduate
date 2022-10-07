import java.util.Scanner;

public class StudentResult2DArray {
	public static void main(String[] args) {
		int[][] studentResult;
		int numberOfStudents, numberOfSubjects;
		Scanner in = new Scanner(System.in);

		System.out.print("Enter the number of students: ");
		numberOfStudents = in.nextInt();
		System.out.print("Enter the number of subjects: ");
		numberOfSubjects = in.nextInt();

		studentResult = new int[numberOfStudents][numberOfSubjects];

		for (int studentId = 0; studentId < numberOfStudents; studentId++) {
			System.out.print("Enter the marks for Student " + (studentId + 1) + ": ");
			for (int subject = 0; subject < numberOfSubjects; subject++) {
				studentResult[studentId][subject] = in.nextInt();
			}
		}

		for (int studentId = 0; studentId < numberOfStudents; studentId++) {
			System.out.print("Student " + (studentId + 1) + " marks: ");
			for (int subject = 0; subject < numberOfSubjects; subject++) {
				System.out.print(studentResult[studentId][subject] + " "); 
			}
			System.out.println();
		}		
	}
}