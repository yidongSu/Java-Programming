public class Task13 {
    public static void main(String[] args) {
        String hexNumber = "AB8C";
        int decimalValue = hexToDecimal(hexNumber);
        System.out.println("The decimal value of the hexadecimal number " + hexNumber + " is: " + decimalValue);
    }

    public static int hexCharToDecimal(char hexChar) {
        if (hexChar >= '0' && hexChar <= '9') {
            return hexChar - '0';
        } else if (hexChar >= 'A' && hexChar <= 'F') {
            return 10 + (hexChar - 'A');
        } else if (hexChar >= 'a' && hexChar <= 'f') {
            return 10 + (hexChar - 'a');
        }
        return 0;
    }

    public static int hexToDecimal(String hexNumber) {
        int decimalValue = 0;
        for (int i = 0; i < hexNumber.length(); i++) {
            char hexChar = hexNumber.charAt(i);
            int decimalCharValue = hexCharToDecimal(hexChar);
            decimalValue = decimalValue * 16 + decimalCharValue;
        }
        return decimalValue;
    }
}