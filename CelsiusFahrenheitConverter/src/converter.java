import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class CelciusFahrenheitConverter {
	double celcius;
	double fahrenheit;

	void CeltoFah() {
		System.out.println("Your converted celcius degrees is: " + celcius + " degrees fahrenheit.");
		return;
	}

	void FahtoCel() {
		System.out.println("Your converted celcius degrees is: " + fahrenheit + " degrees celcius.");
		return;
	}

}

public class converter {
	public static void main(String[] args) throws IOException {
		InputStreamReader inStream = new InputStreamReader(System.in);
		BufferedReader stdin = new BufferedReader(inStream);
		String inData; // declares data input String as inData
		double input;

		CelciusFahrenheitConverter conversion = new CelciusFahrenheitConverter();

		System.out.println("Are you converting celcius or fahrenheit");
		inData = stdin.readLine();

		if (inData.equalsIgnoreCase("celcius")) {
			System.out.println("Please enter the degrees in celcius.");
			inData = stdin.readLine();
			input = Double.parseDouble(inData);
			conversion.celcius = ((9.0 / 5.0) * input + 32);
			conversion.CeltoFah();
		} else if (inData.equalsIgnoreCase("fahrenheit")) {
			System.out.println("Please enter the degrees in celcius.");
			inData = stdin.readLine();
			input = Double.parseDouble(inData);
			conversion.fahrenheit = (5.0 / 9.0) * (input - 32);
			conversion.FahtoCel();
		}

	}
}
