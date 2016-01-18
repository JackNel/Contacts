import main.codewars.CodeWars;
import org.junit.Test;
import static org.junit.Assert.*;

public class CodeWarsTest {

    @Test
    public void testValidWords() {
        assertTrue(CodeWars.validateWord("abcabc"));
        assertTrue(CodeWars.validateWord("Abcabc"));
        assertTrue(CodeWars.validateWord("AbcCBa"));
        assertTrue(CodeWars.validateWord("?!?!?!"));
        assertTrue(CodeWars.validateWord("abc123"));
        assertTrue(CodeWars.validateWord("abc!abc!"));
    }

    @Test
    public void testInvalidWords() {
        assertFalse(CodeWars.validateWord("AbcabcC"));
        assertFalse(CodeWars.validateWord("pippi"));
        assertFalse(CodeWars.validateWord("abcabcd"));
        assertFalse(CodeWars.validateWord("?abc:abc"));
    }
}