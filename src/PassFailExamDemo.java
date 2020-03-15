import java.util.Scanner;
public class PassFailExamDemo
{
    public static void main(String[] args)
    {
        int questions;
        int missed;
        double minPassing;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("How many questions are on the exam? ");
        questions = keyboard.nextInt();

        System.out.println("How many questions did the student miss? ");
        missed = keyboard.nextInt();

        System.out.println("What is the minimum passing score? ");
        minPassing = keyboard.nextDouble();

        PassFailExam exam = new PassFailExam(questions, missed, minPassing);
        System.out.println("The exam score is " + exam.getScore());
        System.out.println("The exam grade is " + exam.getGrade());
    }
}
