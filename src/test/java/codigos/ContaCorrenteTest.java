package codigos;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

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
}
