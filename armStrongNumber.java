
public class armStrongNumber {
	
	 public static boolean isArmstrong(int number) {
	        
	        String strNum = String.valueOf(number);
	        int length = strNum.length();

	        int sum = 0;
	        int temp = number;

	        // Calculate the sum
	        while (temp > 0) {
	            int digit = temp % 10;
	            sum += Math.pow(digit, length);
	            temp /= 10;
	        }

	        // Check if the sum is equal to the original number
	        return sum == number;
	    }

	    public static void main(String[] args) {
	        int num = 378777; 

	        // Check if it is an Armstrong number & print the result
	        boolean result = isArmstrong(num);
	        if (result) {
	            System.out.println(num + " is an Armstrong number.");
	        } else {
	            System.out.println(num + " is not an Armstrong number.");
	        }

}}
