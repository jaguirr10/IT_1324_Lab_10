public class Game
{
private String description;


public Game(String newDescription)
{
setDescription(newDescription);
}//end constructor

public String getDescription()
{
return description;
}//end getDescription method

public void setDescription(String newDescription)
{
description = newDescription;
}//end setDescription method

public String toString()
{
return ("Description: " +description);
}//end toString method

public boolean equals(Object o)
{
   if(!(o instanceof Game))
   return false;
   else
   {
   Game g = (Game) o;
   return (description.equals(g.description));
   }//end else
}//end equals method
}//end class