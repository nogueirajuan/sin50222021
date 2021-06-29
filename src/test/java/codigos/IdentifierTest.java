package codigos;

import org.junit.Assert;
import org.junit.Test;

public class IdentifierTest {

    @Test
    public void testIDValido(){
        Assert.assertEquals(true,Identifier.validaIdentificador("abc"));
    }


}
