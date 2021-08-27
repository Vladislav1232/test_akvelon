public class NumberFormatter {

    public static void main(String[] args) {
        System.out.println(parseInt(""));
    }

    public static int parseInt(String str) {
        if (str.isEmpty()) {
            System.out.println("The string cannot be empty");
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

    private static int methodForCycle(String str) {
        String stringWithoutSign = str.substring(1);
        char[] arrayOfStr = stringWithoutSign.toCharArray();
        int result = 0;
        int firstNumberInAscii    = '0';
        for (char c : arrayOfStr) {
            result = (result * 10) + ((int) c - firstNumberInAscii);
        }
        return result;
    }
}

