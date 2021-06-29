package codigos;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static junit.framework.TestCase.assertEquals;

public class TrianguloTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void testEquilatero() throws  LadoInvalidoException{
        String resultado = Triangulo.classificaTriangulo(5,5,5);
        assertEquals("EQUILATERO",resultado);
    }

    @Test
    public void testIsoscelesAB() throws  LadoInvalidoException{
        String resultado = Triangulo.classificaTriangulo(5,5,4);
        assertEquals("ISOSCELES",resultado);
    }

    @Test
    public void testIsoscelesAC() throws  LadoInvalidoException{
        String resultado = Triangulo.classificaTriangulo(5,4,5);
        assertEquals("ISOSCELES",resultado);
    }

    @Test
    public void testIsoscelesBC() throws  LadoInvalidoException{
        String resultado = Triangulo.classificaTriangulo(5,4,4);
        assertEquals("ISOSCELES",resultado);
    }

    @Test
    public void testEscaleno() throws  LadoInvalidoException{
        String resultado = Triangulo.classificaTriangulo(5,6,7);
        assertEquals("ESCALENO",resultado);
    }

    @Test
    public void testLadoAInvalido() throws LadoInvalidoException{
        thrown.expect(LadoInvalidoException.class);
        thrown.expectMessage("lado invalido");
        Triangulo.classificaTriangulo(-5,5,5);
    }

}
