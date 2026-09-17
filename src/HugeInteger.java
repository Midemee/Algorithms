public class HugeInteger {
    private int[] digits = new int[40];

    public void parse(String number) {
        for (int count = 0; count < digits.length; count++) {
            digits[count] = 0;
        }
        int start = 40 - number.length();
        for (int count = 0; count < number.length(); count++) {
            digits[start + count] = number.charAt(count) - '0';
        }
    }

    public String toString() {
        String result = "";
        boolean started = false;
        for (int count = 0; count < digits.length; count++) {
            if (digits[count] != 0) {
                started = true;
            }
            if (started) {
                result += digits[count];
            }
        }
        if (result.equals("")) {
            return "0";
        }
        return result;
    }

    public HugeInteger add(HugeInteger secondNumber) {
        HugeInteger result = new HugeInteger();
        int carry = 0;
        for (int count = 39; count >= 0; count--) {
            int sum = digits[count] + secondNumber.digits[count] + carry;
            result.digits[count] = sum % 10;
            carry = sum / 10;
        }
        return result;
    }

    public HugeInteger subtract(HugeInteger secondNumber) {
        HugeInteger result = new HugeInteger();
        int borrow = 0;
        for (int count = 39; count >= 0; count--) {
            int difference = digits[count] - secondNumber.digits[count] - borrow;
            if (difference < 0) {
                difference = difference + 10;
                borrow = 1;
            } else {
                borrow = 0;
            }
            result.digits[count] = difference;
        }
        return result;
    }

    public boolean isEqualTo(HugeInteger secondNumber) {
        for (int count = 0; count < digits.length; count++) {
            if (digits[count] != secondNumber.digits[count]) {
                return false;
            }
        }
        return true;
    }

    public boolean isNotEqualTo(HugeInteger secondNumber) {
        return !isEqualTo(secondNumber);

    }

    public boolean isGreaterThan(HugeInteger secondNumber) {
        for (int count = 0; count < digits.length; count++) {
            if (digits[count] > secondNumber.digits[count]) {
                return true;
            }
            if (digits[count] < secondNumber.digits[count]) {
                return false;
            }
        }
        return false;
    }

    public boolean isLessThan(HugeInteger secondNumber) {
        for (int count = 0; count < digits.length; count++) {
            if (digits[count] < secondNumber.digits[count]) {
                return true;
            }
            if (digits[count] > secondNumber.digits[count]) {
                return false;
            }
        }
        return false;

    }

    public boolean isGreaterThanOrEqualTo(HugeInteger secondNumber) {
        return isGreaterThan(secondNumber) || isEqualTo(secondNumber);
    }

    public boolean isLessThanOrEqualTo(HugeInteger secondNumber) {
        return isLessThan(secondNumber) || isEqualTo(secondNumber);
    }

    public boolean isZero() {
        for (int count = 0; count < digits.length; count++) {
            if (digits[count] != 0) {
                return false;
            }
        }
        return true;
    }
}