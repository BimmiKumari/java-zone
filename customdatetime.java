package date_time;
import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.LocalTime;
public class Custom_date_time {

	public static void main(String[] args) {
		//to have custom date in format
      LocalDate d1=LocalDate.of(2002, 12, 31);
      //to have custom time in format 
      LocalTime t1=LocalTime.of(18, 40);
      //to have time and ddate both at a time
      LocalDateTime dt1=LocalDateTime.of(d1, t1);
      System.out.println(d1);
      System.out.println(t1);
      System.out.println(dt1);
	}

}
