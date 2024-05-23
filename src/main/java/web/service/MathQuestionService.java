package web.service;

public class MathQuestionService {

    /**
     * Calculate Q1 result (Addition).
     * @param number1
     * @param number2
     * @return
     */
    public static Double q1Addition(String number1, String number2) {
        try {
            return Double.valueOf(number1) + Double.valueOf(number2);
        } catch (NumberFormatException e) {
            return null;
        }
    }

    /**
     * Calculate Q2 result (Subtraction).
     * @param number1
     * @param number2
     * @return
     */
    public static Double q2Subtraction(String number1, String number2) {
        try {
            return Double.valueOf(number1) - Double.valueOf(number2);
        } catch (NumberFormatException e) {
            return null;
        }
    }

    /**
     * Calculate Q3 result (Multiplication).
     * @param number1
     * @param number2
     * @return
     */
    public static Double q3Multiplication(String number1, String number2) {
        try {
            return Double.valueOf(number1) * Double.valueOf(number2);
        } catch (NumberFormatException e) {
            return null;
        }
    }
}
