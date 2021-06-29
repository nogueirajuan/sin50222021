package codigos;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PeditoTest {

    private Pedido pedido;

    @BeforeClass
    public static void setupClass(){
        System.out.println("Antes de todos os testes");
    }

    @Before
    public void setup(){
        System.out.println("Antes de cada teste");
        pedido = new Pedido();
    }

    @Test
    public void testTaxaZero(){
        float taxa = pedido.calculaTaxaDesconto(false,"",100);
        assertEquals(0,taxa,0);
    }

    @Test
    public void testTaxa15PeloValorCompra(){
        float taxa = pedido.calculaTaxaDesconto(false,"",600);
        assertEquals(15,taxa,0);
    }

    @Test
    public void testTaxa15PeloTipoCliente(){
        float taxa = pedido.calculaTaxaDesconto(false,"ouro",300);
        assertEquals(15,taxa,0);
    }
}
