package date_time;
import java.time.Period;
import java.time.LocalDate;

public class Date_difference {
       //for date difference we use PERIOD
	public static void main(String[] args) {
		 LocalDate d1=LocalDate.of(2001, 9, 16);
		 Period p=Period.between(d1,LocalDate.now());
		 System.out.println("differnce in years"+p.getYears()+"and in months"+p.getMonths()+"difference in days"+p.getDays());
		//or
		 System.out.println(p);
		 //difference only in form of months
		 System.out.println(p.toTotalMonths());
	}

}

