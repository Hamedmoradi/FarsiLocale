import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Date;
import java.util.Locale;

public class Main {
public static void main(String[] args) {
	
	long number = 5000000L;
	
	
	Locale persianLocale = new Locale.Builder().setLanguage("fa").setRegion("IR")
			                       .setExtension(Locale.UNICODE_LOCALE_EXTENSION, "nu-arab").build();
	Date persianCurrentDate = new Date();
	DateFormat persianDateFormat = DateFormat.getDateInstance(DateFormat.FULL, persianLocale);
	Currency currency = Currency.getInstance(persianLocale);
	NumberFormat persianNumberFormatLocaleCurrency = NumberFormat.getCurrencyInstance(new Locale.Builder().setLanguageTag("fa-IR-u-nu-arab").build());
	System.out.println(SolarCalendar.getCurrentShamsidate());
	
	persianNumberFormatLocaleCurrency.setCurrency(currency.getInstance(persianLocale));
	System.out.println("Date Format in iran Locale: " + persianDateFormat.format(persianCurrentDate));
//	System.out.println(currency.getDisplayName() + " " + "(" + currency.getCurrencyCode() + currency.getSymbol().toString() + ") "
//			                   + " " + persianNumberFormatLocaleCurrency.format(number)+ currency.getDisplayName() );
	System.out.println(persianNumberFormatLocaleCurrency.format(number));
	
}

}
