package ThiryDaysChallenge.Day12;

import java.util.Scanner;

/**
 * Created by Syed Wajahat on 8/23/2019.
 */
class Student extends Person {
    private int[] testScores;
    private String firstName;
    private String lastName;
    private int id;

    public Student(String firstName, String lastName, int id, int[] testScores) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.testScores = testScores;
    }

    public void printPerson() {
        System.out.println("Name: " + this.lastName + ", " + this.lastName);
        System.out.println("ID: " + this.id);
    }

    public char calculate() {
        char grade = 'T';
        int average = 0;
        int total = 0;
        for (int i : this.testScores) {
            total += i;
        }

        average = total / this.testScores.length;

        if (average >= 90 && average <= 100) {
            grade = 'O';
        } else if (average >= 80 && average < 90) {
            grade = 'E';
        } else if (average >= 70 && average < 80) {
            grade = 'A';
        } else if (average >= 55 && average < 70) {
            grade = 'P';
        } else if (average >= 40 && average < 55) {
            grade = 'D';
        }

        return grade;
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        String lastName = scan.next();
        int id = scan.nextInt();
        int numScores = scan.nextInt();
        int[] testScores = new int[numScores];
        for (int i = 0; i < numScores; i++) {
            testScores[i] = scan.nextInt();
        }
        scan.close();

        Student s = new Student(firstName, lastName, id, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate());
    }
}
