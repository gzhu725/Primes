
public class Sieve {
	
	LinkedQueue<Integer> primes = new LinkedQueue();
	LinkedQueue<Integer> numbers = new LinkedQueue();
	
	public LinkedQueue<Integer> fillWithPrimes(int n) {
		int start = 2;
		while(start<=n) {
			numbers.enqueue(start);
			start++;
		}
		 //2 to 10 is 9 in size
			int p = numbers.first(); //2
			while(p<= Math.sqrt(n)) {
				primes.enqueue(p);
				//primes: 2 3
				numbers.dequeue();
				//numbers: 5 7 9
				int size = numbers.size(); //3
				for(int i = 0; i<size; i++) {
					if(numbers.first() % p == 0) {
						//IS DIVISIBLE
						numbers.dequeue();
					}
					else { 
						//THIS IS NOT DIVISIBLE
						numbers.enqueue(numbers.first());
						//put at the end of numbers
						numbers.dequeue();
						
					}
					
			}
				p = numbers.first();

			}
			while(!numbers.isEmpty()) {
				primes.enqueue(numbers.first());
				numbers.dequeue();
				
			}
			
			return primes;
		}
		
		
	
	
	public void primesTo(int n) {
		//print all the primes from 2 to n
		if(n<2) {
			throw new IllegalArgumentException("Error: Input must be a number greater than 2.");
		}
		System.out.println("Primes up to " + n + " are: " + primes.toString());
		System.out.println();


}
}

