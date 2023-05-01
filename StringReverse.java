package algorithm;


public class StringReverse {
    public static void main(String[] args) {
        char[] word = {'S', 'M', 'I', 'L', 'E' };
        reverseCharacters(word);
    }


    public static void reverseCharacters(char[] letters) {
//
        char[] reversed = new char[letters.length];
        int counter = 0;
        for (int i = letters.length - 1; i >= 0; i--) {
            reversed[counter] = letters[i];
            counter++;
        }
        System.out.println(reversed);
    }
}

