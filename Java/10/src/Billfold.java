
public class Billfold {

	{
	    Card card1 = new Card();
	    Card card2 = new Card();

	    public Billfold(Card theCard1, Card theCard2)
	    {
	        card1 = theCard1;
	        card2 = theCard2;
	    }

	    public void addCard(Card newCard)
	    {
	        if(card1 == null) {
	            card1.equals(newCard);
	        } else if(card2 == null) {
	            card2.equals(newCard);
	        } else {	          	        }
	    }
	    
	    public String formatCards()
	    {
	        String str = "";
	        str = "[" + card1.toString() + " | " + card2 + "]"; 
	        return str;
	    }
	     
	    public int getExpiredCardCount()
	    {
	        int numExp = 0;
	        if(card1.isExpired() && card2.isExpired()) {
	            numExp = numExp + 2;
	        } else if (card1.isExpired() &&!(card1.isExpired())) {
	            numExp++;
	        } else if (card2.isExpired() && !(card1.isExpired())) {
	            numExp++;
	        } else {
	            numExp = numExp;
	        }
	        return numExp;
	    }
	}

}
