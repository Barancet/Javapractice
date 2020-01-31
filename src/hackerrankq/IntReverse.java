package hackerrankq;

public class IntReverse {

	public static void main(String[] args) {
		System.out.println(reverse(
				341));
		
		System.out.println(Integer.MAX_VALUE);

	}
	public static int reverse(int x) {

		int newint = 0;

		if((x >= Integer.MAX_VALUE / 2) || (x <= Integer.MIN_VALUE / 2)){
			return newint;
		}
		else{
			while(x != 0){

				int temp = x % 10;          
				x = x/10;       
				newint = newint * 10 + temp;
			} 

		}
		return newint;


	}

}
