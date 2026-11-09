package filesandIo;

public class Sentence {
    public static String getShortestWord(String sentence) {
        String[] words = sentence.split(" ");
        String shortestWord = words[0];

        for (String word : words) {
            if (word.length() < shortestWord.length()) {
                shortestWord = word;
            }
        }
        return shortestWord;
    }

    public static int[] getSquareOfNumbers(int[] numbers){
        int[] squareNumbers = new int[numbers.length];
        for(int index = 0; index < numbers.length; index++){
            squareNumbers[index] = numbers[index] * numbers[index];
        }
        for(int index = 0; index < squareNumbers.length; index++){
            for(int inner = index+1; inner < squareNumbers.length; inner++){
                if (squareNumbers[index] > squareNumbers[inner]) {
                    int temp = squareNumbers[index];
                    squareNumbers[index] = squareNumbers[inner];
                    squareNumbers[inner] = temp;
                }
            }
        }
        return squareNumbers;
    }

}
