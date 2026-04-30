	import java.time.Duration;
	import java.time.Instant;
	import java.time.LocalDateTime;
	import java.time.Period;
	import java.time.ZoneId;
	
public class TimedResponse_Huffman {

	    static final int MINUTES_PER_HOUR = 60;
	    static final int SECONDS_PER_MINUTE = 60;
	    static final int SECONDS_PER_HOUR = SECONDS_PER_MINUTE * MINUTES_PER_HOUR;

	    public static void main(String[] args) {
	        LocalDateTime toDateTime = LocalDateTime.of(2017, 6, 1, 4, 20, 55);
	        LocalDateTime fromDateTime = LocalDateTime.of(1993, 3, 16, 4, 13, 30);

	        Period period = getPeriod(fromDateTime, toDateTime);
	        long time[] = getTime(fromDateTime, toDateTime);

	        System.out.println(period.getYears() + " years " + 
	                period.getMonths() + " months " + 
	                period.getDays() + " days " +
	                time[0] + " hours " +
	                time[1] + " minutes " +
	                time[2] + " seconds.");


	    }

	    private static Period getPeriod(LocalDateTime dob, LocalDateTime now) {
	        return Period.between(dob.toLocalDate(), now.toLocalDate());
	    }

	    private static long[] getTime(LocalDateTime dob, LocalDateTime now) {
	        LocalDateTime today = LocalDateTime.of(now.getYear(),
	                now.getMonthValue(), now.getDayOfMonth(), dob.getHour(), dob.getMinute(), dob.getSecond());
	        Duration duration = Duration.between(today, now);

	        long seconds = duration.getSeconds();

	        long hours = seconds / SECONDS_PER_HOUR;
	        long minutes = ((seconds % SECONDS_PER_HOUR) / SECONDS_PER_MINUTE);
	        long secs = (seconds % SECONDS_PER_MINUTE);

	        return new long[]{hours, minutes, secs};
	    }
	}

	/*Declare two LocalDateTime objects.  
	These objects will hold the exact time before a user is prompted and the exact time after the user responds.  
	Also declare two integers to hold the value of the seconds for both times.  The difference between these two 
	value is the elapsed time between the creations of the two LocalDateTime values.

	Assign the current time into the first LocalDateTime object, 
	and then extract the value of the current seconds field.

	LocalDateTime time1 = LocalDateTime.now();
	int secs1 = time1.getSecond();

	Display a dialog box that asks the user to make a difficult choice.


	JOptionPane.showConfirmDialog(null, "Are you a closet Taylor Swift fan?");

	Next, get the system time immediately after the user responds to the dialog box, 
	and extract its seconds component.


	LocalDateTime time2 = LocalDateTime.now();
	int secs2 = time2.getSecond();

	Compute the difference between the times and display the result in a dialog box.


	JOptionPane.showMessageDialog(null, "End seconds: " + secs2 + "\nStart seconds: " + secs1 + "\nIt took " + 
	difference + " seconds for you to answer.\nWas it a difficult decision?");

	Save and run the program.  When the question appears, ponder for a few seconds and then choose a response.

	The output is only accurate when the first and second LocalDateTime objects are created during the same minute.  
	If the first object is created 58 seconds after a minute starts and the user doesn't respond to the question 
	until 2 seconds after the next minute starts, the difference between the two values will be calculated 
	incrrectly as -56 instead of 4 seconds.  Modify the application to fix this problem.  (Hint, you'll have to use getMinute() too.)

*/
