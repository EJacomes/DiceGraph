import java.util.Scanner;
import java.util.ArrayList;
public class DiceGraph {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("What should be the max amount of numbers you want on each of your dice: ");
        int DiceNum = scan.nextInt();

        Dice Dice1 = new Dice(DiceNum);
        Dice Dice2 = new Dice(DiceNum);

        ArrayList<StoredRolls> DiceIndex = new ArrayList<StoredRolls>();

        int DiceSum = DiceNum * 2;

        //DiceSum will serve as the size of the arraylist 
        for (int i = 0; i < DiceSum; i++)
        {
            
            StoredRolls RollIndex = new StoredRolls(i + 1);

            DiceIndex.add(i, RollIndex);
            
        }

        System.out.print("How many times do you want to roll: ");
        int AmtOfRolls = scan.nextInt();

        int RollSum = 0;

        for (int i = 0; i < AmtOfRolls; i++)
        {
            //sequence where the dice are rolled and the sum will go into the index that represent that sum

            int Roll1 = Dice1.Roll();
            int Roll2 = Dice2.Roll();

            RollSum = Roll1 + Roll2;

            for (int n = 0; n < DiceIndex.size(); n++)
            {
                if (RollSum == DiceIndex.get(n).getRollNum())
                {
                    DiceIndex.get(n).RollRecord();
                }
            }
        }

        for (int j = 0; j < DiceIndex.size(); j++)
        {
            DiceIndex.get(j).RollGraph();

            DiceIndex.get(j).ShowGraphPart();
            
        }

        scan.close();

    }
}

