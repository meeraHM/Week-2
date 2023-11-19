
public class Number {
	
	  
    public static String classifyNumber(int num) {
        if (num <= 0) {
            return "Invalid number";
        }

        int sum = 0;
        
        // Find the sum of factors
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i; 
            }
        }

        // Compare the sum to the number for classification
        if (sum == num) {
            return "Perfect";
        } else if (sum > num) {
            return "Abundant";
        } else {
            return "Deficient";
        }
    }

    public static void main(String[] args) {
        int numberToCheck = 99; 

        // Classify the number& print result
        String result = classifyNumber(numberToCheck);
        System.out.println(numberToCheck + " is a " + result + " number.");
    }

}
