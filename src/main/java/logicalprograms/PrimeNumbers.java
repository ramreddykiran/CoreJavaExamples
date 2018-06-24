package logicalprograms;

public class PrimeNumbers {
	public boolean isPrime(int input){
	//	for(int i=2;i<=(input/2);i++){
		for(int i=2;i<=Math.sqrt(input);i++){
			if (input%i==0){
				return false;
			}
		}
			
		return true;
	}
	
	public void printPrimeNumbers(int input1 , int input2){
		
		for (int i=input1; i <= input2; i++ ){
			int j;
			for (j=2; j<i; j++){
			if (i%j==0){
			break;
			}
			}
			if(i == j){
			System.out.print(" "+i);
			}
			}
		
	}
	public static void main(String[] args) {
		
		
		PrimeNumbers primeNumbers = new PrimeNumbers();
	boolean output 	 = primeNumbers.isPrime(7);
	
	if(output==true){
		System.out.println("prime number");
	}else{
		System.out.println("not a prime number");
		
	}
	int n1=11;
	int n2=11;
	if(n2>=n1){
	System.out.println("prime numbers from " + n1  + " to " + n2);
	primeNumbers.printPrimeNumbers(n1, n2);
	}else{
		System.out.println("not valid range . n1 = "  + n1  + "  should be <= n2= " + n2);
	}
	}

}