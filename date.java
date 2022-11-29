package date_time;
import java.time.temporal.ChronoUnit;
import java.time.LocalDate;
import java.time.LocalTime;

public class Future_past_time {

	public static void main(String[] args) {
		
		//TO GO BACK THIS MUCH YEAR BACK
		LocalTime t1= LocalTime.now().minusHours(13);
		//to go this much year forward
		LocalTime t2=LocalTime.now().plusHours(12);
		//to go specified second ,minute,hours
		LocalTime t3=LocalTime.now().minus(10,ChronoUnit.MINUTES);
		  System.out.println(t1);
	      System.out.println(t2);
	      System.out.println(t3);

	}

}

