public class CipherClass {

    /*
    Class encodes a string into basic cipher technique: Caesar Cipher
     */

    private static final int ALPHABET_SIZE = 26;
    private static final char LETTER_A = 'a';
    private static final char LETTER_Z = 'z';

    public String cipher(String message, int offset){

        offset %= ALPHABET_SIZE;

        char[] alphabet_char = message.toCharArray();

        offsetBy(alphabet_char, offset);

        return new String(alphabet_char);

    }

    private void offsetBy(char[] alphabet_char, int offset_val){
        for(int i = 0; i < alphabet_char.length; i++){
            if (alphabet_char[i] != ' ') {
                alphabet_char[i] = offsetChar(alphabet_char[i], offset_val);
            }
        }
    }

    private char offsetChar(char character, int offset){
        character = (char) (character + offset);
        if (character < LETTER_A){
            // Ciphering the character in Left Movement Offset
            return (char) (character + ALPHABET_SIZE);
        }
        if (character > LETTER_Z){
            // Ciphering the character in Right Movement Offset
            return (char) (character - ALPHABET_SIZE);
        }
        return character;
    }
}
