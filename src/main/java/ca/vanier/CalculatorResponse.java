
package ca.vanier;


public class CalculatorResponse {

    /*
     * This class handles all calculations after input object  is sent to it.
     * Depending on the given operation the class will output a specific text based
     * on the operation and two values.
     * 
     */



    // Global Variables
        private String operation;
        private double num1, num2;
    
        public CalculatorResponse() { // Default Constructor
            operation = "";
            num1 = 0;
            num2 = 0;
        }
    
        public CalculatorResponse(String operation, double num1, double num2) { // Constructor
            this.operation = operation;
            this.num1 = num1;
            this.num2 = num2;
        }
    
    // Getters & Setter / Accessor & Mutator
        public String getCalcType() {
            return operation;
        }
    
        public void setCalcType(String operation) {
            this.operation = operation;
        }
    
        public double getNum1() {
            return num1;
        }
    
        public void setNum1(double num1) {
            this.num1 = num1;
        }
    
        public double getNum2() {
            return num2;
        }
    
        public void setNum2(double num2) {
            this.num2 = num2;
        }
    
    // Calculation Code
        public void driver() {
            switch (operation.toUpperCase()) {
            case "SUM":
                double sum = (num1 + num2);
                System.out.println("The result of the " + operation.toUpperCase() + " is: " + sum);
                break;
            case "SUBTRACT":
                double subtract = (num1 - num2);
                System.out.println("The result of the " + operation.toUpperCase() + " is: " + subtract);
                break;
            case "DIVIDE":
                double divide = (num1 / num2);
                System.out.println("The result of the " + operation.toUpperCase() + " is: " + divide);
                break;
            case "MULTIPLY":
                double multiply = (num1 * num2);
                System.out.println("The result of the " + operation.toUpperCase() + " is: " + multiply);
                break;
            default:
                System.out.println("ERROR, operation choice is INVALID");
                break;
            }
        }
    
    // Check for valid operation to be implemented in App
        public static boolean check(String input) {
            
            switch (input.toUpperCase()) {
            case "SUM":
                return true;
            case "SUBTRACT":
                return true;
            case "DIVIDE":
                return true;
            case "MULTIPLY":
                return true;
            default:
                return false;
            }
        }
    
        @Override
        public String toString() { // toString
            return "Calc [operation=" + operation + ", num1=" + num1 + ", num2=" + num2 + "]";
        }
    
    }
    