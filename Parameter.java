public class Parameter {

        public static void main(String[] args) {
            // Calling each method with different numbers of parameters
            printNumber(42);
            printNumbers(1, 2, 3);
            printNumbers(4, 5, 6, 7);
            printNumbers(8, 9, 10, 11, 12);
        }
        
        public static void printNumber(int number) {
            System.out.println("The number is: " + number);
        }
        
        public static void printNumbers(int number1, int number2, int number3) {
            System.out.println("The numbers are: " + number1 + ", " + number2 + ", " + number3);
        }
        
        public static void printNumbers(int number1, int number2, int number3, int number4) {
            System.out.println("The numbers are: " + number1 + ", " + number2 + ", " + number3 + ", " + number4);
        }
        
        public static void printNumbers(int number1, int number2, int number3, int number4, int number5) {
            System.out.println("The numbers are: " + number1 + ", " + number2 + ", " + number3 + ", " + number4 + ", " + number5);
        }
    }
    

