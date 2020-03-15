import javax.swing.JOptionPane;
public class ProtectedDemo
{
    public static void main(String[] args)
    {
        String input;
        int questions;
        int missed;

        input = JOptionPane.showInputDialog("How many questions are on the final exam?");
        questions = Integer.parseInt(input);

        input = JOptionPane.showInputDialog("How many questions did the student miss?");
        missed = Integer.parseInt(input);

        FinalExam2 exam = new FinalExam2(questions, missed);

        JOptionPane.showMessageDialog(null, "Each question counts " + exam.getPointsEach() + " points.\nThe exam score is " + exam.getScore() + "Grade: " + exam.getGrade());

        System.exit(0);
    }
}
