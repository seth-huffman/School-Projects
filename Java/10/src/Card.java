
public class Card 
{
	   private String name;

	   public Card()
	   {
	      name = "";
	   }

	   public Card(String n)
	   {
	      name = n;
	   }

	   public String getName()
	   {
	      return name;
	   }

	   public boolean isExpired()
	   {
	      return false;
	   }

	   public String format()
	   {
	      return "Card holder: " + name;
	   }
{
    return "Card holder: " + name;
}
 
public boolean equals( Card aCard)
{
    if(this.getName() == aCard.getName())
    {
        return true;
        
    }


