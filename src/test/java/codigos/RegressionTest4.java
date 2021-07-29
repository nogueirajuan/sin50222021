import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

    public static boolean debug = false;

    @Test
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        float float3 = contaCorrente2.getLimite();
        float float4 = contaCorrente2.getSaldo();
        float float5 = contaCorrente2.getLimite();
        float float6 = contaCorrente2.getSaldo();
        contaCorrente2.setLimite((float) (byte) 10);
        contaCorrente2.setSaldo((float) 100L);
        contaCorrente2.setSaldo(90.0f);
        float float13 = contaCorrente2.getSaldo();
        contaCorrente2.setLimite((float) (byte) 1);
        contaCorrente2.setLimite((-2.0f));
        float float18 = contaCorrente2.getLimite();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 90.0f + "'", float13 == 90.0f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + (-2.0f) + "'", float18 == (-2.0f));
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        java.lang.String str3 = codigos.Triangulo.classificaTriangulo(4, (int) (byte) 100, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "NAO FORMA TRIANGULO" + "'", str3, "NAO FORMA TRIANGULO");
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(62.0f, 62.0f);
        contaCorrente2.setLimite((-2.0f));
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
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
        java.lang.Throwable[] throwableArray23 = ladoInvalidoException3.getSuppressed();
        java.lang.String str24 = ladoInvalidoException3.toString();
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "codigos.LadoInvalidoException: " + "'", str24, "codigos.LadoInvalidoException: ");
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
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
            float float19 = contaCorrente2.saque((float) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Valor invalido");
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
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", 1.0f);
        float float8 = pedido0.calculaTaxaDesconto(false, "", (float) 1);
        float float12 = pedido0.calculaTaxaDesconto(false, "hi!", (float) (short) 100);
        float float16 = pedido0.calculaTaxaDesconto(true, "", (float) ' ');
        float float20 = pedido0.calculaTaxaDesconto(false, "", (float) 0L);
        float float24 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!", 99.0f);
        float float28 = pedido0.calculaTaxaDesconto(true, "", (-41.0f));
        float float32 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: hi!", (float) 1L);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.0f + "'", float24 == 0.0f);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 10.0f + "'", float28 == 10.0f);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 0.0f + "'", float32 == 0.0f);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        java.lang.String str3 = codigos.Triangulo.classificaTriangulo(5, (int) (byte) 1, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "NAO FORMA TRIANGULO" + "'", str3, "NAO FORMA TRIANGULO");
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(99.0f, (float) 'a');
        float float3 = contaCorrente2.getLimite();
        contaCorrente2.setSaldo((-10.0f));
        float float7 = contaCorrente2.saque((float) (short) 1);
        contaCorrente2.setSaldo((float) 10L);
        float float10 = contaCorrente2.getSaldo();
        contaCorrente2.setSaldo((float) 0L);
        contaCorrente2.setLimite((float) (short) 10);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-11.0f) + "'", float7 == (-11.0f));
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", 1.0f);
        float float8 = pedido0.calculaTaxaDesconto(false, "", (float) 1);
        float float12 = pedido0.calculaTaxaDesconto(false, "hi!", (float) (short) 100);
        float float16 = pedido0.calculaTaxaDesconto(true, "hi!", 67.0f);
        float float20 = pedido0.calculaTaxaDesconto(true, "ISOSCELES", 98.0f);
        java.lang.Class<?> wildcardClass21 = pedido0.getClass();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 10.0f + "'", float20 == 10.0f);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 1, 32.0f);
        float float3 = contaCorrente2.getLimite();
        contaCorrente2.setSaldo((float) (short) 0);
        contaCorrente2.setLimite((float) 2);
        contaCorrente2.setLimite((-31.0f));
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 32.0f + "'", float3 == 32.0f);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        java.lang.String str3 = codigos.Triangulo.classificaTriangulo((int) 'a', 6, 4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "NAO FORMA TRIANGULO" + "'", str3, "NAO FORMA TRIANGULO");
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        codigos.LadoInvalidoException ladoInvalidoException1 = new codigos.LadoInvalidoException("codigos.LadoInvalidoException: hi!");
        codigos.LadoInvalidoException ladoInvalidoException3 = new codigos.LadoInvalidoException("hi!");
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException3);
        codigos.LadoInvalidoException ladoInvalidoException6 = new codigos.LadoInvalidoException("hi!");
        codigos.LadoInvalidoException ladoInvalidoException8 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException10 = new codigos.LadoInvalidoException("");
        ladoInvalidoException8.addSuppressed((java.lang.Throwable) ladoInvalidoException10);
        codigos.LadoInvalidoException ladoInvalidoException13 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException15 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException17 = new codigos.LadoInvalidoException("");
        ladoInvalidoException15.addSuppressed((java.lang.Throwable) ladoInvalidoException17);
        ladoInvalidoException13.addSuppressed((java.lang.Throwable) ladoInvalidoException17);
        java.lang.Throwable[] throwableArray20 = ladoInvalidoException17.getSuppressed();
        ladoInvalidoException10.addSuppressed((java.lang.Throwable) ladoInvalidoException17);
        ladoInvalidoException6.addSuppressed((java.lang.Throwable) ladoInvalidoException17);
        codigos.LadoInvalidoException ladoInvalidoException24 = new codigos.LadoInvalidoException("codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!");
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
        codigos.LadoInvalidoException ladoInvalidoException42 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException44 = new codigos.LadoInvalidoException("");
        ladoInvalidoException42.addSuppressed((java.lang.Throwable) ladoInvalidoException44);
        codigos.LadoInvalidoException ladoInvalidoException47 = new codigos.LadoInvalidoException("hi!");
        ladoInvalidoException44.addSuppressed((java.lang.Throwable) ladoInvalidoException47);
        codigos.LadoInvalidoException ladoInvalidoException50 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException52 = new codigos.LadoInvalidoException("");
        ladoInvalidoException50.addSuppressed((java.lang.Throwable) ladoInvalidoException52);
        codigos.LadoInvalidoException ladoInvalidoException55 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException57 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException59 = new codigos.LadoInvalidoException("");
        ladoInvalidoException57.addSuppressed((java.lang.Throwable) ladoInvalidoException59);
        ladoInvalidoException55.addSuppressed((java.lang.Throwable) ladoInvalidoException59);
        java.lang.Throwable[] throwableArray62 = ladoInvalidoException59.getSuppressed();
        ladoInvalidoException52.addSuppressed((java.lang.Throwable) ladoInvalidoException59);
        codigos.LadoInvalidoException ladoInvalidoException65 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException67 = new codigos.LadoInvalidoException("");
        ladoInvalidoException65.addSuppressed((java.lang.Throwable) ladoInvalidoException67);
        codigos.LadoInvalidoException ladoInvalidoException70 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException72 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException74 = new codigos.LadoInvalidoException("");
        ladoInvalidoException72.addSuppressed((java.lang.Throwable) ladoInvalidoException74);
        ladoInvalidoException70.addSuppressed((java.lang.Throwable) ladoInvalidoException74);
        java.lang.Throwable[] throwableArray77 = ladoInvalidoException74.getSuppressed();
        ladoInvalidoException67.addSuppressed((java.lang.Throwable) ladoInvalidoException74);
        java.lang.Throwable[] throwableArray79 = ladoInvalidoException74.getSuppressed();
        ladoInvalidoException59.addSuppressed((java.lang.Throwable) ladoInvalidoException74);
        ladoInvalidoException44.addSuppressed((java.lang.Throwable) ladoInvalidoException59);
        ladoInvalidoException35.addSuppressed((java.lang.Throwable) ladoInvalidoException44);
        ladoInvalidoException24.addSuppressed((java.lang.Throwable) ladoInvalidoException35);
        ladoInvalidoException17.addSuppressed((java.lang.Throwable) ladoInvalidoException24);
        ladoInvalidoException3.addSuppressed((java.lang.Throwable) ladoInvalidoException24);
        java.lang.Throwable[] throwableArray86 = ladoInvalidoException24.getSuppressed();
        java.lang.Throwable[] throwableArray87 = ladoInvalidoException24.getSuppressed();
        java.lang.String str88 = ladoInvalidoException24.toString();
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertNotNull(throwableArray40);
        org.junit.Assert.assertNotNull(throwableArray62);
        org.junit.Assert.assertNotNull(throwableArray77);
        org.junit.Assert.assertNotNull(throwableArray79);
        org.junit.Assert.assertNotNull(throwableArray86);
        org.junit.Assert.assertNotNull(throwableArray87);
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!" + "'", str88, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!");
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(92.0f, 67.0f);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        codigos.LadoInvalidoException ladoInvalidoException1 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException3 = new codigos.LadoInvalidoException("");
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException3);
        java.lang.Throwable[] throwableArray5 = ladoInvalidoException3.getSuppressed();
        java.lang.Throwable throwable6 = null;
        // The following exception was thrown during execution in test generation
        try {
            ladoInvalidoException3.addSuppressed(throwable6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray5);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = codigos.Triangulo.classificaTriangulo((int) (short) -1, 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type codigos.LadoInvalidoException; message: lado invalido");
        } catch (codigos.LadoInvalidoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = codigos.Triangulo.classificaTriangulo(100, 0, 10);
            org.junit.Assert.fail("Expected exception of type codigos.LadoInvalidoException; message: lado invalido");
        } catch (codigos.LadoInvalidoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) ' ', 1.0f);
        float float3 = contaCorrente2.getLimite();
        contaCorrente2.setLimite((-11.0f));
        contaCorrente2.setLimite(88.0f);
        float float9 = contaCorrente2.saque((float) (byte) 100);
        contaCorrente2.setSaldo(7.0f);
        java.lang.Class<?> wildcardClass12 = contaCorrente2.getClass();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-68.0f) + "'", float9 == (-68.0f));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        java.lang.String str3 = codigos.Triangulo.classificaTriangulo((int) (short) 10, (int) (byte) 10, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "NAO FORMA TRIANGULO" + "'", str3, "NAO FORMA TRIANGULO");
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(12.0f, 99.0f);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (short) 10, (float) ' ');
        contaCorrente2.setLimite((float) (byte) 0);
        float float5 = contaCorrente2.getSaldo();
        contaCorrente2.setSaldo((float) 1);
        float float8 = contaCorrente2.getSaldo();
        float float9 = contaCorrente2.getLimite();
        contaCorrente2.setSaldo(65.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10.0f + "'", float5 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = codigos.Triangulo.classificaTriangulo((int) '#', (int) (byte) 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type codigos.LadoInvalidoException; message: lado invalido");
        } catch (codigos.LadoInvalidoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
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
        ladoInvalidoException8.addSuppressed((java.lang.Throwable) ladoInvalidoException13);
        java.lang.Throwable[] throwableArray26 = ladoInvalidoException8.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException28 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException30 = new codigos.LadoInvalidoException("");
        ladoInvalidoException28.addSuppressed((java.lang.Throwable) ladoInvalidoException30);
        codigos.LadoInvalidoException ladoInvalidoException33 = new codigos.LadoInvalidoException("hi!");
        ladoInvalidoException30.addSuppressed((java.lang.Throwable) ladoInvalidoException33);
        ladoInvalidoException8.addSuppressed((java.lang.Throwable) ladoInvalidoException33);
        codigos.LadoInvalidoException ladoInvalidoException37 = new codigos.LadoInvalidoException("codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        ladoInvalidoException33.addSuppressed((java.lang.Throwable) ladoInvalidoException37);
        codigos.LadoInvalidoException ladoInvalidoException40 = new codigos.LadoInvalidoException("hi!");
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
        ladoInvalidoException40.addSuppressed((java.lang.Throwable) ladoInvalidoException51);
        codigos.LadoInvalidoException ladoInvalidoException58 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException60 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException62 = new codigos.LadoInvalidoException("");
        ladoInvalidoException60.addSuppressed((java.lang.Throwable) ladoInvalidoException62);
        ladoInvalidoException58.addSuppressed((java.lang.Throwable) ladoInvalidoException62);
        java.lang.Throwable[] throwableArray65 = ladoInvalidoException62.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException67 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException69 = new codigos.LadoInvalidoException("");
        ladoInvalidoException67.addSuppressed((java.lang.Throwable) ladoInvalidoException69);
        codigos.LadoInvalidoException ladoInvalidoException72 = new codigos.LadoInvalidoException("hi!");
        ladoInvalidoException69.addSuppressed((java.lang.Throwable) ladoInvalidoException72);
        ladoInvalidoException62.addSuppressed((java.lang.Throwable) ladoInvalidoException72);
        java.lang.Throwable[] throwableArray75 = ladoInvalidoException62.getSuppressed();
        ladoInvalidoException40.addSuppressed((java.lang.Throwable) ladoInvalidoException62);
        java.lang.Throwable[] throwableArray77 = ladoInvalidoException40.getSuppressed();
        java.lang.Throwable[] throwableArray78 = ladoInvalidoException40.getSuppressed();
        ladoInvalidoException33.addSuppressed((java.lang.Throwable) ladoInvalidoException40);
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException40);
        java.lang.Class<?> wildcardClass81 = ladoInvalidoException40.getClass();
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray54);
        org.junit.Assert.assertNotNull(throwableArray65);
        org.junit.Assert.assertNotNull(throwableArray75);
        org.junit.Assert.assertNotNull(throwableArray77);
        org.junit.Assert.assertNotNull(throwableArray78);
        org.junit.Assert.assertNotNull(wildcardClass81);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = codigos.Triangulo.classificaTriangulo(6, 0, 1);
            org.junit.Assert.fail("Expected exception of type codigos.LadoInvalidoException; message: lado invalido");
        } catch (codigos.LadoInvalidoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
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
        java.lang.Throwable throwable40 = null;
        // The following exception was thrown during execution in test generation
        try {
            ladoInvalidoException36.addSuppressed(throwable40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(throwableArray38);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
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
        java.lang.String str59 = ladoInvalidoException17.toString();
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(throwableArray52);
        org.junit.Assert.assertNotNull(throwableArray54);
        org.junit.Assert.assertNotNull(throwableArray56);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "codigos.LadoInvalidoException: hi!" + "'", str59, "codigos.LadoInvalidoException: hi!");
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = codigos.Triangulo.classificaTriangulo((int) '#', (int) (byte) 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type codigos.LadoInvalidoException; message: lado invalido");
        } catch (codigos.LadoInvalidoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
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
        java.lang.Throwable[] throwableArray67 = ladoInvalidoException46.getSuppressed();
        java.lang.String str68 = ladoInvalidoException46.toString();
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(throwableArray40);
        org.junit.Assert.assertNotNull(throwableArray61);
        org.junit.Assert.assertNotNull(throwableArray63);
        org.junit.Assert.assertNotNull(throwableArray66);
        org.junit.Assert.assertNotNull(throwableArray67);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "codigos.LadoInvalidoException: " + "'", str68, "codigos.LadoInvalidoException: ");
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = codigos.Triangulo.classificaTriangulo(0, 2, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type codigos.LadoInvalidoException; message: lado invalido");
        } catch (codigos.LadoInvalidoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        codigos.Words words0 = new codigos.Words();
        int int2 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int4 = words0.countWords("NAO FORMA TRIANGULO");
        int int6 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int8 = words0.countWords("NAO FORMA TRIANGULO");
        int int10 = words0.countWords("NAO FORMA TRIANGULO");
        int int12 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!");
        int int14 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        int int16 = words0.countWords("NAO FORMA TRIANGULO");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
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
        java.lang.Throwable[] throwableArray42 = ladoInvalidoException33.getSuppressed();
        java.lang.String str43 = ladoInvalidoException33.toString();
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray40);
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "codigos.LadoInvalidoException: " + "'", str43, "codigos.LadoInvalidoException: ");
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", (float) (short) -1);
        float float8 = pedido0.calculaTaxaDesconto(true, "NAO FORMA TRIANGULO", (float) (byte) 0);
        float float12 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: hi!", (float) (-1L));
        float float16 = pedido0.calculaTaxaDesconto(true, "", (float) (byte) 10);
        float float20 = pedido0.calculaTaxaDesconto(false, "ESCALENO", 88.0f);
        float float24 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!", (float) 100L);
        float float28 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ", (float) 100L);
        float float32 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ", 0.0f);
        float float36 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ", 5.0f);
        float float40 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!", (float) 6);
        float float44 = pedido0.calculaTaxaDesconto(true, "EQUILATERO", 62.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 10.0f + "'", float24 == 10.0f);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 10.0f + "'", float28 == 10.0f);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 10.0f + "'", float32 == 10.0f);
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 10.0f + "'", float36 == 10.0f);
        org.junit.Assert.assertTrue("'" + float40 + "' != '" + 0.0f + "'", float40 == 0.0f);
        org.junit.Assert.assertTrue("'" + float44 + "' != '" + 10.0f + "'", float44 == 10.0f);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 5, (-46.0f));
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(62.0f, 62.0f);
        float float3 = contaCorrente2.getSaldo();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 62.0f + "'", float3 == 62.0f);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
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
        java.lang.Throwable[] throwableArray65 = ladoInvalidoException50.getSuppressed();
        java.lang.String str66 = ladoInvalidoException50.toString();
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertNotNull(throwableArray53);
        org.junit.Assert.assertNotNull(throwableArray55);
        org.junit.Assert.assertNotNull(throwableArray62);
        org.junit.Assert.assertNotNull(throwableArray63);
        org.junit.Assert.assertNotNull(throwableArray65);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "codigos.LadoInvalidoException: " + "'", str66, "codigos.LadoInvalidoException: ");
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        java.lang.String str3 = codigos.Triangulo.classificaTriangulo(2, (int) (byte) 100, 3);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "NAO FORMA TRIANGULO" + "'", str3, "NAO FORMA TRIANGULO");
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        java.lang.String str3 = codigos.Triangulo.classificaTriangulo((int) '4', 2, 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "NAO FORMA TRIANGULO" + "'", str3, "NAO FORMA TRIANGULO");
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        java.lang.String str3 = codigos.Triangulo.classificaTriangulo(6, (int) (short) 10, 3);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "NAO FORMA TRIANGULO" + "'", str3, "NAO FORMA TRIANGULO");
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        float float3 = contaCorrente2.getLimite();
        float float4 = contaCorrente2.getSaldo();
        float float5 = contaCorrente2.getLimite();
        float float6 = contaCorrente2.getLimite();
        contaCorrente2.setSaldo((float) 0);
        float float9 = contaCorrente2.getSaldo();
        contaCorrente2.setLimite((-3.0f));
        contaCorrente2.setSaldo(9.0f);
        // The following exception was thrown during execution in test generation
        try {
            float float15 = contaCorrente2.saque((float) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Saldo Insuficiente");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-1.0f) + "'", float6 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
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
        java.lang.Throwable[] throwableArray36 = ladoInvalidoException1.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException38 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException40 = new codigos.LadoInvalidoException("");
        ladoInvalidoException38.addSuppressed((java.lang.Throwable) ladoInvalidoException40);
        codigos.LadoInvalidoException ladoInvalidoException43 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException45 = new codigos.LadoInvalidoException("");
        ladoInvalidoException43.addSuppressed((java.lang.Throwable) ladoInvalidoException45);
        codigos.LadoInvalidoException ladoInvalidoException48 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException50 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException52 = new codigos.LadoInvalidoException("");
        ladoInvalidoException50.addSuppressed((java.lang.Throwable) ladoInvalidoException52);
        ladoInvalidoException48.addSuppressed((java.lang.Throwable) ladoInvalidoException52);
        java.lang.Throwable[] throwableArray55 = ladoInvalidoException52.getSuppressed();
        ladoInvalidoException45.addSuppressed((java.lang.Throwable) ladoInvalidoException52);
        ladoInvalidoException40.addSuppressed((java.lang.Throwable) ladoInvalidoException45);
        java.lang.Throwable[] throwableArray58 = ladoInvalidoException40.getSuppressed();
        java.lang.Throwable[] throwableArray59 = ladoInvalidoException40.getSuppressed();
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException40);
        java.lang.String str61 = ladoInvalidoException40.toString();
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray55);
        org.junit.Assert.assertNotNull(throwableArray58);
        org.junit.Assert.assertNotNull(throwableArray59);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "codigos.LadoInvalidoException: " + "'", str61, "codigos.LadoInvalidoException: ");
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        codigos.LadoInvalidoException ladoInvalidoException1 = new codigos.LadoInvalidoException("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        java.lang.String str2 = ladoInvalidoException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: " + "'", str2, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", (float) (short) -1);
        float float8 = pedido0.calculaTaxaDesconto(true, "NAO FORMA TRIANGULO", (float) (byte) 0);
        float float12 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!", (float) (-1L));
        float float16 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: ", 99.0f);
        float float20 = pedido0.calculaTaxaDesconto(false, "NAO FORMA TRIANGULO", 97.0f);
        float float24 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: ", 62.0f);
        float float28 = pedido0.calculaTaxaDesconto(true, "", (-56.0f));
        float float32 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: ", 68.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10.0f + "'", float12 == 10.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.0f + "'", float24 == 0.0f);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 10.0f + "'", float28 == 10.0f);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 0.0f + "'", float32 == 0.0f);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = codigos.Triangulo.classificaTriangulo((int) (byte) 1, 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type codigos.LadoInvalidoException; message: lado invalido");
        } catch (codigos.LadoInvalidoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = codigos.Triangulo.classificaTriangulo(0, 6, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type codigos.LadoInvalidoException; message: lado invalido");
        } catch (codigos.LadoInvalidoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(9.0f, 32.0f);
        float float3 = contaCorrente2.getLimite();
        float float4 = contaCorrente2.getLimite();
        contaCorrente2.setSaldo((float) '4');
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 32.0f + "'", float3 == 32.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 32.0f + "'", float4 == 32.0f);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 6, (-88.0f));
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", 1.0f);
        float float8 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: hi!", (float) (short) 10);
        float float12 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: hi!", (float) 2);
        float float16 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: ", 32.0f);
        float float20 = pedido0.calculaTaxaDesconto(true, "NAO FORMA TRIANGULO", (float) (short) 0);
        float float24 = pedido0.calculaTaxaDesconto(true, "", 0.0f);
        float float28 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ", (-9.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 10.0f + "'", float20 == 10.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 10.0f + "'", float24 == 10.0f);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 0.0f + "'", float28 == 0.0f);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(55.0f, (float) 1);
        contaCorrente2.setLimite((float) 0L);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
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
        contaCorrente2.setLimite((-3.0f));
        // The following exception was thrown during execution in test generation
        try {
            float float23 = contaCorrente2.saque(69.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Saldo Insuficiente");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 30.0f + "'", float18 == 30.0f);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 10.0f + "'", float19 == 10.0f);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        java.lang.String str3 = codigos.Triangulo.classificaTriangulo(10, (int) (short) 100, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "NAO FORMA TRIANGULO" + "'", str3, "NAO FORMA TRIANGULO");
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((-2.0f), 4.0f);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
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
        java.lang.String str87 = ladoInvalidoException50.toString();
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
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        float float3 = contaCorrente2.getSaldo();
        contaCorrente2.setSaldo(100.0f);
        contaCorrente2.setLimite(10.0f);
        float float9 = contaCorrente2.saque((float) 1L);
        contaCorrente2.setLimite((float) (byte) 10);
        contaCorrente2.setLimite((float) (-1));
        float float14 = contaCorrente2.getLimite();
        float float15 = contaCorrente2.getLimite();
        contaCorrente2.setSaldo((-50.0f));
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 99.0f + "'", float9 == 99.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + (-1.0f) + "'", float14 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-1.0f) + "'", float15 == (-1.0f));
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = codigos.Triangulo.classificaTriangulo(0, (int) (short) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type codigos.LadoInvalidoException; message: lado invalido");
        } catch (codigos.LadoInvalidoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", 1.0f);
        float float8 = pedido0.calculaTaxaDesconto(false, "NAO FORMA TRIANGULO", 10.0f);
        float float12 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: ", (float) (-1L));
        float float16 = pedido0.calculaTaxaDesconto(false, "NAO FORMA TRIANGULO", (float) 2);
        float float20 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", (float) 2);
        float float24 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: NAO FORMA TRIANGULO", 65.0f);
        float float28 = pedido0.calculaTaxaDesconto(false, "", 62.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 10.0f + "'", float20 == 10.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.0f + "'", float24 == 0.0f);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 0.0f + "'", float28 == 0.0f);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (short) 0, 0.0f);
        float float3 = contaCorrente2.getSaldo();
        float float4 = contaCorrente2.getLimite();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
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
        java.lang.String str27 = ladoInvalidoException23.toString();
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "codigos.LadoInvalidoException: " + "'", str27, "codigos.LadoInvalidoException: ");
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", (float) (short) -1);
        float float8 = pedido0.calculaTaxaDesconto(true, "NAO FORMA TRIANGULO", (float) (byte) 0);
        float float12 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: hi!", (float) (-1L));
        float float16 = pedido0.calculaTaxaDesconto(true, "", (float) (byte) 10);
        float float20 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ", 0.0f);
        float float24 = pedido0.calculaTaxaDesconto(false, "", 31.0f);
        float float28 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: ESCALENO", 91.0f);
        java.lang.Class<?> wildcardClass29 = pedido0.getClass();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.0f + "'", float24 == 0.0f);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 0.0f + "'", float28 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((-90.0f), (float) (short) -1);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        float float3 = contaCorrente2.getLimite();
        float float4 = contaCorrente2.getSaldo();
        float float5 = contaCorrente2.getLimite();
        contaCorrente2.setSaldo((-1.0f));
        contaCorrente2.setSaldo(0.0f);
        float float10 = contaCorrente2.getLimite();
        contaCorrente2.setLimite(45.0f);
        contaCorrente2.setSaldo((float) 3);
        float float15 = contaCorrente2.getLimite();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-1.0f) + "'", float10 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 45.0f + "'", float15 == 45.0f);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        float float3 = contaCorrente2.getSaldo();
        contaCorrente2.setSaldo(100.0f);
        float float6 = contaCorrente2.getLimite();
        contaCorrente2.setSaldo((float) (byte) -1);
        float float9 = contaCorrente2.getLimite();
        contaCorrente2.setLimite(57.0f);
        float float12 = contaCorrente2.getLimite();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-1.0f) + "'", float6 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 57.0f + "'", float12 == 57.0f);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        java.lang.String str3 = codigos.Triangulo.classificaTriangulo((int) (short) 1, 5, (int) 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "NAO FORMA TRIANGULO" + "'", str3, "NAO FORMA TRIANGULO");
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        java.lang.String str3 = codigos.Triangulo.classificaTriangulo((int) (short) 10, 10, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EQUILATERO" + "'", str3, "EQUILATERO");
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (short) 10, (float) ' ');
        contaCorrente2.setLimite((float) (byte) 0);
        float float5 = contaCorrente2.getSaldo();
        contaCorrente2.setSaldo((float) 1);
        contaCorrente2.setLimite((float) (byte) 1);
        contaCorrente2.setLimite((float) 2);
        contaCorrente2.setLimite(78.0f);
        contaCorrente2.setSaldo(32.0f);
        contaCorrente2.setSaldo((-31.0f));
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10.0f + "'", float5 == 10.0f);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 10, 0.0f);
        float float3 = contaCorrente2.getSaldo();
        float float5 = contaCorrente2.saque(1.0f);
        contaCorrente2.setSaldo(100.0f);
        float float9 = contaCorrente2.saque((float) 1);
        contaCorrente2.setSaldo(5.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 9.0f + "'", float5 == 9.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 99.0f + "'", float9 == 99.0f);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        codigos.Words words0 = new codigos.Words();
        int int2 = words0.countWords("");
        int int4 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!");
        int int6 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        int int8 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int10 = words0.countWords("NAO FORMA TRIANGULO");
        int int12 = words0.countWords("EQUILATERO");
        int int14 = words0.countWords("ISOSCELES");
        int int16 = words0.countWords("codigos.LadoInvalidoException: ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(90.0f, (float) (-1));
        contaCorrente2.setLimite((float) 0);
        float float5 = contaCorrente2.getLimite();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 10, 0.0f);
        contaCorrente2.setSaldo((float) (byte) 0);
        float float5 = contaCorrente2.getSaldo();
        contaCorrente2.setSaldo((float) 0);
        contaCorrente2.setLimite((float) (byte) 10);
        contaCorrente2.setLimite((float) (byte) 0);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
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
        float float15 = contaCorrente2.getLimite();
        float float16 = contaCorrente2.getLimite();
        float float17 = contaCorrente2.getSaldo();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 10.0f + "'", float14 == 10.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10.0f + "'", float15 == 10.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 100.0f + "'", float17 == 100.0f);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(90.0f, (float) (-1));
        float float4 = contaCorrente2.saque(67.0f);
        float float5 = contaCorrente2.getSaldo();
        contaCorrente2.setLimite((float) '4');
        float float9 = contaCorrente2.saque((float) 1L);
        float float10 = contaCorrente2.getLimite();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 23.0f + "'", float4 == 23.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 23.0f + "'", float5 == 23.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 22.0f + "'", float9 == 22.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 52.0f + "'", float10 == 52.0f);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        java.lang.String str3 = codigos.Triangulo.classificaTriangulo((int) (short) 1, 3, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "NAO FORMA TRIANGULO" + "'", str3, "NAO FORMA TRIANGULO");
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
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
        java.lang.Throwable[] throwableArray77 = ladoInvalidoException19.getSuppressed();
        java.lang.String str78 = ladoInvalidoException19.toString();
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertNotNull(throwableArray52);
        org.junit.Assert.assertNotNull(throwableArray54);
        org.junit.Assert.assertNotNull(throwableArray73);
        org.junit.Assert.assertNotNull(throwableArray77);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "codigos.LadoInvalidoException: " + "'", str78, "codigos.LadoInvalidoException: ");
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", (float) (short) -1);
        float float8 = pedido0.calculaTaxaDesconto(true, "NAO FORMA TRIANGULO", (float) (byte) 0);
        float float12 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: hi!", (float) (-1L));
        float float16 = pedido0.calculaTaxaDesconto(true, "", (float) (byte) 10);
        float float20 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ", 35.0f);
        float float24 = pedido0.calculaTaxaDesconto(false, "ISOSCELES", 8.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 10.0f + "'", float20 == 10.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.0f + "'", float24 == 0.0f);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        java.lang.String str3 = codigos.Triangulo.classificaTriangulo((int) (byte) 10, 3, 4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "NAO FORMA TRIANGULO" + "'", str3, "NAO FORMA TRIANGULO");
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        codigos.Words words0 = new codigos.Words();
        int int2 = words0.countWords("");
        int int4 = words0.countWords("NAO FORMA TRIANGULO");
        int int6 = words0.countWords("codigos.LadoInvalidoException: ");
        int int8 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        int int10 = words0.countWords("NAO FORMA TRIANGULO");
        int int12 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        int int14 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        int int16 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
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
        java.lang.Throwable[] throwableArray46 = ladoInvalidoException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertNotNull(throwableArray46);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        float float3 = contaCorrente2.getLimite();
        float float4 = contaCorrente2.getSaldo();
        float float5 = contaCorrente2.getLimite();
        float float6 = contaCorrente2.getSaldo();
        contaCorrente2.setLimite((float) (byte) 10);
        contaCorrente2.setSaldo((float) 100L);
        contaCorrente2.setSaldo((float) 0L);
        contaCorrente2.setLimite(1.0f);
        java.lang.Class<?> wildcardClass15 = contaCorrente2.getClass();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(35.0f, 42.0f);
        contaCorrente2.setLimite(2.0f);
        // The following exception was thrown during execution in test generation
        try {
            float float6 = contaCorrente2.saque(69.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Saldo Insuficiente");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) '#', (float) 0L);
        float float3 = contaCorrente2.getLimite();
        contaCorrente2.setLimite(99.0f);
        contaCorrente2.setSaldo((float) (byte) 1);
        float float8 = contaCorrente2.getLimite();
        contaCorrente2.setLimite(83.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 99.0f + "'", float8 == 99.0f);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        float float3 = contaCorrente2.getLimite();
        float float4 = contaCorrente2.getLimite();
        float float5 = contaCorrente2.getSaldo();
        contaCorrente2.setLimite(98.0f);
        float float9 = contaCorrente2.saque((float) (byte) 10);
        float float10 = contaCorrente2.getSaldo();
        float float12 = contaCorrente2.saque((float) (short) 10);
        contaCorrente2.setLimite((float) 10L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.0f) + "'", float4 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 100.0f + "'", float5 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 90.0f + "'", float9 == 90.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 90.0f + "'", float10 == 90.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 80.0f + "'", float12 == 80.0f);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (short) 100, 55.0f);
        // The following exception was thrown during execution in test generation
        try {
            float float4 = contaCorrente2.saque((-68.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Valor invalido");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 'a', (float) 10);
        float float4 = contaCorrente2.saque((float) 1);
        contaCorrente2.setLimite((float) 'a');
        contaCorrente2.setLimite((-1.0f));
        java.lang.Class<?> wildcardClass9 = contaCorrente2.getClass();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 96.0f + "'", float4 == 96.0f);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (-1L), (float) (byte) -1);
        contaCorrente2.setLimite(90.0f);
        contaCorrente2.setLimite(65.0f);
        float float7 = contaCorrente2.getSaldo();
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-1.0f) + "'", float7 == (-1.0f));
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 0, (-45.0f));
        float float3 = contaCorrente2.getLimite();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-45.0f) + "'", float3 == (-45.0f));
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(65.0f, (-41.0f));
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        codigos.Words words0 = new codigos.Words();
        int int2 = words0.countWords("codigos.LadoInvalidoException: ");
        int int4 = words0.countWords("");
        int int6 = words0.countWords("ESCALENO");
        int int8 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        int int10 = words0.countWords("");
        java.lang.Class<?> wildcardClass11 = words0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (short) 1, (float) 10L);
        // The following exception was thrown during execution in test generation
        try {
            float float4 = contaCorrente2.saque((-14.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Valor invalido");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(90.0f, (float) (-1));
        contaCorrente2.setLimite((float) 0);
        contaCorrente2.setSaldo(98.0f);
        float float7 = contaCorrente2.getLimite();
        float float8 = contaCorrente2.getLimite();
        float float9 = contaCorrente2.getSaldo();
        java.lang.Class<?> wildcardClass10 = contaCorrente2.getClass();
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 98.0f + "'", float9 == 98.0f);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = codigos.Triangulo.classificaTriangulo((int) '4', 4, (-1));
            org.junit.Assert.fail("Expected exception of type codigos.LadoInvalidoException; message: lado invalido");
        } catch (codigos.LadoInvalidoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", 1.0f);
        float float8 = pedido0.calculaTaxaDesconto(false, "", (float) 1);
        float float12 = pedido0.calculaTaxaDesconto(false, "hi!", (float) (short) 100);
        float float16 = pedido0.calculaTaxaDesconto(true, "", (float) ' ');
        float float20 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: ", (-87.0f));
        float float24 = pedido0.calculaTaxaDesconto(false, "ESCALENO", (-41.0f));
        float float28 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: ", (float) (byte) 0);
        float float32 = pedido0.calculaTaxaDesconto(true, "ESCALENO", (-2.0f));
        float float36 = pedido0.calculaTaxaDesconto(false, "", (float) (-1));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.0f + "'", float24 == 0.0f);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 0.0f + "'", float28 == 0.0f);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 10.0f + "'", float32 == 10.0f);
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 0.0f + "'", float36 == 0.0f);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((-68.0f), (float) 0L);
        // The following exception was thrown during execution in test generation
        try {
            float float4 = contaCorrente2.saque(98.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Saldo Insuficiente");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(35.0f, (-59.0f));
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        java.lang.String str3 = codigos.Triangulo.classificaTriangulo((int) (byte) 100, (int) ' ', (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "NAO FORMA TRIANGULO" + "'", str3, "NAO FORMA TRIANGULO");
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        codigos.Words words0 = new codigos.Words();
        int int2 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int4 = words0.countWords("NAO FORMA TRIANGULO");
        int int6 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int8 = words0.countWords("NAO FORMA TRIANGULO");
        int int10 = words0.countWords("NAO FORMA TRIANGULO");
        int int12 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!");
        int int14 = words0.countWords("codigos.LadoInvalidoException: NAO FORMA TRIANGULO");
        int int16 = words0.countWords("hi!");
        java.lang.Class<?> wildcardClass17 = words0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        java.lang.String str3 = codigos.Triangulo.classificaTriangulo((int) (short) 10, 5, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "NAO FORMA TRIANGULO" + "'", str3, "NAO FORMA TRIANGULO");
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        codigos.Words words0 = new codigos.Words();
        int int2 = words0.countWords("");
        int int4 = words0.countWords("NAO FORMA TRIANGULO");
        int int6 = words0.countWords("codigos.LadoInvalidoException: ");
        int int8 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!");
        int int10 = words0.countWords("codigos.LadoInvalidoException: EQUILATERO");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        java.lang.String str3 = codigos.Triangulo.classificaTriangulo(3, (int) (byte) 100, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "NAO FORMA TRIANGULO" + "'", str3, "NAO FORMA TRIANGULO");
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        float float3 = contaCorrente2.getLimite();
        float float4 = contaCorrente2.getSaldo();
        float float5 = contaCorrente2.getLimite();
        float float6 = contaCorrente2.getSaldo();
        contaCorrente2.setLimite((float) (byte) 10);
        contaCorrente2.setSaldo((float) 100L);
        contaCorrente2.setSaldo(90.0f);
        float float13 = contaCorrente2.getSaldo();
        contaCorrente2.setLimite((float) (byte) 1);
        contaCorrente2.setLimite((-2.0f));
        float float18 = contaCorrente2.getSaldo();
        float float19 = contaCorrente2.getLimite();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 90.0f + "'", float13 == 90.0f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 90.0f + "'", float18 == 90.0f);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + (-2.0f) + "'", float19 == (-2.0f));
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
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
        int int20 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!");
        int int22 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "hi!", (float) 1L);
        float float8 = pedido0.calculaTaxaDesconto(true, "ESCALENO", (float) (byte) 10);
        float float12 = pedido0.calculaTaxaDesconto(false, "NAO FORMA TRIANGULO", (-32.0f));
        float float16 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!", (float) 10);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        contaCorrente2.setLimite((float) 0L);
        contaCorrente2.setLimite((float) (short) 0);
        float float8 = contaCorrente2.saque((float) 1);
        float float9 = contaCorrente2.getSaldo();
        contaCorrente2.setLimite(52.0f);
        float float12 = contaCorrente2.getSaldo();
        float float13 = contaCorrente2.getSaldo();
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 99.0f + "'", float8 == 99.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 99.0f + "'", float9 == 99.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 99.0f + "'", float12 == 99.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 99.0f + "'", float13 == 99.0f);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 10, 0.0f);
        float float3 = contaCorrente2.getSaldo();
        float float5 = contaCorrente2.saque(1.0f);
        contaCorrente2.setSaldo(100.0f);
        contaCorrente2.setLimite(2.0f);
        float float10 = contaCorrente2.getLimite();
        float float11 = contaCorrente2.getLimite();
        java.lang.Class<?> wildcardClass12 = contaCorrente2.getClass();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 9.0f + "'", float5 == 9.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 2.0f + "'", float10 == 2.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 2.0f + "'", float11 == 2.0f);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        float float3 = contaCorrente2.getSaldo();
        contaCorrente2.setSaldo(100.0f);
        float float6 = contaCorrente2.getLimite();
        contaCorrente2.setLimite(99.0f);
        // The following exception was thrown during execution in test generation
        try {
            float float10 = contaCorrente2.saque(0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Valor invalido");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-1.0f) + "'", float6 == (-1.0f));
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(97.0f, 99.0f);
        float float3 = contaCorrente2.getSaldo();
        contaCorrente2.setLimite(10.0f);
        contaCorrente2.setLimite((float) (-1L));
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 100L, (float) 10);
        float float3 = contaCorrente2.getSaldo();
        float float4 = contaCorrente2.getLimite();
        contaCorrente2.setLimite(99.0f);
        contaCorrente2.setLimite(65.0f);
        float float9 = contaCorrente2.getLimite();
        contaCorrente2.setSaldo((-29.0f));
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 65.0f + "'", float9 == 65.0f);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(97.0f, (float) ' ');
        float float4 = contaCorrente2.saque((float) 1L);
        // The following exception was thrown during execution in test generation
        try {
            float float6 = contaCorrente2.saque((-31.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Valor invalido");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 96.0f + "'", float4 == 96.0f);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
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
        java.lang.Throwable[] throwableArray42 = ladoInvalidoException38.getSuppressed();
        java.lang.Throwable[] throwableArray43 = ladoInvalidoException38.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray41);
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertNotNull(throwableArray43);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = codigos.Triangulo.classificaTriangulo(4, (int) '#', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type codigos.LadoInvalidoException; message: lado invalido");
        } catch (codigos.LadoInvalidoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", 1.0f);
        float float8 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: hi!", (float) (short) 10);
        float float12 = pedido0.calculaTaxaDesconto(false, "NAO FORMA TRIANGULO", (-48.0f));
        float float16 = pedido0.calculaTaxaDesconto(false, "ESCALENO", 52.0f);
        float float20 = pedido0.calculaTaxaDesconto(true, "NAO FORMA TRIANGULO", (-48.0f));
        float float24 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: ", 0.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 10.0f + "'", float20 == 10.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.0f + "'", float24 == 0.0f);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(44.0f, (float) (short) -1);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((-32.0f), (-87.0f));
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        codigos.Words words0 = new codigos.Words();
        int int2 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int4 = words0.countWords("NAO FORMA TRIANGULO");
        int int6 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int8 = words0.countWords("NAO FORMA TRIANGULO");
        int int10 = words0.countWords("");
        int int12 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int14 = words0.countWords("codigos.LadoInvalidoException: ");
        int int16 = words0.countWords("NAO FORMA TRIANGULO");
        int int18 = words0.countWords("hi!");
        int int20 = words0.countWords("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) ' ', 1.0f);
        float float3 = contaCorrente2.getLimite();
        contaCorrente2.setLimite((-11.0f));
        float float6 = contaCorrente2.getSaldo();
        float float7 = contaCorrente2.getSaldo();
        contaCorrente2.setSaldo((float) ' ');
        contaCorrente2.setLimite(69.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 32.0f + "'", float6 == 32.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 32.0f + "'", float7 == 32.0f);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
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
        float float17 = contaCorrente2.getLimite();
        float float18 = contaCorrente2.getSaldo();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 10.0f + "'", float17 == 10.0f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + (-1.0f) + "'", float18 == (-1.0f));
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        float float3 = contaCorrente2.getSaldo();
        contaCorrente2.setSaldo(100.0f);
        float float7 = contaCorrente2.saque((float) (byte) 10);
        contaCorrente2.setSaldo((float) 1L);
        contaCorrente2.setSaldo((float) 10L);
        // The following exception was thrown during execution in test generation
        try {
            float float13 = contaCorrente2.saque((-56.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Valor invalido");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 90.0f + "'", float7 == 90.0f);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
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
        java.lang.Throwable[] throwableArray77 = ladoInvalidoException37.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertNotNull(throwableArray58);
        org.junit.Assert.assertNotNull(throwableArray61);
        org.junit.Assert.assertNotNull(throwableArray74);
        org.junit.Assert.assertNotNull(throwableArray75);
        org.junit.Assert.assertNotNull(throwableArray77);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        codigos.Words words0 = new codigos.Words();
        int int2 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int4 = words0.countWords("NAO FORMA TRIANGULO");
        int int6 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int8 = words0.countWords("NAO FORMA TRIANGULO");
        int int10 = words0.countWords("");
        int int12 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int14 = words0.countWords("codigos.LadoInvalidoException: ");
        int int16 = words0.countWords("NAO FORMA TRIANGULO");
        int int18 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        int int20 = words0.countWords("codigos.LadoInvalidoException: ESCALENO");
        int int22 = words0.countWords("");
        java.lang.Class<?> wildcardClass23 = words0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 0, (-57.0f));
        contaCorrente2.setLimite(68.0f);
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        codigos.LadoInvalidoException ladoInvalidoException1 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException3 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException5 = new codigos.LadoInvalidoException("");
        ladoInvalidoException3.addSuppressed((java.lang.Throwable) ladoInvalidoException5);
        codigos.LadoInvalidoException ladoInvalidoException8 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException10 = new codigos.LadoInvalidoException("");
        ladoInvalidoException8.addSuppressed((java.lang.Throwable) ladoInvalidoException10);
        codigos.LadoInvalidoException ladoInvalidoException13 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException15 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException17 = new codigos.LadoInvalidoException("");
        ladoInvalidoException15.addSuppressed((java.lang.Throwable) ladoInvalidoException17);
        ladoInvalidoException13.addSuppressed((java.lang.Throwable) ladoInvalidoException17);
        java.lang.Throwable[] throwableArray20 = ladoInvalidoException17.getSuppressed();
        ladoInvalidoException10.addSuppressed((java.lang.Throwable) ladoInvalidoException17);
        ladoInvalidoException5.addSuppressed((java.lang.Throwable) ladoInvalidoException10);
        java.lang.Throwable[] throwableArray23 = ladoInvalidoException5.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException25 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException27 = new codigos.LadoInvalidoException("");
        ladoInvalidoException25.addSuppressed((java.lang.Throwable) ladoInvalidoException27);
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
        java.lang.Throwable[] throwableArray44 = ladoInvalidoException39.getSuppressed();
        ladoInvalidoException27.addSuppressed((java.lang.Throwable) ladoInvalidoException39);
        java.lang.Throwable[] throwableArray46 = ladoInvalidoException39.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException48 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException50 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException52 = new codigos.LadoInvalidoException("");
        ladoInvalidoException50.addSuppressed((java.lang.Throwable) ladoInvalidoException52);
        ladoInvalidoException48.addSuppressed((java.lang.Throwable) ladoInvalidoException52);
        java.lang.Throwable[] throwableArray55 = ladoInvalidoException52.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException57 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException59 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException61 = new codigos.LadoInvalidoException("");
        ladoInvalidoException59.addSuppressed((java.lang.Throwable) ladoInvalidoException61);
        ladoInvalidoException57.addSuppressed((java.lang.Throwable) ladoInvalidoException61);
        java.lang.Throwable[] throwableArray64 = ladoInvalidoException57.getSuppressed();
        ladoInvalidoException52.addSuppressed((java.lang.Throwable) ladoInvalidoException57);
        ladoInvalidoException39.addSuppressed((java.lang.Throwable) ladoInvalidoException52);
        ladoInvalidoException5.addSuppressed((java.lang.Throwable) ladoInvalidoException52);
        java.lang.Throwable[] throwableArray68 = ladoInvalidoException5.getSuppressed();
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException5);
        java.lang.Throwable throwable70 = null;
        // The following exception was thrown during execution in test generation
        try {
            ladoInvalidoException1.addSuppressed(throwable70);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertNotNull(throwableArray46);
        org.junit.Assert.assertNotNull(throwableArray55);
        org.junit.Assert.assertNotNull(throwableArray64);
        org.junit.Assert.assertNotNull(throwableArray68);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(35.0f, (float) (byte) 10);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(80.0f, (float) (short) 10);
        contaCorrente2.setSaldo(9.0f);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        java.lang.String str3 = codigos.Triangulo.classificaTriangulo((int) (short) 10, (int) (short) 1, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "NAO FORMA TRIANGULO" + "'", str3, "NAO FORMA TRIANGULO");
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", 1.0f);
        float float8 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: hi!", (float) (short) 10);
        float float12 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", (float) ' ');
        float float16 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!", (float) (short) -1);
        float float20 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: NAO FORMA TRIANGULO", 4.0f);
        java.lang.Class<?> wildcardClass21 = pedido0.getClass();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10.0f + "'", float12 == 10.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", (float) (-1L));
        float float8 = pedido0.calculaTaxaDesconto(true, "hi!", 90.0f);
        float float12 = pedido0.calculaTaxaDesconto(true, "", 13.0f);
        float float16 = pedido0.calculaTaxaDesconto(false, "ESCALENO", (-86.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10.0f + "'", float12 == 10.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(69.0f, 60.0f);
        contaCorrente2.setLimite(67.0f);
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(90.0f, (-52.0f));
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        codigos.Words words0 = new codigos.Words();
        int int2 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int4 = words0.countWords("NAO FORMA TRIANGULO");
        int int6 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int8 = words0.countWords("NAO FORMA TRIANGULO");
        int int10 = words0.countWords("");
        int int12 = words0.countWords("ESCALENO");
        int int14 = words0.countWords("NAO FORMA TRIANGULO");
        int int16 = words0.countWords("codigos.LadoInvalidoException: ESCALENO");
        int int18 = words0.countWords("ESCALENO");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
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
        java.lang.Throwable[] throwableArray39 = ladoInvalidoException34.getSuppressed();
        ladoInvalidoException19.addSuppressed((java.lang.Throwable) ladoInvalidoException34);
        codigos.LadoInvalidoException ladoInvalidoException42 = new codigos.LadoInvalidoException("codigos.LadoInvalidoException: hi!");
        ladoInvalidoException34.addSuppressed((java.lang.Throwable) ladoInvalidoException42);
        java.lang.Throwable[] throwableArray44 = ladoInvalidoException42.getSuppressed();
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException42);
        java.lang.Class<?> wildcardClass46 = ladoInvalidoException1.getClass();
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(9.0f, 32.0f);
        float float3 = contaCorrente2.getLimite();
        float float5 = contaCorrente2.saque(23.0f);
        float float6 = contaCorrente2.getLimite();
        contaCorrente2.setLimite((float) (short) 100);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 32.0f + "'", float3 == 32.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-14.0f) + "'", float5 == (-14.0f));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 32.0f + "'", float6 == 32.0f);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
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
        codigos.LadoInvalidoException ladoInvalidoException39 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException41 = new codigos.LadoInvalidoException("");
        ladoInvalidoException39.addSuppressed((java.lang.Throwable) ladoInvalidoException41);
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
        ladoInvalidoException41.addSuppressed((java.lang.Throwable) ladoInvalidoException46);
        java.lang.Throwable[] throwableArray59 = ladoInvalidoException41.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException61 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException63 = new codigos.LadoInvalidoException("");
        ladoInvalidoException61.addSuppressed((java.lang.Throwable) ladoInvalidoException63);
        codigos.LadoInvalidoException ladoInvalidoException66 = new codigos.LadoInvalidoException("hi!");
        ladoInvalidoException63.addSuppressed((java.lang.Throwable) ladoInvalidoException66);
        ladoInvalidoException41.addSuppressed((java.lang.Throwable) ladoInvalidoException66);
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException41);
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
        java.lang.Throwable[] throwableArray85 = ladoInvalidoException73.getSuppressed();
        java.lang.Throwable[] throwableArray86 = ladoInvalidoException73.getSuppressed();
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException73);
        java.lang.Throwable[] throwableArray88 = ladoInvalidoException1.getSuppressed();
        java.lang.Throwable[] throwableArray89 = ladoInvalidoException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray56);
        org.junit.Assert.assertNotNull(throwableArray59);
        org.junit.Assert.assertNotNull(throwableArray83);
        org.junit.Assert.assertNotNull(throwableArray85);
        org.junit.Assert.assertNotNull(throwableArray86);
        org.junit.Assert.assertNotNull(throwableArray88);
        org.junit.Assert.assertNotNull(throwableArray89);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (short) 0, 0.0f);
        contaCorrente2.setSaldo((float) 0L);
        contaCorrente2.setSaldo(99.0f);
        float float7 = contaCorrente2.getSaldo();
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 99.0f + "'", float7 == 99.0f);
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = codigos.Triangulo.classificaTriangulo(0, (int) (byte) 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type codigos.LadoInvalidoException; message: lado invalido");
        } catch (codigos.LadoInvalidoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
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
        codigos.LadoInvalidoException ladoInvalidoException85 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException87 = new codigos.LadoInvalidoException("");
        ladoInvalidoException85.addSuppressed((java.lang.Throwable) ladoInvalidoException87);
        codigos.LadoInvalidoException ladoInvalidoException90 = new codigos.LadoInvalidoException("hi!");
        ladoInvalidoException87.addSuppressed((java.lang.Throwable) ladoInvalidoException90);
        ladoInvalidoException42.addSuppressed((java.lang.Throwable) ladoInvalidoException90);
        ladoInvalidoException25.addSuppressed((java.lang.Throwable) ladoInvalidoException42);
        java.lang.String str94 = ladoInvalidoException25.toString();
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray45);
        org.junit.Assert.assertNotNull(throwableArray60);
        org.junit.Assert.assertNotNull(throwableArray62);
        org.junit.Assert.assertNotNull(throwableArray72);
        org.junit.Assert.assertNotNull(throwableArray82);
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "codigos.LadoInvalidoException: " + "'", str94, "codigos.LadoInvalidoException: ");
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        codigos.Words words0 = new codigos.Words();
        int int2 = words0.countWords("ESCALENO");
        int int4 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        int int6 = words0.countWords("codigos.LadoInvalidoException: ESCALENO");
        java.lang.Class<?> wildcardClass7 = words0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        java.lang.String str3 = codigos.Triangulo.classificaTriangulo((int) ' ', (int) (short) 100, (int) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "NAO FORMA TRIANGULO" + "'", str3, "NAO FORMA TRIANGULO");
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", 1.0f);
        float float8 = pedido0.calculaTaxaDesconto(false, "", (float) 1);
        float float12 = pedido0.calculaTaxaDesconto(false, "hi!", (float) (short) 100);
        float float16 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: hi!", (float) '#');
        float float20 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: ESCALENO", (float) 3);
        float float24 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: EQUILATERO", 12.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.0f + "'", float24 == 0.0f);
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
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
        java.lang.Throwable[] throwableArray58 = ladoInvalidoException19.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException60 = new codigos.LadoInvalidoException("hi!");
        java.lang.Throwable[] throwableArray61 = ladoInvalidoException60.getSuppressed();
        ladoInvalidoException19.addSuppressed((java.lang.Throwable) ladoInvalidoException60);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertNotNull(throwableArray52);
        org.junit.Assert.assertNotNull(throwableArray54);
        org.junit.Assert.assertNotNull(throwableArray58);
        org.junit.Assert.assertNotNull(throwableArray61);
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
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
        java.lang.Throwable[] throwableArray74 = ladoInvalidoException65.getSuppressed();
        java.lang.String str75 = ladoInvalidoException65.toString();
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertNotNull(throwableArray53);
        org.junit.Assert.assertNotNull(throwableArray68);
        org.junit.Assert.assertNotNull(throwableArray70);
        org.junit.Assert.assertNotNull(throwableArray74);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "codigos.LadoInvalidoException: " + "'", str75, "codigos.LadoInvalidoException: ");
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", (float) (short) -1);
        float float8 = pedido0.calculaTaxaDesconto(true, "NAO FORMA TRIANGULO", (float) (byte) 0);
        float float12 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!", (float) (-1L));
        float float16 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: ", 99.0f);
        float float20 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: ", 3.0f);
        float float24 = pedido0.calculaTaxaDesconto(false, "ESCALENO", 42.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10.0f + "'", float12 == 10.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.0f + "'", float24 == 0.0f);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(90.0f, (float) (-1));
        contaCorrente2.setLimite((float) 0);
        contaCorrente2.setSaldo((float) 'a');
        contaCorrente2.setLimite(0.0f);
        float float10 = contaCorrente2.saque(55.0f);
        float float11 = contaCorrente2.getLimite();
        contaCorrente2.setSaldo((float) 10L);
        // The following exception was thrown during execution in test generation
        try {
            float float15 = contaCorrente2.saque(67.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Saldo Insuficiente");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 42.0f + "'", float10 == 42.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(1.0f, (float) 1L);
        // The following exception was thrown during execution in test generation
        try {
            float float4 = contaCorrente2.saque(99.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Saldo Insuficiente");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(87.0f, (float) 3);
        float float3 = contaCorrente2.getLimite();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 3.0f + "'", float3 == 3.0f);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        java.lang.String str3 = codigos.Triangulo.classificaTriangulo((int) (byte) 100, (int) (byte) 10, 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ISOSCELES" + "'", str3, "ISOSCELES");
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        float float3 = contaCorrente2.getLimite();
        float float4 = contaCorrente2.getLimite();
        contaCorrente2.setSaldo((float) (short) 1);
        contaCorrente2.setLimite(1.0f);
        float float9 = contaCorrente2.getLimite();
        float float10 = contaCorrente2.getSaldo();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.0f) + "'", float4 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.0f + "'", float10 == 1.0f);
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(99.0f, (float) 'a');
        float float3 = contaCorrente2.getLimite();
        contaCorrente2.setSaldo((-10.0f));
        float float7 = contaCorrente2.saque((float) (short) 1);
        float float8 = contaCorrente2.getLimite();
        float float9 = contaCorrente2.getLimite();
        java.lang.Class<?> wildcardClass10 = contaCorrente2.getClass();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-11.0f) + "'", float7 == (-11.0f));
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 97.0f + "'", float8 == 97.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 97.0f + "'", float9 == 97.0f);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) '#', 100.0f);
        contaCorrente2.setSaldo((-68.0f));
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", 1.0f);
        float float8 = pedido0.calculaTaxaDesconto(false, "", (float) 1);
        float float12 = pedido0.calculaTaxaDesconto(false, "hi!", (float) (short) 100);
        float float16 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!", 97.0f);
        float float20 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: hi!", 2.0f);
        float float24 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: EQUILATERO", (float) '4');
        float float28 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!", (float) (-1));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 10.0f + "'", float24 == 10.0f);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 0.0f + "'", float28 == 0.0f);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        float float3 = contaCorrente2.getLimite();
        float float4 = contaCorrente2.getSaldo();
        float float5 = contaCorrente2.getLimite();
        float float6 = contaCorrente2.getSaldo();
        contaCorrente2.setLimite((float) (byte) 10);
        contaCorrente2.setSaldo((float) 100L);
        float float11 = contaCorrente2.getLimite();
        float float12 = contaCorrente2.getSaldo();
        float float14 = contaCorrente2.saque(97.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 100.0f + "'", float12 == 100.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 3.0f + "'", float14 == 3.0f);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 10, 0.0f);
        contaCorrente2.setSaldo((float) (byte) 0);
        float float5 = contaCorrente2.getSaldo();
        contaCorrente2.setLimite((float) (byte) 1);
        contaCorrente2.setSaldo((float) (-1));
        contaCorrente2.setSaldo(67.0f);
        // The following exception was thrown during execution in test generation
        try {
            float float13 = contaCorrente2.saque((-57.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Valor invalido");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        float float3 = contaCorrente2.getLimite();
        float float4 = contaCorrente2.getSaldo();
        float float5 = contaCorrente2.getLimite();
        contaCorrente2.setSaldo((-1.0f));
        float float8 = contaCorrente2.getSaldo();
        float float9 = contaCorrente2.getLimite();
        contaCorrente2.setSaldo(91.0f);
        // The following exception was thrown during execution in test generation
        try {
            float float13 = contaCorrente2.saque((-10.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Valor invalido");
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
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = codigos.Triangulo.classificaTriangulo(4, (int) (byte) 0, 0);
            org.junit.Assert.fail("Expected exception of type codigos.LadoInvalidoException; message: lado invalido");
        } catch (codigos.LadoInvalidoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        codigos.LadoInvalidoException ladoInvalidoException1 = new codigos.LadoInvalidoException("NAO FORMA TRIANGULO");
        java.lang.Throwable[] throwableArray2 = ladoInvalidoException1.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException4 = new codigos.LadoInvalidoException("codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!");
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
        codigos.LadoInvalidoException ladoInvalidoException22 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException24 = new codigos.LadoInvalidoException("");
        ladoInvalidoException22.addSuppressed((java.lang.Throwable) ladoInvalidoException24);
        codigos.LadoInvalidoException ladoInvalidoException27 = new codigos.LadoInvalidoException("hi!");
        ladoInvalidoException24.addSuppressed((java.lang.Throwable) ladoInvalidoException27);
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
        ladoInvalidoException24.addSuppressed((java.lang.Throwable) ladoInvalidoException39);
        ladoInvalidoException15.addSuppressed((java.lang.Throwable) ladoInvalidoException24);
        ladoInvalidoException4.addSuppressed((java.lang.Throwable) ladoInvalidoException15);
        java.lang.Throwable[] throwableArray64 = ladoInvalidoException15.getSuppressed();
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException15);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertNotNull(throwableArray57);
        org.junit.Assert.assertNotNull(throwableArray59);
        org.junit.Assert.assertNotNull(throwableArray64);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        float float3 = contaCorrente2.getLimite();
        float float4 = contaCorrente2.getSaldo();
        float float5 = contaCorrente2.getLimite();
        contaCorrente2.setSaldo((-1.0f));
        float float8 = contaCorrente2.getSaldo();
        // The following exception was thrown during execution in test generation
        try {
            float float10 = contaCorrente2.saque((float) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Saldo Insuficiente");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-1.0f) + "'", float8 == (-1.0f));
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = codigos.Triangulo.classificaTriangulo((int) (byte) 100, (int) (short) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type codigos.LadoInvalidoException; message: lado invalido");
        } catch (codigos.LadoInvalidoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = codigos.Triangulo.classificaTriangulo(3, (-1), 3);
            org.junit.Assert.fail("Expected exception of type codigos.LadoInvalidoException; message: lado invalido");
        } catch (codigos.LadoInvalidoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = codigos.Triangulo.classificaTriangulo((int) (byte) -1, (int) (byte) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type codigos.LadoInvalidoException; message: lado invalido");
        } catch (codigos.LadoInvalidoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        float float3 = contaCorrente2.getLimite();
        float float4 = contaCorrente2.getSaldo();
        float float5 = contaCorrente2.getLimite();
        contaCorrente2.setSaldo((-1.0f));
        float float8 = contaCorrente2.getSaldo();
        // The following exception was thrown during execution in test generation
        try {
            float float10 = contaCorrente2.saque((float) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Saldo Insuficiente");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-1.0f) + "'", float8 == (-1.0f));
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", 1.0f);
        float float8 = pedido0.calculaTaxaDesconto(false, "", (float) 1);
        float float12 = pedido0.calculaTaxaDesconto(false, "hi!", (float) (short) 100);
        float float16 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!", 97.0f);
        float float20 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: hi!", 2.0f);
        float float24 = pedido0.calculaTaxaDesconto(true, "", 67.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 10.0f + "'", float24 == 10.0f);
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(32.0f, (float) (byte) 0);
        contaCorrente2.setSaldo(10.0f);
        contaCorrente2.setLimite(9.0f);
        float float7 = contaCorrente2.getSaldo();
        contaCorrente2.setLimite(10.0f);
        contaCorrente2.setSaldo(2.0f);
        float float12 = contaCorrente2.getLimite();
        // The following exception was thrown during execution in test generation
        try {
            float float14 = contaCorrente2.saque((-45.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Valor invalido");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10.0f + "'", float12 == 10.0f);
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        float float3 = contaCorrente2.getLimite();
        float float4 = contaCorrente2.getLimite();
        float float5 = contaCorrente2.getSaldo();
        contaCorrente2.setLimite(98.0f);
        float float9 = contaCorrente2.saque(88.0f);
        contaCorrente2.setSaldo(55.0f);
        float float12 = contaCorrente2.getSaldo();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.0f) + "'", float4 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 100.0f + "'", float5 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 12.0f + "'", float9 == 12.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 55.0f + "'", float12 == 55.0f);
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
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
        java.lang.Throwable[] throwableArray18 = ladoInvalidoException15.getSuppressed();
        java.lang.String str19 = ladoInvalidoException15.toString();
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "codigos.LadoInvalidoException: hi!" + "'", str19, "codigos.LadoInvalidoException: hi!");
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 10, 0.0f);
        float float3 = contaCorrente2.getSaldo();
        float float5 = contaCorrente2.saque(1.0f);
        contaCorrente2.setLimite(10.0f);
        contaCorrente2.setSaldo((-10.0f));
        contaCorrente2.setLimite(13.0f);
        // The following exception was thrown during execution in test generation
        try {
            float float13 = contaCorrente2.saque((float) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Valor invalido");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 9.0f + "'", float5 == 9.0f);
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
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
        // The following exception was thrown during execution in test generation
        try {
            float float16 = contaCorrente2.saque((-3.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Valor invalido");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 100.0f + "'", float13 == 100.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 10.0f + "'", float14 == 10.0f);
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(90.0f, (float) 1L);
        contaCorrente2.setSaldo((float) (short) -1);
        contaCorrente2.setSaldo(96.0f);
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((-14.0f), 0.0f);
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
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
        java.lang.String str75 = ladoInvalidoException5.toString();
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertNotNull(throwableArray53);
        org.junit.Assert.assertNotNull(throwableArray68);
        org.junit.Assert.assertNotNull(throwableArray70);
        org.junit.Assert.assertNotNull(throwableArray74);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "codigos.LadoInvalidoException: " + "'", str75, "codigos.LadoInvalidoException: ");
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(32.0f, (float) (byte) 0);
        contaCorrente2.setSaldo(10.0f);
        contaCorrente2.setLimite(9.0f);
        contaCorrente2.setLimite((float) ' ');
        float float10 = contaCorrente2.saque((float) 3);
        float float12 = contaCorrente2.saque(2.0f);
        float float13 = contaCorrente2.getLimite();
        float float15 = contaCorrente2.saque((float) '#');
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 7.0f + "'", float10 == 7.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 5.0f + "'", float12 == 5.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 32.0f + "'", float13 == 32.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-30.0f) + "'", float15 == (-30.0f));
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        codigos.Words words0 = new codigos.Words();
        int int2 = words0.countWords("codigos.LadoInvalidoException: ");
        int int4 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!");
        int int6 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!");
        int int8 = words0.countWords("");
        int int10 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int12 = words0.countWords("NAO FORMA TRIANGULO");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(13.0f, 96.0f);
        contaCorrente2.setLimite(55.0f);
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        codigos.Words words0 = new codigos.Words();
        int int2 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int4 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!");
        int int6 = words0.countWords("hi!");
        int int8 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        int int10 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: NAO FORMA TRIANGULO");
        java.lang.Class<?> wildcardClass11 = words0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((-45.0f), 98.0f);
        contaCorrente2.setLimite(57.0f);
        // The following exception was thrown during execution in test generation
        try {
            float float6 = contaCorrente2.saque((float) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Saldo Insuficiente");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((-45.0f), (float) (short) 0);
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        java.lang.String str3 = codigos.Triangulo.classificaTriangulo(2, 3, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "NAO FORMA TRIANGULO" + "'", str3, "NAO FORMA TRIANGULO");
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "hi!", (float) 1L);
        float float8 = pedido0.calculaTaxaDesconto(false, "hi!", 2.0f);
        float float12 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: hi!", 97.0f);
        float float16 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: ESCALENO", 0.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10.0f + "'", float12 == 10.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", 1.0f);
        float float8 = pedido0.calculaTaxaDesconto(false, "", (float) 1);
        float float12 = pedido0.calculaTaxaDesconto(false, "hi!", (float) (short) 100);
        float float16 = pedido0.calculaTaxaDesconto(true, "hi!", 67.0f);
        float float20 = pedido0.calculaTaxaDesconto(false, "", 98.0f);
        float float24 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!", (float) (short) 100);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.0f + "'", float24 == 0.0f);
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(99.0f, (float) 'a');
        float float3 = contaCorrente2.getLimite();
        contaCorrente2.setSaldo((float) '4');
        contaCorrente2.setLimite((float) 100L);
        float float9 = contaCorrente2.saque((float) 'a');
        contaCorrente2.setLimite(55.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-45.0f) + "'", float9 == (-45.0f));
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = codigos.Triangulo.classificaTriangulo((int) (byte) 1, 6, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type codigos.LadoInvalidoException; message: lado invalido");
        } catch (codigos.LadoInvalidoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((-57.0f), 44.0f);
        contaCorrente2.setLimite(0.0f);
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (short) 100, 99.0f);
        float float3 = contaCorrente2.getLimite();
        float float4 = contaCorrente2.getLimite();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 99.0f + "'", float3 == 99.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 99.0f + "'", float4 == 99.0f);
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(100.0f, (float) 1L);
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(80.0f, 92.0f);
        java.lang.Class<?> wildcardClass3 = contaCorrente2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(89.0f, (float) 3);
        contaCorrente2.setLimite(10.0f);
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        float float3 = contaCorrente2.getLimite();
        float float4 = contaCorrente2.getLimite();
        contaCorrente2.setSaldo((float) (short) 1);
        contaCorrente2.setLimite(1.0f);
        float float9 = contaCorrente2.getLimite();
        contaCorrente2.setLimite(22.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.0f) + "'", float4 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (short) 1, 100.0f);
        float float4 = contaCorrente2.saque(58.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-57.0f) + "'", float4 == (-57.0f));
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        float float3 = contaCorrente2.getLimite();
        float float4 = contaCorrente2.getSaldo();
        float float5 = contaCorrente2.getLimite();
        float float6 = contaCorrente2.getSaldo();
        contaCorrente2.setLimite((float) (byte) 10);
        contaCorrente2.setSaldo((float) 100L);
        contaCorrente2.setSaldo((float) (byte) 10);
        contaCorrente2.setLimite((float) (byte) 100);
        contaCorrente2.setSaldo((float) '#');
        contaCorrente2.setSaldo((float) (byte) 0);
        contaCorrente2.setSaldo(90.0f);
        contaCorrente2.setLimite(23.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((-29.0f), (float) 4);
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
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
        codigos.LadoInvalidoException ladoInvalidoException51 = new codigos.LadoInvalidoException("codigos.LadoInvalidoException: hi!");
        codigos.LadoInvalidoException ladoInvalidoException53 = new codigos.LadoInvalidoException("hi!");
        ladoInvalidoException51.addSuppressed((java.lang.Throwable) ladoInvalidoException53);
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
        ladoInvalidoException65.addSuppressed((java.lang.Throwable) ladoInvalidoException80);
        codigos.LadoInvalidoException ladoInvalidoException88 = new codigos.LadoInvalidoException("codigos.LadoInvalidoException: hi!");
        ladoInvalidoException80.addSuppressed((java.lang.Throwable) ladoInvalidoException88);
        ladoInvalidoException53.addSuppressed((java.lang.Throwable) ladoInvalidoException88);
        java.lang.Throwable[] throwableArray91 = ladoInvalidoException88.getSuppressed();
        ladoInvalidoException43.addSuppressed((java.lang.Throwable) ladoInvalidoException88);
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException88);
        java.lang.Throwable[] throwableArray94 = ladoInvalidoException1.getSuppressed();
        java.lang.Throwable[] throwableArray95 = ladoInvalidoException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(throwableArray46);
        org.junit.Assert.assertNotNull(throwableArray48);
        org.junit.Assert.assertNotNull(throwableArray68);
        org.junit.Assert.assertNotNull(throwableArray83);
        org.junit.Assert.assertNotNull(throwableArray85);
        org.junit.Assert.assertNotNull(throwableArray91);
        org.junit.Assert.assertNotNull(throwableArray94);
        org.junit.Assert.assertNotNull(throwableArray95);
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 10, 0.0f);
        contaCorrente2.setSaldo((float) (byte) 0);
        float float5 = contaCorrente2.getSaldo();
        contaCorrente2.setSaldo((float) 0);
        contaCorrente2.setSaldo((float) 0L);
        contaCorrente2.setLimite((float) 2);
        java.lang.Class<?> wildcardClass12 = contaCorrente2.getClass();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
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
        java.lang.Class<?> wildcardClass79 = ladoInvalidoException33.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass79);
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(88.0f, 65.0f);
        float float3 = contaCorrente2.getLimite();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 65.0f + "'", float3 == 65.0f);
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(3.0f, 32.0f);
        // The following exception was thrown during execution in test generation
        try {
            float float4 = contaCorrente2.saque((float) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Valor invalido");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
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
        ladoInvalidoException3.addSuppressed((java.lang.Throwable) ladoInvalidoException18);
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
        ladoInvalidoException3.addSuppressed((java.lang.Throwable) ladoInvalidoException51);
        java.lang.String str57 = ladoInvalidoException3.toString();
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertNotNull(throwableArray54);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "codigos.LadoInvalidoException: " + "'", str57, "codigos.LadoInvalidoException: ");
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 10, 66.0f);
        float float3 = contaCorrente2.getLimite();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 66.0f + "'", float3 == 66.0f);
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((-90.0f), 67.0f);
        float float3 = contaCorrente2.getLimite();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 67.0f + "'", float3 == 67.0f);
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = codigos.Triangulo.classificaTriangulo((-1), 6, 0);
            org.junit.Assert.fail("Expected exception of type codigos.LadoInvalidoException; message: lado invalido");
        } catch (codigos.LadoInvalidoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(62.0f, (-68.0f));
        // The following exception was thrown during execution in test generation
        try {
            float float4 = contaCorrente2.saque((float) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Saldo Insuficiente");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(90.0f, (float) (-1));
        float float4 = contaCorrente2.saque(67.0f);
        float float5 = contaCorrente2.getSaldo();
        contaCorrente2.setLimite((float) '4');
        float float8 = contaCorrente2.getLimite();
        float float9 = contaCorrente2.getLimite();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 23.0f + "'", float4 == 23.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 23.0f + "'", float5 == 23.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 52.0f + "'", float8 == 52.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 52.0f + "'", float9 == 52.0f);
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
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
        java.lang.Throwable[] throwableArray58 = ladoInvalidoException10.getSuppressed();
        java.lang.Throwable[] throwableArray59 = ladoInvalidoException10.getSuppressed();
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
        java.lang.Throwable[] throwableArray75 = ladoInvalidoException63.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException77 = new codigos.LadoInvalidoException("codigos.LadoInvalidoException: ");
        ladoInvalidoException63.addSuppressed((java.lang.Throwable) ladoInvalidoException77);
        ladoInvalidoException10.addSuppressed((java.lang.Throwable) ladoInvalidoException77);
        java.lang.String str80 = ladoInvalidoException10.toString();
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertNotNull(throwableArray52);
        org.junit.Assert.assertNotNull(throwableArray54);
        org.junit.Assert.assertNotNull(throwableArray58);
        org.junit.Assert.assertNotNull(throwableArray59);
        org.junit.Assert.assertNotNull(throwableArray73);
        org.junit.Assert.assertNotNull(throwableArray75);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "codigos.LadoInvalidoException: " + "'", str80, "codigos.LadoInvalidoException: ");
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = codigos.Triangulo.classificaTriangulo((int) (short) -1, (-1), (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type codigos.LadoInvalidoException; message: lado invalido");
        } catch (codigos.LadoInvalidoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
        codigos.Words words0 = new codigos.Words();
        int int2 = words0.countWords("");
        int int4 = words0.countWords("NAO FORMA TRIANGULO");
        int int6 = words0.countWords("codigos.LadoInvalidoException: ");
        int int8 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!");
        java.lang.Class<?> wildcardClass9 = words0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 1L, (float) (short) 100);
        contaCorrente2.setLimite(99.0f);
        float float5 = contaCorrente2.getLimite();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 99.0f + "'", float5 == 99.0f);
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", 1.0f);
        float float8 = pedido0.calculaTaxaDesconto(false, "", (float) 1);
        float float12 = pedido0.calculaTaxaDesconto(true, "hi!", (float) (short) -1);
        float float16 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!", (-45.0f));
        float float20 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: NAO FORMA TRIANGULO", (float) 4);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10.0f + "'", float12 == 10.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 10.0f + "'", float20 == 10.0f);
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(52.0f, 88.0f);
        float float3 = contaCorrente2.getSaldo();
        // The following exception was thrown during execution in test generation
        try {
            float float5 = contaCorrente2.saque((-29.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Valor invalido");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 52.0f + "'", float3 == 52.0f);
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(90.0f, (float) (-1));
        float float3 = contaCorrente2.getLimite();
        float float4 = contaCorrente2.getLimite();
        contaCorrente2.setSaldo((float) 3);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.0f) + "'", float4 == (-1.0f));
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (short) 10, (float) ' ');
        float float3 = contaCorrente2.getLimite();
        contaCorrente2.setLimite((float) (-1));
        contaCorrente2.setSaldo((float) '#');
        // The following exception was thrown during execution in test generation
        try {
            float float9 = contaCorrente2.saque(58.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Saldo Insuficiente");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 32.0f + "'", float3 == 32.0f);
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
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
        java.lang.Throwable[] throwableArray25 = ladoInvalidoException15.getSuppressed();
        java.lang.String str26 = ladoInvalidoException15.toString();
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "codigos.LadoInvalidoException: " + "'", str26, "codigos.LadoInvalidoException: ");
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(0.0f, 0.0f);
        float float3 = contaCorrente2.getLimite();
        float float4 = contaCorrente2.getSaldo();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        float float3 = contaCorrente2.getLimite();
        float float4 = contaCorrente2.getSaldo();
        float float5 = contaCorrente2.getLimite();
        float float6 = contaCorrente2.getSaldo();
        contaCorrente2.setLimite((float) (byte) 10);
        contaCorrente2.setSaldo((float) 100L);
        contaCorrente2.setSaldo((float) (byte) 10);
        contaCorrente2.setLimite((float) (byte) 100);
        contaCorrente2.setSaldo((float) '#');
        float float17 = contaCorrente2.getLimite();
        contaCorrente2.setSaldo((-41.0f));
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 100.0f + "'", float17 == 100.0f);
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
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
        codigos.LadoInvalidoException ladoInvalidoException19 = new codigos.LadoInvalidoException("codigos.LadoInvalidoException: hi!");
        codigos.LadoInvalidoException ladoInvalidoException21 = new codigos.LadoInvalidoException("hi!");
        ladoInvalidoException19.addSuppressed((java.lang.Throwable) ladoInvalidoException21);
        java.lang.Throwable[] throwableArray23 = ladoInvalidoException21.getSuppressed();
        ladoInvalidoException5.addSuppressed((java.lang.Throwable) ladoInvalidoException21);
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
        ladoInvalidoException73.addSuppressed((java.lang.Throwable) ladoInvalidoException75);
        codigos.LadoInvalidoException ladoInvalidoException78 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException80 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException82 = new codigos.LadoInvalidoException("");
        ladoInvalidoException80.addSuppressed((java.lang.Throwable) ladoInvalidoException82);
        ladoInvalidoException78.addSuppressed((java.lang.Throwable) ladoInvalidoException82);
        java.lang.Throwable[] throwableArray85 = ladoInvalidoException82.getSuppressed();
        ladoInvalidoException75.addSuppressed((java.lang.Throwable) ladoInvalidoException82);
        java.lang.Throwable[] throwableArray87 = ladoInvalidoException82.getSuppressed();
        ladoInvalidoException64.addSuppressed((java.lang.Throwable) ladoInvalidoException82);
        ladoInvalidoException40.addSuppressed((java.lang.Throwable) ladoInvalidoException82);
        ladoInvalidoException5.addSuppressed((java.lang.Throwable) ladoInvalidoException40);
        java.lang.String str91 = ladoInvalidoException40.toString();
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertNotNull(throwableArray45);
        org.junit.Assert.assertNotNull(throwableArray47);
        org.junit.Assert.assertNotNull(throwableArray48);
        org.junit.Assert.assertNotNull(throwableArray67);
        org.junit.Assert.assertNotNull(throwableArray69);
        org.junit.Assert.assertNotNull(throwableArray71);
        org.junit.Assert.assertNotNull(throwableArray85);
        org.junit.Assert.assertNotNull(throwableArray87);
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "codigos.LadoInvalidoException: " + "'", str91, "codigos.LadoInvalidoException: ");
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", 1.0f);
        float float8 = pedido0.calculaTaxaDesconto(false, "", (float) 1);
        float float12 = pedido0.calculaTaxaDesconto(false, "hi!", (float) (short) 100);
        float float16 = pedido0.calculaTaxaDesconto(true, "", (float) ' ');
        float float20 = pedido0.calculaTaxaDesconto(false, "", (float) 0L);
        float float24 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!", 99.0f);
        float float28 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ", 10.0f);
        float float32 = pedido0.calculaTaxaDesconto(true, "", (-57.0f));
        float float36 = pedido0.calculaTaxaDesconto(true, "EQUILATERO", 73.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.0f + "'", float24 == 0.0f);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 0.0f + "'", float28 == 0.0f);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 10.0f + "'", float32 == 10.0f);
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 10.0f + "'", float36 == 10.0f);
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        float float3 = contaCorrente2.getSaldo();
        contaCorrente2.setSaldo(100.0f);
        float float7 = contaCorrente2.saque((float) (byte) 10);
        float float8 = contaCorrente2.getSaldo();
        float float9 = contaCorrente2.getSaldo();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 90.0f + "'", float7 == 90.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 90.0f + "'", float8 == 90.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 90.0f + "'", float9 == 90.0f);
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 0L, 1.0f);
        contaCorrente2.setLimite(0.0f);
        float float5 = contaCorrente2.getSaldo();
        float float6 = contaCorrente2.getSaldo();
        contaCorrente2.setSaldo((-29.0f));
        java.lang.Class<?> wildcardClass9 = contaCorrente2.getClass();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = codigos.Triangulo.classificaTriangulo((-1), 4, 1);
            org.junit.Assert.fail("Expected exception of type codigos.LadoInvalidoException; message: lado invalido");
        } catch (codigos.LadoInvalidoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
        codigos.Words words0 = new codigos.Words();
        int int2 = words0.countWords("");
        int int4 = words0.countWords("");
        int int6 = words0.countWords("codigos.LadoInvalidoException: ");
        int int8 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!");
        int int10 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int12 = words0.countWords("codigos.LadoInvalidoException: ");
        int int14 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        int int16 = words0.countWords("NAO FORMA TRIANGULO");
        int int18 = words0.countWords("ESCALENO");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", (float) (short) -1);
        float float8 = pedido0.calculaTaxaDesconto(true, "NAO FORMA TRIANGULO", (float) (byte) 0);
        float float12 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: hi!", (float) (short) 100);
        float float16 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ", (float) (byte) 10);
        float float20 = pedido0.calculaTaxaDesconto(false, "EQUILATERO", (float) (byte) 1);
        float float24 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!", 91.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10.0f + "'", float12 == 10.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 10.0f + "'", float24 == 10.0f);
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 100, (-2.0f));
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(91.0f, 97.0f);
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", (float) (short) -1);
        float float8 = pedido0.calculaTaxaDesconto(true, "NAO FORMA TRIANGULO", (float) (byte) 0);
        float float12 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!", (float) (-1L));
        float float16 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: ", 99.0f);
        float float20 = pedido0.calculaTaxaDesconto(false, "NAO FORMA TRIANGULO", 97.0f);
        float float24 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: ", 62.0f);
        float float28 = pedido0.calculaTaxaDesconto(true, "", (-56.0f));
        java.lang.Class<?> wildcardClass29 = pedido0.getClass();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10.0f + "'", float12 == 10.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.0f + "'", float24 == 0.0f);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 10.0f + "'", float28 == 10.0f);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
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
        ladoInvalidoException3.addSuppressed((java.lang.Throwable) ladoInvalidoException18);
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
        ladoInvalidoException3.addSuppressed((java.lang.Throwable) ladoInvalidoException51);
        java.lang.Throwable[] throwableArray57 = ladoInvalidoException51.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertNotNull(throwableArray54);
        org.junit.Assert.assertNotNull(throwableArray57);
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 10, 0.0f);
        contaCorrente2.setSaldo((float) (byte) 0);
        float float5 = contaCorrente2.getSaldo();
        contaCorrente2.setLimite((float) (byte) 1);
        float float8 = contaCorrente2.getSaldo();
        contaCorrente2.setSaldo(10.0f);
        contaCorrente2.setLimite(1.0f);
        contaCorrente2.setLimite((float) 0);
        contaCorrente2.setLimite((float) 0);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(32.0f, (float) 10L);
        contaCorrente2.setSaldo(67.0f);
        contaCorrente2.setLimite(91.0f);
        float float7 = contaCorrente2.getSaldo();
        float float8 = contaCorrente2.getLimite();
        // The following exception was thrown during execution in test generation
        try {
            float float10 = contaCorrente2.saque(0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Valor invalido");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 67.0f + "'", float7 == 67.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 91.0f + "'", float8 == 91.0f);
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(0.0f, 8.0f);
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
        codigos.Words words0 = new codigos.Words();
        int int2 = words0.countWords("codigos.LadoInvalidoException: ");
        int int4 = words0.countWords("hi!");
        int int6 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!");
        int int8 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (short) 10, (float) ' ');
        float float3 = contaCorrente2.getLimite();
        float float5 = contaCorrente2.saque(42.0f);
        contaCorrente2.setLimite((float) 100);
        float float8 = contaCorrente2.getLimite();
        // The following exception was thrown during execution in test generation
        try {
            float float10 = contaCorrente2.saque((-87.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Valor invalido");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 32.0f + "'", float3 == 32.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-32.0f) + "'", float5 == (-32.0f));
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
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
        codigos.LadoInvalidoException ladoInvalidoException51 = new codigos.LadoInvalidoException("codigos.LadoInvalidoException: hi!");
        ladoInvalidoException43.addSuppressed((java.lang.Throwable) ladoInvalidoException51);
        java.lang.Throwable[] throwableArray53 = ladoInvalidoException51.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException55 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException57 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException59 = new codigos.LadoInvalidoException("");
        ladoInvalidoException57.addSuppressed((java.lang.Throwable) ladoInvalidoException59);
        ladoInvalidoException55.addSuppressed((java.lang.Throwable) ladoInvalidoException59);
        java.lang.Throwable[] throwableArray62 = ladoInvalidoException59.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException64 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException66 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException68 = new codigos.LadoInvalidoException("");
        ladoInvalidoException66.addSuppressed((java.lang.Throwable) ladoInvalidoException68);
        ladoInvalidoException64.addSuppressed((java.lang.Throwable) ladoInvalidoException68);
        java.lang.Throwable[] throwableArray71 = ladoInvalidoException64.getSuppressed();
        ladoInvalidoException59.addSuppressed((java.lang.Throwable) ladoInvalidoException64);
        java.lang.Throwable[] throwableArray73 = ladoInvalidoException64.getSuppressed();
        ladoInvalidoException51.addSuppressed((java.lang.Throwable) ladoInvalidoException64);
        codigos.LadoInvalidoException ladoInvalidoException76 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException78 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException80 = new codigos.LadoInvalidoException("");
        ladoInvalidoException78.addSuppressed((java.lang.Throwable) ladoInvalidoException80);
        ladoInvalidoException76.addSuppressed((java.lang.Throwable) ladoInvalidoException80);
        java.lang.Throwable[] throwableArray83 = ladoInvalidoException80.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException85 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException87 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException89 = new codigos.LadoInvalidoException("");
        ladoInvalidoException87.addSuppressed((java.lang.Throwable) ladoInvalidoException89);
        ladoInvalidoException85.addSuppressed((java.lang.Throwable) ladoInvalidoException89);
        java.lang.Throwable[] throwableArray92 = ladoInvalidoException85.getSuppressed();
        ladoInvalidoException80.addSuppressed((java.lang.Throwable) ladoInvalidoException85);
        java.lang.Throwable[] throwableArray94 = ladoInvalidoException85.getSuppressed();
        ladoInvalidoException51.addSuppressed((java.lang.Throwable) ladoInvalidoException85);
        java.lang.Throwable[] throwableArray96 = ladoInvalidoException51.getSuppressed();
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException51);
        java.lang.String str98 = ladoInvalidoException51.toString();
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(throwableArray46);
        org.junit.Assert.assertNotNull(throwableArray48);
        org.junit.Assert.assertNotNull(throwableArray53);
        org.junit.Assert.assertNotNull(throwableArray62);
        org.junit.Assert.assertNotNull(throwableArray71);
        org.junit.Assert.assertNotNull(throwableArray73);
        org.junit.Assert.assertNotNull(throwableArray83);
        org.junit.Assert.assertNotNull(throwableArray92);
        org.junit.Assert.assertNotNull(throwableArray94);
        org.junit.Assert.assertNotNull(throwableArray96);
        org.junit.Assert.assertEquals("'" + str98 + "' != '" + "codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!" + "'", str98, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!");
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 0L, 1.0f);
        contaCorrente2.setLimite(0.0f);
        float float5 = contaCorrente2.getSaldo();
        float float6 = contaCorrente2.getSaldo();
        contaCorrente2.setSaldo((-29.0f));
        float float9 = contaCorrente2.getSaldo();
        contaCorrente2.setSaldo(65.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-29.0f) + "'", float9 == (-29.0f));
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
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
        java.lang.String str36 = ladoInvalidoException33.toString();
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!" + "'", str36, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!");
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(8.0f, (-10.0f));
        contaCorrente2.setLimite((float) 1);
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 100L, (float) (-1L));
        float float3 = contaCorrente2.getLimite();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
        java.lang.String str3 = codigos.Triangulo.classificaTriangulo(100, (int) (short) 10, 3);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "NAO FORMA TRIANGULO" + "'", str3, "NAO FORMA TRIANGULO");
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = codigos.Triangulo.classificaTriangulo((-1), 100, 2);
            org.junit.Assert.fail("Expected exception of type codigos.LadoInvalidoException; message: lado invalido");
        } catch (codigos.LadoInvalidoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
        java.lang.String str3 = codigos.Triangulo.classificaTriangulo(3, 1, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "NAO FORMA TRIANGULO" + "'", str3, "NAO FORMA TRIANGULO");
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(90.0f, (float) (-1));
        contaCorrente2.setLimite((float) 0);
        contaCorrente2.setSaldo(98.0f);
        contaCorrente2.setLimite(56.0f);
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(32.0f, (float) 10L);
        float float3 = contaCorrente2.getSaldo();
        java.lang.Class<?> wildcardClass4 = contaCorrente2.getClass();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 32.0f + "'", float3 == 32.0f);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
        java.lang.String str3 = codigos.Triangulo.classificaTriangulo((int) (byte) 100, (int) (short) 10, 3);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "NAO FORMA TRIANGULO" + "'", str3, "NAO FORMA TRIANGULO");
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", (float) (-1L));
        float float8 = pedido0.calculaTaxaDesconto(true, "hi!", 90.0f);
        float float12 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!", (-11.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
        java.lang.String str3 = codigos.Triangulo.classificaTriangulo(5, (int) (byte) 100, 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ISOSCELES" + "'", str3, "ISOSCELES");
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = codigos.Triangulo.classificaTriangulo(4, 0, 3);
            org.junit.Assert.fail("Expected exception of type codigos.LadoInvalidoException; message: lado invalido");
        } catch (codigos.LadoInvalidoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
        codigos.Words words0 = new codigos.Words();
        int int2 = words0.countWords("codigos.LadoInvalidoException: ");
        int int4 = words0.countWords("");
        int int6 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
        codigos.Words words0 = new codigos.Words();
        int int2 = words0.countWords("");
        int int4 = words0.countWords("");
        int int6 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int8 = words0.countWords("");
        int int10 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        float float3 = contaCorrente2.getLimite();
        float float4 = contaCorrente2.getSaldo();
        float float5 = contaCorrente2.getLimite();
        float float6 = contaCorrente2.getSaldo();
        contaCorrente2.setLimite((float) (byte) 10);
        contaCorrente2.setSaldo((float) 100L);
        contaCorrente2.setLimite((float) (byte) 10);
        float float14 = contaCorrente2.saque((float) (byte) 100);
        contaCorrente2.setSaldo((float) (short) 100);
        float float18 = contaCorrente2.saque(97.0f);
        contaCorrente2.setSaldo((float) (short) 100);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 3.0f + "'", float18 == 3.0f);
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
        java.lang.String str3 = codigos.Triangulo.classificaTriangulo((int) (short) 100, (int) '4', (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ISOSCELES" + "'", str3, "ISOSCELES");
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", 1.0f);
        float float8 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: hi!", (float) (short) 10);
        float float12 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: hi!", (float) 2);
        float float16 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: ", 32.0f);
        float float20 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!", 98.0f);
        float float24 = pedido0.calculaTaxaDesconto(false, "", 97.0f);
        float float28 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!", 97.0f);
        float float32 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ", 60.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.0f + "'", float24 == 0.0f);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 10.0f + "'", float28 == 10.0f);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 0.0f + "'", float32 == 0.0f);
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((-45.0f), 98.0f);
        float float3 = contaCorrente2.getLimite();
        contaCorrente2.setSaldo((float) 'a');
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 98.0f + "'", float3 == 98.0f);
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", 1.0f);
        float float8 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: hi!", (float) (short) 10);
        float float12 = pedido0.calculaTaxaDesconto(true, "NAO FORMA TRIANGULO", (float) 0L);
        float float16 = pedido0.calculaTaxaDesconto(true, "", 1.0f);
        float float20 = pedido0.calculaTaxaDesconto(false, "NAO FORMA TRIANGULO", (float) (-1L));
        float float24 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!", (float) 100);
        float float28 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: ", (float) (byte) 100);
        float float32 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: ESCALENO", (float) (short) 10);
        float float36 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: ESCALENO", (float) (byte) 10);
        float float40 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: EQUILATERO", 65.0f);
        float float44 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ", 1.0f);
        float float48 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ESCALENO", (-11.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10.0f + "'", float12 == 10.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.0f + "'", float24 == 0.0f);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 0.0f + "'", float28 == 0.0f);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 0.0f + "'", float32 == 0.0f);
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 0.0f + "'", float36 == 0.0f);
        org.junit.Assert.assertTrue("'" + float40 + "' != '" + 0.0f + "'", float40 == 0.0f);
        org.junit.Assert.assertTrue("'" + float44 + "' != '" + 0.0f + "'", float44 == 0.0f);
        org.junit.Assert.assertTrue("'" + float48 + "' != '" + 10.0f + "'", float48 == 10.0f);
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", 1.0f);
        float float8 = pedido0.calculaTaxaDesconto(false, "", (float) 1);
        float float12 = pedido0.calculaTaxaDesconto(false, "hi!", (float) (short) 100);
        float float16 = pedido0.calculaTaxaDesconto(true, "ESCALENO", (float) 2);
        float float20 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", 42.0f);
        float float24 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ", (-29.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 10.0f + "'", float20 == 10.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.0f + "'", float24 == 0.0f);
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((-9.0f), (float) '4');
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", 1.0f);
        float float8 = pedido0.calculaTaxaDesconto(false, "", (float) 1);
        float float12 = pedido0.calculaTaxaDesconto(false, "hi!", (float) (short) 100);
        float float16 = pedido0.calculaTaxaDesconto(true, "", (float) ' ');
        float float20 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: ", (float) 100);
        float float24 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: hi!", (float) (byte) -1);
        float float28 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: NAO FORMA TRIANGULO", (-3.0f));
        float float32 = pedido0.calculaTaxaDesconto(false, "hi!", (-88.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 10.0f + "'", float24 == 10.0f);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 0.0f + "'", float28 == 0.0f);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 0.0f + "'", float32 == 0.0f);
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(32.0f, (float) 10L);
        float float3 = contaCorrente2.getSaldo();
        contaCorrente2.setLimite(42.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 32.0f + "'", float3 == 32.0f);
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(9.0f, 32.0f);
        float float3 = contaCorrente2.getLimite();
        float float4 = contaCorrente2.getLimite();
        contaCorrente2.setSaldo((-9.0f));
        // The following exception was thrown during execution in test generation
        try {
            float float8 = contaCorrente2.saque(51.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Saldo Insuficiente");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 32.0f + "'", float3 == 32.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 32.0f + "'", float4 == 32.0f);
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "hi!", (float) 1L);
        float float8 = pedido0.calculaTaxaDesconto(true, "ESCALENO", (float) (byte) 10);
        float float12 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!", 0.0f);
        float float16 = pedido0.calculaTaxaDesconto(false, "ESCALENO", (float) (short) 100);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = codigos.Triangulo.classificaTriangulo(0, (int) 'a', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type codigos.LadoInvalidoException; message: lado invalido");
        } catch (codigos.LadoInvalidoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = codigos.Triangulo.classificaTriangulo((-1), (-1), 4);
            org.junit.Assert.fail("Expected exception of type codigos.LadoInvalidoException; message: lado invalido");
        } catch (codigos.LadoInvalidoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", 1.0f);
        float float8 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: hi!", (float) (short) 10);
        float float12 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: hi!", (float) 2);
        float float16 = pedido0.calculaTaxaDesconto(false, "hi!", 88.0f);
        float float20 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ", 99.0f);
        float float24 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: ", (-68.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.0f + "'", float24 == 0.0f);
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        float float3 = contaCorrente2.getSaldo();
        contaCorrente2.setSaldo(100.0f);
        contaCorrente2.setLimite(10.0f);
        float float9 = contaCorrente2.saque((float) 1L);
        float float10 = contaCorrente2.getLimite();
        float float11 = contaCorrente2.getLimite();
        float float13 = contaCorrente2.saque(32.0f);
        float float14 = contaCorrente2.getSaldo();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 99.0f + "'", float9 == 99.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 67.0f + "'", float13 == 67.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 67.0f + "'", float14 == 67.0f);
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
        codigos.LadoInvalidoException ladoInvalidoException1 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException3 = new codigos.LadoInvalidoException("");
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException3);
        codigos.LadoInvalidoException ladoInvalidoException6 = new codigos.LadoInvalidoException("hi!");
        ladoInvalidoException3.addSuppressed((java.lang.Throwable) ladoInvalidoException6);
        codigos.LadoInvalidoException ladoInvalidoException9 = new codigos.LadoInvalidoException("hi!");
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
        ladoInvalidoException9.addSuppressed((java.lang.Throwable) ladoInvalidoException20);
        codigos.LadoInvalidoException ladoInvalidoException27 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException29 = new codigos.LadoInvalidoException("");
        ladoInvalidoException27.addSuppressed((java.lang.Throwable) ladoInvalidoException29);
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
        ladoInvalidoException29.addSuppressed((java.lang.Throwable) ladoInvalidoException41);
        java.lang.Throwable[] throwableArray48 = ladoInvalidoException41.getSuppressed();
        ladoInvalidoException9.addSuppressed((java.lang.Throwable) ladoInvalidoException41);
        ladoInvalidoException3.addSuppressed((java.lang.Throwable) ladoInvalidoException41);
        java.lang.Throwable[] throwableArray51 = ladoInvalidoException41.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertNotNull(throwableArray46);
        org.junit.Assert.assertNotNull(throwableArray48);
        org.junit.Assert.assertNotNull(throwableArray51);
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", 1.0f);
        float float8 = pedido0.calculaTaxaDesconto(false, "NAO FORMA TRIANGULO", 10.0f);
        float float12 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: ", (float) (-1L));
        float float16 = pedido0.calculaTaxaDesconto(false, "NAO FORMA TRIANGULO", (-10.0f));
        float float20 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: hi!", 98.0f);
        float float24 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ", (float) (short) 1);
        float float28 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: hi!", 88.0f);
        java.lang.Class<?> wildcardClass29 = pedido0.getClass();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.0f + "'", float24 == 0.0f);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 10.0f + "'", float28 == 10.0f);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
        codigos.Words words0 = new codigos.Words();
        int int2 = words0.countWords("ESCALENO");
        int int4 = words0.countWords("codigos.LadoInvalidoException: ");
        int int6 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        int int8 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        float float3 = contaCorrente2.getLimite();
        float float4 = contaCorrente2.getSaldo();
        float float5 = contaCorrente2.getLimite();
        contaCorrente2.setSaldo((-1.0f));
        contaCorrente2.setSaldo(0.0f);
        float float10 = contaCorrente2.getLimite();
        contaCorrente2.setSaldo((float) (byte) -1);
        float float13 = contaCorrente2.getLimite();
        // The following exception was thrown during execution in test generation
        try {
            float float15 = contaCorrente2.saque(51.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Saldo Insuficiente");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-1.0f) + "'", float10 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + (-1.0f) + "'", float13 == (-1.0f));
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
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
        ladoInvalidoException23.addSuppressed((java.lang.Throwable) ladoInvalidoException58);
        ladoInvalidoException6.addSuppressed((java.lang.Throwable) ladoInvalidoException23);
        codigos.LadoInvalidoException ladoInvalidoException67 = new codigos.LadoInvalidoException("codigos.LadoInvalidoException: hi!");
        codigos.LadoInvalidoException ladoInvalidoException69 = new codigos.LadoInvalidoException("hi!");
        ladoInvalidoException67.addSuppressed((java.lang.Throwable) ladoInvalidoException69);
        ladoInvalidoException6.addSuppressed((java.lang.Throwable) ladoInvalidoException67);
        java.lang.Throwable[] throwableArray72 = ladoInvalidoException67.getSuppressed();
        java.lang.Throwable[] throwableArray73 = ladoInvalidoException67.getSuppressed();
        java.lang.Throwable[] throwableArray74 = ladoInvalidoException67.getSuppressed();
        java.lang.Class<?> wildcardClass75 = ladoInvalidoException67.getClass();
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertNotNull(throwableArray46);
        org.junit.Assert.assertNotNull(throwableArray61);
        org.junit.Assert.assertNotNull(throwableArray63);
        org.junit.Assert.assertNotNull(throwableArray72);
        org.junit.Assert.assertNotNull(throwableArray73);
        org.junit.Assert.assertNotNull(throwableArray74);
        org.junit.Assert.assertNotNull(wildcardClass75);
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2260");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 10, (float) 10L);
        // The following exception was thrown during execution in test generation
        try {
            float float4 = contaCorrente2.saque(69.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Saldo Insuficiente");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2261");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((-1.0f), (-48.0f));
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2262");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(30.0f, 12.0f);
        // The following exception was thrown during execution in test generation
        try {
            float float4 = contaCorrente2.saque((float) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Saldo Insuficiente");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2263");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", (float) (short) -1);
        float float8 = pedido0.calculaTaxaDesconto(true, "NAO FORMA TRIANGULO", (float) (byte) 0);
        float float12 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: hi!", (float) (-1L));
        float float16 = pedido0.calculaTaxaDesconto(true, "", (float) (byte) 10);
        float float20 = pedido0.calculaTaxaDesconto(false, "ESCALENO", 88.0f);
        float float24 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!", (float) 100L);
        float float28 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ", (float) 100L);
        float float32 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: NAO FORMA TRIANGULO", 100.0f);
        float float36 = pedido0.calculaTaxaDesconto(false, "ESCALENO", (float) (short) 1);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 10.0f + "'", float24 == 10.0f);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 10.0f + "'", float28 == 10.0f);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 10.0f + "'", float32 == 10.0f);
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 0.0f + "'", float36 == 0.0f);
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2264");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        float float3 = contaCorrente2.getSaldo();
        contaCorrente2.setSaldo(100.0f);
        float float7 = contaCorrente2.saque((float) (byte) 10);
        contaCorrente2.setSaldo((float) 100);
        float float10 = contaCorrente2.getSaldo();
        float float11 = contaCorrente2.getSaldo();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 90.0f + "'", float7 == 90.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 100.0f + "'", float10 == 100.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 100.0f + "'", float11 == 100.0f);
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2265");
        codigos.LadoInvalidoException ladoInvalidoException1 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException3 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException5 = new codigos.LadoInvalidoException("");
        ladoInvalidoException3.addSuppressed((java.lang.Throwable) ladoInvalidoException5);
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException5);
        java.lang.Throwable[] throwableArray8 = ladoInvalidoException5.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException10 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException12 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException14 = new codigos.LadoInvalidoException("");
        ladoInvalidoException12.addSuppressed((java.lang.Throwable) ladoInvalidoException14);
        ladoInvalidoException10.addSuppressed((java.lang.Throwable) ladoInvalidoException14);
        java.lang.Throwable[] throwableArray17 = ladoInvalidoException10.getSuppressed();
        ladoInvalidoException5.addSuppressed((java.lang.Throwable) ladoInvalidoException10);
        java.lang.Throwable[] throwableArray19 = ladoInvalidoException10.getSuppressed();
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
        java.lang.Throwable[] throwableArray50 = ladoInvalidoException45.getSuppressed();
        ladoInvalidoException30.addSuppressed((java.lang.Throwable) ladoInvalidoException45);
        codigos.LadoInvalidoException ladoInvalidoException53 = new codigos.LadoInvalidoException("codigos.LadoInvalidoException: hi!");
        ladoInvalidoException45.addSuppressed((java.lang.Throwable) ladoInvalidoException53);
        java.lang.Throwable[] throwableArray55 = ladoInvalidoException53.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException57 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException59 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException61 = new codigos.LadoInvalidoException("");
        ladoInvalidoException59.addSuppressed((java.lang.Throwable) ladoInvalidoException61);
        ladoInvalidoException57.addSuppressed((java.lang.Throwable) ladoInvalidoException61);
        java.lang.Throwable[] throwableArray64 = ladoInvalidoException61.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException66 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException68 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException70 = new codigos.LadoInvalidoException("");
        ladoInvalidoException68.addSuppressed((java.lang.Throwable) ladoInvalidoException70);
        ladoInvalidoException66.addSuppressed((java.lang.Throwable) ladoInvalidoException70);
        java.lang.Throwable[] throwableArray73 = ladoInvalidoException66.getSuppressed();
        ladoInvalidoException61.addSuppressed((java.lang.Throwable) ladoInvalidoException66);
        java.lang.Throwable[] throwableArray75 = ladoInvalidoException66.getSuppressed();
        ladoInvalidoException53.addSuppressed((java.lang.Throwable) ladoInvalidoException66);
        java.lang.Throwable[] throwableArray77 = ladoInvalidoException53.getSuppressed();
        java.lang.Throwable[] throwableArray78 = ladoInvalidoException53.getSuppressed();
        ladoInvalidoException10.addSuppressed((java.lang.Throwable) ladoInvalidoException53);
        java.lang.String str80 = ladoInvalidoException10.toString();
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(throwableArray48);
        org.junit.Assert.assertNotNull(throwableArray50);
        org.junit.Assert.assertNotNull(throwableArray55);
        org.junit.Assert.assertNotNull(throwableArray64);
        org.junit.Assert.assertNotNull(throwableArray73);
        org.junit.Assert.assertNotNull(throwableArray75);
        org.junit.Assert.assertNotNull(throwableArray77);
        org.junit.Assert.assertNotNull(throwableArray78);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "codigos.LadoInvalidoException: " + "'", str80, "codigos.LadoInvalidoException: ");
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2266");
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
        java.lang.Throwable[] throwableArray33 = ladoInvalidoException10.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNotNull(throwableArray33);
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2267");
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
        java.lang.Throwable[] throwableArray38 = ladoInvalidoException31.getSuppressed();
        java.lang.Throwable[] throwableArray39 = ladoInvalidoException31.getSuppressed();
        ladoInvalidoException3.addSuppressed((java.lang.Throwable) ladoInvalidoException31);
        java.lang.String str41 = ladoInvalidoException31.toString();
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray34);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "codigos.LadoInvalidoException: " + "'", str41, "codigos.LadoInvalidoException: ");
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2268");
        codigos.Words words0 = new codigos.Words();
        int int2 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int4 = words0.countWords("NAO FORMA TRIANGULO");
        int int6 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int8 = words0.countWords("NAO FORMA TRIANGULO");
        int int10 = words0.countWords("");
        int int12 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int14 = words0.countWords("codigos.LadoInvalidoException: ");
        int int16 = words0.countWords("");
        int int18 = words0.countWords("ESCALENO");
        int int20 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: NAO FORMA TRIANGULO");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2269");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (short) 100, (float) (short) 10);
        float float3 = contaCorrente2.getSaldo();
        contaCorrente2.setSaldo(10.0f);
        float float7 = contaCorrente2.saque(2.0f);
        // The following exception was thrown during execution in test generation
        try {
            float float9 = contaCorrente2.saque(97.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Saldo Insuficiente");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 8.0f + "'", float7 == 8.0f);
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2270");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((-32.0f), 4.0f);
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2271");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = codigos.Triangulo.classificaTriangulo(0, (int) ' ', 100);
            org.junit.Assert.fail("Expected exception of type codigos.LadoInvalidoException; message: lado invalido");
        } catch (codigos.LadoInvalidoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2272");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", 1.0f);
        float float8 = pedido0.calculaTaxaDesconto(false, "", (float) 1);
        float float12 = pedido0.calculaTaxaDesconto(false, "hi!", (float) (short) 100);
        float float16 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: hi!", (float) '#');
        float float20 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: ESCALENO", (float) 3);
        float float24 = pedido0.calculaTaxaDesconto(false, "", (float) 0L);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.0f + "'", float24 == 0.0f);
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2273");
        codigos.Words words0 = new codigos.Words();
        int int2 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int4 = words0.countWords("NAO FORMA TRIANGULO");
        int int6 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int8 = words0.countWords("NAO FORMA TRIANGULO");
        int int10 = words0.countWords("");
        int int12 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int14 = words0.countWords("codigos.LadoInvalidoException: ");
        int int16 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!");
        java.lang.Class<?> wildcardClass17 = words0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2274");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(1.0f, (float) '4');
        float float3 = contaCorrente2.getLimite();
        // The following exception was thrown during execution in test generation
        try {
            float float5 = contaCorrente2.saque(0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Valor invalido");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 52.0f + "'", float3 == 52.0f);
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2275");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(4.0f, 3.0f);
        float float4 = contaCorrente2.saque((float) 6);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-2.0f) + "'", float4 == (-2.0f));
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2276");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((-9.0f), 65.0f);
        float float4 = contaCorrente2.saque(7.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-16.0f) + "'", float4 == (-16.0f));
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2277");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(90.0f, (float) (-1));
        contaCorrente2.setLimite((float) 0);
        java.lang.Class<?> wildcardClass5 = contaCorrente2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2278");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        float float3 = contaCorrente2.getLimite();
        float float4 = contaCorrente2.getSaldo();
        float float5 = contaCorrente2.getLimite();
        contaCorrente2.setSaldo((-1.0f));
        contaCorrente2.setSaldo(0.0f);
        float float10 = contaCorrente2.getLimite();
        contaCorrente2.setSaldo((float) (byte) -1);
        contaCorrente2.setSaldo((-10.0f));
        contaCorrente2.setLimite(55.0f);
        contaCorrente2.setSaldo(62.0f);
        float float19 = contaCorrente2.getLimite();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-1.0f) + "'", float10 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 55.0f + "'", float19 == 55.0f);
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2279");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((-52.0f), (-30.0f));
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2280");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 10, 0.0f);
        float float3 = contaCorrente2.getSaldo();
        float float4 = contaCorrente2.getLimite();
        contaCorrente2.setLimite((float) 'a');
        contaCorrente2.setSaldo((-10.0f));
        float float9 = contaCorrente2.getSaldo();
        java.lang.Class<?> wildcardClass10 = contaCorrente2.getClass();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-10.0f) + "'", float9 == (-10.0f));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2281");
        codigos.Words words0 = new codigos.Words();
        int int2 = words0.countWords("");
        int int4 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!");
        int int6 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        int int8 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        int int10 = words0.countWords("hi!");
        java.lang.Class<?> wildcardClass11 = words0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2282");
        codigos.Words words0 = new codigos.Words();
        int int2 = words0.countWords("codigos.LadoInvalidoException: ");
        int int4 = words0.countWords("NAO FORMA TRIANGULO");
        int int6 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int8 = words0.countWords("codigos.LadoInvalidoException: ESCALENO");
        int int10 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        int int12 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        int int14 = words0.countWords("codigos.LadoInvalidoException: ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2283");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(10.0f, 47.0f);
        contaCorrente2.setSaldo(66.0f);
        float float5 = contaCorrente2.getSaldo();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 66.0f + "'", float5 == 66.0f);
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2284");
        codigos.Words words0 = new codigos.Words();
        int int2 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int4 = words0.countWords("NAO FORMA TRIANGULO");
        int int6 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int8 = words0.countWords("NAO FORMA TRIANGULO");
        int int10 = words0.countWords("NAO FORMA TRIANGULO");
        int int12 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        int int14 = words0.countWords("EQUILATERO");
        int int16 = words0.countWords("EQUILATERO");
        int int18 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2285");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(97.0f, (float) ' ');
        float float4 = contaCorrente2.saque((float) 1L);
        float float6 = contaCorrente2.saque(27.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 96.0f + "'", float4 == 96.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 69.0f + "'", float6 == 69.0f);
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2286");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        float float3 = contaCorrente2.getSaldo();
        contaCorrente2.setSaldo(100.0f);
        float float7 = contaCorrente2.saque((float) (byte) 10);
        float float9 = contaCorrente2.saque((float) (short) 1);
        contaCorrente2.setLimite((float) 1);
        contaCorrente2.setLimite((float) 4);
        // The following exception was thrown during execution in test generation
        try {
            float float15 = contaCorrente2.saque((float) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Valor invalido");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 90.0f + "'", float7 == 90.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 89.0f + "'", float9 == 89.0f);
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2287");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        contaCorrente2.setLimite((float) 0L);
        contaCorrente2.setLimite((float) (short) 0);
        float float8 = contaCorrente2.saque((float) 1);
        contaCorrente2.setSaldo((-45.0f));
        // The following exception was thrown during execution in test generation
        try {
            float float12 = contaCorrente2.saque((-30.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Valor invalido");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 99.0f + "'", float8 == 99.0f);
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2288");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 0, 4.0f);
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2289");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(34.0f, 83.0f);
        // The following exception was thrown during execution in test generation
        try {
            float float4 = contaCorrente2.saque((float) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Valor invalido");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2290");
        java.lang.String str3 = codigos.Triangulo.classificaTriangulo((int) ' ', (int) ' ', 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "NAO FORMA TRIANGULO" + "'", str3, "NAO FORMA TRIANGULO");
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2291");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 1L, 52.0f);
        // The following exception was thrown during execution in test generation
        try {
            float float4 = contaCorrente2.saque((-68.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Valor invalido");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2292");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 10, 0.0f);
        contaCorrente2.setSaldo((float) (byte) 0);
        float float5 = contaCorrente2.getSaldo();
        contaCorrente2.setSaldo((float) 0);
        contaCorrente2.setLimite(2.0f);
        contaCorrente2.setSaldo((float) 10);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2293");
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
        java.lang.Throwable[] throwableArray78 = ladoInvalidoException1.getSuppressed();
        java.lang.String str79 = ladoInvalidoException1.toString();
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNotNull(throwableArray52);
        org.junit.Assert.assertNotNull(throwableArray67);
        org.junit.Assert.assertNotNull(throwableArray69);
        org.junit.Assert.assertNotNull(throwableArray75);
        org.junit.Assert.assertNotNull(throwableArray78);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "codigos.LadoInvalidoException: ESCALENO" + "'", str79, "codigos.LadoInvalidoException: ESCALENO");
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2294");
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
        java.lang.Throwable[] throwableArray80 = ladoInvalidoException19.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray57);
        org.junit.Assert.assertNotNull(throwableArray72);
        org.junit.Assert.assertNotNull(throwableArray74);
        org.junit.Assert.assertNotNull(throwableArray80);
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2295");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        contaCorrente2.setLimite((float) 0L);
        float float6 = contaCorrente2.saque((float) 10L);
        float float7 = contaCorrente2.getLimite();
        float float8 = contaCorrente2.getLimite();
        contaCorrente2.setLimite((float) (byte) -1);
        contaCorrente2.setSaldo(45.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 90.0f + "'", float6 == 90.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2296");
        codigos.Words words0 = new codigos.Words();
        int int2 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int4 = words0.countWords("NAO FORMA TRIANGULO");
        int int6 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int8 = words0.countWords("NAO FORMA TRIANGULO");
        int int10 = words0.countWords("");
        int int12 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int14 = words0.countWords("codigos.LadoInvalidoException: ");
        int int16 = words0.countWords("ISOSCELES");
        java.lang.Class<?> wildcardClass17 = words0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2297");
        java.lang.String str3 = codigos.Triangulo.classificaTriangulo(4, (int) (short) 10, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "NAO FORMA TRIANGULO" + "'", str3, "NAO FORMA TRIANGULO");
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2298");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(7.0f, (float) (short) -1);
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2299");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(90.0f, (float) (-1));
        contaCorrente2.setLimite((float) 0L);
        float float5 = contaCorrente2.getLimite();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2300");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(32.0f, (float) (byte) 0);
        contaCorrente2.setSaldo(10.0f);
        contaCorrente2.setLimite(9.0f);
        contaCorrente2.setLimite((float) ' ');
        float float10 = contaCorrente2.saque((float) 3);
        float float12 = contaCorrente2.saque(2.0f);
        contaCorrente2.setSaldo((float) 1L);
        float float15 = contaCorrente2.getLimite();
        float float16 = contaCorrente2.getLimite();
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 7.0f + "'", float10 == 7.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 5.0f + "'", float12 == 5.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 32.0f + "'", float15 == 32.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 32.0f + "'", float16 == 32.0f);
    }

    @Test
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2301");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((-58.0f), 7.0f);
        contaCorrente2.setSaldo((-59.0f));
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2302");
        codigos.LadoInvalidoException ladoInvalidoException1 = new codigos.LadoInvalidoException("ESCALENO");
        java.lang.Throwable[] throwableArray2 = ladoInvalidoException1.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException4 = new codigos.LadoInvalidoException("");
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException4);
        codigos.LadoInvalidoException ladoInvalidoException7 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException9 = new codigos.LadoInvalidoException("");
        ladoInvalidoException7.addSuppressed((java.lang.Throwable) ladoInvalidoException9);
        java.lang.Throwable[] throwableArray11 = ladoInvalidoException7.getSuppressed();
        java.lang.Throwable[] throwableArray12 = ladoInvalidoException7.getSuppressed();
        java.lang.Throwable[] throwableArray13 = ladoInvalidoException7.getSuppressed();
        ladoInvalidoException4.addSuppressed((java.lang.Throwable) ladoInvalidoException7);
        java.lang.String str15 = ladoInvalidoException7.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "codigos.LadoInvalidoException: " + "'", str15, "codigos.LadoInvalidoException: ");
    }

    @Test
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2303");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((-1.0f), (float) 10);
    }

    @Test
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2304");
        codigos.Words words0 = new codigos.Words();
        int int2 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int4 = words0.countWords("NAO FORMA TRIANGULO");
        int int6 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int8 = words0.countWords("NAO FORMA TRIANGULO");
        int int10 = words0.countWords("");
        int int12 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int14 = words0.countWords("codigos.LadoInvalidoException: ");
        int int16 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!");
        int int18 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!");
        int int20 = words0.countWords("NAO FORMA TRIANGULO");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2305");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (short) 0, 0.0f);
        contaCorrente2.setSaldo((float) 0L);
        contaCorrente2.setLimite(91.0f);
        float float7 = contaCorrente2.getSaldo();
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2306");
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
        codigos.LadoInvalidoException ladoInvalidoException32 = new codigos.LadoInvalidoException("");
        ladoInvalidoException30.addSuppressed((java.lang.Throwable) ladoInvalidoException32);
        ladoInvalidoException28.addSuppressed((java.lang.Throwable) ladoInvalidoException32);
        java.lang.Throwable[] throwableArray35 = ladoInvalidoException32.getSuppressed();
        ladoInvalidoException25.addSuppressed((java.lang.Throwable) ladoInvalidoException32);
        codigos.LadoInvalidoException ladoInvalidoException38 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException40 = new codigos.LadoInvalidoException("");
        ladoInvalidoException38.addSuppressed((java.lang.Throwable) ladoInvalidoException40);
        codigos.LadoInvalidoException ladoInvalidoException43 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException45 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException47 = new codigos.LadoInvalidoException("");
        ladoInvalidoException45.addSuppressed((java.lang.Throwable) ladoInvalidoException47);
        ladoInvalidoException43.addSuppressed((java.lang.Throwable) ladoInvalidoException47);
        java.lang.Throwable[] throwableArray50 = ladoInvalidoException47.getSuppressed();
        ladoInvalidoException40.addSuppressed((java.lang.Throwable) ladoInvalidoException47);
        java.lang.Throwable[] throwableArray52 = ladoInvalidoException47.getSuppressed();
        ladoInvalidoException32.addSuppressed((java.lang.Throwable) ladoInvalidoException47);
        ladoInvalidoException3.addSuppressed((java.lang.Throwable) ladoInvalidoException47);
        codigos.LadoInvalidoException ladoInvalidoException56 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException58 = new codigos.LadoInvalidoException("");
        ladoInvalidoException56.addSuppressed((java.lang.Throwable) ladoInvalidoException58);
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
        ladoInvalidoException58.addSuppressed((java.lang.Throwable) ladoInvalidoException70);
        java.lang.Throwable[] throwableArray77 = ladoInvalidoException70.getSuppressed();
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
        java.lang.Throwable[] throwableArray93 = ladoInvalidoException88.getSuppressed();
        ladoInvalidoException70.addSuppressed((java.lang.Throwable) ladoInvalidoException88);
        java.lang.Throwable[] throwableArray95 = ladoInvalidoException88.getSuppressed();
        ladoInvalidoException47.addSuppressed((java.lang.Throwable) ladoInvalidoException88);
        java.lang.Throwable[] throwableArray97 = ladoInvalidoException47.getSuppressed();
        java.lang.Throwable[] throwableArray98 = ladoInvalidoException47.getSuppressed();
        java.lang.Throwable[] throwableArray99 = ladoInvalidoException47.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray50);
        org.junit.Assert.assertNotNull(throwableArray52);
        org.junit.Assert.assertNotNull(throwableArray73);
        org.junit.Assert.assertNotNull(throwableArray75);
        org.junit.Assert.assertNotNull(throwableArray77);
        org.junit.Assert.assertNotNull(throwableArray91);
        org.junit.Assert.assertNotNull(throwableArray93);
        org.junit.Assert.assertNotNull(throwableArray95);
        org.junit.Assert.assertNotNull(throwableArray97);
        org.junit.Assert.assertNotNull(throwableArray98);
        org.junit.Assert.assertNotNull(throwableArray99);
    }

    @Test
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2307");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = codigos.Triangulo.classificaTriangulo(10, 0, 2);
            org.junit.Assert.fail("Expected exception of type codigos.LadoInvalidoException; message: lado invalido");
        } catch (codigos.LadoInvalidoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2308");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(99.0f, (float) 'a');
        float float3 = contaCorrente2.getLimite();
        contaCorrente2.setSaldo((-10.0f));
        float float7 = contaCorrente2.saque((float) (short) 1);
        contaCorrente2.setSaldo(87.0f);
        float float11 = contaCorrente2.saque((float) 6);
        // The following exception was thrown during execution in test generation
        try {
            float float13 = contaCorrente2.saque(0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Valor invalido");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-11.0f) + "'", float7 == (-11.0f));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 81.0f + "'", float11 == 81.0f);
    }

    @Test
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2309");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 10, 0.0f);
        float float3 = contaCorrente2.getSaldo();
        float float5 = contaCorrente2.saque(1.0f);
        contaCorrente2.setLimite(10.0f);
        contaCorrente2.setLimite((float) (byte) 100);
        float float10 = contaCorrente2.getSaldo();
        float float11 = contaCorrente2.getLimite();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 9.0f + "'", float5 == 9.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 9.0f + "'", float10 == 9.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 100.0f + "'", float11 == 100.0f);
    }

    @Test
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2310");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(1.0f, (-2.0f));
    }

    @Test
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2311");
        codigos.Words words0 = new codigos.Words();
        int int2 = words0.countWords("");
        int int4 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!");
        int int6 = words0.countWords("");
        int int8 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        int int10 = words0.countWords("codigos.LadoInvalidoException: ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2312");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((-10.0f), (float) ' ');
    }

    @Test
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2313");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (-1), (float) 1);
        // The following exception was thrown during execution in test generation
        try {
            float float4 = contaCorrente2.saque((-52.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Valor invalido");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
    }

    @Test
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2314");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(32.0f, (float) (byte) 0);
        contaCorrente2.setSaldo(10.0f);
        contaCorrente2.setLimite(9.0f);
        float float7 = contaCorrente2.getSaldo();
        contaCorrente2.setLimite(10.0f);
        contaCorrente2.setSaldo(89.0f);
        contaCorrente2.setLimite(4.0f);
        float float14 = contaCorrente2.getLimite();
        float float15 = contaCorrente2.getSaldo();
        float float16 = contaCorrente2.getLimite();
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 4.0f + "'", float14 == 4.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 89.0f + "'", float15 == 89.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 4.0f + "'", float16 == 4.0f);
    }

    @Test
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2315");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = codigos.Triangulo.classificaTriangulo((int) (short) 10, 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type codigos.LadoInvalidoException; message: lado invalido");
        } catch (codigos.LadoInvalidoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2316");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", 1.0f);
        float float8 = pedido0.calculaTaxaDesconto(false, "", (float) 1);
        float float12 = pedido0.calculaTaxaDesconto(false, "hi!", (float) (short) 100);
        float float16 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ", 42.0f);
        float float20 = pedido0.calculaTaxaDesconto(false, "", (float) 10);
        float float24 = pedido0.calculaTaxaDesconto(true, "EQUILATERO", (float) ' ');
        float float28 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: NAO FORMA TRIANGULO", 83.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 10.0f + "'", float24 == 10.0f);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 10.0f + "'", float28 == 10.0f);
    }

    @Test
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2317");
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
        codigos.LadoInvalidoException ladoInvalidoException92 = new codigos.LadoInvalidoException("hi!");
        ladoInvalidoException80.addSuppressed((java.lang.Throwable) ladoInvalidoException92);
        codigos.LadoInvalidoException ladoInvalidoException95 = new codigos.LadoInvalidoException("codigos.LadoInvalidoException: ");
        java.lang.Throwable[] throwableArray96 = ladoInvalidoException95.getSuppressed();
        java.lang.Throwable[] throwableArray97 = ladoInvalidoException95.getSuppressed();
        ladoInvalidoException92.addSuppressed((java.lang.Throwable) ladoInvalidoException95);
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
        org.junit.Assert.assertNotNull(throwableArray96);
        org.junit.Assert.assertNotNull(throwableArray97);
    }

    @Test
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2318");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = codigos.Triangulo.classificaTriangulo(0, (int) (short) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type codigos.LadoInvalidoException; message: lado invalido");
        } catch (codigos.LadoInvalidoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2319");
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
        ladoInvalidoException8.addSuppressed((java.lang.Throwable) ladoInvalidoException13);
        java.lang.Throwable[] throwableArray26 = ladoInvalidoException8.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException28 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException30 = new codigos.LadoInvalidoException("");
        ladoInvalidoException28.addSuppressed((java.lang.Throwable) ladoInvalidoException30);
        codigos.LadoInvalidoException ladoInvalidoException33 = new codigos.LadoInvalidoException("hi!");
        ladoInvalidoException30.addSuppressed((java.lang.Throwable) ladoInvalidoException33);
        ladoInvalidoException8.addSuppressed((java.lang.Throwable) ladoInvalidoException33);
        codigos.LadoInvalidoException ladoInvalidoException37 = new codigos.LadoInvalidoException("codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        ladoInvalidoException33.addSuppressed((java.lang.Throwable) ladoInvalidoException37);
        codigos.LadoInvalidoException ladoInvalidoException40 = new codigos.LadoInvalidoException("hi!");
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
        ladoInvalidoException40.addSuppressed((java.lang.Throwable) ladoInvalidoException51);
        codigos.LadoInvalidoException ladoInvalidoException58 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException60 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException62 = new codigos.LadoInvalidoException("");
        ladoInvalidoException60.addSuppressed((java.lang.Throwable) ladoInvalidoException62);
        ladoInvalidoException58.addSuppressed((java.lang.Throwable) ladoInvalidoException62);
        java.lang.Throwable[] throwableArray65 = ladoInvalidoException62.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException67 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException69 = new codigos.LadoInvalidoException("");
        ladoInvalidoException67.addSuppressed((java.lang.Throwable) ladoInvalidoException69);
        codigos.LadoInvalidoException ladoInvalidoException72 = new codigos.LadoInvalidoException("hi!");
        ladoInvalidoException69.addSuppressed((java.lang.Throwable) ladoInvalidoException72);
        ladoInvalidoException62.addSuppressed((java.lang.Throwable) ladoInvalidoException72);
        java.lang.Throwable[] throwableArray75 = ladoInvalidoException62.getSuppressed();
        ladoInvalidoException40.addSuppressed((java.lang.Throwable) ladoInvalidoException62);
        java.lang.Throwable[] throwableArray77 = ladoInvalidoException40.getSuppressed();
        java.lang.Throwable[] throwableArray78 = ladoInvalidoException40.getSuppressed();
        ladoInvalidoException33.addSuppressed((java.lang.Throwable) ladoInvalidoException40);
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException40);
        java.lang.Class<?> wildcardClass81 = ladoInvalidoException1.getClass();
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray54);
        org.junit.Assert.assertNotNull(throwableArray65);
        org.junit.Assert.assertNotNull(throwableArray75);
        org.junit.Assert.assertNotNull(throwableArray77);
        org.junit.Assert.assertNotNull(throwableArray78);
        org.junit.Assert.assertNotNull(wildcardClass81);
    }

    @Test
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2320");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = codigos.Triangulo.classificaTriangulo(1, (int) (byte) 0, 5);
            org.junit.Assert.fail("Expected exception of type codigos.LadoInvalidoException; message: lado invalido");
        } catch (codigos.LadoInvalidoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2321");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(1.0f, (float) '4');
        float float3 = contaCorrente2.getLimite();
        float float5 = contaCorrente2.saque(42.0f);
        contaCorrente2.setSaldo(8.0f);
        contaCorrente2.setLimite(0.0f);
        float float10 = contaCorrente2.getSaldo();
        java.lang.Class<?> wildcardClass11 = contaCorrente2.getClass();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 52.0f + "'", float3 == 52.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-41.0f) + "'", float5 == (-41.0f));
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 8.0f + "'", float10 == 8.0f);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2322");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (short) 100, (float) 100);
    }

    @Test
    public void test2323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2323");
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
        codigos.LadoInvalidoException ladoInvalidoException23 = new codigos.LadoInvalidoException("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        java.lang.Throwable[] throwableArray24 = ladoInvalidoException23.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException26 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException28 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException30 = new codigos.LadoInvalidoException("");
        ladoInvalidoException28.addSuppressed((java.lang.Throwable) ladoInvalidoException30);
        ladoInvalidoException26.addSuppressed((java.lang.Throwable) ladoInvalidoException30);
        java.lang.Throwable[] throwableArray33 = ladoInvalidoException26.getSuppressed();
        java.lang.Throwable[] throwableArray34 = ladoInvalidoException26.getSuppressed();
        java.lang.Throwable[] throwableArray35 = ladoInvalidoException26.getSuppressed();
        ladoInvalidoException23.addSuppressed((java.lang.Throwable) ladoInvalidoException26);
        java.lang.Throwable[] throwableArray37 = ladoInvalidoException26.getSuppressed();
        ladoInvalidoException8.addSuppressed((java.lang.Throwable) ladoInvalidoException26);
        java.lang.Throwable[] throwableArray39 = ladoInvalidoException26.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(throwableArray34);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertNotNull(throwableArray39);
    }

    @Test
    public void test2324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2324");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) ' ', 0.0f);
        float float3 = contaCorrente2.getSaldo();
        contaCorrente2.setLimite(0.0f);
        float float6 = contaCorrente2.getLimite();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 32.0f + "'", float3 == 32.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
    }

    @Test
    public void test2325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2325");
        codigos.LadoInvalidoException ladoInvalidoException1 = new codigos.LadoInvalidoException("codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        java.lang.Throwable[] throwableArray2 = ladoInvalidoException1.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException4 = new codigos.LadoInvalidoException("codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!");
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
        codigos.LadoInvalidoException ladoInvalidoException22 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException24 = new codigos.LadoInvalidoException("");
        ladoInvalidoException22.addSuppressed((java.lang.Throwable) ladoInvalidoException24);
        codigos.LadoInvalidoException ladoInvalidoException27 = new codigos.LadoInvalidoException("hi!");
        ladoInvalidoException24.addSuppressed((java.lang.Throwable) ladoInvalidoException27);
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
        ladoInvalidoException24.addSuppressed((java.lang.Throwable) ladoInvalidoException39);
        ladoInvalidoException15.addSuppressed((java.lang.Throwable) ladoInvalidoException24);
        ladoInvalidoException4.addSuppressed((java.lang.Throwable) ladoInvalidoException15);
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException15);
        java.lang.Throwable[] throwableArray65 = ladoInvalidoException1.getSuppressed();
        java.lang.String str66 = ladoInvalidoException1.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertNotNull(throwableArray57);
        org.junit.Assert.assertNotNull(throwableArray59);
        org.junit.Assert.assertNotNull(throwableArray65);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: " + "'", str66, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
    }

    @Test
    public void test2326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2326");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "hi!", (float) 1L);
        float float8 = pedido0.calculaTaxaDesconto(true, "NAO FORMA TRIANGULO", 68.0f);
        float float12 = pedido0.calculaTaxaDesconto(true, "hi!", (float) '4');
        float float16 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!", 45.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10.0f + "'", float12 == 10.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
    }

    @Test
    public void test2327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2327");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(90.0f, 65.0f);
        float float4 = contaCorrente2.saque(45.0f);
        float float5 = contaCorrente2.getLimite();
        java.lang.Class<?> wildcardClass6 = contaCorrente2.getClass();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 45.0f + "'", float4 == 45.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 65.0f + "'", float5 == 65.0f);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2328");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (short) 10, (float) ' ');
        contaCorrente2.setLimite((float) (byte) 0);
        float float5 = contaCorrente2.getLimite();
        float float6 = contaCorrente2.getLimite();
        contaCorrente2.setSaldo((float) 5);
        java.lang.Class<?> wildcardClass9 = contaCorrente2.getClass();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2329");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        contaCorrente2.setLimite((float) 0L);
        contaCorrente2.setLimite((float) (short) 0);
        float float8 = contaCorrente2.saque((float) 1);
        float float9 = contaCorrente2.getSaldo();
        contaCorrente2.setLimite(52.0f);
        contaCorrente2.setSaldo(0.0f);
        float float14 = contaCorrente2.getSaldo();
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 99.0f + "'", float8 == 99.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 99.0f + "'", float9 == 99.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
    }

    @Test
    public void test2330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2330");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", (float) (short) -1);
        float float8 = pedido0.calculaTaxaDesconto(true, "NAO FORMA TRIANGULO", (float) (byte) 0);
        float float12 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ESCALENO", 67.0f);
        float float16 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: hi!", 23.0f);
        float float20 = pedido0.calculaTaxaDesconto(false, "ESCALENO", (float) (byte) 100);
        float float24 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: ", (float) 1);
        float float28 = pedido0.calculaTaxaDesconto(false, "EQUILATERO", 65.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10.0f + "'", float12 == 10.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.0f + "'", float24 == 0.0f);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 0.0f + "'", float28 == 0.0f);
    }

    @Test
    public void test2331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2331");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 10, 0.0f);
        float float3 = contaCorrente2.getSaldo();
        contaCorrente2.setSaldo(10.0f);
        float float6 = contaCorrente2.getLimite();
        contaCorrente2.setSaldo(96.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
    }

    @Test
    public void test2332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2332");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", (float) (short) -1);
        float float8 = pedido0.calculaTaxaDesconto(true, "NAO FORMA TRIANGULO", (float) (byte) 0);
        float float12 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: hi!", (float) (-1L));
        float float16 = pedido0.calculaTaxaDesconto(true, "", (float) (byte) 10);
        float float20 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ", 35.0f);
        float float24 = pedido0.calculaTaxaDesconto(true, "", (float) (byte) 100);
        float float28 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!", 42.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 10.0f + "'", float20 == 10.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 10.0f + "'", float24 == 10.0f);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 0.0f + "'", float28 == 0.0f);
    }

    @Test
    public void test2333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2333");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(9.0f, 32.0f);
        float float3 = contaCorrente2.getLimite();
        float float5 = contaCorrente2.saque(23.0f);
        float float6 = contaCorrente2.getSaldo();
        float float7 = contaCorrente2.getSaldo();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 32.0f + "'", float3 == 32.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-14.0f) + "'", float5 == (-14.0f));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-14.0f) + "'", float6 == (-14.0f));
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-14.0f) + "'", float7 == (-14.0f));
    }

    @Test
    public void test2334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2334");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", 1.0f);
        float float8 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: hi!", (float) (short) 10);
        float float12 = pedido0.calculaTaxaDesconto(true, "NAO FORMA TRIANGULO", (float) 0L);
        float float16 = pedido0.calculaTaxaDesconto(true, "", 1.0f);
        float float20 = pedido0.calculaTaxaDesconto(false, "NAO FORMA TRIANGULO", (float) (-1L));
        float float24 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!", (float) 100);
        float float28 = pedido0.calculaTaxaDesconto(false, "NAO FORMA TRIANGULO", (-48.0f));
        float float32 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ", 100.0f);
        java.lang.Class<?> wildcardClass33 = pedido0.getClass();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10.0f + "'", float12 == 10.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.0f + "'", float24 == 0.0f);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 0.0f + "'", float28 == 0.0f);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 10.0f + "'", float32 == 10.0f);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test2335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2335");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(0.0f, (float) '4');
        float float3 = contaCorrente2.getSaldo();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test2336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2336");
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
        codigos.LadoInvalidoException ladoInvalidoException92 = new codigos.LadoInvalidoException("hi!");
        ladoInvalidoException80.addSuppressed((java.lang.Throwable) ladoInvalidoException92);
        java.lang.Throwable[] throwableArray94 = ladoInvalidoException92.getSuppressed();
        java.lang.Class<?> wildcardClass95 = throwableArray94.getClass();
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
        org.junit.Assert.assertNotNull(throwableArray94);
        org.junit.Assert.assertNotNull(wildcardClass95);
    }

    @Test
    public void test2337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2337");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(1.0f, 1.0f);
        contaCorrente2.setSaldo((-45.0f));
        contaCorrente2.setLimite((float) (short) 10);
    }

    @Test
    public void test2338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2338");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(97.0f, 99.0f);
        float float3 = contaCorrente2.getSaldo();
        contaCorrente2.setLimite(10.0f);
        contaCorrente2.setLimite(0.0f);
        float float8 = contaCorrente2.getSaldo();
        contaCorrente2.setLimite((-3.0f));
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 97.0f + "'", float8 == 97.0f);
    }

    @Test
    public void test2339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2339");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", 1.0f);
        float float8 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: hi!", (float) (short) 10);
        float float12 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: hi!", (float) 2);
        float float16 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: ", 32.0f);
        float float20 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: NAO FORMA TRIANGULO", 57.0f);
        java.lang.Class<?> wildcardClass21 = pedido0.getClass();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2340");
        java.lang.String str3 = codigos.Triangulo.classificaTriangulo(1, (int) ' ', 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "NAO FORMA TRIANGULO" + "'", str3, "NAO FORMA TRIANGULO");
    }

    @Test
    public void test2341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2341");
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
        java.lang.Throwable[] throwableArray80 = ladoInvalidoException15.getSuppressed();
        java.lang.String str81 = ladoInvalidoException15.toString();
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(throwableArray40);
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertNotNull(throwableArray59);
        org.junit.Assert.assertNotNull(throwableArray74);
        org.junit.Assert.assertNotNull(throwableArray76);
        org.junit.Assert.assertNotNull(throwableArray80);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "codigos.LadoInvalidoException: " + "'", str81, "codigos.LadoInvalidoException: ");
    }

    @Test
    public void test2342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2342");
        codigos.Words words0 = new codigos.Words();
        int int2 = words0.countWords("");
        int int4 = words0.countWords("");
        int int6 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int8 = words0.countWords("codigos.LadoInvalidoException: NAO FORMA TRIANGULO");
        int int10 = words0.countWords("");
        int int12 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: NAO FORMA TRIANGULO");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test2343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2343");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 100L, (float) 10);
        float float3 = contaCorrente2.getSaldo();
        float float4 = contaCorrente2.getLimite();
        float float6 = contaCorrente2.saque((float) 1L);
        contaCorrente2.setLimite(69.0f);
        contaCorrente2.setSaldo(90.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 99.0f + "'", float6 == 99.0f);
    }

    @Test
    public void test2344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2344");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(97.0f, 99.0f);
        float float3 = contaCorrente2.getSaldo();
        contaCorrente2.setLimite(10.0f);
        float float6 = contaCorrente2.getSaldo();
        contaCorrente2.setLimite(88.0f);
        contaCorrente2.setSaldo((float) 10L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 97.0f + "'", float6 == 97.0f);
    }

    @Test
    public void test2345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2345");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (-1L), (-3.0f));
        float float3 = contaCorrente2.getLimite();
        java.lang.Class<?> wildcardClass4 = contaCorrente2.getClass();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-3.0f) + "'", float3 == (-3.0f));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2346");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(7.0f, (-3.0f));
    }

    @Test
    public void test2347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2347");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = codigos.Triangulo.classificaTriangulo((int) (byte) 0, 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type codigos.LadoInvalidoException; message: lado invalido");
        } catch (codigos.LadoInvalidoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2348");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(30.0f, (float) (short) 10);
    }

    @Test
    public void test2349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2349");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        float float3 = contaCorrente2.getLimite();
        float float4 = contaCorrente2.getLimite();
        contaCorrente2.setSaldo((float) (short) 1);
        contaCorrente2.setLimite((float) 10);
        contaCorrente2.setSaldo(67.0f);
        float float11 = contaCorrente2.getLimite();
        float float12 = contaCorrente2.getLimite();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.0f) + "'", float4 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10.0f + "'", float12 == 10.0f);
    }

    @Test
    public void test2350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2350");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (short) 0, 0.0f);
        contaCorrente2.setSaldo((float) 0L);
        contaCorrente2.setSaldo((float) (short) 1);
        float float7 = contaCorrente2.getLimite();
        float float8 = contaCorrente2.getSaldo();
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
    }

    @Test
    public void test2351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2351");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((-52.0f), (float) 10);
    }

    @Test
    public void test2352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2352");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        float float3 = contaCorrente2.getLimite();
        float float4 = contaCorrente2.getSaldo();
        contaCorrente2.setLimite((-30.0f));
        // The following exception was thrown during execution in test generation
        try {
            float float8 = contaCorrente2.saque(0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Valor invalido");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
    }

    @Test
    public void test2353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2353");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = codigos.Triangulo.classificaTriangulo((int) (short) 10, (int) (short) 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type codigos.LadoInvalidoException; message: lado invalido");
        } catch (codigos.LadoInvalidoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2354");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 0, (float) (short) 0);
        float float3 = contaCorrente2.getSaldo();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test2355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2355");
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
        codigos.LadoInvalidoException ladoInvalidoException19 = new codigos.LadoInvalidoException("codigos.LadoInvalidoException: hi!");
        codigos.LadoInvalidoException ladoInvalidoException21 = new codigos.LadoInvalidoException("hi!");
        ladoInvalidoException19.addSuppressed((java.lang.Throwable) ladoInvalidoException21);
        java.lang.Throwable[] throwableArray23 = ladoInvalidoException21.getSuppressed();
        ladoInvalidoException5.addSuppressed((java.lang.Throwable) ladoInvalidoException21);
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
        ladoInvalidoException28.addSuppressed((java.lang.Throwable) ladoInvalidoException33);
        java.lang.Throwable[] throwableArray46 = ladoInvalidoException28.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException48 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException50 = new codigos.LadoInvalidoException("");
        ladoInvalidoException48.addSuppressed((java.lang.Throwable) ladoInvalidoException50);
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
        java.lang.Throwable[] throwableArray67 = ladoInvalidoException62.getSuppressed();
        ladoInvalidoException50.addSuppressed((java.lang.Throwable) ladoInvalidoException62);
        java.lang.Throwable[] throwableArray69 = ladoInvalidoException62.getSuppressed();
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
        ladoInvalidoException62.addSuppressed((java.lang.Throwable) ladoInvalidoException80);
        java.lang.Throwable[] throwableArray87 = ladoInvalidoException80.getSuppressed();
        ladoInvalidoException28.addSuppressed((java.lang.Throwable) ladoInvalidoException80);
        java.lang.Throwable[] throwableArray89 = ladoInvalidoException80.getSuppressed();
        java.lang.Throwable[] throwableArray90 = ladoInvalidoException80.getSuppressed();
        ladoInvalidoException5.addSuppressed((java.lang.Throwable) ladoInvalidoException80);
        java.lang.Throwable[] throwableArray92 = ladoInvalidoException80.getSuppressed();
        java.lang.Class<?> wildcardClass93 = throwableArray92.getClass();
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertNotNull(throwableArray46);
        org.junit.Assert.assertNotNull(throwableArray65);
        org.junit.Assert.assertNotNull(throwableArray67);
        org.junit.Assert.assertNotNull(throwableArray69);
        org.junit.Assert.assertNotNull(throwableArray83);
        org.junit.Assert.assertNotNull(throwableArray85);
        org.junit.Assert.assertNotNull(throwableArray87);
        org.junit.Assert.assertNotNull(throwableArray89);
        org.junit.Assert.assertNotNull(throwableArray90);
        org.junit.Assert.assertNotNull(throwableArray92);
        org.junit.Assert.assertNotNull(wildcardClass93);
    }

    @Test
    public void test2356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2356");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = codigos.Triangulo.classificaTriangulo((int) (byte) -1, 0, 0);
            org.junit.Assert.fail("Expected exception of type codigos.LadoInvalidoException; message: lado invalido");
        } catch (codigos.LadoInvalidoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2357");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(55.0f, 45.0f);
        contaCorrente2.setLimite(83.0f);
    }

    @Test
    public void test2358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2358");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (short) -1, (float) 0);
        java.lang.Class<?> wildcardClass3 = contaCorrente2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2359");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        float float3 = contaCorrente2.getLimite();
        float float4 = contaCorrente2.getSaldo();
        contaCorrente2.setLimite((-30.0f));
        contaCorrente2.setSaldo(34.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
    }

    @Test
    public void test2360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2360");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = codigos.Triangulo.classificaTriangulo((int) ' ', (int) (short) -1, 10);
            org.junit.Assert.fail("Expected exception of type codigos.LadoInvalidoException; message: lado invalido");
        } catch (codigos.LadoInvalidoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2361");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((-88.0f), 52.0f);
    }

    @Test
    public void test2362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2362");
        codigos.LadoInvalidoException ladoInvalidoException1 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException3 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException5 = new codigos.LadoInvalidoException("");
        ladoInvalidoException3.addSuppressed((java.lang.Throwable) ladoInvalidoException5);
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException5);
        java.lang.Throwable[] throwableArray8 = ladoInvalidoException5.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException10 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException12 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException14 = new codigos.LadoInvalidoException("");
        ladoInvalidoException12.addSuppressed((java.lang.Throwable) ladoInvalidoException14);
        ladoInvalidoException10.addSuppressed((java.lang.Throwable) ladoInvalidoException14);
        java.lang.Throwable[] throwableArray17 = ladoInvalidoException10.getSuppressed();
        ladoInvalidoException5.addSuppressed((java.lang.Throwable) ladoInvalidoException10);
        java.lang.Throwable[] throwableArray19 = ladoInvalidoException10.getSuppressed();
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
        java.lang.Throwable[] throwableArray50 = ladoInvalidoException45.getSuppressed();
        ladoInvalidoException30.addSuppressed((java.lang.Throwable) ladoInvalidoException45);
        codigos.LadoInvalidoException ladoInvalidoException53 = new codigos.LadoInvalidoException("codigos.LadoInvalidoException: hi!");
        ladoInvalidoException45.addSuppressed((java.lang.Throwable) ladoInvalidoException53);
        java.lang.Throwable[] throwableArray55 = ladoInvalidoException53.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException57 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException59 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException61 = new codigos.LadoInvalidoException("");
        ladoInvalidoException59.addSuppressed((java.lang.Throwable) ladoInvalidoException61);
        ladoInvalidoException57.addSuppressed((java.lang.Throwable) ladoInvalidoException61);
        java.lang.Throwable[] throwableArray64 = ladoInvalidoException61.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException66 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException68 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException70 = new codigos.LadoInvalidoException("");
        ladoInvalidoException68.addSuppressed((java.lang.Throwable) ladoInvalidoException70);
        ladoInvalidoException66.addSuppressed((java.lang.Throwable) ladoInvalidoException70);
        java.lang.Throwable[] throwableArray73 = ladoInvalidoException66.getSuppressed();
        ladoInvalidoException61.addSuppressed((java.lang.Throwable) ladoInvalidoException66);
        java.lang.Throwable[] throwableArray75 = ladoInvalidoException66.getSuppressed();
        ladoInvalidoException53.addSuppressed((java.lang.Throwable) ladoInvalidoException66);
        java.lang.Throwable[] throwableArray77 = ladoInvalidoException53.getSuppressed();
        java.lang.Throwable[] throwableArray78 = ladoInvalidoException53.getSuppressed();
        ladoInvalidoException10.addSuppressed((java.lang.Throwable) ladoInvalidoException53);
        java.lang.Throwable[] throwableArray80 = ladoInvalidoException53.getSuppressed();
        java.lang.Throwable[] throwableArray81 = ladoInvalidoException53.getSuppressed();
        java.lang.Throwable[] throwableArray82 = ladoInvalidoException53.getSuppressed();
        java.lang.String str83 = ladoInvalidoException53.toString();
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(throwableArray48);
        org.junit.Assert.assertNotNull(throwableArray50);
        org.junit.Assert.assertNotNull(throwableArray55);
        org.junit.Assert.assertNotNull(throwableArray64);
        org.junit.Assert.assertNotNull(throwableArray73);
        org.junit.Assert.assertNotNull(throwableArray75);
        org.junit.Assert.assertNotNull(throwableArray77);
        org.junit.Assert.assertNotNull(throwableArray78);
        org.junit.Assert.assertNotNull(throwableArray80);
        org.junit.Assert.assertNotNull(throwableArray81);
        org.junit.Assert.assertNotNull(throwableArray82);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!" + "'", str83, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!");
    }

    @Test
    public void test2363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2363");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = codigos.Triangulo.classificaTriangulo((int) (byte) 10, (int) (short) 0, 1);
            org.junit.Assert.fail("Expected exception of type codigos.LadoInvalidoException; message: lado invalido");
        } catch (codigos.LadoInvalidoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2364");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(0.0f, (float) (short) 1);
        java.lang.Class<?> wildcardClass3 = contaCorrente2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2365");
        codigos.Words words0 = new codigos.Words();
        int int2 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int4 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int6 = words0.countWords("codigos.LadoInvalidoException: ESCALENO");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test2366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2366");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 100L, (float) 10);
        float float3 = contaCorrente2.getSaldo();
        float float4 = contaCorrente2.getLimite();
        contaCorrente2.setLimite(99.0f);
        contaCorrente2.setLimite(65.0f);
        float float9 = contaCorrente2.getLimite();
        contaCorrente2.setLimite(8.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 65.0f + "'", float9 == 65.0f);
    }

    @Test
    public void test2367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2367");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((-68.0f), (float) 0L);
        float float3 = contaCorrente2.getLimite();
        contaCorrente2.setSaldo(87.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test2368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2368");
        codigos.Words words0 = new codigos.Words();
        int int2 = words0.countWords("");
        int int4 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!");
        int int6 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        int int8 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int10 = words0.countWords("hi!");
        int int12 = words0.countWords("NAO FORMA TRIANGULO");
        int int14 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
    }

    @Test
    public void test2369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2369");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        float float3 = contaCorrente2.getSaldo();
        contaCorrente2.setSaldo(100.0f);
        float float6 = contaCorrente2.getLimite();
        contaCorrente2.setSaldo((float) (byte) -1);
        contaCorrente2.setLimite((float) (short) 0);
        float float11 = contaCorrente2.getSaldo();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-1.0f) + "'", float6 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + (-1.0f) + "'", float11 == (-1.0f));
    }

    @Test
    public void test2370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2370");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(99.0f, (float) 'a');
        float float3 = contaCorrente2.getLimite();
        contaCorrente2.setSaldo((float) '4');
        contaCorrente2.setLimite(98.0f);
        contaCorrente2.setSaldo(45.0f);
        float float10 = contaCorrente2.getSaldo();
        contaCorrente2.setSaldo((-14.0f));
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 45.0f + "'", float10 == 45.0f);
    }

    @Test
    public void test2371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2371");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((-48.0f), (float) (byte) 1);
        contaCorrente2.setLimite((float) (short) 100);
    }

    @Test
    public void test2372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2372");
        codigos.LadoInvalidoException ladoInvalidoException1 = new codigos.LadoInvalidoException("codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        java.lang.Throwable[] throwableArray2 = ladoInvalidoException1.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException4 = new codigos.LadoInvalidoException("codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!");
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
        codigos.LadoInvalidoException ladoInvalidoException22 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException24 = new codigos.LadoInvalidoException("");
        ladoInvalidoException22.addSuppressed((java.lang.Throwable) ladoInvalidoException24);
        codigos.LadoInvalidoException ladoInvalidoException27 = new codigos.LadoInvalidoException("hi!");
        ladoInvalidoException24.addSuppressed((java.lang.Throwable) ladoInvalidoException27);
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
        ladoInvalidoException24.addSuppressed((java.lang.Throwable) ladoInvalidoException39);
        ladoInvalidoException15.addSuppressed((java.lang.Throwable) ladoInvalidoException24);
        ladoInvalidoException4.addSuppressed((java.lang.Throwable) ladoInvalidoException15);
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException15);
        codigos.LadoInvalidoException ladoInvalidoException66 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException68 = new codigos.LadoInvalidoException("");
        ladoInvalidoException66.addSuppressed((java.lang.Throwable) ladoInvalidoException68);
        codigos.LadoInvalidoException ladoInvalidoException71 = new codigos.LadoInvalidoException("hi!");
        ladoInvalidoException68.addSuppressed((java.lang.Throwable) ladoInvalidoException71);
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException71);
        java.lang.Throwable[] throwableArray74 = ladoInvalidoException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertNotNull(throwableArray57);
        org.junit.Assert.assertNotNull(throwableArray59);
        org.junit.Assert.assertNotNull(throwableArray74);
    }

    @Test
    public void test2373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2373");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) '#', 1.0f);
        contaCorrente2.setSaldo((float) (short) 10);
        float float5 = contaCorrente2.getSaldo();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10.0f + "'", float5 == 10.0f);
    }

    @Test
    public void test2374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2374");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(58.0f, 97.0f);
    }

    @Test
    public void test2375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2375");
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
        int int20 = words0.countWords("hi!");
        int int22 = words0.countWords("codigos.LadoInvalidoException: ESCALENO");
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test2376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2376");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = codigos.Triangulo.classificaTriangulo((int) ' ', (int) (short) -1, 5);
            org.junit.Assert.fail("Expected exception of type codigos.LadoInvalidoException; message: lado invalido");
        } catch (codigos.LadoInvalidoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2377");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((-32.0f), (float) 100L);
        contaCorrente2.setSaldo(0.0f);
        contaCorrente2.setSaldo(42.0f);
    }

    @Test
    public void test2378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2378");
        codigos.LadoInvalidoException ladoInvalidoException1 = new codigos.LadoInvalidoException("EQUILATERO");
        java.lang.Throwable[] throwableArray2 = ladoInvalidoException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
    }

    @Test
    public void test2379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2379");
        java.lang.String str3 = codigos.Triangulo.classificaTriangulo(4, (int) (byte) 100, (int) '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "NAO FORMA TRIANGULO" + "'", str3, "NAO FORMA TRIANGULO");
    }

    @Test
    public void test2380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2380");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (-1L), (float) (byte) -1);
        contaCorrente2.setLimite(90.0f);
        contaCorrente2.setLimite(65.0f);
        java.lang.Class<?> wildcardClass7 = contaCorrente2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2381");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = codigos.Triangulo.classificaTriangulo((-1), (int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type codigos.LadoInvalidoException; message: lado invalido");
        } catch (codigos.LadoInvalidoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2382");
        codigos.LadoInvalidoException ladoInvalidoException1 = new codigos.LadoInvalidoException("codigos.LadoInvalidoException: hi!");
        java.lang.Throwable[] throwableArray2 = ladoInvalidoException1.getSuppressed();
        java.lang.Throwable[] throwableArray3 = ladoInvalidoException1.getSuppressed();
        java.lang.String str4 = ladoInvalidoException1.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!" + "'", str4, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!");
    }

    @Test
    public void test2383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2383");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", 1.0f);
        float float8 = pedido0.calculaTaxaDesconto(false, "NAO FORMA TRIANGULO", 10.0f);
        float float12 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: ", (float) (-1L));
        float float16 = pedido0.calculaTaxaDesconto(false, "NAO FORMA TRIANGULO", (-10.0f));
        float float20 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: ", (float) 100);
        float float24 = pedido0.calculaTaxaDesconto(true, "ISOSCELES", (float) 0);
        float float28 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ", 89.0f);
        float float32 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: EQUILATERO", (float) 4);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 10.0f + "'", float24 == 10.0f);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 0.0f + "'", float28 == 0.0f);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 0.0f + "'", float32 == 0.0f);
    }

    @Test
    public void test2384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2384");
        codigos.LadoInvalidoException ladoInvalidoException1 = new codigos.LadoInvalidoException("");
        java.lang.Throwable[] throwableArray2 = ladoInvalidoException1.getSuppressed();
        java.lang.Throwable[] throwableArray3 = ladoInvalidoException1.getSuppressed();
        java.lang.String str4 = ladoInvalidoException1.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "codigos.LadoInvalidoException: " + "'", str4, "codigos.LadoInvalidoException: ");
    }

    @Test
    public void test2385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2385");
        java.lang.String str3 = codigos.Triangulo.classificaTriangulo((int) (byte) 10, (int) (short) 100, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "NAO FORMA TRIANGULO" + "'", str3, "NAO FORMA TRIANGULO");
    }

    @Test
    public void test2386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2386");
        java.lang.String str3 = codigos.Triangulo.classificaTriangulo(3, (int) 'a', (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "NAO FORMA TRIANGULO" + "'", str3, "NAO FORMA TRIANGULO");
    }

    @Test
    public void test2387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2387");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: ", (float) (short) 10);
        float float8 = pedido0.calculaTaxaDesconto(false, "NAO FORMA TRIANGULO", (float) 'a');
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
    }

    @Test
    public void test2388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2388");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(99.0f, (float) 'a');
        float float3 = contaCorrente2.getLimite();
        contaCorrente2.setSaldo((float) 100);
        float float6 = contaCorrente2.getLimite();
        float float7 = contaCorrente2.getSaldo();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 97.0f + "'", float6 == 97.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
    }

    @Test
    public void test2389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2389");
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
        java.lang.Throwable[] throwableArray57 = ladoInvalidoException15.getSuppressed();
        java.lang.String str58 = ladoInvalidoException15.toString();
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertNotNull(throwableArray53);
        org.junit.Assert.assertNotNull(throwableArray55);
        org.junit.Assert.assertNotNull(throwableArray57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "codigos.LadoInvalidoException: " + "'", str58, "codigos.LadoInvalidoException: ");
    }

    @Test
    public void test2390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2390");
        java.lang.String str3 = codigos.Triangulo.classificaTriangulo((int) (byte) 10, (int) (short) 10, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "NAO FORMA TRIANGULO" + "'", str3, "NAO FORMA TRIANGULO");
    }

    @Test
    public void test2391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2391");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(65.0f, (-14.0f));
        // The following exception was thrown during execution in test generation
        try {
            float float4 = contaCorrente2.saque(0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Valor invalido");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
    }

    @Test
    public void test2392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2392");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(87.0f, (-45.0f));
    }

    @Test
    public void test2393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2393");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(32.0f, (-52.0f));
    }

    @Test
    public void test2394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2394");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 0, (float) (short) 0);
        contaCorrente2.setLimite((float) 4);
        // The following exception was thrown during execution in test generation
        try {
            float float6 = contaCorrente2.saque(30.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Saldo Insuficiente");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
    }

    @Test
    public void test2395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2395");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(32.0f, (-32.0f));
        contaCorrente2.setSaldo(99.0f);
        contaCorrente2.setSaldo((-9.0f));
        contaCorrente2.setLimite(0.0f);
        contaCorrente2.setLimite(31.0f);
    }

    @Test
    public void test2396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2396");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(90.0f, (float) (-1));
        contaCorrente2.setLimite((float) 0);
        contaCorrente2.setSaldo(98.0f);
        float float7 = contaCorrente2.getLimite();
        float float9 = contaCorrente2.saque(2.0f);
        float float11 = contaCorrente2.saque(8.0f);
        contaCorrente2.setLimite(45.0f);
        float float14 = contaCorrente2.getSaldo();
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 96.0f + "'", float9 == 96.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 88.0f + "'", float11 == 88.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 88.0f + "'", float14 == 88.0f);
    }

    @Test
    public void test2397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2397");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", (float) (short) -1);
        float float8 = pedido0.calculaTaxaDesconto(true, "NAO FORMA TRIANGULO", (float) (byte) 0);
        float float12 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: hi!", (float) (short) 100);
        float float16 = pedido0.calculaTaxaDesconto(false, "ESCALENO", 89.0f);
        float float20 = pedido0.calculaTaxaDesconto(false, "ESCALENO", 52.0f);
        float float24 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!", (float) '#');
        float float28 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: NAO FORMA TRIANGULO", (-2.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10.0f + "'", float12 == 10.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.0f + "'", float24 == 0.0f);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 0.0f + "'", float28 == 0.0f);
    }

    @Test
    public void test2398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2398");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((-45.0f), 32.0f);
    }

    @Test
    public void test2399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2399");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(32.0f, 10.0f);
        float float3 = contaCorrente2.getSaldo();
        contaCorrente2.setSaldo(3.0f);
        float float6 = contaCorrente2.getLimite();
        float float7 = contaCorrente2.getSaldo();
        contaCorrente2.setLimite((float) ' ');
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 32.0f + "'", float3 == 32.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 3.0f + "'", float7 == 3.0f);
    }

    @Test
    public void test2400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2400");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(51.0f, (-50.0f));
        float float3 = contaCorrente2.getLimite();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-50.0f) + "'", float3 == (-50.0f));
    }

    @Test
    public void test2401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2401");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 0, (float) 10);
    }

    @Test
    public void test2402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2402");
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
        codigos.LadoInvalidoException ladoInvalidoException52 = new codigos.LadoInvalidoException("hi!");
        codigos.LadoInvalidoException ladoInvalidoException54 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException56 = new codigos.LadoInvalidoException("");
        ladoInvalidoException54.addSuppressed((java.lang.Throwable) ladoInvalidoException56);
        codigos.LadoInvalidoException ladoInvalidoException59 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException61 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException63 = new codigos.LadoInvalidoException("");
        ladoInvalidoException61.addSuppressed((java.lang.Throwable) ladoInvalidoException63);
        ladoInvalidoException59.addSuppressed((java.lang.Throwable) ladoInvalidoException63);
        java.lang.Throwable[] throwableArray66 = ladoInvalidoException63.getSuppressed();
        ladoInvalidoException56.addSuppressed((java.lang.Throwable) ladoInvalidoException63);
        ladoInvalidoException52.addSuppressed((java.lang.Throwable) ladoInvalidoException63);
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
        ladoInvalidoException52.addSuppressed((java.lang.Throwable) ladoInvalidoException74);
        java.lang.Throwable[] throwableArray89 = ladoInvalidoException74.getSuppressed();
        java.lang.Throwable[] throwableArray90 = ladoInvalidoException74.getSuppressed();
        ladoInvalidoException40.addSuppressed((java.lang.Throwable) ladoInvalidoException74);
        java.lang.Throwable[] throwableArray92 = ladoInvalidoException74.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertNotNull(throwableArray45);
        org.junit.Assert.assertNotNull(throwableArray47);
        org.junit.Assert.assertNotNull(throwableArray48);
        org.junit.Assert.assertNotNull(throwableArray66);
        org.junit.Assert.assertNotNull(throwableArray77);
        org.junit.Assert.assertNotNull(throwableArray87);
        org.junit.Assert.assertNotNull(throwableArray89);
        org.junit.Assert.assertNotNull(throwableArray90);
        org.junit.Assert.assertNotNull(throwableArray92);
    }

    @Test
    public void test2403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2403");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        float float3 = contaCorrente2.getSaldo();
        contaCorrente2.setSaldo(100.0f);
        contaCorrente2.setLimite(10.0f);
        float float9 = contaCorrente2.saque((float) 1L);
        contaCorrente2.setLimite((float) (short) 100);
        contaCorrente2.setSaldo(90.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 99.0f + "'", float9 == 99.0f);
    }

    @Test
    public void test2404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2404");
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
        codigos.LadoInvalidoException ladoInvalidoException37 = new codigos.LadoInvalidoException("hi!");
        java.lang.Throwable[] throwableArray38 = ladoInvalidoException37.getSuppressed();
        ladoInvalidoException10.addSuppressed((java.lang.Throwable) ladoInvalidoException37);
        java.lang.String str40 = ladoInvalidoException10.toString();
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "codigos.LadoInvalidoException: " + "'", str40, "codigos.LadoInvalidoException: ");
    }

    @Test
    public void test2405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2405");
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
        float float17 = contaCorrente2.getLimite();
        // The following exception was thrown during execution in test generation
        try {
            float float19 = contaCorrente2.saque(100.0f);
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
    public void test2406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2406");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (short) -1, (-41.0f));
        contaCorrente2.setLimite(45.0f);
        contaCorrente2.setLimite((float) 5);
        contaCorrente2.setSaldo(0.0f);
        // The following exception was thrown during execution in test generation
        try {
            float float10 = contaCorrente2.saque((-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Valor invalido");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
    }

    @Test
    public void test2407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2407");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        float float3 = contaCorrente2.getLimite();
        float float4 = contaCorrente2.getLimite();
        float float5 = contaCorrente2.getSaldo();
        float float6 = contaCorrente2.getSaldo();
        float float7 = contaCorrente2.getLimite();
        contaCorrente2.setLimite(2.0f);
        float float10 = contaCorrente2.getLimite();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.0f) + "'", float4 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 100.0f + "'", float5 == 100.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-1.0f) + "'", float7 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 2.0f + "'", float10 == 2.0f);
    }

    @Test
    public void test2408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2408");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", 1.0f);
        float float8 = pedido0.calculaTaxaDesconto(false, "hi!", (float) (short) 10);
        float float12 = pedido0.calculaTaxaDesconto(true, "", 100.0f);
        float float16 = pedido0.calculaTaxaDesconto(true, "ISOSCELES", (float) 0);
        float float20 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!", (-56.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10.0f + "'", float12 == 10.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 10.0f + "'", float20 == 10.0f);
    }

    @Test
    public void test2409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2409");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        float float3 = contaCorrente2.getLimite();
        float float4 = contaCorrente2.getSaldo();
        float float5 = contaCorrente2.getLimite();
        float float6 = contaCorrente2.getSaldo();
        contaCorrente2.setLimite((float) (byte) 10);
        contaCorrente2.setSaldo((float) 100L);
        contaCorrente2.setSaldo((float) 0L);
        contaCorrente2.setLimite(1.0f);
        // The following exception was thrown during execution in test generation
        try {
            float float16 = contaCorrente2.saque(12.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Saldo Insuficiente");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
    }

    @Test
    public void test2410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2410");
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
        codigos.LadoInvalidoException ladoInvalidoException39 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException41 = new codigos.LadoInvalidoException("");
        ladoInvalidoException39.addSuppressed((java.lang.Throwable) ladoInvalidoException41);
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
        ladoInvalidoException41.addSuppressed((java.lang.Throwable) ladoInvalidoException46);
        java.lang.Throwable[] throwableArray59 = ladoInvalidoException41.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException61 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException63 = new codigos.LadoInvalidoException("");
        ladoInvalidoException61.addSuppressed((java.lang.Throwable) ladoInvalidoException63);
        codigos.LadoInvalidoException ladoInvalidoException66 = new codigos.LadoInvalidoException("hi!");
        ladoInvalidoException63.addSuppressed((java.lang.Throwable) ladoInvalidoException66);
        ladoInvalidoException41.addSuppressed((java.lang.Throwable) ladoInvalidoException66);
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException41);
        java.lang.Class<?> wildcardClass70 = ladoInvalidoException1.getClass();
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray56);
        org.junit.Assert.assertNotNull(throwableArray59);
        org.junit.Assert.assertNotNull(wildcardClass70);
    }

    @Test
    public void test2411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2411");
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
        java.lang.Throwable[] throwableArray57 = ladoInvalidoException50.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException59 = new codigos.LadoInvalidoException("codigos.LadoInvalidoException: hi!");
        java.lang.Throwable[] throwableArray60 = ladoInvalidoException59.getSuppressed();
        ladoInvalidoException50.addSuppressed((java.lang.Throwable) ladoInvalidoException59);
        java.lang.Throwable[] throwableArray62 = ladoInvalidoException50.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertNotNull(throwableArray53);
        org.junit.Assert.assertNotNull(throwableArray55);
        org.junit.Assert.assertNotNull(throwableArray57);
        org.junit.Assert.assertNotNull(throwableArray60);
        org.junit.Assert.assertNotNull(throwableArray62);
    }

    @Test
    public void test2412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2412");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", 1.0f);
        float float8 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: hi!", (float) (short) 10);
        float float12 = pedido0.calculaTaxaDesconto(true, "NAO FORMA TRIANGULO", (float) 0L);
        float float16 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ", 65.0f);
        float float20 = pedido0.calculaTaxaDesconto(false, "NAO FORMA TRIANGULO", (-87.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10.0f + "'", float12 == 10.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
    }

    @Test
    public void test2413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2413");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (short) -1, (-41.0f));
        contaCorrente2.setLimite(45.0f);
        contaCorrente2.setLimite((float) 5);
        contaCorrente2.setSaldo(0.0f);
        java.lang.Class<?> wildcardClass9 = contaCorrente2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2414");
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
        codigos.LadoInvalidoException ladoInvalidoException50 = new codigos.LadoInvalidoException("codigos.LadoInvalidoException: hi!");
        ladoInvalidoException42.addSuppressed((java.lang.Throwable) ladoInvalidoException50);
        java.lang.Throwable[] throwableArray52 = ladoInvalidoException42.getSuppressed();
        ladoInvalidoException10.addSuppressed((java.lang.Throwable) ladoInvalidoException42);
        codigos.LadoInvalidoException ladoInvalidoException55 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException57 = new codigos.LadoInvalidoException("");
        ladoInvalidoException55.addSuppressed((java.lang.Throwable) ladoInvalidoException57);
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
        ladoInvalidoException57.addSuppressed((java.lang.Throwable) ladoInvalidoException69);
        java.lang.Throwable[] throwableArray76 = ladoInvalidoException69.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException78 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException80 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException82 = new codigos.LadoInvalidoException("");
        ladoInvalidoException80.addSuppressed((java.lang.Throwable) ladoInvalidoException82);
        ladoInvalidoException78.addSuppressed((java.lang.Throwable) ladoInvalidoException82);
        java.lang.Throwable[] throwableArray85 = ladoInvalidoException82.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException87 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException89 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException91 = new codigos.LadoInvalidoException("");
        ladoInvalidoException89.addSuppressed((java.lang.Throwable) ladoInvalidoException91);
        ladoInvalidoException87.addSuppressed((java.lang.Throwable) ladoInvalidoException91);
        java.lang.Throwable[] throwableArray94 = ladoInvalidoException87.getSuppressed();
        ladoInvalidoException82.addSuppressed((java.lang.Throwable) ladoInvalidoException87);
        ladoInvalidoException69.addSuppressed((java.lang.Throwable) ladoInvalidoException82);
        ladoInvalidoException42.addSuppressed((java.lang.Throwable) ladoInvalidoException69);
        java.lang.String str98 = ladoInvalidoException69.toString();
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray45);
        org.junit.Assert.assertNotNull(throwableArray47);
        org.junit.Assert.assertNotNull(throwableArray52);
        org.junit.Assert.assertNotNull(throwableArray72);
        org.junit.Assert.assertNotNull(throwableArray74);
        org.junit.Assert.assertNotNull(throwableArray76);
        org.junit.Assert.assertNotNull(throwableArray85);
        org.junit.Assert.assertNotNull(throwableArray94);
        org.junit.Assert.assertEquals("'" + str98 + "' != '" + "codigos.LadoInvalidoException: " + "'", str98, "codigos.LadoInvalidoException: ");
    }

    @Test
    public void test2415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2415");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((-10.0f), 73.0f);
    }

    @Test
    public void test2416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2416");
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
        codigos.LadoInvalidoException ladoInvalidoException32 = new codigos.LadoInvalidoException("");
        ladoInvalidoException30.addSuppressed((java.lang.Throwable) ladoInvalidoException32);
        ladoInvalidoException28.addSuppressed((java.lang.Throwable) ladoInvalidoException32);
        java.lang.Throwable[] throwableArray35 = ladoInvalidoException32.getSuppressed();
        ladoInvalidoException25.addSuppressed((java.lang.Throwable) ladoInvalidoException32);
        codigos.LadoInvalidoException ladoInvalidoException38 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException40 = new codigos.LadoInvalidoException("");
        ladoInvalidoException38.addSuppressed((java.lang.Throwable) ladoInvalidoException40);
        codigos.LadoInvalidoException ladoInvalidoException43 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException45 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException47 = new codigos.LadoInvalidoException("");
        ladoInvalidoException45.addSuppressed((java.lang.Throwable) ladoInvalidoException47);
        ladoInvalidoException43.addSuppressed((java.lang.Throwable) ladoInvalidoException47);
        java.lang.Throwable[] throwableArray50 = ladoInvalidoException47.getSuppressed();
        ladoInvalidoException40.addSuppressed((java.lang.Throwable) ladoInvalidoException47);
        java.lang.Throwable[] throwableArray52 = ladoInvalidoException47.getSuppressed();
        ladoInvalidoException32.addSuppressed((java.lang.Throwable) ladoInvalidoException47);
        ladoInvalidoException3.addSuppressed((java.lang.Throwable) ladoInvalidoException47);
        codigos.LadoInvalidoException ladoInvalidoException56 = new codigos.LadoInvalidoException("codigos.LadoInvalidoException: hi!");
        codigos.LadoInvalidoException ladoInvalidoException58 = new codigos.LadoInvalidoException("hi!");
        ladoInvalidoException56.addSuppressed((java.lang.Throwable) ladoInvalidoException58);
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
        ladoInvalidoException70.addSuppressed((java.lang.Throwable) ladoInvalidoException85);
        codigos.LadoInvalidoException ladoInvalidoException93 = new codigos.LadoInvalidoException("codigos.LadoInvalidoException: hi!");
        ladoInvalidoException85.addSuppressed((java.lang.Throwable) ladoInvalidoException93);
        ladoInvalidoException58.addSuppressed((java.lang.Throwable) ladoInvalidoException93);
        java.lang.Throwable[] throwableArray96 = ladoInvalidoException93.getSuppressed();
        ladoInvalidoException47.addSuppressed((java.lang.Throwable) ladoInvalidoException93);
        java.lang.String str98 = ladoInvalidoException47.toString();
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray50);
        org.junit.Assert.assertNotNull(throwableArray52);
        org.junit.Assert.assertNotNull(throwableArray73);
        org.junit.Assert.assertNotNull(throwableArray88);
        org.junit.Assert.assertNotNull(throwableArray90);
        org.junit.Assert.assertNotNull(throwableArray96);
        org.junit.Assert.assertEquals("'" + str98 + "' != '" + "codigos.LadoInvalidoException: " + "'", str98, "codigos.LadoInvalidoException: ");
    }

    @Test
    public void test2417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2417");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((-48.0f), 30.0f);
    }

    @Test
    public void test2418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2418");
        codigos.LadoInvalidoException ladoInvalidoException1 = new codigos.LadoInvalidoException("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        java.lang.Throwable[] throwableArray2 = ladoInvalidoException1.getSuppressed();
        java.lang.Throwable[] throwableArray3 = ladoInvalidoException1.getSuppressed();
        java.lang.String str4 = ladoInvalidoException1.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: " + "'", str4, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
    }

    @Test
    public void test2419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2419");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((-52.0f), (-57.0f));
        contaCorrente2.setSaldo((-10.0f));
    }

    @Test
    public void test2420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2420");
        codigos.LadoInvalidoException ladoInvalidoException1 = new codigos.LadoInvalidoException("ESCALENO");
        java.lang.Throwable[] throwableArray2 = ladoInvalidoException1.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException4 = new codigos.LadoInvalidoException("");
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException4);
        java.lang.Throwable[] throwableArray6 = ladoInvalidoException4.getSuppressed();
        java.lang.String str7 = ladoInvalidoException4.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "codigos.LadoInvalidoException: " + "'", str7, "codigos.LadoInvalidoException: ");
    }

    @Test
    public void test2421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2421");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(68.0f, 52.0f);
        float float3 = contaCorrente2.getLimite();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 52.0f + "'", float3 == 52.0f);
    }

    @Test
    public void test2422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2422");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(1.0f, 1.0f);
        contaCorrente2.setSaldo((float) 100);
        float float5 = contaCorrente2.getSaldo();
        float float7 = contaCorrente2.saque((float) (byte) 1);
        contaCorrente2.setSaldo(90.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 100.0f + "'", float5 == 100.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 99.0f + "'", float7 == 99.0f);
    }

    @Test
    public void test2423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2423");
        java.lang.String str3 = codigos.Triangulo.classificaTriangulo((int) '4', (int) '#', (int) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ESCALENO" + "'", str3, "ESCALENO");
    }

    @Test
    public void test2424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2424");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", (float) (short) -1);
        float float8 = pedido0.calculaTaxaDesconto(true, "NAO FORMA TRIANGULO", (float) (byte) 0);
        float float12 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: hi!", (float) (-1L));
        float float16 = pedido0.calculaTaxaDesconto(true, "", (float) (byte) 10);
        float float20 = pedido0.calculaTaxaDesconto(false, "hi!", (float) 2);
        float float24 = pedido0.calculaTaxaDesconto(true, "ISOSCELES", 100.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 10.0f + "'", float24 == 10.0f);
    }

    @Test
    public void test2425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2425");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(0.0f, (-31.0f));
    }

    @Test
    public void test2426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2426");
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
        java.lang.Throwable[] throwableArray67 = ladoInvalidoException46.getSuppressed();
        java.lang.Throwable[] throwableArray68 = ladoInvalidoException46.getSuppressed();
        java.lang.Throwable throwable69 = null;
        // The following exception was thrown during execution in test generation
        try {
            ladoInvalidoException46.addSuppressed(throwable69);
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
        org.junit.Assert.assertNotNull(throwableArray67);
        org.junit.Assert.assertNotNull(throwableArray68);
    }

    @Test
    public void test2427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2427");
        java.lang.String str3 = codigos.Triangulo.classificaTriangulo(3, 1, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "NAO FORMA TRIANGULO" + "'", str3, "NAO FORMA TRIANGULO");
    }

    @Test
    public void test2428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2428");
        codigos.LadoInvalidoException ladoInvalidoException1 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException3 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException5 = new codigos.LadoInvalidoException("");
        ladoInvalidoException3.addSuppressed((java.lang.Throwable) ladoInvalidoException5);
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException5);
        java.lang.Throwable[] throwableArray8 = ladoInvalidoException5.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException10 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException12 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException14 = new codigos.LadoInvalidoException("");
        ladoInvalidoException12.addSuppressed((java.lang.Throwable) ladoInvalidoException14);
        ladoInvalidoException10.addSuppressed((java.lang.Throwable) ladoInvalidoException14);
        java.lang.Throwable[] throwableArray17 = ladoInvalidoException10.getSuppressed();
        ladoInvalidoException5.addSuppressed((java.lang.Throwable) ladoInvalidoException10);
        java.lang.Throwable[] throwableArray19 = ladoInvalidoException10.getSuppressed();
        java.lang.Throwable[] throwableArray20 = ladoInvalidoException10.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray20);
    }

    @Test
    public void test2429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2429");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = codigos.Triangulo.classificaTriangulo((int) (short) 100, (int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type codigos.LadoInvalidoException; message: lado invalido");
        } catch (codigos.LadoInvalidoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2430");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((-88.0f), (-10.0f));
    }

    @Test
    public void test2431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2431");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(1.0f, 42.0f);
        float float3 = contaCorrente2.getLimite();
        contaCorrente2.setLimite(1.0f);
        java.lang.Class<?> wildcardClass6 = contaCorrente2.getClass();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 42.0f + "'", float3 == 42.0f);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2432");
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
        java.lang.Throwable[] throwableArray39 = ladoInvalidoException34.getSuppressed();
        ladoInvalidoException19.addSuppressed((java.lang.Throwable) ladoInvalidoException34);
        codigos.LadoInvalidoException ladoInvalidoException42 = new codigos.LadoInvalidoException("codigos.LadoInvalidoException: hi!");
        ladoInvalidoException34.addSuppressed((java.lang.Throwable) ladoInvalidoException42);
        java.lang.Throwable[] throwableArray44 = ladoInvalidoException42.getSuppressed();
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException42);
        java.lang.Throwable[] throwableArray46 = ladoInvalidoException42.getSuppressed();
        java.lang.Throwable[] throwableArray47 = ladoInvalidoException42.getSuppressed();
        java.lang.Throwable[] throwableArray48 = ladoInvalidoException42.getSuppressed();
        java.lang.Throwable[] throwableArray49 = ladoInvalidoException42.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertNotNull(throwableArray46);
        org.junit.Assert.assertNotNull(throwableArray47);
        org.junit.Assert.assertNotNull(throwableArray48);
        org.junit.Assert.assertNotNull(throwableArray49);
    }

    @Test
    public void test2433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2433");
        codigos.LadoInvalidoException ladoInvalidoException1 = new codigos.LadoInvalidoException("codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        java.lang.Throwable[] throwableArray2 = ladoInvalidoException1.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException4 = new codigos.LadoInvalidoException("codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!");
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
        codigos.LadoInvalidoException ladoInvalidoException22 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException24 = new codigos.LadoInvalidoException("");
        ladoInvalidoException22.addSuppressed((java.lang.Throwable) ladoInvalidoException24);
        codigos.LadoInvalidoException ladoInvalidoException27 = new codigos.LadoInvalidoException("hi!");
        ladoInvalidoException24.addSuppressed((java.lang.Throwable) ladoInvalidoException27);
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
        ladoInvalidoException24.addSuppressed((java.lang.Throwable) ladoInvalidoException39);
        ladoInvalidoException15.addSuppressed((java.lang.Throwable) ladoInvalidoException24);
        ladoInvalidoException4.addSuppressed((java.lang.Throwable) ladoInvalidoException15);
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException15);
        java.lang.Throwable[] throwableArray65 = ladoInvalidoException15.getSuppressed();
        java.lang.Throwable[] throwableArray66 = ladoInvalidoException15.getSuppressed();
        java.lang.Throwable[] throwableArray67 = ladoInvalidoException15.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertNotNull(throwableArray57);
        org.junit.Assert.assertNotNull(throwableArray59);
        org.junit.Assert.assertNotNull(throwableArray65);
        org.junit.Assert.assertNotNull(throwableArray66);
        org.junit.Assert.assertNotNull(throwableArray67);
    }

    @Test
    public void test2434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2434");
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
        contaCorrente2.setLimite((-3.0f));
        contaCorrente2.setLimite((float) (byte) 1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 30.0f + "'", float18 == 30.0f);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 10.0f + "'", float19 == 10.0f);
    }

    @Test
    public void test2435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2435");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        float float3 = contaCorrente2.getLimite();
        float float4 = contaCorrente2.getSaldo();
        float float5 = contaCorrente2.getLimite();
        contaCorrente2.setSaldo((float) (byte) 1);
        contaCorrente2.setLimite((float) 2);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
    }

    @Test
    public void test2436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2436");
        codigos.Words words0 = new codigos.Words();
        int int2 = words0.countWords("");
        int int4 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!");
        int int6 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        int int8 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int10 = words0.countWords("NAO FORMA TRIANGULO");
        int int12 = words0.countWords("EQUILATERO");
        int int14 = words0.countWords("ISOSCELES");
        int int16 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!");
        int int18 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
    }

    @Test
    public void test2437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2437");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 1L, 1.0f);
    }

    @Test
    public void test2438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2438");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((-57.0f), 44.0f);
        java.lang.Class<?> wildcardClass3 = contaCorrente2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2439");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 10, 0.0f);
        float float3 = contaCorrente2.getSaldo();
        contaCorrente2.setSaldo(10.0f);
        contaCorrente2.setSaldo((float) 1);
        contaCorrente2.setLimite((-52.0f));
        float float10 = contaCorrente2.getSaldo();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.0f + "'", float10 == 1.0f);
    }

    @Test
    public void test2440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2440");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = codigos.Triangulo.classificaTriangulo((int) (short) 0, (int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type codigos.LadoInvalidoException; message: lado invalido");
        } catch (codigos.LadoInvalidoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2441");
        java.lang.String str3 = codigos.Triangulo.classificaTriangulo((int) (short) 10, (int) (short) 10, (int) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "NAO FORMA TRIANGULO" + "'", str3, "NAO FORMA TRIANGULO");
    }

    @Test
    public void test2442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2442");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (short) -1, 97.0f);
        contaCorrente2.setSaldo(65.0f);
        contaCorrente2.setLimite(78.0f);
        float float7 = contaCorrente2.getSaldo();
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 65.0f + "'", float7 == 65.0f);
    }

    @Test
    public void test2443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2443");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        float float3 = contaCorrente2.getLimite();
        float float4 = contaCorrente2.getLimite();
        contaCorrente2.setSaldo(88.0f);
        float float7 = contaCorrente2.getSaldo();
        contaCorrente2.setLimite(52.0f);
        contaCorrente2.setSaldo((-3.0f));
        java.lang.Class<?> wildcardClass12 = contaCorrente2.getClass();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.0f) + "'", float4 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 88.0f + "'", float7 == 88.0f);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2444");
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
        java.lang.Throwable[] throwableArray44 = ladoInvalidoException15.getSuppressed();
        java.lang.Throwable[] throwableArray45 = ladoInvalidoException15.getSuppressed();
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
        codigos.LadoInvalidoException ladoInvalidoException87 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException89 = new codigos.LadoInvalidoException("");
        ladoInvalidoException87.addSuppressed((java.lang.Throwable) ladoInvalidoException89);
        codigos.LadoInvalidoException ladoInvalidoException92 = new codigos.LadoInvalidoException("hi!");
        ladoInvalidoException89.addSuppressed((java.lang.Throwable) ladoInvalidoException92);
        ladoInvalidoException61.addSuppressed((java.lang.Throwable) ladoInvalidoException89);
        ladoInvalidoException15.addSuppressed((java.lang.Throwable) ladoInvalidoException89);
        java.lang.Throwable[] throwableArray96 = ladoInvalidoException89.getSuppressed();
        java.lang.Class<?> wildcardClass97 = throwableArray96.getClass();
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(throwableArray40);
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertNotNull(throwableArray45);
        org.junit.Assert.assertNotNull(throwableArray64);
        org.junit.Assert.assertNotNull(throwableArray66);
        org.junit.Assert.assertNotNull(throwableArray68);
        org.junit.Assert.assertNotNull(throwableArray82);
        org.junit.Assert.assertNotNull(throwableArray84);
        org.junit.Assert.assertNotNull(throwableArray96);
        org.junit.Assert.assertNotNull(wildcardClass97);
    }

    @Test
    public void test2445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2445");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((-10.0f), (float) (short) 10);
        contaCorrente2.setSaldo(0.0f);
        float float5 = contaCorrente2.getSaldo();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
    }

    @Test
    public void test2446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2446");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(91.0f, (float) (short) 1);
    }

    @Test
    public void test2447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2447");
        codigos.LadoInvalidoException ladoInvalidoException1 = new codigos.LadoInvalidoException("NAO FORMA TRIANGULO");
        codigos.LadoInvalidoException ladoInvalidoException3 = new codigos.LadoInvalidoException("codigos.LadoInvalidoException: hi!");
        codigos.LadoInvalidoException ladoInvalidoException5 = new codigos.LadoInvalidoException("hi!");
        ladoInvalidoException3.addSuppressed((java.lang.Throwable) ladoInvalidoException5);
        codigos.LadoInvalidoException ladoInvalidoException8 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException10 = new codigos.LadoInvalidoException("");
        ladoInvalidoException8.addSuppressed((java.lang.Throwable) ladoInvalidoException10);
        codigos.LadoInvalidoException ladoInvalidoException13 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException15 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException17 = new codigos.LadoInvalidoException("");
        ladoInvalidoException15.addSuppressed((java.lang.Throwable) ladoInvalidoException17);
        ladoInvalidoException13.addSuppressed((java.lang.Throwable) ladoInvalidoException17);
        java.lang.Throwable[] throwableArray20 = ladoInvalidoException17.getSuppressed();
        ladoInvalidoException10.addSuppressed((java.lang.Throwable) ladoInvalidoException17);
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
        ladoInvalidoException17.addSuppressed((java.lang.Throwable) ladoInvalidoException32);
        codigos.LadoInvalidoException ladoInvalidoException40 = new codigos.LadoInvalidoException("codigos.LadoInvalidoException: hi!");
        ladoInvalidoException32.addSuppressed((java.lang.Throwable) ladoInvalidoException40);
        ladoInvalidoException5.addSuppressed((java.lang.Throwable) ladoInvalidoException40);
        java.lang.Throwable[] throwableArray43 = ladoInvalidoException40.getSuppressed();
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
        ladoInvalidoException40.addSuppressed((java.lang.Throwable) ladoInvalidoException54);
        java.lang.Throwable[] throwableArray60 = ladoInvalidoException40.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException62 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException64 = new codigos.LadoInvalidoException("");
        ladoInvalidoException62.addSuppressed((java.lang.Throwable) ladoInvalidoException64);
        codigos.LadoInvalidoException ladoInvalidoException67 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException69 = new codigos.LadoInvalidoException("");
        ladoInvalidoException67.addSuppressed((java.lang.Throwable) ladoInvalidoException69);
        codigos.LadoInvalidoException ladoInvalidoException72 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException74 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException76 = new codigos.LadoInvalidoException("");
        ladoInvalidoException74.addSuppressed((java.lang.Throwable) ladoInvalidoException76);
        ladoInvalidoException72.addSuppressed((java.lang.Throwable) ladoInvalidoException76);
        java.lang.Throwable[] throwableArray79 = ladoInvalidoException76.getSuppressed();
        ladoInvalidoException69.addSuppressed((java.lang.Throwable) ladoInvalidoException76);
        ladoInvalidoException64.addSuppressed((java.lang.Throwable) ladoInvalidoException69);
        java.lang.Throwable[] throwableArray82 = ladoInvalidoException64.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException84 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException86 = new codigos.LadoInvalidoException("");
        ladoInvalidoException84.addSuppressed((java.lang.Throwable) ladoInvalidoException86);
        codigos.LadoInvalidoException ladoInvalidoException89 = new codigos.LadoInvalidoException("hi!");
        ladoInvalidoException86.addSuppressed((java.lang.Throwable) ladoInvalidoException89);
        ladoInvalidoException64.addSuppressed((java.lang.Throwable) ladoInvalidoException89);
        codigos.LadoInvalidoException ladoInvalidoException93 = new codigos.LadoInvalidoException("codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        ladoInvalidoException89.addSuppressed((java.lang.Throwable) ladoInvalidoException93);
        java.lang.Throwable[] throwableArray95 = ladoInvalidoException89.getSuppressed();
        java.lang.Throwable[] throwableArray96 = ladoInvalidoException89.getSuppressed();
        ladoInvalidoException40.addSuppressed((java.lang.Throwable) ladoInvalidoException89);
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException89);
        java.lang.Throwable[] throwableArray99 = ladoInvalidoException89.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertNotNull(throwableArray57);
        org.junit.Assert.assertNotNull(throwableArray60);
        org.junit.Assert.assertNotNull(throwableArray79);
        org.junit.Assert.assertNotNull(throwableArray82);
        org.junit.Assert.assertNotNull(throwableArray95);
        org.junit.Assert.assertNotNull(throwableArray96);
        org.junit.Assert.assertNotNull(throwableArray99);
    }

    @Test
    public void test2448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2448");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 10, 0.0f);
        float float3 = contaCorrente2.getSaldo();
        float float5 = contaCorrente2.saque(1.0f);
        contaCorrente2.setLimite(10.0f);
        float float8 = contaCorrente2.getSaldo();
        contaCorrente2.setLimite((float) 1L);
        float float11 = contaCorrente2.getSaldo();
        // The following exception was thrown during execution in test generation
        try {
            float float13 = contaCorrente2.saque((float) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Saldo Insuficiente");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 9.0f + "'", float5 == 9.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 9.0f + "'", float8 == 9.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 9.0f + "'", float11 == 9.0f);
    }

    @Test
    public void test2449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2449");
        java.lang.String str3 = codigos.Triangulo.classificaTriangulo(4, (int) (byte) 10, 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "NAO FORMA TRIANGULO" + "'", str3, "NAO FORMA TRIANGULO");
    }

    @Test
    public void test2450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2450");
        java.lang.String str3 = codigos.Triangulo.classificaTriangulo((int) (short) 1, (int) '#', (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "NAO FORMA TRIANGULO" + "'", str3, "NAO FORMA TRIANGULO");
    }

    @Test
    public void test2451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2451");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 10, 97.0f);
        contaCorrente2.setLimite((float) (-1L));
        // The following exception was thrown during execution in test generation
        try {
            float float6 = contaCorrente2.saque((-88.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Valor invalido");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
    }

    @Test
    public void test2452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2452");
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
        contaCorrente2.setLimite(67.0f);
        java.lang.Class<?> wildcardClass20 = contaCorrente2.getClass();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 100.0f + "'", float15 == 100.0f);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + (-87.0f) + "'", float17 == (-87.0f));
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2453");
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
        codigos.LadoInvalidoException ladoInvalidoException77 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException79 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException81 = new codigos.LadoInvalidoException("");
        ladoInvalidoException79.addSuppressed((java.lang.Throwable) ladoInvalidoException81);
        ladoInvalidoException77.addSuppressed((java.lang.Throwable) ladoInvalidoException81);
        java.lang.Throwable[] throwableArray84 = ladoInvalidoException81.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException86 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException88 = new codigos.LadoInvalidoException("");
        ladoInvalidoException86.addSuppressed((java.lang.Throwable) ladoInvalidoException88);
        codigos.LadoInvalidoException ladoInvalidoException91 = new codigos.LadoInvalidoException("hi!");
        ladoInvalidoException88.addSuppressed((java.lang.Throwable) ladoInvalidoException91);
        ladoInvalidoException81.addSuppressed((java.lang.Throwable) ladoInvalidoException91);
        java.lang.Throwable[] throwableArray94 = ladoInvalidoException81.getSuppressed();
        ladoInvalidoException59.addSuppressed((java.lang.Throwable) ladoInvalidoException81);
        ladoInvalidoException10.addSuppressed((java.lang.Throwable) ladoInvalidoException59);
        java.lang.Throwable[] throwableArray97 = ladoInvalidoException10.getSuppressed();
        java.lang.String str98 = ladoInvalidoException10.toString();
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertNotNull(throwableArray52);
        org.junit.Assert.assertNotNull(throwableArray54);
        org.junit.Assert.assertNotNull(throwableArray73);
        org.junit.Assert.assertNotNull(throwableArray84);
        org.junit.Assert.assertNotNull(throwableArray94);
        org.junit.Assert.assertNotNull(throwableArray97);
        org.junit.Assert.assertEquals("'" + str98 + "' != '" + "codigos.LadoInvalidoException: " + "'", str98, "codigos.LadoInvalidoException: ");
    }

    @Test
    public void test2454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2454");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        float float3 = contaCorrente2.getSaldo();
        contaCorrente2.setSaldo(100.0f);
        contaCorrente2.setLimite(10.0f);
        float float8 = contaCorrente2.getSaldo();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
    }

    @Test
    public void test2455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2455");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (-1), 2.0f);
        contaCorrente2.setSaldo(65.0f);
        float float5 = contaCorrente2.getSaldo();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 65.0f + "'", float5 == 65.0f);
    }

    @Test
    public void test2456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2456");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = codigos.Triangulo.classificaTriangulo((-1), 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type codigos.LadoInvalidoException; message: lado invalido");
        } catch (codigos.LadoInvalidoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2457");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (float) (short) 100);
        contaCorrente2.setLimite(65.0f);
    }

    @Test
    public void test2458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2458");
        codigos.Words words0 = new codigos.Words();
        int int2 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int4 = words0.countWords("NAO FORMA TRIANGULO");
        int int6 = words0.countWords("EQUILATERO");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2459");
        codigos.Words words0 = new codigos.Words();
        int int2 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int4 = words0.countWords("NAO FORMA TRIANGULO");
        int int6 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int8 = words0.countWords("NAO FORMA TRIANGULO");
        int int10 = words0.countWords("NAO FORMA TRIANGULO");
        int int12 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        int int14 = words0.countWords("EQUILATERO");
        java.lang.Class<?> wildcardClass15 = words0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2460");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", 1.0f);
        float float8 = pedido0.calculaTaxaDesconto(false, "NAO FORMA TRIANGULO", 10.0f);
        float float12 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: ", (float) (-1L));
        float float16 = pedido0.calculaTaxaDesconto(false, "NAO FORMA TRIANGULO", (-10.0f));
        float float20 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: hi!", 98.0f);
        float float24 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ", (float) (short) 1);
        float float28 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: NAO FORMA TRIANGULO", 99.0f);
        float float32 = pedido0.calculaTaxaDesconto(false, "hi!", (float) 1L);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.0f + "'", float24 == 0.0f);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 0.0f + "'", float28 == 0.0f);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 0.0f + "'", float32 == 0.0f);
    }

    @Test
    public void test2461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2461");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        float float3 = contaCorrente2.getSaldo();
        contaCorrente2.setSaldo(100.0f);
        contaCorrente2.setLimite(0.0f);
        float float8 = contaCorrente2.getSaldo();
        contaCorrente2.setSaldo((float) 10);
        contaCorrente2.setLimite((-87.0f));
        contaCorrente2.setLimite((float) 1);
        float float15 = contaCorrente2.getSaldo();
        float float16 = contaCorrente2.getLimite();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10.0f + "'", float15 == 10.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.0f + "'", float16 == 1.0f);
    }

    @Test
    public void test2462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2462");
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
        contaCorrente2.setSaldo((float) (byte) 10);
        contaCorrente2.setSaldo((float) 10);
        float float23 = contaCorrente2.getLimite();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 10.0f + "'", float14 == 10.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 91.0f + "'", float16 == 91.0f);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 10.0f + "'", float23 == 10.0f);
    }

    @Test
    public void test2463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2463");
        codigos.LadoInvalidoException ladoInvalidoException1 = new codigos.LadoInvalidoException("ISOSCELES");
        codigos.LadoInvalidoException ladoInvalidoException3 = new codigos.LadoInvalidoException("hi!");
        codigos.LadoInvalidoException ladoInvalidoException5 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException7 = new codigos.LadoInvalidoException("");
        ladoInvalidoException5.addSuppressed((java.lang.Throwable) ladoInvalidoException7);
        codigos.LadoInvalidoException ladoInvalidoException10 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException12 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException14 = new codigos.LadoInvalidoException("");
        ladoInvalidoException12.addSuppressed((java.lang.Throwable) ladoInvalidoException14);
        ladoInvalidoException10.addSuppressed((java.lang.Throwable) ladoInvalidoException14);
        java.lang.Throwable[] throwableArray17 = ladoInvalidoException14.getSuppressed();
        ladoInvalidoException7.addSuppressed((java.lang.Throwable) ladoInvalidoException14);
        ladoInvalidoException3.addSuppressed((java.lang.Throwable) ladoInvalidoException14);
        codigos.LadoInvalidoException ladoInvalidoException21 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException23 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException25 = new codigos.LadoInvalidoException("");
        ladoInvalidoException23.addSuppressed((java.lang.Throwable) ladoInvalidoException25);
        ladoInvalidoException21.addSuppressed((java.lang.Throwable) ladoInvalidoException25);
        java.lang.Throwable[] throwableArray28 = ladoInvalidoException25.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException30 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException32 = new codigos.LadoInvalidoException("");
        ladoInvalidoException30.addSuppressed((java.lang.Throwable) ladoInvalidoException32);
        codigos.LadoInvalidoException ladoInvalidoException35 = new codigos.LadoInvalidoException("hi!");
        ladoInvalidoException32.addSuppressed((java.lang.Throwable) ladoInvalidoException35);
        ladoInvalidoException25.addSuppressed((java.lang.Throwable) ladoInvalidoException35);
        java.lang.Throwable[] throwableArray38 = ladoInvalidoException25.getSuppressed();
        ladoInvalidoException3.addSuppressed((java.lang.Throwable) ladoInvalidoException25);
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException25);
        java.lang.String str41 = ladoInvalidoException25.toString();
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "codigos.LadoInvalidoException: " + "'", str41, "codigos.LadoInvalidoException: ");
    }

    @Test
    public void test2464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2464");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((-58.0f), 58.0f);
    }

    @Test
    public void test2465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2465");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = codigos.Triangulo.classificaTriangulo(100, (int) (byte) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type codigos.LadoInvalidoException; message: lado invalido");
        } catch (codigos.LadoInvalidoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2466");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 2, 3.0f);
        contaCorrente2.setLimite((-56.0f));
    }

    @Test
    public void test2467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2467");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(98.0f, 0.0f);
        float float3 = contaCorrente2.getLimite();
        contaCorrente2.setSaldo((float) (-1L));
        contaCorrente2.setLimite(7.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test2468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2468");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(0.0f, (float) 100L);
        float float3 = contaCorrente2.getLimite();
        float float5 = contaCorrente2.saque((float) '4');
        contaCorrente2.setSaldo((-87.0f));
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-52.0f) + "'", float5 == (-52.0f));
    }

    @Test
    public void test2469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2469");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 10, 23.0f);
    }

    @Test
    public void test2470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2470");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 10, 0.0f);
        contaCorrente2.setSaldo((float) (byte) 0);
        float float5 = contaCorrente2.getSaldo();
        float float6 = contaCorrente2.getSaldo();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
    }

    @Test
    public void test2471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2471");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        float float3 = contaCorrente2.getLimite();
        float float4 = contaCorrente2.getSaldo();
        float float5 = contaCorrente2.getLimite();
        contaCorrente2.setSaldo((-1.0f));
        contaCorrente2.setSaldo(0.0f);
        float float10 = contaCorrente2.getLimite();
        contaCorrente2.setLimite(45.0f);
        float float13 = contaCorrente2.getLimite();
        contaCorrente2.setLimite((float) 10L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-1.0f) + "'", float10 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 45.0f + "'", float13 == 45.0f);
    }

    @Test
    public void test2472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2472");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(32.0f, 10.0f);
        float float3 = contaCorrente2.getSaldo();
        contaCorrente2.setSaldo((float) (short) 0);
        float float6 = contaCorrente2.getSaldo();
        float float7 = contaCorrente2.getLimite();
        float float8 = contaCorrente2.getSaldo();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 32.0f + "'", float3 == 32.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
    }

    @Test
    public void test2473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2473");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) '#', (-1.0f));
        contaCorrente2.setSaldo(90.0f);
        contaCorrente2.setSaldo(56.0f);
        contaCorrente2.setLimite(68.0f);
    }

    @Test
    public void test2474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2474");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = codigos.Triangulo.classificaTriangulo(0, (int) (short) 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type codigos.LadoInvalidoException; message: lado invalido");
        } catch (codigos.LadoInvalidoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2475");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (-1), 2.0f);
        contaCorrente2.setLimite((-9.0f));
        float float5 = contaCorrente2.getLimite();
        float float6 = contaCorrente2.getSaldo();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-9.0f) + "'", float5 == (-9.0f));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-1.0f) + "'", float6 == (-1.0f));
    }

    @Test
    public void test2476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2476");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", 1.0f);
        float float8 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: hi!", (float) (short) 10);
        float float12 = pedido0.calculaTaxaDesconto(true, "NAO FORMA TRIANGULO", (float) 0L);
        float float16 = pedido0.calculaTaxaDesconto(true, "", 1.0f);
        float float20 = pedido0.calculaTaxaDesconto(false, "NAO FORMA TRIANGULO", (float) (-1L));
        float float24 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!", (float) 100);
        float float28 = pedido0.calculaTaxaDesconto(true, "", (float) (byte) -1);
        float float32 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!", 0.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10.0f + "'", float12 == 10.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.0f + "'", float24 == 0.0f);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 10.0f + "'", float28 == 10.0f);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 10.0f + "'", float32 == 10.0f);
    }

    @Test
    public void test2477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2477");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(65.0f, 42.0f);
        contaCorrente2.setSaldo((float) 'a');
        float float5 = contaCorrente2.getSaldo();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 97.0f + "'", float5 == 97.0f);
    }

    @Test
    public void test2478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2478");
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
        codigos.LadoInvalidoException ladoInvalidoException62 = new codigos.LadoInvalidoException("EQUILATERO");
        ladoInvalidoException58.addSuppressed((java.lang.Throwable) ladoInvalidoException62);
        java.lang.Throwable[] throwableArray64 = ladoInvalidoException58.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray40);
        org.junit.Assert.assertNotNull(throwableArray50);
        org.junit.Assert.assertNotNull(throwableArray64);
    }

    @Test
    public void test2479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2479");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 10, 0.0f);
        float float3 = contaCorrente2.getSaldo();
        contaCorrente2.setSaldo(45.0f);
        contaCorrente2.setLimite(90.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void test2480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2480");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 10, (-52.0f));
    }

    @Test
    public void test2481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2481");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (short) 10, (float) ' ');
        float float3 = contaCorrente2.getLimite();
        float float5 = contaCorrente2.saque(42.0f);
        contaCorrente2.setLimite((-11.0f));
        contaCorrente2.setLimite((-11.0f));
        contaCorrente2.setLimite(89.0f);
        contaCorrente2.setLimite(65.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 32.0f + "'", float3 == 32.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-32.0f) + "'", float5 == (-32.0f));
    }

    @Test
    public void test2482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2482");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(99.0f, (float) 'a');
        float float3 = contaCorrente2.getLimite();
        contaCorrente2.setSaldo((float) '4');
        float float6 = contaCorrente2.getLimite();
        float float8 = contaCorrente2.saque((float) 10);
        float float9 = contaCorrente2.getSaldo();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 97.0f + "'", float6 == 97.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 42.0f + "'", float8 == 42.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 42.0f + "'", float9 == 42.0f);
    }

    @Test
    public void test2483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2483");
        codigos.Words words0 = new codigos.Words();
        int int2 = words0.countWords("ESCALENO");
        int int4 = words0.countWords("codigos.LadoInvalidoException: ");
        int int6 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        java.lang.Class<?> wildcardClass7 = words0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2484");
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
        java.lang.String str95 = ladoInvalidoException30.toString();
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
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "codigos.LadoInvalidoException: " + "'", str95, "codigos.LadoInvalidoException: ");
    }

    @Test
    public void test2485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2485");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (short) -1, (-41.0f));
        contaCorrente2.setLimite(45.0f);
        contaCorrente2.setLimite((float) 5);
        float float7 = contaCorrente2.getSaldo();
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-1.0f) + "'", float7 == (-1.0f));
    }

    @Test
    public void test2486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2486");
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
        java.lang.Throwable[] throwableArray97 = ladoInvalidoException83.getSuppressed();
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
        org.junit.Assert.assertNotNull(throwableArray97);
    }

    @Test
    public void test2487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2487");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        float float3 = contaCorrente2.getSaldo();
        contaCorrente2.setSaldo(100.0f);
        float float6 = contaCorrente2.getLimite();
        contaCorrente2.setSaldo(100.0f);
        float float10 = contaCorrente2.saque((float) 2);
        contaCorrente2.setLimite(99.0f);
        float float13 = contaCorrente2.getSaldo();
        float float15 = contaCorrente2.saque((float) 2);
        // The following exception was thrown during execution in test generation
        try {
            float float17 = contaCorrente2.saque((float) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Valor invalido");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-1.0f) + "'", float6 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 98.0f + "'", float10 == 98.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 98.0f + "'", float13 == 98.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 96.0f + "'", float15 == 96.0f);
    }

    @Test
    public void test2488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2488");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 0, (float) 10L);
        float float3 = contaCorrente2.getLimite();
        contaCorrente2.setLimite((float) (byte) -1);
        float float6 = contaCorrente2.getLimite();
        float float7 = contaCorrente2.getSaldo();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-1.0f) + "'", float6 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
    }

    @Test
    public void test2489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2489");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = codigos.Triangulo.classificaTriangulo((int) '4', (int) (short) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type codigos.LadoInvalidoException; message: lado invalido");
        } catch (codigos.LadoInvalidoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2490");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 10, 0.0f);
        float float3 = contaCorrente2.getSaldo();
        float float5 = contaCorrente2.saque(1.0f);
        contaCorrente2.setLimite(10.0f);
        float float8 = contaCorrente2.getSaldo();
        contaCorrente2.setLimite((float) 1L);
        float float11 = contaCorrente2.getSaldo();
        float float12 = contaCorrente2.getSaldo();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 9.0f + "'", float5 == 9.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 9.0f + "'", float8 == 9.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 9.0f + "'", float11 == 9.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 9.0f + "'", float12 == 9.0f);
    }

    @Test
    public void test2491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2491");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(3.0f, 35.0f);
        float float3 = contaCorrente2.getLimite();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 35.0f + "'", float3 == 35.0f);
    }

    @Test
    public void test2492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2492");
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
        java.lang.Throwable[] throwableArray57 = ladoInvalidoException46.getSuppressed();
        java.lang.Class<?> wildcardClass58 = throwableArray57.getClass();
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertNotNull(throwableArray53);
        org.junit.Assert.assertNotNull(throwableArray55);
        org.junit.Assert.assertNotNull(throwableArray57);
        org.junit.Assert.assertNotNull(wildcardClass58);
    }

    @Test
    public void test2493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2493");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(13.0f, (float) (byte) 100);
        float float3 = contaCorrente2.getLimite();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test2494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2494");
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
        java.lang.String str42 = ladoInvalidoException33.toString();
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray40);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "codigos.LadoInvalidoException: " + "'", str42, "codigos.LadoInvalidoException: ");
    }

    @Test
    public void test2495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2495");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        float float3 = contaCorrente2.getLimite();
        float float4 = contaCorrente2.getLimite();
        contaCorrente2.setSaldo(0.0f);
        float float7 = contaCorrente2.getSaldo();
        contaCorrente2.setLimite((-41.0f));
        contaCorrente2.setLimite(1.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.0f) + "'", float4 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
    }

    @Test
    public void test2496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2496");
        codigos.Words words0 = new codigos.Words();
        int int2 = words0.countWords("");
        int int4 = words0.countWords("");
        int int6 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int8 = words0.countWords("codigos.LadoInvalidoException: NAO FORMA TRIANGULO");
        int int10 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
    }

    @Test
    public void test2497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2497");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = codigos.Triangulo.classificaTriangulo((int) (short) 100, (int) (byte) 0, 1);
            org.junit.Assert.fail("Expected exception of type codigos.LadoInvalidoException; message: lado invalido");
        } catch (codigos.LadoInvalidoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2498");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = codigos.Triangulo.classificaTriangulo((int) (short) 100, (-1), 1);
            org.junit.Assert.fail("Expected exception of type codigos.LadoInvalidoException; message: lado invalido");
        } catch (codigos.LadoInvalidoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2499");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(32.0f, (float) (byte) 0);
        contaCorrente2.setSaldo(10.0f);
        contaCorrente2.setLimite(9.0f);
        contaCorrente2.setLimite((float) ' ');
        contaCorrente2.setLimite(30.0f);
        java.lang.Class<?> wildcardClass11 = contaCorrente2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2500");
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
        java.lang.Throwable[] throwableArray39 = ladoInvalidoException34.getSuppressed();
        ladoInvalidoException19.addSuppressed((java.lang.Throwable) ladoInvalidoException34);
        codigos.LadoInvalidoException ladoInvalidoException42 = new codigos.LadoInvalidoException("codigos.LadoInvalidoException: hi!");
        ladoInvalidoException34.addSuppressed((java.lang.Throwable) ladoInvalidoException42);
        java.lang.Throwable[] throwableArray44 = ladoInvalidoException42.getSuppressed();
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException42);
        codigos.LadoInvalidoException ladoInvalidoException47 = new codigos.LadoInvalidoException("codigos.LadoInvalidoException: hi!");
        codigos.LadoInvalidoException ladoInvalidoException49 = new codigos.LadoInvalidoException("hi!");
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
        codigos.LadoInvalidoException ladoInvalidoException67 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException69 = new codigos.LadoInvalidoException("");
        ladoInvalidoException67.addSuppressed((java.lang.Throwable) ladoInvalidoException69);
        codigos.LadoInvalidoException ladoInvalidoException72 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException74 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException76 = new codigos.LadoInvalidoException("");
        ladoInvalidoException74.addSuppressed((java.lang.Throwable) ladoInvalidoException76);
        ladoInvalidoException72.addSuppressed((java.lang.Throwable) ladoInvalidoException76);
        java.lang.Throwable[] throwableArray79 = ladoInvalidoException76.getSuppressed();
        ladoInvalidoException69.addSuppressed((java.lang.Throwable) ladoInvalidoException76);
        java.lang.Throwable[] throwableArray81 = ladoInvalidoException76.getSuppressed();
        ladoInvalidoException61.addSuppressed((java.lang.Throwable) ladoInvalidoException76);
        codigos.LadoInvalidoException ladoInvalidoException84 = new codigos.LadoInvalidoException("codigos.LadoInvalidoException: hi!");
        ladoInvalidoException76.addSuppressed((java.lang.Throwable) ladoInvalidoException84);
        ladoInvalidoException49.addSuppressed((java.lang.Throwable) ladoInvalidoException84);
        java.lang.Throwable[] throwableArray87 = ladoInvalidoException84.getSuppressed();
        ladoInvalidoException42.addSuppressed((java.lang.Throwable) ladoInvalidoException84);
        java.lang.String str89 = ladoInvalidoException84.toString();
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertNotNull(throwableArray64);
        org.junit.Assert.assertNotNull(throwableArray79);
        org.junit.Assert.assertNotNull(throwableArray81);
        org.junit.Assert.assertNotNull(throwableArray87);
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!" + "'", str89, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!");
    }
}

