package codigos;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class WordsTest {

    @Test
    public void validaPalavraNula(){
        String palavra = null;
        Words words = new Words();
        int response = words.countWords(palavra);
        assertEquals(response, -1);
    }

}
