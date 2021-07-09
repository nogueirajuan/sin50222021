package codigos;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static junit.framework.Assert.assertTrue;
import static junit.framework.TestCase.assertEquals;

public class TrianguloTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void classTriangulo(){
        Triangulo t = new Triangulo();
    }

    @Test
    public void testEquilatero() throws LadoInvalidoException {
        String resultado = Triangulo.classificaTriangulo(5, 5, 5);
        assertEquals("EQUILATERO", resultado);
    }

    @Test
    public void testIsoscelesAB() throws LadoInvalidoException {
        String resultado = Triangulo.classificaTriangulo(5, 5, 4);
        assertEquals("ISOSCELES", resultado);
    }

    @Test
    public void testIsoscelesAC() throws LadoInvalidoException {
        String resultado = Triangulo.classificaTriangulo(5, 4, 5);
        assertEquals("ISOSCELES", resultado);
    }

    @Test
    public void testIsoscelesBC() throws LadoInvalidoException {
        String resultado = Triangulo.classificaTriangulo(5, 4, 4);
        assertEquals("ISOSCELES", resultado);
    }

    @Test
    public void testEscaleno() throws LadoInvalidoException {
        String resultado = Triangulo.classificaTriangulo(5, 6, 7);
        assertEquals("ESCALENO", resultado);
    }

    @Test
    public void testCasosLadoInvalido() {
        List<Integer[]> combinacoesInvalidas = new ArrayList<>();
        combinacoesInvalidas.add(new Integer[]{0, 0, 0}); //valor limite todos
        combinacoesInvalidas.add(new Integer[]{0, 0, -1}); //valor limite todos
        combinacoesInvalidas.add(new Integer[]{-1, -1, -1}); //valor limite todos
        combinacoesInvalidas.add(new Integer[]{-5, -5, -5}); //todos nok
        combinacoesInvalidas.add(new Integer[]{0, 2, 2}); //ladoA limite, BC ok
        combinacoesInvalidas.add(new Integer[]{-2, 2, 2}); //ladoA nok, BC ok
        combinacoesInvalidas.add(new Integer[]{2, 0, 2}); //ladoB limite, AC ok
        combinacoesInvalidas.add(new Integer[]{2, -2, 2}); //ladoB nok, AC ok
        combinacoesInvalidas.add(new Integer[]{2, 2, -1}); //ladoC limite, AC ok
        combinacoesInvalidas.add(new Integer[]{2, 2, -5}); //ladoC nok, AC ok
        combinacoesInvalidas.add(new Integer[]{-2, -2, 0});

        combinacoesInvalidas.forEach(x -> {
            Boolean success = false;

            try {
                Triangulo.classificaTriangulo(x[0], x[1], x[2]);
            } catch (LadoInvalidoException e) {
                success = true;
            } finally {

                if(!success) {
                    System.out.println(Arrays.toString(x));
                }

                assertTrue(success);
            }
        });
    }

    //tests nao forma triangulo

    @Test
    public void testCasosNaoFormaTriangula() {
        List<Integer[]> combinacoesNaoFormamTriangulo = new ArrayList<>();
        combinacoesNaoFormamTriangulo.add(new Integer[]{3, 1, 1});
        combinacoesNaoFormamTriangulo.add(new Integer[]{3, 1, 2});
        combinacoesNaoFormamTriangulo.add(new Integer[]{1, 3, 1});
        combinacoesNaoFormamTriangulo.add(new Integer[]{1, 3, 2});

        combinacoesNaoFormamTriangulo.forEach(x -> {
            String response = "";

            try {
                response = Triangulo.classificaTriangulo(x[0], x[1], x[2]);
            } catch (LadoInvalidoException e) {
                //
            } finally {
                assertTrue(response.equals("NAO FORMA TRIANGULO"));
            }
        });
    }

}
