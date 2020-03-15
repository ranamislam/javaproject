public class PolymorphismExample extends GradedActivity
{
    public static void main(String[] args)
    {
        /*
        GradedActivity exam;
        exam = new GradedActivity();
        */

        GradedActivity exam1 = new FinalExam(50, 7);
        GradedActivity exam2 = new PassFailActivity(70);
        GradedActivity exam3 = new PassFailExam(100, 10, 70);
        GradedActivity exam = new PassFailExam(100, 10, 70);

        System.out.println(exam.getScore());
        System.out.println(exam.getGrade());

        System.out.println(exam1);
        System.out.println(exam2);
        System.out.println(exam3);
    }
}
