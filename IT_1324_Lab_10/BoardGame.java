public class BoardGame extends Game 

{
 
  private int numOfPlayers;
  private boolean canTie;
  
  public BoardGame(String newDescription, int newNumOfPlayers, boolean newCanTie)
  
  {
    super(newDescription);
    setNumOfPlayers(newNumOfPlayers);
    setCanTie(newCanTie);
    
   }
   
   public void setNumOfPlayers(int newNumOfPlayers)
   {
     numOfPlayers = newNumOfPlayers;
   }
   
   public void setCanTie(boolean newCanTie)
   {
     canTie = newCanTie;
    }
    
    public int getNumOfPlayers()
    {
      return numOfPlayers;
     }
    
    public boolean getCanTie()
    {
      return canTie;
    }
    
    public String toString()
    {
     return (super.toString() + " The number of players is " + numOfPlayers + " Can it end in a tie? " + canTie);
    }
    
    public boolean equals(Object o)
    {
     if(!(o instanceof BoardGame))
     return false;
     else
     {
     BoardGame bg = (BoardGame) o;
     return (super.equals(bg)&& numOfPlayers == bg.numOfPlayers && canTie == bg.canTie);
     }
    }
    }
    