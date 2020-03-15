public class CourseDemo
{
    public static void main(String[] args)
    {
        Instructor myInstrutor = new Instructor("Kramer", "Shawn", "RH3010");
        TextBook myTextBook = new TextBook("Starting Out with Java", "Gaddis", "Pearson");
        Course myCourse = new Course("Intro to Java", myInstrutor, myTextBook);

        System.out.println(myCourse);
    }
}
