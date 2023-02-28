package life.liquide.utils;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class TestUtil {

	public LocalDate getFutureDate() {
		LocalDate futureDate = LocalDate.now().plusMonths(1);
		return futureDate;
	}

	public String getCurrentDate() {
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date();
		System.out.println(formatter.format(date));
		String dateValue = formatter.format(date);
		return dateValue;
	}

	public String nextDate() {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		String formattedDate = sdf.format(date);
		System.out.println(formattedDate);
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DAY_OF_YEAR, 1);
		Date futureDateTime = calendar.getTime();
		String formattedFutureDate = sdf.format(futureDateTime);
		System.out.println(formattedFutureDate);
		return formattedFutureDate;
	}

	


}
