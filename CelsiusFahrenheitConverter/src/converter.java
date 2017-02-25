import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class CelciusFahrenheitConverter {
	double celcius;
	double fahrenheit;
	
	
	void CeltoFah() {
		fahrenheit = ((9.0 / 5.0) * celcius + 32);
	}
	
	void FahtoCel() {
		celcius  = (5.0 / 9.0) * (fahrenheit - 32);
	}
	
	
	
	
	
	
}
	








public class converter {
	public static void main(String[] args) throws IOException {
		InputStreamReader inStream = new InputStreamReader(System.in);
		BufferedReader stdin = new BufferedReader(inStream);
		String inData;	// declares data input String as inData
		int input;
		
		CelciusFahrenheitConverter conversion = new CelciusFahrenheitConverter();
		
		System.out.println("Are you converting celcius or fahrenheit");
		inData = stdin.readLine();
			
		
		if(inData.equalsIgnoreCase("celcius")) {
			System.out.println("Please enter the degrees in celcius.");
			inData = stdin.readLine();
			conversion.celcius = Integer.parseInt(inData);
			
			conversion.CeltoFah();
		} else if(inData == "fahrenheit") {
			System.out.println("Please enter the degrees in celcius.");
			input = Integer.parseInt(inData);
			conversion.fahrenheit = Integer.parseInt(inData);
			conversion.FahtoCel();
		}
		
		
		
		
		
	}
}
