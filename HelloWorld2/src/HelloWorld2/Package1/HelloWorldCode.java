package HelloWorld2.Package1;
import java.util.Date;

public class HelloWorldCode {

	public static void main(String[] args) 
	{
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		Date date = new Date();
		System.out.println(dateFormat.format(date));
		System.out.println("Here ye: important announcement");
		System.out.println("Hello, World");
                System.out.println("Hi Alice, Hi Bob");
		System.out.println("Hi Charlie");
		System.out.println("Hi Denise");
		System.out.println("Goodbye");
	}

}

