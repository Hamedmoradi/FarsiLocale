
import java.text.NumberFormat;
import java.util.Locale;

public class FarsiLocale {
public static void main(String[] args) {
	Locale locale = new Locale.Builder()
			                .setLanguage("fa")
			                .setRegion("CA")
			                .setVariant("POSIX")
			                .setScript("Latn")
			                .build();
	long number = 123456789L;
	NumberFormat denf = NumberFormat.getInstance(locale);
	System.out.println( denf.format(number) );
	
	
}

}
