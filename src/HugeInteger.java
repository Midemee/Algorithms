public class HugeInteger {

    private static final int SIZE = 40;
    private int[] digits = new int[SIZE];


    public void parse(String value) {

        for (int index = 0; index < digits.length; index++) {
            digits[index] = 0;
        }
        int arrayIndex = digits.length - value.length();

        for (int index = 0; index < value.length(); index++) {
            digits[arrayIndex + index] = Character.getNumericValue(value.charAt(index));
        }
    }


    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        boolean leadingZero = true;
        for (int digit : digits) {
            if (digit != 0) {
                leadingZero = false;
            }
            if (!leadingZero) {
                result.append(digit);
            }
        }
        if (leadingZero) {
            return "0";
        }
        return result.toString();
    }


    public HugeInteger add(HugeInteger otherNumber) {
        HugeInteger result = new HugeInteger();
        int leftOver = 0;

        for (int index = SIZE - 1; index >= 0; index--) {
            int columnSum = digits[index] + otherNumber.digits[index] + leftOver;
            result.digits[index] = columnSum % 10;
            leftOver = columnSum / 10;
        }
        return result;
    }


    public HugeInteger subtract(HugeInteger otherNumber) {
        HugeInteger result = new HugeInteger();
        int borrow = 0;

        for (int index = SIZE - 1; index >= 0; index--) {
            int columnDifference = digits[index] - otherNumber.digits[index] - borrow;
            if (columnDifference < 0) {
                columnDifference += 10;
                borrow = 1;
            } else {
                borrow = 0;
            }
            result.digits[index] = columnDifference;
        }
        return result;
    }


    public boolean isEqualTo(HugeInteger otherNumber) {
        for (int index = 0; index < digits.length; index++) {
            if (digits[index] != otherNumber.digits[index]) {
                return false;
            }
        }

        return true;
    }


    public boolean isNotEqualTo(HugeInteger otherNumber) {
        return !isEqualTo(otherNumber);
    }

    public boolean isGreaterThan(HugeInteger otherNumber) {

        for (int index = 0; index < digits.length; index++) {
            if (digits[index] > otherNumber.digits[index]) {
                return true;
            }
            if (digits[index] < otherNumber.digits[index]) {
                return false;
            }
        }
        return false;
    }


    public boolean isLessThan(HugeInteger otherNumber) {
        for (int index = 0; index < digits.length; index++) {
            if (digits[index] < otherNumber.digits[index]) {
                return true;
            }
            if (digits[index] > otherNumber.digits[index]) {
                return false;
            }
        }

        return false;
    }


    public boolean isGreaterThanOrEqualTo(HugeInteger otherNumber) {

        return isGreaterThan(otherNumber) || isEqualTo(otherNumber);
    }

    public boolean isLessThanOrEqualTo(HugeInteger otherNumber) {

        return isLessThan(otherNumber) || isEqualTo(otherNumber);
    }

    public boolean isZero() {
        for (int digit : digits) {
            if (digit != 0) {
                return false;
            }
        }
        return true;
    }
}