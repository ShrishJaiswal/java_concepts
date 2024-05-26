import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CipherClassTest {

    private CipherClass cipherClass = new CipherClass();

    @Test
    void testCipheredMessageWithOffsetTwelve(){
        assertEquals("tqxxa iadxp", cipherClass.cipher("hello world", 12));
    }

    @Test
    void testAgainstEmptyString(){
        assertEquals("", cipherClass.cipher("",12));
    }

}
