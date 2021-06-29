package codigos;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class WordsTest {

    private Words words = new Words();

    @Test
    public void validaPalavraNula(){
        int response = words.countWords(null);
        assertEquals(response, -1);
    }

    @Test
    public void validaPalavraUmaPalavraUmaLetraS(){
        int response = words.countWords("s");
        assertEquals(response, 0);
    }

    @Test
    public void validaPalavraUmaPalavraUmaLetraR(){
        int response = words.countWords("r");
        assertEquals(response, 0);
    }

    @Test
    public void validaPalavraPalavraUmaLetraReS(){
        int response = words.countWords("r s r s");
        assertEquals(response, 0);
    }

    @Test
    public void validaStringSemPalavrasTerminadasEmReS(){
        int response = words.countWords("Juan Silva Nogueira");
        assertEquals(response, 0);
    }

    @Test
    public void validaStringComUmaPalavraTerminadaEmR(){
        int response = words.countWords("gostar gostei");
        assertEquals(response, 1);
    }

    @Test
    public void validaStringComUmaPalavraTerminadaEmS(){
        int response = words.countWords("queimou o doze molas");
        assertEquals(response, 1);
    }


    @Test
    public void validaStringComMaisDeUmaPalavraTerminadaEmSeR(){
        int response = words.countWords("Amar amei gostar gostei mas agora não quero nem de graça");
        assertEquals(response, 3);
    }

}
