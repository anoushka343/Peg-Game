public class Board
{
    private String[] array = new String[15];
    
    public Board()
    {
        array[0] = "o";
        array[1] = "x";
        array[2] = "x";
        array[3] = "x";
        array[4] = "x";
        array[5] = "x";
        array[6] = "x";
        array[7] = "x";
        array[8] = "x";
        array[9] = "x";
        array[10] = "x";
        array[11] = "x";
        array[12] = "x";
        array[13] = "x";
        array[14] = "x";
    }
    
    public String getPosition(int inPos)
    {
        return array[inPos];
    }
    
    public void setPosition(int inPos, String inValue)
    {
        array[inPos] = inValue;
    }
}
