import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5 {

    public static boolean debug = false;

    @Test
    public void test2501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2501");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = codigos.Triangulo.classificaTriangulo(5, (int) (byte) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type codigos.LadoInvalidoException; message: lado invalido");
        } catch (codigos.LadoInvalidoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        java.lang.String str3 = codigos.Triangulo.classificaTriangulo((int) 'a', (int) (byte) 100, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "NAO FORMA TRIANGULO" + "'", str3, "NAO FORMA TRIANGULO");
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = codigos.Triangulo.classificaTriangulo((int) (byte) -1, 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type codigos.LadoInvalidoException; message: lado invalido");
        } catch (codigos.LadoInvalidoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
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
        codigos.LadoInvalidoException ladoInvalidoException34 = new codigos.LadoInvalidoException("hi!");
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
        ladoInvalidoException34.addSuppressed((java.lang.Throwable) ladoInvalidoException45);
        codigos.LadoInvalidoException ladoInvalidoException52 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException54 = new codigos.LadoInvalidoException("");
        ladoInvalidoException52.addSuppressed((java.lang.Throwable) ladoInvalidoException54);
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
        ladoInvalidoException54.addSuppressed((java.lang.Throwable) ladoInvalidoException66);
        java.lang.Throwable[] throwableArray73 = ladoInvalidoException66.getSuppressed();
        ladoInvalidoException34.addSuppressed((java.lang.Throwable) ladoInvalidoException66);
        ladoInvalidoException10.addSuppressed((java.lang.Throwable) ladoInvalidoException66);
        java.lang.Throwable[] throwableArray76 = ladoInvalidoException66.getSuppressed();
        java.lang.Throwable[] throwableArray77 = ladoInvalidoException66.getSuppressed();
        java.lang.String str78 = ladoInvalidoException66.toString();
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNotNull(throwableArray48);
        org.junit.Assert.assertNotNull(throwableArray69);
        org.junit.Assert.assertNotNull(throwableArray71);
        org.junit.Assert.assertNotNull(throwableArray73);
        org.junit.Assert.assertNotNull(throwableArray76);
        org.junit.Assert.assertNotNull(throwableArray77);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "codigos.LadoInvalidoException: " + "'", str78, "codigos.LadoInvalidoException: ");
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        codigos.Words words0 = new codigos.Words();
        int int2 = words0.countWords("");
        int int4 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!");
        int int6 = words0.countWords("");
        int int8 = words0.countWords("codigos.LadoInvalidoException: ");
        int int10 = words0.countWords("NAO FORMA TRIANGULO");
        int int12 = words0.countWords("NAO FORMA TRIANGULO");
        int int14 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (short) 100, 99.0f);
        float float3 = contaCorrente2.getLimite();
        float float4 = contaCorrente2.getSaldo();
        float float6 = contaCorrente2.saque(66.0f);
        contaCorrente2.setSaldo(34.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 99.0f + "'", float3 == 99.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 34.0f + "'", float6 == 34.0f);
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        float float3 = contaCorrente2.getLimite();
        float float4 = contaCorrente2.getSaldo();
        float float5 = contaCorrente2.getLimite();
        float float6 = contaCorrente2.getLimite();
        contaCorrente2.setSaldo(88.0f);
        float float10 = contaCorrente2.saque(23.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-1.0f) + "'", float6 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 65.0f + "'", float10 == 65.0f);
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        codigos.LadoInvalidoException ladoInvalidoException1 = new codigos.LadoInvalidoException("ESCALENO");
        java.lang.Throwable[] throwableArray2 = ladoInvalidoException1.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException4 = new codigos.LadoInvalidoException("");
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException4);
        java.lang.Throwable[] throwableArray6 = ladoInvalidoException4.getSuppressed();
        java.lang.Throwable[] throwableArray7 = ladoInvalidoException4.getSuppressed();
        java.lang.String str8 = ladoInvalidoException4.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "codigos.LadoInvalidoException: " + "'", str8, "codigos.LadoInvalidoException: ");
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
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
        codigos.LadoInvalidoException ladoInvalidoException20 = new codigos.LadoInvalidoException("codigos.LadoInvalidoException: hi!");
        codigos.LadoInvalidoException ladoInvalidoException22 = new codigos.LadoInvalidoException("hi!");
        ladoInvalidoException20.addSuppressed((java.lang.Throwable) ladoInvalidoException22);
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
        ladoInvalidoException48.addSuppressed((java.lang.Throwable) ladoInvalidoException50);
        codigos.LadoInvalidoException ladoInvalidoException53 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException55 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException57 = new codigos.LadoInvalidoException("");
        ladoInvalidoException55.addSuppressed((java.lang.Throwable) ladoInvalidoException57);
        ladoInvalidoException53.addSuppressed((java.lang.Throwable) ladoInvalidoException57);
        java.lang.Throwable[] throwableArray60 = ladoInvalidoException57.getSuppressed();
        ladoInvalidoException50.addSuppressed((java.lang.Throwable) ladoInvalidoException57);
        java.lang.Throwable[] throwableArray62 = ladoInvalidoException57.getSuppressed();
        ladoInvalidoException39.addSuppressed((java.lang.Throwable) ladoInvalidoException57);
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
        ladoInvalidoException39.addSuppressed((java.lang.Throwable) ladoInvalidoException74);
        ladoInvalidoException22.addSuppressed((java.lang.Throwable) ladoInvalidoException39);
        ladoInvalidoException15.addSuppressed((java.lang.Throwable) ladoInvalidoException39);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertNotNull(throwableArray46);
        org.junit.Assert.assertNotNull(throwableArray60);
        org.junit.Assert.assertNotNull(throwableArray62);
        org.junit.Assert.assertNotNull(throwableArray77);
        org.junit.Assert.assertNotNull(throwableArray79);
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(32.0f, 10.0f);
        float float3 = contaCorrente2.getSaldo();
        float float4 = contaCorrente2.getLimite();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 32.0f + "'", float3 == 32.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = codigos.Triangulo.classificaTriangulo((int) (byte) -1, 4, 0);
            org.junit.Assert.fail("Expected exception of type codigos.LadoInvalidoException; message: lado invalido");
        } catch (codigos.LadoInvalidoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        float float3 = contaCorrente2.getSaldo();
        contaCorrente2.setSaldo(100.0f);
        contaCorrente2.setLimite(0.0f);
        float float8 = contaCorrente2.getSaldo();
        contaCorrente2.setLimite(68.0f);
        contaCorrente2.setLimite(0.0f);
        contaCorrente2.setLimite((float) (short) -1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((-2.0f), 90.0f);
        float float3 = contaCorrente2.getSaldo();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-2.0f) + "'", float3 == (-2.0f));
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        codigos.LadoInvalidoException ladoInvalidoException1 = new codigos.LadoInvalidoException("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        java.lang.Throwable[] throwableArray2 = ladoInvalidoException1.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException4 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException6 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException8 = new codigos.LadoInvalidoException("");
        ladoInvalidoException6.addSuppressed((java.lang.Throwable) ladoInvalidoException8);
        ladoInvalidoException4.addSuppressed((java.lang.Throwable) ladoInvalidoException8);
        java.lang.Throwable[] throwableArray11 = ladoInvalidoException4.getSuppressed();
        java.lang.Throwable[] throwableArray12 = ladoInvalidoException4.getSuppressed();
        java.lang.Throwable[] throwableArray13 = ladoInvalidoException4.getSuppressed();
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException4);
        java.lang.Throwable[] throwableArray15 = ladoInvalidoException4.getSuppressed();
        java.lang.Class<?> wildcardClass16 = ladoInvalidoException4.getClass();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(83.0f, 87.0f);
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(65.0f, (-87.0f));
        contaCorrente2.setLimite((float) 10);
        float float5 = contaCorrente2.getSaldo();
        contaCorrente2.setSaldo((-9.0f));
        // The following exception was thrown during execution in test generation
        try {
            float float9 = contaCorrente2.saque(9.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Saldo Insuficiente");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 65.0f + "'", float5 == 65.0f);
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = codigos.Triangulo.classificaTriangulo((int) (byte) 10, 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type codigos.LadoInvalidoException; message: lado invalido");
        } catch (codigos.LadoInvalidoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        codigos.LadoInvalidoException ladoInvalidoException1 = new codigos.LadoInvalidoException("codigos.LadoInvalidoException: hi!");
        codigos.LadoInvalidoException ladoInvalidoException3 = new codigos.LadoInvalidoException("hi!");
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException3);
        codigos.LadoInvalidoException ladoInvalidoException6 = new codigos.LadoInvalidoException("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        java.lang.Throwable[] throwableArray7 = ladoInvalidoException6.getSuppressed();
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
        java.lang.Throwable[] throwableArray29 = ladoInvalidoException11.getSuppressed();
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
        java.lang.Throwable[] throwableArray50 = ladoInvalidoException45.getSuppressed();
        ladoInvalidoException33.addSuppressed((java.lang.Throwable) ladoInvalidoException45);
        java.lang.Throwable[] throwableArray52 = ladoInvalidoException45.getSuppressed();
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
        java.lang.Throwable[] throwableArray68 = ladoInvalidoException63.getSuppressed();
        ladoInvalidoException45.addSuppressed((java.lang.Throwable) ladoInvalidoException63);
        java.lang.Throwable[] throwableArray70 = ladoInvalidoException63.getSuppressed();
        ladoInvalidoException11.addSuppressed((java.lang.Throwable) ladoInvalidoException63);
        java.lang.Throwable[] throwableArray72 = ladoInvalidoException63.getSuppressed();
        ladoInvalidoException6.addSuppressed((java.lang.Throwable) ladoInvalidoException63);
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException6);
        codigos.LadoInvalidoException ladoInvalidoException76 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException78 = new codigos.LadoInvalidoException("");
        ladoInvalidoException76.addSuppressed((java.lang.Throwable) ladoInvalidoException78);
        codigos.LadoInvalidoException ladoInvalidoException81 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException83 = new codigos.LadoInvalidoException("");
        ladoInvalidoException81.addSuppressed((java.lang.Throwable) ladoInvalidoException83);
        codigos.LadoInvalidoException ladoInvalidoException86 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException88 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException90 = new codigos.LadoInvalidoException("");
        ladoInvalidoException88.addSuppressed((java.lang.Throwable) ladoInvalidoException90);
        ladoInvalidoException86.addSuppressed((java.lang.Throwable) ladoInvalidoException90);
        java.lang.Throwable[] throwableArray93 = ladoInvalidoException90.getSuppressed();
        ladoInvalidoException83.addSuppressed((java.lang.Throwable) ladoInvalidoException90);
        ladoInvalidoException78.addSuppressed((java.lang.Throwable) ladoInvalidoException83);
        java.lang.Throwable[] throwableArray96 = ladoInvalidoException78.getSuppressed();
        java.lang.Throwable[] throwableArray97 = ladoInvalidoException78.getSuppressed();
        ladoInvalidoException6.addSuppressed((java.lang.Throwable) ladoInvalidoException78);
        java.lang.Throwable[] throwableArray99 = ladoInvalidoException78.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNotNull(throwableArray48);
        org.junit.Assert.assertNotNull(throwableArray50);
        org.junit.Assert.assertNotNull(throwableArray52);
        org.junit.Assert.assertNotNull(throwableArray66);
        org.junit.Assert.assertNotNull(throwableArray68);
        org.junit.Assert.assertNotNull(throwableArray70);
        org.junit.Assert.assertNotNull(throwableArray72);
        org.junit.Assert.assertNotNull(throwableArray93);
        org.junit.Assert.assertNotNull(throwableArray96);
        org.junit.Assert.assertNotNull(throwableArray97);
        org.junit.Assert.assertNotNull(throwableArray99);
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", (float) (short) -1);
        float float8 = pedido0.calculaTaxaDesconto(true, "NAO FORMA TRIANGULO", (float) (byte) 0);
        float float12 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: hi!", (float) (short) 100);
        float float16 = pedido0.calculaTaxaDesconto(false, "ESCALENO", 35.0f);
        float float20 = pedido0.calculaTaxaDesconto(true, "hi!", (float) '4');
        java.lang.Class<?> wildcardClass21 = pedido0.getClass();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10.0f + "'", float12 == 10.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 10.0f + "'", float20 == 10.0f);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(96.0f, (float) 10L);
        contaCorrente2.setLimite((-90.0f));
        contaCorrente2.setSaldo((-1.0f));
        contaCorrente2.setSaldo(47.0f);
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
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
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        java.lang.String str3 = codigos.Triangulo.classificaTriangulo(4, (int) (byte) 100, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "NAO FORMA TRIANGULO" + "'", str3, "NAO FORMA TRIANGULO");
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(62.0f, 62.0f);
        contaCorrente2.setLimite((-2.0f));
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", (float) (short) -1);
        float float8 = pedido0.calculaTaxaDesconto(true, "NAO FORMA TRIANGULO", (float) (byte) 0);
        float float12 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: hi!", (float) (-1L));
        float float16 = pedido0.calculaTaxaDesconto(true, "", (float) (byte) 10);
        float float20 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ", 35.0f);
        float float24 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: NAO FORMA TRIANGULO", (float) (-1L));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 10.0f + "'", float20 == 10.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.0f + "'", float24 == 0.0f);
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
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
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 10, 0.0f);
        contaCorrente2.setSaldo((float) (byte) 0);
        float float5 = contaCorrente2.getSaldo();
        contaCorrente2.setLimite((float) (byte) 1);
        float float8 = contaCorrente2.getSaldo();
        contaCorrente2.setSaldo(10.0f);
        contaCorrente2.setLimite(1.0f);
        contaCorrente2.setLimite((float) 0);
        float float15 = contaCorrente2.getSaldo();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10.0f + "'", float15 == 10.0f);
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", 1.0f);
        float float8 = pedido0.calculaTaxaDesconto(false, "", (float) 1);
        float float12 = pedido0.calculaTaxaDesconto(false, "hi!", (float) (short) 100);
        float float16 = pedido0.calculaTaxaDesconto(false, "", 10.0f);
        float float20 = pedido0.calculaTaxaDesconto(false, "EQUILATERO", 52.0f);
        float float24 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: NAO FORMA TRIANGULO", 4.0f);
        float float28 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ", (float) (byte) -1);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.0f + "'", float24 == 0.0f);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 10.0f + "'", float28 == 10.0f);
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
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
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        codigos.LadoInvalidoException ladoInvalidoException1 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException3 = new codigos.LadoInvalidoException("");
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException3);
        codigos.LadoInvalidoException ladoInvalidoException6 = new codigos.LadoInvalidoException("hi!");
        ladoInvalidoException3.addSuppressed((java.lang.Throwable) ladoInvalidoException6);
        java.lang.Throwable[] throwableArray8 = ladoInvalidoException3.getSuppressed();
        java.lang.Throwable[] throwableArray9 = ladoInvalidoException3.getSuppressed();
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
        codigos.LadoInvalidoException ladoInvalidoException27 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException29 = new codigos.LadoInvalidoException("");
        ladoInvalidoException27.addSuppressed((java.lang.Throwable) ladoInvalidoException29);
        codigos.LadoInvalidoException ladoInvalidoException32 = new codigos.LadoInvalidoException("hi!");
        ladoInvalidoException29.addSuppressed((java.lang.Throwable) ladoInvalidoException32);
        codigos.LadoInvalidoException ladoInvalidoException35 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException37 = new codigos.LadoInvalidoException("");
        ladoInvalidoException35.addSuppressed((java.lang.Throwable) ladoInvalidoException37);
        codigos.LadoInvalidoException ladoInvalidoException40 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException42 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException44 = new codigos.LadoInvalidoException("");
        ladoInvalidoException42.addSuppressed((java.lang.Throwable) ladoInvalidoException44);
        ladoInvalidoException40.addSuppressed((java.lang.Throwable) ladoInvalidoException44);
        java.lang.Throwable[] throwableArray47 = ladoInvalidoException44.getSuppressed();
        ladoInvalidoException37.addSuppressed((java.lang.Throwable) ladoInvalidoException44);
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
        java.lang.Throwable[] throwableArray64 = ladoInvalidoException59.getSuppressed();
        ladoInvalidoException44.addSuppressed((java.lang.Throwable) ladoInvalidoException59);
        ladoInvalidoException29.addSuppressed((java.lang.Throwable) ladoInvalidoException44);
        ladoInvalidoException20.addSuppressed((java.lang.Throwable) ladoInvalidoException29);
        java.lang.Throwable[] throwableArray68 = ladoInvalidoException29.getSuppressed();
        ladoInvalidoException3.addSuppressed((java.lang.Throwable) ladoInvalidoException29);
        codigos.LadoInvalidoException ladoInvalidoException71 = new codigos.LadoInvalidoException("ISOSCELES");
        ladoInvalidoException3.addSuppressed((java.lang.Throwable) ladoInvalidoException71);
        java.lang.Throwable[] throwableArray73 = ladoInvalidoException71.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray47);
        org.junit.Assert.assertNotNull(throwableArray62);
        org.junit.Assert.assertNotNull(throwableArray64);
        org.junit.Assert.assertNotNull(throwableArray68);
        org.junit.Assert.assertNotNull(throwableArray73);
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
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
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        java.lang.String str3 = codigos.Triangulo.classificaTriangulo(5, (int) (byte) 1, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "NAO FORMA TRIANGULO" + "'", str3, "NAO FORMA TRIANGULO");
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
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
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
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
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 1, 32.0f);
        float float3 = contaCorrente2.getLimite();
        contaCorrente2.setSaldo((float) (short) 0);
        contaCorrente2.setLimite((float) 2);
        contaCorrente2.setLimite((-31.0f));
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 32.0f + "'", float3 == 32.0f);
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        java.lang.String str3 = codigos.Triangulo.classificaTriangulo((int) 'a', 6, 4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "NAO FORMA TRIANGULO" + "'", str3, "NAO FORMA TRIANGULO");
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
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
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
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
        float float21 = contaCorrente2.getSaldo();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 10.0f + "'", float14 == 10.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 91.0f + "'", float16 == 91.0f);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 10.0f + "'", float21 == 10.0f);
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        codigos.Words words0 = new codigos.Words();
        int int2 = words0.countWords("ESCALENO");
        int int4 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        int int6 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        int int8 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        int int10 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        int int12 = words0.countWords("codigos.LadoInvalidoException: EQUILATERO");
        int int14 = words0.countWords("ESCALENO");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(92.0f, 67.0f);
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
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
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (short) 100, 51.0f);
        contaCorrente2.setSaldo(89.0f);
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", 1.0f);
        float float8 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: hi!", (float) (short) 10);
        float float12 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", (float) ' ');
        float float16 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!", (float) (short) -1);
        float float20 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!", 32.0f);
        float float24 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: hi!", 55.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10.0f + "'", float12 == 10.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 10.0f + "'", float20 == 10.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.0f + "'", float24 == 0.0f);
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = codigos.Triangulo.classificaTriangulo((int) (short) -1, 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type codigos.LadoInvalidoException; message: lado invalido");
        } catch (codigos.LadoInvalidoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = codigos.Triangulo.classificaTriangulo(100, 0, 10);
            org.junit.Assert.fail("Expected exception of type codigos.LadoInvalidoException; message: lado invalido");
        } catch (codigos.LadoInvalidoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
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
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
        java.lang.String str3 = codigos.Triangulo.classificaTriangulo((int) (short) 10, (int) (byte) 10, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "NAO FORMA TRIANGULO" + "'", str3, "NAO FORMA TRIANGULO");
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(12.0f, 99.0f);
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
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
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = codigos.Triangulo.classificaTriangulo((int) '#', (int) (byte) 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type codigos.LadoInvalidoException; message: lado invalido");
        } catch (codigos.LadoInvalidoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
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
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = codigos.Triangulo.classificaTriangulo(6, 0, 1);
            org.junit.Assert.fail("Expected exception of type codigos.LadoInvalidoException; message: lado invalido");
        } catch (codigos.LadoInvalidoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((-58.0f), (-48.0f));
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
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
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 6, 78.0f);
        float float3 = contaCorrente2.getLimite();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 78.0f + "'", float3 == 78.0f);
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
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
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = codigos.Triangulo.classificaTriangulo((int) '#', (int) (byte) 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type codigos.LadoInvalidoException; message: lado invalido");
        } catch (codigos.LadoInvalidoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
        codigos.LadoInvalidoException ladoInvalidoException1 = new codigos.LadoInvalidoException("codigos.LadoInvalidoException: hi!");
        codigos.LadoInvalidoException ladoInvalidoException3 = new codigos.LadoInvalidoException("hi!");
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException3);
        java.lang.Throwable[] throwableArray5 = ladoInvalidoException3.getSuppressed();
        java.lang.Throwable[] throwableArray6 = ladoInvalidoException3.getSuppressed();
        java.lang.Throwable[] throwableArray7 = ladoInvalidoException3.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException9 = new codigos.LadoInvalidoException("ISOSCELES");
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
        codigos.LadoInvalidoException ladoInvalidoException29 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException31 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException33 = new codigos.LadoInvalidoException("");
        ladoInvalidoException31.addSuppressed((java.lang.Throwable) ladoInvalidoException33);
        ladoInvalidoException29.addSuppressed((java.lang.Throwable) ladoInvalidoException33);
        java.lang.Throwable[] throwableArray36 = ladoInvalidoException33.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException38 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException40 = new codigos.LadoInvalidoException("");
        ladoInvalidoException38.addSuppressed((java.lang.Throwable) ladoInvalidoException40);
        codigos.LadoInvalidoException ladoInvalidoException43 = new codigos.LadoInvalidoException("hi!");
        ladoInvalidoException40.addSuppressed((java.lang.Throwable) ladoInvalidoException43);
        ladoInvalidoException33.addSuppressed((java.lang.Throwable) ladoInvalidoException43);
        java.lang.Throwable[] throwableArray46 = ladoInvalidoException33.getSuppressed();
        ladoInvalidoException11.addSuppressed((java.lang.Throwable) ladoInvalidoException33);
        ladoInvalidoException9.addSuppressed((java.lang.Throwable) ladoInvalidoException33);
        ladoInvalidoException3.addSuppressed((java.lang.Throwable) ladoInvalidoException33);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray46);
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 4, (float) 100);
        contaCorrente2.setLimite(4.0f);
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
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
        java.lang.Throwable[] throwableArray52 = ladoInvalidoException50.getSuppressed();
        ladoInvalidoException5.addSuppressed((java.lang.Throwable) ladoInvalidoException50);
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException5);
        java.lang.Throwable[] throwableArray55 = ladoInvalidoException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray45);
        org.junit.Assert.assertNotNull(throwableArray47);
        org.junit.Assert.assertNotNull(throwableArray52);
        org.junit.Assert.assertNotNull(throwableArray55);
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
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
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(65.0f, (-32.0f));
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = codigos.Triangulo.classificaTriangulo(0, 2, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type codigos.LadoInvalidoException; message: lado invalido");
        } catch (codigos.LadoInvalidoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
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
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
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
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
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
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 5, (-46.0f));
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(62.0f, 62.0f);
        float float3 = contaCorrente2.getSaldo();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 62.0f + "'", float3 == 62.0f);
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
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
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
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
        codigos.LadoInvalidoException ladoInvalidoException79 = new codigos.LadoInvalidoException("NAO FORMA TRIANGULO");
        java.lang.Throwable[] throwableArray80 = ladoInvalidoException79.getSuppressed();
        ladoInvalidoException66.addSuppressed((java.lang.Throwable) ladoInvalidoException79);
        codigos.LadoInvalidoException ladoInvalidoException83 = new codigos.LadoInvalidoException("hi!");
        java.lang.Throwable[] throwableArray84 = ladoInvalidoException83.getSuppressed();
        java.lang.Throwable[] throwableArray85 = ladoInvalidoException83.getSuppressed();
        ladoInvalidoException79.addSuppressed((java.lang.Throwable) ladoInvalidoException83);
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
        org.junit.Assert.assertNotNull(throwableArray80);
        org.junit.Assert.assertNotNull(throwableArray84);
        org.junit.Assert.assertNotNull(throwableArray85);
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
        java.lang.String str3 = codigos.Triangulo.classificaTriangulo(2, (int) (byte) 100, 3);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "NAO FORMA TRIANGULO" + "'", str3, "NAO FORMA TRIANGULO");
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
        java.lang.String str3 = codigos.Triangulo.classificaTriangulo((int) '4', 2, 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "NAO FORMA TRIANGULO" + "'", str3, "NAO FORMA TRIANGULO");
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        java.lang.String str3 = codigos.Triangulo.classificaTriangulo(6, (int) (short) 10, 3);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "NAO FORMA TRIANGULO" + "'", str3, "NAO FORMA TRIANGULO");
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
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
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
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
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
        codigos.LadoInvalidoException ladoInvalidoException1 = new codigos.LadoInvalidoException("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        java.lang.String str2 = ladoInvalidoException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: " + "'", str2, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
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
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = codigos.Triangulo.classificaTriangulo((int) (byte) 1, 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type codigos.LadoInvalidoException; message: lado invalido");
        } catch (codigos.LadoInvalidoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = codigos.Triangulo.classificaTriangulo(0, 6, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type codigos.LadoInvalidoException; message: lado invalido");
        } catch (codigos.LadoInvalidoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(9.0f, 32.0f);
        float float3 = contaCorrente2.getLimite();
        float float4 = contaCorrente2.getLimite();
        contaCorrente2.setSaldo((float) '4');
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 32.0f + "'", float3 == 32.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 32.0f + "'", float4 == 32.0f);
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 6, (-88.0f));
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (short) 0, 0.0f);
        contaCorrente2.setSaldo((float) 0L);
        contaCorrente2.setSaldo(99.0f);
        contaCorrente2.setLimite(9.0f);
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
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
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(55.0f, (float) 1);
        contaCorrente2.setLimite((float) 0L);
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
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
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
        java.lang.String str3 = codigos.Triangulo.classificaTriangulo(10, (int) (short) 100, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "NAO FORMA TRIANGULO" + "'", str3, "NAO FORMA TRIANGULO");
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 10, 97.0f);
        float float3 = contaCorrente2.getSaldo();
        contaCorrente2.setSaldo(0.0f);
        contaCorrente2.setSaldo((-52.0f));
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 0, (float) (short) 0);
        contaCorrente2.setLimite((float) 4);
        float float5 = contaCorrente2.getSaldo();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((-2.0f), 4.0f);
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", 1.0f);
        float float8 = pedido0.calculaTaxaDesconto(false, "", (float) 1);
        float float12 = pedido0.calculaTaxaDesconto(false, "hi!", (float) (short) 100);
        float float16 = pedido0.calculaTaxaDesconto(false, "", 10.0f);
        float float20 = pedido0.calculaTaxaDesconto(false, "EQUILATERO", 52.0f);
        float float24 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ESCALENO", 65.0f);
        float float28 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ", (-14.0f));
        float float32 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: hi!", 69.0f);
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
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
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
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
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
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = codigos.Triangulo.classificaTriangulo(0, (int) (short) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type codigos.LadoInvalidoException; message: lado invalido");
        } catch (codigos.LadoInvalidoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 10, 0.0f);
        contaCorrente2.setSaldo((float) (byte) 0);
        float float5 = contaCorrente2.getSaldo();
        contaCorrente2.setSaldo((float) 0);
        contaCorrente2.setSaldo((float) 0L);
        contaCorrente2.setSaldo(80.0f);
        contaCorrente2.setSaldo(80.0f);
        float float14 = contaCorrente2.getLimite();
        contaCorrente2.setSaldo((float) 1L);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
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
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (short) 0, 0.0f);
        float float3 = contaCorrente2.getSaldo();
        float float4 = contaCorrente2.getLimite();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
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
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
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
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(99.0f, (float) 'a');
        float float3 = contaCorrente2.getLimite();
        contaCorrente2.setSaldo((float) 100);
        contaCorrente2.setSaldo((float) 'a');
        contaCorrente2.setLimite((float) 0L);
        contaCorrente2.setSaldo(32.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((-90.0f), (float) (short) -1);
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
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
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(1.0f, 42.0f);
        float float3 = contaCorrente2.getLimite();
        float float4 = contaCorrente2.getSaldo();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 42.0f + "'", float3 == 42.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
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
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
        java.lang.String str3 = codigos.Triangulo.classificaTriangulo((int) (short) 1, 5, (int) 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "NAO FORMA TRIANGULO" + "'", str3, "NAO FORMA TRIANGULO");
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
        java.lang.String str3 = codigos.Triangulo.classificaTriangulo((int) (short) 10, 10, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EQUILATERO" + "'", str3, "EQUILATERO");
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((-57.0f), 88.0f);
        float float4 = contaCorrente2.saque((float) (short) 1);
        float float5 = contaCorrente2.getLimite();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-58.0f) + "'", float4 == (-58.0f));
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 88.0f + "'", float5 == 88.0f);
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
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
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
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
        contaCorrente2.setSaldo((-52.0f));
        contaCorrente2.setLimite(99.0f);
        contaCorrente2.setSaldo(12.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 10.0f + "'", float17 == 10.0f);
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        float float3 = contaCorrente2.getLimite();
        float float4 = contaCorrente2.getSaldo();
        float float5 = contaCorrente2.getSaldo();
        float float6 = contaCorrente2.getLimite();
        contaCorrente2.setLimite((float) '4');
        float float9 = contaCorrente2.getSaldo();
        contaCorrente2.setSaldo(2.0f);
        float float12 = contaCorrente2.getSaldo();
        contaCorrente2.setSaldo((float) 'a');
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 100.0f + "'", float5 == 100.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-1.0f) + "'", float6 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 100.0f + "'", float9 == 100.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 2.0f + "'", float12 == 2.0f);
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
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
        contaCorrente2.setLimite((-29.0f));
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 99.0f + "'", float9 == 99.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 97.0f + "'", float20 == 97.0f);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 97.0f + "'", float21 == 97.0f);
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
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
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", 1.0f);
        float float8 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: hi!", (float) (short) 10);
        float float12 = pedido0.calculaTaxaDesconto(true, "NAO FORMA TRIANGULO", (float) 0L);
        float float16 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!", (float) 0L);
        float float20 = pedido0.calculaTaxaDesconto(false, "", (float) '4');
        float float24 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ", (-56.0f));
        float float28 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: ESCALENO", (-90.0f));
        float float32 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!", 13.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10.0f + "'", float12 == 10.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.0f + "'", float24 == 0.0f);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 0.0f + "'", float28 == 0.0f);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 10.0f + "'", float32 == 10.0f);
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
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
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(90.0f, (float) (-1));
        contaCorrente2.setLimite((float) 0);
        float float5 = contaCorrente2.getLimite();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 100L, (float) 10);
        float float4 = contaCorrente2.saque((float) 100L);
        contaCorrente2.setLimite((float) (short) 100);
        contaCorrente2.setSaldo((float) 100);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", 1.0f);
        float float8 = pedido0.calculaTaxaDesconto(false, "NAO FORMA TRIANGULO", 10.0f);
        float float12 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: ", (float) (-1L));
        float float16 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ", (-2.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 10, 0.0f);
        contaCorrente2.setSaldo((float) (byte) 0);
        float float5 = contaCorrente2.getSaldo();
        contaCorrente2.setSaldo((float) 0);
        contaCorrente2.setLimite((float) (byte) 10);
        contaCorrente2.setLimite((float) (byte) 0);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) '#', (float) (short) 10);
        contaCorrente2.setLimite((-86.0f));
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
        codigos.Words words0 = new codigos.Words();
        int int2 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int4 = words0.countWords("NAO FORMA TRIANGULO");
        int int6 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int8 = words0.countWords("NAO FORMA TRIANGULO");
        int int10 = words0.countWords("");
        int int12 = words0.countWords("hi!");
        int int14 = words0.countWords("codigos.LadoInvalidoException: ");
        int int16 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
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
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
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
        java.lang.Throwable[] throwableArray82 = ladoInvalidoException73.getSuppressed();
        java.lang.Throwable[] throwableArray83 = ladoInvalidoException73.getSuppressed();
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
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
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
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
        java.lang.String str3 = codigos.Triangulo.classificaTriangulo((int) (short) 1, 3, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "NAO FORMA TRIANGULO" + "'", str3, "NAO FORMA TRIANGULO");
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 3, 84.0f);
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
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
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
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
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
        java.lang.String str3 = codigos.Triangulo.classificaTriangulo((int) (byte) 10, 3, 4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "NAO FORMA TRIANGULO" + "'", str3, "NAO FORMA TRIANGULO");
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
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
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
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
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
        codigos.LadoInvalidoException ladoInvalidoException1 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException3 = new codigos.LadoInvalidoException("");
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException3);
        codigos.LadoInvalidoException ladoInvalidoException6 = new codigos.LadoInvalidoException("NAO FORMA TRIANGULO");
        java.lang.Throwable[] throwableArray7 = ladoInvalidoException6.getSuppressed();
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
        java.lang.Throwable[] throwableArray29 = ladoInvalidoException11.getSuppressed();
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
        java.lang.Throwable[] throwableArray50 = ladoInvalidoException45.getSuppressed();
        ladoInvalidoException33.addSuppressed((java.lang.Throwable) ladoInvalidoException45);
        java.lang.Throwable[] throwableArray52 = ladoInvalidoException45.getSuppressed();
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
        java.lang.Throwable[] throwableArray68 = ladoInvalidoException63.getSuppressed();
        ladoInvalidoException45.addSuppressed((java.lang.Throwable) ladoInvalidoException63);
        java.lang.Throwable[] throwableArray70 = ladoInvalidoException63.getSuppressed();
        ladoInvalidoException11.addSuppressed((java.lang.Throwable) ladoInvalidoException63);
        ladoInvalidoException6.addSuppressed((java.lang.Throwable) ladoInvalidoException63);
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
        ladoInvalidoException63.addSuppressed((java.lang.Throwable) ladoInvalidoException76);
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException63);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNotNull(throwableArray48);
        org.junit.Assert.assertNotNull(throwableArray50);
        org.junit.Assert.assertNotNull(throwableArray52);
        org.junit.Assert.assertNotNull(throwableArray66);
        org.junit.Assert.assertNotNull(throwableArray68);
        org.junit.Assert.assertNotNull(throwableArray70);
        org.junit.Assert.assertNotNull(throwableArray86);
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        float float3 = contaCorrente2.getLimite();
        float float4 = contaCorrente2.getSaldo();
        float float5 = contaCorrente2.getLimite();
        contaCorrente2.setSaldo((float) (byte) 1);
        float float8 = contaCorrente2.getSaldo();
        contaCorrente2.setLimite((float) 1L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
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
        float float21 = contaCorrente2.getLimite();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 99.0f + "'", float9 == 99.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 97.0f + "'", float20 == 97.0f);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + (-1.0f) + "'", float21 == (-1.0f));
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
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
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
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
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
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
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
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
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
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
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 'a', (float) 10);
        float float4 = contaCorrente2.saque((float) 1);
        contaCorrente2.setLimite((float) 'a');
        contaCorrente2.setLimite((-1.0f));
        java.lang.Class<?> wildcardClass9 = contaCorrente2.getClass();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 96.0f + "'", float4 == 96.0f);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (-1L), (float) (byte) -1);
        contaCorrente2.setLimite(90.0f);
        contaCorrente2.setLimite(65.0f);
        float float7 = contaCorrente2.getSaldo();
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-1.0f) + "'", float7 == (-1.0f));
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(99.0f, (float) 'a');
        float float3 = contaCorrente2.getLimite();
        contaCorrente2.setSaldo((float) '4');
        contaCorrente2.setLimite((float) 100L);
        contaCorrente2.setSaldo(4.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 0, (-45.0f));
        float float3 = contaCorrente2.getLimite();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-45.0f) + "'", float3 == (-45.0f));
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(65.0f, (-41.0f));
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        float float3 = contaCorrente2.getSaldo();
        contaCorrente2.setSaldo(100.0f);
        contaCorrente2.setLimite(0.0f);
        contaCorrente2.setLimite(84.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
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
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
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
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
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
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = codigos.Triangulo.classificaTriangulo((int) '4', 4, (-1));
            org.junit.Assert.fail("Expected exception of type codigos.LadoInvalidoException; message: lado invalido");
        } catch (codigos.LadoInvalidoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2647");
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
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
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
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(99.0f, (float) 'a');
        float float3 = contaCorrente2.getLimite();
        float float4 = contaCorrente2.getSaldo();
        float float6 = contaCorrente2.saque((float) (byte) 100);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 99.0f + "'", float4 == 99.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-1.0f) + "'", float6 == (-1.0f));
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(42.0f, (-87.0f));
        float float3 = contaCorrente2.getSaldo();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 42.0f + "'", float3 == 42.0f);
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(35.0f, (-59.0f));
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
        java.lang.String str3 = codigos.Triangulo.classificaTriangulo((int) (byte) 100, (int) ' ', (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "NAO FORMA TRIANGULO" + "'", str3, "NAO FORMA TRIANGULO");
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2653");
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
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
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
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertNotNull(throwableArray53);
        org.junit.Assert.assertNotNull(throwableArray55);
        org.junit.Assert.assertNotNull(throwableArray57);
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
        java.lang.String str3 = codigos.Triangulo.classificaTriangulo((int) (short) 10, 5, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "NAO FORMA TRIANGULO" + "'", str3, "NAO FORMA TRIANGULO");
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
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
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2657");
        java.lang.String str3 = codigos.Triangulo.classificaTriangulo(3, (int) (byte) 100, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "NAO FORMA TRIANGULO" + "'", str3, "NAO FORMA TRIANGULO");
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2658");
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
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
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
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2660");
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
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2661");
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
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2662");
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
        codigos.LadoInvalidoException ladoInvalidoException35 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException37 = new codigos.LadoInvalidoException("");
        ladoInvalidoException35.addSuppressed((java.lang.Throwable) ladoInvalidoException37);
        codigos.LadoInvalidoException ladoInvalidoException40 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException42 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException44 = new codigos.LadoInvalidoException("");
        ladoInvalidoException42.addSuppressed((java.lang.Throwable) ladoInvalidoException44);
        ladoInvalidoException40.addSuppressed((java.lang.Throwable) ladoInvalidoException44);
        java.lang.Throwable[] throwableArray47 = ladoInvalidoException44.getSuppressed();
        ladoInvalidoException37.addSuppressed((java.lang.Throwable) ladoInvalidoException44);
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
        java.lang.Throwable[] throwableArray64 = ladoInvalidoException59.getSuppressed();
        ladoInvalidoException44.addSuppressed((java.lang.Throwable) ladoInvalidoException59);
        codigos.LadoInvalidoException ladoInvalidoException67 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException69 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException71 = new codigos.LadoInvalidoException("");
        ladoInvalidoException69.addSuppressed((java.lang.Throwable) ladoInvalidoException71);
        ladoInvalidoException67.addSuppressed((java.lang.Throwable) ladoInvalidoException71);
        java.lang.Throwable[] throwableArray74 = ladoInvalidoException67.getSuppressed();
        ladoInvalidoException44.addSuppressed((java.lang.Throwable) ladoInvalidoException67);
        codigos.LadoInvalidoException ladoInvalidoException77 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException79 = new codigos.LadoInvalidoException("");
        ladoInvalidoException77.addSuppressed((java.lang.Throwable) ladoInvalidoException79);
        codigos.LadoInvalidoException ladoInvalidoException82 = new codigos.LadoInvalidoException("hi!");
        ladoInvalidoException79.addSuppressed((java.lang.Throwable) ladoInvalidoException82);
        java.lang.Throwable[] throwableArray84 = ladoInvalidoException79.getSuppressed();
        ladoInvalidoException44.addSuppressed((java.lang.Throwable) ladoInvalidoException79);
        ladoInvalidoException28.addSuppressed((java.lang.Throwable) ladoInvalidoException44);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray47);
        org.junit.Assert.assertNotNull(throwableArray62);
        org.junit.Assert.assertNotNull(throwableArray64);
        org.junit.Assert.assertNotNull(throwableArray74);
        org.junit.Assert.assertNotNull(throwableArray84);
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2663");
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
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(32.0f, 10.0f);
        float float3 = contaCorrente2.getSaldo();
        contaCorrente2.setSaldo((float) (short) 0);
        float float6 = contaCorrente2.getSaldo();
        float float7 = contaCorrente2.getLimite();
        contaCorrente2.setSaldo(32.0f);
        contaCorrente2.setSaldo(30.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 32.0f + "'", float3 == 32.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2665");
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
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2666");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(97.0f, 99.0f);
        float float3 = contaCorrente2.getSaldo();
        contaCorrente2.setLimite(10.0f);
        contaCorrente2.setLimite((float) (-1L));
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2667");
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
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2668");
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
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2669");
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
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2670");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = codigos.Triangulo.classificaTriangulo(4, (int) '#', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type codigos.LadoInvalidoException; message: lado invalido");
        } catch (codigos.LadoInvalidoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2671");
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
        java.lang.Throwable[] throwableArray19 = ladoInvalidoException15.getSuppressed();
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
        java.lang.Throwable[] throwableArray42 = ladoInvalidoException23.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException44 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException46 = new codigos.LadoInvalidoException("");
        ladoInvalidoException44.addSuppressed((java.lang.Throwable) ladoInvalidoException46);
        codigos.LadoInvalidoException ladoInvalidoException49 = new codigos.LadoInvalidoException("hi!");
        ladoInvalidoException46.addSuppressed((java.lang.Throwable) ladoInvalidoException49);
        ladoInvalidoException23.addSuppressed((java.lang.Throwable) ladoInvalidoException46);
        ladoInvalidoException15.addSuppressed((java.lang.Throwable) ladoInvalidoException46);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertNotNull(throwableArray40);
        org.junit.Assert.assertNotNull(throwableArray42);
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2672");
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
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2673");
        codigos.LadoInvalidoException ladoInvalidoException1 = new codigos.LadoInvalidoException("ESCALENO");
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
        java.lang.Throwable[] throwableArray22 = ladoInvalidoException17.getSuppressed();
        ladoInvalidoException5.addSuppressed((java.lang.Throwable) ladoInvalidoException17);
        java.lang.Throwable[] throwableArray24 = ladoInvalidoException17.getSuppressed();
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
        ladoInvalidoException17.addSuppressed((java.lang.Throwable) ladoInvalidoException35);
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
        java.lang.Throwable[] throwableArray57 = ladoInvalidoException52.getSuppressed();
        ladoInvalidoException17.addSuppressed((java.lang.Throwable) ladoInvalidoException52);
        java.lang.Throwable[] throwableArray59 = ladoInvalidoException52.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException61 = new codigos.LadoInvalidoException("codigos.LadoInvalidoException: hi!");
        java.lang.Throwable[] throwableArray62 = ladoInvalidoException61.getSuppressed();
        ladoInvalidoException52.addSuppressed((java.lang.Throwable) ladoInvalidoException61);
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException52);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertNotNull(throwableArray40);
        org.junit.Assert.assertNotNull(throwableArray55);
        org.junit.Assert.assertNotNull(throwableArray57);
        org.junit.Assert.assertNotNull(throwableArray59);
        org.junit.Assert.assertNotNull(throwableArray62);
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2674");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 10, 0.0f);
        contaCorrente2.setSaldo((float) (byte) 0);
        float float5 = contaCorrente2.getSaldo();
        contaCorrente2.setLimite((float) (byte) 1);
        contaCorrente2.setSaldo((float) (-1));
        contaCorrente2.setSaldo(67.0f);
        contaCorrente2.setSaldo(99.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2675");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(44.0f, (float) (short) -1);
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2676");
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
        codigos.LadoInvalidoException ladoInvalidoException48 = new codigos.LadoInvalidoException("NAO FORMA TRIANGULO");
        java.lang.Throwable[] throwableArray49 = ladoInvalidoException48.getSuppressed();
        ladoInvalidoException43.addSuppressed((java.lang.Throwable) ladoInvalidoException48);
        java.lang.Throwable[] throwableArray51 = ladoInvalidoException43.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertNotNull(throwableArray45);
        org.junit.Assert.assertNotNull(throwableArray49);
        org.junit.Assert.assertNotNull(throwableArray51);
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2677");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((-32.0f), (-87.0f));
    }

    @Test
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2678");
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
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2679");
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
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2680");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(32.0f, (float) 10L);
        contaCorrente2.setSaldo(67.0f);
        contaCorrente2.setLimite(91.0f);
        float float7 = contaCorrente2.getSaldo();
        float float9 = contaCorrente2.saque(60.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 67.0f + "'", float7 == 67.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 7.0f + "'", float9 == 7.0f);
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2681");
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
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2682");
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
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2683");
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
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2684");
        codigos.Words words0 = new codigos.Words();
        int int2 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int4 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!");
        int int6 = words0.countWords("hi!");
        int int8 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        int int10 = words0.countWords("");
        int int12 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2685");
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
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2686");
        codigos.Words words0 = new codigos.Words();
        int int2 = words0.countWords("codigos.LadoInvalidoException: ");
        int int4 = words0.countWords("hi!");
        int int6 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!");
        int int8 = words0.countWords("hi!");
        int int10 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        int int12 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!");
        int int14 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: NAO FORMA TRIANGULO");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2687");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        float float3 = contaCorrente2.getLimite();
        float float4 = contaCorrente2.getSaldo();
        float float5 = contaCorrente2.getLimite();
        float float6 = contaCorrente2.getSaldo();
        contaCorrente2.setLimite((float) (byte) 10);
        contaCorrente2.setSaldo((float) 100L);
        contaCorrente2.setSaldo(96.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2688");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 0, (-57.0f));
        contaCorrente2.setLimite(68.0f);
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2689");
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
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2690");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(99.0f, (float) (byte) 1);
        contaCorrente2.setLimite((float) (byte) 10);
        contaCorrente2.setSaldo(1.0f);
    }

    @Test
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2691");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(35.0f, (float) (byte) 10);
    }

    @Test
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2692");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(80.0f, (float) (short) 10);
        contaCorrente2.setSaldo(9.0f);
    }

    @Test
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2693");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(96.0f, (float) 10L);
        float float3 = contaCorrente2.getSaldo();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 96.0f + "'", float3 == 96.0f);
    }

    @Test
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2694");
        java.lang.String str3 = codigos.Triangulo.classificaTriangulo((int) (short) 10, (int) (short) 1, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "NAO FORMA TRIANGULO" + "'", str3, "NAO FORMA TRIANGULO");
    }

    @Test
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2695");
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
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2696");
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
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2697");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(69.0f, 60.0f);
        contaCorrente2.setLimite(67.0f);
    }

    @Test
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2698");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(90.0f, (-52.0f));
    }

    @Test
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2699");
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
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2700");
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
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2701");
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
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2702");
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
    public void test2703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2703");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (short) 0, 0.0f);
        contaCorrente2.setSaldo((float) 0L);
        contaCorrente2.setSaldo(99.0f);
        float float7 = contaCorrente2.getSaldo();
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 99.0f + "'", float7 == 99.0f);
    }

    @Test
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2704");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = codigos.Triangulo.classificaTriangulo(0, (int) (byte) 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type codigos.LadoInvalidoException; message: lado invalido");
        } catch (codigos.LadoInvalidoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2705");
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
    public void test2706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2706");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 100L, (float) 10);
        float float3 = contaCorrente2.getSaldo();
        float float4 = contaCorrente2.getLimite();
        contaCorrente2.setSaldo(8.0f);
        float float7 = contaCorrente2.getLimite();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
    }

    @Test
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2707");
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
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2708");
        java.lang.String str3 = codigos.Triangulo.classificaTriangulo((int) ' ', (int) (short) 100, (int) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "NAO FORMA TRIANGULO" + "'", str3, "NAO FORMA TRIANGULO");
    }

    @Test
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2709");
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
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2710");
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
    public void test2711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2711");
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
        codigos.LadoInvalidoException ladoInvalidoException67 = new codigos.LadoInvalidoException("hi!");
        codigos.LadoInvalidoException ladoInvalidoException69 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException71 = new codigos.LadoInvalidoException("");
        ladoInvalidoException69.addSuppressed((java.lang.Throwable) ladoInvalidoException71);
        codigos.LadoInvalidoException ladoInvalidoException74 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException76 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException78 = new codigos.LadoInvalidoException("");
        ladoInvalidoException76.addSuppressed((java.lang.Throwable) ladoInvalidoException78);
        ladoInvalidoException74.addSuppressed((java.lang.Throwable) ladoInvalidoException78);
        java.lang.Throwable[] throwableArray81 = ladoInvalidoException78.getSuppressed();
        ladoInvalidoException71.addSuppressed((java.lang.Throwable) ladoInvalidoException78);
        ladoInvalidoException67.addSuppressed((java.lang.Throwable) ladoInvalidoException78);
        ladoInvalidoException50.addSuppressed((java.lang.Throwable) ladoInvalidoException67);
        java.lang.Throwable[] throwableArray85 = ladoInvalidoException67.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray40);
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertNotNull(throwableArray53);
        org.junit.Assert.assertNotNull(throwableArray62);
        org.junit.Assert.assertNotNull(throwableArray81);
        org.junit.Assert.assertNotNull(throwableArray85);
    }

    @Test
    public void test2712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2712");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 0, (float) ' ');
        float float4 = contaCorrente2.saque((float) (byte) 1);
        contaCorrente2.setSaldo(45.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.0f) + "'", float4 == (-1.0f));
    }

    @Test
    public void test2713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2713");
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
    public void test2714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2714");
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
    public void test2715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2715");
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
    public void test2716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2716");
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
    public void test2717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2717");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(87.0f, (float) 3);
        float float3 = contaCorrente2.getLimite();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 3.0f + "'", float3 == 3.0f);
    }

    @Test
    public void test2718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2718");
        java.lang.String str3 = codigos.Triangulo.classificaTriangulo((int) (byte) 100, (int) (byte) 10, 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ISOSCELES" + "'", str3, "ISOSCELES");
    }

    @Test
    public void test2719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2719");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        float float3 = contaCorrente2.getLimite();
        float float4 = contaCorrente2.getSaldo();
        float float5 = contaCorrente2.getSaldo();
        float float6 = contaCorrente2.getLimite();
        contaCorrente2.setLimite(68.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 100.0f + "'", float5 == 100.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-1.0f) + "'", float6 == (-1.0f));
    }

    @Test
    public void test2720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2720");
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
    public void test2721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2721");
        codigos.Words words0 = new codigos.Words();
        int int2 = words0.countWords("");
        int int4 = words0.countWords("");
        int int6 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int8 = words0.countWords("codigos.LadoInvalidoException: NAO FORMA TRIANGULO");
        int int10 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        int int12 = words0.countWords("EQUILATERO");
        int int14 = words0.countWords("EQUILATERO");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2722");
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
    public void test2723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2723");
        codigos.Words words0 = new codigos.Words();
        int int2 = words0.countWords("");
        int int4 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!");
        int int6 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        int int8 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
    }

    @Test
    public void test2724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2724");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(0.0f, (-56.0f));
    }

    @Test
    public void test2725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2725");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(98.0f, 0.0f);
        contaCorrente2.setSaldo(88.0f);
        float float5 = contaCorrente2.getSaldo();
        contaCorrente2.setSaldo(10.0f);
        float float8 = contaCorrente2.getSaldo();
        contaCorrente2.setSaldo((float) 1L);
        float float11 = contaCorrente2.getSaldo();
        contaCorrente2.setLimite(92.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 88.0f + "'", float5 == 88.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
    }

    @Test
    public void test2726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2726");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) '#', 100.0f);
        contaCorrente2.setSaldo((-68.0f));
    }

    @Test
    public void test2727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2727");
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
    public void test2728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2728");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (short) 0, 0.0f);
        float float3 = contaCorrente2.getLimite();
        float float4 = contaCorrente2.getLimite();
        contaCorrente2.setLimite(30.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
    }

    @Test
    public void test2729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2729");
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
    public void test2730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2730");
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
    public void test2731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2731");
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
    public void test2732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2732");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = codigos.Triangulo.classificaTriangulo(4, (int) (byte) 0, 0);
            org.junit.Assert.fail("Expected exception of type codigos.LadoInvalidoException; message: lado invalido");
        } catch (codigos.LadoInvalidoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2733");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 100L, (float) 10);
        float float3 = contaCorrente2.getLimite();
        float float5 = contaCorrente2.saque(8.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 92.0f + "'", float5 == 92.0f);
    }

    @Test
    public void test2734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2734");
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
    public void test2735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2735");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(32.0f, (float) (byte) 0);
        float float3 = contaCorrente2.getLimite();
        float float4 = contaCorrente2.getLimite();
        float float5 = contaCorrente2.getSaldo();
        float float7 = contaCorrente2.saque((float) ' ');
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 32.0f + "'", float5 == 32.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
    }

    @Test
    public void test2736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2736");
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
    public void test2737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2737");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(1.0f, 1.0f);
        contaCorrente2.setSaldo((float) 100);
        float float5 = contaCorrente2.getSaldo();
        float float7 = contaCorrente2.saque((float) (byte) 1);
        contaCorrente2.setLimite((float) (byte) -1);
        float float10 = contaCorrente2.getLimite();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 100.0f + "'", float5 == 100.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 99.0f + "'", float7 == 99.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-1.0f) + "'", float10 == (-1.0f));
    }

    @Test
    public void test2738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2738");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = codigos.Triangulo.classificaTriangulo((int) (byte) 100, (int) (short) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type codigos.LadoInvalidoException; message: lado invalido");
        } catch (codigos.LadoInvalidoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2739");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = codigos.Triangulo.classificaTriangulo(3, (-1), 3);
            org.junit.Assert.fail("Expected exception of type codigos.LadoInvalidoException; message: lado invalido");
        } catch (codigos.LadoInvalidoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2740");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = codigos.Triangulo.classificaTriangulo((int) (byte) -1, (int) (byte) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type codigos.LadoInvalidoException; message: lado invalido");
        } catch (codigos.LadoInvalidoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2741");
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
    public void test2742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2742");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        float float3 = contaCorrente2.getSaldo();
        contaCorrente2.setSaldo(100.0f);
        float float6 = contaCorrente2.getLimite();
        contaCorrente2.setSaldo(100.0f);
        float float10 = contaCorrente2.saque((float) 2);
        float float11 = contaCorrente2.getSaldo();
        contaCorrente2.setLimite((float) (byte) 0);
        float float14 = contaCorrente2.getSaldo();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-1.0f) + "'", float6 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 98.0f + "'", float10 == 98.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 98.0f + "'", float11 == 98.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 98.0f + "'", float14 == 98.0f);
    }

    @Test
    public void test2743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2743");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(78.0f, (float) (-1L));
        float float4 = contaCorrente2.saque((float) 5);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 73.0f + "'", float4 == 73.0f);
    }

    @Test
    public void test2744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2744");
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
    public void test2745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2745");
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
    public void test2746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2746");
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
    public void test2747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2747");
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
    public void test2748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2748");
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
    public void test2749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2749");
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
    public void test2750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2750");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(90.0f, (float) 1L);
        contaCorrente2.setSaldo((float) (short) -1);
        contaCorrente2.setSaldo(96.0f);
    }

    @Test
    public void test2751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2751");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((-14.0f), 0.0f);
    }

    @Test
    public void test2752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2752");
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
    public void test2753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2753");
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
    public void test2754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2754");
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
    public void test2755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2755");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(99.0f, (float) 'a');
        float float3 = contaCorrente2.getLimite();
        contaCorrente2.setSaldo((float) 100);
        contaCorrente2.setSaldo((float) 'a');
        contaCorrente2.setLimite((float) 0L);
        float float10 = contaCorrente2.getLimite();
        float float11 = contaCorrente2.getLimite();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
    }

    @Test
    public void test2756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2756");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 10, 0.0f);
        float float3 = contaCorrente2.getSaldo();
        float float5 = contaCorrente2.saque(1.0f);
        contaCorrente2.setSaldo(100.0f);
        contaCorrente2.setLimite(2.0f);
        float float10 = contaCorrente2.getSaldo();
        float float11 = contaCorrente2.getSaldo();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 9.0f + "'", float5 == 9.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 100.0f + "'", float10 == 100.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 100.0f + "'", float11 == 100.0f);
    }

    @Test
    public void test2757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2757");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(13.0f, 96.0f);
        contaCorrente2.setLimite(55.0f);
    }

    @Test
    public void test2758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2758");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) ' ', 1.0f);
        float float3 = contaCorrente2.getLimite();
        contaCorrente2.setLimite((-11.0f));
        contaCorrente2.setSaldo((float) (byte) 0);
        contaCorrente2.setSaldo((-1.0f));
        contaCorrente2.setLimite((float) 5);
        float float12 = contaCorrente2.getSaldo();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
    }

    @Test
    public void test2759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2759");
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
    public void test2760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2760");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 0, 68.0f);
        contaCorrente2.setLimite((float) (short) 10);
        contaCorrente2.setSaldo(42.0f);
        float float7 = contaCorrente2.getLimite();
        contaCorrente2.setLimite((-87.0f));
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
    }

    @Test
    public void test2761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2761");
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
    public void test2762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2762");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(false, "NAO FORMA TRIANGULO", (float) '4');
        float float8 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: hi!", 0.0f);
        float float12 = pedido0.calculaTaxaDesconto(false, "ESCALENO", 0.0f);
        float float16 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ", (-59.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
    }

    @Test
    public void test2763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2763");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((-45.0f), (float) (short) 0);
    }

    @Test
    public void test2764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2764");
        java.lang.String str3 = codigos.Triangulo.classificaTriangulo(2, 3, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "NAO FORMA TRIANGULO" + "'", str3, "NAO FORMA TRIANGULO");
    }

    @Test
    public void test2765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2765");
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
    public void test2766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2766");
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
    public void test2767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2767");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(0.0f, 42.0f);
        contaCorrente2.setLimite(44.0f);
    }

    @Test
    public void test2768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2768");
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
    public void test2769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2769");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = codigos.Triangulo.classificaTriangulo((int) (byte) 1, 6, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type codigos.LadoInvalidoException; message: lado invalido");
        } catch (codigos.LadoInvalidoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2770");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", (float) (short) -1);
        float float8 = pedido0.calculaTaxaDesconto(true, "NAO FORMA TRIANGULO", (float) (byte) 0);
        float float12 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!", (float) (-1L));
        float float16 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: ", 99.0f);
        float float20 = pedido0.calculaTaxaDesconto(false, "NAO FORMA TRIANGULO", 97.0f);
        float float24 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: ", 62.0f);
        float float28 = pedido0.calculaTaxaDesconto(false, "EQUILATERO", 27.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10.0f + "'", float12 == 10.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.0f + "'", float24 == 0.0f);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 0.0f + "'", float28 == 0.0f);
    }

    @Test
    public void test2771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2771");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((-57.0f), 44.0f);
        contaCorrente2.setLimite(0.0f);
    }

    @Test
    public void test2772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2772");
        codigos.Words words0 = new codigos.Words();
        int int2 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int4 = words0.countWords("NAO FORMA TRIANGULO");
        int int6 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int8 = words0.countWords("NAO FORMA TRIANGULO");
        int int10 = words0.countWords("");
        int int12 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        int int14 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        int int16 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        int int18 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
    }

    @Test
    public void test2773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2773");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(69.0f, 27.0f);
    }

    @Test
    public void test2774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2774");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (short) 100, 99.0f);
        float float3 = contaCorrente2.getLimite();
        float float4 = contaCorrente2.getLimite();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 99.0f + "'", float3 == 99.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 99.0f + "'", float4 == 99.0f);
    }

    @Test
    public void test2775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2775");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(100.0f, (float) 1L);
    }

    @Test
    public void test2776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2776");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 1, (-50.0f));
    }

    @Test
    public void test2777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2777");
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
        int int22 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
    }

    @Test
    public void test2778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2778");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(80.0f, 92.0f);
        java.lang.Class<?> wildcardClass3 = contaCorrente2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2779");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(89.0f, (float) 3);
        contaCorrente2.setLimite(10.0f);
    }

    @Test
    public void test2780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2780");
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
    public void test2781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2781");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(22.0f, (-3.0f));
    }

    @Test
    public void test2782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2782");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (short) 1, 100.0f);
        float float4 = contaCorrente2.saque(58.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-57.0f) + "'", float4 == (-57.0f));
    }

    @Test
    public void test2783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2783");
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
    public void test2784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2784");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((-29.0f), (float) 4);
    }

    @Test
    public void test2785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2785");
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
    public void test2786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2786");
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
    public void test2787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2787");
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
    public void test2788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2788");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(88.0f, 65.0f);
        float float3 = contaCorrente2.getLimite();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 65.0f + "'", float3 == 65.0f);
    }

    @Test
    public void test2789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2789");
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
    public void test2790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2790");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 1L, (float) (short) 1);
        contaCorrente2.setLimite((-31.0f));
        float float5 = contaCorrente2.getSaldo();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
    }

    @Test
    public void test2791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2791");
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
    public void test2792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2792");
        codigos.LadoInvalidoException ladoInvalidoException1 = new codigos.LadoInvalidoException("codigos.LadoInvalidoException: hi!");
        codigos.LadoInvalidoException ladoInvalidoException3 = new codigos.LadoInvalidoException("hi!");
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException3);
        java.lang.Throwable[] throwableArray5 = ladoInvalidoException3.getSuppressed();
        java.lang.Throwable[] throwableArray6 = ladoInvalidoException3.getSuppressed();
        java.lang.Throwable[] throwableArray7 = ladoInvalidoException3.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException9 = new codigos.LadoInvalidoException("ESCALENO");
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
        ladoInvalidoException20.addSuppressed((java.lang.Throwable) ladoInvalidoException35);
        codigos.LadoInvalidoException ladoInvalidoException43 = new codigos.LadoInvalidoException("codigos.LadoInvalidoException: hi!");
        codigos.LadoInvalidoException ladoInvalidoException45 = new codigos.LadoInvalidoException("hi!");
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
        codigos.LadoInvalidoException ladoInvalidoException80 = new codigos.LadoInvalidoException("codigos.LadoInvalidoException: hi!");
        ladoInvalidoException72.addSuppressed((java.lang.Throwable) ladoInvalidoException80);
        ladoInvalidoException45.addSuppressed((java.lang.Throwable) ladoInvalidoException80);
        java.lang.Throwable[] throwableArray83 = ladoInvalidoException80.getSuppressed();
        ladoInvalidoException35.addSuppressed((java.lang.Throwable) ladoInvalidoException80);
        ladoInvalidoException9.addSuppressed((java.lang.Throwable) ladoInvalidoException35);
        ladoInvalidoException3.addSuppressed((java.lang.Throwable) ladoInvalidoException9);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertNotNull(throwableArray40);
        org.junit.Assert.assertNotNull(throwableArray60);
        org.junit.Assert.assertNotNull(throwableArray75);
        org.junit.Assert.assertNotNull(throwableArray77);
        org.junit.Assert.assertNotNull(throwableArray83);
    }

    @Test
    public void test2793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2793");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 10, 66.0f);
        float float3 = contaCorrente2.getLimite();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 66.0f + "'", float3 == 66.0f);
    }

    @Test
    public void test2794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2794");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 10, (float) (-1L));
        float float3 = contaCorrente2.getLimite();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test2795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2795");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((-90.0f), 67.0f);
        float float3 = contaCorrente2.getLimite();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 67.0f + "'", float3 == 67.0f);
    }

    @Test
    public void test2796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2796");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = codigos.Triangulo.classificaTriangulo((-1), 6, 0);
            org.junit.Assert.fail("Expected exception of type codigos.LadoInvalidoException; message: lado invalido");
        } catch (codigos.LadoInvalidoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2797");
        codigos.Words words0 = new codigos.Words();
        int int2 = words0.countWords("codigos.LadoInvalidoException: ");
        int int4 = words0.countWords("");
        int int6 = words0.countWords("ESCALENO");
        int int8 = words0.countWords("");
        int int10 = words0.countWords("codigos.LadoInvalidoException: NAO FORMA TRIANGULO");
        int int12 = words0.countWords("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2798");
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
    public void test2799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2799");
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
    public void test2800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2800");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 2, 9.0f);
        float float3 = contaCorrente2.getSaldo();
        float float4 = contaCorrente2.getLimite();
        float float5 = contaCorrente2.getSaldo();
        float float6 = contaCorrente2.getLimite();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3 == 2.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 9.0f + "'", float4 == 9.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 2.0f + "'", float5 == 2.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 9.0f + "'", float6 == 9.0f);
    }

    @Test
    public void test2801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2801");
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
        codigos.LadoInvalidoException ladoInvalidoException67 = new codigos.LadoInvalidoException("hi!");
        codigos.LadoInvalidoException ladoInvalidoException69 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException71 = new codigos.LadoInvalidoException("");
        ladoInvalidoException69.addSuppressed((java.lang.Throwable) ladoInvalidoException71);
        codigos.LadoInvalidoException ladoInvalidoException74 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException76 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException78 = new codigos.LadoInvalidoException("");
        ladoInvalidoException76.addSuppressed((java.lang.Throwable) ladoInvalidoException78);
        ladoInvalidoException74.addSuppressed((java.lang.Throwable) ladoInvalidoException78);
        java.lang.Throwable[] throwableArray81 = ladoInvalidoException78.getSuppressed();
        ladoInvalidoException71.addSuppressed((java.lang.Throwable) ladoInvalidoException78);
        ladoInvalidoException67.addSuppressed((java.lang.Throwable) ladoInvalidoException78);
        ladoInvalidoException50.addSuppressed((java.lang.Throwable) ladoInvalidoException67);
        java.lang.Throwable[] throwableArray85 = ladoInvalidoException50.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray40);
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertNotNull(throwableArray53);
        org.junit.Assert.assertNotNull(throwableArray62);
        org.junit.Assert.assertNotNull(throwableArray81);
        org.junit.Assert.assertNotNull(throwableArray85);
    }

    @Test
    public void test2802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2802");
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
    public void test2803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2803");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = codigos.Triangulo.classificaTriangulo((int) (short) -1, (-1), (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type codigos.LadoInvalidoException; message: lado invalido");
        } catch (codigos.LadoInvalidoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2804");
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
    public void test2805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2805");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 1L, (float) (short) 100);
        contaCorrente2.setLimite(99.0f);
        float float5 = contaCorrente2.getLimite();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 99.0f + "'", float5 == 99.0f);
    }

    @Test
    public void test2806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2806");
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
    public void test2807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2807");
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
    public void test2808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2808");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        float float3 = contaCorrente2.getSaldo();
        contaCorrente2.setSaldo(100.0f);
        contaCorrente2.setLimite(10.0f);
        float float9 = contaCorrente2.saque((float) 1L);
        contaCorrente2.setLimite((float) (byte) 10);
        contaCorrente2.setLimite((float) (-1));
        float float14 = contaCorrente2.getLimite();
        contaCorrente2.setLimite((float) 100L);
        float float17 = contaCorrente2.getLimite();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 99.0f + "'", float9 == 99.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + (-1.0f) + "'", float14 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 100.0f + "'", float17 == 100.0f);
    }

    @Test
    public void test2809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2809");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(90.0f, (float) (-1));
        float float3 = contaCorrente2.getLimite();
        float float4 = contaCorrente2.getLimite();
        contaCorrente2.setSaldo((float) 3);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.0f) + "'", float4 == (-1.0f));
    }

    @Test
    public void test2810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2810");
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
    public void test2811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2811");
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
    public void test2812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2812");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(0.0f, 0.0f);
        float float3 = contaCorrente2.getLimite();
        float float4 = contaCorrente2.getSaldo();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
    }

    @Test
    public void test2813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2813");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(3.0f, 96.0f);
        float float3 = contaCorrente2.getLimite();
        float float4 = contaCorrente2.getSaldo();
        float float5 = contaCorrente2.getLimite();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 96.0f + "'", float3 == 96.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 3.0f + "'", float4 == 3.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 96.0f + "'", float5 == 96.0f);
    }

    @Test
    public void test2814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2814");
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
    public void test2815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2815");
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
    public void test2816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2816");
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
    public void test2817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2817");
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
    public void test2818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2818");
        codigos.Words words0 = new codigos.Words();
        int int2 = words0.countWords("codigos.LadoInvalidoException: ");
        int int4 = words0.countWords("hi!");
        int int6 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        int int8 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
    }

    @Test
    public void test2819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2819");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(9.0f, 32.0f);
        contaCorrente2.setSaldo(1.0f);
        float float5 = contaCorrente2.getLimite();
        contaCorrente2.setLimite((-9.0f));
        contaCorrente2.setSaldo(87.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 32.0f + "'", float5 == 32.0f);
    }

    @Test
    public void test2820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2820");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 1, (-88.0f));
        contaCorrente2.setSaldo((float) 1);
    }

    @Test
    public void test2821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2821");
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
    public void test2822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2822");
        codigos.LadoInvalidoException ladoInvalidoException1 = new codigos.LadoInvalidoException("");
        java.lang.Throwable[] throwableArray2 = ladoInvalidoException1.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException4 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException6 = new codigos.LadoInvalidoException("");
        ladoInvalidoException4.addSuppressed((java.lang.Throwable) ladoInvalidoException6);
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
        java.lang.Throwable[] throwableArray23 = ladoInvalidoException18.getSuppressed();
        ladoInvalidoException6.addSuppressed((java.lang.Throwable) ladoInvalidoException18);
        java.lang.Throwable[] throwableArray25 = ladoInvalidoException18.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException27 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException29 = new codigos.LadoInvalidoException("");
        ladoInvalidoException27.addSuppressed((java.lang.Throwable) ladoInvalidoException29);
        codigos.LadoInvalidoException ladoInvalidoException32 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException34 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException36 = new codigos.LadoInvalidoException("");
        ladoInvalidoException34.addSuppressed((java.lang.Throwable) ladoInvalidoException36);
        ladoInvalidoException32.addSuppressed((java.lang.Throwable) ladoInvalidoException36);
        java.lang.Throwable[] throwableArray39 = ladoInvalidoException36.getSuppressed();
        ladoInvalidoException29.addSuppressed((java.lang.Throwable) ladoInvalidoException36);
        java.lang.Throwable[] throwableArray41 = ladoInvalidoException36.getSuppressed();
        ladoInvalidoException18.addSuppressed((java.lang.Throwable) ladoInvalidoException36);
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
        ladoInvalidoException18.addSuppressed((java.lang.Throwable) ladoInvalidoException53);
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException18);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertNotNull(throwableArray41);
        org.junit.Assert.assertNotNull(throwableArray56);
        org.junit.Assert.assertNotNull(throwableArray58);
    }

    @Test
    public void test2823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2823");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = codigos.Triangulo.classificaTriangulo((-1), 4, 1);
            org.junit.Assert.fail("Expected exception of type codigos.LadoInvalidoException; message: lado invalido");
        } catch (codigos.LadoInvalidoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2824");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 10, 10.0f);
        float float3 = contaCorrente2.getSaldo();
        float float4 = contaCorrente2.getSaldo();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
    }

    @Test
    public void test2825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2825");
        codigos.Words words0 = new codigos.Words();
        int int2 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int4 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int6 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        int int8 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
    }

    @Test
    public void test2826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2826");
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
    public void test2827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2827");
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
    public void test2828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2828");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 100, (-2.0f));
    }

    @Test
    public void test2829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2829");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(91.0f, 97.0f);
    }

    @Test
    public void test2830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2830");
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
    public void test2831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2831");
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
    public void test2832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2832");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        float float3 = contaCorrente2.getLimite();
        float float4 = contaCorrente2.getSaldo();
        float float5 = contaCorrente2.getLimite();
        contaCorrente2.setSaldo((-1.0f));
        float float8 = contaCorrente2.getSaldo();
        float float9 = contaCorrente2.getLimite();
        float float10 = contaCorrente2.getSaldo();
        float float11 = contaCorrente2.getLimite();
        float float12 = contaCorrente2.getSaldo();
        float float13 = contaCorrente2.getSaldo();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-1.0f) + "'", float8 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-1.0f) + "'", float10 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + (-1.0f) + "'", float11 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + (-1.0f) + "'", float13 == (-1.0f));
    }

    @Test
    public void test2833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2833");
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
    public void test2834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2834");
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
    public void test2835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2835");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(0.0f, 8.0f);
    }

    @Test
    public void test2836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2836");
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
    public void test2837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2837");
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
    public void test2838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2838");
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
    public void test2839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2839");
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
        java.lang.Throwable[] throwableArray55 = ladoInvalidoException47.getSuppressed();
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
        java.lang.Throwable[] throwableArray71 = ladoInvalidoException59.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException73 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException75 = new codigos.LadoInvalidoException("");
        ladoInvalidoException73.addSuppressed((java.lang.Throwable) ladoInvalidoException75);
        codigos.LadoInvalidoException ladoInvalidoException78 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException80 = new codigos.LadoInvalidoException("");
        ladoInvalidoException78.addSuppressed((java.lang.Throwable) ladoInvalidoException80);
        codigos.LadoInvalidoException ladoInvalidoException83 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException85 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException87 = new codigos.LadoInvalidoException("");
        ladoInvalidoException85.addSuppressed((java.lang.Throwable) ladoInvalidoException87);
        ladoInvalidoException83.addSuppressed((java.lang.Throwable) ladoInvalidoException87);
        java.lang.Throwable[] throwableArray90 = ladoInvalidoException87.getSuppressed();
        ladoInvalidoException80.addSuppressed((java.lang.Throwable) ladoInvalidoException87);
        java.lang.Throwable[] throwableArray92 = ladoInvalidoException87.getSuppressed();
        ladoInvalidoException75.addSuppressed((java.lang.Throwable) ladoInvalidoException87);
        java.lang.Throwable[] throwableArray94 = ladoInvalidoException87.getSuppressed();
        java.lang.Throwable[] throwableArray95 = ladoInvalidoException87.getSuppressed();
        ladoInvalidoException59.addSuppressed((java.lang.Throwable) ladoInvalidoException87);
        ladoInvalidoException47.addSuppressed((java.lang.Throwable) ladoInvalidoException59);
        java.lang.Throwable[] throwableArray98 = ladoInvalidoException47.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray50);
        org.junit.Assert.assertNotNull(throwableArray52);
        org.junit.Assert.assertNotNull(throwableArray55);
        org.junit.Assert.assertNotNull(throwableArray69);
        org.junit.Assert.assertNotNull(throwableArray71);
        org.junit.Assert.assertNotNull(throwableArray90);
        org.junit.Assert.assertNotNull(throwableArray92);
        org.junit.Assert.assertNotNull(throwableArray94);
        org.junit.Assert.assertNotNull(throwableArray95);
        org.junit.Assert.assertNotNull(throwableArray98);
    }

    @Test
    public void test2840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2840");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 4, 23.0f);
        float float3 = contaCorrente2.getSaldo();
        contaCorrente2.setSaldo(68.0f);
        float float6 = contaCorrente2.getLimite();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 4.0f + "'", float3 == 4.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 23.0f + "'", float6 == 23.0f);
    }

    @Test
    public void test2841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2841");
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
    public void test2842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2842");
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
    public void test2843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2843");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(8.0f, (-10.0f));
        contaCorrente2.setLimite((float) 1);
    }

    @Test
    public void test2844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2844");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 100L, (float) (-1L));
        float float3 = contaCorrente2.getLimite();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test2845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2845");
        java.lang.String str3 = codigos.Triangulo.classificaTriangulo(100, (int) (short) 10, 3);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "NAO FORMA TRIANGULO" + "'", str3, "NAO FORMA TRIANGULO");
    }

    @Test
    public void test2846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2846");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = codigos.Triangulo.classificaTriangulo((-1), 100, 2);
            org.junit.Assert.fail("Expected exception of type codigos.LadoInvalidoException; message: lado invalido");
        } catch (codigos.LadoInvalidoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2847");
        java.lang.String str3 = codigos.Triangulo.classificaTriangulo(3, 1, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "NAO FORMA TRIANGULO" + "'", str3, "NAO FORMA TRIANGULO");
    }

    @Test
    public void test2848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2848");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(90.0f, (float) (-1));
        contaCorrente2.setLimite((float) 0);
        contaCorrente2.setSaldo(98.0f);
        contaCorrente2.setLimite(56.0f);
    }

    @Test
    public void test2849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2849");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(32.0f, (float) 10L);
        float float3 = contaCorrente2.getSaldo();
        java.lang.Class<?> wildcardClass4 = contaCorrente2.getClass();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 32.0f + "'", float3 == 32.0f);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2850");
        codigos.Words words0 = new codigos.Words();
        int int2 = words0.countWords("");
        int int4 = words0.countWords("NAO FORMA TRIANGULO");
        int int6 = words0.countWords("codigos.LadoInvalidoException: ");
        int int8 = words0.countWords("NAO FORMA TRIANGULO");
        int int10 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test2851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2851");
        java.lang.String str3 = codigos.Triangulo.classificaTriangulo((int) (byte) 100, (int) (short) 10, 3);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "NAO FORMA TRIANGULO" + "'", str3, "NAO FORMA TRIANGULO");
    }

    @Test
    public void test2852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2852");
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
        java.lang.Throwable[] throwableArray61 = ladoInvalidoException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray55);
        org.junit.Assert.assertNotNull(throwableArray58);
        org.junit.Assert.assertNotNull(throwableArray59);
        org.junit.Assert.assertNotNull(throwableArray61);
    }

    @Test
    public void test2853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2853");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 1L, 96.0f);
        contaCorrente2.setSaldo((float) (short) 0);
        float float5 = contaCorrente2.getSaldo();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
    }

    @Test
    public void test2854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2854");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", (float) (-1L));
        float float8 = pedido0.calculaTaxaDesconto(true, "hi!", 90.0f);
        float float12 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!", (-11.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
    }

    @Test
    public void test2855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2855");
        codigos.Words words0 = new codigos.Words();
        int int2 = words0.countWords("");
        int int4 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!");
        int int6 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        int int8 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        int int10 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
    }

    @Test
    public void test2856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2856");
        java.lang.String str3 = codigos.Triangulo.classificaTriangulo(5, (int) (byte) 100, 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ISOSCELES" + "'", str3, "ISOSCELES");
    }

    @Test
    public void test2857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2857");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = codigos.Triangulo.classificaTriangulo(4, 0, 3);
            org.junit.Assert.fail("Expected exception of type codigos.LadoInvalidoException; message: lado invalido");
        } catch (codigos.LadoInvalidoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2858");
        codigos.Words words0 = new codigos.Words();
        int int2 = words0.countWords("codigos.LadoInvalidoException: ");
        int int4 = words0.countWords("");
        int int6 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
    }

    @Test
    public void test2859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2859");
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
        java.lang.Throwable[] throwableArray59 = ladoInvalidoException10.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(throwableArray52);
        org.junit.Assert.assertNotNull(throwableArray54);
        org.junit.Assert.assertNotNull(throwableArray56);
        org.junit.Assert.assertNotNull(throwableArray59);
    }

    @Test
    public void test2860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2860");
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
    public void test2861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2861");
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
    public void test2862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2862");
        java.lang.String str3 = codigos.Triangulo.classificaTriangulo((int) (short) 100, (int) '4', (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ISOSCELES" + "'", str3, "ISOSCELES");
    }

    @Test
    public void test2863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2863");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(3.0f, 35.0f);
    }

    @Test
    public void test2864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2864");
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
    public void test2865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2865");
        codigos.Words words0 = new codigos.Words();
        int int2 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int4 = words0.countWords("NAO FORMA TRIANGULO");
        int int6 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int8 = words0.countWords("NAO FORMA TRIANGULO");
        int int10 = words0.countWords("");
        int int12 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        int int14 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test2866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2866");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 1, (float) 0);
    }

    @Test
    public void test2867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2867");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((-45.0f), 98.0f);
        float float3 = contaCorrente2.getLimite();
        contaCorrente2.setSaldo((float) 'a');
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 98.0f + "'", float3 == 98.0f);
    }

    @Test
    public void test2868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2868");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((-87.0f), (float) (short) -1);
    }

    @Test
    public void test2869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2869");
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
    public void test2870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2870");
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
    public void test2871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2871");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((-9.0f), (float) '4');
    }

    @Test
    public void test2872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2872");
        codigos.Words words0 = new codigos.Words();
        int int2 = words0.countWords("ESCALENO");
        int int4 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        int int6 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        int int8 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        int int10 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        int int12 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: NAO FORMA TRIANGULO");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test2873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2873");
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
    public void test2874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2874");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 4, 23.0f);
        float float3 = contaCorrente2.getSaldo();
        float float4 = contaCorrente2.getSaldo();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 4.0f + "'", float3 == 4.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 4.0f + "'", float4 == 4.0f);
    }

    @Test
    public void test2875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2875");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(32.0f, (float) 10L);
        float float3 = contaCorrente2.getSaldo();
        contaCorrente2.setLimite(42.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 32.0f + "'", float3 == 32.0f);
    }

    @Test
    public void test2876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2876");
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
    public void test2877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2877");
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
    public void test2878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2878");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = codigos.Triangulo.classificaTriangulo(0, (int) 'a', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type codigos.LadoInvalidoException; message: lado invalido");
        } catch (codigos.LadoInvalidoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2879");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = codigos.Triangulo.classificaTriangulo((-1), (-1), 4);
            org.junit.Assert.fail("Expected exception of type codigos.LadoInvalidoException; message: lado invalido");
        } catch (codigos.LadoInvalidoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2880");
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
    public void test2881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2881");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 0, (float) 10L);
        float float4 = contaCorrente2.saque(2.0f);
        contaCorrente2.setLimite(0.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-2.0f) + "'", float4 == (-2.0f));
    }

    @Test
    public void test2882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2882");
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
        contaCorrente2.setSaldo((float) (short) -1);
        contaCorrente2.setLimite(0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 100.0f + "'", float14 == 100.0f);
    }

    @Test
    public void test2883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2883");
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
    public void test2884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2884");
        codigos.LadoInvalidoException ladoInvalidoException1 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException3 = new codigos.LadoInvalidoException("");
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException3);
        codigos.LadoInvalidoException ladoInvalidoException6 = new codigos.LadoInvalidoException("hi!");
        ladoInvalidoException3.addSuppressed((java.lang.Throwable) ladoInvalidoException6);
        java.lang.Throwable[] throwableArray8 = ladoInvalidoException6.getSuppressed();
        java.lang.Throwable[] throwableArray9 = ladoInvalidoException6.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException11 = new codigos.LadoInvalidoException("codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        java.lang.Throwable[] throwableArray12 = ladoInvalidoException11.getSuppressed();
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
        ladoInvalidoException23.addSuppressed((java.lang.Throwable) ladoInvalidoException38);
        codigos.LadoInvalidoException ladoInvalidoException46 = new codigos.LadoInvalidoException("codigos.LadoInvalidoException: hi!");
        ladoInvalidoException38.addSuppressed((java.lang.Throwable) ladoInvalidoException46);
        java.lang.Throwable[] throwableArray48 = ladoInvalidoException46.getSuppressed();
        ladoInvalidoException11.addSuppressed((java.lang.Throwable) ladoInvalidoException46);
        codigos.LadoInvalidoException ladoInvalidoException51 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException53 = new codigos.LadoInvalidoException("");
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
        java.lang.Throwable[] throwableArray70 = ladoInvalidoException65.getSuppressed();
        ladoInvalidoException53.addSuppressed((java.lang.Throwable) ladoInvalidoException65);
        java.lang.Throwable[] throwableArray72 = ladoInvalidoException65.getSuppressed();
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
        ladoInvalidoException65.addSuppressed((java.lang.Throwable) ladoInvalidoException83);
        java.lang.Throwable[] throwableArray90 = ladoInvalidoException83.getSuppressed();
        ladoInvalidoException11.addSuppressed((java.lang.Throwable) ladoInvalidoException83);
        java.lang.Throwable[] throwableArray92 = ladoInvalidoException11.getSuppressed();
        ladoInvalidoException6.addSuppressed((java.lang.Throwable) ladoInvalidoException11);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray41);
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertNotNull(throwableArray48);
        org.junit.Assert.assertNotNull(throwableArray68);
        org.junit.Assert.assertNotNull(throwableArray70);
        org.junit.Assert.assertNotNull(throwableArray72);
        org.junit.Assert.assertNotNull(throwableArray86);
        org.junit.Assert.assertNotNull(throwableArray88);
        org.junit.Assert.assertNotNull(throwableArray90);
        org.junit.Assert.assertNotNull(throwableArray92);
    }

    @Test
    public void test2885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2885");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        float float3 = contaCorrente2.getSaldo();
        contaCorrente2.setSaldo(100.0f);
        float float7 = contaCorrente2.saque((float) (byte) 10);
        contaCorrente2.setSaldo((float) 100);
        contaCorrente2.setLimite(31.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 90.0f + "'", float7 == 90.0f);
    }

    @Test
    public void test2886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2886");
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
    public void test2887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2887");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) '#', (-1.0f));
        contaCorrente2.setSaldo(90.0f);
        float float5 = contaCorrente2.getSaldo();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 90.0f + "'", float5 == 90.0f);
    }

    @Test
    public void test2888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2888");
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
    public void test2889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2889");
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
    public void test2890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2890");
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
    public void test2891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2891");
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
    public void test2892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2892");
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
    public void test2893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2893");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(32.0f, (float) (byte) 0);
        contaCorrente2.setSaldo(10.0f);
        contaCorrente2.setLimite(9.0f);
        float float7 = contaCorrente2.getSaldo();
        contaCorrente2.setLimite(10.0f);
        float float10 = contaCorrente2.getLimite();
        float float11 = contaCorrente2.getLimite();
        float float12 = contaCorrente2.getLimite();
        contaCorrente2.setSaldo(89.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10.0f + "'", float12 == 10.0f);
    }

    @Test
    public void test2894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2894");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((-1.0f), (-48.0f));
    }

    @Test
    public void test2895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2895");
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
    public void test2896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2896");
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
        float float17 = contaCorrente2.getSaldo();
        float float18 = contaCorrente2.getSaldo();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 32.0f + "'", float17 == 32.0f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 32.0f + "'", float18 == 32.0f);
    }

    @Test
    public void test2897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2897");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(100.0f, 60.0f);
    }

    @Test
    public void test2898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2898");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", 1.0f);
        float float8 = pedido0.calculaTaxaDesconto(false, "NAO FORMA TRIANGULO", 10.0f);
        float float12 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: ", (float) (-1L));
        float float16 = pedido0.calculaTaxaDesconto(false, "NAO FORMA TRIANGULO", (float) 2);
        float float20 = pedido0.calculaTaxaDesconto(false, "", 88.0f);
        float float24 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!", 60.0f);
        float float28 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!", (float) '#');
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.0f + "'", float24 == 0.0f);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 10.0f + "'", float28 == 10.0f);
    }

    @Test
    public void test2899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2899");
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
    public void test2900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2900");
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
    public void test2901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2901");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (short) 100, 99.0f);
        contaCorrente2.setSaldo((float) 10);
        contaCorrente2.setLimite(97.0f);
        float float7 = contaCorrente2.getLimite();
        contaCorrente2.setLimite((float) 100);
        float float11 = contaCorrente2.saque(60.0f);
        float float12 = contaCorrente2.getLimite();
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 97.0f + "'", float7 == 97.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + (-50.0f) + "'", float11 == (-50.0f));
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 100.0f + "'", float12 == 100.0f);
    }

    @Test
    public void test2902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2902");
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
    public void test2903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2903");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (-1L), (float) 1L);
        float float3 = contaCorrente2.getLimite();
        contaCorrente2.setLimite((float) '4');
        float float6 = contaCorrente2.getSaldo();
        contaCorrente2.setSaldo((-1.0f));
        float float10 = contaCorrente2.saque((float) 10L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-1.0f) + "'", float6 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-11.0f) + "'", float10 == (-11.0f));
    }

    @Test
    public void test2904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2904");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 10, 0.0f);
        contaCorrente2.setSaldo((float) (byte) 0);
        float float5 = contaCorrente2.getSaldo();
        contaCorrente2.setSaldo((float) 0);
        contaCorrente2.setLimite((float) (byte) 10);
        contaCorrente2.setLimite((float) 0);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
    }

    @Test
    public void test2905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2905");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(42.0f, (float) (-1L));
        contaCorrente2.setSaldo((float) 100);
    }

    @Test
    public void test2906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2906");
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
    public void test2907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2907");
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
    public void test2908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2908");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(99.0f, (float) 'a');
        float float3 = contaCorrente2.getSaldo();
        contaCorrente2.setLimite((-14.0f));
        float float6 = contaCorrente2.getSaldo();
        float float7 = contaCorrente2.getLimite();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 99.0f + "'", float3 == 99.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 99.0f + "'", float6 == 99.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-14.0f) + "'", float7 == (-14.0f));
    }

    @Test
    public void test2909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2909");
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
    public void test2910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2910");
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
    public void test2911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2911");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((-32.0f), 4.0f);
    }

    @Test
    public void test2912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2912");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = codigos.Triangulo.classificaTriangulo(0, (int) ' ', 100);
            org.junit.Assert.fail("Expected exception of type codigos.LadoInvalidoException; message: lado invalido");
        } catch (codigos.LadoInvalidoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2913");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 0L, (float) (short) 100);
        float float3 = contaCorrente2.getLimite();
        contaCorrente2.setLimite(32.0f);
        contaCorrente2.setLimite((float) 100L);
        contaCorrente2.setSaldo(56.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test2914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2914");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        float float3 = contaCorrente2.getSaldo();
        contaCorrente2.setSaldo(100.0f);
        contaCorrente2.setLimite(10.0f);
        float float8 = contaCorrente2.getLimite();
        contaCorrente2.setLimite(90.0f);
        contaCorrente2.setSaldo((float) 100L);
        float float14 = contaCorrente2.saque(88.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 12.0f + "'", float14 == 12.0f);
    }

    @Test
    public void test2915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2915");
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
    public void test2916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2916");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", 1.0f);
        float float8 = pedido0.calculaTaxaDesconto(false, "", (float) 1);
        float float12 = pedido0.calculaTaxaDesconto(false, "hi!", (float) (short) 100);
        float float16 = pedido0.calculaTaxaDesconto(true, "", (float) ' ');
        float float20 = pedido0.calculaTaxaDesconto(false, "ISOSCELES", (float) 2);
        float float24 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ", (-41.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 10.0f + "'", float24 == 10.0f);
    }

    @Test
    public void test2917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2917");
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
    public void test2918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2918");
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
    public void test2919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2919");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(4.0f, 3.0f);
        float float4 = contaCorrente2.saque((float) 6);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-2.0f) + "'", float4 == (-2.0f));
    }

    @Test
    public void test2920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2920");
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
        java.lang.Throwable[] throwableArray52 = ladoInvalidoException50.getSuppressed();
        ladoInvalidoException5.addSuppressed((java.lang.Throwable) ladoInvalidoException50);
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException5);
        java.lang.Throwable[] throwableArray55 = ladoInvalidoException5.getSuppressed();
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
        java.lang.Throwable[] throwableArray86 = ladoInvalidoException81.getSuppressed();
        ladoInvalidoException66.addSuppressed((java.lang.Throwable) ladoInvalidoException81);
        codigos.LadoInvalidoException ladoInvalidoException89 = new codigos.LadoInvalidoException("ESCALENO");
        ladoInvalidoException81.addSuppressed((java.lang.Throwable) ladoInvalidoException89);
        java.lang.Throwable[] throwableArray91 = ladoInvalidoException81.getSuppressed();
        java.lang.Throwable[] throwableArray92 = ladoInvalidoException81.getSuppressed();
        ladoInvalidoException5.addSuppressed((java.lang.Throwable) ladoInvalidoException81);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray45);
        org.junit.Assert.assertNotNull(throwableArray47);
        org.junit.Assert.assertNotNull(throwableArray52);
        org.junit.Assert.assertNotNull(throwableArray55);
        org.junit.Assert.assertNotNull(throwableArray69);
        org.junit.Assert.assertNotNull(throwableArray84);
        org.junit.Assert.assertNotNull(throwableArray86);
        org.junit.Assert.assertNotNull(throwableArray91);
        org.junit.Assert.assertNotNull(throwableArray92);
    }

    @Test
    public void test2921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2921");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((-9.0f), 65.0f);
        float float4 = contaCorrente2.saque(7.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-16.0f) + "'", float4 == (-16.0f));
    }

    @Test
    public void test2922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2922");
        codigos.Words words0 = new codigos.Words();
        int int2 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int4 = words0.countWords("NAO FORMA TRIANGULO");
        int int6 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int8 = words0.countWords("NAO FORMA TRIANGULO");
        int int10 = words0.countWords("");
        int int12 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int14 = words0.countWords("codigos.LadoInvalidoException: ");
        int int16 = words0.countWords("");
        int int18 = words0.countWords("");
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
    public void test2923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2923");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(90.0f, (float) (-1));
        contaCorrente2.setLimite((float) 0);
        java.lang.Class<?> wildcardClass5 = contaCorrente2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2924");
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
    public void test2925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2925");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(0.0f, (-16.0f));
    }

    @Test
    public void test2926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2926");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((-52.0f), (-30.0f));
    }

    @Test
    public void test2927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2927");
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
    public void test2928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2928");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) '#', 2.0f);
        float float3 = contaCorrente2.getLimite();
        float float4 = contaCorrente2.getLimite();
        float float5 = contaCorrente2.getSaldo();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3 == 2.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 2.0f + "'", float4 == 2.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 35.0f + "'", float5 == 35.0f);
    }

    @Test
    public void test2929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2929");
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
    public void test2930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2930");
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
        float float19 = contaCorrente2.getLimite();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 10.0f + "'", float17 == 10.0f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 32.0f + "'", float18 == 32.0f);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 10.0f + "'", float19 == 10.0f);
    }

    @Test
    public void test2931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2931");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 0, (-45.0f));
        contaCorrente2.setLimite(1.0f);
        contaCorrente2.setSaldo((-1.0f));
        float float7 = contaCorrente2.getLimite();
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 1.0f + "'", float7 == 1.0f);
    }

    @Test
    public void test2932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2932");
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
    public void test2933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2933");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(10.0f, 47.0f);
        contaCorrente2.setSaldo(66.0f);
        float float5 = contaCorrente2.getSaldo();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 66.0f + "'", float5 == 66.0f);
    }

    @Test
    public void test2934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2934");
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
    public void test2935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2935");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(97.0f, (float) ' ');
        float float4 = contaCorrente2.saque((float) 1L);
        float float6 = contaCorrente2.saque(27.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 96.0f + "'", float4 == 96.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 69.0f + "'", float6 == 69.0f);
    }

    @Test
    public void test2936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2936");
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
    public void test2937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2937");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(1.0f, 1.0f);
        contaCorrente2.setSaldo((float) (short) 10);
        float float5 = contaCorrente2.getLimite();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
    }

    @Test
    public void test2938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2938");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 10, 0.0f);
        float float3 = contaCorrente2.getSaldo();
        float float5 = contaCorrente2.saque(1.0f);
        contaCorrente2.setSaldo(100.0f);
        contaCorrente2.setLimite(2.0f);
        contaCorrente2.setSaldo((float) '#');
        float float12 = contaCorrente2.getSaldo();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 9.0f + "'", float5 == 9.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 35.0f + "'", float12 == 35.0f);
    }

    @Test
    public void test2939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2939");
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
    public void test2940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2940");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 0, 4.0f);
    }

    @Test
    public void test2941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2941");
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
    public void test2942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2942");
        java.lang.String str3 = codigos.Triangulo.classificaTriangulo((int) ' ', (int) ' ', 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "NAO FORMA TRIANGULO" + "'", str3, "NAO FORMA TRIANGULO");
    }

    @Test
    public void test2943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2943");
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
    public void test2944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2944");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 10, 0.0f);
        contaCorrente2.setSaldo((float) (byte) 0);
        float float5 = contaCorrente2.getSaldo();
        contaCorrente2.setSaldo((float) 0);
        contaCorrente2.setLimite(2.0f);
        contaCorrente2.setSaldo((float) 10);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
    }

    @Test
    public void test2945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2945");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 100L, (float) 10);
        float float3 = contaCorrente2.getSaldo();
        float float4 = contaCorrente2.getLimite();
        float float6 = contaCorrente2.saque((float) 1L);
        contaCorrente2.setLimite((float) 1);
        float float10 = contaCorrente2.saque(52.0f);
        float float12 = contaCorrente2.saque(2.0f);
        contaCorrente2.setSaldo((float) (byte) 10);
        contaCorrente2.setSaldo((float) 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 99.0f + "'", float6 == 99.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 47.0f + "'", float10 == 47.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 45.0f + "'", float12 == 45.0f);
    }

    @Test
    public void test2946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2946");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(0.0f, 100.0f);
        float float3 = contaCorrente2.getLimite();
        float float4 = contaCorrente2.getSaldo();
        contaCorrente2.setLimite((-29.0f));
        float float7 = contaCorrente2.getSaldo();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
    }

    @Test
    public void test2947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2947");
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
    public void test2948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2948");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (short) 10, (float) (byte) -1);
        contaCorrente2.setSaldo(47.0f);
        float float5 = contaCorrente2.getLimite();
        float float6 = contaCorrente2.getLimite();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-1.0f) + "'", float6 == (-1.0f));
    }

    @Test
    public void test2949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2949");
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
    public void test2950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2950");
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
    public void test2951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2951");
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
    public void test2952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2952");
        java.lang.String str3 = codigos.Triangulo.classificaTriangulo(4, (int) (short) 10, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "NAO FORMA TRIANGULO" + "'", str3, "NAO FORMA TRIANGULO");
    }

    @Test
    public void test2953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2953");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(7.0f, (float) (short) -1);
    }

    @Test
    public void test2954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2954");
        codigos.Words words0 = new codigos.Words();
        int int2 = words0.countWords("ESCALENO");
        int int4 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        int int6 = words0.countWords("ESCALENO");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2955");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(90.0f, (float) (-1));
        contaCorrente2.setLimite((float) 0L);
        float float5 = contaCorrente2.getLimite();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
    }

    @Test
    public void test2956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2956");
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
    public void test2957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2957");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((-58.0f), 7.0f);
        contaCorrente2.setSaldo((-59.0f));
    }

    @Test
    public void test2958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2958");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(87.0f, (float) 3);
        contaCorrente2.setSaldo((float) '#');
    }

    @Test
    public void test2959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2959");
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
    public void test2960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2960");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((-1.0f), (float) 10);
    }

    @Test
    public void test2961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2961");
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
    public void test2962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2962");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (short) 0, 0.0f);
        contaCorrente2.setSaldo((float) 0L);
        contaCorrente2.setLimite(91.0f);
        float float7 = contaCorrente2.getSaldo();
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
    }

    @Test
    public void test2963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2963");
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
    public void test2964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2964");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = codigos.Triangulo.classificaTriangulo(10, 0, 2);
            org.junit.Assert.fail("Expected exception of type codigos.LadoInvalidoException; message: lado invalido");
        } catch (codigos.LadoInvalidoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2965");
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
    public void test2966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2966");
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
    public void test2967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2967");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(1.0f, (-2.0f));
    }

    @Test
    public void test2968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2968");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 100L, (float) 10);
        float float3 = contaCorrente2.getSaldo();
        float float4 = contaCorrente2.getLimite();
        float float6 = contaCorrente2.saque((float) 1L);
        contaCorrente2.setLimite((float) 1);
        float float9 = contaCorrente2.getLimite();
        contaCorrente2.setSaldo((float) 6);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 99.0f + "'", float6 == 99.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
    }

    @Test
    public void test2969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2969");
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
    public void test2970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2970");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((-10.0f), (float) ' ');
    }

    @Test
    public void test2971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2971");
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
    public void test2972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2972");
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
    public void test2973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2973");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = codigos.Triangulo.classificaTriangulo((int) (short) 10, 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type codigos.LadoInvalidoException; message: lado invalido");
        } catch (codigos.LadoInvalidoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2974");
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
    public void test2975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2975");
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
    public void test2976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2976");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(27.0f, 31.0f);
    }

    @Test
    public void test2977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2977");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = codigos.Triangulo.classificaTriangulo(0, (int) (short) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type codigos.LadoInvalidoException; message: lado invalido");
        } catch (codigos.LadoInvalidoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2978");
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
        int int20 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 5 + "'", int20 == 5);
    }

    @Test
    public void test2979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2979");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", 1.0f);
        float float8 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: hi!", (float) (short) 10);
        float float12 = pedido0.calculaTaxaDesconto(true, "NAO FORMA TRIANGULO", (float) 0L);
        float float16 = pedido0.calculaTaxaDesconto(true, "", 1.0f);
        float float20 = pedido0.calculaTaxaDesconto(false, "NAO FORMA TRIANGULO", (float) (-1L));
        float float24 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!", (float) 100);
        float float28 = pedido0.calculaTaxaDesconto(true, "NAO FORMA TRIANGULO", 100.0f);
        float float32 = pedido0.calculaTaxaDesconto(false, "hi!", (-1.0f));
        float float36 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: ", (float) ' ');
        float float40 = pedido0.calculaTaxaDesconto(false, "hi!", 60.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10.0f + "'", float12 == 10.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.0f + "'", float24 == 0.0f);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 10.0f + "'", float28 == 10.0f);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 0.0f + "'", float32 == 0.0f);
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 10.0f + "'", float36 == 10.0f);
        org.junit.Assert.assertTrue("'" + float40 + "' != '" + 0.0f + "'", float40 == 0.0f);
    }

    @Test
    public void test2980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2980");
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
    public void test2981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2981");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = codigos.Triangulo.classificaTriangulo(1, (int) (byte) 0, 5);
            org.junit.Assert.fail("Expected exception of type codigos.LadoInvalidoException; message: lado invalido");
        } catch (codigos.LadoInvalidoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2982");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 10, 0.0f);
        contaCorrente2.setLimite(68.0f);
        contaCorrente2.setLimite(80.0f);
    }

    @Test
    public void test2983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2983");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((-10.0f), (float) 0L);
    }

    @Test
    public void test2984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2984");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((-90.0f), (float) (-1L));
    }

    @Test
    public void test2985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2985");
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
    public void test2986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2986");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (short) 100, (float) 100);
    }

    @Test
    public void test2987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2987");
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
    public void test2988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2988");
        codigos.LadoInvalidoException ladoInvalidoException1 = new codigos.LadoInvalidoException("");
        java.lang.Throwable[] throwableArray2 = ladoInvalidoException1.getSuppressed();
        java.lang.Throwable[] throwableArray3 = ladoInvalidoException1.getSuppressed();
        java.lang.Throwable[] throwableArray4 = ladoInvalidoException1.getSuppressed();
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
        java.lang.Throwable[] throwableArray20 = ladoInvalidoException8.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException22 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException24 = new codigos.LadoInvalidoException("");
        ladoInvalidoException22.addSuppressed((java.lang.Throwable) ladoInvalidoException24);
        codigos.LadoInvalidoException ladoInvalidoException27 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException29 = new codigos.LadoInvalidoException("");
        ladoInvalidoException27.addSuppressed((java.lang.Throwable) ladoInvalidoException29);
        codigos.LadoInvalidoException ladoInvalidoException32 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException34 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException36 = new codigos.LadoInvalidoException("");
        ladoInvalidoException34.addSuppressed((java.lang.Throwable) ladoInvalidoException36);
        ladoInvalidoException32.addSuppressed((java.lang.Throwable) ladoInvalidoException36);
        java.lang.Throwable[] throwableArray39 = ladoInvalidoException36.getSuppressed();
        ladoInvalidoException29.addSuppressed((java.lang.Throwable) ladoInvalidoException36);
        java.lang.Throwable[] throwableArray41 = ladoInvalidoException36.getSuppressed();
        ladoInvalidoException24.addSuppressed((java.lang.Throwable) ladoInvalidoException36);
        java.lang.Throwable[] throwableArray43 = ladoInvalidoException36.getSuppressed();
        java.lang.Throwable[] throwableArray44 = ladoInvalidoException36.getSuppressed();
        ladoInvalidoException8.addSuppressed((java.lang.Throwable) ladoInvalidoException36);
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException8);
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
        java.lang.Throwable[] throwableArray79 = ladoInvalidoException57.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException81 = new codigos.LadoInvalidoException("codigos.LadoInvalidoException: hi!");
        ladoInvalidoException57.addSuppressed((java.lang.Throwable) ladoInvalidoException81);
        codigos.LadoInvalidoException ladoInvalidoException84 = new codigos.LadoInvalidoException("hi!");
        java.lang.Throwable[] throwableArray85 = ladoInvalidoException84.getSuppressed();
        ladoInvalidoException57.addSuppressed((java.lang.Throwable) ladoInvalidoException84);
        java.lang.Throwable[] throwableArray87 = ladoInvalidoException57.getSuppressed();
        ladoInvalidoException8.addSuppressed((java.lang.Throwable) ladoInvalidoException57);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertNotNull(throwableArray41);
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertNotNull(throwableArray60);
        org.junit.Assert.assertNotNull(throwableArray75);
        org.junit.Assert.assertNotNull(throwableArray77);
        org.junit.Assert.assertNotNull(throwableArray79);
        org.junit.Assert.assertNotNull(throwableArray85);
        org.junit.Assert.assertNotNull(throwableArray87);
    }

    @Test
    public void test2989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2989");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", 1.0f);
        float float8 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: hi!", (float) (short) 10);
        float float12 = pedido0.calculaTaxaDesconto(false, "NAO FORMA TRIANGULO", (-48.0f));
        float float16 = pedido0.calculaTaxaDesconto(false, "hi!", 10.0f);
        float float20 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!", (float) (byte) 100);
        float float24 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ", (float) (short) 100);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 10.0f + "'", float20 == 10.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.0f + "'", float24 == 0.0f);
    }

    @Test
    public void test2990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2990");
        codigos.Words words0 = new codigos.Words();
        int int2 = words0.countWords("");
        int int4 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!");
        int int6 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        int int8 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int10 = words0.countWords("NAO FORMA TRIANGULO");
        int int12 = words0.countWords("codigos.LadoInvalidoException: ESCALENO");
        int int14 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!");
        int int16 = words0.countWords("codigos.LadoInvalidoException: hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test2991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2991");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) ' ', 0.0f);
        float float3 = contaCorrente2.getSaldo();
        contaCorrente2.setLimite(0.0f);
        float float6 = contaCorrente2.getLimite();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 32.0f + "'", float3 == 32.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
    }

    @Test
    public void test2992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2992");
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
        codigos.LadoInvalidoException ladoInvalidoException67 = new codigos.LadoInvalidoException("hi!");
        codigos.LadoInvalidoException ladoInvalidoException69 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException71 = new codigos.LadoInvalidoException("");
        ladoInvalidoException69.addSuppressed((java.lang.Throwable) ladoInvalidoException71);
        codigos.LadoInvalidoException ladoInvalidoException74 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException76 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException78 = new codigos.LadoInvalidoException("");
        ladoInvalidoException76.addSuppressed((java.lang.Throwable) ladoInvalidoException78);
        ladoInvalidoException74.addSuppressed((java.lang.Throwable) ladoInvalidoException78);
        java.lang.Throwable[] throwableArray81 = ladoInvalidoException78.getSuppressed();
        ladoInvalidoException71.addSuppressed((java.lang.Throwable) ladoInvalidoException78);
        ladoInvalidoException67.addSuppressed((java.lang.Throwable) ladoInvalidoException78);
        ladoInvalidoException50.addSuppressed((java.lang.Throwable) ladoInvalidoException67);
        codigos.LadoInvalidoException ladoInvalidoException86 = new codigos.LadoInvalidoException("ESCALENO");
        java.lang.Throwable[] throwableArray87 = ladoInvalidoException86.getSuppressed();
        ladoInvalidoException67.addSuppressed((java.lang.Throwable) ladoInvalidoException86);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray40);
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertNotNull(throwableArray53);
        org.junit.Assert.assertNotNull(throwableArray62);
        org.junit.Assert.assertNotNull(throwableArray81);
        org.junit.Assert.assertNotNull(throwableArray87);
    }

    @Test
    public void test2993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2993");
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
    public void test2994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2994");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", (float) (short) -1);
        float float8 = pedido0.calculaTaxaDesconto(true, "NAO FORMA TRIANGULO", (float) (byte) 0);
        float float12 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: hi!", (float) (-1L));
        float float16 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!", (float) 10);
        float float20 = pedido0.calculaTaxaDesconto(true, "NAO FORMA TRIANGULO", (float) ' ');
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 10.0f + "'", float20 == 10.0f);
    }

    @Test
    public void test2995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2995");
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
    public void test2996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2996");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(10.0f, (float) (-1L));
        float float3 = contaCorrente2.getSaldo();
        float float4 = contaCorrente2.getSaldo();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
    }

    @Test
    public void test2997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2997");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(90.0f, 65.0f);
        float float4 = contaCorrente2.saque(45.0f);
        float float5 = contaCorrente2.getLimite();
        java.lang.Class<?> wildcardClass6 = contaCorrente2.getClass();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 45.0f + "'", float4 == 45.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 65.0f + "'", float5 == 65.0f);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2998");
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
    public void test2999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2999");
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
    public void test3000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test3000");
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
}

