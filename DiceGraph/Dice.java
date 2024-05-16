import java.util.Random;
public class Dice {
    private int Max = 0;
    private int Min = 1;
    Random Dice = new Random();
    private int roll = 0;

    public Dice(int AmtNums)
    {
        Max = AmtNums;
    }

    public int Roll()
    {
        //ensures that the roll has the value of n + 1
        roll = Dice.nextInt(Max) + Min;

        return roll;
    }

}
