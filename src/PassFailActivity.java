public class PassFailActivity extends GradedActivity
{
    private double minPassingScore;

    public PassFailActivity()
    {

    }

    public PassFailActivity(double mps)
    {
        minPassingScore = mps;
    }

    public char getCode()
    {
        char letterGrade;

        if(super.getScore() >= minPassingScore)
            letterGrade = 'P';
        else
            letterGrade = 'F';

        return letterGrade;
    }
}
