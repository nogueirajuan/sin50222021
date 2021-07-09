package codigos;

import codigos.domain.pedidos.PedidoRealizado;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

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

    @Test
    public void testTaxa5Cenarios(){
        //cliente bronze ou primeira compra ou valor compra >= 200

        List<PedidoRealizado> pedidos = new ArrayList<>();
        pedidos.add(new PedidoRealizado(false, "bronze", 200));
        pedidos.add(new PedidoRealizado(false, "bronze", 199));
        pedidos.add(new PedidoRealizado(false, "bronze", 201));
        pedidos.add(new PedidoRealizado(false, "", 200));
        pedidos.add(new PedidoRealizado(false, "", 201));
        pedidos.add(new PedidoRealizado(false, "", 399));

        pedidos.forEach(p -> {
            assertEquals(5, pedido.calculaTaxaDesconto(p.getPrimeiraCompra(),p.getTipoCliente(),p.getValorCompra()), 0);
        });
    }

    @Test
    public void testTaxa10Cenarios(){
        //cliente prata ou primeira compra ou valor compra >= 400

        List<PedidoRealizado> pedidos = new ArrayList<>();
        pedidos.add(new PedidoRealizado(true, "", 10));
        pedidos.add(new PedidoRealizado(false, "prata", 10));
        pedidos.add(new PedidoRealizado(true, "prata", 10));
        pedidos.add(new PedidoRealizado(false, "", 400));
        pedidos.add(new PedidoRealizado(false, "", 499));
        pedidos.add(new PedidoRealizado(true, "", 400));
        pedidos.add(new PedidoRealizado(true, "", 499));

        pedidos.forEach(p -> {
            assertEquals(10, pedido.calculaTaxaDesconto(p.getPrimeiraCompra(),p.getTipoCliente(),p.getValorCompra()), 0);
        });
    }

    @Test
    public void testTaxa15Cenarios(){
        //cliente ouro ou valor compra >= 500

        List<PedidoRealizado> pedidos = new ArrayList<>();
        pedidos.add(new PedidoRealizado(false, "ouro", 10));
        pedidos.add(new PedidoRealizado(false, "ouro", 500));
        pedidos.add(new PedidoRealizado(false, "ouro", 499));
        pedidos.add(new PedidoRealizado(false, "ouro", 510));
        pedidos.add(new PedidoRealizado(false, "", 500));
        pedidos.add(new PedidoRealizado(false, "", 501));
        pedidos.add(new PedidoRealizado(true, "ouro", 10));
        pedidos.add(new PedidoRealizado(true, "ouro", 500));
        pedidos.add(new PedidoRealizado(true, "ouro", 499));
        pedidos.add(new PedidoRealizado(true, "ouro", 510));
        pedidos.add(new PedidoRealizado(true, "", 500));
        pedidos.add(new PedidoRealizado(true, "", 501));

        pedidos.forEach(p -> {
            assertEquals(15, pedido.calculaTaxaDesconto(p.getPrimeiraCompra(),p.getTipoCliente(),p.getValorCompra()), 0);
        });
    }
}
