public class StoredRolls {
    private int RollNum = 0;
    //counts the amount of time a specific value was rolled 
    private int TimesNumRolled = 0;
    private String Graph = "";
    private String GraphPart;

    public StoredRolls(int NumIden)
    {
        RollNum = NumIden;
    }

    public void RollRecord()
    {
        TimesNumRolled++;
    }

    public void RollGraph()
    {
        for (int i = 0; i < TimesNumRolled; i++)
        {
            Graph = Graph + "|";
        }
    }

    public int getRollNum()
    {
        return RollNum;
    }

    public void ShowGraphPart()
    {
        GraphPart = "Roll " + RollNum + ": " + Graph;

        System.out.println(GraphPart);
    }
}
