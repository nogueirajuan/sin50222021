package codigos;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class IdentifierTest {

    @Test
    public void testIDValido() {
        assertTrue(Identifier.validaIdentificador("abc"));
    }

    @Test
    public void identificadorNulo() {
        assertFalse(Identifier.validaIdentificador(null));
    }

    @Test
    public void identificadorVazio() {
        assertFalse(Identifier.validaIdentificador(""));
    }

    @Test
    public void identificadorExcessoTamanho() {
        assertFalse(Identifier.validaIdentificador("abc1234567"));
    }

    @Test
    public void identificadorInvalidoIniciandoComNumero() {
        assertFalse(Identifier.validaIdentificador("1abc"));
    }

    @Test
    public void identificadorInvalidoIniciandoComCaracterEspecial() {
        assertFalse(Identifier.validaIdentificador("@abc12"));
    }
}
