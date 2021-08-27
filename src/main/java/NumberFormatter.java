/**
 * This class implements logic that converts
 * a string integer value to a numeric format
 */

public class NumberFormatter {

    public static void main(String[] args) {
        System.out.println(parseInt(""));
    }

    /**
     * In this method, the string is converted to a number using ASCII
     * In ASCII '0' = 48.
     * @param str = input string
     */
    public static int parseInt(String str) {
        if (str.length() > Integer.MAX_VALUE - 1 || str.length() < 2) {
            System.out.println("Incorrect input. Length of the input string must be 2 or more, but less than 2^32-1");
            System.exit(0);
        }
        if (str.startsWith("+")) {
            return methodForCycle(str);
        } else if (str.startsWith("-")) {
            return -methodForCycle(str);
        } else {
            char[] arrayOfStr = str.toCharArray();
            int result = 0;
            int firstNumberInAscii = '0';
            for (char c : arrayOfStr) {
                result = (result * 10) + ((int) c - firstNumberInAscii);
            }
            return result;
        }
    }

    /**
     * This method is designed to avoid duplicating the loop in method parseInt.
     * @param str = input string
     */
    public static int methodForCycle(String str) {
        String stringWithoutSign = str.substring(1);
        char[] arrayOfStr = stringWithoutSign.toCharArray();
        int result = 0;
        int firstNumberInAscii = '0';
        for (char c : arrayOfStr) {
            result = (result * 10) + ((int) c - firstNumberInAscii);
        }
        return result;
    }
}

