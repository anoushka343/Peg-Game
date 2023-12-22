public class Rules
{
    private boolean valid;
    private int start;
    private int end;
    public Rules()
    {
        valid = false;
    }
    
    public boolean isValidMove(int start, int end)
    {
        if(start == 0)
        {
            end = 3;
            end = 5;
        }
        if(start == 1)
        {
            end = 6;
            end = 8;
        }
        if(start == 2)
        {
            end = 9;
            end = 7;
        }
        if(start == 3)
        {
            end = 10;
            end = 12;
        }
        if(start == 4)
        {
            end = 13;
            end = 11;
        }
        if(start == 5)
        {
            end = 14;
            end = 12;
        }
        if(start == 6)
        {
            end = 8;
        }
        if(start == 7)
        {
            end = 9;
        }
        if(start == 8)
        {
            end = 6;
        }
        if(start == 9)
        {
            end = 7;
        }
        if(start == 10)
        {
            end = 3;
            end = 12;
        }
        if(start == 11)
        {
            end = 4;
            end = 13;
        }
        if(start == 12)
        {
            end = 5;
            end = 14;
        }
        if(start == 13)
        {
            end = 11;
            end = 4;
        }
        if(start == 14)
        {
            end = 12;
            end = 5;
        }
        return true;
    }
    
    public boolean canMove()
    {
        if(isValidMove() == true)
        {
            return true;
        }
    }
    
    public boolean makeMove()
    {
        if(isValidMove() && canMove() == true)
        {
            return true;
        }
    }
    
    public boolean isWinner(Board b)
    {
        for(int i = 0; i < Board.length; i++)
        {
            if(b.getPosition(i) = 1)
            { return true;
            }
            if(b.getPosition(i) > 1)
            {
                return false;
            }
        }
    }
    
    public bolean isLoser (Board B)
    {
        for(int i = 0; i < Board.length; i++)
        {
            if(b.getPosition(i) > 1)
            {
                return true;
            }
        }
    }
        
}
