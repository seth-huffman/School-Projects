
public class IDCard extends Card {
	     private int idNum;


	     public IDCard(String n, int theIdNum)
	     {
	            super(n);
	            idNum = theIdNum;
	     }


	     public String toString()
	     {
	            super.toString();
	            String str = " ID number: " + idNum;
	            return str;
	            
	     }
	     
	     public boolean isExpired()
	     {
	            return false;  
	     }
	     
	     public int getId()
	     {
	            return idNum;
	     }
	     
	     public boolean equals(IDCard aCard)
	     {

	            if(this.getId() == aCard.getId())
	            { 
	                 return true;
	            } else {
	                 return false;
	            }
	     }
	}

}
