import java.math.BigInteger;
import java.util.Arrays;

public class HugeInteger {

    private int[] numberList = new int[40];

    public HugeInteger(){
        Arrays.fill(numberList,-1);
    }

    public int[] getNumberArray() {
        return numberList;
    }

    public int[] parse(String digits) {
        int startIndex = 40 - digits.length();

        for(int index = 0; index < digits.length(); index++){
            char number = digits.charAt(index);
            numberList[startIndex++] = Character.getNumericValue(number);
        }
        return numberList;
    }

    public String toString(){
        String numbers = "";
        for(int index = 0; index < numberList.length; index++){
            if(numberList[index] != -1) numbers += numberList[index];
        }
        return numbers;
    }

    public boolean isEqualTo(HugeInteger hugeIntegers) {
        for(int index = 0; index < numberList.length; index++){
            if(numberList[index] != hugeIntegers.numberList[index]) return false;
        }
        return true;
    }

    public boolean isNotEqualTo(HugeInteger hugeIntegers) {
        for(int index = 0; index < numberList.length; index++){
            if(numberList[index] != hugeIntegers.numberList[index]) return true;
        }
        return false;
    }

    public void add(HugeInteger hugeInteger){
        String firstNumber = this.toString();
        String secondNumber = hugeInteger.toString();
        BigInteger numberOne = new BigInteger(firstNumber);
        BigInteger numberTwo= new BigInteger(secondNumber);
        BigInteger sum = numberOne.add(numberTwo);
        this.parse(sum.toString());
    }

    public void subtract(HugeInteger hugeInteger) {
        String firstNumber = this.toString();
        String secondNumber = hugeInteger.toString();
        BigInteger numberOne = new BigInteger(firstNumber);
        BigInteger numberTwo= new BigInteger(secondNumber);
        BigInteger difference = numberOne.subtract(numberTwo);
        this.parse(difference.toString());
    }

    public boolean isGreaterThan(HugeInteger hugeInteger) {
        String firstNumber = this.toString();
        String secondNumber = hugeInteger.toString();
        BigInteger numberOne = new BigInteger(firstNumber);
        BigInteger numberTwo= new BigInteger(secondNumber);
        return numberOne.compareTo(numberTwo) > 0;
    }


    public boolean isLessThan(HugeInteger hugeInteger) {
        String firstNumber = this.toString();
        String secondNumber = hugeInteger.toString();
        BigInteger numberOne = new BigInteger(firstNumber);
        BigInteger numberTwo= new BigInteger(secondNumber);
        return numberOne.compareTo(numberTwo) < 0;
    }

    public boolean isGreaterThanOrEqualTo(HugeInteger hugeInteger) {
        return isGreaterThan(hugeInteger) || isEqualTo(hugeInteger);
    }

    public boolean isLessThanOrEqualTo(HugeInteger hugeInteger) {
        return isLessThan(hugeInteger) || isEqualTo(hugeInteger);
    }
}