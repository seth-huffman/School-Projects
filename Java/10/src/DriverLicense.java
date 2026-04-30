
public class DriverLicense extends Card {
    
	GregorianCalendar cal = new GregorianCalendar();
    private double expireYr; // yyyy
    public DriverLicense(String n, double theExpireYr)
    {
        super(n);
        expireYr = theExpireYr;
    }
    public String toString()
    {
        super.toString();
        String str = " Expiration year: " + expireYr;
        return str;
    }
    public boolean isExpired()
    {
        if(expireYr < cal.get(Calendar.YEAR))
        {
            return true;
        } else {
            return false;
        }       
    }
}
