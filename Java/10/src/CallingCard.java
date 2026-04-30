
public class CallingCard extends Card {

    private int cardNum;
    private int pin;

    public CallingCard(String n, int theCardNum, int thePin)
    {
        super(n);
        cardNum = theCardNum;
        pin = thePin;
    }

    public String toString()
    {
        super.toString();
        String str = " Card Number: " + cardNum + " PIN: " + pin;
        return str;
    }
    public boolean isExpired()
    {
        return false;  
    }
    public int getCardNum()
    {
        return cardNum;
    }
    public int getPIN()
    {
        return pin;
    }
    public boolean equals(CallingCard aCard)
    {
        if(this.getCardNum() == aCard.getCardNum() && this.getPIN() == aCard.getPIN())
        { 
            return true;
        } else {
            return false;
        }
    }
}