public class CompSciStudent extends Student
{
    private final int MATH_HOURS = 20;
    private final int CS_HOURS = 40;
    private final int GEN_ED_HOURS = 60;

    private int mathHours;
    private int csHours;
    private int genEdHours;

    public CompSciStudent(String n, String id, int year)
    {
        super(n, id, year);
    }

    public void setMathHours(int math)
    {
        mathHours = math;
    }

    public void setCsHours(int cs)
    {
        csHours = cs;
    }

    public void setGenEdHours(int genEd)
    {
        genEdHours = genEd;
    }

    public int getRemainingHours()
    {
        int reqHours, remainingHours;
        reqHours = MATH_HOURS + CS_HOURS + GEN_ED_HOURS;
        remainingHours = reqHours - (mathHours + csHours + genEdHours);

        return remainingHours;
    }

    public String toString()
    {
        String str = super.toString() +
                     "\nMajor: Computer Science" +
                     "\nMath Hours Taken: " + mathHours +
                     "\nGeneral Ed Hours Taken: " + genEdHours;
        return str;
    }
}
