public class CountString {
    public int getNumberOfStrings(String sentence){
//        int length = sentence.length();
//        int lastIndex = sentence.length()-1;

        int index = sentence.length()-1;
        int lengthCount = 0;

        while (index >= 0 && sentence.charAt(index) == ' '){
                index--;
        }

        while(index >= 0 && sentence.charAt(index) != ' '){
                lengthCount += 1;
                index -= 1;
        }
    return lengthCount;
    }

}
