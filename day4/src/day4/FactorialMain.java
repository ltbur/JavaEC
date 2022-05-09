package day4;

public class FactorialMain {

	public static void main(String[] args) {
		int n = 5;
		int result = factorial(n);
System.out.println(result);

System.out.println(factorial1(n));
	}
	static int factorial(int n){
		/*
		int ans = n;
		int i = 0;
		while(true) {
			ans *= (n - i);
			i++;
			if(n >= i) {
				break;
			}
		}
		return ans;
		*/

		int result = n;
		for(int i = n-1; i > 0; i--) {
			result *= i;
		}
		return result;


	}
	static int factorial1(int n) {
		if(n == 1) {
			return n;

		}
		return n * factorial1(n-1);
	}


}
