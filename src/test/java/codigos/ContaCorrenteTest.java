package codigos;

import org.junit.*;
import org.junit.rules.ExpectedException;

import static junit.framework.TestCase.assertEquals;

public class ContaCorrenteTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void saqueZero() throws Exception{
        thrown.expect(Exception.class);
        thrown.expectMessage("Valor invalido");
        ContaCorrente conta = new ContaCorrente(100,100);
        conta.saque(0);
    }

    @Test
    public void saqueTodoSaldoELimite() throws Exception {
        ContaCorrente conta = new ContaCorrente(100, 100);
        float saldo = conta.saque(200);
        assertEquals(saldo, Float.valueOf("-100.0"));
    }

    @Test
    public void saqueSaldoTotalContaLimiteZero() throws Exception {
        ContaCorrente conta = new ContaCorrente(100, 0);
        float saldo = conta.saque(100);
        assertEquals(saldo, Float.valueOf("0.0"));
    }

    @Test
    public void saqueApenasLimiteTotal() throws Exception {
        ContaCorrente conta = new ContaCorrente(0, 100);
        float saldo = conta.saque(100);
        assertEquals(saldo, Float.valueOf("-100.0"));
    }

    @Test
    public void saqueSaldoZeroLimiteZero() throws Exception{
        thrown.expect(Exception.class);
        thrown.expectMessage("Saldo Insuficiente");
        ContaCorrente conta = new ContaCorrente(0,0);
        conta.saque(10);
    }

    @Test
    public void consultaSaldo(){
        ContaCorrente conta = new ContaCorrente(10, 0);
        assertEquals(conta.getSaldo(), Float.valueOf("10.0"));
    }

    @Test
    public void consultaLimite(){
        ContaCorrente conta = new ContaCorrente(10, Float.parseFloat("99.87"));
        assertEquals(conta.getLimite(), Float.valueOf("99.87"));
    }

    @Test
    public void adicionaSaldo(){
        ContaCorrente conta = new ContaCorrente(0, 0);
        conta.setSaldo(10);
        assertEquals(conta.getSaldo(), Float.parseFloat("10.0"));
    }

    @Test
    public void adicionaLimite(){
        ContaCorrente conta = new ContaCorrente(0, 0);
        conta.setLimite(10);
        assertEquals(conta.getLimite(), Float.parseFloat("10.0"));
    }
}
