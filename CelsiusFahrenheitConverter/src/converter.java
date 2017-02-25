import java.io.BufferedReader;	// imports only the packages needed for user input, instead of using java.io.*
import java.io.IOException;
import java.io.InputStreamReader;

class CelciusFahrenheitConverter {	// converter class
	double celcius;	// initializing doubles
	double fahrenheit;

	void CeltoFah() {	// creating a method to be called if user wants to convert celcius
		System.out.println("Your converted celcius degrees is: " + celcius + " degrees fahrenheit.");	// prints out converted degrees, with celcius = converioin.celcius
	}

	void FahtoCel() {	// creating a method to be called if user wants to convert fahrenheit
		System.out.println("Your converted celcius degrees is: " + fahrenheit + " degrees celcius.");	// prints out converted degrees, with fahrenheit = conversion.fahrenheit
	}

}

public class converter {	// main class
	public static void main(String[] args) throws IOException {
		InputStreamReader inStream = new InputStreamReader(System.in);	// declaring and initializing the input details
		BufferedReader stdin = new BufferedReader(inStream);
		String inData; // declares data input String as inData
		double input;  // initializing double

		CelciusFahrenheitConverter conversion = new CelciusFahrenheitConverter();	// creating a new object called conversion

		System.out.println("Are you converting celcius or fahrenheit?");	// asks user what they're inputing 
		inData = stdin.readLine();	// declares inData as the input

		if (inData.equalsIgnoreCase("celcius")) {	// if the user types "celcius" (ignores upper or lower case)
			System.out.println("Please enter the degrees in celcius.");	// asks them to input the degrees
			inData = stdin.readLine();	// declares inData as the input
			input = Double.parseDouble(inData);	// declares int input as the variable double user input
			conversion.celcius = ((9.0 / 5.0) * input + 32);	// conversion.celcius is equal to the conversion formula
			conversion.CeltoFah();	// calls to the method 
		} else if (inData.equalsIgnoreCase("fahrenheit")) {	// if the user types "fahrenheit" (ignore upper or lower case)
			System.out.println("Please enter the degrees in celcius.");	// asks them to input degrees
			inData = stdin.readLine();	// declares inData as the input
			input = Double.parseDouble(inData);	// declares int input as the variable double user input
			conversion.fahrenheit = (5.0 / 9.0) * (input - 32);	// conversion.fahrenheit is equal to the conversion formula
			conversion.FahtoCel();	// calls to the method
		}

	}
}
