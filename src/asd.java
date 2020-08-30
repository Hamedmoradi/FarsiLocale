import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class asd {
public static void main(String[] args) {
	Locale locale = new Locale.Builder()
			                .setLanguage("fa")
			                .setRegion("IRAN")
			                .setVariant("POSIX")
			                .setScript("Latn")
			                .build();
	long number = 123456789L;
	NumberFormat denf = NumberFormat.getInstance(locale);
	System.out.println( denf.format(number) );
	
	
}

}
