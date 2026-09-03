public class AddTwoNumbers {
    
    /**
     * Main method to demonstrate adding two numbers
     */
    public static void main(String[] args) {
        // Method 1: Adding two hardcoded numbers
        int num1 = 10;
        int num2 = 20;
        int sum = num1 + num2;
        
        System.out.println("Method 1: Adding two hardcoded numbers");
        System.out.println(num1 + " + " + num2 + " = " + sum);
        System.out.println();
        
        // Method 2: Adding two numbers from command line arguments
        if (args.length >= 2) {
            try {
                int a = Integer.parseInt(args[0]);
                int b = Integer.parseInt(args[1]);
                int result = a + b;
                
                System.out.println("Method 2: Adding numbers from arguments");
                System.out.println(a + " + " + b + " = " + result);
            } catch (NumberFormatException e) {
                System.out.println("Error: Please provide valid integers as arguments");
            }
        }
        
        // Method 3: Adding floating-point numbers
        double num3 = 15.5;
        double num4 = 24.3;
        double sumDouble = num3 + num4;
        
        System.out.println();
        System.out.println("Method 3: Adding floating-point numbers");
        System.out.println(num3 + " + " + num4 + " = " + sumDouble);
    }
    
    /**
     * Utility method to add two integers
     * @param a first number
     * @param b second number
     * @return sum of a and b
     */
    public static int add(int a, int b) {
        return a + b;
    }
    
    /**
     * Utility method to add two doubles
     * @param a first number
     * @param b second number
     * @return sum of a and b
     */
    public static double add(double a, double b) {
        return a + b;
    }
}