import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

    public static boolean debug = false;

    @Test
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = codigos.Triangulo.classificaTriangulo(100, (-1), (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type codigos.LadoInvalidoException; message: lado invalido");
        } catch (codigos.LadoInvalidoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(57.0f, 23.0f);
        contaCorrente2.setLimite((float) 5);
        contaCorrente2.setSaldo(62.0f);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        float float3 = contaCorrente2.getLimite();
        float float4 = contaCorrente2.getSaldo();
        float float5 = contaCorrente2.getLimite();
        contaCorrente2.setSaldo((-1.0f));
        float float8 = contaCorrente2.getLimite();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-1.0f) + "'", float8 == (-1.0f));
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", 1.0f);
        float float8 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: hi!", (float) (short) 10);
        float float12 = pedido0.calculaTaxaDesconto(true, "NAO FORMA TRIANGULO", (float) 0L);
        float float16 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ", (float) (short) 1);
        float float20 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", 78.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10.0f + "'", float12 == 10.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 10.0f + "'", float20 == 10.0f);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        float float3 = contaCorrente2.getLimite();
        float float4 = contaCorrente2.getSaldo();
        float float5 = contaCorrente2.getLimite();
        float float6 = contaCorrente2.getSaldo();
        contaCorrente2.setLimite((float) (byte) 10);
        contaCorrente2.setSaldo((float) 100L);
        float float11 = contaCorrente2.getLimite();
        contaCorrente2.setLimite((float) (short) 10);
        float float14 = contaCorrente2.getSaldo();
        contaCorrente2.setSaldo((float) 0L);
        contaCorrente2.setSaldo(10.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 100.0f + "'", float14 == 100.0f);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(0.0f, (float) 100L);
        float float3 = contaCorrente2.getSaldo();
        contaCorrente2.setSaldo((float) (byte) 100);
        float float7 = contaCorrente2.saque((float) 1L);
        contaCorrente2.setSaldo(90.0f);
        java.lang.Class<?> wildcardClass10 = contaCorrente2.getClass();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 99.0f + "'", float7 == 99.0f);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        codigos.LadoInvalidoException ladoInvalidoException1 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException3 = new codigos.LadoInvalidoException("");
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException3);
        codigos.LadoInvalidoException ladoInvalidoException6 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException8 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException10 = new codigos.LadoInvalidoException("");
        ladoInvalidoException8.addSuppressed((java.lang.Throwable) ladoInvalidoException10);
        ladoInvalidoException6.addSuppressed((java.lang.Throwable) ladoInvalidoException10);
        java.lang.Throwable[] throwableArray13 = ladoInvalidoException10.getSuppressed();
        ladoInvalidoException3.addSuppressed((java.lang.Throwable) ladoInvalidoException10);
        codigos.LadoInvalidoException ladoInvalidoException16 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException18 = new codigos.LadoInvalidoException("");
        ladoInvalidoException16.addSuppressed((java.lang.Throwable) ladoInvalidoException18);
        codigos.LadoInvalidoException ladoInvalidoException21 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException23 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException25 = new codigos.LadoInvalidoException("");
        ladoInvalidoException23.addSuppressed((java.lang.Throwable) ladoInvalidoException25);
        ladoInvalidoException21.addSuppressed((java.lang.Throwable) ladoInvalidoException25);
        java.lang.Throwable[] throwableArray28 = ladoInvalidoException25.getSuppressed();
        ladoInvalidoException18.addSuppressed((java.lang.Throwable) ladoInvalidoException25);
        java.lang.Throwable[] throwableArray30 = ladoInvalidoException25.getSuppressed();
        ladoInvalidoException10.addSuppressed((java.lang.Throwable) ladoInvalidoException25);
        codigos.LadoInvalidoException ladoInvalidoException33 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException35 = new codigos.LadoInvalidoException("");
        ladoInvalidoException33.addSuppressed((java.lang.Throwable) ladoInvalidoException35);
        codigos.LadoInvalidoException ladoInvalidoException38 = new codigos.LadoInvalidoException("hi!");
        ladoInvalidoException35.addSuppressed((java.lang.Throwable) ladoInvalidoException38);
        java.lang.Throwable[] throwableArray40 = ladoInvalidoException38.getSuppressed();
        ladoInvalidoException10.addSuppressed((java.lang.Throwable) ladoInvalidoException38);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray40);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) ' ', 1.0f);
        float float3 = contaCorrente2.getLimite();
        contaCorrente2.setLimite((-11.0f));
        contaCorrente2.setLimite(88.0f);
        float float8 = contaCorrente2.getSaldo();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 32.0f + "'", float8 == 32.0f);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        float float3 = contaCorrente2.getLimite();
        float float4 = contaCorrente2.getSaldo();
        float float5 = contaCorrente2.getLimite();
        contaCorrente2.setSaldo((-1.0f));
        float float8 = contaCorrente2.getSaldo();
        float float9 = contaCorrente2.getLimite();
        float float10 = contaCorrente2.getSaldo();
        contaCorrente2.setLimite(62.0f);
        float float13 = contaCorrente2.getLimite();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-1.0f) + "'", float8 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-1.0f) + "'", float10 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 62.0f + "'", float13 == 62.0f);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        codigos.LadoInvalidoException ladoInvalidoException1 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException3 = new codigos.LadoInvalidoException("");
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException3);
        codigos.LadoInvalidoException ladoInvalidoException6 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException8 = new codigos.LadoInvalidoException("");
        ladoInvalidoException6.addSuppressed((java.lang.Throwable) ladoInvalidoException8);
        codigos.LadoInvalidoException ladoInvalidoException11 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException13 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException15 = new codigos.LadoInvalidoException("");
        ladoInvalidoException13.addSuppressed((java.lang.Throwable) ladoInvalidoException15);
        ladoInvalidoException11.addSuppressed((java.lang.Throwable) ladoInvalidoException15);
        java.lang.Throwable[] throwableArray18 = ladoInvalidoException15.getSuppressed();
        ladoInvalidoException8.addSuppressed((java.lang.Throwable) ladoInvalidoException15);
        java.lang.Throwable[] throwableArray20 = ladoInvalidoException15.getSuppressed();
        ladoInvalidoException3.addSuppressed((java.lang.Throwable) ladoInvalidoException15);
        java.lang.Throwable[] throwableArray22 = ladoInvalidoException15.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException24 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException26 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException28 = new codigos.LadoInvalidoException("");
        ladoInvalidoException26.addSuppressed((java.lang.Throwable) ladoInvalidoException28);
        ladoInvalidoException24.addSuppressed((java.lang.Throwable) ladoInvalidoException28);
        java.lang.Throwable[] throwableArray31 = ladoInvalidoException28.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException33 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException35 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException37 = new codigos.LadoInvalidoException("");
        ladoInvalidoException35.addSuppressed((java.lang.Throwable) ladoInvalidoException37);
        ladoInvalidoException33.addSuppressed((java.lang.Throwable) ladoInvalidoException37);
        java.lang.Throwable[] throwableArray40 = ladoInvalidoException33.getSuppressed();
        ladoInvalidoException28.addSuppressed((java.lang.Throwable) ladoInvalidoException33);
        ladoInvalidoException15.addSuppressed((java.lang.Throwable) ladoInvalidoException28);
        codigos.LadoInvalidoException ladoInvalidoException44 = new codigos.LadoInvalidoException("codigos.LadoInvalidoException: hi!");
        codigos.LadoInvalidoException ladoInvalidoException46 = new codigos.LadoInvalidoException("hi!");
        ladoInvalidoException44.addSuppressed((java.lang.Throwable) ladoInvalidoException46);
        codigos.LadoInvalidoException ladoInvalidoException49 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException51 = new codigos.LadoInvalidoException("");
        ladoInvalidoException49.addSuppressed((java.lang.Throwable) ladoInvalidoException51);
        codigos.LadoInvalidoException ladoInvalidoException54 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException56 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException58 = new codigos.LadoInvalidoException("");
        ladoInvalidoException56.addSuppressed((java.lang.Throwable) ladoInvalidoException58);
        ladoInvalidoException54.addSuppressed((java.lang.Throwable) ladoInvalidoException58);
        java.lang.Throwable[] throwableArray61 = ladoInvalidoException58.getSuppressed();
        ladoInvalidoException51.addSuppressed((java.lang.Throwable) ladoInvalidoException58);
        codigos.LadoInvalidoException ladoInvalidoException64 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException66 = new codigos.LadoInvalidoException("");
        ladoInvalidoException64.addSuppressed((java.lang.Throwable) ladoInvalidoException66);
        codigos.LadoInvalidoException ladoInvalidoException69 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException71 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException73 = new codigos.LadoInvalidoException("");
        ladoInvalidoException71.addSuppressed((java.lang.Throwable) ladoInvalidoException73);
        ladoInvalidoException69.addSuppressed((java.lang.Throwable) ladoInvalidoException73);
        java.lang.Throwable[] throwableArray76 = ladoInvalidoException73.getSuppressed();
        ladoInvalidoException66.addSuppressed((java.lang.Throwable) ladoInvalidoException73);
        java.lang.Throwable[] throwableArray78 = ladoInvalidoException73.getSuppressed();
        ladoInvalidoException58.addSuppressed((java.lang.Throwable) ladoInvalidoException73);
        codigos.LadoInvalidoException ladoInvalidoException81 = new codigos.LadoInvalidoException("codigos.LadoInvalidoException: hi!");
        ladoInvalidoException73.addSuppressed((java.lang.Throwable) ladoInvalidoException81);
        ladoInvalidoException46.addSuppressed((java.lang.Throwable) ladoInvalidoException81);
        ladoInvalidoException28.addSuppressed((java.lang.Throwable) ladoInvalidoException81);
        java.lang.String str85 = ladoInvalidoException28.toString();
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(throwableArray40);
        org.junit.Assert.assertNotNull(throwableArray61);
        org.junit.Assert.assertNotNull(throwableArray76);
        org.junit.Assert.assertNotNull(throwableArray78);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "codigos.LadoInvalidoException: " + "'", str85, "codigos.LadoInvalidoException: ");
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 100L, (float) 10);
        float float3 = contaCorrente2.getSaldo();
        float float4 = contaCorrente2.getLimite();
        float float6 = contaCorrente2.saque((float) 1L);
        contaCorrente2.setLimite((float) 1);
        float float10 = contaCorrente2.saque(52.0f);
        contaCorrente2.setSaldo(78.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 99.0f + "'", float6 == 99.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 47.0f + "'", float10 == 47.0f);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        java.lang.String str3 = codigos.Triangulo.classificaTriangulo((int) '4', (int) (short) 100, 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ISOSCELES" + "'", str3, "ISOSCELES");
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", 1.0f);
        float float8 = pedido0.calculaTaxaDesconto(false, "", (float) 1);
        float float12 = pedido0.calculaTaxaDesconto(false, "hi!", (float) (short) 100);
        float float16 = pedido0.calculaTaxaDesconto(true, "ESCALENO", (float) 2);
        float float20 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ESCALENO", (float) (byte) 100);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 10.0f + "'", float20 == 10.0f);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 10, 97.0f);
        float float3 = contaCorrente2.getSaldo();
        float float4 = contaCorrente2.getSaldo();
        float float5 = contaCorrente2.getSaldo();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10.0f + "'", float5 == 10.0f);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(97.0f, 99.0f);
        float float3 = contaCorrente2.getSaldo();
        contaCorrente2.setLimite(10.0f);
        float float6 = contaCorrente2.getSaldo();
        contaCorrente2.setSaldo((float) 100);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 97.0f + "'", float6 == 97.0f);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 2, 9.0f);
        float float3 = contaCorrente2.getSaldo();
        float float5 = contaCorrente2.saque((float) 4);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3 == 2.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-2.0f) + "'", float5 == (-2.0f));
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(9.0f, 32.0f);
        float float3 = contaCorrente2.getLimite();
        contaCorrente2.setLimite(97.0f);
        contaCorrente2.setLimite((float) (-1));
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 32.0f + "'", float3 == 32.0f);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        float float3 = contaCorrente2.getLimite();
        float float4 = contaCorrente2.getSaldo();
        float float5 = contaCorrente2.getLimite();
        float float6 = contaCorrente2.getSaldo();
        contaCorrente2.setLimite((float) (byte) 10);
        contaCorrente2.setSaldo((float) 100L);
        contaCorrente2.setLimite((float) (byte) 10);
        contaCorrente2.setLimite(90.0f);
        java.lang.Class<?> wildcardClass15 = contaCorrente2.getClass();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 1, (float) 0L);
        float float3 = contaCorrente2.getSaldo();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 1L, 7.0f);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        codigos.Words words0 = new codigos.Words();
        int int2 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int4 = words0.countWords("NAO FORMA TRIANGULO");
        int int6 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int8 = words0.countWords("NAO FORMA TRIANGULO");
        int int10 = words0.countWords("");
        int int12 = words0.countWords("hi!");
        int int14 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        int int16 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        int int18 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        int int20 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        codigos.Words words0 = new codigos.Words();
        int int2 = words0.countWords("");
        int int4 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!");
        int int6 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        int int8 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int10 = words0.countWords("hi!");
        int int12 = words0.countWords("ISOSCELES");
        java.lang.Class<?> wildcardClass13 = words0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", (float) (short) -1);
        float float8 = pedido0.calculaTaxaDesconto(true, "NAO FORMA TRIANGULO", (float) (byte) 0);
        float float12 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: hi!", (float) (-1L));
        float float16 = pedido0.calculaTaxaDesconto(true, "", (float) (byte) 10);
        float float20 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ", 35.0f);
        float float24 = pedido0.calculaTaxaDesconto(true, "", (float) (byte) 100);
        float float28 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: hi!", 88.0f);
        float float32 = pedido0.calculaTaxaDesconto(false, "", 89.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 10.0f + "'", float20 == 10.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 10.0f + "'", float24 == 10.0f);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 10.0f + "'", float28 == 10.0f);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 0.0f + "'", float32 == 0.0f);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (short) 10, (float) ' ');
        float float3 = contaCorrente2.getLimite();
        float float5 = contaCorrente2.saque(42.0f);
        contaCorrente2.setLimite((-11.0f));
        contaCorrente2.setLimite((-11.0f));
        contaCorrente2.setLimite(89.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 32.0f + "'", float3 == 32.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-32.0f) + "'", float5 == (-32.0f));
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) '#', 100.0f);
        contaCorrente2.setLimite((float) (byte) 1);
        contaCorrente2.setLimite((float) 5);
        contaCorrente2.setLimite(0.0f);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(98.0f, (-41.0f));
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", 1.0f);
        float float8 = pedido0.calculaTaxaDesconto(false, "", (float) 1);
        float float12 = pedido0.calculaTaxaDesconto(false, "hi!", (float) (short) 100);
        float float16 = pedido0.calculaTaxaDesconto(true, "", (float) ' ');
        float float20 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: ", (-87.0f));
        float float24 = pedido0.calculaTaxaDesconto(true, "", 0.0f);
        float float28 = pedido0.calculaTaxaDesconto(true, "", (-56.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 10.0f + "'", float24 == 10.0f);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 10.0f + "'", float28 == 10.0f);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 10, 0.0f);
        contaCorrente2.setSaldo((float) (byte) 0);
        float float5 = contaCorrente2.getSaldo();
        contaCorrente2.setLimite((float) (byte) 1);
        float float8 = contaCorrente2.getSaldo();
        contaCorrente2.setLimite(32.0f);
        contaCorrente2.setSaldo((float) '4');
        float float13 = contaCorrente2.getSaldo();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 52.0f + "'", float13 == 52.0f);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        float float3 = contaCorrente2.getLimite();
        float float4 = contaCorrente2.getSaldo();
        float float5 = contaCorrente2.getLimite();
        contaCorrente2.setSaldo((float) (byte) 1);
        contaCorrente2.setSaldo((float) '4');
        float float11 = contaCorrente2.saque((float) (byte) 10);
        float float12 = contaCorrente2.getSaldo();
        float float13 = contaCorrente2.getSaldo();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 42.0f + "'", float11 == 42.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 42.0f + "'", float12 == 42.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 42.0f + "'", float13 == 42.0f);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        codigos.LadoInvalidoException ladoInvalidoException1 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException3 = new codigos.LadoInvalidoException("");
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException3);
        codigos.LadoInvalidoException ladoInvalidoException6 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException8 = new codigos.LadoInvalidoException("");
        ladoInvalidoException6.addSuppressed((java.lang.Throwable) ladoInvalidoException8);
        codigos.LadoInvalidoException ladoInvalidoException11 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException13 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException15 = new codigos.LadoInvalidoException("");
        ladoInvalidoException13.addSuppressed((java.lang.Throwable) ladoInvalidoException15);
        ladoInvalidoException11.addSuppressed((java.lang.Throwable) ladoInvalidoException15);
        java.lang.Throwable[] throwableArray18 = ladoInvalidoException15.getSuppressed();
        ladoInvalidoException8.addSuppressed((java.lang.Throwable) ladoInvalidoException15);
        java.lang.Throwable[] throwableArray20 = ladoInvalidoException15.getSuppressed();
        ladoInvalidoException3.addSuppressed((java.lang.Throwable) ladoInvalidoException15);
        java.lang.Throwable[] throwableArray22 = ladoInvalidoException15.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException24 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException26 = new codigos.LadoInvalidoException("");
        ladoInvalidoException24.addSuppressed((java.lang.Throwable) ladoInvalidoException26);
        codigos.LadoInvalidoException ladoInvalidoException29 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException31 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException33 = new codigos.LadoInvalidoException("");
        ladoInvalidoException31.addSuppressed((java.lang.Throwable) ladoInvalidoException33);
        ladoInvalidoException29.addSuppressed((java.lang.Throwable) ladoInvalidoException33);
        java.lang.Throwable[] throwableArray36 = ladoInvalidoException33.getSuppressed();
        ladoInvalidoException26.addSuppressed((java.lang.Throwable) ladoInvalidoException33);
        java.lang.Throwable[] throwableArray38 = ladoInvalidoException33.getSuppressed();
        ladoInvalidoException15.addSuppressed((java.lang.Throwable) ladoInvalidoException33);
        codigos.LadoInvalidoException ladoInvalidoException41 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException43 = new codigos.LadoInvalidoException("");
        ladoInvalidoException41.addSuppressed((java.lang.Throwable) ladoInvalidoException43);
        codigos.LadoInvalidoException ladoInvalidoException46 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException48 = new codigos.LadoInvalidoException("");
        ladoInvalidoException46.addSuppressed((java.lang.Throwable) ladoInvalidoException48);
        codigos.LadoInvalidoException ladoInvalidoException51 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException53 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException55 = new codigos.LadoInvalidoException("");
        ladoInvalidoException53.addSuppressed((java.lang.Throwable) ladoInvalidoException55);
        ladoInvalidoException51.addSuppressed((java.lang.Throwable) ladoInvalidoException55);
        java.lang.Throwable[] throwableArray58 = ladoInvalidoException55.getSuppressed();
        ladoInvalidoException48.addSuppressed((java.lang.Throwable) ladoInvalidoException55);
        java.lang.Throwable[] throwableArray60 = ladoInvalidoException55.getSuppressed();
        ladoInvalidoException43.addSuppressed((java.lang.Throwable) ladoInvalidoException55);
        ladoInvalidoException15.addSuppressed((java.lang.Throwable) ladoInvalidoException55);
        java.lang.Throwable[] throwableArray63 = ladoInvalidoException55.getSuppressed();
        java.lang.String str64 = ladoInvalidoException55.toString();
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertNotNull(throwableArray58);
        org.junit.Assert.assertNotNull(throwableArray60);
        org.junit.Assert.assertNotNull(throwableArray63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "codigos.LadoInvalidoException: " + "'", str64, "codigos.LadoInvalidoException: ");
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        codigos.Words words0 = new codigos.Words();
        int int2 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int4 = words0.countWords("NAO FORMA TRIANGULO");
        int int6 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int8 = words0.countWords("NAO FORMA TRIANGULO");
        int int10 = words0.countWords("");
        int int12 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int14 = words0.countWords("codigos.LadoInvalidoException: ");
        int int16 = words0.countWords("NAO FORMA TRIANGULO");
        int int18 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        java.lang.String str3 = codigos.Triangulo.classificaTriangulo((int) (short) 10, (int) ' ', (int) '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "NAO FORMA TRIANGULO" + "'", str3, "NAO FORMA TRIANGULO");
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        codigos.LadoInvalidoException ladoInvalidoException1 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException3 = new codigos.LadoInvalidoException("");
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException3);
        codigos.LadoInvalidoException ladoInvalidoException6 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException8 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException10 = new codigos.LadoInvalidoException("");
        ladoInvalidoException8.addSuppressed((java.lang.Throwable) ladoInvalidoException10);
        ladoInvalidoException6.addSuppressed((java.lang.Throwable) ladoInvalidoException10);
        java.lang.Throwable[] throwableArray13 = ladoInvalidoException10.getSuppressed();
        ladoInvalidoException3.addSuppressed((java.lang.Throwable) ladoInvalidoException10);
        codigos.LadoInvalidoException ladoInvalidoException16 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException18 = new codigos.LadoInvalidoException("");
        ladoInvalidoException16.addSuppressed((java.lang.Throwable) ladoInvalidoException18);
        codigos.LadoInvalidoException ladoInvalidoException21 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException23 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException25 = new codigos.LadoInvalidoException("");
        ladoInvalidoException23.addSuppressed((java.lang.Throwable) ladoInvalidoException25);
        ladoInvalidoException21.addSuppressed((java.lang.Throwable) ladoInvalidoException25);
        java.lang.Throwable[] throwableArray28 = ladoInvalidoException25.getSuppressed();
        ladoInvalidoException18.addSuppressed((java.lang.Throwable) ladoInvalidoException25);
        java.lang.Throwable[] throwableArray30 = ladoInvalidoException25.getSuppressed();
        ladoInvalidoException10.addSuppressed((java.lang.Throwable) ladoInvalidoException25);
        codigos.LadoInvalidoException ladoInvalidoException33 = new codigos.LadoInvalidoException("codigos.LadoInvalidoException: hi!");
        ladoInvalidoException25.addSuppressed((java.lang.Throwable) ladoInvalidoException33);
        java.lang.Throwable[] throwableArray35 = ladoInvalidoException33.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException37 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException39 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException41 = new codigos.LadoInvalidoException("");
        ladoInvalidoException39.addSuppressed((java.lang.Throwable) ladoInvalidoException41);
        ladoInvalidoException37.addSuppressed((java.lang.Throwable) ladoInvalidoException41);
        java.lang.Throwable[] throwableArray44 = ladoInvalidoException41.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException46 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException48 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException50 = new codigos.LadoInvalidoException("");
        ladoInvalidoException48.addSuppressed((java.lang.Throwable) ladoInvalidoException50);
        ladoInvalidoException46.addSuppressed((java.lang.Throwable) ladoInvalidoException50);
        java.lang.Throwable[] throwableArray53 = ladoInvalidoException46.getSuppressed();
        ladoInvalidoException41.addSuppressed((java.lang.Throwable) ladoInvalidoException46);
        java.lang.Throwable[] throwableArray55 = ladoInvalidoException46.getSuppressed();
        ladoInvalidoException33.addSuppressed((java.lang.Throwable) ladoInvalidoException46);
        codigos.LadoInvalidoException ladoInvalidoException58 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException60 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException62 = new codigos.LadoInvalidoException("");
        ladoInvalidoException60.addSuppressed((java.lang.Throwable) ladoInvalidoException62);
        ladoInvalidoException58.addSuppressed((java.lang.Throwable) ladoInvalidoException62);
        java.lang.Throwable[] throwableArray65 = ladoInvalidoException62.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException67 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException69 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException71 = new codigos.LadoInvalidoException("");
        ladoInvalidoException69.addSuppressed((java.lang.Throwable) ladoInvalidoException71);
        ladoInvalidoException67.addSuppressed((java.lang.Throwable) ladoInvalidoException71);
        java.lang.Throwable[] throwableArray74 = ladoInvalidoException67.getSuppressed();
        ladoInvalidoException62.addSuppressed((java.lang.Throwable) ladoInvalidoException67);
        java.lang.Throwable[] throwableArray76 = ladoInvalidoException67.getSuppressed();
        ladoInvalidoException33.addSuppressed((java.lang.Throwable) ladoInvalidoException67);
        java.lang.Throwable[] throwableArray78 = ladoInvalidoException67.getSuppressed();
        java.lang.Throwable[] throwableArray79 = ladoInvalidoException67.getSuppressed();
        java.lang.Throwable[] throwableArray80 = ladoInvalidoException67.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertNotNull(throwableArray53);
        org.junit.Assert.assertNotNull(throwableArray55);
        org.junit.Assert.assertNotNull(throwableArray65);
        org.junit.Assert.assertNotNull(throwableArray74);
        org.junit.Assert.assertNotNull(throwableArray76);
        org.junit.Assert.assertNotNull(throwableArray78);
        org.junit.Assert.assertNotNull(throwableArray79);
        org.junit.Assert.assertNotNull(throwableArray80);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        codigos.LadoInvalidoException ladoInvalidoException1 = new codigos.LadoInvalidoException("codigos.LadoInvalidoException: hi!");
        codigos.LadoInvalidoException ladoInvalidoException3 = new codigos.LadoInvalidoException("hi!");
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException3);
        codigos.LadoInvalidoException ladoInvalidoException6 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException8 = new codigos.LadoInvalidoException("");
        ladoInvalidoException6.addSuppressed((java.lang.Throwable) ladoInvalidoException8);
        codigos.LadoInvalidoException ladoInvalidoException11 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException13 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException15 = new codigos.LadoInvalidoException("");
        ladoInvalidoException13.addSuppressed((java.lang.Throwable) ladoInvalidoException15);
        ladoInvalidoException11.addSuppressed((java.lang.Throwable) ladoInvalidoException15);
        java.lang.Throwable[] throwableArray18 = ladoInvalidoException15.getSuppressed();
        ladoInvalidoException8.addSuppressed((java.lang.Throwable) ladoInvalidoException15);
        codigos.LadoInvalidoException ladoInvalidoException21 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException23 = new codigos.LadoInvalidoException("");
        ladoInvalidoException21.addSuppressed((java.lang.Throwable) ladoInvalidoException23);
        codigos.LadoInvalidoException ladoInvalidoException26 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException28 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException30 = new codigos.LadoInvalidoException("");
        ladoInvalidoException28.addSuppressed((java.lang.Throwable) ladoInvalidoException30);
        ladoInvalidoException26.addSuppressed((java.lang.Throwable) ladoInvalidoException30);
        java.lang.Throwable[] throwableArray33 = ladoInvalidoException30.getSuppressed();
        ladoInvalidoException23.addSuppressed((java.lang.Throwable) ladoInvalidoException30);
        java.lang.Throwable[] throwableArray35 = ladoInvalidoException30.getSuppressed();
        ladoInvalidoException15.addSuppressed((java.lang.Throwable) ladoInvalidoException30);
        codigos.LadoInvalidoException ladoInvalidoException38 = new codigos.LadoInvalidoException("codigos.LadoInvalidoException: hi!");
        ladoInvalidoException30.addSuppressed((java.lang.Throwable) ladoInvalidoException38);
        ladoInvalidoException3.addSuppressed((java.lang.Throwable) ladoInvalidoException38);
        java.lang.Class<?> wildcardClass41 = ladoInvalidoException3.getClass();
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (short) 100, (float) (short) 10);
        float float3 = contaCorrente2.getSaldo();
        contaCorrente2.setSaldo(10.0f);
        // The following exception was thrown during execution in test generation
        try {
            float float7 = contaCorrente2.saque(62.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Saldo Insuficiente");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        contaCorrente2.setLimite((float) 0L);
        contaCorrente2.setLimite(99.0f);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = codigos.Triangulo.classificaTriangulo(0, (int) ' ', 4);
            org.junit.Assert.fail("Expected exception of type codigos.LadoInvalidoException; message: lado invalido");
        } catch (codigos.LadoInvalidoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = codigos.Triangulo.classificaTriangulo((int) (short) -1, (int) (short) 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type codigos.LadoInvalidoException; message: lado invalido");
        } catch (codigos.LadoInvalidoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (-1L), (float) 5);
        float float3 = contaCorrente2.getSaldo();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = codigos.Triangulo.classificaTriangulo((-1), 1, 0);
            org.junit.Assert.fail("Expected exception of type codigos.LadoInvalidoException; message: lado invalido");
        } catch (codigos.LadoInvalidoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((-14.0f), 32.0f);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) ' ', 1.0f);
        float float3 = contaCorrente2.getLimite();
        contaCorrente2.setLimite((-11.0f));
        float float6 = contaCorrente2.getSaldo();
        float float7 = contaCorrente2.getSaldo();
        contaCorrente2.setSaldo((float) ' ');
        contaCorrente2.setSaldo(8.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 32.0f + "'", float6 == 32.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 32.0f + "'", float7 == 32.0f);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        codigos.LadoInvalidoException ladoInvalidoException1 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException3 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException5 = new codigos.LadoInvalidoException("");
        ladoInvalidoException3.addSuppressed((java.lang.Throwable) ladoInvalidoException5);
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException5);
        java.lang.Throwable[] throwableArray8 = ladoInvalidoException1.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException10 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException12 = new codigos.LadoInvalidoException("");
        ladoInvalidoException10.addSuppressed((java.lang.Throwable) ladoInvalidoException12);
        codigos.LadoInvalidoException ladoInvalidoException15 = new codigos.LadoInvalidoException("hi!");
        ladoInvalidoException12.addSuppressed((java.lang.Throwable) ladoInvalidoException15);
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException15);
        codigos.LadoInvalidoException ladoInvalidoException19 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException21 = new codigos.LadoInvalidoException("");
        ladoInvalidoException19.addSuppressed((java.lang.Throwable) ladoInvalidoException21);
        codigos.LadoInvalidoException ladoInvalidoException24 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException26 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException28 = new codigos.LadoInvalidoException("");
        ladoInvalidoException26.addSuppressed((java.lang.Throwable) ladoInvalidoException28);
        ladoInvalidoException24.addSuppressed((java.lang.Throwable) ladoInvalidoException28);
        java.lang.Throwable[] throwableArray31 = ladoInvalidoException28.getSuppressed();
        ladoInvalidoException21.addSuppressed((java.lang.Throwable) ladoInvalidoException28);
        codigos.LadoInvalidoException ladoInvalidoException34 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException36 = new codigos.LadoInvalidoException("");
        ladoInvalidoException34.addSuppressed((java.lang.Throwable) ladoInvalidoException36);
        codigos.LadoInvalidoException ladoInvalidoException39 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException41 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException43 = new codigos.LadoInvalidoException("");
        ladoInvalidoException41.addSuppressed((java.lang.Throwable) ladoInvalidoException43);
        ladoInvalidoException39.addSuppressed((java.lang.Throwable) ladoInvalidoException43);
        java.lang.Throwable[] throwableArray46 = ladoInvalidoException43.getSuppressed();
        ladoInvalidoException36.addSuppressed((java.lang.Throwable) ladoInvalidoException43);
        java.lang.Throwable[] throwableArray48 = ladoInvalidoException43.getSuppressed();
        ladoInvalidoException28.addSuppressed((java.lang.Throwable) ladoInvalidoException43);
        codigos.LadoInvalidoException ladoInvalidoException51 = new codigos.LadoInvalidoException("ESCALENO");
        ladoInvalidoException43.addSuppressed((java.lang.Throwable) ladoInvalidoException51);
        java.lang.Throwable[] throwableArray53 = ladoInvalidoException43.getSuppressed();
        java.lang.Throwable[] throwableArray54 = ladoInvalidoException43.getSuppressed();
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException43);
        java.lang.String str56 = ladoInvalidoException43.toString();
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(throwableArray46);
        org.junit.Assert.assertNotNull(throwableArray48);
        org.junit.Assert.assertNotNull(throwableArray53);
        org.junit.Assert.assertNotNull(throwableArray54);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "codigos.LadoInvalidoException: " + "'", str56, "codigos.LadoInvalidoException: ");
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", 1.0f);
        float float8 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: hi!", (float) (short) 10);
        float float12 = pedido0.calculaTaxaDesconto(false, "NAO FORMA TRIANGULO", (-48.0f));
        float float16 = pedido0.calculaTaxaDesconto(false, "ESCALENO", 52.0f);
        float float20 = pedido0.calculaTaxaDesconto(true, "NAO FORMA TRIANGULO", (-48.0f));
        float float24 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: ESCALENO", 0.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 10.0f + "'", float20 == 10.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.0f + "'", float24 == 0.0f);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = codigos.Triangulo.classificaTriangulo((int) (byte) 0, 2, 10);
            org.junit.Assert.fail("Expected exception of type codigos.LadoInvalidoException; message: lado invalido");
        } catch (codigos.LadoInvalidoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        codigos.Words words0 = new codigos.Words();
        int int2 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int4 = words0.countWords("NAO FORMA TRIANGULO");
        int int6 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int8 = words0.countWords("NAO FORMA TRIANGULO");
        int int10 = words0.countWords("codigos.LadoInvalidoException: ");
        int int12 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        int int14 = words0.countWords("");
        int int16 = words0.countWords("");
        int int18 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((-32.0f), 67.0f);
        float float3 = contaCorrente2.getLimite();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 67.0f + "'", float3 == 67.0f);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(1.0f, (float) 1L);
        contaCorrente2.setSaldo(10.0f);
        contaCorrente2.setSaldo((-58.0f));
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        codigos.LadoInvalidoException ladoInvalidoException1 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException3 = new codigos.LadoInvalidoException("");
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException3);
        codigos.LadoInvalidoException ladoInvalidoException6 = new codigos.LadoInvalidoException("hi!");
        ladoInvalidoException3.addSuppressed((java.lang.Throwable) ladoInvalidoException6);
        codigos.LadoInvalidoException ladoInvalidoException9 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException11 = new codigos.LadoInvalidoException("");
        ladoInvalidoException9.addSuppressed((java.lang.Throwable) ladoInvalidoException11);
        codigos.LadoInvalidoException ladoInvalidoException14 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException16 = new codigos.LadoInvalidoException("");
        ladoInvalidoException14.addSuppressed((java.lang.Throwable) ladoInvalidoException16);
        codigos.LadoInvalidoException ladoInvalidoException19 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException21 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException23 = new codigos.LadoInvalidoException("");
        ladoInvalidoException21.addSuppressed((java.lang.Throwable) ladoInvalidoException23);
        ladoInvalidoException19.addSuppressed((java.lang.Throwable) ladoInvalidoException23);
        java.lang.Throwable[] throwableArray26 = ladoInvalidoException23.getSuppressed();
        ladoInvalidoException16.addSuppressed((java.lang.Throwable) ladoInvalidoException23);
        java.lang.Throwable[] throwableArray28 = ladoInvalidoException23.getSuppressed();
        ladoInvalidoException11.addSuppressed((java.lang.Throwable) ladoInvalidoException23);
        java.lang.Throwable[] throwableArray30 = ladoInvalidoException23.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException32 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException34 = new codigos.LadoInvalidoException("");
        ladoInvalidoException32.addSuppressed((java.lang.Throwable) ladoInvalidoException34);
        codigos.LadoInvalidoException ladoInvalidoException37 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException39 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException41 = new codigos.LadoInvalidoException("");
        ladoInvalidoException39.addSuppressed((java.lang.Throwable) ladoInvalidoException41);
        ladoInvalidoException37.addSuppressed((java.lang.Throwable) ladoInvalidoException41);
        java.lang.Throwable[] throwableArray44 = ladoInvalidoException41.getSuppressed();
        ladoInvalidoException34.addSuppressed((java.lang.Throwable) ladoInvalidoException41);
        java.lang.Throwable[] throwableArray46 = ladoInvalidoException41.getSuppressed();
        ladoInvalidoException23.addSuppressed((java.lang.Throwable) ladoInvalidoException41);
        java.lang.Throwable[] throwableArray48 = ladoInvalidoException41.getSuppressed();
        java.lang.Throwable[] throwableArray49 = ladoInvalidoException41.getSuppressed();
        ladoInvalidoException6.addSuppressed((java.lang.Throwable) ladoInvalidoException41);
        java.lang.String str51 = ladoInvalidoException41.toString();
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertNotNull(throwableArray46);
        org.junit.Assert.assertNotNull(throwableArray48);
        org.junit.Assert.assertNotNull(throwableArray49);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "codigos.LadoInvalidoException: " + "'", str51, "codigos.LadoInvalidoException: ");
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        codigos.LadoInvalidoException ladoInvalidoException1 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException3 = new codigos.LadoInvalidoException("");
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException3);
        codigos.LadoInvalidoException ladoInvalidoException6 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException8 = new codigos.LadoInvalidoException("");
        ladoInvalidoException6.addSuppressed((java.lang.Throwable) ladoInvalidoException8);
        codigos.LadoInvalidoException ladoInvalidoException11 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException13 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException15 = new codigos.LadoInvalidoException("");
        ladoInvalidoException13.addSuppressed((java.lang.Throwable) ladoInvalidoException15);
        ladoInvalidoException11.addSuppressed((java.lang.Throwable) ladoInvalidoException15);
        java.lang.Throwable[] throwableArray18 = ladoInvalidoException15.getSuppressed();
        ladoInvalidoException8.addSuppressed((java.lang.Throwable) ladoInvalidoException15);
        java.lang.Throwable[] throwableArray20 = ladoInvalidoException15.getSuppressed();
        ladoInvalidoException3.addSuppressed((java.lang.Throwable) ladoInvalidoException15);
        java.lang.Throwable[] throwableArray22 = ladoInvalidoException15.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException24 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException26 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException28 = new codigos.LadoInvalidoException("");
        ladoInvalidoException26.addSuppressed((java.lang.Throwable) ladoInvalidoException28);
        ladoInvalidoException24.addSuppressed((java.lang.Throwable) ladoInvalidoException28);
        java.lang.Throwable[] throwableArray31 = ladoInvalidoException28.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException33 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException35 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException37 = new codigos.LadoInvalidoException("");
        ladoInvalidoException35.addSuppressed((java.lang.Throwable) ladoInvalidoException37);
        ladoInvalidoException33.addSuppressed((java.lang.Throwable) ladoInvalidoException37);
        java.lang.Throwable[] throwableArray40 = ladoInvalidoException33.getSuppressed();
        ladoInvalidoException28.addSuppressed((java.lang.Throwable) ladoInvalidoException33);
        ladoInvalidoException15.addSuppressed((java.lang.Throwable) ladoInvalidoException28);
        codigos.LadoInvalidoException ladoInvalidoException44 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException46 = new codigos.LadoInvalidoException("");
        ladoInvalidoException44.addSuppressed((java.lang.Throwable) ladoInvalidoException46);
        codigos.LadoInvalidoException ladoInvalidoException49 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException51 = new codigos.LadoInvalidoException("");
        ladoInvalidoException49.addSuppressed((java.lang.Throwable) ladoInvalidoException51);
        codigos.LadoInvalidoException ladoInvalidoException54 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException56 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException58 = new codigos.LadoInvalidoException("");
        ladoInvalidoException56.addSuppressed((java.lang.Throwable) ladoInvalidoException58);
        ladoInvalidoException54.addSuppressed((java.lang.Throwable) ladoInvalidoException58);
        java.lang.Throwable[] throwableArray61 = ladoInvalidoException58.getSuppressed();
        ladoInvalidoException51.addSuppressed((java.lang.Throwable) ladoInvalidoException58);
        java.lang.Throwable[] throwableArray63 = ladoInvalidoException58.getSuppressed();
        ladoInvalidoException46.addSuppressed((java.lang.Throwable) ladoInvalidoException58);
        ladoInvalidoException15.addSuppressed((java.lang.Throwable) ladoInvalidoException46);
        java.lang.Throwable[] throwableArray66 = ladoInvalidoException46.getSuppressed();
        java.lang.Throwable throwable67 = null;
        // The following exception was thrown during execution in test generation
        try {
            ladoInvalidoException46.addSuppressed(throwable67);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(throwableArray40);
        org.junit.Assert.assertNotNull(throwableArray61);
        org.junit.Assert.assertNotNull(throwableArray63);
        org.junit.Assert.assertNotNull(throwableArray66);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(1.0f, 1.0f);
        contaCorrente2.setSaldo((float) 100);
        float float5 = contaCorrente2.getSaldo();
        float float7 = contaCorrente2.saque((float) (byte) 1);
        contaCorrente2.setLimite((float) (byte) -1);
        contaCorrente2.setLimite((float) (byte) 10);
        contaCorrente2.setLimite(67.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 100.0f + "'", float5 == 100.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 99.0f + "'", float7 == 99.0f);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(false, "hi!", (float) (-1L));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 10, 0.0f);
        float float3 = contaCorrente2.getSaldo();
        float float5 = contaCorrente2.saque(1.0f);
        contaCorrente2.setSaldo(100.0f);
        contaCorrente2.setLimite((float) 3);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 9.0f + "'", float5 == 9.0f);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(0.0f, (float) 100L);
        float float3 = contaCorrente2.getLimite();
        float float5 = contaCorrente2.saque((float) '4');
        float float6 = contaCorrente2.getLimite();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-52.0f) + "'", float5 == (-52.0f));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        codigos.Words words0 = new codigos.Words();
        int int2 = words0.countWords("");
        int int4 = words0.countWords("");
        int int6 = words0.countWords("NAO FORMA TRIANGULO");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        codigos.LadoInvalidoException ladoInvalidoException1 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException3 = new codigos.LadoInvalidoException("");
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException3);
        codigos.LadoInvalidoException ladoInvalidoException6 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException8 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException10 = new codigos.LadoInvalidoException("");
        ladoInvalidoException8.addSuppressed((java.lang.Throwable) ladoInvalidoException10);
        ladoInvalidoException6.addSuppressed((java.lang.Throwable) ladoInvalidoException10);
        java.lang.Throwable[] throwableArray13 = ladoInvalidoException10.getSuppressed();
        ladoInvalidoException3.addSuppressed((java.lang.Throwable) ladoInvalidoException10);
        java.lang.Throwable[] throwableArray15 = ladoInvalidoException10.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException17 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException19 = new codigos.LadoInvalidoException("");
        ladoInvalidoException17.addSuppressed((java.lang.Throwable) ladoInvalidoException19);
        codigos.LadoInvalidoException ladoInvalidoException22 = new codigos.LadoInvalidoException("hi!");
        ladoInvalidoException19.addSuppressed((java.lang.Throwable) ladoInvalidoException22);
        codigos.LadoInvalidoException ladoInvalidoException25 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException27 = new codigos.LadoInvalidoException("");
        ladoInvalidoException25.addSuppressed((java.lang.Throwable) ladoInvalidoException27);
        codigos.LadoInvalidoException ladoInvalidoException30 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException32 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException34 = new codigos.LadoInvalidoException("");
        ladoInvalidoException32.addSuppressed((java.lang.Throwable) ladoInvalidoException34);
        ladoInvalidoException30.addSuppressed((java.lang.Throwable) ladoInvalidoException34);
        java.lang.Throwable[] throwableArray37 = ladoInvalidoException34.getSuppressed();
        ladoInvalidoException27.addSuppressed((java.lang.Throwable) ladoInvalidoException34);
        codigos.LadoInvalidoException ladoInvalidoException40 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException42 = new codigos.LadoInvalidoException("");
        ladoInvalidoException40.addSuppressed((java.lang.Throwable) ladoInvalidoException42);
        codigos.LadoInvalidoException ladoInvalidoException45 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException47 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException49 = new codigos.LadoInvalidoException("");
        ladoInvalidoException47.addSuppressed((java.lang.Throwable) ladoInvalidoException49);
        ladoInvalidoException45.addSuppressed((java.lang.Throwable) ladoInvalidoException49);
        java.lang.Throwable[] throwableArray52 = ladoInvalidoException49.getSuppressed();
        ladoInvalidoException42.addSuppressed((java.lang.Throwable) ladoInvalidoException49);
        java.lang.Throwable[] throwableArray54 = ladoInvalidoException49.getSuppressed();
        ladoInvalidoException34.addSuppressed((java.lang.Throwable) ladoInvalidoException49);
        ladoInvalidoException19.addSuppressed((java.lang.Throwable) ladoInvalidoException34);
        ladoInvalidoException10.addSuppressed((java.lang.Throwable) ladoInvalidoException19);
        codigos.LadoInvalidoException ladoInvalidoException59 = new codigos.LadoInvalidoException("hi!");
        codigos.LadoInvalidoException ladoInvalidoException61 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException63 = new codigos.LadoInvalidoException("");
        ladoInvalidoException61.addSuppressed((java.lang.Throwable) ladoInvalidoException63);
        codigos.LadoInvalidoException ladoInvalidoException66 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException68 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException70 = new codigos.LadoInvalidoException("");
        ladoInvalidoException68.addSuppressed((java.lang.Throwable) ladoInvalidoException70);
        ladoInvalidoException66.addSuppressed((java.lang.Throwable) ladoInvalidoException70);
        java.lang.Throwable[] throwableArray73 = ladoInvalidoException70.getSuppressed();
        ladoInvalidoException63.addSuppressed((java.lang.Throwable) ladoInvalidoException70);
        ladoInvalidoException59.addSuppressed((java.lang.Throwable) ladoInvalidoException70);
        ladoInvalidoException19.addSuppressed((java.lang.Throwable) ladoInvalidoException70);
        java.lang.String str77 = ladoInvalidoException19.toString();
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertNotNull(throwableArray52);
        org.junit.Assert.assertNotNull(throwableArray54);
        org.junit.Assert.assertNotNull(throwableArray73);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "codigos.LadoInvalidoException: " + "'", str77, "codigos.LadoInvalidoException: ");
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 100L, (float) 10);
        float float3 = contaCorrente2.getSaldo();
        float float4 = contaCorrente2.getLimite();
        float float6 = contaCorrente2.saque(99.0f);
        contaCorrente2.setSaldo((float) 100);
        float float9 = contaCorrente2.getSaldo();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 100.0f + "'", float9 == 100.0f);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (-1L), (float) (byte) -1);
        contaCorrente2.setLimite(90.0f);
        float float5 = contaCorrente2.getLimite();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 90.0f + "'", float5 == 90.0f);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        float float3 = contaCorrente2.getLimite();
        contaCorrente2.setSaldo((float) (short) 0);
        contaCorrente2.setLimite(0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = codigos.Triangulo.classificaTriangulo(5, (int) (short) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type codigos.LadoInvalidoException; message: lado invalido");
        } catch (codigos.LadoInvalidoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        codigos.LadoInvalidoException ladoInvalidoException1 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException3 = new codigos.LadoInvalidoException("");
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException3);
        codigos.LadoInvalidoException ladoInvalidoException6 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException8 = new codigos.LadoInvalidoException("");
        ladoInvalidoException6.addSuppressed((java.lang.Throwable) ladoInvalidoException8);
        codigos.LadoInvalidoException ladoInvalidoException11 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException13 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException15 = new codigos.LadoInvalidoException("");
        ladoInvalidoException13.addSuppressed((java.lang.Throwable) ladoInvalidoException15);
        ladoInvalidoException11.addSuppressed((java.lang.Throwable) ladoInvalidoException15);
        java.lang.Throwable[] throwableArray18 = ladoInvalidoException15.getSuppressed();
        ladoInvalidoException8.addSuppressed((java.lang.Throwable) ladoInvalidoException15);
        java.lang.Throwable[] throwableArray20 = ladoInvalidoException15.getSuppressed();
        ladoInvalidoException3.addSuppressed((java.lang.Throwable) ladoInvalidoException15);
        java.lang.Throwable[] throwableArray22 = ladoInvalidoException15.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException24 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException26 = new codigos.LadoInvalidoException("");
        ladoInvalidoException24.addSuppressed((java.lang.Throwable) ladoInvalidoException26);
        codigos.LadoInvalidoException ladoInvalidoException29 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException31 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException33 = new codigos.LadoInvalidoException("");
        ladoInvalidoException31.addSuppressed((java.lang.Throwable) ladoInvalidoException33);
        ladoInvalidoException29.addSuppressed((java.lang.Throwable) ladoInvalidoException33);
        java.lang.Throwable[] throwableArray36 = ladoInvalidoException33.getSuppressed();
        ladoInvalidoException26.addSuppressed((java.lang.Throwable) ladoInvalidoException33);
        codigos.LadoInvalidoException ladoInvalidoException39 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException41 = new codigos.LadoInvalidoException("");
        ladoInvalidoException39.addSuppressed((java.lang.Throwable) ladoInvalidoException41);
        codigos.LadoInvalidoException ladoInvalidoException44 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException46 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException48 = new codigos.LadoInvalidoException("");
        ladoInvalidoException46.addSuppressed((java.lang.Throwable) ladoInvalidoException48);
        ladoInvalidoException44.addSuppressed((java.lang.Throwable) ladoInvalidoException48);
        java.lang.Throwable[] throwableArray51 = ladoInvalidoException48.getSuppressed();
        ladoInvalidoException41.addSuppressed((java.lang.Throwable) ladoInvalidoException48);
        java.lang.Throwable[] throwableArray53 = ladoInvalidoException48.getSuppressed();
        ladoInvalidoException33.addSuppressed((java.lang.Throwable) ladoInvalidoException48);
        codigos.LadoInvalidoException ladoInvalidoException56 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException58 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException60 = new codigos.LadoInvalidoException("");
        ladoInvalidoException58.addSuppressed((java.lang.Throwable) ladoInvalidoException60);
        ladoInvalidoException56.addSuppressed((java.lang.Throwable) ladoInvalidoException60);
        java.lang.Throwable[] throwableArray63 = ladoInvalidoException56.getSuppressed();
        ladoInvalidoException33.addSuppressed((java.lang.Throwable) ladoInvalidoException56);
        codigos.LadoInvalidoException ladoInvalidoException66 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException68 = new codigos.LadoInvalidoException("");
        ladoInvalidoException66.addSuppressed((java.lang.Throwable) ladoInvalidoException68);
        codigos.LadoInvalidoException ladoInvalidoException71 = new codigos.LadoInvalidoException("hi!");
        ladoInvalidoException68.addSuppressed((java.lang.Throwable) ladoInvalidoException71);
        java.lang.Throwable[] throwableArray73 = ladoInvalidoException68.getSuppressed();
        ladoInvalidoException33.addSuppressed((java.lang.Throwable) ladoInvalidoException68);
        java.lang.Throwable[] throwableArray75 = ladoInvalidoException68.getSuppressed();
        ladoInvalidoException15.addSuppressed((java.lang.Throwable) ladoInvalidoException68);
        java.lang.String str77 = ladoInvalidoException15.toString();
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray51);
        org.junit.Assert.assertNotNull(throwableArray53);
        org.junit.Assert.assertNotNull(throwableArray63);
        org.junit.Assert.assertNotNull(throwableArray73);
        org.junit.Assert.assertNotNull(throwableArray75);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "codigos.LadoInvalidoException: " + "'", str77, "codigos.LadoInvalidoException: ");
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        codigos.LadoInvalidoException ladoInvalidoException1 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException3 = new codigos.LadoInvalidoException("");
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException3);
        codigos.LadoInvalidoException ladoInvalidoException6 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException8 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException10 = new codigos.LadoInvalidoException("");
        ladoInvalidoException8.addSuppressed((java.lang.Throwable) ladoInvalidoException10);
        ladoInvalidoException6.addSuppressed((java.lang.Throwable) ladoInvalidoException10);
        java.lang.Throwable[] throwableArray13 = ladoInvalidoException10.getSuppressed();
        ladoInvalidoException3.addSuppressed((java.lang.Throwable) ladoInvalidoException10);
        codigos.LadoInvalidoException ladoInvalidoException16 = new codigos.LadoInvalidoException("codigos.LadoInvalidoException: hi!");
        codigos.LadoInvalidoException ladoInvalidoException18 = new codigos.LadoInvalidoException("hi!");
        ladoInvalidoException16.addSuppressed((java.lang.Throwable) ladoInvalidoException18);
        codigos.LadoInvalidoException ladoInvalidoException21 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException23 = new codigos.LadoInvalidoException("");
        ladoInvalidoException21.addSuppressed((java.lang.Throwable) ladoInvalidoException23);
        codigos.LadoInvalidoException ladoInvalidoException26 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException28 = new codigos.LadoInvalidoException("");
        ladoInvalidoException26.addSuppressed((java.lang.Throwable) ladoInvalidoException28);
        codigos.LadoInvalidoException ladoInvalidoException31 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException33 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException35 = new codigos.LadoInvalidoException("");
        ladoInvalidoException33.addSuppressed((java.lang.Throwable) ladoInvalidoException35);
        ladoInvalidoException31.addSuppressed((java.lang.Throwable) ladoInvalidoException35);
        java.lang.Throwable[] throwableArray38 = ladoInvalidoException35.getSuppressed();
        ladoInvalidoException28.addSuppressed((java.lang.Throwable) ladoInvalidoException35);
        java.lang.Throwable[] throwableArray40 = ladoInvalidoException35.getSuppressed();
        ladoInvalidoException23.addSuppressed((java.lang.Throwable) ladoInvalidoException35);
        java.lang.Throwable[] throwableArray42 = ladoInvalidoException35.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException44 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException46 = new codigos.LadoInvalidoException("");
        ladoInvalidoException44.addSuppressed((java.lang.Throwable) ladoInvalidoException46);
        codigos.LadoInvalidoException ladoInvalidoException49 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException51 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException53 = new codigos.LadoInvalidoException("");
        ladoInvalidoException51.addSuppressed((java.lang.Throwable) ladoInvalidoException53);
        ladoInvalidoException49.addSuppressed((java.lang.Throwable) ladoInvalidoException53);
        java.lang.Throwable[] throwableArray56 = ladoInvalidoException53.getSuppressed();
        ladoInvalidoException46.addSuppressed((java.lang.Throwable) ladoInvalidoException53);
        java.lang.Throwable[] throwableArray58 = ladoInvalidoException53.getSuppressed();
        ladoInvalidoException35.addSuppressed((java.lang.Throwable) ladoInvalidoException53);
        codigos.LadoInvalidoException ladoInvalidoException61 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException63 = new codigos.LadoInvalidoException("");
        ladoInvalidoException61.addSuppressed((java.lang.Throwable) ladoInvalidoException63);
        codigos.LadoInvalidoException ladoInvalidoException66 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException68 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException70 = new codigos.LadoInvalidoException("");
        ladoInvalidoException68.addSuppressed((java.lang.Throwable) ladoInvalidoException70);
        ladoInvalidoException66.addSuppressed((java.lang.Throwable) ladoInvalidoException70);
        java.lang.Throwable[] throwableArray73 = ladoInvalidoException70.getSuppressed();
        ladoInvalidoException63.addSuppressed((java.lang.Throwable) ladoInvalidoException70);
        java.lang.Throwable[] throwableArray75 = ladoInvalidoException70.getSuppressed();
        ladoInvalidoException35.addSuppressed((java.lang.Throwable) ladoInvalidoException70);
        ladoInvalidoException18.addSuppressed((java.lang.Throwable) ladoInvalidoException35);
        ladoInvalidoException10.addSuppressed((java.lang.Throwable) ladoInvalidoException35);
        java.lang.String str79 = ladoInvalidoException10.toString();
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertNotNull(throwableArray40);
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertNotNull(throwableArray56);
        org.junit.Assert.assertNotNull(throwableArray58);
        org.junit.Assert.assertNotNull(throwableArray73);
        org.junit.Assert.assertNotNull(throwableArray75);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "codigos.LadoInvalidoException: " + "'", str79, "codigos.LadoInvalidoException: ");
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 100, (float) (short) 100);
        contaCorrente2.setSaldo(96.0f);
        contaCorrente2.setLimite((-32.0f));
        float float7 = contaCorrente2.getLimite();
        java.lang.Class<?> wildcardClass8 = contaCorrente2.getClass();
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-32.0f) + "'", float7 == (-32.0f));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        codigos.LadoInvalidoException ladoInvalidoException1 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException3 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException5 = new codigos.LadoInvalidoException("");
        ladoInvalidoException3.addSuppressed((java.lang.Throwable) ladoInvalidoException5);
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException5);
        java.lang.Throwable[] throwableArray8 = ladoInvalidoException1.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException10 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException12 = new codigos.LadoInvalidoException("");
        ladoInvalidoException10.addSuppressed((java.lang.Throwable) ladoInvalidoException12);
        codigos.LadoInvalidoException ladoInvalidoException15 = new codigos.LadoInvalidoException("hi!");
        ladoInvalidoException12.addSuppressed((java.lang.Throwable) ladoInvalidoException15);
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException15);
        codigos.LadoInvalidoException ladoInvalidoException19 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException21 = new codigos.LadoInvalidoException("");
        ladoInvalidoException19.addSuppressed((java.lang.Throwable) ladoInvalidoException21);
        codigos.LadoInvalidoException ladoInvalidoException24 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException26 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException28 = new codigos.LadoInvalidoException("");
        ladoInvalidoException26.addSuppressed((java.lang.Throwable) ladoInvalidoException28);
        ladoInvalidoException24.addSuppressed((java.lang.Throwable) ladoInvalidoException28);
        java.lang.Throwable[] throwableArray31 = ladoInvalidoException28.getSuppressed();
        ladoInvalidoException21.addSuppressed((java.lang.Throwable) ladoInvalidoException28);
        codigos.LadoInvalidoException ladoInvalidoException34 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException36 = new codigos.LadoInvalidoException("");
        ladoInvalidoException34.addSuppressed((java.lang.Throwable) ladoInvalidoException36);
        codigos.LadoInvalidoException ladoInvalidoException39 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException41 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException43 = new codigos.LadoInvalidoException("");
        ladoInvalidoException41.addSuppressed((java.lang.Throwable) ladoInvalidoException43);
        ladoInvalidoException39.addSuppressed((java.lang.Throwable) ladoInvalidoException43);
        java.lang.Throwable[] throwableArray46 = ladoInvalidoException43.getSuppressed();
        ladoInvalidoException36.addSuppressed((java.lang.Throwable) ladoInvalidoException43);
        java.lang.Throwable[] throwableArray48 = ladoInvalidoException43.getSuppressed();
        ladoInvalidoException28.addSuppressed((java.lang.Throwable) ladoInvalidoException43);
        codigos.LadoInvalidoException ladoInvalidoException51 = new codigos.LadoInvalidoException("ESCALENO");
        ladoInvalidoException43.addSuppressed((java.lang.Throwable) ladoInvalidoException51);
        java.lang.Throwable[] throwableArray53 = ladoInvalidoException43.getSuppressed();
        java.lang.Throwable[] throwableArray54 = ladoInvalidoException43.getSuppressed();
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException43);
        java.lang.String str56 = ladoInvalidoException1.toString();
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(throwableArray46);
        org.junit.Assert.assertNotNull(throwableArray48);
        org.junit.Assert.assertNotNull(throwableArray53);
        org.junit.Assert.assertNotNull(throwableArray54);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "codigos.LadoInvalidoException: " + "'", str56, "codigos.LadoInvalidoException: ");
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        float float3 = contaCorrente2.getLimite();
        float float4 = contaCorrente2.getSaldo();
        float float5 = contaCorrente2.getLimite();
        float float6 = contaCorrente2.getSaldo();
        contaCorrente2.setLimite((float) (byte) 10);
        contaCorrente2.setLimite((float) 100);
        contaCorrente2.setSaldo(100.0f);
        contaCorrente2.setSaldo(35.0f);
        java.lang.Class<?> wildcardClass15 = contaCorrente2.getClass();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, 96.0f);
        // The following exception was thrown during execution in test generation
        try {
            float float4 = contaCorrente2.saque((-3.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Valor invalido");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        float float3 = contaCorrente2.getLimite();
        float float4 = contaCorrente2.getSaldo();
        float float5 = contaCorrente2.getLimite();
        float float6 = contaCorrente2.getSaldo();
        contaCorrente2.setLimite((float) (byte) 10);
        contaCorrente2.setSaldo((float) 100L);
        contaCorrente2.setLimite((float) (byte) 10);
        contaCorrente2.setLimite(90.0f);
        contaCorrente2.setLimite(96.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        codigos.LadoInvalidoException ladoInvalidoException1 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException3 = new codigos.LadoInvalidoException("");
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException3);
        codigos.LadoInvalidoException ladoInvalidoException6 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException8 = new codigos.LadoInvalidoException("");
        ladoInvalidoException6.addSuppressed((java.lang.Throwable) ladoInvalidoException8);
        codigos.LadoInvalidoException ladoInvalidoException11 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException13 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException15 = new codigos.LadoInvalidoException("");
        ladoInvalidoException13.addSuppressed((java.lang.Throwable) ladoInvalidoException15);
        ladoInvalidoException11.addSuppressed((java.lang.Throwable) ladoInvalidoException15);
        java.lang.Throwable[] throwableArray18 = ladoInvalidoException15.getSuppressed();
        ladoInvalidoException8.addSuppressed((java.lang.Throwable) ladoInvalidoException15);
        java.lang.Throwable[] throwableArray20 = ladoInvalidoException15.getSuppressed();
        ladoInvalidoException3.addSuppressed((java.lang.Throwable) ladoInvalidoException15);
        java.lang.Throwable[] throwableArray22 = ladoInvalidoException15.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException24 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException26 = new codigos.LadoInvalidoException("");
        ladoInvalidoException24.addSuppressed((java.lang.Throwable) ladoInvalidoException26);
        codigos.LadoInvalidoException ladoInvalidoException29 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException31 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException33 = new codigos.LadoInvalidoException("");
        ladoInvalidoException31.addSuppressed((java.lang.Throwable) ladoInvalidoException33);
        ladoInvalidoException29.addSuppressed((java.lang.Throwable) ladoInvalidoException33);
        java.lang.Throwable[] throwableArray36 = ladoInvalidoException33.getSuppressed();
        ladoInvalidoException26.addSuppressed((java.lang.Throwable) ladoInvalidoException33);
        java.lang.Throwable[] throwableArray38 = ladoInvalidoException33.getSuppressed();
        ladoInvalidoException15.addSuppressed((java.lang.Throwable) ladoInvalidoException33);
        codigos.LadoInvalidoException ladoInvalidoException41 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException43 = new codigos.LadoInvalidoException("");
        ladoInvalidoException41.addSuppressed((java.lang.Throwable) ladoInvalidoException43);
        codigos.LadoInvalidoException ladoInvalidoException46 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException48 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException50 = new codigos.LadoInvalidoException("");
        ladoInvalidoException48.addSuppressed((java.lang.Throwable) ladoInvalidoException50);
        ladoInvalidoException46.addSuppressed((java.lang.Throwable) ladoInvalidoException50);
        java.lang.Throwable[] throwableArray53 = ladoInvalidoException50.getSuppressed();
        ladoInvalidoException43.addSuppressed((java.lang.Throwable) ladoInvalidoException50);
        java.lang.Throwable[] throwableArray55 = ladoInvalidoException50.getSuppressed();
        ladoInvalidoException15.addSuppressed((java.lang.Throwable) ladoInvalidoException50);
        codigos.LadoInvalidoException ladoInvalidoException58 = new codigos.LadoInvalidoException("codigos.LadoInvalidoException: hi!");
        codigos.LadoInvalidoException ladoInvalidoException60 = new codigos.LadoInvalidoException("hi!");
        ladoInvalidoException58.addSuppressed((java.lang.Throwable) ladoInvalidoException60);
        java.lang.Throwable[] throwableArray62 = ladoInvalidoException60.getSuppressed();
        java.lang.Throwable[] throwableArray63 = ladoInvalidoException60.getSuppressed();
        ladoInvalidoException50.addSuppressed((java.lang.Throwable) ladoInvalidoException60);
        codigos.LadoInvalidoException ladoInvalidoException66 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException68 = new codigos.LadoInvalidoException("");
        ladoInvalidoException66.addSuppressed((java.lang.Throwable) ladoInvalidoException68);
        codigos.LadoInvalidoException ladoInvalidoException71 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException73 = new codigos.LadoInvalidoException("");
        ladoInvalidoException71.addSuppressed((java.lang.Throwable) ladoInvalidoException73);
        codigos.LadoInvalidoException ladoInvalidoException76 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException78 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException80 = new codigos.LadoInvalidoException("");
        ladoInvalidoException78.addSuppressed((java.lang.Throwable) ladoInvalidoException80);
        ladoInvalidoException76.addSuppressed((java.lang.Throwable) ladoInvalidoException80);
        java.lang.Throwable[] throwableArray83 = ladoInvalidoException80.getSuppressed();
        ladoInvalidoException73.addSuppressed((java.lang.Throwable) ladoInvalidoException80);
        java.lang.Throwable[] throwableArray85 = ladoInvalidoException80.getSuppressed();
        ladoInvalidoException68.addSuppressed((java.lang.Throwable) ladoInvalidoException80);
        java.lang.Throwable[] throwableArray87 = ladoInvalidoException80.getSuppressed();
        java.lang.Throwable[] throwableArray88 = ladoInvalidoException80.getSuppressed();
        java.lang.Throwable[] throwableArray89 = ladoInvalidoException80.getSuppressed();
        ladoInvalidoException50.addSuppressed((java.lang.Throwable) ladoInvalidoException80);
        java.lang.String str91 = ladoInvalidoException80.toString();
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertNotNull(throwableArray53);
        org.junit.Assert.assertNotNull(throwableArray55);
        org.junit.Assert.assertNotNull(throwableArray62);
        org.junit.Assert.assertNotNull(throwableArray63);
        org.junit.Assert.assertNotNull(throwableArray83);
        org.junit.Assert.assertNotNull(throwableArray85);
        org.junit.Assert.assertNotNull(throwableArray87);
        org.junit.Assert.assertNotNull(throwableArray88);
        org.junit.Assert.assertNotNull(throwableArray89);
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "codigos.LadoInvalidoException: " + "'", str91, "codigos.LadoInvalidoException: ");
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 10, 0.0f);
        contaCorrente2.setSaldo((float) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            float float6 = contaCorrente2.saque((float) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Saldo Insuficiente");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) '#', 2.0f);
        contaCorrente2.setLimite(88.0f);
        java.lang.Class<?> wildcardClass5 = contaCorrente2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(99.0f, (float) 'a');
        float float3 = contaCorrente2.getSaldo();
        float float4 = contaCorrente2.getSaldo();
        contaCorrente2.setLimite((float) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            float float8 = contaCorrente2.saque((-57.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Valor invalido");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 99.0f + "'", float3 == 99.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 99.0f + "'", float4 == 99.0f);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        codigos.Words words0 = new codigos.Words();
        int int2 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int4 = words0.countWords("NAO FORMA TRIANGULO");
        int int6 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int8 = words0.countWords("NAO FORMA TRIANGULO");
        int int10 = words0.countWords("");
        int int12 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int14 = words0.countWords("");
        int int16 = words0.countWords("codigos.LadoInvalidoException: hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(67.0f, 35.0f);
        float float3 = contaCorrente2.getLimite();
        float float4 = contaCorrente2.getSaldo();
        float float6 = contaCorrente2.saque(96.0f);
        // The following exception was thrown during execution in test generation
        try {
            float float8 = contaCorrente2.saque((float) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Saldo Insuficiente");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 35.0f + "'", float3 == 35.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 67.0f + "'", float4 == 67.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-29.0f) + "'", float6 == (-29.0f));
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        codigos.Words words0 = new codigos.Words();
        int int2 = words0.countWords("codigos.LadoInvalidoException: ");
        int int4 = words0.countWords("");
        int int6 = words0.countWords("ESCALENO");
        int int8 = words0.countWords("");
        int int10 = words0.countWords("codigos.LadoInvalidoException: NAO FORMA TRIANGULO");
        java.lang.Class<?> wildcardClass11 = words0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(32.0f, (float) (byte) 0);
        contaCorrente2.setSaldo(10.0f);
        contaCorrente2.setLimite(9.0f);
        float float7 = contaCorrente2.getSaldo();
        contaCorrente2.setLimite(10.0f);
        float float10 = contaCorrente2.getLimite();
        contaCorrente2.setLimite(62.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(31.0f, 62.0f);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", (float) (short) -1);
        float float8 = pedido0.calculaTaxaDesconto(true, "", (float) 2);
        float float12 = pedido0.calculaTaxaDesconto(false, "", 69.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        codigos.LadoInvalidoException ladoInvalidoException1 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException3 = new codigos.LadoInvalidoException("");
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException3);
        codigos.LadoInvalidoException ladoInvalidoException6 = new codigos.LadoInvalidoException("hi!");
        ladoInvalidoException3.addSuppressed((java.lang.Throwable) ladoInvalidoException6);
        java.lang.Throwable[] throwableArray8 = ladoInvalidoException6.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException10 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException12 = new codigos.LadoInvalidoException("");
        ladoInvalidoException10.addSuppressed((java.lang.Throwable) ladoInvalidoException12);
        codigos.LadoInvalidoException ladoInvalidoException15 = new codigos.LadoInvalidoException("hi!");
        ladoInvalidoException12.addSuppressed((java.lang.Throwable) ladoInvalidoException15);
        codigos.LadoInvalidoException ladoInvalidoException18 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException20 = new codigos.LadoInvalidoException("");
        ladoInvalidoException18.addSuppressed((java.lang.Throwable) ladoInvalidoException20);
        codigos.LadoInvalidoException ladoInvalidoException23 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException25 = new codigos.LadoInvalidoException("");
        ladoInvalidoException23.addSuppressed((java.lang.Throwable) ladoInvalidoException25);
        codigos.LadoInvalidoException ladoInvalidoException28 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException30 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException32 = new codigos.LadoInvalidoException("");
        ladoInvalidoException30.addSuppressed((java.lang.Throwable) ladoInvalidoException32);
        ladoInvalidoException28.addSuppressed((java.lang.Throwable) ladoInvalidoException32);
        java.lang.Throwable[] throwableArray35 = ladoInvalidoException32.getSuppressed();
        ladoInvalidoException25.addSuppressed((java.lang.Throwable) ladoInvalidoException32);
        java.lang.Throwable[] throwableArray37 = ladoInvalidoException32.getSuppressed();
        ladoInvalidoException20.addSuppressed((java.lang.Throwable) ladoInvalidoException32);
        java.lang.Throwable[] throwableArray39 = ladoInvalidoException32.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException41 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException43 = new codigos.LadoInvalidoException("");
        ladoInvalidoException41.addSuppressed((java.lang.Throwable) ladoInvalidoException43);
        codigos.LadoInvalidoException ladoInvalidoException46 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException48 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException50 = new codigos.LadoInvalidoException("");
        ladoInvalidoException48.addSuppressed((java.lang.Throwable) ladoInvalidoException50);
        ladoInvalidoException46.addSuppressed((java.lang.Throwable) ladoInvalidoException50);
        java.lang.Throwable[] throwableArray53 = ladoInvalidoException50.getSuppressed();
        ladoInvalidoException43.addSuppressed((java.lang.Throwable) ladoInvalidoException50);
        java.lang.Throwable[] throwableArray55 = ladoInvalidoException50.getSuppressed();
        ladoInvalidoException32.addSuppressed((java.lang.Throwable) ladoInvalidoException50);
        java.lang.Throwable[] throwableArray57 = ladoInvalidoException50.getSuppressed();
        java.lang.Throwable[] throwableArray58 = ladoInvalidoException50.getSuppressed();
        ladoInvalidoException15.addSuppressed((java.lang.Throwable) ladoInvalidoException50);
        ladoInvalidoException6.addSuppressed((java.lang.Throwable) ladoInvalidoException15);
        java.lang.Class<?> wildcardClass61 = ladoInvalidoException15.getClass();
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertNotNull(throwableArray53);
        org.junit.Assert.assertNotNull(throwableArray55);
        org.junit.Assert.assertNotNull(throwableArray57);
        org.junit.Assert.assertNotNull(throwableArray58);
        org.junit.Assert.assertNotNull(wildcardClass61);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = codigos.Triangulo.classificaTriangulo((int) (byte) -1, 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type codigos.LadoInvalidoException; message: lado invalido");
        } catch (codigos.LadoInvalidoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        codigos.LadoInvalidoException ladoInvalidoException1 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException3 = new codigos.LadoInvalidoException("");
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException3);
        codigos.LadoInvalidoException ladoInvalidoException6 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException8 = new codigos.LadoInvalidoException("");
        ladoInvalidoException6.addSuppressed((java.lang.Throwable) ladoInvalidoException8);
        codigos.LadoInvalidoException ladoInvalidoException11 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException13 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException15 = new codigos.LadoInvalidoException("");
        ladoInvalidoException13.addSuppressed((java.lang.Throwable) ladoInvalidoException15);
        ladoInvalidoException11.addSuppressed((java.lang.Throwable) ladoInvalidoException15);
        java.lang.Throwable[] throwableArray18 = ladoInvalidoException15.getSuppressed();
        ladoInvalidoException8.addSuppressed((java.lang.Throwable) ladoInvalidoException15);
        java.lang.Throwable[] throwableArray20 = ladoInvalidoException15.getSuppressed();
        ladoInvalidoException3.addSuppressed((java.lang.Throwable) ladoInvalidoException15);
        java.lang.Throwable[] throwableArray22 = ladoInvalidoException15.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException24 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException26 = new codigos.LadoInvalidoException("");
        ladoInvalidoException24.addSuppressed((java.lang.Throwable) ladoInvalidoException26);
        codigos.LadoInvalidoException ladoInvalidoException29 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException31 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException33 = new codigos.LadoInvalidoException("");
        ladoInvalidoException31.addSuppressed((java.lang.Throwable) ladoInvalidoException33);
        ladoInvalidoException29.addSuppressed((java.lang.Throwable) ladoInvalidoException33);
        java.lang.Throwable[] throwableArray36 = ladoInvalidoException33.getSuppressed();
        ladoInvalidoException26.addSuppressed((java.lang.Throwable) ladoInvalidoException33);
        codigos.LadoInvalidoException ladoInvalidoException39 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException41 = new codigos.LadoInvalidoException("");
        ladoInvalidoException39.addSuppressed((java.lang.Throwable) ladoInvalidoException41);
        codigos.LadoInvalidoException ladoInvalidoException44 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException46 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException48 = new codigos.LadoInvalidoException("");
        ladoInvalidoException46.addSuppressed((java.lang.Throwable) ladoInvalidoException48);
        ladoInvalidoException44.addSuppressed((java.lang.Throwable) ladoInvalidoException48);
        java.lang.Throwable[] throwableArray51 = ladoInvalidoException48.getSuppressed();
        ladoInvalidoException41.addSuppressed((java.lang.Throwable) ladoInvalidoException48);
        java.lang.Throwable[] throwableArray53 = ladoInvalidoException48.getSuppressed();
        ladoInvalidoException33.addSuppressed((java.lang.Throwable) ladoInvalidoException48);
        codigos.LadoInvalidoException ladoInvalidoException56 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException58 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException60 = new codigos.LadoInvalidoException("");
        ladoInvalidoException58.addSuppressed((java.lang.Throwable) ladoInvalidoException60);
        ladoInvalidoException56.addSuppressed((java.lang.Throwable) ladoInvalidoException60);
        java.lang.Throwable[] throwableArray63 = ladoInvalidoException56.getSuppressed();
        ladoInvalidoException33.addSuppressed((java.lang.Throwable) ladoInvalidoException56);
        codigos.LadoInvalidoException ladoInvalidoException66 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException68 = new codigos.LadoInvalidoException("");
        ladoInvalidoException66.addSuppressed((java.lang.Throwable) ladoInvalidoException68);
        codigos.LadoInvalidoException ladoInvalidoException71 = new codigos.LadoInvalidoException("hi!");
        ladoInvalidoException68.addSuppressed((java.lang.Throwable) ladoInvalidoException71);
        java.lang.Throwable[] throwableArray73 = ladoInvalidoException68.getSuppressed();
        ladoInvalidoException33.addSuppressed((java.lang.Throwable) ladoInvalidoException68);
        java.lang.Throwable[] throwableArray75 = ladoInvalidoException68.getSuppressed();
        ladoInvalidoException15.addSuppressed((java.lang.Throwable) ladoInvalidoException68);
        java.lang.String str77 = ladoInvalidoException68.toString();
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray51);
        org.junit.Assert.assertNotNull(throwableArray53);
        org.junit.Assert.assertNotNull(throwableArray63);
        org.junit.Assert.assertNotNull(throwableArray73);
        org.junit.Assert.assertNotNull(throwableArray75);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "codigos.LadoInvalidoException: " + "'", str77, "codigos.LadoInvalidoException: ");
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        codigos.Words words0 = new codigos.Words();
        int int2 = words0.countWords("codigos.LadoInvalidoException: NAO FORMA TRIANGULO");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        float float3 = contaCorrente2.getSaldo();
        contaCorrente2.setSaldo(100.0f);
        float float6 = contaCorrente2.getLimite();
        contaCorrente2.setSaldo(100.0f);
        float float10 = contaCorrente2.saque((float) 2);
        float float11 = contaCorrente2.getSaldo();
        float float12 = contaCorrente2.getSaldo();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-1.0f) + "'", float6 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 98.0f + "'", float10 == 98.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 98.0f + "'", float11 == 98.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 98.0f + "'", float12 == 98.0f);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", (float) (short) -1);
        float float8 = pedido0.calculaTaxaDesconto(true, "NAO FORMA TRIANGULO", (float) (byte) 0);
        float float12 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: hi!", (float) (-1L));
        float float16 = pedido0.calculaTaxaDesconto(true, "", (float) (byte) 10);
        float float20 = pedido0.calculaTaxaDesconto(false, "ISOSCELES", (-10.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        codigos.LadoInvalidoException ladoInvalidoException1 = new codigos.LadoInvalidoException("codigos.LadoInvalidoException: hi!");
        java.lang.Throwable[] throwableArray2 = ladoInvalidoException1.getSuppressed();
        java.lang.Throwable[] throwableArray3 = ladoInvalidoException1.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException5 = new codigos.LadoInvalidoException("hi!");
        codigos.LadoInvalidoException ladoInvalidoException7 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException9 = new codigos.LadoInvalidoException("");
        ladoInvalidoException7.addSuppressed((java.lang.Throwable) ladoInvalidoException9);
        codigos.LadoInvalidoException ladoInvalidoException12 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException14 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException16 = new codigos.LadoInvalidoException("");
        ladoInvalidoException14.addSuppressed((java.lang.Throwable) ladoInvalidoException16);
        ladoInvalidoException12.addSuppressed((java.lang.Throwable) ladoInvalidoException16);
        java.lang.Throwable[] throwableArray19 = ladoInvalidoException16.getSuppressed();
        ladoInvalidoException9.addSuppressed((java.lang.Throwable) ladoInvalidoException16);
        ladoInvalidoException5.addSuppressed((java.lang.Throwable) ladoInvalidoException16);
        codigos.LadoInvalidoException ladoInvalidoException23 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException25 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException27 = new codigos.LadoInvalidoException("");
        ladoInvalidoException25.addSuppressed((java.lang.Throwable) ladoInvalidoException27);
        ladoInvalidoException23.addSuppressed((java.lang.Throwable) ladoInvalidoException27);
        java.lang.Throwable[] throwableArray30 = ladoInvalidoException27.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException32 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException34 = new codigos.LadoInvalidoException("");
        ladoInvalidoException32.addSuppressed((java.lang.Throwable) ladoInvalidoException34);
        codigos.LadoInvalidoException ladoInvalidoException37 = new codigos.LadoInvalidoException("hi!");
        ladoInvalidoException34.addSuppressed((java.lang.Throwable) ladoInvalidoException37);
        ladoInvalidoException27.addSuppressed((java.lang.Throwable) ladoInvalidoException37);
        java.lang.Throwable[] throwableArray40 = ladoInvalidoException27.getSuppressed();
        ladoInvalidoException5.addSuppressed((java.lang.Throwable) ladoInvalidoException27);
        codigos.LadoInvalidoException ladoInvalidoException43 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException45 = new codigos.LadoInvalidoException("");
        ladoInvalidoException43.addSuppressed((java.lang.Throwable) ladoInvalidoException45);
        codigos.LadoInvalidoException ladoInvalidoException48 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException50 = new codigos.LadoInvalidoException("");
        ladoInvalidoException48.addSuppressed((java.lang.Throwable) ladoInvalidoException50);
        codigos.LadoInvalidoException ladoInvalidoException53 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException55 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException57 = new codigos.LadoInvalidoException("");
        ladoInvalidoException55.addSuppressed((java.lang.Throwable) ladoInvalidoException57);
        ladoInvalidoException53.addSuppressed((java.lang.Throwable) ladoInvalidoException57);
        java.lang.Throwable[] throwableArray60 = ladoInvalidoException57.getSuppressed();
        ladoInvalidoException50.addSuppressed((java.lang.Throwable) ladoInvalidoException57);
        ladoInvalidoException45.addSuppressed((java.lang.Throwable) ladoInvalidoException50);
        java.lang.Throwable[] throwableArray63 = ladoInvalidoException45.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException65 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException67 = new codigos.LadoInvalidoException("");
        ladoInvalidoException65.addSuppressed((java.lang.Throwable) ladoInvalidoException67);
        codigos.LadoInvalidoException ladoInvalidoException70 = new codigos.LadoInvalidoException("hi!");
        ladoInvalidoException67.addSuppressed((java.lang.Throwable) ladoInvalidoException70);
        ladoInvalidoException45.addSuppressed((java.lang.Throwable) ladoInvalidoException70);
        ladoInvalidoException5.addSuppressed((java.lang.Throwable) ladoInvalidoException45);
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException45);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray40);
        org.junit.Assert.assertNotNull(throwableArray60);
        org.junit.Assert.assertNotNull(throwableArray63);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(87.0f, (float) (-1));
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        float float3 = contaCorrente2.getLimite();
        float float4 = contaCorrente2.getSaldo();
        float float5 = contaCorrente2.getLimite();
        float float6 = contaCorrente2.getSaldo();
        contaCorrente2.setLimite((float) (byte) 10);
        contaCorrente2.setSaldo((float) 100L);
        contaCorrente2.setLimite((float) (byte) 10);
        float float14 = contaCorrente2.saque((float) (byte) 100);
        contaCorrente2.setSaldo(32.0f);
        float float17 = contaCorrente2.getLimite();
        float float18 = contaCorrente2.getSaldo();
        contaCorrente2.setLimite((float) (byte) 0);
        float float21 = contaCorrente2.getLimite();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 10.0f + "'", float17 == 10.0f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 32.0f + "'", float18 == 32.0f);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 0.0f + "'", float21 == 0.0f);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(32.0f, (float) (byte) 0);
        contaCorrente2.setSaldo(10.0f);
        contaCorrente2.setLimite(9.0f);
        float float7 = contaCorrente2.getSaldo();
        // The following exception was thrown during execution in test generation
        try {
            float float9 = contaCorrente2.saque(34.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Saldo Insuficiente");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) ' ', 1.0f);
        float float3 = contaCorrente2.getLimite();
        contaCorrente2.setLimite((-11.0f));
        float float6 = contaCorrente2.getSaldo();
        float float7 = contaCorrente2.getSaldo();
        float float8 = contaCorrente2.getSaldo();
        float float10 = contaCorrente2.saque(9.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 32.0f + "'", float6 == 32.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 32.0f + "'", float7 == 32.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 32.0f + "'", float8 == 32.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 23.0f + "'", float10 == 23.0f);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 1L, 96.0f);
        float float3 = contaCorrente2.getSaldo();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = codigos.Triangulo.classificaTriangulo((int) (short) -1, (int) (short) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type codigos.LadoInvalidoException; message: lado invalido");
        } catch (codigos.LadoInvalidoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(52.0f, 78.0f);
        contaCorrente2.setLimite(96.0f);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        contaCorrente2.setLimite((float) 0L);
        contaCorrente2.setLimite((float) (short) 0);
        float float8 = contaCorrente2.saque((float) 1);
        float float9 = contaCorrente2.getSaldo();
        contaCorrente2.setLimite((float) 100);
        float float13 = contaCorrente2.saque(68.0f);
        contaCorrente2.setLimite(34.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 99.0f + "'", float8 == 99.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 99.0f + "'", float9 == 99.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 31.0f + "'", float13 == 31.0f);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        codigos.LadoInvalidoException ladoInvalidoException1 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException3 = new codigos.LadoInvalidoException("");
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException3);
        codigos.LadoInvalidoException ladoInvalidoException6 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException8 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException10 = new codigos.LadoInvalidoException("");
        ladoInvalidoException8.addSuppressed((java.lang.Throwable) ladoInvalidoException10);
        ladoInvalidoException6.addSuppressed((java.lang.Throwable) ladoInvalidoException10);
        java.lang.Throwable[] throwableArray13 = ladoInvalidoException10.getSuppressed();
        ladoInvalidoException3.addSuppressed((java.lang.Throwable) ladoInvalidoException10);
        codigos.LadoInvalidoException ladoInvalidoException16 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException18 = new codigos.LadoInvalidoException("");
        ladoInvalidoException16.addSuppressed((java.lang.Throwable) ladoInvalidoException18);
        codigos.LadoInvalidoException ladoInvalidoException21 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException23 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException25 = new codigos.LadoInvalidoException("");
        ladoInvalidoException23.addSuppressed((java.lang.Throwable) ladoInvalidoException25);
        ladoInvalidoException21.addSuppressed((java.lang.Throwable) ladoInvalidoException25);
        java.lang.Throwable[] throwableArray28 = ladoInvalidoException25.getSuppressed();
        ladoInvalidoException18.addSuppressed((java.lang.Throwable) ladoInvalidoException25);
        java.lang.Throwable[] throwableArray30 = ladoInvalidoException25.getSuppressed();
        ladoInvalidoException10.addSuppressed((java.lang.Throwable) ladoInvalidoException25);
        codigos.LadoInvalidoException ladoInvalidoException33 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException35 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException37 = new codigos.LadoInvalidoException("");
        ladoInvalidoException35.addSuppressed((java.lang.Throwable) ladoInvalidoException37);
        ladoInvalidoException33.addSuppressed((java.lang.Throwable) ladoInvalidoException37);
        java.lang.Throwable[] throwableArray40 = ladoInvalidoException33.getSuppressed();
        ladoInvalidoException10.addSuppressed((java.lang.Throwable) ladoInvalidoException33);
        java.lang.Throwable[] throwableArray42 = ladoInvalidoException10.getSuppressed();
        java.lang.Throwable[] throwableArray43 = ladoInvalidoException10.getSuppressed();
        java.lang.Throwable[] throwableArray44 = ladoInvalidoException10.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray40);
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertNotNull(throwableArray44);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        codigos.Words words0 = new codigos.Words();
        int int2 = words0.countWords("");
        int int4 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!");
        int int6 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        int int8 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int10 = words0.countWords("NAO FORMA TRIANGULO");
        int int12 = words0.countWords("codigos.LadoInvalidoException: ESCALENO");
        int int14 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((-10.0f), (float) (byte) 100);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 10L, 80.0f);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (short) 10, (float) ' ');
        contaCorrente2.setLimite((float) (byte) 0);
        float float5 = contaCorrente2.getSaldo();
        contaCorrente2.setSaldo((float) 1);
        float float8 = contaCorrente2.getLimite();
        contaCorrente2.setLimite((float) 0);
        contaCorrente2.setLimite(90.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10.0f + "'", float5 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        contaCorrente2.setLimite((float) 0L);
        float float6 = contaCorrente2.saque((float) 10L);
        float float7 = contaCorrente2.getLimite();
        float float8 = contaCorrente2.getLimite();
        contaCorrente2.setSaldo(30.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 90.0f + "'", float6 == 90.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        codigos.LadoInvalidoException ladoInvalidoException1 = new codigos.LadoInvalidoException("NAO FORMA TRIANGULO");
        codigos.LadoInvalidoException ladoInvalidoException3 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException5 = new codigos.LadoInvalidoException("");
        ladoInvalidoException3.addSuppressed((java.lang.Throwable) ladoInvalidoException5);
        codigos.LadoInvalidoException ladoInvalidoException8 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException10 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException12 = new codigos.LadoInvalidoException("");
        ladoInvalidoException10.addSuppressed((java.lang.Throwable) ladoInvalidoException12);
        ladoInvalidoException8.addSuppressed((java.lang.Throwable) ladoInvalidoException12);
        java.lang.Throwable[] throwableArray15 = ladoInvalidoException12.getSuppressed();
        ladoInvalidoException5.addSuppressed((java.lang.Throwable) ladoInvalidoException12);
        codigos.LadoInvalidoException ladoInvalidoException18 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException20 = new codigos.LadoInvalidoException("");
        ladoInvalidoException18.addSuppressed((java.lang.Throwable) ladoInvalidoException20);
        codigos.LadoInvalidoException ladoInvalidoException23 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException25 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException27 = new codigos.LadoInvalidoException("");
        ladoInvalidoException25.addSuppressed((java.lang.Throwable) ladoInvalidoException27);
        ladoInvalidoException23.addSuppressed((java.lang.Throwable) ladoInvalidoException27);
        java.lang.Throwable[] throwableArray30 = ladoInvalidoException27.getSuppressed();
        ladoInvalidoException20.addSuppressed((java.lang.Throwable) ladoInvalidoException27);
        java.lang.Throwable[] throwableArray32 = ladoInvalidoException27.getSuppressed();
        ladoInvalidoException12.addSuppressed((java.lang.Throwable) ladoInvalidoException27);
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException12);
        java.lang.Throwable[] throwableArray35 = ladoInvalidoException1.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException37 = new codigos.LadoInvalidoException("codigos.LadoInvalidoException: hi!");
        codigos.LadoInvalidoException ladoInvalidoException39 = new codigos.LadoInvalidoException("hi!");
        ladoInvalidoException37.addSuppressed((java.lang.Throwable) ladoInvalidoException39);
        codigos.LadoInvalidoException ladoInvalidoException42 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException44 = new codigos.LadoInvalidoException("");
        ladoInvalidoException42.addSuppressed((java.lang.Throwable) ladoInvalidoException44);
        codigos.LadoInvalidoException ladoInvalidoException47 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException49 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException51 = new codigos.LadoInvalidoException("");
        ladoInvalidoException49.addSuppressed((java.lang.Throwable) ladoInvalidoException51);
        ladoInvalidoException47.addSuppressed((java.lang.Throwable) ladoInvalidoException51);
        java.lang.Throwable[] throwableArray54 = ladoInvalidoException51.getSuppressed();
        ladoInvalidoException44.addSuppressed((java.lang.Throwable) ladoInvalidoException51);
        codigos.LadoInvalidoException ladoInvalidoException57 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException59 = new codigos.LadoInvalidoException("");
        ladoInvalidoException57.addSuppressed((java.lang.Throwable) ladoInvalidoException59);
        codigos.LadoInvalidoException ladoInvalidoException62 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException64 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException66 = new codigos.LadoInvalidoException("");
        ladoInvalidoException64.addSuppressed((java.lang.Throwable) ladoInvalidoException66);
        ladoInvalidoException62.addSuppressed((java.lang.Throwable) ladoInvalidoException66);
        java.lang.Throwable[] throwableArray69 = ladoInvalidoException66.getSuppressed();
        ladoInvalidoException59.addSuppressed((java.lang.Throwable) ladoInvalidoException66);
        java.lang.Throwable[] throwableArray71 = ladoInvalidoException66.getSuppressed();
        ladoInvalidoException51.addSuppressed((java.lang.Throwable) ladoInvalidoException66);
        codigos.LadoInvalidoException ladoInvalidoException74 = new codigos.LadoInvalidoException("codigos.LadoInvalidoException: hi!");
        ladoInvalidoException66.addSuppressed((java.lang.Throwable) ladoInvalidoException74);
        ladoInvalidoException39.addSuppressed((java.lang.Throwable) ladoInvalidoException74);
        java.lang.Throwable[] throwableArray77 = ladoInvalidoException74.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException79 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException81 = new codigos.LadoInvalidoException("");
        ladoInvalidoException79.addSuppressed((java.lang.Throwable) ladoInvalidoException81);
        codigos.LadoInvalidoException ladoInvalidoException84 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException86 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException88 = new codigos.LadoInvalidoException("");
        ladoInvalidoException86.addSuppressed((java.lang.Throwable) ladoInvalidoException88);
        ladoInvalidoException84.addSuppressed((java.lang.Throwable) ladoInvalidoException88);
        java.lang.Throwable[] throwableArray91 = ladoInvalidoException88.getSuppressed();
        ladoInvalidoException81.addSuppressed((java.lang.Throwable) ladoInvalidoException88);
        ladoInvalidoException74.addSuppressed((java.lang.Throwable) ladoInvalidoException88);
        java.lang.Throwable[] throwableArray94 = ladoInvalidoException88.getSuppressed();
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException88);
        codigos.LadoInvalidoException ladoInvalidoException97 = new codigos.LadoInvalidoException("hi!");
        ladoInvalidoException88.addSuppressed((java.lang.Throwable) ladoInvalidoException97);
        java.lang.Throwable[] throwableArray99 = ladoInvalidoException97.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray54);
        org.junit.Assert.assertNotNull(throwableArray69);
        org.junit.Assert.assertNotNull(throwableArray71);
        org.junit.Assert.assertNotNull(throwableArray77);
        org.junit.Assert.assertNotNull(throwableArray91);
        org.junit.Assert.assertNotNull(throwableArray94);
        org.junit.Assert.assertNotNull(throwableArray99);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        float float3 = contaCorrente2.getSaldo();
        contaCorrente2.setSaldo(100.0f);
        contaCorrente2.setLimite(10.0f);
        float float9 = contaCorrente2.saque((float) 1L);
        contaCorrente2.setLimite((float) (byte) 10);
        contaCorrente2.setLimite((float) (-1));
        contaCorrente2.setSaldo((float) (-1L));
        contaCorrente2.setLimite((float) (-1));
        contaCorrente2.setSaldo((float) (byte) 10);
        contaCorrente2.setLimite(0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 99.0f + "'", float9 == 99.0f);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (short) 10, 1.0f);
        float float3 = contaCorrente2.getSaldo();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) '#', 2.0f);
        float float3 = contaCorrente2.getLimite();
        java.lang.Class<?> wildcardClass4 = contaCorrente2.getClass();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3 == 2.0f);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = codigos.Triangulo.classificaTriangulo((int) (short) -1, 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type codigos.LadoInvalidoException; message: lado invalido");
        } catch (codigos.LadoInvalidoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        java.lang.String str3 = codigos.Triangulo.classificaTriangulo(2, (int) (byte) 100, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "NAO FORMA TRIANGULO" + "'", str3, "NAO FORMA TRIANGULO");
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", (float) (short) -1);
        float float8 = pedido0.calculaTaxaDesconto(true, "NAO FORMA TRIANGULO", (float) (byte) 0);
        float float12 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: hi!", (float) (short) 100);
        float float16 = pedido0.calculaTaxaDesconto(false, "ESCALENO", 89.0f);
        float float20 = pedido0.calculaTaxaDesconto(false, "ESCALENO", 52.0f);
        float float24 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!", (float) '#');
        float float28 = pedido0.calculaTaxaDesconto(true, "EQUILATERO", (float) (short) 10);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10.0f + "'", float12 == 10.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.0f + "'", float24 == 0.0f);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 10.0f + "'", float28 == 10.0f);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        codigos.LadoInvalidoException ladoInvalidoException1 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException3 = new codigos.LadoInvalidoException("");
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException3);
        codigos.LadoInvalidoException ladoInvalidoException6 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException8 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException10 = new codigos.LadoInvalidoException("");
        ladoInvalidoException8.addSuppressed((java.lang.Throwable) ladoInvalidoException10);
        ladoInvalidoException6.addSuppressed((java.lang.Throwable) ladoInvalidoException10);
        java.lang.Throwable[] throwableArray13 = ladoInvalidoException10.getSuppressed();
        ladoInvalidoException3.addSuppressed((java.lang.Throwable) ladoInvalidoException10);
        codigos.LadoInvalidoException ladoInvalidoException16 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException18 = new codigos.LadoInvalidoException("");
        ladoInvalidoException16.addSuppressed((java.lang.Throwable) ladoInvalidoException18);
        codigos.LadoInvalidoException ladoInvalidoException21 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException23 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException25 = new codigos.LadoInvalidoException("");
        ladoInvalidoException23.addSuppressed((java.lang.Throwable) ladoInvalidoException25);
        ladoInvalidoException21.addSuppressed((java.lang.Throwable) ladoInvalidoException25);
        java.lang.Throwable[] throwableArray28 = ladoInvalidoException25.getSuppressed();
        ladoInvalidoException18.addSuppressed((java.lang.Throwable) ladoInvalidoException25);
        java.lang.Throwable[] throwableArray30 = ladoInvalidoException25.getSuppressed();
        ladoInvalidoException10.addSuppressed((java.lang.Throwable) ladoInvalidoException25);
        codigos.LadoInvalidoException ladoInvalidoException33 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException35 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException37 = new codigos.LadoInvalidoException("");
        ladoInvalidoException35.addSuppressed((java.lang.Throwable) ladoInvalidoException37);
        ladoInvalidoException33.addSuppressed((java.lang.Throwable) ladoInvalidoException37);
        java.lang.Throwable[] throwableArray40 = ladoInvalidoException33.getSuppressed();
        ladoInvalidoException10.addSuppressed((java.lang.Throwable) ladoInvalidoException33);
        java.lang.Throwable[] throwableArray42 = ladoInvalidoException10.getSuppressed();
        java.lang.Throwable[] throwableArray43 = ladoInvalidoException10.getSuppressed();
        java.lang.String str44 = ladoInvalidoException10.toString();
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray40);
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "codigos.LadoInvalidoException: " + "'", str44, "codigos.LadoInvalidoException: ");
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(30.0f, 0.0f);
        contaCorrente2.setLimite((-29.0f));
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = codigos.Triangulo.classificaTriangulo(0, (int) (short) -1, 5);
            org.junit.Assert.fail("Expected exception of type codigos.LadoInvalidoException; message: lado invalido");
        } catch (codigos.LadoInvalidoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        codigos.LadoInvalidoException ladoInvalidoException1 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException3 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException5 = new codigos.LadoInvalidoException("");
        ladoInvalidoException3.addSuppressed((java.lang.Throwable) ladoInvalidoException5);
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException5);
        java.lang.Throwable[] throwableArray8 = ladoInvalidoException1.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException10 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException12 = new codigos.LadoInvalidoException("");
        ladoInvalidoException10.addSuppressed((java.lang.Throwable) ladoInvalidoException12);
        codigos.LadoInvalidoException ladoInvalidoException15 = new codigos.LadoInvalidoException("hi!");
        ladoInvalidoException12.addSuppressed((java.lang.Throwable) ladoInvalidoException15);
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException15);
        java.lang.Throwable throwable18 = null;
        // The following exception was thrown during execution in test generation
        try {
            ladoInvalidoException15.addSuppressed(throwable18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray8);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", (float) (short) -1);
        float float8 = pedido0.calculaTaxaDesconto(true, "NAO FORMA TRIANGULO", (float) (byte) 0);
        java.lang.Class<?> wildcardClass9 = pedido0.getClass();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        float float3 = contaCorrente2.getLimite();
        float float4 = contaCorrente2.getSaldo();
        float float5 = contaCorrente2.getLimite();
        float float6 = contaCorrente2.getSaldo();
        contaCorrente2.setLimite((float) (byte) 10);
        contaCorrente2.setSaldo((float) 100L);
        contaCorrente2.setSaldo((float) (byte) 10);
        contaCorrente2.setLimite((float) (byte) 100);
        contaCorrente2.setLimite((float) 3);
        float float17 = contaCorrente2.getSaldo();
        contaCorrente2.setLimite((float) 0L);
        // The following exception was thrown during execution in test generation
        try {
            float float21 = contaCorrente2.saque((float) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Saldo Insuficiente");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 10.0f + "'", float17 == 10.0f);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        codigos.LadoInvalidoException ladoInvalidoException1 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException3 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException5 = new codigos.LadoInvalidoException("");
        ladoInvalidoException3.addSuppressed((java.lang.Throwable) ladoInvalidoException5);
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException5);
        java.lang.Throwable[] throwableArray8 = ladoInvalidoException5.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException10 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException12 = new codigos.LadoInvalidoException("");
        ladoInvalidoException10.addSuppressed((java.lang.Throwable) ladoInvalidoException12);
        codigos.LadoInvalidoException ladoInvalidoException15 = new codigos.LadoInvalidoException("hi!");
        ladoInvalidoException12.addSuppressed((java.lang.Throwable) ladoInvalidoException15);
        ladoInvalidoException5.addSuppressed((java.lang.Throwable) ladoInvalidoException15);
        codigos.LadoInvalidoException ladoInvalidoException19 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException21 = new codigos.LadoInvalidoException("");
        ladoInvalidoException19.addSuppressed((java.lang.Throwable) ladoInvalidoException21);
        codigos.LadoInvalidoException ladoInvalidoException24 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException26 = new codigos.LadoInvalidoException("");
        ladoInvalidoException24.addSuppressed((java.lang.Throwable) ladoInvalidoException26);
        codigos.LadoInvalidoException ladoInvalidoException29 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException31 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException33 = new codigos.LadoInvalidoException("");
        ladoInvalidoException31.addSuppressed((java.lang.Throwable) ladoInvalidoException33);
        ladoInvalidoException29.addSuppressed((java.lang.Throwable) ladoInvalidoException33);
        java.lang.Throwable[] throwableArray36 = ladoInvalidoException33.getSuppressed();
        ladoInvalidoException26.addSuppressed((java.lang.Throwable) ladoInvalidoException33);
        ladoInvalidoException21.addSuppressed((java.lang.Throwable) ladoInvalidoException26);
        java.lang.Throwable[] throwableArray39 = ladoInvalidoException21.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException41 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException43 = new codigos.LadoInvalidoException("");
        ladoInvalidoException41.addSuppressed((java.lang.Throwable) ladoInvalidoException43);
        codigos.LadoInvalidoException ladoInvalidoException46 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException48 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException50 = new codigos.LadoInvalidoException("");
        ladoInvalidoException48.addSuppressed((java.lang.Throwable) ladoInvalidoException50);
        ladoInvalidoException46.addSuppressed((java.lang.Throwable) ladoInvalidoException50);
        java.lang.Throwable[] throwableArray53 = ladoInvalidoException50.getSuppressed();
        ladoInvalidoException43.addSuppressed((java.lang.Throwable) ladoInvalidoException50);
        codigos.LadoInvalidoException ladoInvalidoException56 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException58 = new codigos.LadoInvalidoException("");
        ladoInvalidoException56.addSuppressed((java.lang.Throwable) ladoInvalidoException58);
        codigos.LadoInvalidoException ladoInvalidoException61 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException63 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException65 = new codigos.LadoInvalidoException("");
        ladoInvalidoException63.addSuppressed((java.lang.Throwable) ladoInvalidoException65);
        ladoInvalidoException61.addSuppressed((java.lang.Throwable) ladoInvalidoException65);
        java.lang.Throwable[] throwableArray68 = ladoInvalidoException65.getSuppressed();
        ladoInvalidoException58.addSuppressed((java.lang.Throwable) ladoInvalidoException65);
        java.lang.Throwable[] throwableArray70 = ladoInvalidoException65.getSuppressed();
        ladoInvalidoException50.addSuppressed((java.lang.Throwable) ladoInvalidoException65);
        ladoInvalidoException21.addSuppressed((java.lang.Throwable) ladoInvalidoException65);
        ladoInvalidoException5.addSuppressed((java.lang.Throwable) ladoInvalidoException65);
        java.lang.String str74 = ladoInvalidoException5.toString();
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertNotNull(throwableArray53);
        org.junit.Assert.assertNotNull(throwableArray68);
        org.junit.Assert.assertNotNull(throwableArray70);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "codigos.LadoInvalidoException: " + "'", str74, "codigos.LadoInvalidoException: ");
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (-1L), (float) 1L);
        contaCorrente2.setLimite(7.0f);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        codigos.Words words0 = new codigos.Words();
        int int2 = words0.countWords("");
        int int4 = words0.countWords("NAO FORMA TRIANGULO");
        int int6 = words0.countWords("codigos.LadoInvalidoException: ESCALENO");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 0, 89.0f);
        contaCorrente2.setLimite((float) 0);
        float float5 = contaCorrente2.getLimite();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 'a', (float) 10);
        float float4 = contaCorrente2.saque((float) 1);
        contaCorrente2.setSaldo(88.0f);
        java.lang.Class<?> wildcardClass7 = contaCorrente2.getClass();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 96.0f + "'", float4 == 96.0f);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        float float3 = contaCorrente2.getSaldo();
        contaCorrente2.setSaldo(100.0f);
        float float6 = contaCorrente2.getLimite();
        contaCorrente2.setSaldo(100.0f);
        float float10 = contaCorrente2.saque((float) 2);
        float float11 = contaCorrente2.getLimite();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-1.0f) + "'", float6 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 98.0f + "'", float10 == 98.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + (-1.0f) + "'", float11 == (-1.0f));
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(97.0f, (float) ' ');
        float float3 = contaCorrente2.getLimite();
        float float4 = contaCorrente2.getSaldo();
        float float5 = contaCorrente2.getLimite();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 32.0f + "'", float3 == 32.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 97.0f + "'", float4 == 97.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 32.0f + "'", float5 == 32.0f);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", (float) (short) -1);
        float float8 = pedido0.calculaTaxaDesconto(true, "NAO FORMA TRIANGULO", (float) (byte) 0);
        float float12 = pedido0.calculaTaxaDesconto(true, "", (float) 0L);
        float float16 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!", 23.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10.0f + "'", float12 == 10.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = codigos.Triangulo.classificaTriangulo((int) (byte) -1, (int) (short) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type codigos.LadoInvalidoException; message: lado invalido");
        } catch (codigos.LadoInvalidoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        codigos.LadoInvalidoException ladoInvalidoException1 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException3 = new codigos.LadoInvalidoException("");
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException3);
        codigos.LadoInvalidoException ladoInvalidoException6 = new codigos.LadoInvalidoException("hi!");
        ladoInvalidoException3.addSuppressed((java.lang.Throwable) ladoInvalidoException6);
        java.lang.Throwable[] throwableArray8 = ladoInvalidoException6.getSuppressed();
        java.lang.Throwable[] throwableArray9 = ladoInvalidoException6.getSuppressed();
        java.lang.Throwable[] throwableArray10 = ladoInvalidoException6.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray10);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (short) 0, 0.0f);
        float float3 = contaCorrente2.getLimite();
        contaCorrente2.setLimite((float) 1);
        float float7 = contaCorrente2.saque((float) 1L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-1.0f) + "'", float7 == (-1.0f));
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(67.0f, 45.0f);
        float float3 = contaCorrente2.getLimite();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 45.0f + "'", float3 == 45.0f);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = codigos.Triangulo.classificaTriangulo((int) 'a', (-1), (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type codigos.LadoInvalidoException; message: lado invalido");
        } catch (codigos.LadoInvalidoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(65.0f, (-87.0f));
        contaCorrente2.setLimite((float) 10);
        float float5 = contaCorrente2.getSaldo();
        contaCorrente2.setSaldo((-9.0f));
        java.lang.Class<?> wildcardClass8 = contaCorrente2.getClass();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 65.0f + "'", float5 == 65.0f);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) ' ', 1.0f);
        float float3 = contaCorrente2.getLimite();
        contaCorrente2.setLimite((-11.0f));
        float float6 = contaCorrente2.getSaldo();
        float float7 = contaCorrente2.getSaldo();
        contaCorrente2.setSaldo((float) ' ');
        // The following exception was thrown during execution in test generation
        try {
            float float11 = contaCorrente2.saque(99.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Saldo Insuficiente");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 32.0f + "'", float6 == 32.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 32.0f + "'", float7 == 32.0f);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        float float3 = contaCorrente2.getSaldo();
        contaCorrente2.setSaldo(100.0f);
        contaCorrente2.setLimite(10.0f);
        float float9 = contaCorrente2.saque((float) 1L);
        contaCorrente2.setLimite((float) (byte) 10);
        contaCorrente2.setLimite((float) (-1));
        float float14 = contaCorrente2.getLimite();
        contaCorrente2.setLimite((float) 100L);
        float float18 = contaCorrente2.saque((float) 3);
        contaCorrente2.setLimite(0.0f);
        // The following exception was thrown during execution in test generation
        try {
            float float22 = contaCorrente2.saque((-68.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Valor invalido");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 99.0f + "'", float9 == 99.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + (-1.0f) + "'", float14 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 96.0f + "'", float18 == 96.0f);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        codigos.LadoInvalidoException ladoInvalidoException1 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException3 = new codigos.LadoInvalidoException("");
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException3);
        codigos.LadoInvalidoException ladoInvalidoException6 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException8 = new codigos.LadoInvalidoException("");
        ladoInvalidoException6.addSuppressed((java.lang.Throwable) ladoInvalidoException8);
        codigos.LadoInvalidoException ladoInvalidoException11 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException13 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException15 = new codigos.LadoInvalidoException("");
        ladoInvalidoException13.addSuppressed((java.lang.Throwable) ladoInvalidoException15);
        ladoInvalidoException11.addSuppressed((java.lang.Throwable) ladoInvalidoException15);
        java.lang.Throwable[] throwableArray18 = ladoInvalidoException15.getSuppressed();
        ladoInvalidoException8.addSuppressed((java.lang.Throwable) ladoInvalidoException15);
        ladoInvalidoException3.addSuppressed((java.lang.Throwable) ladoInvalidoException8);
        java.lang.Throwable[] throwableArray21 = ladoInvalidoException8.getSuppressed();
        java.lang.Throwable[] throwableArray22 = ladoInvalidoException8.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray22);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(66.0f, (float) 1);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", (float) (short) -1);
        float float8 = pedido0.calculaTaxaDesconto(true, "NAO FORMA TRIANGULO", (float) (byte) 0);
        float float12 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!", (float) (-1L));
        float float16 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: NAO FORMA TRIANGULO", (float) 1);
        float float20 = pedido0.calculaTaxaDesconto(false, "", (float) ' ');
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10.0f + "'", float12 == 10.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", 1.0f);
        float float8 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: hi!", (float) (short) 10);
        float float12 = pedido0.calculaTaxaDesconto(false, "NAO FORMA TRIANGULO", (-48.0f));
        float float16 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!", 100.0f);
        float float20 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ", 52.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(67.0f, 3.0f);
        contaCorrente2.setLimite((-88.0f));
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", 1.0f);
        float float8 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: hi!", (float) (short) 10);
        float float12 = pedido0.calculaTaxaDesconto(true, "NAO FORMA TRIANGULO", (float) 0L);
        float float16 = pedido0.calculaTaxaDesconto(true, "", 1.0f);
        float float20 = pedido0.calculaTaxaDesconto(false, "NAO FORMA TRIANGULO", (float) (-1L));
        float float24 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!", (float) 100);
        float float28 = pedido0.calculaTaxaDesconto(true, "hi!", (-1.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10.0f + "'", float12 == 10.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.0f + "'", float24 == 0.0f);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 10.0f + "'", float28 == 10.0f);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        float float3 = contaCorrente2.getLimite();
        float float4 = contaCorrente2.getSaldo();
        float float5 = contaCorrente2.getLimite();
        float float6 = contaCorrente2.getSaldo();
        contaCorrente2.setLimite((float) (byte) 10);
        contaCorrente2.setLimite((float) 100);
        float float11 = contaCorrente2.getSaldo();
        float float12 = contaCorrente2.getLimite();
        float float13 = contaCorrente2.getSaldo();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 100.0f + "'", float11 == 100.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 100.0f + "'", float12 == 100.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 100.0f + "'", float13 == 100.0f);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", 1.0f);
        float float8 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: hi!", (float) (short) 10);
        float float12 = pedido0.calculaTaxaDesconto(true, "NAO FORMA TRIANGULO", (float) 0L);
        float float16 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!", (float) 0L);
        float float20 = pedido0.calculaTaxaDesconto(false, "", (float) '4');
        java.lang.Class<?> wildcardClass21 = pedido0.getClass();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10.0f + "'", float12 == 10.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 10, 0.0f);
        float float3 = contaCorrente2.getSaldo();
        float float4 = contaCorrente2.getLimite();
        contaCorrente2.setSaldo((float) ' ');
        contaCorrente2.setSaldo((float) 100);
        float float9 = contaCorrente2.getSaldo();
        contaCorrente2.setSaldo(99.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 100.0f + "'", float9 == 100.0f);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 0, (float) (short) 0);
        contaCorrente2.setLimite((float) 4);
        // The following exception was thrown during execution in test generation
        try {
            float float6 = contaCorrente2.saque(0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Valor invalido");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) -1, 57.0f);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        codigos.LadoInvalidoException ladoInvalidoException1 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException3 = new codigos.LadoInvalidoException("");
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException3);
        codigos.LadoInvalidoException ladoInvalidoException6 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException8 = new codigos.LadoInvalidoException("");
        ladoInvalidoException6.addSuppressed((java.lang.Throwable) ladoInvalidoException8);
        codigos.LadoInvalidoException ladoInvalidoException11 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException13 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException15 = new codigos.LadoInvalidoException("");
        ladoInvalidoException13.addSuppressed((java.lang.Throwable) ladoInvalidoException15);
        ladoInvalidoException11.addSuppressed((java.lang.Throwable) ladoInvalidoException15);
        java.lang.Throwable[] throwableArray18 = ladoInvalidoException15.getSuppressed();
        ladoInvalidoException8.addSuppressed((java.lang.Throwable) ladoInvalidoException15);
        java.lang.Throwable[] throwableArray20 = ladoInvalidoException15.getSuppressed();
        ladoInvalidoException3.addSuppressed((java.lang.Throwable) ladoInvalidoException15);
        java.lang.Throwable[] throwableArray22 = ladoInvalidoException15.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException24 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException26 = new codigos.LadoInvalidoException("");
        ladoInvalidoException24.addSuppressed((java.lang.Throwable) ladoInvalidoException26);
        codigos.LadoInvalidoException ladoInvalidoException29 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException31 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException33 = new codigos.LadoInvalidoException("");
        ladoInvalidoException31.addSuppressed((java.lang.Throwable) ladoInvalidoException33);
        ladoInvalidoException29.addSuppressed((java.lang.Throwable) ladoInvalidoException33);
        java.lang.Throwable[] throwableArray36 = ladoInvalidoException33.getSuppressed();
        ladoInvalidoException26.addSuppressed((java.lang.Throwable) ladoInvalidoException33);
        java.lang.Throwable[] throwableArray38 = ladoInvalidoException33.getSuppressed();
        ladoInvalidoException15.addSuppressed((java.lang.Throwable) ladoInvalidoException33);
        java.lang.Throwable[] throwableArray40 = ladoInvalidoException33.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException42 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException44 = new codigos.LadoInvalidoException("");
        ladoInvalidoException42.addSuppressed((java.lang.Throwable) ladoInvalidoException44);
        codigos.LadoInvalidoException ladoInvalidoException47 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException49 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException51 = new codigos.LadoInvalidoException("");
        ladoInvalidoException49.addSuppressed((java.lang.Throwable) ladoInvalidoException51);
        ladoInvalidoException47.addSuppressed((java.lang.Throwable) ladoInvalidoException51);
        java.lang.Throwable[] throwableArray54 = ladoInvalidoException51.getSuppressed();
        ladoInvalidoException44.addSuppressed((java.lang.Throwable) ladoInvalidoException51);
        codigos.LadoInvalidoException ladoInvalidoException57 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException59 = new codigos.LadoInvalidoException("");
        ladoInvalidoException57.addSuppressed((java.lang.Throwable) ladoInvalidoException59);
        codigos.LadoInvalidoException ladoInvalidoException62 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException64 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException66 = new codigos.LadoInvalidoException("");
        ladoInvalidoException64.addSuppressed((java.lang.Throwable) ladoInvalidoException66);
        ladoInvalidoException62.addSuppressed((java.lang.Throwable) ladoInvalidoException66);
        java.lang.Throwable[] throwableArray69 = ladoInvalidoException66.getSuppressed();
        ladoInvalidoException59.addSuppressed((java.lang.Throwable) ladoInvalidoException66);
        java.lang.Throwable[] throwableArray71 = ladoInvalidoException66.getSuppressed();
        ladoInvalidoException51.addSuppressed((java.lang.Throwable) ladoInvalidoException66);
        codigos.LadoInvalidoException ladoInvalidoException74 = new codigos.LadoInvalidoException("codigos.LadoInvalidoException: hi!");
        ladoInvalidoException66.addSuppressed((java.lang.Throwable) ladoInvalidoException74);
        java.lang.Throwable[] throwableArray76 = ladoInvalidoException66.getSuppressed();
        ladoInvalidoException33.addSuppressed((java.lang.Throwable) ladoInvalidoException66);
        java.lang.Throwable[] throwableArray78 = ladoInvalidoException33.getSuppressed();
        java.lang.Throwable[] throwableArray79 = ladoInvalidoException33.getSuppressed();
        java.lang.String str80 = ladoInvalidoException33.toString();
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertNotNull(throwableArray40);
        org.junit.Assert.assertNotNull(throwableArray54);
        org.junit.Assert.assertNotNull(throwableArray69);
        org.junit.Assert.assertNotNull(throwableArray71);
        org.junit.Assert.assertNotNull(throwableArray76);
        org.junit.Assert.assertNotNull(throwableArray78);
        org.junit.Assert.assertNotNull(throwableArray79);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "codigos.LadoInvalidoException: " + "'", str80, "codigos.LadoInvalidoException: ");
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        codigos.LadoInvalidoException ladoInvalidoException1 = new codigos.LadoInvalidoException("");
        java.lang.Throwable[] throwableArray2 = ladoInvalidoException1.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException4 = new codigos.LadoInvalidoException("hi!");
        codigos.LadoInvalidoException ladoInvalidoException6 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException8 = new codigos.LadoInvalidoException("");
        ladoInvalidoException6.addSuppressed((java.lang.Throwable) ladoInvalidoException8);
        codigos.LadoInvalidoException ladoInvalidoException11 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException13 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException15 = new codigos.LadoInvalidoException("");
        ladoInvalidoException13.addSuppressed((java.lang.Throwable) ladoInvalidoException15);
        ladoInvalidoException11.addSuppressed((java.lang.Throwable) ladoInvalidoException15);
        java.lang.Throwable[] throwableArray18 = ladoInvalidoException15.getSuppressed();
        ladoInvalidoException8.addSuppressed((java.lang.Throwable) ladoInvalidoException15);
        ladoInvalidoException4.addSuppressed((java.lang.Throwable) ladoInvalidoException15);
        codigos.LadoInvalidoException ladoInvalidoException22 = new codigos.LadoInvalidoException("codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!");
        codigos.LadoInvalidoException ladoInvalidoException24 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException26 = new codigos.LadoInvalidoException("");
        ladoInvalidoException24.addSuppressed((java.lang.Throwable) ladoInvalidoException26);
        codigos.LadoInvalidoException ladoInvalidoException29 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException31 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException33 = new codigos.LadoInvalidoException("");
        ladoInvalidoException31.addSuppressed((java.lang.Throwable) ladoInvalidoException33);
        ladoInvalidoException29.addSuppressed((java.lang.Throwable) ladoInvalidoException33);
        java.lang.Throwable[] throwableArray36 = ladoInvalidoException33.getSuppressed();
        ladoInvalidoException26.addSuppressed((java.lang.Throwable) ladoInvalidoException33);
        java.lang.Throwable[] throwableArray38 = ladoInvalidoException33.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException40 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException42 = new codigos.LadoInvalidoException("");
        ladoInvalidoException40.addSuppressed((java.lang.Throwable) ladoInvalidoException42);
        codigos.LadoInvalidoException ladoInvalidoException45 = new codigos.LadoInvalidoException("hi!");
        ladoInvalidoException42.addSuppressed((java.lang.Throwable) ladoInvalidoException45);
        codigos.LadoInvalidoException ladoInvalidoException48 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException50 = new codigos.LadoInvalidoException("");
        ladoInvalidoException48.addSuppressed((java.lang.Throwable) ladoInvalidoException50);
        codigos.LadoInvalidoException ladoInvalidoException53 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException55 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException57 = new codigos.LadoInvalidoException("");
        ladoInvalidoException55.addSuppressed((java.lang.Throwable) ladoInvalidoException57);
        ladoInvalidoException53.addSuppressed((java.lang.Throwable) ladoInvalidoException57);
        java.lang.Throwable[] throwableArray60 = ladoInvalidoException57.getSuppressed();
        ladoInvalidoException50.addSuppressed((java.lang.Throwable) ladoInvalidoException57);
        codigos.LadoInvalidoException ladoInvalidoException63 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException65 = new codigos.LadoInvalidoException("");
        ladoInvalidoException63.addSuppressed((java.lang.Throwable) ladoInvalidoException65);
        codigos.LadoInvalidoException ladoInvalidoException68 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException70 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException72 = new codigos.LadoInvalidoException("");
        ladoInvalidoException70.addSuppressed((java.lang.Throwable) ladoInvalidoException72);
        ladoInvalidoException68.addSuppressed((java.lang.Throwable) ladoInvalidoException72);
        java.lang.Throwable[] throwableArray75 = ladoInvalidoException72.getSuppressed();
        ladoInvalidoException65.addSuppressed((java.lang.Throwable) ladoInvalidoException72);
        java.lang.Throwable[] throwableArray77 = ladoInvalidoException72.getSuppressed();
        ladoInvalidoException57.addSuppressed((java.lang.Throwable) ladoInvalidoException72);
        ladoInvalidoException42.addSuppressed((java.lang.Throwable) ladoInvalidoException57);
        ladoInvalidoException33.addSuppressed((java.lang.Throwable) ladoInvalidoException42);
        ladoInvalidoException22.addSuppressed((java.lang.Throwable) ladoInvalidoException33);
        ladoInvalidoException15.addSuppressed((java.lang.Throwable) ladoInvalidoException22);
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException15);
        java.lang.Throwable[] throwableArray84 = ladoInvalidoException15.getSuppressed();
        java.lang.Throwable[] throwableArray85 = ladoInvalidoException15.getSuppressed();
        java.lang.Throwable[] throwableArray86 = ladoInvalidoException15.getSuppressed();
        java.lang.Class<?> wildcardClass87 = ladoInvalidoException15.getClass();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertNotNull(throwableArray60);
        org.junit.Assert.assertNotNull(throwableArray75);
        org.junit.Assert.assertNotNull(throwableArray77);
        org.junit.Assert.assertNotNull(throwableArray84);
        org.junit.Assert.assertNotNull(throwableArray85);
        org.junit.Assert.assertNotNull(throwableArray86);
        org.junit.Assert.assertNotNull(wildcardClass87);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((-52.0f), (float) (short) 1);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(91.0f, (float) 3);
        contaCorrente2.setSaldo((float) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            float float6 = contaCorrente2.saque(96.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Saldo Insuficiente");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        java.lang.String str3 = codigos.Triangulo.classificaTriangulo((int) (short) 100, (int) (byte) 1, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "NAO FORMA TRIANGULO" + "'", str3, "NAO FORMA TRIANGULO");
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = codigos.Triangulo.classificaTriangulo((int) (short) 0, (int) '#', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type codigos.LadoInvalidoException; message: lado invalido");
        } catch (codigos.LadoInvalidoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", (float) (short) -1);
        float float8 = pedido0.calculaTaxaDesconto(true, "", (float) 2);
        float float12 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: ESCALENO", 90.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = codigos.Triangulo.classificaTriangulo(2, 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type codigos.LadoInvalidoException; message: lado invalido");
        } catch (codigos.LadoInvalidoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((-57.0f), (float) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            float float4 = contaCorrente2.saque((float) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Saldo Insuficiente");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        codigos.LadoInvalidoException ladoInvalidoException1 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException3 = new codigos.LadoInvalidoException("");
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException3);
        codigos.LadoInvalidoException ladoInvalidoException6 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException8 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException10 = new codigos.LadoInvalidoException("");
        ladoInvalidoException8.addSuppressed((java.lang.Throwable) ladoInvalidoException10);
        ladoInvalidoException6.addSuppressed((java.lang.Throwable) ladoInvalidoException10);
        java.lang.Throwable[] throwableArray13 = ladoInvalidoException10.getSuppressed();
        ladoInvalidoException3.addSuppressed((java.lang.Throwable) ladoInvalidoException10);
        codigos.LadoInvalidoException ladoInvalidoException16 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException18 = new codigos.LadoInvalidoException("");
        ladoInvalidoException16.addSuppressed((java.lang.Throwable) ladoInvalidoException18);
        codigos.LadoInvalidoException ladoInvalidoException21 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException23 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException25 = new codigos.LadoInvalidoException("");
        ladoInvalidoException23.addSuppressed((java.lang.Throwable) ladoInvalidoException25);
        ladoInvalidoException21.addSuppressed((java.lang.Throwable) ladoInvalidoException25);
        java.lang.Throwable[] throwableArray28 = ladoInvalidoException25.getSuppressed();
        ladoInvalidoException18.addSuppressed((java.lang.Throwable) ladoInvalidoException25);
        java.lang.Throwable[] throwableArray30 = ladoInvalidoException25.getSuppressed();
        ladoInvalidoException10.addSuppressed((java.lang.Throwable) ladoInvalidoException25);
        java.lang.Throwable[] throwableArray32 = ladoInvalidoException10.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException34 = new codigos.LadoInvalidoException("codigos.LadoInvalidoException: hi!");
        ladoInvalidoException10.addSuppressed((java.lang.Throwable) ladoInvalidoException34);
        java.lang.String str36 = ladoInvalidoException10.toString();
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "codigos.LadoInvalidoException: " + "'", str36, "codigos.LadoInvalidoException: ");
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(10.0f, (float) (byte) 0);
        contaCorrente2.setSaldo((float) 1L);
        contaCorrente2.setSaldo((float) '4');
        // The following exception was thrown during execution in test generation
        try {
            float float8 = contaCorrente2.saque(68.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Saldo Insuficiente");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        codigos.LadoInvalidoException ladoInvalidoException1 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException3 = new codigos.LadoInvalidoException("");
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException3);
        codigos.LadoInvalidoException ladoInvalidoException6 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException8 = new codigos.LadoInvalidoException("");
        ladoInvalidoException6.addSuppressed((java.lang.Throwable) ladoInvalidoException8);
        codigos.LadoInvalidoException ladoInvalidoException11 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException13 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException15 = new codigos.LadoInvalidoException("");
        ladoInvalidoException13.addSuppressed((java.lang.Throwable) ladoInvalidoException15);
        ladoInvalidoException11.addSuppressed((java.lang.Throwable) ladoInvalidoException15);
        java.lang.Throwable[] throwableArray18 = ladoInvalidoException15.getSuppressed();
        ladoInvalidoException8.addSuppressed((java.lang.Throwable) ladoInvalidoException15);
        ladoInvalidoException3.addSuppressed((java.lang.Throwable) ladoInvalidoException8);
        java.lang.Throwable[] throwableArray21 = ladoInvalidoException3.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException23 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException25 = new codigos.LadoInvalidoException("");
        ladoInvalidoException23.addSuppressed((java.lang.Throwable) ladoInvalidoException25);
        codigos.LadoInvalidoException ladoInvalidoException28 = new codigos.LadoInvalidoException("hi!");
        ladoInvalidoException25.addSuppressed((java.lang.Throwable) ladoInvalidoException28);
        ladoInvalidoException3.addSuppressed((java.lang.Throwable) ladoInvalidoException28);
        codigos.LadoInvalidoException ladoInvalidoException32 = new codigos.LadoInvalidoException("codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        ladoInvalidoException28.addSuppressed((java.lang.Throwable) ladoInvalidoException32);
        java.lang.Class<?> wildcardClass34 = ladoInvalidoException32.getClass();
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = codigos.Triangulo.classificaTriangulo((int) (byte) 100, (int) (short) 0, 100);
            org.junit.Assert.fail("Expected exception of type codigos.LadoInvalidoException; message: lado invalido");
        } catch (codigos.LadoInvalidoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 0L, 1.0f);
        float float3 = contaCorrente2.getSaldo();
        float float4 = contaCorrente2.getLimite();
        contaCorrente2.setSaldo((-90.0f));
        java.lang.Class<?> wildcardClass7 = contaCorrente2.getClass();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        codigos.Words words0 = new codigos.Words();
        int int2 = words0.countWords("");
        int int4 = words0.countWords("");
        int int6 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int8 = words0.countWords("ESCALENO");
        int int10 = words0.countWords("codigos.LadoInvalidoException: NAO FORMA TRIANGULO");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 10, 0.0f);
        contaCorrente2.setSaldo((float) (byte) 0);
        float float5 = contaCorrente2.getSaldo();
        contaCorrente2.setLimite((float) (byte) 1);
        float float8 = contaCorrente2.getSaldo();
        float float9 = contaCorrente2.getLimite();
        contaCorrente2.setLimite((float) (byte) 0);
        java.lang.Class<?> wildcardClass12 = contaCorrente2.getClass();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        float float3 = contaCorrente2.getLimite();
        contaCorrente2.setSaldo((float) (short) 0);
        contaCorrente2.setLimite((float) 'a');
        float float8 = contaCorrente2.getSaldo();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 10, 0.0f);
        float float3 = contaCorrente2.getSaldo();
        contaCorrente2.setSaldo(10.0f);
        contaCorrente2.setSaldo((float) 1);
        float float8 = contaCorrente2.getSaldo();
        java.lang.Class<?> wildcardClass9 = contaCorrente2.getClass();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 'a', (float) (-1L));
        float float3 = contaCorrente2.getLimite();
        contaCorrente2.setLimite(66.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 10, 0.0f);
        contaCorrente2.setSaldo((float) (byte) 0);
        float float5 = contaCorrente2.getSaldo();
        contaCorrente2.setLimite((float) (byte) 1);
        float float8 = contaCorrente2.getSaldo();
        float float9 = contaCorrente2.getSaldo();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = codigos.Triangulo.classificaTriangulo(1, (int) (short) -1, 100);
            org.junit.Assert.fail("Expected exception of type codigos.LadoInvalidoException; message: lado invalido");
        } catch (codigos.LadoInvalidoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        codigos.LadoInvalidoException ladoInvalidoException1 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException3 = new codigos.LadoInvalidoException("");
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException3);
        codigos.LadoInvalidoException ladoInvalidoException6 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException8 = new codigos.LadoInvalidoException("");
        ladoInvalidoException6.addSuppressed((java.lang.Throwable) ladoInvalidoException8);
        codigos.LadoInvalidoException ladoInvalidoException11 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException13 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException15 = new codigos.LadoInvalidoException("");
        ladoInvalidoException13.addSuppressed((java.lang.Throwable) ladoInvalidoException15);
        ladoInvalidoException11.addSuppressed((java.lang.Throwable) ladoInvalidoException15);
        java.lang.Throwable[] throwableArray18 = ladoInvalidoException15.getSuppressed();
        ladoInvalidoException8.addSuppressed((java.lang.Throwable) ladoInvalidoException15);
        java.lang.Throwable[] throwableArray20 = ladoInvalidoException15.getSuppressed();
        ladoInvalidoException3.addSuppressed((java.lang.Throwable) ladoInvalidoException15);
        java.lang.Throwable[] throwableArray22 = ladoInvalidoException15.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException24 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException26 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException28 = new codigos.LadoInvalidoException("");
        ladoInvalidoException26.addSuppressed((java.lang.Throwable) ladoInvalidoException28);
        ladoInvalidoException24.addSuppressed((java.lang.Throwable) ladoInvalidoException28);
        java.lang.Throwable[] throwableArray31 = ladoInvalidoException28.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException33 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException35 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException37 = new codigos.LadoInvalidoException("");
        ladoInvalidoException35.addSuppressed((java.lang.Throwable) ladoInvalidoException37);
        ladoInvalidoException33.addSuppressed((java.lang.Throwable) ladoInvalidoException37);
        java.lang.Throwable[] throwableArray40 = ladoInvalidoException33.getSuppressed();
        ladoInvalidoException28.addSuppressed((java.lang.Throwable) ladoInvalidoException33);
        ladoInvalidoException15.addSuppressed((java.lang.Throwable) ladoInvalidoException28);
        java.lang.Throwable[] throwableArray43 = ladoInvalidoException15.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException45 = new codigos.LadoInvalidoException("NAO FORMA TRIANGULO");
        codigos.LadoInvalidoException ladoInvalidoException47 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException49 = new codigos.LadoInvalidoException("");
        ladoInvalidoException47.addSuppressed((java.lang.Throwable) ladoInvalidoException49);
        codigos.LadoInvalidoException ladoInvalidoException52 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException54 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException56 = new codigos.LadoInvalidoException("");
        ladoInvalidoException54.addSuppressed((java.lang.Throwable) ladoInvalidoException56);
        ladoInvalidoException52.addSuppressed((java.lang.Throwable) ladoInvalidoException56);
        java.lang.Throwable[] throwableArray59 = ladoInvalidoException56.getSuppressed();
        ladoInvalidoException49.addSuppressed((java.lang.Throwable) ladoInvalidoException56);
        codigos.LadoInvalidoException ladoInvalidoException62 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException64 = new codigos.LadoInvalidoException("");
        ladoInvalidoException62.addSuppressed((java.lang.Throwable) ladoInvalidoException64);
        codigos.LadoInvalidoException ladoInvalidoException67 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException69 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException71 = new codigos.LadoInvalidoException("");
        ladoInvalidoException69.addSuppressed((java.lang.Throwable) ladoInvalidoException71);
        ladoInvalidoException67.addSuppressed((java.lang.Throwable) ladoInvalidoException71);
        java.lang.Throwable[] throwableArray74 = ladoInvalidoException71.getSuppressed();
        ladoInvalidoException64.addSuppressed((java.lang.Throwable) ladoInvalidoException71);
        java.lang.Throwable[] throwableArray76 = ladoInvalidoException71.getSuppressed();
        ladoInvalidoException56.addSuppressed((java.lang.Throwable) ladoInvalidoException71);
        ladoInvalidoException45.addSuppressed((java.lang.Throwable) ladoInvalidoException56);
        ladoInvalidoException15.addSuppressed((java.lang.Throwable) ladoInvalidoException45);
        java.lang.Class<?> wildcardClass80 = ladoInvalidoException45.getClass();
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(throwableArray40);
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertNotNull(throwableArray59);
        org.junit.Assert.assertNotNull(throwableArray74);
        org.junit.Assert.assertNotNull(throwableArray76);
        org.junit.Assert.assertNotNull(wildcardClass80);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = codigos.Triangulo.classificaTriangulo((int) ' ', (-1), (int) '4');
            org.junit.Assert.fail("Expected exception of type codigos.LadoInvalidoException; message: lado invalido");
        } catch (codigos.LadoInvalidoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", 1.0f);
        float float8 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: hi!", (float) (short) 10);
        float float12 = pedido0.calculaTaxaDesconto(true, "NAO FORMA TRIANGULO", (float) 0L);
        float float16 = pedido0.calculaTaxaDesconto(true, "", 1.0f);
        float float20 = pedido0.calculaTaxaDesconto(false, "NAO FORMA TRIANGULO", (float) (-1L));
        float float24 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!", (float) 100);
        float float28 = pedido0.calculaTaxaDesconto(true, "", (float) (byte) -1);
        float float32 = pedido0.calculaTaxaDesconto(false, "NAO FORMA TRIANGULO", 97.0f);
        float float36 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: ", (float) 10L);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10.0f + "'", float12 == 10.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.0f + "'", float24 == 0.0f);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 10.0f + "'", float28 == 10.0f);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 0.0f + "'", float32 == 0.0f);
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 0.0f + "'", float36 == 0.0f);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        float float3 = contaCorrente2.getLimite();
        float float4 = contaCorrente2.getSaldo();
        float float5 = contaCorrente2.getLimite();
        float float6 = contaCorrente2.getSaldo();
        contaCorrente2.setLimite((float) (byte) 10);
        contaCorrente2.setSaldo((float) 100L);
        float float11 = contaCorrente2.getLimite();
        float float12 = contaCorrente2.getSaldo();
        contaCorrente2.setSaldo(47.0f);
        float float15 = contaCorrente2.getLimite();
        contaCorrente2.setLimite(68.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 100.0f + "'", float12 == 100.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10.0f + "'", float15 == 10.0f);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(99.0f, (float) 'a');
        float float3 = contaCorrente2.getLimite();
        contaCorrente2.setSaldo((float) '4');
        float float6 = contaCorrente2.getLimite();
        float float7 = contaCorrente2.getLimite();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 97.0f + "'", float6 == 97.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 97.0f + "'", float7 == 97.0f);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = codigos.Triangulo.classificaTriangulo((int) (byte) 10, (int) (byte) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type codigos.LadoInvalidoException; message: lado invalido");
        } catch (codigos.LadoInvalidoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        float float3 = contaCorrente2.getLimite();
        float float4 = contaCorrente2.getSaldo();
        float float5 = contaCorrente2.getLimite();
        contaCorrente2.setSaldo((-1.0f));
        contaCorrente2.setSaldo(0.0f);
        // The following exception was thrown during execution in test generation
        try {
            float float11 = contaCorrente2.saque(0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Valor invalido");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        java.lang.String str3 = codigos.Triangulo.classificaTriangulo(5, 3, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "NAO FORMA TRIANGULO" + "'", str3, "NAO FORMA TRIANGULO");
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 1, 88.0f);
        float float3 = contaCorrente2.getSaldo();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(13.0f, (float) (byte) 100);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(90.0f, (float) (-1));
        contaCorrente2.setLimite((float) 0);
        contaCorrente2.setSaldo((float) 'a');
        contaCorrente2.setSaldo((float) (byte) -1);
        contaCorrente2.setSaldo((float) ' ');
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(23.0f, 89.0f);
        contaCorrente2.setLimite((-41.0f));
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) ' ', 1.0f);
        float float3 = contaCorrente2.getLimite();
        contaCorrente2.setLimite((-11.0f));
        java.lang.Class<?> wildcardClass6 = contaCorrente2.getClass();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (short) 10, (float) (byte) -1);
        float float3 = contaCorrente2.getSaldo();
        float float4 = contaCorrente2.getSaldo();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        codigos.LadoInvalidoException ladoInvalidoException1 = new codigos.LadoInvalidoException("NAO FORMA TRIANGULO");
        codigos.LadoInvalidoException ladoInvalidoException3 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException5 = new codigos.LadoInvalidoException("");
        ladoInvalidoException3.addSuppressed((java.lang.Throwable) ladoInvalidoException5);
        codigos.LadoInvalidoException ladoInvalidoException8 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException10 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException12 = new codigos.LadoInvalidoException("");
        ladoInvalidoException10.addSuppressed((java.lang.Throwable) ladoInvalidoException12);
        ladoInvalidoException8.addSuppressed((java.lang.Throwable) ladoInvalidoException12);
        java.lang.Throwable[] throwableArray15 = ladoInvalidoException12.getSuppressed();
        ladoInvalidoException5.addSuppressed((java.lang.Throwable) ladoInvalidoException12);
        codigos.LadoInvalidoException ladoInvalidoException18 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException20 = new codigos.LadoInvalidoException("");
        ladoInvalidoException18.addSuppressed((java.lang.Throwable) ladoInvalidoException20);
        codigos.LadoInvalidoException ladoInvalidoException23 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException25 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException27 = new codigos.LadoInvalidoException("");
        ladoInvalidoException25.addSuppressed((java.lang.Throwable) ladoInvalidoException27);
        ladoInvalidoException23.addSuppressed((java.lang.Throwable) ladoInvalidoException27);
        java.lang.Throwable[] throwableArray30 = ladoInvalidoException27.getSuppressed();
        ladoInvalidoException20.addSuppressed((java.lang.Throwable) ladoInvalidoException27);
        java.lang.Throwable[] throwableArray32 = ladoInvalidoException27.getSuppressed();
        ladoInvalidoException12.addSuppressed((java.lang.Throwable) ladoInvalidoException27);
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException12);
        java.lang.Throwable[] throwableArray35 = ladoInvalidoException1.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException37 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException39 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException41 = new codigos.LadoInvalidoException("");
        ladoInvalidoException39.addSuppressed((java.lang.Throwable) ladoInvalidoException41);
        ladoInvalidoException37.addSuppressed((java.lang.Throwable) ladoInvalidoException41);
        java.lang.Throwable[] throwableArray44 = ladoInvalidoException37.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException46 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException48 = new codigos.LadoInvalidoException("");
        ladoInvalidoException46.addSuppressed((java.lang.Throwable) ladoInvalidoException48);
        codigos.LadoInvalidoException ladoInvalidoException51 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException53 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException55 = new codigos.LadoInvalidoException("");
        ladoInvalidoException53.addSuppressed((java.lang.Throwable) ladoInvalidoException55);
        ladoInvalidoException51.addSuppressed((java.lang.Throwable) ladoInvalidoException55);
        java.lang.Throwable[] throwableArray58 = ladoInvalidoException55.getSuppressed();
        ladoInvalidoException48.addSuppressed((java.lang.Throwable) ladoInvalidoException55);
        codigos.LadoInvalidoException ladoInvalidoException61 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException63 = new codigos.LadoInvalidoException("");
        ladoInvalidoException61.addSuppressed((java.lang.Throwable) ladoInvalidoException63);
        codigos.LadoInvalidoException ladoInvalidoException66 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException68 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException70 = new codigos.LadoInvalidoException("");
        ladoInvalidoException68.addSuppressed((java.lang.Throwable) ladoInvalidoException70);
        ladoInvalidoException66.addSuppressed((java.lang.Throwable) ladoInvalidoException70);
        java.lang.Throwable[] throwableArray73 = ladoInvalidoException70.getSuppressed();
        ladoInvalidoException63.addSuppressed((java.lang.Throwable) ladoInvalidoException70);
        java.lang.Throwable[] throwableArray75 = ladoInvalidoException70.getSuppressed();
        ladoInvalidoException55.addSuppressed((java.lang.Throwable) ladoInvalidoException70);
        codigos.LadoInvalidoException ladoInvalidoException78 = new codigos.LadoInvalidoException("codigos.LadoInvalidoException: hi!");
        ladoInvalidoException70.addSuppressed((java.lang.Throwable) ladoInvalidoException78);
        java.lang.Throwable[] throwableArray80 = ladoInvalidoException78.getSuppressed();
        ladoInvalidoException37.addSuppressed((java.lang.Throwable) ladoInvalidoException78);
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException37);
        java.lang.String str83 = ladoInvalidoException1.toString();
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertNotNull(throwableArray58);
        org.junit.Assert.assertNotNull(throwableArray73);
        org.junit.Assert.assertNotNull(throwableArray75);
        org.junit.Assert.assertNotNull(throwableArray80);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "codigos.LadoInvalidoException: NAO FORMA TRIANGULO" + "'", str83, "codigos.LadoInvalidoException: NAO FORMA TRIANGULO");
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(30.0f, 55.0f);
        float float3 = contaCorrente2.getLimite();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 55.0f + "'", float3 == 55.0f);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        float float3 = contaCorrente2.getLimite();
        float float4 = contaCorrente2.getSaldo();
        float float5 = contaCorrente2.getLimite();
        float float6 = contaCorrente2.getSaldo();
        contaCorrente2.setLimite((float) (byte) 10);
        contaCorrente2.setSaldo((float) 100L);
        float float11 = contaCorrente2.getLimite();
        float float12 = contaCorrente2.getLimite();
        float float14 = contaCorrente2.saque(55.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10.0f + "'", float12 == 10.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 45.0f + "'", float14 == 45.0f);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) '#', 2.0f);
        contaCorrente2.setSaldo((float) 0L);
        contaCorrente2.setSaldo((float) (short) 1);
        java.lang.Class<?> wildcardClass7 = contaCorrente2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(3.0f, (-45.0f));
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        codigos.LadoInvalidoException ladoInvalidoException1 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException3 = new codigos.LadoInvalidoException("");
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException3);
        codigos.LadoInvalidoException ladoInvalidoException6 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException8 = new codigos.LadoInvalidoException("");
        ladoInvalidoException6.addSuppressed((java.lang.Throwable) ladoInvalidoException8);
        codigos.LadoInvalidoException ladoInvalidoException11 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException13 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException15 = new codigos.LadoInvalidoException("");
        ladoInvalidoException13.addSuppressed((java.lang.Throwable) ladoInvalidoException15);
        ladoInvalidoException11.addSuppressed((java.lang.Throwable) ladoInvalidoException15);
        java.lang.Throwable[] throwableArray18 = ladoInvalidoException15.getSuppressed();
        ladoInvalidoException8.addSuppressed((java.lang.Throwable) ladoInvalidoException15);
        ladoInvalidoException3.addSuppressed((java.lang.Throwable) ladoInvalidoException8);
        java.lang.Throwable[] throwableArray21 = ladoInvalidoException3.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException23 = new codigos.LadoInvalidoException("");
        java.lang.Throwable[] throwableArray24 = ladoInvalidoException23.getSuppressed();
        java.lang.Throwable[] throwableArray25 = ladoInvalidoException23.getSuppressed();
        ladoInvalidoException3.addSuppressed((java.lang.Throwable) ladoInvalidoException23);
        codigos.LadoInvalidoException ladoInvalidoException28 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException30 = new codigos.LadoInvalidoException("");
        ladoInvalidoException28.addSuppressed((java.lang.Throwable) ladoInvalidoException30);
        codigos.LadoInvalidoException ladoInvalidoException33 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException35 = new codigos.LadoInvalidoException("");
        ladoInvalidoException33.addSuppressed((java.lang.Throwable) ladoInvalidoException35);
        codigos.LadoInvalidoException ladoInvalidoException38 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException40 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException42 = new codigos.LadoInvalidoException("");
        ladoInvalidoException40.addSuppressed((java.lang.Throwable) ladoInvalidoException42);
        ladoInvalidoException38.addSuppressed((java.lang.Throwable) ladoInvalidoException42);
        java.lang.Throwable[] throwableArray45 = ladoInvalidoException42.getSuppressed();
        ladoInvalidoException35.addSuppressed((java.lang.Throwable) ladoInvalidoException42);
        ladoInvalidoException30.addSuppressed((java.lang.Throwable) ladoInvalidoException35);
        java.lang.Throwable[] throwableArray48 = ladoInvalidoException30.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException50 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException52 = new codigos.LadoInvalidoException("");
        ladoInvalidoException50.addSuppressed((java.lang.Throwable) ladoInvalidoException52);
        codigos.LadoInvalidoException ladoInvalidoException55 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException57 = new codigos.LadoInvalidoException("");
        ladoInvalidoException55.addSuppressed((java.lang.Throwable) ladoInvalidoException57);
        codigos.LadoInvalidoException ladoInvalidoException60 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException62 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException64 = new codigos.LadoInvalidoException("");
        ladoInvalidoException62.addSuppressed((java.lang.Throwable) ladoInvalidoException64);
        ladoInvalidoException60.addSuppressed((java.lang.Throwable) ladoInvalidoException64);
        java.lang.Throwable[] throwableArray67 = ladoInvalidoException64.getSuppressed();
        ladoInvalidoException57.addSuppressed((java.lang.Throwable) ladoInvalidoException64);
        java.lang.Throwable[] throwableArray69 = ladoInvalidoException64.getSuppressed();
        ladoInvalidoException52.addSuppressed((java.lang.Throwable) ladoInvalidoException64);
        java.lang.Throwable[] throwableArray71 = ladoInvalidoException64.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException73 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException75 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException77 = new codigos.LadoInvalidoException("");
        ladoInvalidoException75.addSuppressed((java.lang.Throwable) ladoInvalidoException77);
        ladoInvalidoException73.addSuppressed((java.lang.Throwable) ladoInvalidoException77);
        java.lang.Throwable[] throwableArray80 = ladoInvalidoException77.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException82 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException84 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException86 = new codigos.LadoInvalidoException("");
        ladoInvalidoException84.addSuppressed((java.lang.Throwable) ladoInvalidoException86);
        ladoInvalidoException82.addSuppressed((java.lang.Throwable) ladoInvalidoException86);
        java.lang.Throwable[] throwableArray89 = ladoInvalidoException82.getSuppressed();
        ladoInvalidoException77.addSuppressed((java.lang.Throwable) ladoInvalidoException82);
        ladoInvalidoException64.addSuppressed((java.lang.Throwable) ladoInvalidoException77);
        ladoInvalidoException30.addSuppressed((java.lang.Throwable) ladoInvalidoException77);
        java.lang.Throwable[] throwableArray93 = ladoInvalidoException30.getSuppressed();
        ladoInvalidoException23.addSuppressed((java.lang.Throwable) ladoInvalidoException30);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray45);
        org.junit.Assert.assertNotNull(throwableArray48);
        org.junit.Assert.assertNotNull(throwableArray67);
        org.junit.Assert.assertNotNull(throwableArray69);
        org.junit.Assert.assertNotNull(throwableArray71);
        org.junit.Assert.assertNotNull(throwableArray80);
        org.junit.Assert.assertNotNull(throwableArray89);
        org.junit.Assert.assertNotNull(throwableArray93);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (float) (short) -1);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        codigos.Words words0 = new codigos.Words();
        int int2 = words0.countWords("codigos.LadoInvalidoException: ");
        int int4 = words0.countWords("");
        int int6 = words0.countWords("ESCALENO");
        int int8 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        int int10 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!");
        int int12 = words0.countWords("codigos.LadoInvalidoException: ESCALENO");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(99.0f, (float) 'a');
        float float3 = contaCorrente2.getLimite();
        contaCorrente2.setSaldo((float) 100);
        float float7 = contaCorrente2.saque((float) 10);
        contaCorrente2.setSaldo(0.0f);
        float float10 = contaCorrente2.getLimite();
        java.lang.Class<?> wildcardClass11 = contaCorrente2.getClass();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 90.0f + "'", float7 == 90.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 97.0f + "'", float10 == 97.0f);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        float float3 = contaCorrente2.getSaldo();
        contaCorrente2.setSaldo(100.0f);
        contaCorrente2.setLimite(10.0f);
        float float8 = contaCorrente2.getLimite();
        contaCorrente2.setLimite(98.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(67.0f, 35.0f);
        float float3 = contaCorrente2.getLimite();
        float float4 = contaCorrente2.getSaldo();
        contaCorrente2.setLimite((float) 4);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 35.0f + "'", float3 == 35.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 67.0f + "'", float4 == 67.0f);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(0.0f, (float) 100L);
        float float3 = contaCorrente2.getSaldo();
        contaCorrente2.setSaldo((float) (byte) 100);
        float float7 = contaCorrente2.saque((float) 1L);
        float float8 = contaCorrente2.getSaldo();
        contaCorrente2.setSaldo(0.0f);
        float float11 = contaCorrente2.getSaldo();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 99.0f + "'", float7 == 99.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 99.0f + "'", float8 == 99.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", 1.0f);
        float float8 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: hi!", (float) (short) 10);
        float float12 = pedido0.calculaTaxaDesconto(true, "NAO FORMA TRIANGULO", (float) 0L);
        float float16 = pedido0.calculaTaxaDesconto(true, "NAO FORMA TRIANGULO", (float) 1);
        float float20 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!", (float) (-1));
        float float24 = pedido0.calculaTaxaDesconto(true, "", 35.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10.0f + "'", float12 == 10.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 10.0f + "'", float24 == 10.0f);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        codigos.Words words0 = new codigos.Words();
        int int2 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int4 = words0.countWords("NAO FORMA TRIANGULO");
        int int6 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int8 = words0.countWords("NAO FORMA TRIANGULO");
        int int10 = words0.countWords("codigos.LadoInvalidoException: ");
        int int12 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        int int14 = words0.countWords("");
        int int16 = words0.countWords("");
        int int18 = words0.countWords("codigos.LadoInvalidoException: ESCALENO");
        int int20 = words0.countWords("ESCALENO");
        int int22 = words0.countWords("ESCALENO");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        float float3 = contaCorrente2.getSaldo();
        contaCorrente2.setSaldo(100.0f);
        contaCorrente2.setLimite(10.0f);
        float float9 = contaCorrente2.saque((float) 1L);
        float float10 = contaCorrente2.getLimite();
        contaCorrente2.setLimite(10.0f);
        float float13 = contaCorrente2.getLimite();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 99.0f + "'", float9 == 99.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 10.0f + "'", float13 == 10.0f);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        float float3 = contaCorrente2.getLimite();
        float float4 = contaCorrente2.getSaldo();
        float float5 = contaCorrente2.getLimite();
        float float6 = contaCorrente2.getSaldo();
        contaCorrente2.setLimite((float) (byte) 10);
        contaCorrente2.setSaldo((float) 100L);
        contaCorrente2.setSaldo((float) (byte) 10);
        contaCorrente2.setLimite((float) (byte) 100);
        float float15 = contaCorrente2.getLimite();
        float float17 = contaCorrente2.saque((float) 'a');
        float float18 = contaCorrente2.getSaldo();
        float float19 = contaCorrente2.getLimite();
        float float20 = contaCorrente2.getLimite();
        java.lang.Class<?> wildcardClass21 = contaCorrente2.getClass();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 100.0f + "'", float15 == 100.0f);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + (-87.0f) + "'", float17 == (-87.0f));
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + (-87.0f) + "'", float18 == (-87.0f));
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 100.0f + "'", float19 == 100.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 100.0f + "'", float20 == 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(7.0f, 31.0f);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (short) 10, (float) ' ');
        float float3 = contaCorrente2.getLimite();
        contaCorrente2.setLimite((float) (-1));
        contaCorrente2.setSaldo((float) '#');
        contaCorrente2.setSaldo(9.0f);
        float float10 = contaCorrente2.getLimite();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 32.0f + "'", float3 == 32.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-1.0f) + "'", float10 == (-1.0f));
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        codigos.Words words0 = new codigos.Words();
        int int2 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int4 = words0.countWords("NAO FORMA TRIANGULO");
        int int6 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int8 = words0.countWords("NAO FORMA TRIANGULO");
        int int10 = words0.countWords("NAO FORMA TRIANGULO");
        int int12 = words0.countWords("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((-1.0f), 68.0f);
        float float3 = contaCorrente2.getLimite();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 68.0f + "'", float3 == 68.0f);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(0.0f, (float) (short) -1);
        contaCorrente2.setSaldo((-9.0f));
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(99.0f, (float) 'a');
        float float3 = contaCorrente2.getLimite();
        contaCorrente2.setSaldo((-10.0f));
        float float7 = contaCorrente2.saque((float) (short) 1);
        float float8 = contaCorrente2.getLimite();
        float float9 = contaCorrente2.getLimite();
        contaCorrente2.setLimite(0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-11.0f) + "'", float7 == (-11.0f));
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 97.0f + "'", float8 == 97.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 97.0f + "'", float9 == 97.0f);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        codigos.LadoInvalidoException ladoInvalidoException1 = new codigos.LadoInvalidoException("hi!");
        codigos.LadoInvalidoException ladoInvalidoException3 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException5 = new codigos.LadoInvalidoException("");
        ladoInvalidoException3.addSuppressed((java.lang.Throwable) ladoInvalidoException5);
        codigos.LadoInvalidoException ladoInvalidoException8 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException10 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException12 = new codigos.LadoInvalidoException("");
        ladoInvalidoException10.addSuppressed((java.lang.Throwable) ladoInvalidoException12);
        ladoInvalidoException8.addSuppressed((java.lang.Throwable) ladoInvalidoException12);
        java.lang.Throwable[] throwableArray15 = ladoInvalidoException12.getSuppressed();
        ladoInvalidoException5.addSuppressed((java.lang.Throwable) ladoInvalidoException12);
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException12);
        codigos.LadoInvalidoException ladoInvalidoException19 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException21 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException23 = new codigos.LadoInvalidoException("");
        ladoInvalidoException21.addSuppressed((java.lang.Throwable) ladoInvalidoException23);
        ladoInvalidoException19.addSuppressed((java.lang.Throwable) ladoInvalidoException23);
        java.lang.Throwable[] throwableArray26 = ladoInvalidoException23.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException28 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException30 = new codigos.LadoInvalidoException("");
        ladoInvalidoException28.addSuppressed((java.lang.Throwable) ladoInvalidoException30);
        codigos.LadoInvalidoException ladoInvalidoException33 = new codigos.LadoInvalidoException("hi!");
        ladoInvalidoException30.addSuppressed((java.lang.Throwable) ladoInvalidoException33);
        ladoInvalidoException23.addSuppressed((java.lang.Throwable) ladoInvalidoException33);
        java.lang.Throwable[] throwableArray36 = ladoInvalidoException23.getSuppressed();
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException23);
        java.lang.String str38 = ladoInvalidoException23.toString();
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "codigos.LadoInvalidoException: " + "'", str38, "codigos.LadoInvalidoException: ");
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        codigos.LadoInvalidoException ladoInvalidoException1 = new codigos.LadoInvalidoException("codigos.LadoInvalidoException: hi!");
        codigos.LadoInvalidoException ladoInvalidoException3 = new codigos.LadoInvalidoException("hi!");
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException3);
        java.lang.Throwable[] throwableArray5 = ladoInvalidoException3.getSuppressed();
        java.lang.Throwable[] throwableArray6 = ladoInvalidoException3.getSuppressed();
        java.lang.Throwable[] throwableArray7 = ladoInvalidoException3.getSuppressed();
        java.lang.String str8 = ladoInvalidoException3.toString();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "codigos.LadoInvalidoException: hi!" + "'", str8, "codigos.LadoInvalidoException: hi!");
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(1.0f, 1.0f);
        contaCorrente2.setSaldo((-45.0f));
        float float5 = contaCorrente2.getSaldo();
        contaCorrente2.setLimite(2.0f);
        float float8 = contaCorrente2.getSaldo();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-45.0f) + "'", float5 == (-45.0f));
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-45.0f) + "'", float8 == (-45.0f));
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 100L, (float) 10);
        float float3 = contaCorrente2.getSaldo();
        float float4 = contaCorrente2.getLimite();
        contaCorrente2.setLimite(99.0f);
        contaCorrente2.setLimite(65.0f);
        contaCorrente2.setSaldo((float) ' ');
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        codigos.LadoInvalidoException ladoInvalidoException1 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException3 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException5 = new codigos.LadoInvalidoException("");
        ladoInvalidoException3.addSuppressed((java.lang.Throwable) ladoInvalidoException5);
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException5);
        java.lang.Throwable[] throwableArray8 = ladoInvalidoException5.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException10 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException12 = new codigos.LadoInvalidoException("");
        ladoInvalidoException10.addSuppressed((java.lang.Throwable) ladoInvalidoException12);
        codigos.LadoInvalidoException ladoInvalidoException15 = new codigos.LadoInvalidoException("hi!");
        ladoInvalidoException12.addSuppressed((java.lang.Throwable) ladoInvalidoException15);
        ladoInvalidoException5.addSuppressed((java.lang.Throwable) ladoInvalidoException15);
        codigos.LadoInvalidoException ladoInvalidoException19 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException21 = new codigos.LadoInvalidoException("");
        ladoInvalidoException19.addSuppressed((java.lang.Throwable) ladoInvalidoException21);
        codigos.LadoInvalidoException ladoInvalidoException24 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException26 = new codigos.LadoInvalidoException("");
        ladoInvalidoException24.addSuppressed((java.lang.Throwable) ladoInvalidoException26);
        codigos.LadoInvalidoException ladoInvalidoException29 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException31 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException33 = new codigos.LadoInvalidoException("");
        ladoInvalidoException31.addSuppressed((java.lang.Throwable) ladoInvalidoException33);
        ladoInvalidoException29.addSuppressed((java.lang.Throwable) ladoInvalidoException33);
        java.lang.Throwable[] throwableArray36 = ladoInvalidoException33.getSuppressed();
        ladoInvalidoException26.addSuppressed((java.lang.Throwable) ladoInvalidoException33);
        ladoInvalidoException21.addSuppressed((java.lang.Throwable) ladoInvalidoException26);
        java.lang.Throwable[] throwableArray39 = ladoInvalidoException21.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException41 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException43 = new codigos.LadoInvalidoException("");
        ladoInvalidoException41.addSuppressed((java.lang.Throwable) ladoInvalidoException43);
        codigos.LadoInvalidoException ladoInvalidoException46 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException48 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException50 = new codigos.LadoInvalidoException("");
        ladoInvalidoException48.addSuppressed((java.lang.Throwable) ladoInvalidoException50);
        ladoInvalidoException46.addSuppressed((java.lang.Throwable) ladoInvalidoException50);
        java.lang.Throwable[] throwableArray53 = ladoInvalidoException50.getSuppressed();
        ladoInvalidoException43.addSuppressed((java.lang.Throwable) ladoInvalidoException50);
        codigos.LadoInvalidoException ladoInvalidoException56 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException58 = new codigos.LadoInvalidoException("");
        ladoInvalidoException56.addSuppressed((java.lang.Throwable) ladoInvalidoException58);
        codigos.LadoInvalidoException ladoInvalidoException61 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException63 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException65 = new codigos.LadoInvalidoException("");
        ladoInvalidoException63.addSuppressed((java.lang.Throwable) ladoInvalidoException65);
        ladoInvalidoException61.addSuppressed((java.lang.Throwable) ladoInvalidoException65);
        java.lang.Throwable[] throwableArray68 = ladoInvalidoException65.getSuppressed();
        ladoInvalidoException58.addSuppressed((java.lang.Throwable) ladoInvalidoException65);
        java.lang.Throwable[] throwableArray70 = ladoInvalidoException65.getSuppressed();
        ladoInvalidoException50.addSuppressed((java.lang.Throwable) ladoInvalidoException65);
        ladoInvalidoException21.addSuppressed((java.lang.Throwable) ladoInvalidoException65);
        ladoInvalidoException5.addSuppressed((java.lang.Throwable) ladoInvalidoException65);
        java.lang.Throwable[] throwableArray74 = ladoInvalidoException5.getSuppressed();
        java.lang.Throwable[] throwableArray75 = ladoInvalidoException5.getSuppressed();
        java.lang.Throwable[] throwableArray76 = ladoInvalidoException5.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertNotNull(throwableArray53);
        org.junit.Assert.assertNotNull(throwableArray68);
        org.junit.Assert.assertNotNull(throwableArray70);
        org.junit.Assert.assertNotNull(throwableArray74);
        org.junit.Assert.assertNotNull(throwableArray75);
        org.junit.Assert.assertNotNull(throwableArray76);
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(1.0f, (float) '4');
        float float3 = contaCorrente2.getLimite();
        float float5 = contaCorrente2.saque(42.0f);
        contaCorrente2.setSaldo((-2.0f));
        contaCorrente2.setLimite((float) 10L);
        contaCorrente2.setSaldo((-32.0f));
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 52.0f + "'", float3 == 52.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-41.0f) + "'", float5 == (-41.0f));
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(67.0f, (float) '#');
        contaCorrente2.setLimite((-14.0f));
        contaCorrente2.setLimite((float) '4');
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) '4', (float) 4);
        float float3 = contaCorrente2.getSaldo();
        contaCorrente2.setLimite((float) (short) -1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 52.0f + "'", float3 == 52.0f);
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 100L, (float) 10);
        float float3 = contaCorrente2.getSaldo();
        float float4 = contaCorrente2.getLimite();
        float float6 = contaCorrente2.saque((float) 1L);
        contaCorrente2.setLimite((float) 1);
        float float10 = contaCorrente2.saque(52.0f);
        float float12 = contaCorrente2.saque(2.0f);
        contaCorrente2.setLimite((float) 0);
        // The following exception was thrown during execution in test generation
        try {
            float float16 = contaCorrente2.saque((-29.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Valor invalido");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 99.0f + "'", float6 == 99.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 47.0f + "'", float10 == 47.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 45.0f + "'", float12 == 45.0f);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        codigos.LadoInvalidoException ladoInvalidoException1 = new codigos.LadoInvalidoException("codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        java.lang.Throwable[] throwableArray2 = ladoInvalidoException1.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException4 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException6 = new codigos.LadoInvalidoException("");
        ladoInvalidoException4.addSuppressed((java.lang.Throwable) ladoInvalidoException6);
        codigos.LadoInvalidoException ladoInvalidoException9 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException11 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException13 = new codigos.LadoInvalidoException("");
        ladoInvalidoException11.addSuppressed((java.lang.Throwable) ladoInvalidoException13);
        ladoInvalidoException9.addSuppressed((java.lang.Throwable) ladoInvalidoException13);
        java.lang.Throwable[] throwableArray16 = ladoInvalidoException13.getSuppressed();
        ladoInvalidoException6.addSuppressed((java.lang.Throwable) ladoInvalidoException13);
        codigos.LadoInvalidoException ladoInvalidoException19 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException21 = new codigos.LadoInvalidoException("");
        ladoInvalidoException19.addSuppressed((java.lang.Throwable) ladoInvalidoException21);
        codigos.LadoInvalidoException ladoInvalidoException24 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException26 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException28 = new codigos.LadoInvalidoException("");
        ladoInvalidoException26.addSuppressed((java.lang.Throwable) ladoInvalidoException28);
        ladoInvalidoException24.addSuppressed((java.lang.Throwable) ladoInvalidoException28);
        java.lang.Throwable[] throwableArray31 = ladoInvalidoException28.getSuppressed();
        ladoInvalidoException21.addSuppressed((java.lang.Throwable) ladoInvalidoException28);
        java.lang.Throwable[] throwableArray33 = ladoInvalidoException28.getSuppressed();
        ladoInvalidoException13.addSuppressed((java.lang.Throwable) ladoInvalidoException28);
        codigos.LadoInvalidoException ladoInvalidoException36 = new codigos.LadoInvalidoException("codigos.LadoInvalidoException: hi!");
        ladoInvalidoException28.addSuppressed((java.lang.Throwable) ladoInvalidoException36);
        java.lang.Throwable[] throwableArray38 = ladoInvalidoException36.getSuppressed();
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException36);
        codigos.LadoInvalidoException ladoInvalidoException41 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException43 = new codigos.LadoInvalidoException("");
        ladoInvalidoException41.addSuppressed((java.lang.Throwable) ladoInvalidoException43);
        codigos.LadoInvalidoException ladoInvalidoException46 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException48 = new codigos.LadoInvalidoException("");
        ladoInvalidoException46.addSuppressed((java.lang.Throwable) ladoInvalidoException48);
        codigos.LadoInvalidoException ladoInvalidoException51 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException53 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException55 = new codigos.LadoInvalidoException("");
        ladoInvalidoException53.addSuppressed((java.lang.Throwable) ladoInvalidoException55);
        ladoInvalidoException51.addSuppressed((java.lang.Throwable) ladoInvalidoException55);
        java.lang.Throwable[] throwableArray58 = ladoInvalidoException55.getSuppressed();
        ladoInvalidoException48.addSuppressed((java.lang.Throwable) ladoInvalidoException55);
        java.lang.Throwable[] throwableArray60 = ladoInvalidoException55.getSuppressed();
        ladoInvalidoException43.addSuppressed((java.lang.Throwable) ladoInvalidoException55);
        java.lang.Throwable[] throwableArray62 = ladoInvalidoException55.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException64 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException66 = new codigos.LadoInvalidoException("");
        ladoInvalidoException64.addSuppressed((java.lang.Throwable) ladoInvalidoException66);
        codigos.LadoInvalidoException ladoInvalidoException69 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException71 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException73 = new codigos.LadoInvalidoException("");
        ladoInvalidoException71.addSuppressed((java.lang.Throwable) ladoInvalidoException73);
        ladoInvalidoException69.addSuppressed((java.lang.Throwable) ladoInvalidoException73);
        java.lang.Throwable[] throwableArray76 = ladoInvalidoException73.getSuppressed();
        ladoInvalidoException66.addSuppressed((java.lang.Throwable) ladoInvalidoException73);
        java.lang.Throwable[] throwableArray78 = ladoInvalidoException73.getSuppressed();
        ladoInvalidoException55.addSuppressed((java.lang.Throwable) ladoInvalidoException73);
        java.lang.Throwable[] throwableArray80 = ladoInvalidoException73.getSuppressed();
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException73);
        java.lang.Throwable[] throwableArray82 = ladoInvalidoException1.getSuppressed();
        java.lang.String str83 = ladoInvalidoException1.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertNotNull(throwableArray58);
        org.junit.Assert.assertNotNull(throwableArray60);
        org.junit.Assert.assertNotNull(throwableArray62);
        org.junit.Assert.assertNotNull(throwableArray76);
        org.junit.Assert.assertNotNull(throwableArray78);
        org.junit.Assert.assertNotNull(throwableArray80);
        org.junit.Assert.assertNotNull(throwableArray82);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: " + "'", str83, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(67.0f, (float) 10);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(1.0f, 1.0f);
        contaCorrente2.setSaldo((float) 100);
        float float5 = contaCorrente2.getSaldo();
        float float7 = contaCorrente2.saque((float) (byte) 1);
        contaCorrente2.setLimite((float) (short) 1);
        float float10 = contaCorrente2.getSaldo();
        contaCorrente2.setSaldo((float) 1L);
        float float13 = contaCorrente2.getLimite();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 100.0f + "'", float5 == 100.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 99.0f + "'", float7 == 99.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 99.0f + "'", float10 == 99.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        codigos.LadoInvalidoException ladoInvalidoException1 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException3 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException5 = new codigos.LadoInvalidoException("");
        ladoInvalidoException3.addSuppressed((java.lang.Throwable) ladoInvalidoException5);
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException5);
        codigos.LadoInvalidoException ladoInvalidoException9 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException11 = new codigos.LadoInvalidoException("");
        ladoInvalidoException9.addSuppressed((java.lang.Throwable) ladoInvalidoException11);
        codigos.LadoInvalidoException ladoInvalidoException14 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException16 = new codigos.LadoInvalidoException("");
        ladoInvalidoException14.addSuppressed((java.lang.Throwable) ladoInvalidoException16);
        codigos.LadoInvalidoException ladoInvalidoException19 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException21 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException23 = new codigos.LadoInvalidoException("");
        ladoInvalidoException21.addSuppressed((java.lang.Throwable) ladoInvalidoException23);
        ladoInvalidoException19.addSuppressed((java.lang.Throwable) ladoInvalidoException23);
        java.lang.Throwable[] throwableArray26 = ladoInvalidoException23.getSuppressed();
        ladoInvalidoException16.addSuppressed((java.lang.Throwable) ladoInvalidoException23);
        ladoInvalidoException11.addSuppressed((java.lang.Throwable) ladoInvalidoException16);
        codigos.LadoInvalidoException ladoInvalidoException30 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException32 = new codigos.LadoInvalidoException("");
        ladoInvalidoException30.addSuppressed((java.lang.Throwable) ladoInvalidoException32);
        codigos.LadoInvalidoException ladoInvalidoException35 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException37 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException39 = new codigos.LadoInvalidoException("");
        ladoInvalidoException37.addSuppressed((java.lang.Throwable) ladoInvalidoException39);
        ladoInvalidoException35.addSuppressed((java.lang.Throwable) ladoInvalidoException39);
        java.lang.Throwable[] throwableArray42 = ladoInvalidoException39.getSuppressed();
        ladoInvalidoException32.addSuppressed((java.lang.Throwable) ladoInvalidoException39);
        codigos.LadoInvalidoException ladoInvalidoException45 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException47 = new codigos.LadoInvalidoException("");
        ladoInvalidoException45.addSuppressed((java.lang.Throwable) ladoInvalidoException47);
        codigos.LadoInvalidoException ladoInvalidoException50 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException52 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException54 = new codigos.LadoInvalidoException("");
        ladoInvalidoException52.addSuppressed((java.lang.Throwable) ladoInvalidoException54);
        ladoInvalidoException50.addSuppressed((java.lang.Throwable) ladoInvalidoException54);
        java.lang.Throwable[] throwableArray57 = ladoInvalidoException54.getSuppressed();
        ladoInvalidoException47.addSuppressed((java.lang.Throwable) ladoInvalidoException54);
        java.lang.Throwable[] throwableArray59 = ladoInvalidoException54.getSuppressed();
        ladoInvalidoException39.addSuppressed((java.lang.Throwable) ladoInvalidoException54);
        codigos.LadoInvalidoException ladoInvalidoException62 = new codigos.LadoInvalidoException("codigos.LadoInvalidoException: hi!");
        ladoInvalidoException54.addSuppressed((java.lang.Throwable) ladoInvalidoException62);
        java.lang.Throwable[] throwableArray64 = ladoInvalidoException54.getSuppressed();
        ladoInvalidoException16.addSuppressed((java.lang.Throwable) ladoInvalidoException54);
        ladoInvalidoException5.addSuppressed((java.lang.Throwable) ladoInvalidoException54);
        java.lang.Throwable throwable67 = null;
        // The following exception was thrown during execution in test generation
        try {
            ladoInvalidoException5.addSuppressed(throwable67);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertNotNull(throwableArray57);
        org.junit.Assert.assertNotNull(throwableArray59);
        org.junit.Assert.assertNotNull(throwableArray64);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", (float) (short) -1);
        float float8 = pedido0.calculaTaxaDesconto(true, "NAO FORMA TRIANGULO", (float) (byte) 0);
        float float12 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: hi!", (float) (short) 100);
        float float16 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: ", 35.0f);
        float float20 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: ", (float) (byte) -1);
        float float24 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ESCALENO", 9.0f);
        float float28 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", (float) '4');
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10.0f + "'", float12 == 10.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 10.0f + "'", float20 == 10.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 10.0f + "'", float24 == 10.0f);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 10.0f + "'", float28 == 10.0f);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = codigos.Triangulo.classificaTriangulo((int) (byte) -1, 1, 2);
            org.junit.Assert.fail("Expected exception of type codigos.LadoInvalidoException; message: lado invalido");
        } catch (codigos.LadoInvalidoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = codigos.Triangulo.classificaTriangulo((int) '#', (int) '#', (-1));
            org.junit.Assert.fail("Expected exception of type codigos.LadoInvalidoException; message: lado invalido");
        } catch (codigos.LadoInvalidoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        codigos.LadoInvalidoException ladoInvalidoException1 = new codigos.LadoInvalidoException("hi!");
        codigos.LadoInvalidoException ladoInvalidoException3 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException5 = new codigos.LadoInvalidoException("");
        ladoInvalidoException3.addSuppressed((java.lang.Throwable) ladoInvalidoException5);
        codigos.LadoInvalidoException ladoInvalidoException8 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException10 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException12 = new codigos.LadoInvalidoException("");
        ladoInvalidoException10.addSuppressed((java.lang.Throwable) ladoInvalidoException12);
        ladoInvalidoException8.addSuppressed((java.lang.Throwable) ladoInvalidoException12);
        java.lang.Throwable[] throwableArray15 = ladoInvalidoException12.getSuppressed();
        ladoInvalidoException5.addSuppressed((java.lang.Throwable) ladoInvalidoException12);
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException12);
        codigos.LadoInvalidoException ladoInvalidoException19 = new codigos.LadoInvalidoException("codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!");
        codigos.LadoInvalidoException ladoInvalidoException21 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException23 = new codigos.LadoInvalidoException("");
        ladoInvalidoException21.addSuppressed((java.lang.Throwable) ladoInvalidoException23);
        codigos.LadoInvalidoException ladoInvalidoException26 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException28 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException30 = new codigos.LadoInvalidoException("");
        ladoInvalidoException28.addSuppressed((java.lang.Throwable) ladoInvalidoException30);
        ladoInvalidoException26.addSuppressed((java.lang.Throwable) ladoInvalidoException30);
        java.lang.Throwable[] throwableArray33 = ladoInvalidoException30.getSuppressed();
        ladoInvalidoException23.addSuppressed((java.lang.Throwable) ladoInvalidoException30);
        java.lang.Throwable[] throwableArray35 = ladoInvalidoException30.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException37 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException39 = new codigos.LadoInvalidoException("");
        ladoInvalidoException37.addSuppressed((java.lang.Throwable) ladoInvalidoException39);
        codigos.LadoInvalidoException ladoInvalidoException42 = new codigos.LadoInvalidoException("hi!");
        ladoInvalidoException39.addSuppressed((java.lang.Throwable) ladoInvalidoException42);
        codigos.LadoInvalidoException ladoInvalidoException45 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException47 = new codigos.LadoInvalidoException("");
        ladoInvalidoException45.addSuppressed((java.lang.Throwable) ladoInvalidoException47);
        codigos.LadoInvalidoException ladoInvalidoException50 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException52 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException54 = new codigos.LadoInvalidoException("");
        ladoInvalidoException52.addSuppressed((java.lang.Throwable) ladoInvalidoException54);
        ladoInvalidoException50.addSuppressed((java.lang.Throwable) ladoInvalidoException54);
        java.lang.Throwable[] throwableArray57 = ladoInvalidoException54.getSuppressed();
        ladoInvalidoException47.addSuppressed((java.lang.Throwable) ladoInvalidoException54);
        codigos.LadoInvalidoException ladoInvalidoException60 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException62 = new codigos.LadoInvalidoException("");
        ladoInvalidoException60.addSuppressed((java.lang.Throwable) ladoInvalidoException62);
        codigos.LadoInvalidoException ladoInvalidoException65 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException67 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException69 = new codigos.LadoInvalidoException("");
        ladoInvalidoException67.addSuppressed((java.lang.Throwable) ladoInvalidoException69);
        ladoInvalidoException65.addSuppressed((java.lang.Throwable) ladoInvalidoException69);
        java.lang.Throwable[] throwableArray72 = ladoInvalidoException69.getSuppressed();
        ladoInvalidoException62.addSuppressed((java.lang.Throwable) ladoInvalidoException69);
        java.lang.Throwable[] throwableArray74 = ladoInvalidoException69.getSuppressed();
        ladoInvalidoException54.addSuppressed((java.lang.Throwable) ladoInvalidoException69);
        ladoInvalidoException39.addSuppressed((java.lang.Throwable) ladoInvalidoException54);
        ladoInvalidoException30.addSuppressed((java.lang.Throwable) ladoInvalidoException39);
        ladoInvalidoException19.addSuppressed((java.lang.Throwable) ladoInvalidoException30);
        ladoInvalidoException12.addSuppressed((java.lang.Throwable) ladoInvalidoException19);
        java.lang.Throwable[] throwableArray80 = ladoInvalidoException12.getSuppressed();
        java.lang.String str81 = ladoInvalidoException12.toString();
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray57);
        org.junit.Assert.assertNotNull(throwableArray72);
        org.junit.Assert.assertNotNull(throwableArray74);
        org.junit.Assert.assertNotNull(throwableArray80);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "codigos.LadoInvalidoException: " + "'", str81, "codigos.LadoInvalidoException: ");
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        java.lang.String str3 = codigos.Triangulo.classificaTriangulo((int) ' ', 4, 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "NAO FORMA TRIANGULO" + "'", str3, "NAO FORMA TRIANGULO");
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        codigos.LadoInvalidoException ladoInvalidoException1 = new codigos.LadoInvalidoException("codigos.LadoInvalidoException: hi!");
        codigos.LadoInvalidoException ladoInvalidoException3 = new codigos.LadoInvalidoException("hi!");
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException3);
        codigos.LadoInvalidoException ladoInvalidoException6 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException8 = new codigos.LadoInvalidoException("");
        ladoInvalidoException6.addSuppressed((java.lang.Throwable) ladoInvalidoException8);
        codigos.LadoInvalidoException ladoInvalidoException11 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException13 = new codigos.LadoInvalidoException("");
        ladoInvalidoException11.addSuppressed((java.lang.Throwable) ladoInvalidoException13);
        codigos.LadoInvalidoException ladoInvalidoException16 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException18 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException20 = new codigos.LadoInvalidoException("");
        ladoInvalidoException18.addSuppressed((java.lang.Throwable) ladoInvalidoException20);
        ladoInvalidoException16.addSuppressed((java.lang.Throwable) ladoInvalidoException20);
        java.lang.Throwable[] throwableArray23 = ladoInvalidoException20.getSuppressed();
        ladoInvalidoException13.addSuppressed((java.lang.Throwable) ladoInvalidoException20);
        java.lang.Throwable[] throwableArray25 = ladoInvalidoException20.getSuppressed();
        ladoInvalidoException8.addSuppressed((java.lang.Throwable) ladoInvalidoException20);
        java.lang.Throwable[] throwableArray27 = ladoInvalidoException20.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException29 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException31 = new codigos.LadoInvalidoException("");
        ladoInvalidoException29.addSuppressed((java.lang.Throwable) ladoInvalidoException31);
        codigos.LadoInvalidoException ladoInvalidoException34 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException36 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException38 = new codigos.LadoInvalidoException("");
        ladoInvalidoException36.addSuppressed((java.lang.Throwable) ladoInvalidoException38);
        ladoInvalidoException34.addSuppressed((java.lang.Throwable) ladoInvalidoException38);
        java.lang.Throwable[] throwableArray41 = ladoInvalidoException38.getSuppressed();
        ladoInvalidoException31.addSuppressed((java.lang.Throwable) ladoInvalidoException38);
        java.lang.Throwable[] throwableArray43 = ladoInvalidoException38.getSuppressed();
        ladoInvalidoException20.addSuppressed((java.lang.Throwable) ladoInvalidoException38);
        codigos.LadoInvalidoException ladoInvalidoException46 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException48 = new codigos.LadoInvalidoException("");
        ladoInvalidoException46.addSuppressed((java.lang.Throwable) ladoInvalidoException48);
        codigos.LadoInvalidoException ladoInvalidoException51 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException53 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException55 = new codigos.LadoInvalidoException("");
        ladoInvalidoException53.addSuppressed((java.lang.Throwable) ladoInvalidoException55);
        ladoInvalidoException51.addSuppressed((java.lang.Throwable) ladoInvalidoException55);
        java.lang.Throwable[] throwableArray58 = ladoInvalidoException55.getSuppressed();
        ladoInvalidoException48.addSuppressed((java.lang.Throwable) ladoInvalidoException55);
        java.lang.Throwable[] throwableArray60 = ladoInvalidoException55.getSuppressed();
        ladoInvalidoException20.addSuppressed((java.lang.Throwable) ladoInvalidoException55);
        ladoInvalidoException3.addSuppressed((java.lang.Throwable) ladoInvalidoException20);
        java.lang.Throwable[] throwableArray63 = ladoInvalidoException3.getSuppressed();
        java.lang.Class<?> wildcardClass64 = throwableArray63.getClass();
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray41);
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertNotNull(throwableArray58);
        org.junit.Assert.assertNotNull(throwableArray60);
        org.junit.Assert.assertNotNull(throwableArray63);
        org.junit.Assert.assertNotNull(wildcardClass64);
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        float float3 = contaCorrente2.getLimite();
        float float4 = contaCorrente2.getSaldo();
        float float5 = contaCorrente2.getLimite();
        float float6 = contaCorrente2.getSaldo();
        contaCorrente2.setLimite((float) (byte) 10);
        contaCorrente2.setSaldo((float) 100L);
        contaCorrente2.setLimite((float) (byte) 10);
        float float13 = contaCorrente2.getSaldo();
        float float14 = contaCorrente2.getSaldo();
        float float15 = contaCorrente2.getSaldo();
        float float16 = contaCorrente2.getLimite();
        java.lang.Class<?> wildcardClass17 = contaCorrente2.getClass();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 100.0f + "'", float13 == 100.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 100.0f + "'", float14 == 100.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 100.0f + "'", float15 == 100.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        float float3 = contaCorrente2.getLimite();
        float float4 = contaCorrente2.getSaldo();
        float float5 = contaCorrente2.getLimite();
        float float6 = contaCorrente2.getSaldo();
        contaCorrente2.setLimite((float) (byte) 10);
        contaCorrente2.setSaldo((float) 100L);
        contaCorrente2.setLimite((float) (byte) 10);
        float float14 = contaCorrente2.saque((float) (byte) 100);
        contaCorrente2.setSaldo((float) (-1));
        java.lang.Class<?> wildcardClass17 = contaCorrente2.getClass();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        float float3 = contaCorrente2.getSaldo();
        contaCorrente2.setSaldo(100.0f);
        contaCorrente2.setLimite(10.0f);
        contaCorrente2.setSaldo(34.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        codigos.LadoInvalidoException ladoInvalidoException1 = new codigos.LadoInvalidoException("codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        java.lang.Throwable[] throwableArray2 = ladoInvalidoException1.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException4 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException6 = new codigos.LadoInvalidoException("");
        ladoInvalidoException4.addSuppressed((java.lang.Throwable) ladoInvalidoException6);
        codigos.LadoInvalidoException ladoInvalidoException9 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException11 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException13 = new codigos.LadoInvalidoException("");
        ladoInvalidoException11.addSuppressed((java.lang.Throwable) ladoInvalidoException13);
        ladoInvalidoException9.addSuppressed((java.lang.Throwable) ladoInvalidoException13);
        java.lang.Throwable[] throwableArray16 = ladoInvalidoException13.getSuppressed();
        ladoInvalidoException6.addSuppressed((java.lang.Throwable) ladoInvalidoException13);
        codigos.LadoInvalidoException ladoInvalidoException19 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException21 = new codigos.LadoInvalidoException("");
        ladoInvalidoException19.addSuppressed((java.lang.Throwable) ladoInvalidoException21);
        codigos.LadoInvalidoException ladoInvalidoException24 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException26 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException28 = new codigos.LadoInvalidoException("");
        ladoInvalidoException26.addSuppressed((java.lang.Throwable) ladoInvalidoException28);
        ladoInvalidoException24.addSuppressed((java.lang.Throwable) ladoInvalidoException28);
        java.lang.Throwable[] throwableArray31 = ladoInvalidoException28.getSuppressed();
        ladoInvalidoException21.addSuppressed((java.lang.Throwable) ladoInvalidoException28);
        java.lang.Throwable[] throwableArray33 = ladoInvalidoException28.getSuppressed();
        ladoInvalidoException13.addSuppressed((java.lang.Throwable) ladoInvalidoException28);
        codigos.LadoInvalidoException ladoInvalidoException36 = new codigos.LadoInvalidoException("codigos.LadoInvalidoException: hi!");
        ladoInvalidoException28.addSuppressed((java.lang.Throwable) ladoInvalidoException36);
        java.lang.Throwable[] throwableArray38 = ladoInvalidoException36.getSuppressed();
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException36);
        codigos.LadoInvalidoException ladoInvalidoException41 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException43 = new codigos.LadoInvalidoException("");
        ladoInvalidoException41.addSuppressed((java.lang.Throwable) ladoInvalidoException43);
        codigos.LadoInvalidoException ladoInvalidoException46 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException48 = new codigos.LadoInvalidoException("");
        ladoInvalidoException46.addSuppressed((java.lang.Throwable) ladoInvalidoException48);
        codigos.LadoInvalidoException ladoInvalidoException51 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException53 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException55 = new codigos.LadoInvalidoException("");
        ladoInvalidoException53.addSuppressed((java.lang.Throwable) ladoInvalidoException55);
        ladoInvalidoException51.addSuppressed((java.lang.Throwable) ladoInvalidoException55);
        java.lang.Throwable[] throwableArray58 = ladoInvalidoException55.getSuppressed();
        ladoInvalidoException48.addSuppressed((java.lang.Throwable) ladoInvalidoException55);
        java.lang.Throwable[] throwableArray60 = ladoInvalidoException55.getSuppressed();
        ladoInvalidoException43.addSuppressed((java.lang.Throwable) ladoInvalidoException55);
        java.lang.Throwable[] throwableArray62 = ladoInvalidoException55.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException64 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException66 = new codigos.LadoInvalidoException("");
        ladoInvalidoException64.addSuppressed((java.lang.Throwable) ladoInvalidoException66);
        codigos.LadoInvalidoException ladoInvalidoException69 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException71 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException73 = new codigos.LadoInvalidoException("");
        ladoInvalidoException71.addSuppressed((java.lang.Throwable) ladoInvalidoException73);
        ladoInvalidoException69.addSuppressed((java.lang.Throwable) ladoInvalidoException73);
        java.lang.Throwable[] throwableArray76 = ladoInvalidoException73.getSuppressed();
        ladoInvalidoException66.addSuppressed((java.lang.Throwable) ladoInvalidoException73);
        java.lang.Throwable[] throwableArray78 = ladoInvalidoException73.getSuppressed();
        ladoInvalidoException55.addSuppressed((java.lang.Throwable) ladoInvalidoException73);
        java.lang.Throwable[] throwableArray80 = ladoInvalidoException73.getSuppressed();
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException73);
        java.lang.Throwable[] throwableArray82 = ladoInvalidoException1.getSuppressed();
        java.lang.Throwable[] throwableArray83 = ladoInvalidoException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertNotNull(throwableArray58);
        org.junit.Assert.assertNotNull(throwableArray60);
        org.junit.Assert.assertNotNull(throwableArray62);
        org.junit.Assert.assertNotNull(throwableArray76);
        org.junit.Assert.assertNotNull(throwableArray78);
        org.junit.Assert.assertNotNull(throwableArray80);
        org.junit.Assert.assertNotNull(throwableArray82);
        org.junit.Assert.assertNotNull(throwableArray83);
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", 1.0f);
        float float8 = pedido0.calculaTaxaDesconto(false, "", (float) 1);
        float float12 = pedido0.calculaTaxaDesconto(false, "hi!", (float) (short) 100);
        float float16 = pedido0.calculaTaxaDesconto(true, "", (float) ' ');
        float float20 = pedido0.calculaTaxaDesconto(false, "", (float) 0L);
        float float24 = pedido0.calculaTaxaDesconto(true, "", (float) 'a');
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 10.0f + "'", float24 == 10.0f);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 1, 89.0f);
        contaCorrente2.setLimite(91.0f);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) ' ', (float) '4');
        contaCorrente2.setLimite(9.0f);
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        java.lang.String str3 = codigos.Triangulo.classificaTriangulo(10, (int) ' ', 4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "NAO FORMA TRIANGULO" + "'", str3, "NAO FORMA TRIANGULO");
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", (float) (short) -1);
        float float8 = pedido0.calculaTaxaDesconto(true, "NAO FORMA TRIANGULO", (float) (byte) 0);
        float float12 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: hi!", (float) (short) 100);
        float float16 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ", (float) (byte) 10);
        float float20 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: ", 47.0f);
        float float24 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!", 99.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10.0f + "'", float12 == 10.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.0f + "'", float24 == 0.0f);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        float float3 = contaCorrente2.getSaldo();
        contaCorrente2.setSaldo(100.0f);
        contaCorrente2.setLimite(10.0f);
        contaCorrente2.setLimite(0.0f);
        contaCorrente2.setLimite((float) (short) 10);
        contaCorrente2.setLimite((float) 'a');
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", 1.0f);
        float float8 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: hi!", (float) (short) 10);
        float float12 = pedido0.calculaTaxaDesconto(true, "NAO FORMA TRIANGULO", (float) 0L);
        float float16 = pedido0.calculaTaxaDesconto(true, "", 1.0f);
        float float20 = pedido0.calculaTaxaDesconto(false, "NAO FORMA TRIANGULO", (float) (-1L));
        float float24 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!", (float) 100);
        float float28 = pedido0.calculaTaxaDesconto(true, "NAO FORMA TRIANGULO", 100.0f);
        float float32 = pedido0.calculaTaxaDesconto(false, "hi!", (-1.0f));
        float float36 = pedido0.calculaTaxaDesconto(false, "", 100.0f);
        float float40 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ESCALENO", 90.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10.0f + "'", float12 == 10.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.0f + "'", float24 == 0.0f);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 10.0f + "'", float28 == 10.0f);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 0.0f + "'", float32 == 0.0f);
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 0.0f + "'", float36 == 0.0f);
        org.junit.Assert.assertTrue("'" + float40 + "' != '" + 10.0f + "'", float40 == 10.0f);
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 100L, (float) 10);
        float float3 = contaCorrente2.getSaldo();
        float float4 = contaCorrente2.getLimite();
        float float5 = contaCorrente2.getLimite();
        float float6 = contaCorrente2.getLimite();
        contaCorrente2.setLimite((float) 4);
        float float10 = contaCorrente2.saque(87.0f);
        float float11 = contaCorrente2.getLimite();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10.0f + "'", float5 == 10.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 13.0f + "'", float10 == 13.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 4.0f + "'", float11 == 4.0f);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(1.0f, (float) 1);
        float float4 = contaCorrente2.saque((float) 1L);
        contaCorrente2.setSaldo((-32.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 0, (float) (short) 0);
        contaCorrente2.setLimite((float) 4);
        // The following exception was thrown during execution in test generation
        try {
            float float6 = contaCorrente2.saque(60.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Saldo Insuficiente");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        codigos.LadoInvalidoException ladoInvalidoException1 = new codigos.LadoInvalidoException("codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        java.lang.Throwable[] throwableArray2 = ladoInvalidoException1.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException4 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException6 = new codigos.LadoInvalidoException("");
        ladoInvalidoException4.addSuppressed((java.lang.Throwable) ladoInvalidoException6);
        codigos.LadoInvalidoException ladoInvalidoException9 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException11 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException13 = new codigos.LadoInvalidoException("");
        ladoInvalidoException11.addSuppressed((java.lang.Throwable) ladoInvalidoException13);
        ladoInvalidoException9.addSuppressed((java.lang.Throwable) ladoInvalidoException13);
        java.lang.Throwable[] throwableArray16 = ladoInvalidoException13.getSuppressed();
        ladoInvalidoException6.addSuppressed((java.lang.Throwable) ladoInvalidoException13);
        codigos.LadoInvalidoException ladoInvalidoException19 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException21 = new codigos.LadoInvalidoException("");
        ladoInvalidoException19.addSuppressed((java.lang.Throwable) ladoInvalidoException21);
        codigos.LadoInvalidoException ladoInvalidoException24 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException26 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException28 = new codigos.LadoInvalidoException("");
        ladoInvalidoException26.addSuppressed((java.lang.Throwable) ladoInvalidoException28);
        ladoInvalidoException24.addSuppressed((java.lang.Throwable) ladoInvalidoException28);
        java.lang.Throwable[] throwableArray31 = ladoInvalidoException28.getSuppressed();
        ladoInvalidoException21.addSuppressed((java.lang.Throwable) ladoInvalidoException28);
        java.lang.Throwable[] throwableArray33 = ladoInvalidoException28.getSuppressed();
        ladoInvalidoException13.addSuppressed((java.lang.Throwable) ladoInvalidoException28);
        codigos.LadoInvalidoException ladoInvalidoException36 = new codigos.LadoInvalidoException("codigos.LadoInvalidoException: hi!");
        ladoInvalidoException28.addSuppressed((java.lang.Throwable) ladoInvalidoException36);
        java.lang.Throwable[] throwableArray38 = ladoInvalidoException36.getSuppressed();
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException36);
        java.lang.Throwable[] throwableArray40 = ladoInvalidoException36.getSuppressed();
        java.lang.String str41 = ladoInvalidoException36.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertNotNull(throwableArray40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!" + "'", str41, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!");
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = codigos.Triangulo.classificaTriangulo((int) (short) 10, 100, (-1));
            org.junit.Assert.fail("Expected exception of type codigos.LadoInvalidoException; message: lado invalido");
        } catch (codigos.LadoInvalidoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) '#', 2.0f);
        contaCorrente2.setSaldo((float) 0L);
        contaCorrente2.setSaldo((float) (short) 1);
        float float7 = contaCorrente2.getLimite();
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 2.0f + "'", float7 == 2.0f);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(32.0f, (float) 10L);
        float float3 = contaCorrente2.getLimite();
        float float4 = contaCorrente2.getLimite();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        float float3 = contaCorrente2.getSaldo();
        contaCorrente2.setSaldo(100.0f);
        contaCorrente2.setLimite(10.0f);
        float float8 = contaCorrente2.getLimite();
        float float9 = contaCorrente2.getSaldo();
        float float11 = contaCorrente2.saque((float) 4);
        float float12 = contaCorrente2.getSaldo();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 100.0f + "'", float9 == 100.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 96.0f + "'", float11 == 96.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 96.0f + "'", float12 == 96.0f);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(55.0f, (float) 10L);
        float float3 = contaCorrente2.getSaldo();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 55.0f + "'", float3 == 55.0f);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(1.0f, (float) 0L);
        contaCorrente2.setSaldo((float) 'a');
        contaCorrente2.setLimite(0.0f);
        contaCorrente2.setSaldo((float) 1L);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        codigos.LadoInvalidoException ladoInvalidoException1 = new codigos.LadoInvalidoException("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!");
        java.lang.String str2 = ladoInvalidoException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!" + "'", str2, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!");
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        float float3 = contaCorrente2.getLimite();
        float float4 = contaCorrente2.getSaldo();
        float float5 = contaCorrente2.getLimite();
        float float6 = contaCorrente2.getSaldo();
        contaCorrente2.setLimite((float) (byte) 10);
        contaCorrente2.setSaldo((float) 100L);
        contaCorrente2.setSaldo(90.0f);
        float float13 = contaCorrente2.getSaldo();
        contaCorrente2.setLimite((-68.0f));
        float float17 = contaCorrente2.saque(22.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 90.0f + "'", float13 == 90.0f);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 68.0f + "'", float17 == 68.0f);
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        float float3 = contaCorrente2.getLimite();
        float float4 = contaCorrente2.getSaldo();
        float float5 = contaCorrente2.getLimite();
        float float6 = contaCorrente2.getSaldo();
        contaCorrente2.setLimite((float) (byte) 10);
        contaCorrente2.setSaldo((float) 100L);
        contaCorrente2.setLimite((float) (byte) 10);
        float float14 = contaCorrente2.saque((float) (byte) 100);
        contaCorrente2.setSaldo(32.0f);
        float float18 = contaCorrente2.saque(2.0f);
        float float19 = contaCorrente2.getLimite();
        float float21 = contaCorrente2.saque(22.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 30.0f + "'", float18 == 30.0f);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 10.0f + "'", float19 == 10.0f);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 8.0f + "'", float21 == 8.0f);
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 10, 0.0f);
        float float3 = contaCorrente2.getSaldo();
        float float4 = contaCorrente2.getLimite();
        contaCorrente2.setSaldo((float) ' ');
        // The following exception was thrown during execution in test generation
        try {
            float float8 = contaCorrente2.saque((-2.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Valor invalido");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        codigos.LadoInvalidoException ladoInvalidoException1 = new codigos.LadoInvalidoException("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        java.lang.String str2 = ladoInvalidoException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: " + "'", str2, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", 1.0f);
        float float8 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: hi!", (float) (short) 10);
        float float12 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: ", (float) '4');
        float float16 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!", (-1.0f));
        float float20 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: NAO FORMA TRIANGULO", (-57.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 10.0f + "'", float20 == 10.0f);
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(100.0f, 90.0f);
        contaCorrente2.setLimite((float) 0L);
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        codigos.LadoInvalidoException ladoInvalidoException1 = new codigos.LadoInvalidoException("codigos.LadoInvalidoException: hi!");
        codigos.LadoInvalidoException ladoInvalidoException3 = new codigos.LadoInvalidoException("hi!");
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException3);
        codigos.LadoInvalidoException ladoInvalidoException6 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException8 = new codigos.LadoInvalidoException("");
        ladoInvalidoException6.addSuppressed((java.lang.Throwable) ladoInvalidoException8);
        codigos.LadoInvalidoException ladoInvalidoException11 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException13 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException15 = new codigos.LadoInvalidoException("");
        ladoInvalidoException13.addSuppressed((java.lang.Throwable) ladoInvalidoException15);
        ladoInvalidoException11.addSuppressed((java.lang.Throwable) ladoInvalidoException15);
        java.lang.Throwable[] throwableArray18 = ladoInvalidoException15.getSuppressed();
        ladoInvalidoException8.addSuppressed((java.lang.Throwable) ladoInvalidoException15);
        codigos.LadoInvalidoException ladoInvalidoException21 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException23 = new codigos.LadoInvalidoException("");
        ladoInvalidoException21.addSuppressed((java.lang.Throwable) ladoInvalidoException23);
        codigos.LadoInvalidoException ladoInvalidoException26 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException28 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException30 = new codigos.LadoInvalidoException("");
        ladoInvalidoException28.addSuppressed((java.lang.Throwable) ladoInvalidoException30);
        ladoInvalidoException26.addSuppressed((java.lang.Throwable) ladoInvalidoException30);
        java.lang.Throwable[] throwableArray33 = ladoInvalidoException30.getSuppressed();
        ladoInvalidoException23.addSuppressed((java.lang.Throwable) ladoInvalidoException30);
        java.lang.Throwable[] throwableArray35 = ladoInvalidoException30.getSuppressed();
        ladoInvalidoException15.addSuppressed((java.lang.Throwable) ladoInvalidoException30);
        codigos.LadoInvalidoException ladoInvalidoException38 = new codigos.LadoInvalidoException("codigos.LadoInvalidoException: hi!");
        ladoInvalidoException30.addSuppressed((java.lang.Throwable) ladoInvalidoException38);
        ladoInvalidoException3.addSuppressed((java.lang.Throwable) ladoInvalidoException38);
        java.lang.Throwable[] throwableArray41 = ladoInvalidoException38.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException43 = new codigos.LadoInvalidoException("");
        ladoInvalidoException38.addSuppressed((java.lang.Throwable) ladoInvalidoException43);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray41);
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        java.lang.String str3 = codigos.Triangulo.classificaTriangulo(3, (int) (byte) 100, (int) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "NAO FORMA TRIANGULO" + "'", str3, "NAO FORMA TRIANGULO");
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        codigos.LadoInvalidoException ladoInvalidoException1 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException3 = new codigos.LadoInvalidoException("");
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException3);
        codigos.LadoInvalidoException ladoInvalidoException6 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException8 = new codigos.LadoInvalidoException("");
        ladoInvalidoException6.addSuppressed((java.lang.Throwable) ladoInvalidoException8);
        codigos.LadoInvalidoException ladoInvalidoException11 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException13 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException15 = new codigos.LadoInvalidoException("");
        ladoInvalidoException13.addSuppressed((java.lang.Throwable) ladoInvalidoException15);
        ladoInvalidoException11.addSuppressed((java.lang.Throwable) ladoInvalidoException15);
        java.lang.Throwable[] throwableArray18 = ladoInvalidoException15.getSuppressed();
        ladoInvalidoException8.addSuppressed((java.lang.Throwable) ladoInvalidoException15);
        ladoInvalidoException3.addSuppressed((java.lang.Throwable) ladoInvalidoException8);
        java.lang.Throwable[] throwableArray21 = ladoInvalidoException3.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException23 = new codigos.LadoInvalidoException("");
        java.lang.Throwable[] throwableArray24 = ladoInvalidoException23.getSuppressed();
        java.lang.Throwable[] throwableArray25 = ladoInvalidoException23.getSuppressed();
        ladoInvalidoException3.addSuppressed((java.lang.Throwable) ladoInvalidoException23);
        codigos.LadoInvalidoException ladoInvalidoException28 = new codigos.LadoInvalidoException("NAO FORMA TRIANGULO");
        java.lang.Throwable[] throwableArray29 = ladoInvalidoException28.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException31 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException33 = new codigos.LadoInvalidoException("");
        ladoInvalidoException31.addSuppressed((java.lang.Throwable) ladoInvalidoException33);
        codigos.LadoInvalidoException ladoInvalidoException36 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException38 = new codigos.LadoInvalidoException("");
        ladoInvalidoException36.addSuppressed((java.lang.Throwable) ladoInvalidoException38);
        codigos.LadoInvalidoException ladoInvalidoException41 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException43 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException45 = new codigos.LadoInvalidoException("");
        ladoInvalidoException43.addSuppressed((java.lang.Throwable) ladoInvalidoException45);
        ladoInvalidoException41.addSuppressed((java.lang.Throwable) ladoInvalidoException45);
        java.lang.Throwable[] throwableArray48 = ladoInvalidoException45.getSuppressed();
        ladoInvalidoException38.addSuppressed((java.lang.Throwable) ladoInvalidoException45);
        ladoInvalidoException33.addSuppressed((java.lang.Throwable) ladoInvalidoException38);
        java.lang.Throwable[] throwableArray51 = ladoInvalidoException33.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException53 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException55 = new codigos.LadoInvalidoException("");
        ladoInvalidoException53.addSuppressed((java.lang.Throwable) ladoInvalidoException55);
        codigos.LadoInvalidoException ladoInvalidoException58 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException60 = new codigos.LadoInvalidoException("");
        ladoInvalidoException58.addSuppressed((java.lang.Throwable) ladoInvalidoException60);
        codigos.LadoInvalidoException ladoInvalidoException63 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException65 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException67 = new codigos.LadoInvalidoException("");
        ladoInvalidoException65.addSuppressed((java.lang.Throwable) ladoInvalidoException67);
        ladoInvalidoException63.addSuppressed((java.lang.Throwable) ladoInvalidoException67);
        java.lang.Throwable[] throwableArray70 = ladoInvalidoException67.getSuppressed();
        ladoInvalidoException60.addSuppressed((java.lang.Throwable) ladoInvalidoException67);
        java.lang.Throwable[] throwableArray72 = ladoInvalidoException67.getSuppressed();
        ladoInvalidoException55.addSuppressed((java.lang.Throwable) ladoInvalidoException67);
        java.lang.Throwable[] throwableArray74 = ladoInvalidoException67.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException76 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException78 = new codigos.LadoInvalidoException("");
        ladoInvalidoException76.addSuppressed((java.lang.Throwable) ladoInvalidoException78);
        codigos.LadoInvalidoException ladoInvalidoException81 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException83 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException85 = new codigos.LadoInvalidoException("");
        ladoInvalidoException83.addSuppressed((java.lang.Throwable) ladoInvalidoException85);
        ladoInvalidoException81.addSuppressed((java.lang.Throwable) ladoInvalidoException85);
        java.lang.Throwable[] throwableArray88 = ladoInvalidoException85.getSuppressed();
        ladoInvalidoException78.addSuppressed((java.lang.Throwable) ladoInvalidoException85);
        java.lang.Throwable[] throwableArray90 = ladoInvalidoException85.getSuppressed();
        ladoInvalidoException67.addSuppressed((java.lang.Throwable) ladoInvalidoException85);
        java.lang.Throwable[] throwableArray92 = ladoInvalidoException85.getSuppressed();
        ladoInvalidoException33.addSuppressed((java.lang.Throwable) ladoInvalidoException85);
        ladoInvalidoException28.addSuppressed((java.lang.Throwable) ladoInvalidoException85);
        ladoInvalidoException3.addSuppressed((java.lang.Throwable) ladoInvalidoException85);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNotNull(throwableArray48);
        org.junit.Assert.assertNotNull(throwableArray51);
        org.junit.Assert.assertNotNull(throwableArray70);
        org.junit.Assert.assertNotNull(throwableArray72);
        org.junit.Assert.assertNotNull(throwableArray74);
        org.junit.Assert.assertNotNull(throwableArray88);
        org.junit.Assert.assertNotNull(throwableArray90);
        org.junit.Assert.assertNotNull(throwableArray92);
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        float float3 = contaCorrente2.getLimite();
        float float4 = contaCorrente2.getSaldo();
        float float5 = contaCorrente2.getLimite();
        contaCorrente2.setSaldo((float) (byte) 1);
        contaCorrente2.setSaldo((float) '4');
        contaCorrente2.setLimite(10.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        codigos.LadoInvalidoException ladoInvalidoException1 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException3 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException5 = new codigos.LadoInvalidoException("");
        ladoInvalidoException3.addSuppressed((java.lang.Throwable) ladoInvalidoException5);
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException5);
        java.lang.Throwable[] throwableArray8 = ladoInvalidoException5.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException10 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException12 = new codigos.LadoInvalidoException("");
        ladoInvalidoException10.addSuppressed((java.lang.Throwable) ladoInvalidoException12);
        codigos.LadoInvalidoException ladoInvalidoException15 = new codigos.LadoInvalidoException("hi!");
        ladoInvalidoException12.addSuppressed((java.lang.Throwable) ladoInvalidoException15);
        ladoInvalidoException5.addSuppressed((java.lang.Throwable) ladoInvalidoException15);
        codigos.LadoInvalidoException ladoInvalidoException19 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException21 = new codigos.LadoInvalidoException("");
        ladoInvalidoException19.addSuppressed((java.lang.Throwable) ladoInvalidoException21);
        codigos.LadoInvalidoException ladoInvalidoException24 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException26 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException28 = new codigos.LadoInvalidoException("");
        ladoInvalidoException26.addSuppressed((java.lang.Throwable) ladoInvalidoException28);
        ladoInvalidoException24.addSuppressed((java.lang.Throwable) ladoInvalidoException28);
        java.lang.Throwable[] throwableArray31 = ladoInvalidoException28.getSuppressed();
        ladoInvalidoException21.addSuppressed((java.lang.Throwable) ladoInvalidoException28);
        codigos.LadoInvalidoException ladoInvalidoException34 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException36 = new codigos.LadoInvalidoException("");
        ladoInvalidoException34.addSuppressed((java.lang.Throwable) ladoInvalidoException36);
        codigos.LadoInvalidoException ladoInvalidoException39 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException41 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException43 = new codigos.LadoInvalidoException("");
        ladoInvalidoException41.addSuppressed((java.lang.Throwable) ladoInvalidoException43);
        ladoInvalidoException39.addSuppressed((java.lang.Throwable) ladoInvalidoException43);
        java.lang.Throwable[] throwableArray46 = ladoInvalidoException43.getSuppressed();
        ladoInvalidoException36.addSuppressed((java.lang.Throwable) ladoInvalidoException43);
        java.lang.Throwable[] throwableArray48 = ladoInvalidoException43.getSuppressed();
        ladoInvalidoException28.addSuppressed((java.lang.Throwable) ladoInvalidoException43);
        codigos.LadoInvalidoException ladoInvalidoException51 = new codigos.LadoInvalidoException("codigos.LadoInvalidoException: hi!");
        ladoInvalidoException43.addSuppressed((java.lang.Throwable) ladoInvalidoException51);
        java.lang.Throwable[] throwableArray53 = ladoInvalidoException43.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException55 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException57 = new codigos.LadoInvalidoException("");
        ladoInvalidoException55.addSuppressed((java.lang.Throwable) ladoInvalidoException57);
        codigos.LadoInvalidoException ladoInvalidoException60 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException62 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException64 = new codigos.LadoInvalidoException("");
        ladoInvalidoException62.addSuppressed((java.lang.Throwable) ladoInvalidoException64);
        ladoInvalidoException60.addSuppressed((java.lang.Throwable) ladoInvalidoException64);
        java.lang.Throwable[] throwableArray67 = ladoInvalidoException64.getSuppressed();
        ladoInvalidoException57.addSuppressed((java.lang.Throwable) ladoInvalidoException64);
        codigos.LadoInvalidoException ladoInvalidoException70 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException72 = new codigos.LadoInvalidoException("");
        ladoInvalidoException70.addSuppressed((java.lang.Throwable) ladoInvalidoException72);
        codigos.LadoInvalidoException ladoInvalidoException75 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException77 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException79 = new codigos.LadoInvalidoException("");
        ladoInvalidoException77.addSuppressed((java.lang.Throwable) ladoInvalidoException79);
        ladoInvalidoException75.addSuppressed((java.lang.Throwable) ladoInvalidoException79);
        java.lang.Throwable[] throwableArray82 = ladoInvalidoException79.getSuppressed();
        ladoInvalidoException72.addSuppressed((java.lang.Throwable) ladoInvalidoException79);
        java.lang.Throwable[] throwableArray84 = ladoInvalidoException79.getSuppressed();
        ladoInvalidoException64.addSuppressed((java.lang.Throwable) ladoInvalidoException79);
        ladoInvalidoException43.addSuppressed((java.lang.Throwable) ladoInvalidoException64);
        ladoInvalidoException15.addSuppressed((java.lang.Throwable) ladoInvalidoException64);
        java.lang.Throwable[] throwableArray88 = ladoInvalidoException64.getSuppressed();
        java.lang.Class<?> wildcardClass89 = throwableArray88.getClass();
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(throwableArray46);
        org.junit.Assert.assertNotNull(throwableArray48);
        org.junit.Assert.assertNotNull(throwableArray53);
        org.junit.Assert.assertNotNull(throwableArray67);
        org.junit.Assert.assertNotNull(throwableArray82);
        org.junit.Assert.assertNotNull(throwableArray84);
        org.junit.Assert.assertNotNull(throwableArray88);
        org.junit.Assert.assertNotNull(wildcardClass89);
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(0.0f, 42.0f);
        contaCorrente2.setSaldo((float) 1);
        float float5 = contaCorrente2.getSaldo();
        float float6 = contaCorrente2.getSaldo();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        codigos.LadoInvalidoException ladoInvalidoException1 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException3 = new codigos.LadoInvalidoException("");
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException3);
        codigos.LadoInvalidoException ladoInvalidoException6 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException8 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException10 = new codigos.LadoInvalidoException("");
        ladoInvalidoException8.addSuppressed((java.lang.Throwable) ladoInvalidoException10);
        ladoInvalidoException6.addSuppressed((java.lang.Throwable) ladoInvalidoException10);
        java.lang.Throwable[] throwableArray13 = ladoInvalidoException10.getSuppressed();
        ladoInvalidoException3.addSuppressed((java.lang.Throwable) ladoInvalidoException10);
        codigos.LadoInvalidoException ladoInvalidoException16 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException18 = new codigos.LadoInvalidoException("");
        ladoInvalidoException16.addSuppressed((java.lang.Throwable) ladoInvalidoException18);
        codigos.LadoInvalidoException ladoInvalidoException21 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException23 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException25 = new codigos.LadoInvalidoException("");
        ladoInvalidoException23.addSuppressed((java.lang.Throwable) ladoInvalidoException25);
        ladoInvalidoException21.addSuppressed((java.lang.Throwable) ladoInvalidoException25);
        java.lang.Throwable[] throwableArray28 = ladoInvalidoException25.getSuppressed();
        ladoInvalidoException18.addSuppressed((java.lang.Throwable) ladoInvalidoException25);
        java.lang.Throwable[] throwableArray30 = ladoInvalidoException25.getSuppressed();
        ladoInvalidoException10.addSuppressed((java.lang.Throwable) ladoInvalidoException25);
        codigos.LadoInvalidoException ladoInvalidoException33 = new codigos.LadoInvalidoException("codigos.LadoInvalidoException: hi!");
        ladoInvalidoException25.addSuppressed((java.lang.Throwable) ladoInvalidoException33);
        java.lang.Throwable[] throwableArray35 = ladoInvalidoException25.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException37 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException39 = new codigos.LadoInvalidoException("");
        ladoInvalidoException37.addSuppressed((java.lang.Throwable) ladoInvalidoException39);
        codigos.LadoInvalidoException ladoInvalidoException42 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException44 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException46 = new codigos.LadoInvalidoException("");
        ladoInvalidoException44.addSuppressed((java.lang.Throwable) ladoInvalidoException46);
        ladoInvalidoException42.addSuppressed((java.lang.Throwable) ladoInvalidoException46);
        java.lang.Throwable[] throwableArray49 = ladoInvalidoException46.getSuppressed();
        ladoInvalidoException39.addSuppressed((java.lang.Throwable) ladoInvalidoException46);
        codigos.LadoInvalidoException ladoInvalidoException52 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException54 = new codigos.LadoInvalidoException("");
        ladoInvalidoException52.addSuppressed((java.lang.Throwable) ladoInvalidoException54);
        codigos.LadoInvalidoException ladoInvalidoException57 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException59 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException61 = new codigos.LadoInvalidoException("");
        ladoInvalidoException59.addSuppressed((java.lang.Throwable) ladoInvalidoException61);
        ladoInvalidoException57.addSuppressed((java.lang.Throwable) ladoInvalidoException61);
        java.lang.Throwable[] throwableArray64 = ladoInvalidoException61.getSuppressed();
        ladoInvalidoException54.addSuppressed((java.lang.Throwable) ladoInvalidoException61);
        java.lang.Throwable[] throwableArray66 = ladoInvalidoException61.getSuppressed();
        ladoInvalidoException46.addSuppressed((java.lang.Throwable) ladoInvalidoException61);
        ladoInvalidoException25.addSuppressed((java.lang.Throwable) ladoInvalidoException46);
        codigos.LadoInvalidoException ladoInvalidoException70 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException72 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException74 = new codigos.LadoInvalidoException("");
        ladoInvalidoException72.addSuppressed((java.lang.Throwable) ladoInvalidoException74);
        ladoInvalidoException70.addSuppressed((java.lang.Throwable) ladoInvalidoException74);
        java.lang.Throwable[] throwableArray77 = ladoInvalidoException74.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException79 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException81 = new codigos.LadoInvalidoException("");
        ladoInvalidoException79.addSuppressed((java.lang.Throwable) ladoInvalidoException81);
        codigos.LadoInvalidoException ladoInvalidoException84 = new codigos.LadoInvalidoException("hi!");
        ladoInvalidoException81.addSuppressed((java.lang.Throwable) ladoInvalidoException84);
        ladoInvalidoException74.addSuppressed((java.lang.Throwable) ladoInvalidoException84);
        java.lang.Throwable[] throwableArray87 = ladoInvalidoException74.getSuppressed();
        ladoInvalidoException25.addSuppressed((java.lang.Throwable) ladoInvalidoException74);
        java.lang.String str89 = ladoInvalidoException74.toString();
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray49);
        org.junit.Assert.assertNotNull(throwableArray64);
        org.junit.Assert.assertNotNull(throwableArray66);
        org.junit.Assert.assertNotNull(throwableArray77);
        org.junit.Assert.assertNotNull(throwableArray87);
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "codigos.LadoInvalidoException: " + "'", str89, "codigos.LadoInvalidoException: ");
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        float float3 = contaCorrente2.getSaldo();
        contaCorrente2.setSaldo(100.0f);
        contaCorrente2.setLimite(10.0f);
        float float9 = contaCorrente2.saque((float) 1L);
        contaCorrente2.setLimite((float) (byte) 10);
        contaCorrente2.setLimite((float) (-1));
        contaCorrente2.setSaldo((float) (-1L));
        contaCorrente2.setLimite((float) (-1));
        contaCorrente2.setSaldo(97.0f);
        float float20 = contaCorrente2.getSaldo();
        float float21 = contaCorrente2.getSaldo();
        float float22 = contaCorrente2.getLimite();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 99.0f + "'", float9 == 99.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 97.0f + "'", float20 == 97.0f);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 97.0f + "'", float21 == 97.0f);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + (-1.0f) + "'", float22 == (-1.0f));
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
        codigos.LadoInvalidoException ladoInvalidoException1 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException3 = new codigos.LadoInvalidoException("");
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException3);
        codigos.LadoInvalidoException ladoInvalidoException6 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException8 = new codigos.LadoInvalidoException("");
        ladoInvalidoException6.addSuppressed((java.lang.Throwable) ladoInvalidoException8);
        codigos.LadoInvalidoException ladoInvalidoException11 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException13 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException15 = new codigos.LadoInvalidoException("");
        ladoInvalidoException13.addSuppressed((java.lang.Throwable) ladoInvalidoException15);
        ladoInvalidoException11.addSuppressed((java.lang.Throwable) ladoInvalidoException15);
        java.lang.Throwable[] throwableArray18 = ladoInvalidoException15.getSuppressed();
        ladoInvalidoException8.addSuppressed((java.lang.Throwable) ladoInvalidoException15);
        ladoInvalidoException3.addSuppressed((java.lang.Throwable) ladoInvalidoException8);
        java.lang.Throwable[] throwableArray21 = ladoInvalidoException3.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException23 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException25 = new codigos.LadoInvalidoException("");
        ladoInvalidoException23.addSuppressed((java.lang.Throwable) ladoInvalidoException25);
        codigos.LadoInvalidoException ladoInvalidoException28 = new codigos.LadoInvalidoException("hi!");
        ladoInvalidoException25.addSuppressed((java.lang.Throwable) ladoInvalidoException28);
        ladoInvalidoException3.addSuppressed((java.lang.Throwable) ladoInvalidoException28);
        codigos.LadoInvalidoException ladoInvalidoException32 = new codigos.LadoInvalidoException("codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        ladoInvalidoException28.addSuppressed((java.lang.Throwable) ladoInvalidoException32);
        java.lang.Throwable[] throwableArray34 = ladoInvalidoException28.getSuppressed();
        java.lang.String str35 = ladoInvalidoException28.toString();
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "codigos.LadoInvalidoException: hi!" + "'", str35, "codigos.LadoInvalidoException: hi!");
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 100L, (-32.0f));
        contaCorrente2.setLimite((-14.0f));
        contaCorrente2.setLimite(60.0f);
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 10, 0.0f);
        contaCorrente2.setLimite((-48.0f));
        contaCorrente2.setSaldo(3.0f);
        contaCorrente2.setLimite(55.0f);
        float float9 = contaCorrente2.getLimite();
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 55.0f + "'", float9 == 55.0f);
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = codigos.Triangulo.classificaTriangulo(1, (int) (short) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type codigos.LadoInvalidoException; message: lado invalido");
        } catch (codigos.LadoInvalidoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) '4', (float) 4);
        float float3 = contaCorrente2.getSaldo();
        java.lang.Class<?> wildcardClass4 = contaCorrente2.getClass();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 52.0f + "'", float3 == 52.0f);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = codigos.Triangulo.classificaTriangulo(0, (int) 'a', 1);
            org.junit.Assert.fail("Expected exception of type codigos.LadoInvalidoException; message: lado invalido");
        } catch (codigos.LadoInvalidoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((-32.0f), 31.0f);
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        float float3 = contaCorrente2.getSaldo();
        contaCorrente2.setSaldo(100.0f);
        contaCorrente2.setSaldo(90.0f);
        contaCorrente2.setSaldo((float) 10L);
        float float10 = contaCorrente2.getSaldo();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
        codigos.LadoInvalidoException ladoInvalidoException1 = new codigos.LadoInvalidoException("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 100L, (float) 10);
        float float3 = contaCorrente2.getSaldo();
        float float4 = contaCorrente2.getLimite();
        contaCorrente2.setLimite(99.0f);
        contaCorrente2.setSaldo(10.0f);
        float float9 = contaCorrente2.getSaldo();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((-32.0f), 0.0f);
        float float3 = contaCorrente2.getLimite();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 0L, (float) (short) 100);
        contaCorrente2.setLimite(88.0f);
        contaCorrente2.setSaldo(99.0f);
        contaCorrente2.setSaldo(52.0f);
        // The following exception was thrown during execution in test generation
        try {
            float float10 = contaCorrente2.saque((-14.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Valor invalido");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        codigos.Words words0 = new codigos.Words();
        int int2 = words0.countWords("codigos.LadoInvalidoException: ");
        int int4 = words0.countWords("");
        int int6 = words0.countWords("ESCALENO");
        int int8 = words0.countWords("");
        int int10 = words0.countWords("codigos.LadoInvalidoException: NAO FORMA TRIANGULO");
        int int12 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(3.0f, 96.0f);
        float float3 = contaCorrente2.getLimite();
        contaCorrente2.setLimite((-3.0f));
        contaCorrente2.setSaldo(34.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 96.0f + "'", float3 == 96.0f);
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        boolean boolean1 = codigos.Identifier.validaIdentificador("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        codigos.Words words0 = new codigos.Words();
        int int2 = words0.countWords("");
        int int4 = words0.countWords("");
        int int6 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int8 = words0.countWords("codigos.LadoInvalidoException: ESCALENO");
        int int10 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        int int12 = words0.countWords("hi!");
        int int14 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", 1.0f);
        float float8 = pedido0.calculaTaxaDesconto(false, "NAO FORMA TRIANGULO", 10.0f);
        float float12 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: ", (float) (-1L));
        float float16 = pedido0.calculaTaxaDesconto(false, "NAO FORMA TRIANGULO", (float) 2);
        float float20 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", (float) 2);
        float float24 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ", 30.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 10.0f + "'", float20 == 10.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.0f + "'", float24 == 0.0f);
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(32.0f, 10.0f);
        float float3 = contaCorrente2.getSaldo();
        contaCorrente2.setSaldo(3.0f);
        contaCorrente2.setSaldo((-58.0f));
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 32.0f + "'", float3 == 32.0f);
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(32.0f, (float) 10L);
        contaCorrente2.setSaldo((float) 0L);
        java.lang.Class<?> wildcardClass5 = contaCorrente2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((-41.0f), 69.0f);
        float float3 = contaCorrente2.getLimite();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 69.0f + "'", float3 == 69.0f);
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", 1.0f);
        float float8 = pedido0.calculaTaxaDesconto(false, "NAO FORMA TRIANGULO", 10.0f);
        float float12 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: ", (float) (-1L));
        float float16 = pedido0.calculaTaxaDesconto(false, "NAO FORMA TRIANGULO", (float) 2);
        float float20 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", (float) 2);
        float float24 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: NAO FORMA TRIANGULO", 65.0f);
        float float28 = pedido0.calculaTaxaDesconto(false, "EQUILATERO", 99.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 10.0f + "'", float20 == 10.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.0f + "'", float24 == 0.0f);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 0.0f + "'", float28 == 0.0f);
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) ' ', 1.0f);
        float float3 = contaCorrente2.getLimite();
        contaCorrente2.setLimite((-11.0f));
        contaCorrente2.setSaldo((float) (byte) 0);
        float float8 = contaCorrente2.getSaldo();
        contaCorrente2.setLimite((-10.0f));
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        java.lang.String str3 = codigos.Triangulo.classificaTriangulo((int) (byte) 1, (int) (short) 10, 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "NAO FORMA TRIANGULO" + "'", str3, "NAO FORMA TRIANGULO");
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        float float3 = contaCorrente2.getSaldo();
        contaCorrente2.setLimite(0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        codigos.LadoInvalidoException ladoInvalidoException1 = new codigos.LadoInvalidoException("hi!");
        codigos.LadoInvalidoException ladoInvalidoException3 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException5 = new codigos.LadoInvalidoException("");
        ladoInvalidoException3.addSuppressed((java.lang.Throwable) ladoInvalidoException5);
        codigos.LadoInvalidoException ladoInvalidoException8 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException10 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException12 = new codigos.LadoInvalidoException("");
        ladoInvalidoException10.addSuppressed((java.lang.Throwable) ladoInvalidoException12);
        ladoInvalidoException8.addSuppressed((java.lang.Throwable) ladoInvalidoException12);
        java.lang.Throwable[] throwableArray15 = ladoInvalidoException12.getSuppressed();
        ladoInvalidoException5.addSuppressed((java.lang.Throwable) ladoInvalidoException12);
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException12);
        codigos.LadoInvalidoException ladoInvalidoException19 = new codigos.LadoInvalidoException("codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!");
        codigos.LadoInvalidoException ladoInvalidoException21 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException23 = new codigos.LadoInvalidoException("");
        ladoInvalidoException21.addSuppressed((java.lang.Throwable) ladoInvalidoException23);
        codigos.LadoInvalidoException ladoInvalidoException26 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException28 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException30 = new codigos.LadoInvalidoException("");
        ladoInvalidoException28.addSuppressed((java.lang.Throwable) ladoInvalidoException30);
        ladoInvalidoException26.addSuppressed((java.lang.Throwable) ladoInvalidoException30);
        java.lang.Throwable[] throwableArray33 = ladoInvalidoException30.getSuppressed();
        ladoInvalidoException23.addSuppressed((java.lang.Throwable) ladoInvalidoException30);
        java.lang.Throwable[] throwableArray35 = ladoInvalidoException30.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException37 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException39 = new codigos.LadoInvalidoException("");
        ladoInvalidoException37.addSuppressed((java.lang.Throwable) ladoInvalidoException39);
        codigos.LadoInvalidoException ladoInvalidoException42 = new codigos.LadoInvalidoException("hi!");
        ladoInvalidoException39.addSuppressed((java.lang.Throwable) ladoInvalidoException42);
        codigos.LadoInvalidoException ladoInvalidoException45 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException47 = new codigos.LadoInvalidoException("");
        ladoInvalidoException45.addSuppressed((java.lang.Throwable) ladoInvalidoException47);
        codigos.LadoInvalidoException ladoInvalidoException50 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException52 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException54 = new codigos.LadoInvalidoException("");
        ladoInvalidoException52.addSuppressed((java.lang.Throwable) ladoInvalidoException54);
        ladoInvalidoException50.addSuppressed((java.lang.Throwable) ladoInvalidoException54);
        java.lang.Throwable[] throwableArray57 = ladoInvalidoException54.getSuppressed();
        ladoInvalidoException47.addSuppressed((java.lang.Throwable) ladoInvalidoException54);
        codigos.LadoInvalidoException ladoInvalidoException60 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException62 = new codigos.LadoInvalidoException("");
        ladoInvalidoException60.addSuppressed((java.lang.Throwable) ladoInvalidoException62);
        codigos.LadoInvalidoException ladoInvalidoException65 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException67 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException69 = new codigos.LadoInvalidoException("");
        ladoInvalidoException67.addSuppressed((java.lang.Throwable) ladoInvalidoException69);
        ladoInvalidoException65.addSuppressed((java.lang.Throwable) ladoInvalidoException69);
        java.lang.Throwable[] throwableArray72 = ladoInvalidoException69.getSuppressed();
        ladoInvalidoException62.addSuppressed((java.lang.Throwable) ladoInvalidoException69);
        java.lang.Throwable[] throwableArray74 = ladoInvalidoException69.getSuppressed();
        ladoInvalidoException54.addSuppressed((java.lang.Throwable) ladoInvalidoException69);
        ladoInvalidoException39.addSuppressed((java.lang.Throwable) ladoInvalidoException54);
        ladoInvalidoException30.addSuppressed((java.lang.Throwable) ladoInvalidoException39);
        ladoInvalidoException19.addSuppressed((java.lang.Throwable) ladoInvalidoException30);
        ladoInvalidoException12.addSuppressed((java.lang.Throwable) ladoInvalidoException19);
        java.lang.Throwable[] throwableArray80 = ladoInvalidoException12.getSuppressed();
        java.lang.Throwable[] throwableArray81 = ladoInvalidoException12.getSuppressed();
        java.lang.String str82 = ladoInvalidoException12.toString();
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray57);
        org.junit.Assert.assertNotNull(throwableArray72);
        org.junit.Assert.assertNotNull(throwableArray74);
        org.junit.Assert.assertNotNull(throwableArray80);
        org.junit.Assert.assertNotNull(throwableArray81);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "codigos.LadoInvalidoException: " + "'", str82, "codigos.LadoInvalidoException: ");
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
        codigos.LadoInvalidoException ladoInvalidoException1 = new codigos.LadoInvalidoException("hi!");
        codigos.LadoInvalidoException ladoInvalidoException3 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException5 = new codigos.LadoInvalidoException("");
        ladoInvalidoException3.addSuppressed((java.lang.Throwable) ladoInvalidoException5);
        codigos.LadoInvalidoException ladoInvalidoException8 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException10 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException12 = new codigos.LadoInvalidoException("");
        ladoInvalidoException10.addSuppressed((java.lang.Throwable) ladoInvalidoException12);
        ladoInvalidoException8.addSuppressed((java.lang.Throwable) ladoInvalidoException12);
        java.lang.Throwable[] throwableArray15 = ladoInvalidoException12.getSuppressed();
        ladoInvalidoException5.addSuppressed((java.lang.Throwable) ladoInvalidoException12);
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException12);
        codigos.LadoInvalidoException ladoInvalidoException19 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException21 = new codigos.LadoInvalidoException("");
        ladoInvalidoException19.addSuppressed((java.lang.Throwable) ladoInvalidoException21);
        codigos.LadoInvalidoException ladoInvalidoException24 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException26 = new codigos.LadoInvalidoException("");
        ladoInvalidoException24.addSuppressed((java.lang.Throwable) ladoInvalidoException26);
        codigos.LadoInvalidoException ladoInvalidoException29 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException31 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException33 = new codigos.LadoInvalidoException("");
        ladoInvalidoException31.addSuppressed((java.lang.Throwable) ladoInvalidoException33);
        ladoInvalidoException29.addSuppressed((java.lang.Throwable) ladoInvalidoException33);
        java.lang.Throwable[] throwableArray36 = ladoInvalidoException33.getSuppressed();
        ladoInvalidoException26.addSuppressed((java.lang.Throwable) ladoInvalidoException33);
        java.lang.Throwable[] throwableArray38 = ladoInvalidoException33.getSuppressed();
        ladoInvalidoException21.addSuppressed((java.lang.Throwable) ladoInvalidoException33);
        java.lang.Throwable[] throwableArray40 = ladoInvalidoException33.getSuppressed();
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException33);
        java.lang.Throwable[] throwableArray42 = ladoInvalidoException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertNotNull(throwableArray40);
        org.junit.Assert.assertNotNull(throwableArray42);
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 1, 32.0f);
        float float4 = contaCorrente2.saque((float) 10);
        // The following exception was thrown during execution in test generation
        try {
            float float6 = contaCorrente2.saque(62.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Saldo Insuficiente");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-9.0f) + "'", float4 == (-9.0f));
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) ' ', 1.0f);
        float float3 = contaCorrente2.getLimite();
        contaCorrente2.setLimite((-11.0f));
        float float6 = contaCorrente2.getSaldo();
        float float7 = contaCorrente2.getSaldo();
        contaCorrente2.setSaldo((float) ' ');
        float float11 = contaCorrente2.saque(10.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 32.0f + "'", float6 == 32.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 32.0f + "'", float7 == 32.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 22.0f + "'", float11 == 22.0f);
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(42.0f, 32.0f);
        float float3 = contaCorrente2.getSaldo();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 42.0f + "'", float3 == 42.0f);
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = codigos.Triangulo.classificaTriangulo(0, 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type codigos.LadoInvalidoException; message: lado invalido");
        } catch (codigos.LadoInvalidoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(97.0f, (-41.0f));
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(1.0f, 1.0f);
        contaCorrente2.setSaldo((float) 100);
        float float6 = contaCorrente2.saque((float) 100);
        float float7 = contaCorrente2.getLimite();
        contaCorrente2.setSaldo((float) 10);
        float float10 = contaCorrente2.getLimite();
        float float11 = contaCorrente2.getSaldo();
        java.lang.Class<?> wildcardClass12 = contaCorrente2.getClass();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 1.0f + "'", float7 == 1.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.0f + "'", float10 == 1.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(9.0f, (float) (short) -1);
        float float3 = contaCorrente2.getLimite();
        // The following exception was thrown during execution in test generation
        try {
            float float5 = contaCorrente2.saque((float) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Saldo Insuficiente");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", 1.0f);
        float float8 = pedido0.calculaTaxaDesconto(false, "", (float) 1);
        float float12 = pedido0.calculaTaxaDesconto(false, "hi!", (float) (short) 100);
        float float16 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: hi!", (float) '#');
        float float20 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ", (float) (short) 0);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        codigos.LadoInvalidoException ladoInvalidoException1 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException3 = new codigos.LadoInvalidoException("");
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException3);
        codigos.LadoInvalidoException ladoInvalidoException6 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException8 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException10 = new codigos.LadoInvalidoException("");
        ladoInvalidoException8.addSuppressed((java.lang.Throwable) ladoInvalidoException10);
        ladoInvalidoException6.addSuppressed((java.lang.Throwable) ladoInvalidoException10);
        java.lang.Throwable[] throwableArray13 = ladoInvalidoException10.getSuppressed();
        ladoInvalidoException3.addSuppressed((java.lang.Throwable) ladoInvalidoException10);
        java.lang.Throwable[] throwableArray15 = ladoInvalidoException10.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException17 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException19 = new codigos.LadoInvalidoException("");
        ladoInvalidoException17.addSuppressed((java.lang.Throwable) ladoInvalidoException19);
        codigos.LadoInvalidoException ladoInvalidoException22 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException24 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException26 = new codigos.LadoInvalidoException("");
        ladoInvalidoException24.addSuppressed((java.lang.Throwable) ladoInvalidoException26);
        ladoInvalidoException22.addSuppressed((java.lang.Throwable) ladoInvalidoException26);
        java.lang.Throwable[] throwableArray29 = ladoInvalidoException26.getSuppressed();
        ladoInvalidoException19.addSuppressed((java.lang.Throwable) ladoInvalidoException26);
        codigos.LadoInvalidoException ladoInvalidoException32 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException34 = new codigos.LadoInvalidoException("");
        ladoInvalidoException32.addSuppressed((java.lang.Throwable) ladoInvalidoException34);
        codigos.LadoInvalidoException ladoInvalidoException37 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException39 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException41 = new codigos.LadoInvalidoException("");
        ladoInvalidoException39.addSuppressed((java.lang.Throwable) ladoInvalidoException41);
        ladoInvalidoException37.addSuppressed((java.lang.Throwable) ladoInvalidoException41);
        java.lang.Throwable[] throwableArray44 = ladoInvalidoException41.getSuppressed();
        ladoInvalidoException34.addSuppressed((java.lang.Throwable) ladoInvalidoException41);
        java.lang.Throwable[] throwableArray46 = ladoInvalidoException41.getSuppressed();
        ladoInvalidoException26.addSuppressed((java.lang.Throwable) ladoInvalidoException41);
        ladoInvalidoException10.addSuppressed((java.lang.Throwable) ladoInvalidoException41);
        java.lang.Throwable[] throwableArray49 = ladoInvalidoException10.getSuppressed();
        java.lang.String str50 = ladoInvalidoException10.toString();
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertNotNull(throwableArray46);
        org.junit.Assert.assertNotNull(throwableArray49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "codigos.LadoInvalidoException: " + "'", str50, "codigos.LadoInvalidoException: ");
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(1.0f, (float) '4');
        float float3 = contaCorrente2.getLimite();
        float float5 = contaCorrente2.saque(42.0f);
        contaCorrente2.setSaldo((-2.0f));
        contaCorrente2.setLimite((float) 10L);
        contaCorrente2.setSaldo((-29.0f));
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 52.0f + "'", float3 == 52.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-41.0f) + "'", float5 == (-41.0f));
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", 1.0f);
        float float8 = pedido0.calculaTaxaDesconto(false, "", (float) 1);
        float float12 = pedido0.calculaTaxaDesconto(false, "hi!", (float) (short) 100);
        float float16 = pedido0.calculaTaxaDesconto(true, "", (float) ' ');
        float float20 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: ", (float) 100);
        float float24 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: hi!", (float) (byte) -1);
        float float28 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!", (float) 2);
        float float32 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!", 0.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 10.0f + "'", float24 == 10.0f);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 10.0f + "'", float28 == 10.0f);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 0.0f + "'", float32 == 0.0f);
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", (float) (short) -1);
        float float8 = pedido0.calculaTaxaDesconto(true, "NAO FORMA TRIANGULO", (float) (byte) 0);
        float float12 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!", (float) (byte) 10);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
        codigos.LadoInvalidoException ladoInvalidoException1 = new codigos.LadoInvalidoException("NAO FORMA TRIANGULO");
        codigos.LadoInvalidoException ladoInvalidoException3 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException5 = new codigos.LadoInvalidoException("");
        ladoInvalidoException3.addSuppressed((java.lang.Throwable) ladoInvalidoException5);
        codigos.LadoInvalidoException ladoInvalidoException8 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException10 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException12 = new codigos.LadoInvalidoException("");
        ladoInvalidoException10.addSuppressed((java.lang.Throwable) ladoInvalidoException12);
        ladoInvalidoException8.addSuppressed((java.lang.Throwable) ladoInvalidoException12);
        java.lang.Throwable[] throwableArray15 = ladoInvalidoException12.getSuppressed();
        ladoInvalidoException5.addSuppressed((java.lang.Throwable) ladoInvalidoException12);
        codigos.LadoInvalidoException ladoInvalidoException18 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException20 = new codigos.LadoInvalidoException("");
        ladoInvalidoException18.addSuppressed((java.lang.Throwable) ladoInvalidoException20);
        codigos.LadoInvalidoException ladoInvalidoException23 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException25 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException27 = new codigos.LadoInvalidoException("");
        ladoInvalidoException25.addSuppressed((java.lang.Throwable) ladoInvalidoException27);
        ladoInvalidoException23.addSuppressed((java.lang.Throwable) ladoInvalidoException27);
        java.lang.Throwable[] throwableArray30 = ladoInvalidoException27.getSuppressed();
        ladoInvalidoException20.addSuppressed((java.lang.Throwable) ladoInvalidoException27);
        java.lang.Throwable[] throwableArray32 = ladoInvalidoException27.getSuppressed();
        ladoInvalidoException12.addSuppressed((java.lang.Throwable) ladoInvalidoException27);
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException12);
        java.lang.Throwable[] throwableArray35 = ladoInvalidoException1.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException37 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException39 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException41 = new codigos.LadoInvalidoException("");
        ladoInvalidoException39.addSuppressed((java.lang.Throwable) ladoInvalidoException41);
        ladoInvalidoException37.addSuppressed((java.lang.Throwable) ladoInvalidoException41);
        java.lang.Throwable[] throwableArray44 = ladoInvalidoException37.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException46 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException48 = new codigos.LadoInvalidoException("");
        ladoInvalidoException46.addSuppressed((java.lang.Throwable) ladoInvalidoException48);
        codigos.LadoInvalidoException ladoInvalidoException51 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException53 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException55 = new codigos.LadoInvalidoException("");
        ladoInvalidoException53.addSuppressed((java.lang.Throwable) ladoInvalidoException55);
        ladoInvalidoException51.addSuppressed((java.lang.Throwable) ladoInvalidoException55);
        java.lang.Throwable[] throwableArray58 = ladoInvalidoException55.getSuppressed();
        ladoInvalidoException48.addSuppressed((java.lang.Throwable) ladoInvalidoException55);
        codigos.LadoInvalidoException ladoInvalidoException61 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException63 = new codigos.LadoInvalidoException("");
        ladoInvalidoException61.addSuppressed((java.lang.Throwable) ladoInvalidoException63);
        codigos.LadoInvalidoException ladoInvalidoException66 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException68 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException70 = new codigos.LadoInvalidoException("");
        ladoInvalidoException68.addSuppressed((java.lang.Throwable) ladoInvalidoException70);
        ladoInvalidoException66.addSuppressed((java.lang.Throwable) ladoInvalidoException70);
        java.lang.Throwable[] throwableArray73 = ladoInvalidoException70.getSuppressed();
        ladoInvalidoException63.addSuppressed((java.lang.Throwable) ladoInvalidoException70);
        java.lang.Throwable[] throwableArray75 = ladoInvalidoException70.getSuppressed();
        ladoInvalidoException55.addSuppressed((java.lang.Throwable) ladoInvalidoException70);
        codigos.LadoInvalidoException ladoInvalidoException78 = new codigos.LadoInvalidoException("codigos.LadoInvalidoException: hi!");
        ladoInvalidoException70.addSuppressed((java.lang.Throwable) ladoInvalidoException78);
        java.lang.Throwable[] throwableArray80 = ladoInvalidoException78.getSuppressed();
        ladoInvalidoException37.addSuppressed((java.lang.Throwable) ladoInvalidoException78);
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException37);
        java.lang.Throwable[] throwableArray83 = ladoInvalidoException37.getSuppressed();
        java.lang.Throwable[] throwableArray84 = ladoInvalidoException37.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertNotNull(throwableArray58);
        org.junit.Assert.assertNotNull(throwableArray73);
        org.junit.Assert.assertNotNull(throwableArray75);
        org.junit.Assert.assertNotNull(throwableArray80);
        org.junit.Assert.assertNotNull(throwableArray83);
        org.junit.Assert.assertNotNull(throwableArray84);
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
        codigos.Words words0 = new codigos.Words();
        int int2 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int4 = words0.countWords("NAO FORMA TRIANGULO");
        int int6 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int8 = words0.countWords("NAO FORMA TRIANGULO");
        int int10 = words0.countWords("");
        int int12 = words0.countWords("hi!");
        int int14 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        int int16 = words0.countWords("codigos.LadoInvalidoException: ESCALENO");
        int int18 = words0.countWords("ESCALENO");
        int int20 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
        java.lang.String str3 = codigos.Triangulo.classificaTriangulo((int) (byte) 100, 1, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "NAO FORMA TRIANGULO" + "'", str3, "NAO FORMA TRIANGULO");
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        float float3 = contaCorrente2.getLimite();
        float float4 = contaCorrente2.getSaldo();
        float float5 = contaCorrente2.getLimite();
        float float6 = contaCorrente2.getSaldo();
        contaCorrente2.setLimite((float) (byte) 10);
        contaCorrente2.setSaldo((float) 100L);
        contaCorrente2.setSaldo(90.0f);
        float float13 = contaCorrente2.getSaldo();
        float float15 = contaCorrente2.saque(7.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 90.0f + "'", float13 == 90.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 83.0f + "'", float15 == 83.0f);
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 100L, (float) 10);
        float float3 = contaCorrente2.getSaldo();
        float float4 = contaCorrente2.getLimite();
        contaCorrente2.setSaldo((float) ' ');
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(52.0f, 78.0f);
        java.lang.Class<?> wildcardClass3 = contaCorrente2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        codigos.LadoInvalidoException ladoInvalidoException1 = new codigos.LadoInvalidoException("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!");
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
        java.lang.String str3 = codigos.Triangulo.classificaTriangulo((int) (short) 1, 100, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "NAO FORMA TRIANGULO" + "'", str3, "NAO FORMA TRIANGULO");
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", 1.0f);
        float float8 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: hi!", (float) (short) 10);
        float float12 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", (float) ' ');
        float float16 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!", (float) (short) -1);
        float float20 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!", 32.0f);
        float float24 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ", 98.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10.0f + "'", float12 == 10.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 10.0f + "'", float20 == 10.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 10.0f + "'", float24 == 10.0f);
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        float float3 = contaCorrente2.getLimite();
        float float4 = contaCorrente2.getSaldo();
        float float5 = contaCorrente2.getLimite();
        float float6 = contaCorrente2.getSaldo();
        contaCorrente2.setLimite((float) (byte) 10);
        contaCorrente2.setLimite((float) 100);
        contaCorrente2.setSaldo(100.0f);
        contaCorrente2.setSaldo((-59.0f));
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        float float3 = contaCorrente2.getLimite();
        float float4 = contaCorrente2.getLimite();
        float float5 = contaCorrente2.getSaldo();
        float float6 = contaCorrente2.getSaldo();
        float float7 = contaCorrente2.getSaldo();
        java.lang.Class<?> wildcardClass8 = contaCorrente2.getClass();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.0f) + "'", float4 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 100.0f + "'", float5 == 100.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
        codigos.LadoInvalidoException ladoInvalidoException1 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException3 = new codigos.LadoInvalidoException("");
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException3);
        codigos.LadoInvalidoException ladoInvalidoException6 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException8 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException10 = new codigos.LadoInvalidoException("");
        ladoInvalidoException8.addSuppressed((java.lang.Throwable) ladoInvalidoException10);
        ladoInvalidoException6.addSuppressed((java.lang.Throwable) ladoInvalidoException10);
        java.lang.Throwable[] throwableArray13 = ladoInvalidoException10.getSuppressed();
        ladoInvalidoException3.addSuppressed((java.lang.Throwable) ladoInvalidoException10);
        java.lang.Throwable[] throwableArray15 = ladoInvalidoException10.getSuppressed();
        java.lang.Throwable[] throwableArray16 = ladoInvalidoException10.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException18 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException20 = new codigos.LadoInvalidoException("");
        ladoInvalidoException18.addSuppressed((java.lang.Throwable) ladoInvalidoException20);
        codigos.LadoInvalidoException ladoInvalidoException23 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException25 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException27 = new codigos.LadoInvalidoException("");
        ladoInvalidoException25.addSuppressed((java.lang.Throwable) ladoInvalidoException27);
        ladoInvalidoException23.addSuppressed((java.lang.Throwable) ladoInvalidoException27);
        java.lang.Throwable[] throwableArray30 = ladoInvalidoException27.getSuppressed();
        ladoInvalidoException20.addSuppressed((java.lang.Throwable) ladoInvalidoException27);
        codigos.LadoInvalidoException ladoInvalidoException33 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException35 = new codigos.LadoInvalidoException("");
        ladoInvalidoException33.addSuppressed((java.lang.Throwable) ladoInvalidoException35);
        codigos.LadoInvalidoException ladoInvalidoException38 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException40 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException42 = new codigos.LadoInvalidoException("");
        ladoInvalidoException40.addSuppressed((java.lang.Throwable) ladoInvalidoException42);
        ladoInvalidoException38.addSuppressed((java.lang.Throwable) ladoInvalidoException42);
        java.lang.Throwable[] throwableArray45 = ladoInvalidoException42.getSuppressed();
        ladoInvalidoException35.addSuppressed((java.lang.Throwable) ladoInvalidoException42);
        java.lang.Throwable[] throwableArray47 = ladoInvalidoException42.getSuppressed();
        ladoInvalidoException27.addSuppressed((java.lang.Throwable) ladoInvalidoException42);
        java.lang.Throwable[] throwableArray49 = ladoInvalidoException27.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException51 = new codigos.LadoInvalidoException("hi!");
        codigos.LadoInvalidoException ladoInvalidoException53 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException55 = new codigos.LadoInvalidoException("");
        ladoInvalidoException53.addSuppressed((java.lang.Throwable) ladoInvalidoException55);
        codigos.LadoInvalidoException ladoInvalidoException58 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException60 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException62 = new codigos.LadoInvalidoException("");
        ladoInvalidoException60.addSuppressed((java.lang.Throwable) ladoInvalidoException62);
        ladoInvalidoException58.addSuppressed((java.lang.Throwable) ladoInvalidoException62);
        java.lang.Throwable[] throwableArray65 = ladoInvalidoException62.getSuppressed();
        ladoInvalidoException55.addSuppressed((java.lang.Throwable) ladoInvalidoException62);
        ladoInvalidoException51.addSuppressed((java.lang.Throwable) ladoInvalidoException62);
        codigos.LadoInvalidoException ladoInvalidoException69 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException71 = new codigos.LadoInvalidoException("");
        ladoInvalidoException69.addSuppressed((java.lang.Throwable) ladoInvalidoException71);
        codigos.LadoInvalidoException ladoInvalidoException74 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException76 = new codigos.LadoInvalidoException("");
        ladoInvalidoException74.addSuppressed((java.lang.Throwable) ladoInvalidoException76);
        codigos.LadoInvalidoException ladoInvalidoException79 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException81 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException83 = new codigos.LadoInvalidoException("");
        ladoInvalidoException81.addSuppressed((java.lang.Throwable) ladoInvalidoException83);
        ladoInvalidoException79.addSuppressed((java.lang.Throwable) ladoInvalidoException83);
        java.lang.Throwable[] throwableArray86 = ladoInvalidoException83.getSuppressed();
        ladoInvalidoException76.addSuppressed((java.lang.Throwable) ladoInvalidoException83);
        java.lang.Throwable[] throwableArray88 = ladoInvalidoException83.getSuppressed();
        ladoInvalidoException71.addSuppressed((java.lang.Throwable) ladoInvalidoException83);
        java.lang.Throwable[] throwableArray90 = ladoInvalidoException83.getSuppressed();
        ladoInvalidoException51.addSuppressed((java.lang.Throwable) ladoInvalidoException83);
        ladoInvalidoException27.addSuppressed((java.lang.Throwable) ladoInvalidoException83);
        java.lang.Throwable[] throwableArray93 = ladoInvalidoException83.getSuppressed();
        java.lang.Throwable[] throwableArray94 = ladoInvalidoException83.getSuppressed();
        java.lang.Throwable[] throwableArray95 = ladoInvalidoException83.getSuppressed();
        ladoInvalidoException10.addSuppressed((java.lang.Throwable) ladoInvalidoException83);
        java.lang.String str97 = ladoInvalidoException83.toString();
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray45);
        org.junit.Assert.assertNotNull(throwableArray47);
        org.junit.Assert.assertNotNull(throwableArray49);
        org.junit.Assert.assertNotNull(throwableArray65);
        org.junit.Assert.assertNotNull(throwableArray86);
        org.junit.Assert.assertNotNull(throwableArray88);
        org.junit.Assert.assertNotNull(throwableArray90);
        org.junit.Assert.assertNotNull(throwableArray93);
        org.junit.Assert.assertNotNull(throwableArray94);
        org.junit.Assert.assertNotNull(throwableArray95);
        org.junit.Assert.assertEquals("'" + str97 + "' != '" + "codigos.LadoInvalidoException: " + "'", str97, "codigos.LadoInvalidoException: ");
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
        codigos.LadoInvalidoException ladoInvalidoException1 = new codigos.LadoInvalidoException("");
        java.lang.Throwable[] throwableArray2 = ladoInvalidoException1.getSuppressed();
        java.lang.Throwable[] throwableArray3 = ladoInvalidoException1.getSuppressed();
        java.lang.Throwable[] throwableArray4 = ladoInvalidoException1.getSuppressed();
        java.lang.Throwable[] throwableArray5 = ladoInvalidoException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(35.0f, 42.0f);
        contaCorrente2.setLimite((float) 100);
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
        codigos.Words words0 = new codigos.Words();
        int int2 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int4 = words0.countWords("NAO FORMA TRIANGULO");
        int int6 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int8 = words0.countWords("NAO FORMA TRIANGULO");
        int int10 = words0.countWords("");
        int int12 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int14 = words0.countWords("codigos.LadoInvalidoException: ");
        int int16 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!");
        int int18 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = codigos.Triangulo.classificaTriangulo((int) (short) 10, 6, (-1));
            org.junit.Assert.fail("Expected exception of type codigos.LadoInvalidoException; message: lado invalido");
        } catch (codigos.LadoInvalidoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((-11.0f), (float) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            float float4 = contaCorrente2.saque(0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Valor invalido");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = codigos.Triangulo.classificaTriangulo(0, (int) (short) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type codigos.LadoInvalidoException; message: lado invalido");
        } catch (codigos.LadoInvalidoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        float float3 = contaCorrente2.getLimite();
        float float4 = contaCorrente2.getSaldo();
        float float5 = contaCorrente2.getLimite();
        float float6 = contaCorrente2.getSaldo();
        contaCorrente2.setLimite((float) (byte) 10);
        contaCorrente2.setSaldo((float) 100L);
        contaCorrente2.setLimite((float) (byte) 10);
        float float13 = contaCorrente2.getSaldo();
        float float14 = contaCorrente2.getLimite();
        float float15 = contaCorrente2.getLimite();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 100.0f + "'", float13 == 100.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 10.0f + "'", float14 == 10.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10.0f + "'", float15 == 10.0f);
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 0, (float) 10L);
        float float4 = contaCorrente2.saque(2.0f);
        java.lang.Class<?> wildcardClass5 = contaCorrente2.getClass();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-2.0f) + "'", float4 == (-2.0f));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
        codigos.LadoInvalidoException ladoInvalidoException1 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException3 = new codigos.LadoInvalidoException("");
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException3);
        codigos.LadoInvalidoException ladoInvalidoException6 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException8 = new codigos.LadoInvalidoException("");
        ladoInvalidoException6.addSuppressed((java.lang.Throwable) ladoInvalidoException8);
        codigos.LadoInvalidoException ladoInvalidoException11 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException13 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException15 = new codigos.LadoInvalidoException("");
        ladoInvalidoException13.addSuppressed((java.lang.Throwable) ladoInvalidoException15);
        ladoInvalidoException11.addSuppressed((java.lang.Throwable) ladoInvalidoException15);
        java.lang.Throwable[] throwableArray18 = ladoInvalidoException15.getSuppressed();
        ladoInvalidoException8.addSuppressed((java.lang.Throwable) ladoInvalidoException15);
        java.lang.Throwable[] throwableArray20 = ladoInvalidoException15.getSuppressed();
        ladoInvalidoException3.addSuppressed((java.lang.Throwable) ladoInvalidoException15);
        java.lang.Throwable[] throwableArray22 = ladoInvalidoException15.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException24 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException26 = new codigos.LadoInvalidoException("");
        ladoInvalidoException24.addSuppressed((java.lang.Throwable) ladoInvalidoException26);
        codigos.LadoInvalidoException ladoInvalidoException29 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException31 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException33 = new codigos.LadoInvalidoException("");
        ladoInvalidoException31.addSuppressed((java.lang.Throwable) ladoInvalidoException33);
        ladoInvalidoException29.addSuppressed((java.lang.Throwable) ladoInvalidoException33);
        java.lang.Throwable[] throwableArray36 = ladoInvalidoException33.getSuppressed();
        ladoInvalidoException26.addSuppressed((java.lang.Throwable) ladoInvalidoException33);
        java.lang.Throwable[] throwableArray38 = ladoInvalidoException33.getSuppressed();
        ladoInvalidoException15.addSuppressed((java.lang.Throwable) ladoInvalidoException33);
        java.lang.String str40 = ladoInvalidoException15.toString();
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "codigos.LadoInvalidoException: " + "'", str40, "codigos.LadoInvalidoException: ");
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", (float) (short) -1);
        float float8 = pedido0.calculaTaxaDesconto(true, "NAO FORMA TRIANGULO", (float) (byte) 0);
        float float12 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!", (float) (-1L));
        float float16 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: ", 99.0f);
        float float20 = pedido0.calculaTaxaDesconto(false, "NAO FORMA TRIANGULO", 97.0f);
        float float24 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: ", 31.0f);
        float float28 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!", 5.0f);
        float float32 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!", 68.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10.0f + "'", float12 == 10.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.0f + "'", float24 == 0.0f);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 0.0f + "'", float28 == 0.0f);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 10.0f + "'", float32 == 10.0f);
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(10.0f, (float) ' ');
        contaCorrente2.setLimite((float) (short) 10);
        contaCorrente2.setLimite((-56.0f));
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(9.0f, 32.0f);
        contaCorrente2.setSaldo(1.0f);
        contaCorrente2.setLimite(51.0f);
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        float float3 = contaCorrente2.getSaldo();
        contaCorrente2.setSaldo(100.0f);
        float float6 = contaCorrente2.getLimite();
        contaCorrente2.setSaldo(100.0f);
        java.lang.Class<?> wildcardClass9 = contaCorrente2.getClass();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-1.0f) + "'", float6 == (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) '#', 2.0f);
        contaCorrente2.setLimite(88.0f);
        float float5 = contaCorrente2.getSaldo();
        float float6 = contaCorrente2.getSaldo();
        // The following exception was thrown during execution in test generation
        try {
            float float8 = contaCorrente2.saque(0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Valor invalido");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 35.0f + "'", float5 == 35.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 35.0f + "'", float6 == 35.0f);
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 10, 0.0f);
        float float3 = contaCorrente2.getSaldo();
        float float5 = contaCorrente2.saque(1.0f);
        contaCorrente2.setLimite(10.0f);
        float float8 = contaCorrente2.getSaldo();
        contaCorrente2.setLimite((float) 2);
        float float11 = contaCorrente2.getSaldo();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 9.0f + "'", float5 == 9.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 9.0f + "'", float8 == 9.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 9.0f + "'", float11 == 9.0f);
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        float float3 = contaCorrente2.getLimite();
        float float4 = contaCorrente2.getSaldo();
        float float5 = contaCorrente2.getLimite();
        float float6 = contaCorrente2.getSaldo();
        contaCorrente2.setLimite((float) (byte) 10);
        float float9 = contaCorrente2.getLimite();
        contaCorrente2.setLimite(100.0f);
        contaCorrente2.setSaldo((-52.0f));
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 10, (float) 3);
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 0, 89.0f);
        contaCorrente2.setLimite((float) 0);
        contaCorrente2.setSaldo((-57.0f));
        float float7 = contaCorrente2.getLimite();
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
        codigos.Words words0 = new codigos.Words();
        int int2 = words0.countWords("");
        int int4 = words0.countWords("");
        int int6 = words0.countWords("codigos.LadoInvalidoException: ");
        int int8 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!");
        int int10 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int12 = words0.countWords("codigos.LadoInvalidoException: ");
        java.lang.Class<?> wildcardClass13 = words0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) '#', (float) 0L);
        float float3 = contaCorrente2.getSaldo();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 35.0f + "'", float3 == 35.0f);
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        contaCorrente2.setLimite((float) 0L);
        contaCorrente2.setLimite((float) (short) 0);
        float float8 = contaCorrente2.saque((float) 1);
        contaCorrente2.setSaldo(89.0f);
        float float11 = contaCorrente2.getLimite();
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 99.0f + "'", float8 == 99.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (short) 1, 68.0f);
        float float3 = contaCorrente2.getLimite();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 68.0f + "'", float3 == 68.0f);
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((-48.0f), (float) (byte) 1);
        java.lang.Class<?> wildcardClass3 = contaCorrente2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        float float3 = contaCorrente2.getSaldo();
        contaCorrente2.setSaldo(100.0f);
        contaCorrente2.setLimite(0.0f);
        float float8 = contaCorrente2.getSaldo();
        contaCorrente2.setSaldo((float) 10);
        contaCorrente2.setLimite((-87.0f));
        contaCorrente2.setLimite((float) 1);
        contaCorrente2.setSaldo(4.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(42.0f, 35.0f);
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", (float) (short) -1);
        float float8 = pedido0.calculaTaxaDesconto(true, "NAO FORMA TRIANGULO", (float) (byte) 0);
        float float12 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: hi!", (float) (short) 100);
        float float16 = pedido0.calculaTaxaDesconto(false, "ESCALENO", 35.0f);
        float float20 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!", 96.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10.0f + "'", float12 == 10.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 10.0f + "'", float20 == 10.0f);
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
        codigos.LadoInvalidoException ladoInvalidoException1 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException3 = new codigos.LadoInvalidoException("");
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException3);
        codigos.LadoInvalidoException ladoInvalidoException6 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException8 = new codigos.LadoInvalidoException("");
        ladoInvalidoException6.addSuppressed((java.lang.Throwable) ladoInvalidoException8);
        codigos.LadoInvalidoException ladoInvalidoException11 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException13 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException15 = new codigos.LadoInvalidoException("");
        ladoInvalidoException13.addSuppressed((java.lang.Throwable) ladoInvalidoException15);
        ladoInvalidoException11.addSuppressed((java.lang.Throwable) ladoInvalidoException15);
        java.lang.Throwable[] throwableArray18 = ladoInvalidoException15.getSuppressed();
        ladoInvalidoException8.addSuppressed((java.lang.Throwable) ladoInvalidoException15);
        java.lang.Throwable[] throwableArray20 = ladoInvalidoException15.getSuppressed();
        ladoInvalidoException3.addSuppressed((java.lang.Throwable) ladoInvalidoException15);
        java.lang.Throwable[] throwableArray22 = ladoInvalidoException15.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException24 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException26 = new codigos.LadoInvalidoException("");
        ladoInvalidoException24.addSuppressed((java.lang.Throwable) ladoInvalidoException26);
        codigos.LadoInvalidoException ladoInvalidoException29 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException31 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException33 = new codigos.LadoInvalidoException("");
        ladoInvalidoException31.addSuppressed((java.lang.Throwable) ladoInvalidoException33);
        ladoInvalidoException29.addSuppressed((java.lang.Throwable) ladoInvalidoException33);
        java.lang.Throwable[] throwableArray36 = ladoInvalidoException33.getSuppressed();
        ladoInvalidoException26.addSuppressed((java.lang.Throwable) ladoInvalidoException33);
        java.lang.Throwable[] throwableArray38 = ladoInvalidoException33.getSuppressed();
        ladoInvalidoException15.addSuppressed((java.lang.Throwable) ladoInvalidoException33);
        codigos.LadoInvalidoException ladoInvalidoException41 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException43 = new codigos.LadoInvalidoException("");
        ladoInvalidoException41.addSuppressed((java.lang.Throwable) ladoInvalidoException43);
        codigos.LadoInvalidoException ladoInvalidoException46 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException48 = new codigos.LadoInvalidoException("");
        ladoInvalidoException46.addSuppressed((java.lang.Throwable) ladoInvalidoException48);
        codigos.LadoInvalidoException ladoInvalidoException51 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException53 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException55 = new codigos.LadoInvalidoException("");
        ladoInvalidoException53.addSuppressed((java.lang.Throwable) ladoInvalidoException55);
        ladoInvalidoException51.addSuppressed((java.lang.Throwable) ladoInvalidoException55);
        java.lang.Throwable[] throwableArray58 = ladoInvalidoException55.getSuppressed();
        ladoInvalidoException48.addSuppressed((java.lang.Throwable) ladoInvalidoException55);
        java.lang.Throwable[] throwableArray60 = ladoInvalidoException55.getSuppressed();
        ladoInvalidoException43.addSuppressed((java.lang.Throwable) ladoInvalidoException55);
        ladoInvalidoException15.addSuppressed((java.lang.Throwable) ladoInvalidoException55);
        java.lang.String str63 = ladoInvalidoException55.toString();
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertNotNull(throwableArray58);
        org.junit.Assert.assertNotNull(throwableArray60);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "codigos.LadoInvalidoException: " + "'", str63, "codigos.LadoInvalidoException: ");
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(23.0f, (float) ' ');
        contaCorrente2.setSaldo((-11.0f));
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(23.0f, 89.0f);
        float float3 = contaCorrente2.getSaldo();
        java.lang.Class<?> wildcardClass4 = contaCorrente2.getClass();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 23.0f + "'", float3 == 23.0f);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(23.0f, 89.0f);
        contaCorrente2.setSaldo((float) (short) 10);
        float float5 = contaCorrente2.getSaldo();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10.0f + "'", float5 == 10.0f);
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        contaCorrente2.setLimite((float) 0L);
        float float6 = contaCorrente2.saque((float) 10L);
        float float7 = contaCorrente2.getLimite();
        float float8 = contaCorrente2.getLimite();
        float float9 = contaCorrente2.getLimite();
        contaCorrente2.setLimite((float) (byte) 100);
        float float12 = contaCorrente2.getLimite();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 90.0f + "'", float6 == 90.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 100.0f + "'", float12 == 100.0f);
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
        codigos.Words words0 = new codigos.Words();
        int int2 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int4 = words0.countWords("NAO FORMA TRIANGULO");
        int int6 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int8 = words0.countWords("NAO FORMA TRIANGULO");
        int int10 = words0.countWords("");
        int int12 = words0.countWords("hi!");
        int int14 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!");
        int int16 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!");
        int int18 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
        codigos.Words words0 = new codigos.Words();
        int int2 = words0.countWords("");
        int int4 = words0.countWords("NAO FORMA TRIANGULO");
        int int6 = words0.countWords("codigos.LadoInvalidoException: ");
        int int8 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        int int10 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        int int12 = words0.countWords("codigos.LadoInvalidoException: ESCALENO");
        java.lang.Class<?> wildcardClass13 = words0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(false, "NAO FORMA TRIANGULO", (float) '4');
        float float8 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: hi!", 0.0f);
        float float12 = pedido0.calculaTaxaDesconto(false, "ESCALENO", 0.0f);
        float float16 = pedido0.calculaTaxaDesconto(false, "", (float) (-1L));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        float float3 = contaCorrente2.getLimite();
        float float4 = contaCorrente2.getSaldo();
        float float5 = contaCorrente2.getLimite();
        float float6 = contaCorrente2.getSaldo();
        contaCorrente2.setLimite((float) (byte) 10);
        contaCorrente2.setSaldo((float) 100L);
        contaCorrente2.setLimite((float) (byte) 10);
        float float14 = contaCorrente2.saque((float) (byte) 100);
        contaCorrente2.setSaldo((float) (-1));
        contaCorrente2.setLimite((float) '#');
        contaCorrente2.setSaldo(23.0f);
        java.lang.Class<?> wildcardClass21 = contaCorrente2.getClass();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 3, (float) (-1L));
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
        codigos.Words words0 = new codigos.Words();
        int int2 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int4 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int6 = words0.countWords("codigos.LadoInvalidoException: ");
        int int8 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        int int10 = words0.countWords("EQUILATERO");
        int int12 = words0.countWords("ESCALENO");
        int int14 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
        codigos.LadoInvalidoException ladoInvalidoException1 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException3 = new codigos.LadoInvalidoException("");
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException3);
        codigos.LadoInvalidoException ladoInvalidoException6 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException8 = new codigos.LadoInvalidoException("");
        ladoInvalidoException6.addSuppressed((java.lang.Throwable) ladoInvalidoException8);
        codigos.LadoInvalidoException ladoInvalidoException11 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException13 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException15 = new codigos.LadoInvalidoException("");
        ladoInvalidoException13.addSuppressed((java.lang.Throwable) ladoInvalidoException15);
        ladoInvalidoException11.addSuppressed((java.lang.Throwable) ladoInvalidoException15);
        java.lang.Throwable[] throwableArray18 = ladoInvalidoException15.getSuppressed();
        ladoInvalidoException8.addSuppressed((java.lang.Throwable) ladoInvalidoException15);
        java.lang.Throwable[] throwableArray20 = ladoInvalidoException15.getSuppressed();
        ladoInvalidoException3.addSuppressed((java.lang.Throwable) ladoInvalidoException15);
        java.lang.Throwable[] throwableArray22 = ladoInvalidoException15.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException24 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException26 = new codigos.LadoInvalidoException("");
        ladoInvalidoException24.addSuppressed((java.lang.Throwable) ladoInvalidoException26);
        codigos.LadoInvalidoException ladoInvalidoException29 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException31 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException33 = new codigos.LadoInvalidoException("");
        ladoInvalidoException31.addSuppressed((java.lang.Throwable) ladoInvalidoException33);
        ladoInvalidoException29.addSuppressed((java.lang.Throwable) ladoInvalidoException33);
        java.lang.Throwable[] throwableArray36 = ladoInvalidoException33.getSuppressed();
        ladoInvalidoException26.addSuppressed((java.lang.Throwable) ladoInvalidoException33);
        java.lang.Throwable[] throwableArray38 = ladoInvalidoException33.getSuppressed();
        ladoInvalidoException15.addSuppressed((java.lang.Throwable) ladoInvalidoException33);
        codigos.LadoInvalidoException ladoInvalidoException41 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException43 = new codigos.LadoInvalidoException("");
        ladoInvalidoException41.addSuppressed((java.lang.Throwable) ladoInvalidoException43);
        codigos.LadoInvalidoException ladoInvalidoException46 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException48 = new codigos.LadoInvalidoException("");
        ladoInvalidoException46.addSuppressed((java.lang.Throwable) ladoInvalidoException48);
        codigos.LadoInvalidoException ladoInvalidoException51 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException53 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException55 = new codigos.LadoInvalidoException("");
        ladoInvalidoException53.addSuppressed((java.lang.Throwable) ladoInvalidoException55);
        ladoInvalidoException51.addSuppressed((java.lang.Throwable) ladoInvalidoException55);
        java.lang.Throwable[] throwableArray58 = ladoInvalidoException55.getSuppressed();
        ladoInvalidoException48.addSuppressed((java.lang.Throwable) ladoInvalidoException55);
        java.lang.Throwable[] throwableArray60 = ladoInvalidoException55.getSuppressed();
        ladoInvalidoException43.addSuppressed((java.lang.Throwable) ladoInvalidoException55);
        ladoInvalidoException15.addSuppressed((java.lang.Throwable) ladoInvalidoException55);
        java.lang.Throwable[] throwableArray63 = ladoInvalidoException55.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException65 = new codigos.LadoInvalidoException("ESCALENO");
        java.lang.Throwable[] throwableArray66 = ladoInvalidoException65.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException68 = new codigos.LadoInvalidoException("");
        ladoInvalidoException65.addSuppressed((java.lang.Throwable) ladoInvalidoException68);
        ladoInvalidoException55.addSuppressed((java.lang.Throwable) ladoInvalidoException68);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertNotNull(throwableArray58);
        org.junit.Assert.assertNotNull(throwableArray60);
        org.junit.Assert.assertNotNull(throwableArray63);
        org.junit.Assert.assertNotNull(throwableArray66);
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
        java.lang.String str3 = codigos.Triangulo.classificaTriangulo((int) (byte) 10, 2, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "NAO FORMA TRIANGULO" + "'", str3, "NAO FORMA TRIANGULO");
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((-1.0f), (float) 100);
        java.lang.Class<?> wildcardClass3 = contaCorrente2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
        codigos.LadoInvalidoException ladoInvalidoException1 = new codigos.LadoInvalidoException("ESCALENO");
        codigos.LadoInvalidoException ladoInvalidoException3 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException5 = new codigos.LadoInvalidoException("");
        ladoInvalidoException3.addSuppressed((java.lang.Throwable) ladoInvalidoException5);
        codigos.LadoInvalidoException ladoInvalidoException8 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException10 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException12 = new codigos.LadoInvalidoException("");
        ladoInvalidoException10.addSuppressed((java.lang.Throwable) ladoInvalidoException12);
        ladoInvalidoException8.addSuppressed((java.lang.Throwable) ladoInvalidoException12);
        java.lang.Throwable[] throwableArray15 = ladoInvalidoException12.getSuppressed();
        ladoInvalidoException5.addSuppressed((java.lang.Throwable) ladoInvalidoException12);
        codigos.LadoInvalidoException ladoInvalidoException18 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException20 = new codigos.LadoInvalidoException("");
        ladoInvalidoException18.addSuppressed((java.lang.Throwable) ladoInvalidoException20);
        codigos.LadoInvalidoException ladoInvalidoException23 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException25 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException27 = new codigos.LadoInvalidoException("");
        ladoInvalidoException25.addSuppressed((java.lang.Throwable) ladoInvalidoException27);
        ladoInvalidoException23.addSuppressed((java.lang.Throwable) ladoInvalidoException27);
        java.lang.Throwable[] throwableArray30 = ladoInvalidoException27.getSuppressed();
        ladoInvalidoException20.addSuppressed((java.lang.Throwable) ladoInvalidoException27);
        java.lang.Throwable[] throwableArray32 = ladoInvalidoException27.getSuppressed();
        ladoInvalidoException12.addSuppressed((java.lang.Throwable) ladoInvalidoException27);
        codigos.LadoInvalidoException ladoInvalidoException35 = new codigos.LadoInvalidoException("codigos.LadoInvalidoException: hi!");
        codigos.LadoInvalidoException ladoInvalidoException37 = new codigos.LadoInvalidoException("hi!");
        ladoInvalidoException35.addSuppressed((java.lang.Throwable) ladoInvalidoException37);
        codigos.LadoInvalidoException ladoInvalidoException40 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException42 = new codigos.LadoInvalidoException("");
        ladoInvalidoException40.addSuppressed((java.lang.Throwable) ladoInvalidoException42);
        codigos.LadoInvalidoException ladoInvalidoException45 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException47 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException49 = new codigos.LadoInvalidoException("");
        ladoInvalidoException47.addSuppressed((java.lang.Throwable) ladoInvalidoException49);
        ladoInvalidoException45.addSuppressed((java.lang.Throwable) ladoInvalidoException49);
        java.lang.Throwable[] throwableArray52 = ladoInvalidoException49.getSuppressed();
        ladoInvalidoException42.addSuppressed((java.lang.Throwable) ladoInvalidoException49);
        codigos.LadoInvalidoException ladoInvalidoException55 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException57 = new codigos.LadoInvalidoException("");
        ladoInvalidoException55.addSuppressed((java.lang.Throwable) ladoInvalidoException57);
        codigos.LadoInvalidoException ladoInvalidoException60 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException62 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException64 = new codigos.LadoInvalidoException("");
        ladoInvalidoException62.addSuppressed((java.lang.Throwable) ladoInvalidoException64);
        ladoInvalidoException60.addSuppressed((java.lang.Throwable) ladoInvalidoException64);
        java.lang.Throwable[] throwableArray67 = ladoInvalidoException64.getSuppressed();
        ladoInvalidoException57.addSuppressed((java.lang.Throwable) ladoInvalidoException64);
        java.lang.Throwable[] throwableArray69 = ladoInvalidoException64.getSuppressed();
        ladoInvalidoException49.addSuppressed((java.lang.Throwable) ladoInvalidoException64);
        codigos.LadoInvalidoException ladoInvalidoException72 = new codigos.LadoInvalidoException("codigos.LadoInvalidoException: hi!");
        ladoInvalidoException64.addSuppressed((java.lang.Throwable) ladoInvalidoException72);
        ladoInvalidoException37.addSuppressed((java.lang.Throwable) ladoInvalidoException72);
        java.lang.Throwable[] throwableArray75 = ladoInvalidoException72.getSuppressed();
        ladoInvalidoException27.addSuppressed((java.lang.Throwable) ladoInvalidoException72);
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException27);
        java.lang.Throwable[] throwableArray78 = ladoInvalidoException27.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException80 = new codigos.LadoInvalidoException("hi!");
        java.lang.Throwable[] throwableArray81 = ladoInvalidoException80.getSuppressed();
        ladoInvalidoException27.addSuppressed((java.lang.Throwable) ladoInvalidoException80);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNotNull(throwableArray52);
        org.junit.Assert.assertNotNull(throwableArray67);
        org.junit.Assert.assertNotNull(throwableArray69);
        org.junit.Assert.assertNotNull(throwableArray75);
        org.junit.Assert.assertNotNull(throwableArray78);
        org.junit.Assert.assertNotNull(throwableArray81);
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 100, 87.0f);
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
        codigos.Words words0 = new codigos.Words();
        int int2 = words0.countWords("");
        int int4 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!");
        int int6 = words0.countWords("");
        int int8 = words0.countWords("codigos.LadoInvalidoException: ");
        int int10 = words0.countWords("NAO FORMA TRIANGULO");
        int int12 = words0.countWords("NAO FORMA TRIANGULO");
        int int14 = words0.countWords("");
        int int16 = words0.countWords("codigos.LadoInvalidoException: ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
        java.lang.String str3 = codigos.Triangulo.classificaTriangulo((int) 'a', 4, 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ESCALENO" + "'", str3, "ESCALENO");
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 100, (float) (short) 100);
        contaCorrente2.setSaldo(96.0f);
        float float6 = contaCorrente2.saque(30.0f);
        float float8 = contaCorrente2.saque((float) (byte) 10);
        float float9 = contaCorrente2.getLimite();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 66.0f + "'", float6 == 66.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 56.0f + "'", float8 == 56.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 100.0f + "'", float9 == 100.0f);
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(90.0f, (float) 1L);
        contaCorrente2.setSaldo((float) (short) -1);
        float float5 = contaCorrente2.getLimite();
        contaCorrente2.setSaldo(100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", 1.0f);
        float float8 = pedido0.calculaTaxaDesconto(false, "", (float) 1);
        float float12 = pedido0.calculaTaxaDesconto(false, "hi!", (float) (short) 100);
        float float16 = pedido0.calculaTaxaDesconto(true, "", (float) ' ');
        float float20 = pedido0.calculaTaxaDesconto(false, "", (float) 0L);
        java.lang.Class<?> wildcardClass21 = pedido0.getClass();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        float float3 = contaCorrente2.getSaldo();
        contaCorrente2.setSaldo(100.0f);
        contaCorrente2.setLimite(10.0f);
        float float9 = contaCorrente2.saque((float) 1L);
        contaCorrente2.setLimite((float) (short) 100);
        float float12 = contaCorrente2.getLimite();
        java.lang.Class<?> wildcardClass13 = contaCorrente2.getClass();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 99.0f + "'", float9 == 99.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 100.0f + "'", float12 == 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((-31.0f), (float) (short) 1);
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", 1.0f);
        float float8 = pedido0.calculaTaxaDesconto(false, "", (float) 1);
        float float12 = pedido0.calculaTaxaDesconto(false, "hi!", (float) (short) 100);
        float float16 = pedido0.calculaTaxaDesconto(true, "ESCALENO", (float) 2);
        float float20 = pedido0.calculaTaxaDesconto(false, "", (float) (byte) 100);
        float float24 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: ", 90.0f);
        float float28 = pedido0.calculaTaxaDesconto(false, "", 84.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 10.0f + "'", float24 == 10.0f);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 0.0f + "'", float28 == 0.0f);
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (short) 10, (float) ' ');
        contaCorrente2.setLimite((float) (byte) 0);
        float float5 = contaCorrente2.getLimite();
        float float6 = contaCorrente2.getLimite();
        float float7 = contaCorrente2.getSaldo();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = codigos.Triangulo.classificaTriangulo((-1), (int) (short) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type codigos.LadoInvalidoException; message: lado invalido");
        } catch (codigos.LadoInvalidoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 10, (float) '#');
        // The following exception was thrown during execution in test generation
        try {
            float float4 = contaCorrente2.saque((float) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Valor invalido");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (short) 1, (float) (byte) -1);
        float float3 = contaCorrente2.getSaldo();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1855");
        codigos.LadoInvalidoException ladoInvalidoException1 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException3 = new codigos.LadoInvalidoException("");
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException3);
        codigos.LadoInvalidoException ladoInvalidoException6 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException8 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException10 = new codigos.LadoInvalidoException("");
        ladoInvalidoException8.addSuppressed((java.lang.Throwable) ladoInvalidoException10);
        ladoInvalidoException6.addSuppressed((java.lang.Throwable) ladoInvalidoException10);
        java.lang.Throwable[] throwableArray13 = ladoInvalidoException10.getSuppressed();
        ladoInvalidoException3.addSuppressed((java.lang.Throwable) ladoInvalidoException10);
        codigos.LadoInvalidoException ladoInvalidoException16 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException18 = new codigos.LadoInvalidoException("");
        ladoInvalidoException16.addSuppressed((java.lang.Throwable) ladoInvalidoException18);
        codigos.LadoInvalidoException ladoInvalidoException21 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException23 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException25 = new codigos.LadoInvalidoException("");
        ladoInvalidoException23.addSuppressed((java.lang.Throwable) ladoInvalidoException25);
        ladoInvalidoException21.addSuppressed((java.lang.Throwable) ladoInvalidoException25);
        java.lang.Throwable[] throwableArray28 = ladoInvalidoException25.getSuppressed();
        ladoInvalidoException18.addSuppressed((java.lang.Throwable) ladoInvalidoException25);
        java.lang.Throwable[] throwableArray30 = ladoInvalidoException25.getSuppressed();
        ladoInvalidoException10.addSuppressed((java.lang.Throwable) ladoInvalidoException25);
        codigos.LadoInvalidoException ladoInvalidoException33 = new codigos.LadoInvalidoException("ESCALENO");
        ladoInvalidoException25.addSuppressed((java.lang.Throwable) ladoInvalidoException33);
        java.lang.Throwable[] throwableArray35 = ladoInvalidoException25.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException37 = new codigos.LadoInvalidoException("NAO FORMA TRIANGULO");
        ladoInvalidoException25.addSuppressed((java.lang.Throwable) ladoInvalidoException37);
        java.lang.Throwable[] throwableArray39 = ladoInvalidoException37.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException41 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException43 = new codigos.LadoInvalidoException("");
        ladoInvalidoException41.addSuppressed((java.lang.Throwable) ladoInvalidoException43);
        codigos.LadoInvalidoException ladoInvalidoException46 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException48 = new codigos.LadoInvalidoException("");
        ladoInvalidoException46.addSuppressed((java.lang.Throwable) ladoInvalidoException48);
        codigos.LadoInvalidoException ladoInvalidoException51 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException53 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException55 = new codigos.LadoInvalidoException("");
        ladoInvalidoException53.addSuppressed((java.lang.Throwable) ladoInvalidoException55);
        ladoInvalidoException51.addSuppressed((java.lang.Throwable) ladoInvalidoException55);
        java.lang.Throwable[] throwableArray58 = ladoInvalidoException55.getSuppressed();
        ladoInvalidoException48.addSuppressed((java.lang.Throwable) ladoInvalidoException55);
        ladoInvalidoException43.addSuppressed((java.lang.Throwable) ladoInvalidoException48);
        java.lang.Throwable[] throwableArray61 = ladoInvalidoException43.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException63 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException65 = new codigos.LadoInvalidoException("");
        ladoInvalidoException63.addSuppressed((java.lang.Throwable) ladoInvalidoException65);
        codigos.LadoInvalidoException ladoInvalidoException68 = new codigos.LadoInvalidoException("hi!");
        ladoInvalidoException65.addSuppressed((java.lang.Throwable) ladoInvalidoException68);
        ladoInvalidoException43.addSuppressed((java.lang.Throwable) ladoInvalidoException68);
        codigos.LadoInvalidoException ladoInvalidoException72 = new codigos.LadoInvalidoException("codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        ladoInvalidoException68.addSuppressed((java.lang.Throwable) ladoInvalidoException72);
        java.lang.Throwable[] throwableArray74 = ladoInvalidoException68.getSuppressed();
        java.lang.Throwable[] throwableArray75 = ladoInvalidoException68.getSuppressed();
        ladoInvalidoException37.addSuppressed((java.lang.Throwable) ladoInvalidoException68);
        java.lang.Throwable throwable77 = null;
        // The following exception was thrown during execution in test generation
        try {
            ladoInvalidoException68.addSuppressed(throwable77);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertNotNull(throwableArray58);
        org.junit.Assert.assertNotNull(throwableArray61);
        org.junit.Assert.assertNotNull(throwableArray74);
        org.junit.Assert.assertNotNull(throwableArray75);
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((-11.0f), (-32.0f));
        float float3 = contaCorrente2.getSaldo();
        contaCorrente2.setLimite(97.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-11.0f) + "'", float3 == (-11.0f));
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
        codigos.LadoInvalidoException ladoInvalidoException1 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException3 = new codigos.LadoInvalidoException("");
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException3);
        codigos.LadoInvalidoException ladoInvalidoException6 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException8 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException10 = new codigos.LadoInvalidoException("");
        ladoInvalidoException8.addSuppressed((java.lang.Throwable) ladoInvalidoException10);
        ladoInvalidoException6.addSuppressed((java.lang.Throwable) ladoInvalidoException10);
        java.lang.Throwable[] throwableArray13 = ladoInvalidoException10.getSuppressed();
        ladoInvalidoException3.addSuppressed((java.lang.Throwable) ladoInvalidoException10);
        java.lang.Throwable[] throwableArray15 = ladoInvalidoException3.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException17 = new codigos.LadoInvalidoException("ESCALENO");
        java.lang.Throwable[] throwableArray18 = ladoInvalidoException17.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException20 = new codigos.LadoInvalidoException("");
        ladoInvalidoException17.addSuppressed((java.lang.Throwable) ladoInvalidoException20);
        ladoInvalidoException3.addSuppressed((java.lang.Throwable) ladoInvalidoException20);
        java.lang.String str23 = ladoInvalidoException3.toString();
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "codigos.LadoInvalidoException: " + "'", str23, "codigos.LadoInvalidoException: ");
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 100L, (float) 10);
        float float3 = contaCorrente2.getSaldo();
        contaCorrente2.setLimite((-58.0f));
        contaCorrente2.setLimite(0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        float float3 = contaCorrente2.getSaldo();
        contaCorrente2.setSaldo(100.0f);
        contaCorrente2.setLimite(10.0f);
        contaCorrente2.setLimite(0.0f);
        contaCorrente2.setSaldo((float) '#');
        float float12 = contaCorrente2.getLimite();
        java.lang.Class<?> wildcardClass13 = contaCorrente2.getClass();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", 1.0f);
        float float8 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: hi!", (float) (short) 10);
        float float12 = pedido0.calculaTaxaDesconto(true, "NAO FORMA TRIANGULO", (float) 0L);
        float float16 = pedido0.calculaTaxaDesconto(true, "", 1.0f);
        float float20 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ", (float) (short) 100);
        float float24 = pedido0.calculaTaxaDesconto(false, "ISOSCELES", 97.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10.0f + "'", float12 == 10.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.0f + "'", float24 == 0.0f);
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1861");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(57.0f, 23.0f);
        contaCorrente2.setLimite((float) 5);
        float float6 = contaCorrente2.saque(1.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 56.0f + "'", float6 == 56.0f);
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1862");
        java.lang.String str3 = codigos.Triangulo.classificaTriangulo(1, 1, 5);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "NAO FORMA TRIANGULO" + "'", str3, "NAO FORMA TRIANGULO");
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1863");
        codigos.Words words0 = new codigos.Words();
        int int2 = words0.countWords("");
        int int4 = words0.countWords("");
        int int6 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int8 = words0.countWords("EQUILATERO");
        int int10 = words0.countWords("ESCALENO");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1864");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(45.0f, 1.0f);
        contaCorrente2.setLimite((-57.0f));
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1865");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 10, (float) 0L);
        float float3 = contaCorrente2.getLimite();
        contaCorrente2.setSaldo(99.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (-1), (float) (-1L));
        float float3 = contaCorrente2.getLimite();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1867");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = codigos.Triangulo.classificaTriangulo((int) (byte) -1, 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type codigos.LadoInvalidoException; message: lado invalido");
        } catch (codigos.LadoInvalidoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(97.0f, 99.0f);
        contaCorrente2.setSaldo((-58.0f));
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(52.0f, (float) 0L);
        contaCorrente2.setLimite((-56.0f));
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", 1.0f);
        float float8 = pedido0.calculaTaxaDesconto(false, "", (float) 1);
        float float12 = pedido0.calculaTaxaDesconto(false, "hi!", (float) (short) 100);
        float float16 = pedido0.calculaTaxaDesconto(true, "", (float) ' ');
        float float20 = pedido0.calculaTaxaDesconto(false, "", 66.0f);
        float float24 = pedido0.calculaTaxaDesconto(false, "", (float) (byte) -1);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.0f + "'", float24 == 0.0f);
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        float float3 = contaCorrente2.getLimite();
        float float4 = contaCorrente2.getSaldo();
        float float5 = contaCorrente2.getLimite();
        float float6 = contaCorrente2.getSaldo();
        contaCorrente2.setLimite((float) (byte) 10);
        contaCorrente2.setSaldo((float) 100L);
        contaCorrente2.setLimite((float) (byte) 10);
        float float14 = contaCorrente2.saque((float) (byte) 100);
        contaCorrente2.setSaldo(32.0f);
        float float17 = contaCorrente2.getLimite();
        // The following exception was thrown during execution in test generation
        try {
            float float19 = contaCorrente2.saque(99.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Saldo Insuficiente");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 10.0f + "'", float17 == 10.0f);
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 100L, (float) 10);
        float float3 = contaCorrente2.getSaldo();
        float float4 = contaCorrente2.getSaldo();
        float float6 = contaCorrente2.saque((float) ' ');
        // The following exception was thrown during execution in test generation
        try {
            float float8 = contaCorrente2.saque((float) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Valor invalido");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 68.0f + "'", float6 == 68.0f);
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(31.0f, 35.0f);
        float float3 = contaCorrente2.getLimite();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 35.0f + "'", float3 == 35.0f);
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1874");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 0L, 1.0f);
        float float3 = contaCorrente2.getSaldo();
        float float4 = contaCorrente2.getLimite();
        float float5 = contaCorrente2.getSaldo();
        contaCorrente2.setLimite(22.0f);
        contaCorrente2.setLimite(3.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) '#', 2.0f);
        contaCorrente2.setLimite(88.0f);
        float float5 = contaCorrente2.getSaldo();
        float float6 = contaCorrente2.getSaldo();
        float float7 = contaCorrente2.getLimite();
        float float8 = contaCorrente2.getLimite();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 35.0f + "'", float5 == 35.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 35.0f + "'", float6 == 35.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 88.0f + "'", float7 == 88.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 88.0f + "'", float8 == 88.0f);
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
        codigos.LadoInvalidoException ladoInvalidoException1 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException3 = new codigos.LadoInvalidoException("");
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException3);
        codigos.LadoInvalidoException ladoInvalidoException6 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException8 = new codigos.LadoInvalidoException("");
        ladoInvalidoException6.addSuppressed((java.lang.Throwable) ladoInvalidoException8);
        codigos.LadoInvalidoException ladoInvalidoException11 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException13 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException15 = new codigos.LadoInvalidoException("");
        ladoInvalidoException13.addSuppressed((java.lang.Throwable) ladoInvalidoException15);
        ladoInvalidoException11.addSuppressed((java.lang.Throwable) ladoInvalidoException15);
        java.lang.Throwable[] throwableArray18 = ladoInvalidoException15.getSuppressed();
        ladoInvalidoException8.addSuppressed((java.lang.Throwable) ladoInvalidoException15);
        java.lang.Throwable[] throwableArray20 = ladoInvalidoException15.getSuppressed();
        ladoInvalidoException3.addSuppressed((java.lang.Throwable) ladoInvalidoException15);
        java.lang.Throwable[] throwableArray22 = ladoInvalidoException15.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException24 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException26 = new codigos.LadoInvalidoException("");
        ladoInvalidoException24.addSuppressed((java.lang.Throwable) ladoInvalidoException26);
        codigos.LadoInvalidoException ladoInvalidoException29 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException31 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException33 = new codigos.LadoInvalidoException("");
        ladoInvalidoException31.addSuppressed((java.lang.Throwable) ladoInvalidoException33);
        ladoInvalidoException29.addSuppressed((java.lang.Throwable) ladoInvalidoException33);
        java.lang.Throwable[] throwableArray36 = ladoInvalidoException33.getSuppressed();
        ladoInvalidoException26.addSuppressed((java.lang.Throwable) ladoInvalidoException33);
        java.lang.Throwable[] throwableArray38 = ladoInvalidoException33.getSuppressed();
        ladoInvalidoException15.addSuppressed((java.lang.Throwable) ladoInvalidoException33);
        codigos.LadoInvalidoException ladoInvalidoException41 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException43 = new codigos.LadoInvalidoException("");
        ladoInvalidoException41.addSuppressed((java.lang.Throwable) ladoInvalidoException43);
        codigos.LadoInvalidoException ladoInvalidoException46 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException48 = new codigos.LadoInvalidoException("");
        ladoInvalidoException46.addSuppressed((java.lang.Throwable) ladoInvalidoException48);
        codigos.LadoInvalidoException ladoInvalidoException51 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException53 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException55 = new codigos.LadoInvalidoException("");
        ladoInvalidoException53.addSuppressed((java.lang.Throwable) ladoInvalidoException55);
        ladoInvalidoException51.addSuppressed((java.lang.Throwable) ladoInvalidoException55);
        java.lang.Throwable[] throwableArray58 = ladoInvalidoException55.getSuppressed();
        ladoInvalidoException48.addSuppressed((java.lang.Throwable) ladoInvalidoException55);
        java.lang.Throwable[] throwableArray60 = ladoInvalidoException55.getSuppressed();
        ladoInvalidoException43.addSuppressed((java.lang.Throwable) ladoInvalidoException55);
        ladoInvalidoException15.addSuppressed((java.lang.Throwable) ladoInvalidoException55);
        java.lang.Throwable[] throwableArray63 = ladoInvalidoException15.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertNotNull(throwableArray58);
        org.junit.Assert.assertNotNull(throwableArray60);
        org.junit.Assert.assertNotNull(throwableArray63);
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(67.0f, (float) 100);
        float float3 = contaCorrente2.getSaldo();
        contaCorrente2.setSaldo(2.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 67.0f + "'", float3 == 67.0f);
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        float float3 = contaCorrente2.getLimite();
        float float4 = contaCorrente2.getSaldo();
        float float5 = contaCorrente2.getLimite();
        float float6 = contaCorrente2.getSaldo();
        contaCorrente2.setLimite((float) (byte) 10);
        contaCorrente2.setSaldo((float) 100L);
        contaCorrente2.setLimite((float) (byte) 10);
        float float14 = contaCorrente2.saque((float) (byte) 100);
        contaCorrente2.setSaldo(32.0f);
        float float18 = contaCorrente2.saque(2.0f);
        float float19 = contaCorrente2.getSaldo();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 30.0f + "'", float18 == 30.0f);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 30.0f + "'", float19 == 30.0f);
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 10, (float) '#');
        contaCorrente2.setSaldo(47.0f);
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1880");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 0L, 32.0f);
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1881");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", 1.0f);
        float float8 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: hi!", (float) (short) 10);
        float float12 = pedido0.calculaTaxaDesconto(true, "NAO FORMA TRIANGULO", (float) 0L);
        float float16 = pedido0.calculaTaxaDesconto(true, "ISOSCELES", (float) 3);
        java.lang.Class<?> wildcardClass17 = pedido0.getClass();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10.0f + "'", float12 == 10.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(32.0f, (float) (byte) 0);
        contaCorrente2.setSaldo(10.0f);
        contaCorrente2.setLimite(9.0f);
        float float7 = contaCorrente2.getSaldo();
        contaCorrente2.setLimite(10.0f);
        float float10 = contaCorrente2.getLimite();
        float float11 = contaCorrente2.getLimite();
        contaCorrente2.setSaldo(66.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1883");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        float float3 = contaCorrente2.getLimite();
        float float4 = contaCorrente2.getSaldo();
        float float5 = contaCorrente2.getLimite();
        float float6 = contaCorrente2.getSaldo();
        contaCorrente2.setLimite((float) (byte) 10);
        contaCorrente2.setSaldo((float) 100L);
        contaCorrente2.setLimite((float) (-1L));
        contaCorrente2.setLimite(47.0f);
        float float16 = contaCorrente2.saque((float) (byte) 100);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((-14.0f), 47.0f);
        // The following exception was thrown during execution in test generation
        try {
            float float4 = contaCorrente2.saque((float) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Valor invalido");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1885");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 100, 80.0f);
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (short) 0, 0.0f);
        contaCorrente2.setSaldo((float) 0L);
        contaCorrente2.setSaldo((float) (short) 1);
        contaCorrente2.setLimite(32.0f);
        // The following exception was thrown during execution in test generation
        try {
            float float10 = contaCorrente2.saque((-45.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Valor invalido");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
        codigos.Words words0 = new codigos.Words();
        int int2 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int4 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!");
        java.lang.Class<?> wildcardClass5 = words0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1888");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = codigos.Triangulo.classificaTriangulo((int) (byte) 100, (-1), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type codigos.LadoInvalidoException; message: lado invalido");
        } catch (codigos.LadoInvalidoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        float float3 = contaCorrente2.getLimite();
        contaCorrente2.setSaldo((float) (short) 0);
        contaCorrente2.setLimite((float) 'a');
        float float8 = contaCorrente2.getLimite();
        float float9 = contaCorrente2.getLimite();
        float float10 = contaCorrente2.getSaldo();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 97.0f + "'", float8 == 97.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 97.0f + "'", float9 == 97.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1890");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        float float3 = contaCorrente2.getLimite();
        float float4 = contaCorrente2.getLimite();
        contaCorrente2.setSaldo(88.0f);
        float float7 = contaCorrente2.getSaldo();
        contaCorrente2.setLimite(52.0f);
        contaCorrente2.setSaldo(51.0f);
        contaCorrente2.setSaldo((float) (byte) 10);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.0f) + "'", float4 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 88.0f + "'", float7 == 88.0f);
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((-48.0f), (float) (byte) 1);
        contaCorrente2.setSaldo(34.0f);
        contaCorrente2.setSaldo(62.0f);
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = codigos.Triangulo.classificaTriangulo((int) 'a', 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type codigos.LadoInvalidoException; message: lado invalido");
        } catch (codigos.LadoInvalidoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1893");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", 1.0f);
        float float8 = pedido0.calculaTaxaDesconto(false, "", (float) 1);
        float float12 = pedido0.calculaTaxaDesconto(false, "hi!", (float) (short) 100);
        float float16 = pedido0.calculaTaxaDesconto(true, "ESCALENO", (float) 2);
        float float20 = pedido0.calculaTaxaDesconto(false, "", (float) (byte) 100);
        float float24 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!", 90.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.0f + "'", float24 == 0.0f);
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1894");
        codigos.LadoInvalidoException ladoInvalidoException1 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException3 = new codigos.LadoInvalidoException("");
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException3);
        codigos.LadoInvalidoException ladoInvalidoException6 = new codigos.LadoInvalidoException("hi!");
        ladoInvalidoException3.addSuppressed((java.lang.Throwable) ladoInvalidoException6);
        java.lang.Throwable[] throwableArray8 = ladoInvalidoException3.getSuppressed();
        java.lang.Throwable[] throwableArray9 = ladoInvalidoException3.getSuppressed();
        java.lang.Throwable[] throwableArray10 = ladoInvalidoException3.getSuppressed();
        java.lang.String str11 = ladoInvalidoException3.toString();
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "codigos.LadoInvalidoException: " + "'", str11, "codigos.LadoInvalidoException: ");
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1895");
        codigos.LadoInvalidoException ladoInvalidoException1 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException3 = new codigos.LadoInvalidoException("");
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException3);
        codigos.LadoInvalidoException ladoInvalidoException6 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException8 = new codigos.LadoInvalidoException("");
        ladoInvalidoException6.addSuppressed((java.lang.Throwable) ladoInvalidoException8);
        codigos.LadoInvalidoException ladoInvalidoException11 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException13 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException15 = new codigos.LadoInvalidoException("");
        ladoInvalidoException13.addSuppressed((java.lang.Throwable) ladoInvalidoException15);
        ladoInvalidoException11.addSuppressed((java.lang.Throwable) ladoInvalidoException15);
        java.lang.Throwable[] throwableArray18 = ladoInvalidoException15.getSuppressed();
        ladoInvalidoException8.addSuppressed((java.lang.Throwable) ladoInvalidoException15);
        java.lang.Throwable[] throwableArray20 = ladoInvalidoException15.getSuppressed();
        ladoInvalidoException3.addSuppressed((java.lang.Throwable) ladoInvalidoException15);
        java.lang.Throwable[] throwableArray22 = ladoInvalidoException15.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException24 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException26 = new codigos.LadoInvalidoException("");
        ladoInvalidoException24.addSuppressed((java.lang.Throwable) ladoInvalidoException26);
        codigos.LadoInvalidoException ladoInvalidoException29 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException31 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException33 = new codigos.LadoInvalidoException("");
        ladoInvalidoException31.addSuppressed((java.lang.Throwable) ladoInvalidoException33);
        ladoInvalidoException29.addSuppressed((java.lang.Throwable) ladoInvalidoException33);
        java.lang.Throwable[] throwableArray36 = ladoInvalidoException33.getSuppressed();
        ladoInvalidoException26.addSuppressed((java.lang.Throwable) ladoInvalidoException33);
        java.lang.Throwable[] throwableArray38 = ladoInvalidoException33.getSuppressed();
        ladoInvalidoException15.addSuppressed((java.lang.Throwable) ladoInvalidoException33);
        java.lang.Throwable[] throwableArray40 = ladoInvalidoException33.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException42 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException44 = new codigos.LadoInvalidoException("");
        ladoInvalidoException42.addSuppressed((java.lang.Throwable) ladoInvalidoException44);
        codigos.LadoInvalidoException ladoInvalidoException47 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException49 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException51 = new codigos.LadoInvalidoException("");
        ladoInvalidoException49.addSuppressed((java.lang.Throwable) ladoInvalidoException51);
        ladoInvalidoException47.addSuppressed((java.lang.Throwable) ladoInvalidoException51);
        java.lang.Throwable[] throwableArray54 = ladoInvalidoException51.getSuppressed();
        ladoInvalidoException44.addSuppressed((java.lang.Throwable) ladoInvalidoException51);
        codigos.LadoInvalidoException ladoInvalidoException57 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException59 = new codigos.LadoInvalidoException("");
        ladoInvalidoException57.addSuppressed((java.lang.Throwable) ladoInvalidoException59);
        codigos.LadoInvalidoException ladoInvalidoException62 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException64 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException66 = new codigos.LadoInvalidoException("");
        ladoInvalidoException64.addSuppressed((java.lang.Throwable) ladoInvalidoException66);
        ladoInvalidoException62.addSuppressed((java.lang.Throwable) ladoInvalidoException66);
        java.lang.Throwable[] throwableArray69 = ladoInvalidoException66.getSuppressed();
        ladoInvalidoException59.addSuppressed((java.lang.Throwable) ladoInvalidoException66);
        java.lang.Throwable[] throwableArray71 = ladoInvalidoException66.getSuppressed();
        ladoInvalidoException51.addSuppressed((java.lang.Throwable) ladoInvalidoException66);
        codigos.LadoInvalidoException ladoInvalidoException74 = new codigos.LadoInvalidoException("codigos.LadoInvalidoException: hi!");
        ladoInvalidoException66.addSuppressed((java.lang.Throwable) ladoInvalidoException74);
        java.lang.Throwable[] throwableArray76 = ladoInvalidoException66.getSuppressed();
        ladoInvalidoException33.addSuppressed((java.lang.Throwable) ladoInvalidoException66);
        java.lang.Throwable[] throwableArray78 = ladoInvalidoException33.getSuppressed();
        java.lang.Throwable[] throwableArray79 = ladoInvalidoException33.getSuppressed();
        java.lang.Class<?> wildcardClass80 = ladoInvalidoException33.getClass();
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertNotNull(throwableArray40);
        org.junit.Assert.assertNotNull(throwableArray54);
        org.junit.Assert.assertNotNull(throwableArray69);
        org.junit.Assert.assertNotNull(throwableArray71);
        org.junit.Assert.assertNotNull(throwableArray76);
        org.junit.Assert.assertNotNull(throwableArray78);
        org.junit.Assert.assertNotNull(throwableArray79);
        org.junit.Assert.assertNotNull(wildcardClass80);
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1896");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 100L, (-32.0f));
        contaCorrente2.setSaldo((float) (byte) 1);
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1897");
        codigos.Words words0 = new codigos.Words();
        int int2 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int4 = words0.countWords("NAO FORMA TRIANGULO");
        int int6 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int8 = words0.countWords("NAO FORMA TRIANGULO");
        int int10 = words0.countWords("codigos.LadoInvalidoException: ");
        int int12 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        int int14 = words0.countWords("codigos.LadoInvalidoException: ");
        int int16 = words0.countWords("");
        int int18 = words0.countWords("ISOSCELES");
        int int20 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 5 + "'", int20 == 5);
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1898");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = codigos.Triangulo.classificaTriangulo((int) (byte) -1, (int) (byte) -1, 1);
            org.junit.Assert.fail("Expected exception of type codigos.LadoInvalidoException; message: lado invalido");
        } catch (codigos.LadoInvalidoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1899");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", 1.0f);
        float float8 = pedido0.calculaTaxaDesconto(false, "NAO FORMA TRIANGULO", 10.0f);
        float float12 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: ", (float) (-1L));
        float float16 = pedido0.calculaTaxaDesconto(false, "NAO FORMA TRIANGULO", (-10.0f));
        float float20 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: ", (float) 100);
        float float24 = pedido0.calculaTaxaDesconto(true, "ISOSCELES", (float) 0);
        float float28 = pedido0.calculaTaxaDesconto(false, "hi!", (-11.0f));
        float float32 = pedido0.calculaTaxaDesconto(true, "hi!", (float) (-1));
        float float36 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ", 0.0f);
        float float40 = pedido0.calculaTaxaDesconto(false, "ESCALENO", (float) ' ');
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 10.0f + "'", float24 == 10.0f);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 0.0f + "'", float28 == 0.0f);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 10.0f + "'", float32 == 10.0f);
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 0.0f + "'", float36 == 0.0f);
        org.junit.Assert.assertTrue("'" + float40 + "' != '" + 0.0f + "'", float40 == 0.0f);
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1900");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(1.0f, (float) 0L);
        contaCorrente2.setSaldo((float) 'a');
        contaCorrente2.setLimite((float) 10L);
        float float7 = contaCorrente2.getLimite();
        contaCorrente2.setLimite(35.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1901");
        codigos.Words words0 = new codigos.Words();
        int int2 = words0.countWords("");
        int int4 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!");
        int int6 = words0.countWords("");
        int int8 = words0.countWords("codigos.LadoInvalidoException: ");
        int int10 = words0.countWords("NAO FORMA TRIANGULO");
        int int12 = words0.countWords("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1902");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        float float3 = contaCorrente2.getLimite();
        float float4 = contaCorrente2.getSaldo();
        float float5 = contaCorrente2.getLimite();
        contaCorrente2.setSaldo((-1.0f));
        float float8 = contaCorrente2.getSaldo();
        float float9 = contaCorrente2.getLimite();
        // The following exception was thrown during execution in test generation
        try {
            float float11 = contaCorrente2.saque(84.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Saldo Insuficiente");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-1.0f) + "'", float8 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1903");
        codigos.LadoInvalidoException ladoInvalidoException1 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException3 = new codigos.LadoInvalidoException("");
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException3);
        codigos.LadoInvalidoException ladoInvalidoException6 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException8 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException10 = new codigos.LadoInvalidoException("");
        ladoInvalidoException8.addSuppressed((java.lang.Throwable) ladoInvalidoException10);
        ladoInvalidoException6.addSuppressed((java.lang.Throwable) ladoInvalidoException10);
        java.lang.Throwable[] throwableArray13 = ladoInvalidoException10.getSuppressed();
        ladoInvalidoException3.addSuppressed((java.lang.Throwable) ladoInvalidoException10);
        java.lang.Throwable[] throwableArray15 = ladoInvalidoException3.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException17 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException19 = new codigos.LadoInvalidoException("");
        ladoInvalidoException17.addSuppressed((java.lang.Throwable) ladoInvalidoException19);
        codigos.LadoInvalidoException ladoInvalidoException22 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException24 = new codigos.LadoInvalidoException("");
        ladoInvalidoException22.addSuppressed((java.lang.Throwable) ladoInvalidoException24);
        codigos.LadoInvalidoException ladoInvalidoException27 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException29 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException31 = new codigos.LadoInvalidoException("");
        ladoInvalidoException29.addSuppressed((java.lang.Throwable) ladoInvalidoException31);
        ladoInvalidoException27.addSuppressed((java.lang.Throwable) ladoInvalidoException31);
        java.lang.Throwable[] throwableArray34 = ladoInvalidoException31.getSuppressed();
        ladoInvalidoException24.addSuppressed((java.lang.Throwable) ladoInvalidoException31);
        java.lang.Throwable[] throwableArray36 = ladoInvalidoException31.getSuppressed();
        ladoInvalidoException19.addSuppressed((java.lang.Throwable) ladoInvalidoException31);
        ladoInvalidoException3.addSuppressed((java.lang.Throwable) ladoInvalidoException31);
        java.lang.String str39 = ladoInvalidoException31.toString();
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray34);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "codigos.LadoInvalidoException: " + "'", str39, "codigos.LadoInvalidoException: ");
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1904");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((-10.0f), 87.0f);
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1905");
        codigos.Words words0 = new codigos.Words();
        int int2 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int4 = words0.countWords("NAO FORMA TRIANGULO");
        int int6 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int8 = words0.countWords("NAO FORMA TRIANGULO");
        int int10 = words0.countWords("");
        int int12 = words0.countWords("hi!");
        int int14 = words0.countWords("codigos.LadoInvalidoException: ");
        int int16 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        int int18 = words0.countWords("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1906");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((-29.0f), (-1.0f));
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1907");
        codigos.Words words0 = new codigos.Words();
        int int2 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int4 = words0.countWords("NAO FORMA TRIANGULO");
        int int6 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int8 = words0.countWords("NAO FORMA TRIANGULO");
        int int10 = words0.countWords("");
        int int12 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        int int14 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        int int16 = words0.countWords("");
        int int18 = words0.countWords("codigos.LadoInvalidoException: hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1908");
        codigos.LadoInvalidoException ladoInvalidoException1 = new codigos.LadoInvalidoException("codigos.LadoInvalidoException: ESCALENO");
        codigos.LadoInvalidoException ladoInvalidoException3 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException5 = new codigos.LadoInvalidoException("");
        ladoInvalidoException3.addSuppressed((java.lang.Throwable) ladoInvalidoException5);
        codigos.LadoInvalidoException ladoInvalidoException8 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException10 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException12 = new codigos.LadoInvalidoException("");
        ladoInvalidoException10.addSuppressed((java.lang.Throwable) ladoInvalidoException12);
        ladoInvalidoException8.addSuppressed((java.lang.Throwable) ladoInvalidoException12);
        java.lang.Throwable[] throwableArray15 = ladoInvalidoException12.getSuppressed();
        ladoInvalidoException5.addSuppressed((java.lang.Throwable) ladoInvalidoException12);
        codigos.LadoInvalidoException ladoInvalidoException18 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException20 = new codigos.LadoInvalidoException("");
        ladoInvalidoException18.addSuppressed((java.lang.Throwable) ladoInvalidoException20);
        codigos.LadoInvalidoException ladoInvalidoException23 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException25 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException27 = new codigos.LadoInvalidoException("");
        ladoInvalidoException25.addSuppressed((java.lang.Throwable) ladoInvalidoException27);
        ladoInvalidoException23.addSuppressed((java.lang.Throwable) ladoInvalidoException27);
        java.lang.Throwable[] throwableArray30 = ladoInvalidoException27.getSuppressed();
        ladoInvalidoException20.addSuppressed((java.lang.Throwable) ladoInvalidoException27);
        java.lang.Throwable[] throwableArray32 = ladoInvalidoException27.getSuppressed();
        ladoInvalidoException12.addSuppressed((java.lang.Throwable) ladoInvalidoException27);
        codigos.LadoInvalidoException ladoInvalidoException35 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException37 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException39 = new codigos.LadoInvalidoException("");
        ladoInvalidoException37.addSuppressed((java.lang.Throwable) ladoInvalidoException39);
        ladoInvalidoException35.addSuppressed((java.lang.Throwable) ladoInvalidoException39);
        java.lang.Throwable[] throwableArray42 = ladoInvalidoException35.getSuppressed();
        ladoInvalidoException12.addSuppressed((java.lang.Throwable) ladoInvalidoException35);
        java.lang.Throwable[] throwableArray44 = ladoInvalidoException12.getSuppressed();
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException12);
        codigos.LadoInvalidoException ladoInvalidoException47 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException49 = new codigos.LadoInvalidoException("");
        ladoInvalidoException47.addSuppressed((java.lang.Throwable) ladoInvalidoException49);
        codigos.LadoInvalidoException ladoInvalidoException52 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException54 = new codigos.LadoInvalidoException("");
        ladoInvalidoException52.addSuppressed((java.lang.Throwable) ladoInvalidoException54);
        codigos.LadoInvalidoException ladoInvalidoException57 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException59 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException61 = new codigos.LadoInvalidoException("");
        ladoInvalidoException59.addSuppressed((java.lang.Throwable) ladoInvalidoException61);
        ladoInvalidoException57.addSuppressed((java.lang.Throwable) ladoInvalidoException61);
        java.lang.Throwable[] throwableArray64 = ladoInvalidoException61.getSuppressed();
        ladoInvalidoException54.addSuppressed((java.lang.Throwable) ladoInvalidoException61);
        java.lang.Throwable[] throwableArray66 = ladoInvalidoException61.getSuppressed();
        ladoInvalidoException49.addSuppressed((java.lang.Throwable) ladoInvalidoException61);
        java.lang.Throwable[] throwableArray68 = ladoInvalidoException61.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException70 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException72 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException74 = new codigos.LadoInvalidoException("");
        ladoInvalidoException72.addSuppressed((java.lang.Throwable) ladoInvalidoException74);
        ladoInvalidoException70.addSuppressed((java.lang.Throwable) ladoInvalidoException74);
        java.lang.Throwable[] throwableArray77 = ladoInvalidoException74.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException79 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException81 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException83 = new codigos.LadoInvalidoException("");
        ladoInvalidoException81.addSuppressed((java.lang.Throwable) ladoInvalidoException83);
        ladoInvalidoException79.addSuppressed((java.lang.Throwable) ladoInvalidoException83);
        java.lang.Throwable[] throwableArray86 = ladoInvalidoException79.getSuppressed();
        ladoInvalidoException74.addSuppressed((java.lang.Throwable) ladoInvalidoException79);
        ladoInvalidoException61.addSuppressed((java.lang.Throwable) ladoInvalidoException74);
        java.lang.Throwable[] throwableArray89 = ladoInvalidoException61.getSuppressed();
        java.lang.Throwable[] throwableArray90 = ladoInvalidoException61.getSuppressed();
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException61);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertNotNull(throwableArray64);
        org.junit.Assert.assertNotNull(throwableArray66);
        org.junit.Assert.assertNotNull(throwableArray68);
        org.junit.Assert.assertNotNull(throwableArray77);
        org.junit.Assert.assertNotNull(throwableArray86);
        org.junit.Assert.assertNotNull(throwableArray89);
        org.junit.Assert.assertNotNull(throwableArray90);
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1909");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", 1.0f);
        float float8 = pedido0.calculaTaxaDesconto(true, "", 0.0f);
        float float12 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ", 0.0f);
        java.lang.Class<?> wildcardClass13 = pedido0.getClass();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10.0f + "'", float12 == 10.0f);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1910");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 100L, (float) 10);
        float float3 = contaCorrente2.getSaldo();
        float float4 = contaCorrente2.getLimite();
        float float6 = contaCorrente2.saque((float) 1L);
        contaCorrente2.setLimite((float) 1);
        float float10 = contaCorrente2.saque(52.0f);
        float float12 = contaCorrente2.saque(2.0f);
        contaCorrente2.setSaldo((float) (byte) 10);
        float float16 = contaCorrente2.saque(8.0f);
        float float17 = contaCorrente2.getLimite();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 99.0f + "'", float6 == 99.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 47.0f + "'", float10 == 47.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 45.0f + "'", float12 == 45.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 2.0f + "'", float16 == 2.0f);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 1.0f + "'", float17 == 1.0f);
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1911");
        codigos.LadoInvalidoException ladoInvalidoException1 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException3 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException5 = new codigos.LadoInvalidoException("");
        ladoInvalidoException3.addSuppressed((java.lang.Throwable) ladoInvalidoException5);
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException5);
        java.lang.Throwable[] throwableArray8 = ladoInvalidoException1.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException10 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException12 = new codigos.LadoInvalidoException("");
        ladoInvalidoException10.addSuppressed((java.lang.Throwable) ladoInvalidoException12);
        codigos.LadoInvalidoException ladoInvalidoException15 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException17 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException19 = new codigos.LadoInvalidoException("");
        ladoInvalidoException17.addSuppressed((java.lang.Throwable) ladoInvalidoException19);
        ladoInvalidoException15.addSuppressed((java.lang.Throwable) ladoInvalidoException19);
        java.lang.Throwable[] throwableArray22 = ladoInvalidoException19.getSuppressed();
        ladoInvalidoException12.addSuppressed((java.lang.Throwable) ladoInvalidoException19);
        java.lang.Throwable[] throwableArray24 = ladoInvalidoException12.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException26 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException28 = new codigos.LadoInvalidoException("");
        ladoInvalidoException26.addSuppressed((java.lang.Throwable) ladoInvalidoException28);
        codigos.LadoInvalidoException ladoInvalidoException31 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException33 = new codigos.LadoInvalidoException("");
        ladoInvalidoException31.addSuppressed((java.lang.Throwable) ladoInvalidoException33);
        codigos.LadoInvalidoException ladoInvalidoException36 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException38 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException40 = new codigos.LadoInvalidoException("");
        ladoInvalidoException38.addSuppressed((java.lang.Throwable) ladoInvalidoException40);
        ladoInvalidoException36.addSuppressed((java.lang.Throwable) ladoInvalidoException40);
        java.lang.Throwable[] throwableArray43 = ladoInvalidoException40.getSuppressed();
        ladoInvalidoException33.addSuppressed((java.lang.Throwable) ladoInvalidoException40);
        java.lang.Throwable[] throwableArray45 = ladoInvalidoException40.getSuppressed();
        ladoInvalidoException28.addSuppressed((java.lang.Throwable) ladoInvalidoException40);
        java.lang.Throwable[] throwableArray47 = ladoInvalidoException40.getSuppressed();
        java.lang.Throwable[] throwableArray48 = ladoInvalidoException40.getSuppressed();
        ladoInvalidoException12.addSuppressed((java.lang.Throwable) ladoInvalidoException40);
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException40);
        java.lang.Throwable[] throwableArray51 = ladoInvalidoException40.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertNotNull(throwableArray45);
        org.junit.Assert.assertNotNull(throwableArray47);
        org.junit.Assert.assertNotNull(throwableArray48);
        org.junit.Assert.assertNotNull(throwableArray51);
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1912");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", (float) (short) -1);
        float float8 = pedido0.calculaTaxaDesconto(true, "NAO FORMA TRIANGULO", (float) (byte) 0);
        float float12 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!", (float) (-1L));
        float float16 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: ", 99.0f);
        float float20 = pedido0.calculaTaxaDesconto(false, "NAO FORMA TRIANGULO", 97.0f);
        float float24 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: ", 31.0f);
        float float28 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!", 5.0f);
        java.lang.Class<?> wildcardClass29 = pedido0.getClass();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10.0f + "'", float12 == 10.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.0f + "'", float24 == 0.0f);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 0.0f + "'", float28 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1913");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 5, (float) 'a');
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1914");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 100L, (float) 10);
        float float3 = contaCorrente2.getSaldo();
        float float4 = contaCorrente2.getLimite();
        float float5 = contaCorrente2.getLimite();
        // The following exception was thrown during execution in test generation
        try {
            float float7 = contaCorrente2.saque((float) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Valor invalido");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10.0f + "'", float5 == 10.0f);
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1915");
        java.lang.String str3 = codigos.Triangulo.classificaTriangulo(10, (int) '#', 3);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "NAO FORMA TRIANGULO" + "'", str3, "NAO FORMA TRIANGULO");
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1916");
        codigos.Words words0 = new codigos.Words();
        int int2 = words0.countWords("");
        int int4 = words0.countWords("");
        int int6 = words0.countWords("codigos.LadoInvalidoException: ");
        int int8 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!");
        int int10 = words0.countWords("NAO FORMA TRIANGULO");
        int int12 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1917");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((-88.0f), (float) 'a');
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1918");
        java.lang.String str3 = codigos.Triangulo.classificaTriangulo(10, 2, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ISOSCELES" + "'", str3, "ISOSCELES");
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1919");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 100L, (float) 10);
        float float3 = contaCorrente2.getSaldo();
        float float4 = contaCorrente2.getLimite();
        float float6 = contaCorrente2.saque((float) 1L);
        float float7 = contaCorrente2.getSaldo();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 99.0f + "'", float6 == 99.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 99.0f + "'", float7 == 99.0f);
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1920");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 1, 32.0f);
        float float3 = contaCorrente2.getLimite();
        float float5 = contaCorrente2.saque((float) (byte) 10);
        float float6 = contaCorrente2.getLimite();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 32.0f + "'", float3 == 32.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-9.0f) + "'", float5 == (-9.0f));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 32.0f + "'", float6 == 32.0f);
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1921");
        codigos.LadoInvalidoException ladoInvalidoException1 = new codigos.LadoInvalidoException("codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        java.lang.Throwable[] throwableArray2 = ladoInvalidoException1.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException4 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException6 = new codigos.LadoInvalidoException("");
        ladoInvalidoException4.addSuppressed((java.lang.Throwable) ladoInvalidoException6);
        codigos.LadoInvalidoException ladoInvalidoException9 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException11 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException13 = new codigos.LadoInvalidoException("");
        ladoInvalidoException11.addSuppressed((java.lang.Throwable) ladoInvalidoException13);
        ladoInvalidoException9.addSuppressed((java.lang.Throwable) ladoInvalidoException13);
        java.lang.Throwable[] throwableArray16 = ladoInvalidoException13.getSuppressed();
        ladoInvalidoException6.addSuppressed((java.lang.Throwable) ladoInvalidoException13);
        codigos.LadoInvalidoException ladoInvalidoException19 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException21 = new codigos.LadoInvalidoException("");
        ladoInvalidoException19.addSuppressed((java.lang.Throwable) ladoInvalidoException21);
        codigos.LadoInvalidoException ladoInvalidoException24 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException26 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException28 = new codigos.LadoInvalidoException("");
        ladoInvalidoException26.addSuppressed((java.lang.Throwable) ladoInvalidoException28);
        ladoInvalidoException24.addSuppressed((java.lang.Throwable) ladoInvalidoException28);
        java.lang.Throwable[] throwableArray31 = ladoInvalidoException28.getSuppressed();
        ladoInvalidoException21.addSuppressed((java.lang.Throwable) ladoInvalidoException28);
        java.lang.Throwable[] throwableArray33 = ladoInvalidoException28.getSuppressed();
        ladoInvalidoException13.addSuppressed((java.lang.Throwable) ladoInvalidoException28);
        codigos.LadoInvalidoException ladoInvalidoException36 = new codigos.LadoInvalidoException("codigos.LadoInvalidoException: hi!");
        ladoInvalidoException28.addSuppressed((java.lang.Throwable) ladoInvalidoException36);
        java.lang.Throwable[] throwableArray38 = ladoInvalidoException36.getSuppressed();
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException36);
        codigos.LadoInvalidoException ladoInvalidoException41 = new codigos.LadoInvalidoException("codigos.LadoInvalidoException: hi!");
        codigos.LadoInvalidoException ladoInvalidoException43 = new codigos.LadoInvalidoException("hi!");
        ladoInvalidoException41.addSuppressed((java.lang.Throwable) ladoInvalidoException43);
        java.lang.Throwable[] throwableArray45 = ladoInvalidoException43.getSuppressed();
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException43);
        java.lang.Throwable[] throwableArray47 = ladoInvalidoException1.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException49 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException51 = new codigos.LadoInvalidoException("");
        ladoInvalidoException49.addSuppressed((java.lang.Throwable) ladoInvalidoException51);
        codigos.LadoInvalidoException ladoInvalidoException54 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException56 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException58 = new codigos.LadoInvalidoException("");
        ladoInvalidoException56.addSuppressed((java.lang.Throwable) ladoInvalidoException58);
        ladoInvalidoException54.addSuppressed((java.lang.Throwable) ladoInvalidoException58);
        java.lang.Throwable[] throwableArray61 = ladoInvalidoException58.getSuppressed();
        ladoInvalidoException51.addSuppressed((java.lang.Throwable) ladoInvalidoException58);
        java.lang.Throwable[] throwableArray63 = ladoInvalidoException58.getSuppressed();
        java.lang.Throwable[] throwableArray64 = ladoInvalidoException58.getSuppressed();
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException58);
        codigos.LadoInvalidoException ladoInvalidoException67 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException69 = new codigos.LadoInvalidoException("");
        ladoInvalidoException67.addSuppressed((java.lang.Throwable) ladoInvalidoException69);
        codigos.LadoInvalidoException ladoInvalidoException72 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException74 = new codigos.LadoInvalidoException("");
        ladoInvalidoException72.addSuppressed((java.lang.Throwable) ladoInvalidoException74);
        codigos.LadoInvalidoException ladoInvalidoException77 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException79 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException81 = new codigos.LadoInvalidoException("");
        ladoInvalidoException79.addSuppressed((java.lang.Throwable) ladoInvalidoException81);
        ladoInvalidoException77.addSuppressed((java.lang.Throwable) ladoInvalidoException81);
        java.lang.Throwable[] throwableArray84 = ladoInvalidoException81.getSuppressed();
        ladoInvalidoException74.addSuppressed((java.lang.Throwable) ladoInvalidoException81);
        ladoInvalidoException69.addSuppressed((java.lang.Throwable) ladoInvalidoException74);
        java.lang.Throwable[] throwableArray87 = ladoInvalidoException69.getSuppressed();
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException69);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertNotNull(throwableArray45);
        org.junit.Assert.assertNotNull(throwableArray47);
        org.junit.Assert.assertNotNull(throwableArray61);
        org.junit.Assert.assertNotNull(throwableArray63);
        org.junit.Assert.assertNotNull(throwableArray64);
        org.junit.Assert.assertNotNull(throwableArray84);
        org.junit.Assert.assertNotNull(throwableArray87);
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1922");
        codigos.LadoInvalidoException ladoInvalidoException1 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException3 = new codigos.LadoInvalidoException("");
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException3);
        codigos.LadoInvalidoException ladoInvalidoException6 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException8 = new codigos.LadoInvalidoException("");
        ladoInvalidoException6.addSuppressed((java.lang.Throwable) ladoInvalidoException8);
        codigos.LadoInvalidoException ladoInvalidoException11 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException13 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException15 = new codigos.LadoInvalidoException("");
        ladoInvalidoException13.addSuppressed((java.lang.Throwable) ladoInvalidoException15);
        ladoInvalidoException11.addSuppressed((java.lang.Throwable) ladoInvalidoException15);
        java.lang.Throwable[] throwableArray18 = ladoInvalidoException15.getSuppressed();
        ladoInvalidoException8.addSuppressed((java.lang.Throwable) ladoInvalidoException15);
        java.lang.Throwable[] throwableArray20 = ladoInvalidoException15.getSuppressed();
        ladoInvalidoException3.addSuppressed((java.lang.Throwable) ladoInvalidoException15);
        java.lang.Throwable[] throwableArray22 = ladoInvalidoException15.getSuppressed();
        java.lang.Throwable[] throwableArray23 = ladoInvalidoException15.getSuppressed();
        java.lang.Throwable[] throwableArray24 = ladoInvalidoException15.getSuppressed();
        java.lang.Class<?> wildcardClass25 = ladoInvalidoException15.getClass();
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1923");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 0, (float) 10L);
        float float3 = contaCorrente2.getLimite();
        float float4 = contaCorrente2.getLimite();
        float float5 = contaCorrente2.getSaldo();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1924");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 10, 0.0f);
        float float3 = contaCorrente2.getSaldo();
        float float5 = contaCorrente2.saque(1.0f);
        contaCorrente2.setSaldo(100.0f);
        contaCorrente2.setLimite(2.0f);
        contaCorrente2.setSaldo((float) '#');
        float float12 = contaCorrente2.getLimite();
        float float13 = contaCorrente2.getLimite();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 9.0f + "'", float5 == 9.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 2.0f + "'", float12 == 2.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 2.0f + "'", float13 == 2.0f);
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1925");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(99.0f, (float) 'a');
        float float3 = contaCorrente2.getSaldo();
        float float4 = contaCorrente2.getSaldo();
        contaCorrente2.setLimite((float) (short) -1);
        contaCorrente2.setLimite(62.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 99.0f + "'", float3 == 99.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 99.0f + "'", float4 == 99.0f);
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1926");
        codigos.LadoInvalidoException ladoInvalidoException1 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException3 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException5 = new codigos.LadoInvalidoException("");
        ladoInvalidoException3.addSuppressed((java.lang.Throwable) ladoInvalidoException5);
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException5);
        java.lang.Throwable[] throwableArray8 = ladoInvalidoException1.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException10 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException12 = new codigos.LadoInvalidoException("");
        ladoInvalidoException10.addSuppressed((java.lang.Throwable) ladoInvalidoException12);
        codigos.LadoInvalidoException ladoInvalidoException15 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException17 = new codigos.LadoInvalidoException("");
        ladoInvalidoException15.addSuppressed((java.lang.Throwable) ladoInvalidoException17);
        codigos.LadoInvalidoException ladoInvalidoException20 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException22 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException24 = new codigos.LadoInvalidoException("");
        ladoInvalidoException22.addSuppressed((java.lang.Throwable) ladoInvalidoException24);
        ladoInvalidoException20.addSuppressed((java.lang.Throwable) ladoInvalidoException24);
        java.lang.Throwable[] throwableArray27 = ladoInvalidoException24.getSuppressed();
        ladoInvalidoException17.addSuppressed((java.lang.Throwable) ladoInvalidoException24);
        java.lang.Throwable[] throwableArray29 = ladoInvalidoException24.getSuppressed();
        ladoInvalidoException12.addSuppressed((java.lang.Throwable) ladoInvalidoException24);
        java.lang.Throwable[] throwableArray31 = ladoInvalidoException24.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException33 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException35 = new codigos.LadoInvalidoException("");
        ladoInvalidoException33.addSuppressed((java.lang.Throwable) ladoInvalidoException35);
        codigos.LadoInvalidoException ladoInvalidoException38 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException40 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException42 = new codigos.LadoInvalidoException("");
        ladoInvalidoException40.addSuppressed((java.lang.Throwable) ladoInvalidoException42);
        ladoInvalidoException38.addSuppressed((java.lang.Throwable) ladoInvalidoException42);
        java.lang.Throwable[] throwableArray45 = ladoInvalidoException42.getSuppressed();
        ladoInvalidoException35.addSuppressed((java.lang.Throwable) ladoInvalidoException42);
        codigos.LadoInvalidoException ladoInvalidoException48 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException50 = new codigos.LadoInvalidoException("");
        ladoInvalidoException48.addSuppressed((java.lang.Throwable) ladoInvalidoException50);
        codigos.LadoInvalidoException ladoInvalidoException53 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException55 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException57 = new codigos.LadoInvalidoException("");
        ladoInvalidoException55.addSuppressed((java.lang.Throwable) ladoInvalidoException57);
        ladoInvalidoException53.addSuppressed((java.lang.Throwable) ladoInvalidoException57);
        java.lang.Throwable[] throwableArray60 = ladoInvalidoException57.getSuppressed();
        ladoInvalidoException50.addSuppressed((java.lang.Throwable) ladoInvalidoException57);
        java.lang.Throwable[] throwableArray62 = ladoInvalidoException57.getSuppressed();
        ladoInvalidoException42.addSuppressed((java.lang.Throwable) ladoInvalidoException57);
        codigos.LadoInvalidoException ladoInvalidoException65 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException67 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException69 = new codigos.LadoInvalidoException("");
        ladoInvalidoException67.addSuppressed((java.lang.Throwable) ladoInvalidoException69);
        ladoInvalidoException65.addSuppressed((java.lang.Throwable) ladoInvalidoException69);
        java.lang.Throwable[] throwableArray72 = ladoInvalidoException65.getSuppressed();
        ladoInvalidoException42.addSuppressed((java.lang.Throwable) ladoInvalidoException65);
        codigos.LadoInvalidoException ladoInvalidoException75 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException77 = new codigos.LadoInvalidoException("");
        ladoInvalidoException75.addSuppressed((java.lang.Throwable) ladoInvalidoException77);
        codigos.LadoInvalidoException ladoInvalidoException80 = new codigos.LadoInvalidoException("hi!");
        ladoInvalidoException77.addSuppressed((java.lang.Throwable) ladoInvalidoException80);
        java.lang.Throwable[] throwableArray82 = ladoInvalidoException77.getSuppressed();
        ladoInvalidoException42.addSuppressed((java.lang.Throwable) ladoInvalidoException77);
        java.lang.Throwable[] throwableArray84 = ladoInvalidoException77.getSuppressed();
        ladoInvalidoException24.addSuppressed((java.lang.Throwable) ladoInvalidoException77);
        java.lang.Throwable[] throwableArray86 = ladoInvalidoException77.getSuppressed();
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException77);
        java.lang.String str88 = ladoInvalidoException1.toString();
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(throwableArray45);
        org.junit.Assert.assertNotNull(throwableArray60);
        org.junit.Assert.assertNotNull(throwableArray62);
        org.junit.Assert.assertNotNull(throwableArray72);
        org.junit.Assert.assertNotNull(throwableArray82);
        org.junit.Assert.assertNotNull(throwableArray84);
        org.junit.Assert.assertNotNull(throwableArray86);
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "codigos.LadoInvalidoException: " + "'", str88, "codigos.LadoInvalidoException: ");
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1927");
        codigos.Words words0 = new codigos.Words();
        int int2 = words0.countWords("codigos.LadoInvalidoException: ");
        int int4 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!");
        int int6 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!");
        int int8 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1928");
        codigos.LadoInvalidoException ladoInvalidoException1 = new codigos.LadoInvalidoException("codigos.LadoInvalidoException: hi!");
        codigos.LadoInvalidoException ladoInvalidoException3 = new codigos.LadoInvalidoException("hi!");
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException3);
        java.lang.Throwable[] throwableArray5 = ladoInvalidoException3.getSuppressed();
        java.lang.Throwable[] throwableArray6 = ladoInvalidoException3.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException8 = new codigos.LadoInvalidoException("");
        java.lang.Throwable[] throwableArray9 = ladoInvalidoException8.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException11 = new codigos.LadoInvalidoException("hi!");
        codigos.LadoInvalidoException ladoInvalidoException13 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException15 = new codigos.LadoInvalidoException("");
        ladoInvalidoException13.addSuppressed((java.lang.Throwable) ladoInvalidoException15);
        codigos.LadoInvalidoException ladoInvalidoException18 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException20 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException22 = new codigos.LadoInvalidoException("");
        ladoInvalidoException20.addSuppressed((java.lang.Throwable) ladoInvalidoException22);
        ladoInvalidoException18.addSuppressed((java.lang.Throwable) ladoInvalidoException22);
        java.lang.Throwable[] throwableArray25 = ladoInvalidoException22.getSuppressed();
        ladoInvalidoException15.addSuppressed((java.lang.Throwable) ladoInvalidoException22);
        ladoInvalidoException11.addSuppressed((java.lang.Throwable) ladoInvalidoException22);
        codigos.LadoInvalidoException ladoInvalidoException29 = new codigos.LadoInvalidoException("codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!");
        codigos.LadoInvalidoException ladoInvalidoException31 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException33 = new codigos.LadoInvalidoException("");
        ladoInvalidoException31.addSuppressed((java.lang.Throwable) ladoInvalidoException33);
        codigos.LadoInvalidoException ladoInvalidoException36 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException38 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException40 = new codigos.LadoInvalidoException("");
        ladoInvalidoException38.addSuppressed((java.lang.Throwable) ladoInvalidoException40);
        ladoInvalidoException36.addSuppressed((java.lang.Throwable) ladoInvalidoException40);
        java.lang.Throwable[] throwableArray43 = ladoInvalidoException40.getSuppressed();
        ladoInvalidoException33.addSuppressed((java.lang.Throwable) ladoInvalidoException40);
        java.lang.Throwable[] throwableArray45 = ladoInvalidoException40.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException47 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException49 = new codigos.LadoInvalidoException("");
        ladoInvalidoException47.addSuppressed((java.lang.Throwable) ladoInvalidoException49);
        codigos.LadoInvalidoException ladoInvalidoException52 = new codigos.LadoInvalidoException("hi!");
        ladoInvalidoException49.addSuppressed((java.lang.Throwable) ladoInvalidoException52);
        codigos.LadoInvalidoException ladoInvalidoException55 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException57 = new codigos.LadoInvalidoException("");
        ladoInvalidoException55.addSuppressed((java.lang.Throwable) ladoInvalidoException57);
        codigos.LadoInvalidoException ladoInvalidoException60 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException62 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException64 = new codigos.LadoInvalidoException("");
        ladoInvalidoException62.addSuppressed((java.lang.Throwable) ladoInvalidoException64);
        ladoInvalidoException60.addSuppressed((java.lang.Throwable) ladoInvalidoException64);
        java.lang.Throwable[] throwableArray67 = ladoInvalidoException64.getSuppressed();
        ladoInvalidoException57.addSuppressed((java.lang.Throwable) ladoInvalidoException64);
        codigos.LadoInvalidoException ladoInvalidoException70 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException72 = new codigos.LadoInvalidoException("");
        ladoInvalidoException70.addSuppressed((java.lang.Throwable) ladoInvalidoException72);
        codigos.LadoInvalidoException ladoInvalidoException75 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException77 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException79 = new codigos.LadoInvalidoException("");
        ladoInvalidoException77.addSuppressed((java.lang.Throwable) ladoInvalidoException79);
        ladoInvalidoException75.addSuppressed((java.lang.Throwable) ladoInvalidoException79);
        java.lang.Throwable[] throwableArray82 = ladoInvalidoException79.getSuppressed();
        ladoInvalidoException72.addSuppressed((java.lang.Throwable) ladoInvalidoException79);
        java.lang.Throwable[] throwableArray84 = ladoInvalidoException79.getSuppressed();
        ladoInvalidoException64.addSuppressed((java.lang.Throwable) ladoInvalidoException79);
        ladoInvalidoException49.addSuppressed((java.lang.Throwable) ladoInvalidoException64);
        ladoInvalidoException40.addSuppressed((java.lang.Throwable) ladoInvalidoException49);
        ladoInvalidoException29.addSuppressed((java.lang.Throwable) ladoInvalidoException40);
        ladoInvalidoException22.addSuppressed((java.lang.Throwable) ladoInvalidoException29);
        ladoInvalidoException8.addSuppressed((java.lang.Throwable) ladoInvalidoException22);
        java.lang.Throwable[] throwableArray91 = ladoInvalidoException8.getSuppressed();
        java.lang.Throwable[] throwableArray92 = ladoInvalidoException8.getSuppressed();
        ladoInvalidoException3.addSuppressed((java.lang.Throwable) ladoInvalidoException8);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertNotNull(throwableArray45);
        org.junit.Assert.assertNotNull(throwableArray67);
        org.junit.Assert.assertNotNull(throwableArray82);
        org.junit.Assert.assertNotNull(throwableArray84);
        org.junit.Assert.assertNotNull(throwableArray91);
        org.junit.Assert.assertNotNull(throwableArray92);
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1929");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = codigos.Triangulo.classificaTriangulo((int) (byte) 0, (int) '4', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type codigos.LadoInvalidoException; message: lado invalido");
        } catch (codigos.LadoInvalidoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1930");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 1, 32.0f);
        float float3 = contaCorrente2.getLimite();
        float float4 = contaCorrente2.getSaldo();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 32.0f + "'", float3 == 32.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1931");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 4, (float) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            float float4 = contaCorrente2.saque((-48.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Valor invalido");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1932");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) -1, 66.0f);
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1933");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        float float3 = contaCorrente2.getLimite();
        float float4 = contaCorrente2.getLimite();
        float float5 = contaCorrente2.getSaldo();
        contaCorrente2.setLimite(98.0f);
        float float9 = contaCorrente2.saque((float) (byte) 10);
        float float10 = contaCorrente2.getSaldo();
        float float12 = contaCorrente2.saque((float) (short) 10);
        contaCorrente2.setLimite(9.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.0f) + "'", float4 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 100.0f + "'", float5 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 90.0f + "'", float9 == 90.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 90.0f + "'", float10 == 90.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 80.0f + "'", float12 == 80.0f);
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1934");
        codigos.LadoInvalidoException ladoInvalidoException1 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException3 = new codigos.LadoInvalidoException("");
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException3);
        codigos.LadoInvalidoException ladoInvalidoException6 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException8 = new codigos.LadoInvalidoException("");
        ladoInvalidoException6.addSuppressed((java.lang.Throwable) ladoInvalidoException8);
        codigos.LadoInvalidoException ladoInvalidoException11 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException13 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException15 = new codigos.LadoInvalidoException("");
        ladoInvalidoException13.addSuppressed((java.lang.Throwable) ladoInvalidoException15);
        ladoInvalidoException11.addSuppressed((java.lang.Throwable) ladoInvalidoException15);
        java.lang.Throwable[] throwableArray18 = ladoInvalidoException15.getSuppressed();
        ladoInvalidoException8.addSuppressed((java.lang.Throwable) ladoInvalidoException15);
        java.lang.Throwable[] throwableArray20 = ladoInvalidoException15.getSuppressed();
        ladoInvalidoException3.addSuppressed((java.lang.Throwable) ladoInvalidoException15);
        java.lang.Throwable[] throwableArray22 = ladoInvalidoException3.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException24 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException26 = new codigos.LadoInvalidoException("");
        ladoInvalidoException24.addSuppressed((java.lang.Throwable) ladoInvalidoException26);
        codigos.LadoInvalidoException ladoInvalidoException29 = new codigos.LadoInvalidoException("hi!");
        ladoInvalidoException26.addSuppressed((java.lang.Throwable) ladoInvalidoException29);
        ladoInvalidoException3.addSuppressed((java.lang.Throwable) ladoInvalidoException26);
        java.lang.Throwable[] throwableArray32 = ladoInvalidoException26.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException34 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException36 = new codigos.LadoInvalidoException("");
        ladoInvalidoException34.addSuppressed((java.lang.Throwable) ladoInvalidoException36);
        codigos.LadoInvalidoException ladoInvalidoException39 = new codigos.LadoInvalidoException("hi!");
        ladoInvalidoException36.addSuppressed((java.lang.Throwable) ladoInvalidoException39);
        java.lang.Throwable[] throwableArray41 = ladoInvalidoException36.getSuppressed();
        java.lang.Throwable[] throwableArray42 = ladoInvalidoException36.getSuppressed();
        ladoInvalidoException26.addSuppressed((java.lang.Throwable) ladoInvalidoException36);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNotNull(throwableArray41);
        org.junit.Assert.assertNotNull(throwableArray42);
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1935");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        float float3 = contaCorrente2.getLimite();
        float float4 = contaCorrente2.getLimite();
        contaCorrente2.setSaldo(88.0f);
        float float7 = contaCorrente2.getSaldo();
        contaCorrente2.setLimite(52.0f);
        float float10 = contaCorrente2.getLimite();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.0f) + "'", float4 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 88.0f + "'", float7 == 88.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 52.0f + "'", float10 == 52.0f);
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1936");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) ' ', 96.0f);
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1937");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(67.0f, (float) '#');
        contaCorrente2.setLimite((-14.0f));
        contaCorrente2.setLimite((float) 100);
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1938");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(23.0f, (-3.0f));
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1939");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (short) 0, 0.0f);
        contaCorrente2.setSaldo((float) 0L);
        contaCorrente2.setLimite(91.0f);
        contaCorrente2.setLimite((float) (-1));
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1940");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        float float3 = contaCorrente2.getSaldo();
        contaCorrente2.setSaldo(100.0f);
        contaCorrente2.setLimite(10.0f);
        float float9 = contaCorrente2.saque((float) 1L);
        contaCorrente2.setLimite((float) (byte) 10);
        contaCorrente2.setLimite((float) (-1));
        contaCorrente2.setSaldo((float) (-1L));
        contaCorrente2.setLimite((float) (-1));
        contaCorrente2.setSaldo((float) 6);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 99.0f + "'", float9 == 99.0f);
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1941");
        codigos.Words words0 = new codigos.Words();
        int int2 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int4 = words0.countWords("NAO FORMA TRIANGULO");
        int int6 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int8 = words0.countWords("hi!");
        int int10 = words0.countWords("hi!");
        int int12 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int14 = words0.countWords("codigos.LadoInvalidoException: NAO FORMA TRIANGULO");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1942");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((-10.0f), (float) (byte) -1);
        float float3 = contaCorrente2.getLimite();
        float float4 = contaCorrente2.getSaldo();
        contaCorrente2.setSaldo((float) (short) 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-10.0f) + "'", float4 == (-10.0f));
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1943");
        codigos.Words words0 = new codigos.Words();
        int int2 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int4 = words0.countWords("NAO FORMA TRIANGULO");
        int int6 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int8 = words0.countWords("NAO FORMA TRIANGULO");
        int int10 = words0.countWords("");
        int int12 = words0.countWords("hi!");
        int int14 = words0.countWords("codigos.LadoInvalidoException: ");
        int int16 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1944");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) '#', (float) (short) 10);
        contaCorrente2.setLimite(1.0f);
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1945");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(99.0f, (float) 'a');
        float float3 = contaCorrente2.getLimite();
        contaCorrente2.setSaldo((float) 100);
        contaCorrente2.setSaldo((float) 'a');
        contaCorrente2.setLimite((float) 0L);
        float float10 = contaCorrente2.getLimite();
        // The following exception was thrown during execution in test generation
        try {
            float float12 = contaCorrente2.saque((-68.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Valor invalido");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1946");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(23.0f, 89.0f);
        contaCorrente2.setSaldo((float) 100L);
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1947");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(96.0f, (float) ' ');
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1948");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) -1, 65.0f);
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1949");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = codigos.Triangulo.classificaTriangulo(1, (int) (byte) -1, 4);
            org.junit.Assert.fail("Expected exception of type codigos.LadoInvalidoException; message: lado invalido");
        } catch (codigos.LadoInvalidoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1950");
        codigos.LadoInvalidoException ladoInvalidoException1 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException3 = new codigos.LadoInvalidoException("");
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException3);
        codigos.LadoInvalidoException ladoInvalidoException6 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException8 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException10 = new codigos.LadoInvalidoException("");
        ladoInvalidoException8.addSuppressed((java.lang.Throwable) ladoInvalidoException10);
        ladoInvalidoException6.addSuppressed((java.lang.Throwable) ladoInvalidoException10);
        java.lang.Throwable[] throwableArray13 = ladoInvalidoException10.getSuppressed();
        ladoInvalidoException3.addSuppressed((java.lang.Throwable) ladoInvalidoException10);
        codigos.LadoInvalidoException ladoInvalidoException16 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException18 = new codigos.LadoInvalidoException("");
        ladoInvalidoException16.addSuppressed((java.lang.Throwable) ladoInvalidoException18);
        codigos.LadoInvalidoException ladoInvalidoException21 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException23 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException25 = new codigos.LadoInvalidoException("");
        ladoInvalidoException23.addSuppressed((java.lang.Throwable) ladoInvalidoException25);
        ladoInvalidoException21.addSuppressed((java.lang.Throwable) ladoInvalidoException25);
        java.lang.Throwable[] throwableArray28 = ladoInvalidoException25.getSuppressed();
        ladoInvalidoException18.addSuppressed((java.lang.Throwable) ladoInvalidoException25);
        java.lang.Throwable[] throwableArray30 = ladoInvalidoException25.getSuppressed();
        ladoInvalidoException10.addSuppressed((java.lang.Throwable) ladoInvalidoException25);
        codigos.LadoInvalidoException ladoInvalidoException33 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException35 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException37 = new codigos.LadoInvalidoException("");
        ladoInvalidoException35.addSuppressed((java.lang.Throwable) ladoInvalidoException37);
        ladoInvalidoException33.addSuppressed((java.lang.Throwable) ladoInvalidoException37);
        java.lang.Throwable[] throwableArray40 = ladoInvalidoException33.getSuppressed();
        ladoInvalidoException10.addSuppressed((java.lang.Throwable) ladoInvalidoException33);
        codigos.LadoInvalidoException ladoInvalidoException43 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException45 = new codigos.LadoInvalidoException("");
        ladoInvalidoException43.addSuppressed((java.lang.Throwable) ladoInvalidoException45);
        codigos.LadoInvalidoException ladoInvalidoException48 = new codigos.LadoInvalidoException("hi!");
        ladoInvalidoException45.addSuppressed((java.lang.Throwable) ladoInvalidoException48);
        java.lang.Throwable[] throwableArray50 = ladoInvalidoException45.getSuppressed();
        ladoInvalidoException10.addSuppressed((java.lang.Throwable) ladoInvalidoException45);
        codigos.LadoInvalidoException ladoInvalidoException53 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException55 = new codigos.LadoInvalidoException("");
        ladoInvalidoException53.addSuppressed((java.lang.Throwable) ladoInvalidoException55);
        codigos.LadoInvalidoException ladoInvalidoException58 = new codigos.LadoInvalidoException("hi!");
        ladoInvalidoException55.addSuppressed((java.lang.Throwable) ladoInvalidoException58);
        ladoInvalidoException10.addSuppressed((java.lang.Throwable) ladoInvalidoException58);
        java.lang.Throwable[] throwableArray61 = ladoInvalidoException58.getSuppressed();
        java.lang.String str62 = ladoInvalidoException58.toString();
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray40);
        org.junit.Assert.assertNotNull(throwableArray50);
        org.junit.Assert.assertNotNull(throwableArray61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "codigos.LadoInvalidoException: hi!" + "'", str62, "codigos.LadoInvalidoException: hi!");
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1951");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        float float3 = contaCorrente2.getSaldo();
        contaCorrente2.setSaldo(100.0f);
        contaCorrente2.setLimite(0.0f);
        float float8 = contaCorrente2.getSaldo();
        float float10 = contaCorrente2.saque((float) (byte) 1);
        float float11 = contaCorrente2.getSaldo();
        float float12 = contaCorrente2.getLimite();
        contaCorrente2.setLimite((float) (short) 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 99.0f + "'", float10 == 99.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 99.0f + "'", float11 == 99.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1952");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 0, 68.0f);
        contaCorrente2.setLimite((float) (short) 10);
        float float5 = contaCorrente2.getSaldo();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1953");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", (float) (short) -1);
        float float8 = pedido0.calculaTaxaDesconto(true, "NAO FORMA TRIANGULO", (float) (byte) 0);
        float float12 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: hi!", (float) (short) 100);
        float float16 = pedido0.calculaTaxaDesconto(false, "ESCALENO", 89.0f);
        float float20 = pedido0.calculaTaxaDesconto(false, "", 91.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10.0f + "'", float12 == 10.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1954");
        codigos.LadoInvalidoException ladoInvalidoException1 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException3 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException5 = new codigos.LadoInvalidoException("");
        ladoInvalidoException3.addSuppressed((java.lang.Throwable) ladoInvalidoException5);
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException5);
        codigos.LadoInvalidoException ladoInvalidoException9 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException11 = new codigos.LadoInvalidoException("");
        ladoInvalidoException9.addSuppressed((java.lang.Throwable) ladoInvalidoException11);
        codigos.LadoInvalidoException ladoInvalidoException14 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException16 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException18 = new codigos.LadoInvalidoException("");
        ladoInvalidoException16.addSuppressed((java.lang.Throwable) ladoInvalidoException18);
        ladoInvalidoException14.addSuppressed((java.lang.Throwable) ladoInvalidoException18);
        java.lang.Throwable[] throwableArray21 = ladoInvalidoException18.getSuppressed();
        ladoInvalidoException11.addSuppressed((java.lang.Throwable) ladoInvalidoException18);
        codigos.LadoInvalidoException ladoInvalidoException24 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException26 = new codigos.LadoInvalidoException("");
        ladoInvalidoException24.addSuppressed((java.lang.Throwable) ladoInvalidoException26);
        codigos.LadoInvalidoException ladoInvalidoException29 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException31 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException33 = new codigos.LadoInvalidoException("");
        ladoInvalidoException31.addSuppressed((java.lang.Throwable) ladoInvalidoException33);
        ladoInvalidoException29.addSuppressed((java.lang.Throwable) ladoInvalidoException33);
        java.lang.Throwable[] throwableArray36 = ladoInvalidoException33.getSuppressed();
        ladoInvalidoException26.addSuppressed((java.lang.Throwable) ladoInvalidoException33);
        java.lang.Throwable[] throwableArray38 = ladoInvalidoException33.getSuppressed();
        ladoInvalidoException18.addSuppressed((java.lang.Throwable) ladoInvalidoException33);
        codigos.LadoInvalidoException ladoInvalidoException41 = new codigos.LadoInvalidoException("codigos.LadoInvalidoException: hi!");
        ladoInvalidoException33.addSuppressed((java.lang.Throwable) ladoInvalidoException41);
        java.lang.Throwable[] throwableArray43 = ladoInvalidoException41.getSuppressed();
        java.lang.Throwable[] throwableArray44 = ladoInvalidoException41.getSuppressed();
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException41);
        codigos.LadoInvalidoException ladoInvalidoException47 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException49 = new codigos.LadoInvalidoException("");
        ladoInvalidoException47.addSuppressed((java.lang.Throwable) ladoInvalidoException49);
        codigos.LadoInvalidoException ladoInvalidoException52 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException54 = new codigos.LadoInvalidoException("");
        ladoInvalidoException52.addSuppressed((java.lang.Throwable) ladoInvalidoException54);
        codigos.LadoInvalidoException ladoInvalidoException57 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException59 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException61 = new codigos.LadoInvalidoException("");
        ladoInvalidoException59.addSuppressed((java.lang.Throwable) ladoInvalidoException61);
        ladoInvalidoException57.addSuppressed((java.lang.Throwable) ladoInvalidoException61);
        java.lang.Throwable[] throwableArray64 = ladoInvalidoException61.getSuppressed();
        ladoInvalidoException54.addSuppressed((java.lang.Throwable) ladoInvalidoException61);
        java.lang.Throwable[] throwableArray66 = ladoInvalidoException61.getSuppressed();
        ladoInvalidoException49.addSuppressed((java.lang.Throwable) ladoInvalidoException61);
        java.lang.Throwable[] throwableArray68 = ladoInvalidoException61.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException70 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException72 = new codigos.LadoInvalidoException("");
        ladoInvalidoException70.addSuppressed((java.lang.Throwable) ladoInvalidoException72);
        codigos.LadoInvalidoException ladoInvalidoException75 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException77 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException79 = new codigos.LadoInvalidoException("");
        ladoInvalidoException77.addSuppressed((java.lang.Throwable) ladoInvalidoException79);
        ladoInvalidoException75.addSuppressed((java.lang.Throwable) ladoInvalidoException79);
        java.lang.Throwable[] throwableArray82 = ladoInvalidoException79.getSuppressed();
        ladoInvalidoException72.addSuppressed((java.lang.Throwable) ladoInvalidoException79);
        java.lang.Throwable[] throwableArray84 = ladoInvalidoException79.getSuppressed();
        ladoInvalidoException61.addSuppressed((java.lang.Throwable) ladoInvalidoException79);
        ladoInvalidoException41.addSuppressed((java.lang.Throwable) ladoInvalidoException61);
        java.lang.String str87 = ladoInvalidoException41.toString();
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertNotNull(throwableArray64);
        org.junit.Assert.assertNotNull(throwableArray66);
        org.junit.Assert.assertNotNull(throwableArray68);
        org.junit.Assert.assertNotNull(throwableArray82);
        org.junit.Assert.assertNotNull(throwableArray84);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!" + "'", str87, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!");
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1955");
        codigos.LadoInvalidoException ladoInvalidoException1 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException3 = new codigos.LadoInvalidoException("");
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException3);
        codigos.LadoInvalidoException ladoInvalidoException6 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException8 = new codigos.LadoInvalidoException("");
        ladoInvalidoException6.addSuppressed((java.lang.Throwable) ladoInvalidoException8);
        codigos.LadoInvalidoException ladoInvalidoException11 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException13 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException15 = new codigos.LadoInvalidoException("");
        ladoInvalidoException13.addSuppressed((java.lang.Throwable) ladoInvalidoException15);
        ladoInvalidoException11.addSuppressed((java.lang.Throwable) ladoInvalidoException15);
        java.lang.Throwable[] throwableArray18 = ladoInvalidoException15.getSuppressed();
        ladoInvalidoException8.addSuppressed((java.lang.Throwable) ladoInvalidoException15);
        ladoInvalidoException3.addSuppressed((java.lang.Throwable) ladoInvalidoException8);
        java.lang.Throwable[] throwableArray21 = ladoInvalidoException3.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException23 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException25 = new codigos.LadoInvalidoException("");
        ladoInvalidoException23.addSuppressed((java.lang.Throwable) ladoInvalidoException25);
        codigos.LadoInvalidoException ladoInvalidoException28 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException30 = new codigos.LadoInvalidoException("");
        ladoInvalidoException28.addSuppressed((java.lang.Throwable) ladoInvalidoException30);
        codigos.LadoInvalidoException ladoInvalidoException33 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException35 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException37 = new codigos.LadoInvalidoException("");
        ladoInvalidoException35.addSuppressed((java.lang.Throwable) ladoInvalidoException37);
        ladoInvalidoException33.addSuppressed((java.lang.Throwable) ladoInvalidoException37);
        java.lang.Throwable[] throwableArray40 = ladoInvalidoException37.getSuppressed();
        ladoInvalidoException30.addSuppressed((java.lang.Throwable) ladoInvalidoException37);
        java.lang.Throwable[] throwableArray42 = ladoInvalidoException37.getSuppressed();
        ladoInvalidoException25.addSuppressed((java.lang.Throwable) ladoInvalidoException37);
        java.lang.Throwable[] throwableArray44 = ladoInvalidoException37.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException46 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException48 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException50 = new codigos.LadoInvalidoException("");
        ladoInvalidoException48.addSuppressed((java.lang.Throwable) ladoInvalidoException50);
        ladoInvalidoException46.addSuppressed((java.lang.Throwable) ladoInvalidoException50);
        java.lang.Throwable[] throwableArray53 = ladoInvalidoException50.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException55 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException57 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException59 = new codigos.LadoInvalidoException("");
        ladoInvalidoException57.addSuppressed((java.lang.Throwable) ladoInvalidoException59);
        ladoInvalidoException55.addSuppressed((java.lang.Throwable) ladoInvalidoException59);
        java.lang.Throwable[] throwableArray62 = ladoInvalidoException55.getSuppressed();
        ladoInvalidoException50.addSuppressed((java.lang.Throwable) ladoInvalidoException55);
        ladoInvalidoException37.addSuppressed((java.lang.Throwable) ladoInvalidoException50);
        ladoInvalidoException3.addSuppressed((java.lang.Throwable) ladoInvalidoException50);
        java.lang.Throwable[] throwableArray66 = ladoInvalidoException50.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException68 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException70 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException72 = new codigos.LadoInvalidoException("");
        ladoInvalidoException70.addSuppressed((java.lang.Throwable) ladoInvalidoException72);
        ladoInvalidoException68.addSuppressed((java.lang.Throwable) ladoInvalidoException72);
        java.lang.Throwable[] throwableArray75 = ladoInvalidoException72.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException77 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException79 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException81 = new codigos.LadoInvalidoException("");
        ladoInvalidoException79.addSuppressed((java.lang.Throwable) ladoInvalidoException81);
        ladoInvalidoException77.addSuppressed((java.lang.Throwable) ladoInvalidoException81);
        java.lang.Throwable[] throwableArray84 = ladoInvalidoException77.getSuppressed();
        ladoInvalidoException72.addSuppressed((java.lang.Throwable) ladoInvalidoException77);
        ladoInvalidoException50.addSuppressed((java.lang.Throwable) ladoInvalidoException72);
        java.lang.String str87 = ladoInvalidoException72.toString();
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray40);
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertNotNull(throwableArray53);
        org.junit.Assert.assertNotNull(throwableArray62);
        org.junit.Assert.assertNotNull(throwableArray66);
        org.junit.Assert.assertNotNull(throwableArray75);
        org.junit.Assert.assertNotNull(throwableArray84);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "codigos.LadoInvalidoException: " + "'", str87, "codigos.LadoInvalidoException: ");
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1956");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 0, (float) (short) 0);
        contaCorrente2.setLimite((float) 4);
        contaCorrente2.setSaldo((float) (byte) 100);
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1957");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", (float) (short) -1);
        float float8 = pedido0.calculaTaxaDesconto(true, "NAO FORMA TRIANGULO", (float) (byte) 0);
        float float12 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: hi!", (float) (-1L));
        float float16 = pedido0.calculaTaxaDesconto(true, "", (float) (byte) 10);
        float float20 = pedido0.calculaTaxaDesconto(false, "ESCALENO", 88.0f);
        float float24 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: hi!", 1.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.0f + "'", float24 == 0.0f);
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1958");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(3.0f, 96.0f);
        contaCorrente2.setSaldo(34.0f);
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1959");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        float float3 = contaCorrente2.getSaldo();
        contaCorrente2.setSaldo(100.0f);
        float float6 = contaCorrente2.getLimite();
        contaCorrente2.setSaldo(100.0f);
        float float10 = contaCorrente2.saque(35.0f);
        java.lang.Class<?> wildcardClass11 = contaCorrente2.getClass();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-1.0f) + "'", float6 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 65.0f + "'", float10 == 65.0f);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1960");
        codigos.Words words0 = new codigos.Words();
        int int2 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int4 = words0.countWords("NAO FORMA TRIANGULO");
        int int6 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int8 = words0.countWords("NAO FORMA TRIANGULO");
        int int10 = words0.countWords("");
        int int12 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        int int14 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        int int16 = words0.countWords("");
        java.lang.Class<?> wildcardClass17 = words0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1961");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 1, (-88.0f));
        float float3 = contaCorrente2.getSaldo();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1962");
        codigos.LadoInvalidoException ladoInvalidoException1 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException3 = new codigos.LadoInvalidoException("");
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException3);
        codigos.LadoInvalidoException ladoInvalidoException6 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException8 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException10 = new codigos.LadoInvalidoException("");
        ladoInvalidoException8.addSuppressed((java.lang.Throwable) ladoInvalidoException10);
        ladoInvalidoException6.addSuppressed((java.lang.Throwable) ladoInvalidoException10);
        java.lang.Throwable[] throwableArray13 = ladoInvalidoException10.getSuppressed();
        ladoInvalidoException3.addSuppressed((java.lang.Throwable) ladoInvalidoException10);
        java.lang.Throwable[] throwableArray15 = ladoInvalidoException10.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException17 = new codigos.LadoInvalidoException("hi!");
        codigos.LadoInvalidoException ladoInvalidoException19 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException21 = new codigos.LadoInvalidoException("");
        ladoInvalidoException19.addSuppressed((java.lang.Throwable) ladoInvalidoException21);
        codigos.LadoInvalidoException ladoInvalidoException24 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException26 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException28 = new codigos.LadoInvalidoException("");
        ladoInvalidoException26.addSuppressed((java.lang.Throwable) ladoInvalidoException28);
        ladoInvalidoException24.addSuppressed((java.lang.Throwable) ladoInvalidoException28);
        java.lang.Throwable[] throwableArray31 = ladoInvalidoException28.getSuppressed();
        ladoInvalidoException21.addSuppressed((java.lang.Throwable) ladoInvalidoException28);
        ladoInvalidoException17.addSuppressed((java.lang.Throwable) ladoInvalidoException28);
        codigos.LadoInvalidoException ladoInvalidoException35 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException37 = new codigos.LadoInvalidoException("");
        ladoInvalidoException35.addSuppressed((java.lang.Throwable) ladoInvalidoException37);
        codigos.LadoInvalidoException ladoInvalidoException40 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException42 = new codigos.LadoInvalidoException("");
        ladoInvalidoException40.addSuppressed((java.lang.Throwable) ladoInvalidoException42);
        codigos.LadoInvalidoException ladoInvalidoException45 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException47 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException49 = new codigos.LadoInvalidoException("");
        ladoInvalidoException47.addSuppressed((java.lang.Throwable) ladoInvalidoException49);
        ladoInvalidoException45.addSuppressed((java.lang.Throwable) ladoInvalidoException49);
        java.lang.Throwable[] throwableArray52 = ladoInvalidoException49.getSuppressed();
        ladoInvalidoException42.addSuppressed((java.lang.Throwable) ladoInvalidoException49);
        java.lang.Throwable[] throwableArray54 = ladoInvalidoException49.getSuppressed();
        ladoInvalidoException37.addSuppressed((java.lang.Throwable) ladoInvalidoException49);
        java.lang.Throwable[] throwableArray56 = ladoInvalidoException49.getSuppressed();
        ladoInvalidoException17.addSuppressed((java.lang.Throwable) ladoInvalidoException49);
        ladoInvalidoException10.addSuppressed((java.lang.Throwable) ladoInvalidoException17);
        java.lang.Throwable[] throwableArray59 = ladoInvalidoException17.getSuppressed();
        java.lang.String str60 = ladoInvalidoException17.toString();
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(throwableArray52);
        org.junit.Assert.assertNotNull(throwableArray54);
        org.junit.Assert.assertNotNull(throwableArray56);
        org.junit.Assert.assertNotNull(throwableArray59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "codigos.LadoInvalidoException: hi!" + "'", str60, "codigos.LadoInvalidoException: hi!");
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1963");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 0, (float) ' ');
        float float4 = contaCorrente2.saque((float) (byte) 1);
        float float6 = contaCorrente2.saque((float) (short) 10);
        float float7 = contaCorrente2.getLimite();
        float float8 = contaCorrente2.getLimite();
        contaCorrente2.setLimite((-57.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.0f) + "'", float4 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-11.0f) + "'", float6 == (-11.0f));
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 32.0f + "'", float7 == 32.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 32.0f + "'", float8 == 32.0f);
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1964");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = codigos.Triangulo.classificaTriangulo(10, (int) (byte) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type codigos.LadoInvalidoException; message: lado invalido");
        } catch (codigos.LadoInvalidoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1965");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", 1.0f);
        float float8 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: hi!", (float) (short) 10);
        float float12 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: hi!", (float) 2);
        float float16 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: ", 32.0f);
        float float20 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!", 98.0f);
        float float24 = pedido0.calculaTaxaDesconto(false, "", 97.0f);
        float float28 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!", 97.0f);
        float float32 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!", (-68.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.0f + "'", float24 == 0.0f);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 10.0f + "'", float28 == 10.0f);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 10.0f + "'", float32 == 10.0f);
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1966");
        codigos.LadoInvalidoException ladoInvalidoException1 = new codigos.LadoInvalidoException("NAO FORMA TRIANGULO");
        codigos.LadoInvalidoException ladoInvalidoException3 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException5 = new codigos.LadoInvalidoException("");
        ladoInvalidoException3.addSuppressed((java.lang.Throwable) ladoInvalidoException5);
        codigos.LadoInvalidoException ladoInvalidoException8 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException10 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException12 = new codigos.LadoInvalidoException("");
        ladoInvalidoException10.addSuppressed((java.lang.Throwable) ladoInvalidoException12);
        ladoInvalidoException8.addSuppressed((java.lang.Throwable) ladoInvalidoException12);
        java.lang.Throwable[] throwableArray15 = ladoInvalidoException12.getSuppressed();
        ladoInvalidoException5.addSuppressed((java.lang.Throwable) ladoInvalidoException12);
        codigos.LadoInvalidoException ladoInvalidoException18 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException20 = new codigos.LadoInvalidoException("");
        ladoInvalidoException18.addSuppressed((java.lang.Throwable) ladoInvalidoException20);
        codigos.LadoInvalidoException ladoInvalidoException23 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException25 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException27 = new codigos.LadoInvalidoException("");
        ladoInvalidoException25.addSuppressed((java.lang.Throwable) ladoInvalidoException27);
        ladoInvalidoException23.addSuppressed((java.lang.Throwable) ladoInvalidoException27);
        java.lang.Throwable[] throwableArray30 = ladoInvalidoException27.getSuppressed();
        ladoInvalidoException20.addSuppressed((java.lang.Throwable) ladoInvalidoException27);
        java.lang.Throwable[] throwableArray32 = ladoInvalidoException27.getSuppressed();
        ladoInvalidoException12.addSuppressed((java.lang.Throwable) ladoInvalidoException27);
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException12);
        java.lang.Throwable[] throwableArray35 = ladoInvalidoException1.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException37 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException39 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException41 = new codigos.LadoInvalidoException("");
        ladoInvalidoException39.addSuppressed((java.lang.Throwable) ladoInvalidoException41);
        ladoInvalidoException37.addSuppressed((java.lang.Throwable) ladoInvalidoException41);
        java.lang.Throwable[] throwableArray44 = ladoInvalidoException37.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException46 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException48 = new codigos.LadoInvalidoException("");
        ladoInvalidoException46.addSuppressed((java.lang.Throwable) ladoInvalidoException48);
        codigos.LadoInvalidoException ladoInvalidoException51 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException53 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException55 = new codigos.LadoInvalidoException("");
        ladoInvalidoException53.addSuppressed((java.lang.Throwable) ladoInvalidoException55);
        ladoInvalidoException51.addSuppressed((java.lang.Throwable) ladoInvalidoException55);
        java.lang.Throwable[] throwableArray58 = ladoInvalidoException55.getSuppressed();
        ladoInvalidoException48.addSuppressed((java.lang.Throwable) ladoInvalidoException55);
        codigos.LadoInvalidoException ladoInvalidoException61 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException63 = new codigos.LadoInvalidoException("");
        ladoInvalidoException61.addSuppressed((java.lang.Throwable) ladoInvalidoException63);
        codigos.LadoInvalidoException ladoInvalidoException66 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException68 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException70 = new codigos.LadoInvalidoException("");
        ladoInvalidoException68.addSuppressed((java.lang.Throwable) ladoInvalidoException70);
        ladoInvalidoException66.addSuppressed((java.lang.Throwable) ladoInvalidoException70);
        java.lang.Throwable[] throwableArray73 = ladoInvalidoException70.getSuppressed();
        ladoInvalidoException63.addSuppressed((java.lang.Throwable) ladoInvalidoException70);
        java.lang.Throwable[] throwableArray75 = ladoInvalidoException70.getSuppressed();
        ladoInvalidoException55.addSuppressed((java.lang.Throwable) ladoInvalidoException70);
        codigos.LadoInvalidoException ladoInvalidoException78 = new codigos.LadoInvalidoException("codigos.LadoInvalidoException: hi!");
        ladoInvalidoException70.addSuppressed((java.lang.Throwable) ladoInvalidoException78);
        java.lang.Throwable[] throwableArray80 = ladoInvalidoException78.getSuppressed();
        ladoInvalidoException37.addSuppressed((java.lang.Throwable) ladoInvalidoException78);
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException37);
        java.lang.Throwable[] throwableArray83 = ladoInvalidoException1.getSuppressed();
        java.lang.String str84 = ladoInvalidoException1.toString();
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertNotNull(throwableArray58);
        org.junit.Assert.assertNotNull(throwableArray73);
        org.junit.Assert.assertNotNull(throwableArray75);
        org.junit.Assert.assertNotNull(throwableArray80);
        org.junit.Assert.assertNotNull(throwableArray83);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "codigos.LadoInvalidoException: NAO FORMA TRIANGULO" + "'", str84, "codigos.LadoInvalidoException: NAO FORMA TRIANGULO");
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1967");
        codigos.LadoInvalidoException ladoInvalidoException1 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException3 = new codigos.LadoInvalidoException("");
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException3);
        codigos.LadoInvalidoException ladoInvalidoException6 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException8 = new codigos.LadoInvalidoException("");
        ladoInvalidoException6.addSuppressed((java.lang.Throwable) ladoInvalidoException8);
        codigos.LadoInvalidoException ladoInvalidoException11 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException13 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException15 = new codigos.LadoInvalidoException("");
        ladoInvalidoException13.addSuppressed((java.lang.Throwable) ladoInvalidoException15);
        ladoInvalidoException11.addSuppressed((java.lang.Throwable) ladoInvalidoException15);
        java.lang.Throwable[] throwableArray18 = ladoInvalidoException15.getSuppressed();
        ladoInvalidoException8.addSuppressed((java.lang.Throwable) ladoInvalidoException15);
        java.lang.Throwable[] throwableArray20 = ladoInvalidoException15.getSuppressed();
        ladoInvalidoException3.addSuppressed((java.lang.Throwable) ladoInvalidoException15);
        java.lang.Throwable[] throwableArray22 = ladoInvalidoException15.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException24 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException26 = new codigos.LadoInvalidoException("");
        ladoInvalidoException24.addSuppressed((java.lang.Throwable) ladoInvalidoException26);
        codigos.LadoInvalidoException ladoInvalidoException29 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException31 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException33 = new codigos.LadoInvalidoException("");
        ladoInvalidoException31.addSuppressed((java.lang.Throwable) ladoInvalidoException33);
        ladoInvalidoException29.addSuppressed((java.lang.Throwable) ladoInvalidoException33);
        java.lang.Throwable[] throwableArray36 = ladoInvalidoException33.getSuppressed();
        ladoInvalidoException26.addSuppressed((java.lang.Throwable) ladoInvalidoException33);
        java.lang.Throwable[] throwableArray38 = ladoInvalidoException33.getSuppressed();
        ladoInvalidoException15.addSuppressed((java.lang.Throwable) ladoInvalidoException33);
        codigos.LadoInvalidoException ladoInvalidoException41 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException43 = new codigos.LadoInvalidoException("");
        ladoInvalidoException41.addSuppressed((java.lang.Throwable) ladoInvalidoException43);
        codigos.LadoInvalidoException ladoInvalidoException46 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException48 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException50 = new codigos.LadoInvalidoException("");
        ladoInvalidoException48.addSuppressed((java.lang.Throwable) ladoInvalidoException50);
        ladoInvalidoException46.addSuppressed((java.lang.Throwable) ladoInvalidoException50);
        java.lang.Throwable[] throwableArray53 = ladoInvalidoException50.getSuppressed();
        ladoInvalidoException43.addSuppressed((java.lang.Throwable) ladoInvalidoException50);
        java.lang.Throwable[] throwableArray55 = ladoInvalidoException50.getSuppressed();
        ladoInvalidoException15.addSuppressed((java.lang.Throwable) ladoInvalidoException50);
        codigos.LadoInvalidoException ladoInvalidoException58 = new codigos.LadoInvalidoException("codigos.LadoInvalidoException: hi!");
        codigos.LadoInvalidoException ladoInvalidoException60 = new codigos.LadoInvalidoException("hi!");
        ladoInvalidoException58.addSuppressed((java.lang.Throwable) ladoInvalidoException60);
        java.lang.Throwable[] throwableArray62 = ladoInvalidoException60.getSuppressed();
        java.lang.Throwable[] throwableArray63 = ladoInvalidoException60.getSuppressed();
        ladoInvalidoException50.addSuppressed((java.lang.Throwable) ladoInvalidoException60);
        codigos.LadoInvalidoException ladoInvalidoException66 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException68 = new codigos.LadoInvalidoException("");
        ladoInvalidoException66.addSuppressed((java.lang.Throwable) ladoInvalidoException68);
        codigos.LadoInvalidoException ladoInvalidoException71 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException73 = new codigos.LadoInvalidoException("");
        ladoInvalidoException71.addSuppressed((java.lang.Throwable) ladoInvalidoException73);
        codigos.LadoInvalidoException ladoInvalidoException76 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException78 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException80 = new codigos.LadoInvalidoException("");
        ladoInvalidoException78.addSuppressed((java.lang.Throwable) ladoInvalidoException80);
        ladoInvalidoException76.addSuppressed((java.lang.Throwable) ladoInvalidoException80);
        java.lang.Throwable[] throwableArray83 = ladoInvalidoException80.getSuppressed();
        ladoInvalidoException73.addSuppressed((java.lang.Throwable) ladoInvalidoException80);
        java.lang.Throwable[] throwableArray85 = ladoInvalidoException80.getSuppressed();
        ladoInvalidoException68.addSuppressed((java.lang.Throwable) ladoInvalidoException80);
        java.lang.Throwable[] throwableArray87 = ladoInvalidoException80.getSuppressed();
        java.lang.Throwable[] throwableArray88 = ladoInvalidoException80.getSuppressed();
        java.lang.Throwable[] throwableArray89 = ladoInvalidoException80.getSuppressed();
        ladoInvalidoException50.addSuppressed((java.lang.Throwable) ladoInvalidoException80);
        java.lang.Throwable[] throwableArray91 = ladoInvalidoException80.getSuppressed();
        java.lang.String str92 = ladoInvalidoException80.toString();
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertNotNull(throwableArray53);
        org.junit.Assert.assertNotNull(throwableArray55);
        org.junit.Assert.assertNotNull(throwableArray62);
        org.junit.Assert.assertNotNull(throwableArray63);
        org.junit.Assert.assertNotNull(throwableArray83);
        org.junit.Assert.assertNotNull(throwableArray85);
        org.junit.Assert.assertNotNull(throwableArray87);
        org.junit.Assert.assertNotNull(throwableArray88);
        org.junit.Assert.assertNotNull(throwableArray89);
        org.junit.Assert.assertNotNull(throwableArray91);
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "codigos.LadoInvalidoException: " + "'", str92, "codigos.LadoInvalidoException: ");
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1968");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", 1.0f);
        float float8 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: hi!", (float) (short) 10);
        float float12 = pedido0.calculaTaxaDesconto(false, "NAO FORMA TRIANGULO", (-48.0f));
        float float16 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!", 100.0f);
        float float20 = pedido0.calculaTaxaDesconto(true, "ESCALENO", 3.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 10.0f + "'", float20 == 10.0f);
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1969");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = codigos.Triangulo.classificaTriangulo(0, (int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type codigos.LadoInvalidoException; message: lado invalido");
        } catch (codigos.LadoInvalidoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1970");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (short) 100, (float) (short) 10);
        contaCorrente2.setLimite(42.0f);
        float float5 = contaCorrente2.getLimite();
        contaCorrente2.setLimite(52.0f);
        float float8 = contaCorrente2.getSaldo();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 42.0f + "'", float5 == 42.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1971");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) ' ', 42.0f);
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1972");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 0, 68.0f);
        float float3 = contaCorrente2.getSaldo();
        float float4 = contaCorrente2.getLimite();
        contaCorrente2.setLimite(10.0f);
        float float7 = contaCorrente2.getLimite();
        contaCorrente2.setLimite(0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 68.0f + "'", float4 == 68.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1973");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        float float3 = contaCorrente2.getSaldo();
        contaCorrente2.setSaldo(100.0f);
        float float6 = contaCorrente2.getLimite();
        contaCorrente2.setSaldo((float) (byte) -1);
        float float9 = contaCorrente2.getLimite();
        contaCorrente2.setLimite(57.0f);
        contaCorrente2.setLimite(88.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-1.0f) + "'", float6 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1974");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 0, 68.0f);
        float float3 = contaCorrente2.getSaldo();
        float float4 = contaCorrente2.getSaldo();
        float float5 = contaCorrente2.getLimite();
        // The following exception was thrown during execution in test generation
        try {
            float float7 = contaCorrente2.saque((-45.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Valor invalido");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 68.0f + "'", float5 == 68.0f);
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1975");
        codigos.LadoInvalidoException ladoInvalidoException1 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException3 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException5 = new codigos.LadoInvalidoException("");
        ladoInvalidoException3.addSuppressed((java.lang.Throwable) ladoInvalidoException5);
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException5);
        java.lang.Throwable[] throwableArray8 = ladoInvalidoException1.getSuppressed();
        java.lang.Throwable[] throwableArray9 = ladoInvalidoException1.getSuppressed();
        java.lang.Class<?> wildcardClass10 = ladoInvalidoException1.getClass();
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1976");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(23.0f, (float) 4);
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1977");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(1.0f, 1.0f);
        contaCorrente2.setSaldo((float) 100);
        float float6 = contaCorrente2.saque((float) 100);
        float float7 = contaCorrente2.getLimite();
        contaCorrente2.setSaldo((float) 10);
        contaCorrente2.setLimite(0.0f);
        float float12 = contaCorrente2.getLimite();
        float float13 = contaCorrente2.getSaldo();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 1.0f + "'", float7 == 1.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 10.0f + "'", float13 == 10.0f);
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1978");
        java.lang.String str3 = codigos.Triangulo.classificaTriangulo((int) (byte) 100, 3, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ISOSCELES" + "'", str3, "ISOSCELES");
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1979");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        float float3 = contaCorrente2.getLimite();
        float float4 = contaCorrente2.getSaldo();
        float float5 = contaCorrente2.getLimite();
        contaCorrente2.setSaldo((-1.0f));
        contaCorrente2.setSaldo(0.0f);
        float float10 = contaCorrente2.getLimite();
        float float11 = contaCorrente2.getSaldo();
        java.lang.Class<?> wildcardClass12 = contaCorrente2.getClass();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-1.0f) + "'", float10 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1980");
        codigos.Words words0 = new codigos.Words();
        int int2 = words0.countWords("codigos.LadoInvalidoException: ");
        int int4 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1981");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", (float) (-1L));
        float float8 = pedido0.calculaTaxaDesconto(true, "hi!", 90.0f);
        float float12 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!", 27.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1982");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(97.0f, 99.0f);
        float float3 = contaCorrente2.getSaldo();
        contaCorrente2.setLimite(10.0f);
        contaCorrente2.setLimite(0.0f);
        float float8 = contaCorrente2.getSaldo();
        float float9 = contaCorrente2.getLimite();
        java.lang.Class<?> wildcardClass10 = contaCorrente2.getClass();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 97.0f + "'", float8 == 97.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1983");
        codigos.Words words0 = new codigos.Words();
        int int2 = words0.countWords("codigos.LadoInvalidoException: ");
        int int4 = words0.countWords("hi!");
        int int6 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!");
        int int8 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        int int10 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1984");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", 1.0f);
        float float8 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: hi!", (float) (short) 10);
        float float12 = pedido0.calculaTaxaDesconto(true, "NAO FORMA TRIANGULO", (float) 0L);
        float float16 = pedido0.calculaTaxaDesconto(true, "", 1.0f);
        float float20 = pedido0.calculaTaxaDesconto(false, "NAO FORMA TRIANGULO", (float) (-1L));
        float float24 = pedido0.calculaTaxaDesconto(false, "ISOSCELES", 22.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10.0f + "'", float12 == 10.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.0f + "'", float24 == 0.0f);
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1985");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        float float3 = contaCorrente2.getLimite();
        float float4 = contaCorrente2.getLimite();
        float float5 = contaCorrente2.getSaldo();
        contaCorrente2.setLimite(98.0f);
        float float9 = contaCorrente2.saque((float) (byte) 10);
        float float10 = contaCorrente2.getLimite();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.0f) + "'", float4 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 100.0f + "'", float5 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 90.0f + "'", float9 == 90.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 98.0f + "'", float10 == 98.0f);
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1986");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 0, (float) 10L);
        float float3 = contaCorrente2.getLimite();
        float float4 = contaCorrente2.getLimite();
        contaCorrente2.setLimite(0.0f);
        contaCorrente2.setLimite(69.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1987");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 10, 67.0f);
        float float3 = contaCorrente2.getSaldo();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1988");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(1.0f, (float) 0L);
        contaCorrente2.setSaldo((float) 'a');
        contaCorrente2.setLimite((float) 10L);
        contaCorrente2.setSaldo((float) (short) 0);
        contaCorrente2.setLimite((float) (byte) 10);
        contaCorrente2.setSaldo((float) (short) 0);
        float float13 = contaCorrente2.getLimite();
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 10.0f + "'", float13 == 10.0f);
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1989");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((-32.0f), 66.0f);
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1990");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 'a', (float) 10);
        float float4 = contaCorrente2.saque((float) 1);
        float float5 = contaCorrente2.getLimite();
        float float6 = contaCorrente2.getLimite();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 96.0f + "'", float4 == 96.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10.0f + "'", float5 == 10.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1991");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = codigos.Triangulo.classificaTriangulo(0, (int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type codigos.LadoInvalidoException; message: lado invalido");
        } catch (codigos.LadoInvalidoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1992");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        float float3 = contaCorrente2.getLimite();
        float float4 = contaCorrente2.getSaldo();
        float float5 = contaCorrente2.getLimite();
        float float6 = contaCorrente2.getSaldo();
        contaCorrente2.setLimite((float) (byte) 10);
        contaCorrente2.setSaldo((float) 100L);
        float float11 = contaCorrente2.getLimite();
        contaCorrente2.setLimite((float) (short) 10);
        float float14 = contaCorrente2.getLimite();
        float float16 = contaCorrente2.saque(9.0f);
        contaCorrente2.setSaldo((float) '4');
        contaCorrente2.setLimite(68.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 10.0f + "'", float14 == 10.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 91.0f + "'", float16 == 91.0f);
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1993");
        codigos.Words words0 = new codigos.Words();
        int int2 = words0.countWords("");
        int int4 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!");
        int int6 = words0.countWords("");
        int int8 = words0.countWords("codigos.LadoInvalidoException: ");
        int int10 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1994");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(10.0f, (float) (byte) 0);
        contaCorrente2.setLimite((-48.0f));
        // The following exception was thrown during execution in test generation
        try {
            float float6 = contaCorrente2.saque((-31.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Valor invalido");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1995");
        codigos.Words words0 = new codigos.Words();
        int int2 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int4 = words0.countWords("NAO FORMA TRIANGULO");
        int int6 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int8 = words0.countWords("NAO FORMA TRIANGULO");
        int int10 = words0.countWords("");
        int int12 = words0.countWords("ESCALENO");
        int int14 = words0.countWords("NAO FORMA TRIANGULO");
        int int16 = words0.countWords("codigos.LadoInvalidoException: ESCALENO");
        int int18 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        int int20 = words0.countWords("EQUILATERO");
        java.lang.Class<?> wildcardClass21 = words0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1996");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = codigos.Triangulo.classificaTriangulo((-1), (int) (byte) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type codigos.LadoInvalidoException; message: lado invalido");
        } catch (codigos.LadoInvalidoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1997");
        codigos.Words words0 = new codigos.Words();
        int int2 = words0.countWords("");
        int int4 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        int int6 = words0.countWords("ISOSCELES");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1998");
        codigos.LadoInvalidoException ladoInvalidoException1 = new codigos.LadoInvalidoException("hi!");
        codigos.LadoInvalidoException ladoInvalidoException3 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException5 = new codigos.LadoInvalidoException("");
        ladoInvalidoException3.addSuppressed((java.lang.Throwable) ladoInvalidoException5);
        codigos.LadoInvalidoException ladoInvalidoException8 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException10 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException12 = new codigos.LadoInvalidoException("");
        ladoInvalidoException10.addSuppressed((java.lang.Throwable) ladoInvalidoException12);
        ladoInvalidoException8.addSuppressed((java.lang.Throwable) ladoInvalidoException12);
        java.lang.Throwable[] throwableArray15 = ladoInvalidoException12.getSuppressed();
        ladoInvalidoException5.addSuppressed((java.lang.Throwable) ladoInvalidoException12);
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException12);
        codigos.LadoInvalidoException ladoInvalidoException19 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException21 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException23 = new codigos.LadoInvalidoException("");
        ladoInvalidoException21.addSuppressed((java.lang.Throwable) ladoInvalidoException23);
        ladoInvalidoException19.addSuppressed((java.lang.Throwable) ladoInvalidoException23);
        java.lang.Throwable[] throwableArray26 = ladoInvalidoException23.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException28 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException30 = new codigos.LadoInvalidoException("");
        ladoInvalidoException28.addSuppressed((java.lang.Throwable) ladoInvalidoException30);
        codigos.LadoInvalidoException ladoInvalidoException33 = new codigos.LadoInvalidoException("hi!");
        ladoInvalidoException30.addSuppressed((java.lang.Throwable) ladoInvalidoException33);
        ladoInvalidoException23.addSuppressed((java.lang.Throwable) ladoInvalidoException33);
        java.lang.Throwable[] throwableArray36 = ladoInvalidoException23.getSuppressed();
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException23);
        java.lang.Throwable[] throwableArray38 = ladoInvalidoException1.getSuppressed();
        java.lang.Throwable[] throwableArray39 = ladoInvalidoException1.getSuppressed();
        java.lang.Class<?> wildcardClass40 = throwableArray39.getClass();
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1999");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(9.0f, 32.0f);
        float float3 = contaCorrente2.getLimite();
        // The following exception was thrown during execution in test generation
        try {
            float float5 = contaCorrente2.saque(96.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Saldo Insuficiente");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 32.0f + "'", float3 == 32.0f);
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test2000");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(69.0f, (float) 0);
    }
}

