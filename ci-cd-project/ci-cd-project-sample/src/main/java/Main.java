public class Main {

    public static void main(String[] args){

        String message = "hello world";
        int offset = 12;

        CipherClass cipherClass = new CipherClass();
        String cipheredString = cipherClass.cipher(message, offset);

        System.out.println("Original Message: " + message);
        System.out.println("Offset Value: " + offset);
        System.out.println("Encrypted Message: " + cipheredString);
    }
}
