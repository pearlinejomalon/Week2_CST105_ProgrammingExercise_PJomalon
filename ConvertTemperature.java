import java.util.Scanner;

public class ConvertTemperature {

	public static void main(String[] args) {
		
		System.out.print("Enter a Fahrenheit temperature:");
		Scanner scanner=new Scanner(System.in);
		
		float fahrenheit=scanner.nextFloat();
		
		float celsius=(float) ((5 *(fahrenheit - 32.0)) / 9.0);
		System.out.print(fahrenheit + "F" + "is equivalent to" + celsius + "C");
		
		
		System.out.print("Enter a Celsius temperature:");
			
		Scanner scanner1 = new Scanner(System.in);
		float celsius1=scanner1.nextFloat();
			
		float fahrenheit1=(float) ((celsius1*(9.0 / 5) + 32.0));
		System.out.print(celsius1 + "C" + "is equivalent to" + fahrenheit1 + "F");
			
		scanner.close();
		
		}

	}
