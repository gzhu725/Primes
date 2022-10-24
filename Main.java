
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Sieve newSieve = new Sieve();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter upper bound");
		int n = scanner.nextInt();
		if(n>=2) newSieve.fillWithPrimes(n);
		newSieve.primesTo(n);
		scanner.close();
		
	}
	
	
}
