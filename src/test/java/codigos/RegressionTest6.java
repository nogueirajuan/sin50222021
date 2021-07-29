import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest6 {

    public static boolean debug = false;

    @Test
    public void test3001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3001");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 10, 97.0f);
        float float4 = contaCorrente2.saque((float) (byte) 1);
        contaCorrente2.setLimite((float) 1);
        contaCorrente2.setSaldo((float) 2);
        contaCorrente2.setSaldo(55.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 9.0f + "'", float4 == 9.0f);
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 10, 0.0f);
        float float3 = contaCorrente2.getSaldo();
        contaCorrente2.setSaldo(10.0f);
        float float6 = contaCorrente2.getLimite();
        contaCorrente2.setSaldo(96.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
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
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
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
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
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
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(0.0f, (float) '4');
        float float3 = contaCorrente2.getSaldo();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", 1.0f);
        float float8 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: hi!", (float) (short) 10);
        float float12 = pedido0.calculaTaxaDesconto(true, "NAO FORMA TRIANGULO", (float) 0L);
        float float16 = pedido0.calculaTaxaDesconto(true, "", 1.0f);
        float float20 = pedido0.calculaTaxaDesconto(false, "NAO FORMA TRIANGULO", (float) (-1L));
        float float24 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!", (float) 100);
        float float28 = pedido0.calculaTaxaDesconto(true, "NAO FORMA TRIANGULO", 100.0f);
        float float32 = pedido0.calculaTaxaDesconto(false, "hi!", (-1.0f));
        float float36 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ESCALENO", 23.0f);
        float float40 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ", (-52.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10.0f + "'", float12 == 10.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.0f + "'", float24 == 0.0f);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 10.0f + "'", float28 == 10.0f);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 0.0f + "'", float32 == 0.0f);
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 10.0f + "'", float36 == 10.0f);
        org.junit.Assert.assertTrue("'" + float40 + "' != '" + 10.0f + "'", float40 == 10.0f);
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
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
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(1.0f, 1.0f);
        contaCorrente2.setSaldo((-45.0f));
        contaCorrente2.setLimite((float) (short) 10);
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
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
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
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
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
        java.lang.String str3 = codigos.Triangulo.classificaTriangulo(1, (int) ' ', 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "NAO FORMA TRIANGULO" + "'", str3, "NAO FORMA TRIANGULO");
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
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
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
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
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
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
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
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
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (-1L), (-3.0f));
        float float3 = contaCorrente2.getLimite();
        java.lang.Class<?> wildcardClass4 = contaCorrente2.getClass();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-3.0f) + "'", float3 == (-3.0f));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((-9.0f), 56.0f);
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(7.0f, (-3.0f));
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = codigos.Triangulo.classificaTriangulo((int) (byte) 0, 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type codigos.LadoInvalidoException; message: lado invalido");
        } catch (codigos.LadoInvalidoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(30.0f, (float) (short) 10);
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
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
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (short) 0, 0.0f);
        contaCorrente2.setSaldo((float) 0L);
        contaCorrente2.setSaldo((float) (short) 1);
        float float7 = contaCorrente2.getLimite();
        float float8 = contaCorrente2.getSaldo();
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (short) 10, (float) ' ');
        contaCorrente2.setLimite((float) (byte) 0);
        float float5 = contaCorrente2.getSaldo();
        contaCorrente2.setSaldo((float) 1);
        contaCorrente2.setSaldo((-86.0f));
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10.0f + "'", float5 == 10.0f);
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((-52.0f), (float) 10);
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
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
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = codigos.Triangulo.classificaTriangulo((int) (short) 10, (int) (short) 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type codigos.LadoInvalidoException; message: lado invalido");
        } catch (codigos.LadoInvalidoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 0, (float) (short) 0);
        float float3 = contaCorrente2.getSaldo();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
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
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = codigos.Triangulo.classificaTriangulo((int) (byte) -1, 0, 0);
            org.junit.Assert.fail("Expected exception of type codigos.LadoInvalidoException; message: lado invalido");
        } catch (codigos.LadoInvalidoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
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
        java.lang.Throwable[] throwableArray78 = ladoInvalidoException66.getSuppressed();
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
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", 1.0f);
        float float8 = pedido0.calculaTaxaDesconto(false, "", (float) 1);
        float float12 = pedido0.calculaTaxaDesconto(true, "", 100.0f);
        float float16 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: ESCALENO", (-90.0f));
        float float20 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ", (float) 'a');
        float float24 = pedido0.calculaTaxaDesconto(true, "NAO FORMA TRIANGULO", (-11.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10.0f + "'", float12 == 10.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 10.0f + "'", float20 == 10.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 10.0f + "'", float24 == 10.0f);
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(55.0f, 45.0f);
        contaCorrente2.setLimite(83.0f);
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (short) -1, (float) 0);
        java.lang.Class<?> wildcardClass3 = contaCorrente2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        float float3 = contaCorrente2.getLimite();
        float float4 = contaCorrente2.getSaldo();
        contaCorrente2.setLimite((-30.0f));
        contaCorrente2.setSaldo(34.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = codigos.Triangulo.classificaTriangulo((int) ' ', (int) (short) -1, 10);
            org.junit.Assert.fail("Expected exception of type codigos.LadoInvalidoException; message: lado invalido");
        } catch (codigos.LadoInvalidoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(9.0f, 32.0f);
        contaCorrente2.setSaldo(1.0f);
        float float5 = contaCorrente2.getLimite();
        contaCorrente2.setSaldo(97.0f);
        contaCorrente2.setLimite((-48.0f));
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 32.0f + "'", float5 == 32.0f);
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", 1.0f);
        float float8 = pedido0.calculaTaxaDesconto(false, "hi!", (float) (short) 10);
        float float12 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ", 68.0f);
        float float16 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!", (float) 'a');
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10.0f + "'", float12 == 10.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
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
        int int20 = words0.countWords("codigos.LadoInvalidoException: EQUILATERO");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
        codigos.Words words0 = new codigos.Words();
        int int2 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int4 = words0.countWords("NAO FORMA TRIANGULO");
        int int6 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int8 = words0.countWords("NAO FORMA TRIANGULO");
        int int10 = words0.countWords("");
        int int12 = words0.countWords("ESCALENO");
        int int14 = words0.countWords("NAO FORMA TRIANGULO");
        int int16 = words0.countWords("codigos.LadoInvalidoException: ESCALENO");
        int int18 = words0.countWords("NAO FORMA TRIANGULO");
        int int20 = words0.countWords("ESCALENO");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", (float) (short) -1);
        float float8 = pedido0.calculaTaxaDesconto(true, "NAO FORMA TRIANGULO", (float) (byte) 0);
        float float12 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!", (float) (-1L));
        float float16 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: NAO FORMA TRIANGULO", (float) 1);
        float float20 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: NAO FORMA TRIANGULO", 13.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10.0f + "'", float12 == 10.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((-88.0f), 52.0f);
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
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
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = codigos.Triangulo.classificaTriangulo((int) (byte) 10, (int) (short) 0, 1);
            org.junit.Assert.fail("Expected exception of type codigos.LadoInvalidoException; message: lado invalido");
        } catch (codigos.LadoInvalidoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(0.0f, (float) (short) 1);
        java.lang.Class<?> wildcardClass3 = contaCorrente2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
        codigos.Words words0 = new codigos.Words();
        int int2 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int4 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int6 = words0.countWords("codigos.LadoInvalidoException: ESCALENO");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
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
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((-68.0f), (float) 0L);
        float float3 = contaCorrente2.getLimite();
        contaCorrente2.setSaldo(87.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
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
        codigos.LadoInvalidoException ladoInvalidoException45 = new codigos.LadoInvalidoException("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        java.lang.Throwable[] throwableArray46 = ladoInvalidoException45.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException48 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException50 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException52 = new codigos.LadoInvalidoException("");
        ladoInvalidoException50.addSuppressed((java.lang.Throwable) ladoInvalidoException52);
        ladoInvalidoException48.addSuppressed((java.lang.Throwable) ladoInvalidoException52);
        java.lang.Throwable[] throwableArray55 = ladoInvalidoException48.getSuppressed();
        java.lang.Throwable[] throwableArray56 = ladoInvalidoException48.getSuppressed();
        java.lang.Throwable[] throwableArray57 = ladoInvalidoException48.getSuppressed();
        ladoInvalidoException45.addSuppressed((java.lang.Throwable) ladoInvalidoException48);
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
        java.lang.Throwable[] throwableArray74 = ladoInvalidoException62.getSuppressed();
        java.lang.Throwable[] throwableArray75 = ladoInvalidoException62.getSuppressed();
        ladoInvalidoException48.addSuppressed((java.lang.Throwable) ladoInvalidoException62);
        ladoInvalidoException10.addSuppressed((java.lang.Throwable) ladoInvalidoException62);
        java.lang.Throwable[] throwableArray78 = ladoInvalidoException62.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray40);
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertNotNull(throwableArray46);
        org.junit.Assert.assertNotNull(throwableArray55);
        org.junit.Assert.assertNotNull(throwableArray56);
        org.junit.Assert.assertNotNull(throwableArray57);
        org.junit.Assert.assertNotNull(throwableArray72);
        org.junit.Assert.assertNotNull(throwableArray74);
        org.junit.Assert.assertNotNull(throwableArray75);
        org.junit.Assert.assertNotNull(throwableArray78);
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
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
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
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
        float float17 = contaCorrente2.getLimite();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 100.0f + "'", float14 == 100.0f);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 10.0f + "'", float17 == 10.0f);
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
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
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
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
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
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
        ladoInvalidoException54.addSuppressed((java.lang.Throwable) ladoInvalidoException59);
        java.lang.Throwable[] throwableArray72 = ladoInvalidoException54.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException74 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException76 = new codigos.LadoInvalidoException("");
        ladoInvalidoException74.addSuppressed((java.lang.Throwable) ladoInvalidoException76);
        codigos.LadoInvalidoException ladoInvalidoException79 = new codigos.LadoInvalidoException("hi!");
        ladoInvalidoException76.addSuppressed((java.lang.Throwable) ladoInvalidoException79);
        ladoInvalidoException54.addSuppressed((java.lang.Throwable) ladoInvalidoException79);
        codigos.LadoInvalidoException ladoInvalidoException83 = new codigos.LadoInvalidoException("codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        ladoInvalidoException79.addSuppressed((java.lang.Throwable) ladoInvalidoException83);
        java.lang.Throwable[] throwableArray85 = ladoInvalidoException79.getSuppressed();
        ladoInvalidoException6.addSuppressed((java.lang.Throwable) ladoInvalidoException79);
        java.lang.Throwable[] throwableArray87 = ladoInvalidoException6.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertNotNull(throwableArray46);
        org.junit.Assert.assertNotNull(throwableArray48);
        org.junit.Assert.assertNotNull(throwableArray49);
        org.junit.Assert.assertNotNull(throwableArray69);
        org.junit.Assert.assertNotNull(throwableArray72);
        org.junit.Assert.assertNotNull(throwableArray85);
        org.junit.Assert.assertNotNull(throwableArray87);
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
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
        java.lang.Throwable[] throwableArray15 = ladoInvalidoException1.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException17 = new codigos.LadoInvalidoException("codigos.LadoInvalidoException: ");
        java.lang.Throwable[] throwableArray18 = ladoInvalidoException17.getSuppressed();
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException17);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray18);
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
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
        java.lang.Throwable[] throwableArray87 = ladoInvalidoException72.getSuppressed();
        java.lang.Throwable[] throwableArray88 = ladoInvalidoException72.getSuppressed();
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
        org.junit.Assert.assertNotNull(throwableArray87);
        org.junit.Assert.assertNotNull(throwableArray88);
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((-48.0f), (float) (byte) 1);
        contaCorrente2.setLimite((float) (short) 100);
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
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
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) '#', 1.0f);
        contaCorrente2.setSaldo((float) (short) 10);
        float float5 = contaCorrente2.getSaldo();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10.0f + "'", float5 == 10.0f);
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(58.0f, 97.0f);
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
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
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = codigos.Triangulo.classificaTriangulo((int) ' ', (int) (short) -1, 5);
            org.junit.Assert.fail("Expected exception of type codigos.LadoInvalidoException; message: lado invalido");
        } catch (codigos.LadoInvalidoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        float float3 = contaCorrente2.getSaldo();
        contaCorrente2.setSaldo(100.0f);
        float float7 = contaCorrente2.saque((float) (byte) 10);
        float float9 = contaCorrente2.saque((float) (short) 1);
        contaCorrente2.setLimite((float) 1);
        contaCorrente2.setLimite((float) 4);
        float float15 = contaCorrente2.saque((float) 6);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 90.0f + "'", float7 == 90.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 89.0f + "'", float9 == 89.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 83.0f + "'", float15 == 83.0f);
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((-32.0f), (float) 100L);
        contaCorrente2.setSaldo(0.0f);
        contaCorrente2.setSaldo(42.0f);
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
        codigos.LadoInvalidoException ladoInvalidoException1 = new codigos.LadoInvalidoException("EQUILATERO");
        java.lang.Throwable[] throwableArray2 = ladoInvalidoException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
        java.lang.String str3 = codigos.Triangulo.classificaTriangulo(4, (int) (byte) 100, (int) '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "NAO FORMA TRIANGULO" + "'", str3, "NAO FORMA TRIANGULO");
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) '#', 2.0f);
        float float3 = contaCorrente2.getLimite();
        float float4 = contaCorrente2.getLimite();
        float float5 = contaCorrente2.getLimite();
        float float6 = contaCorrente2.getSaldo();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3 == 2.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 2.0f + "'", float4 == 2.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 2.0f + "'", float5 == 2.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 35.0f + "'", float6 == 35.0f);
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (-1L), (float) (byte) -1);
        contaCorrente2.setLimite(90.0f);
        contaCorrente2.setLimite(65.0f);
        java.lang.Class<?> wildcardClass7 = contaCorrente2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) '4', (-88.0f));
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = codigos.Triangulo.classificaTriangulo((-1), (int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type codigos.LadoInvalidoException; message: lado invalido");
        } catch (codigos.LadoInvalidoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
        codigos.LadoInvalidoException ladoInvalidoException1 = new codigos.LadoInvalidoException("codigos.LadoInvalidoException: hi!");
        java.lang.Throwable[] throwableArray2 = ladoInvalidoException1.getSuppressed();
        java.lang.Throwable[] throwableArray3 = ladoInvalidoException1.getSuppressed();
        java.lang.String str4 = ladoInvalidoException1.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!" + "'", str4, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!");
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
        codigos.LadoInvalidoException ladoInvalidoException1 = new codigos.LadoInvalidoException("hi!");
        codigos.LadoInvalidoException ladoInvalidoException3 = new codigos.LadoInvalidoException("NAO FORMA TRIANGULO");
        java.lang.Throwable[] throwableArray4 = ladoInvalidoException3.getSuppressed();
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException3);
        org.junit.Assert.assertNotNull(throwableArray4);
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(0.0f, 9.0f);
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", (float) (short) -1);
        float float8 = pedido0.calculaTaxaDesconto(true, "NAO FORMA TRIANGULO", (float) (byte) 0);
        float float12 = pedido0.calculaTaxaDesconto(true, "", (float) 0L);
        float float16 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!", 91.0f);
        float float20 = pedido0.calculaTaxaDesconto(false, "EQUILATERO", 47.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10.0f + "'", float12 == 10.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(99.0f, (float) 'a');
        float float3 = contaCorrente2.getSaldo();
        float float4 = contaCorrente2.getSaldo();
        contaCorrente2.setLimite((float) (short) -1);
        contaCorrente2.setSaldo(9.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 99.0f + "'", float3 == 99.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 99.0f + "'", float4 == 99.0f);
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
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
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
        codigos.LadoInvalidoException ladoInvalidoException1 = new codigos.LadoInvalidoException("");
        java.lang.Throwable[] throwableArray2 = ladoInvalidoException1.getSuppressed();
        java.lang.Throwable[] throwableArray3 = ladoInvalidoException1.getSuppressed();
        java.lang.String str4 = ladoInvalidoException1.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "codigos.LadoInvalidoException: " + "'", str4, "codigos.LadoInvalidoException: ");
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 0, (float) ' ');
        contaCorrente2.setSaldo((float) (short) 10);
        float float5 = contaCorrente2.getSaldo();
        float float7 = contaCorrente2.saque((float) 6);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10.0f + "'", float5 == 10.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 4.0f + "'", float7 == 4.0f);
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3079");
        java.lang.String str3 = codigos.Triangulo.classificaTriangulo((int) (byte) 10, (int) (short) 100, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "NAO FORMA TRIANGULO" + "'", str3, "NAO FORMA TRIANGULO");
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3080");
        codigos.Words words0 = new codigos.Words();
        int int2 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int4 = words0.countWords("NAO FORMA TRIANGULO");
        int int6 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int8 = words0.countWords("EQUILATERO");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3081");
        java.lang.String str3 = codigos.Triangulo.classificaTriangulo(3, (int) 'a', (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "NAO FORMA TRIANGULO" + "'", str3, "NAO FORMA TRIANGULO");
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3082");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: ", (float) (short) 10);
        float float8 = pedido0.calculaTaxaDesconto(false, "NAO FORMA TRIANGULO", (float) 'a');
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3083");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        contaCorrente2.setLimite((float) 0L);
        contaCorrente2.setLimite((float) (short) 0);
        float float8 = contaCorrente2.saque((float) 1);
        float float9 = contaCorrente2.getSaldo();
        contaCorrente2.setLimite((float) 100);
        float float12 = contaCorrente2.getSaldo();
        float float14 = contaCorrente2.saque(98.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 99.0f + "'", float8 == 99.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 99.0f + "'", float9 == 99.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 99.0f + "'", float12 == 99.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 1.0f + "'", float14 == 1.0f);
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3084");
        codigos.Words words0 = new codigos.Words();
        int int2 = words0.countWords("");
        int int4 = words0.countWords("");
        int int6 = words0.countWords("codigos.LadoInvalidoException: ");
        int int8 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!");
        int int10 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int12 = words0.countWords("codigos.LadoInvalidoException: ");
        int int14 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        int int16 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3085");
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
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3086");
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
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3087");
        java.lang.String str3 = codigos.Triangulo.classificaTriangulo((int) (byte) 10, (int) (short) 10, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "NAO FORMA TRIANGULO" + "'", str3, "NAO FORMA TRIANGULO");
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3088");
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
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3089");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 100L, (float) 10);
        float float3 = contaCorrente2.getSaldo();
        float float4 = contaCorrente2.getLimite();
        float float5 = contaCorrente2.getSaldo();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 100.0f + "'", float5 == 100.0f);
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3090");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(87.0f, (-45.0f));
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3091");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(32.0f, (-52.0f));
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3092");
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
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3093");
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
        ladoInvalidoException46.addSuppressed((java.lang.Throwable) ladoInvalidoException70);
        java.lang.Throwable[] throwableArray72 = ladoInvalidoException70.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray49);
        org.junit.Assert.assertNotNull(throwableArray64);
        org.junit.Assert.assertNotNull(throwableArray66);
        org.junit.Assert.assertNotNull(throwableArray72);
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3094");
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
        java.lang.Throwable[] throwableArray18 = ladoInvalidoException12.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray18);
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3095");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 100L, (float) 10);
        float float3 = contaCorrente2.getSaldo();
        float float4 = contaCorrente2.getLimite();
        contaCorrente2.setLimite(99.0f);
        float float8 = contaCorrente2.saque(42.0f);
        float float9 = contaCorrente2.getLimite();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 58.0f + "'", float8 == 58.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 99.0f + "'", float9 == 99.0f);
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3096");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(32.0f, (-32.0f));
        contaCorrente2.setSaldo(99.0f);
        contaCorrente2.setSaldo((-9.0f));
        contaCorrente2.setLimite(0.0f);
        contaCorrente2.setLimite(31.0f);
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3097");
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
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3098");
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
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3099");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((-45.0f), 32.0f);
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3100");
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
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3101");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(51.0f, (-50.0f));
        float float3 = contaCorrente2.getLimite();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-50.0f) + "'", float3 == (-50.0f));
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3102");
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
        java.lang.Throwable[] throwableArray61 = ladoInvalidoException15.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertNotNull(throwableArray53);
        org.junit.Assert.assertNotNull(throwableArray55);
        org.junit.Assert.assertNotNull(throwableArray57);
        org.junit.Assert.assertNotNull(throwableArray58);
        org.junit.Assert.assertNotNull(throwableArray61);
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3103");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 0, (float) 10);
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3104");
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
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3105");
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
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3106");
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
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3107");
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
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3108");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 10, 0.0f);
        contaCorrente2.setSaldo((float) (byte) 0);
        float float5 = contaCorrente2.getSaldo();
        contaCorrente2.setSaldo((float) 0);
        contaCorrente2.setLimite(2.0f);
        contaCorrente2.setSaldo(47.0f);
        float float12 = contaCorrente2.getSaldo();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 47.0f + "'", float12 == 47.0f);
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3109");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) ' ', (float) (byte) 10);
        contaCorrente2.setSaldo((-86.0f));
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3110");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 'a', (float) 10);
        float float4 = contaCorrente2.saque((float) 1);
        float float5 = contaCorrente2.getLimite();
        contaCorrente2.setSaldo((float) (short) 10);
        contaCorrente2.setLimite(31.0f);
        float float10 = contaCorrente2.getLimite();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 96.0f + "'", float4 == 96.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10.0f + "'", float5 == 10.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 31.0f + "'", float10 == 31.0f);
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3111");
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
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3112");
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
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3113");
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
        java.lang.Throwable[] throwableArray94 = ladoInvalidoException80.getSuppressed();
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
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3114");
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
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3115");
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
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3116");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 10, 0.0f);
        float float3 = contaCorrente2.getSaldo();
        float float5 = contaCorrente2.saque(1.0f);
        contaCorrente2.setSaldo(100.0f);
        contaCorrente2.setLimite(2.0f);
        float float10 = contaCorrente2.getLimite();
        float float11 = contaCorrente2.getSaldo();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 9.0f + "'", float5 == 9.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 2.0f + "'", float10 == 2.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 100.0f + "'", float11 == 100.0f);
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3117");
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
        java.lang.Throwable[] throwableArray88 = ladoInvalidoException15.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(throwableArray46);
        org.junit.Assert.assertNotNull(throwableArray48);
        org.junit.Assert.assertNotNull(throwableArray53);
        org.junit.Assert.assertNotNull(throwableArray67);
        org.junit.Assert.assertNotNull(throwableArray82);
        org.junit.Assert.assertNotNull(throwableArray84);
        org.junit.Assert.assertNotNull(throwableArray88);
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3118");
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
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3119");
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
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3120");
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
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3121");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (short) -1, (-41.0f));
        contaCorrente2.setLimite(45.0f);
        contaCorrente2.setLimite((float) 5);
        contaCorrente2.setSaldo(0.0f);
        java.lang.Class<?> wildcardClass9 = contaCorrente2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3122");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (-1L), 91.0f);
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3123");
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
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3124");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((-10.0f), 73.0f);
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3125");
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
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3126");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((-48.0f), 30.0f);
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3127");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((-3.0f), 35.0f);
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3128");
        codigos.LadoInvalidoException ladoInvalidoException1 = new codigos.LadoInvalidoException("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        java.lang.Throwable[] throwableArray2 = ladoInvalidoException1.getSuppressed();
        java.lang.Throwable[] throwableArray3 = ladoInvalidoException1.getSuppressed();
        java.lang.String str4 = ladoInvalidoException1.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: " + "'", str4, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3129");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((-52.0f), (-57.0f));
        contaCorrente2.setSaldo((-10.0f));
    }

    @Test
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3130");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        float float3 = contaCorrente2.getLimite();
        float float4 = contaCorrente2.getSaldo();
        float float5 = contaCorrente2.getLimite();
        float float6 = contaCorrente2.getSaldo();
        contaCorrente2.setLimite((float) (byte) 10);
        contaCorrente2.setLimite((float) 100);
        float float11 = contaCorrente2.getLimite();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 100.0f + "'", float11 == 100.0f);
    }

    @Test
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3131");
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
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3132");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(68.0f, 52.0f);
        float float3 = contaCorrente2.getLimite();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 52.0f + "'", float3 == 52.0f);
    }

    @Test
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3133");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(1.0f, 1.0f);
        contaCorrente2.setSaldo((float) 100);
        float float5 = contaCorrente2.getSaldo();
        float float7 = contaCorrente2.saque((float) (byte) 1);
        contaCorrente2.setSaldo(90.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 100.0f + "'", float5 == 100.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 99.0f + "'", float7 == 99.0f);
    }

    @Test
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3134");
        java.lang.String str3 = codigos.Triangulo.classificaTriangulo((int) '4', (int) '#', (int) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ESCALENO" + "'", str3, "ESCALENO");
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3135");
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
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3136");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(0.0f, (-31.0f));
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3137");
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
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3138");
        java.lang.String str3 = codigos.Triangulo.classificaTriangulo(3, 1, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "NAO FORMA TRIANGULO" + "'", str3, "NAO FORMA TRIANGULO");
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3139");
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
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3140");
        codigos.Words words0 = new codigos.Words();
        int int2 = words0.countWords("");
        int int4 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!");
        int int6 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        int int8 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
    }

    @Test
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3141");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", (float) (short) -1);
        float float8 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: NAO FORMA TRIANGULO", (-9.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
    }

    @Test
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3142");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = codigos.Triangulo.classificaTriangulo((int) (short) 100, (int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type codigos.LadoInvalidoException; message: lado invalido");
        } catch (codigos.LadoInvalidoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3143");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((-88.0f), (-10.0f));
    }

    @Test
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3144");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(1.0f, 42.0f);
        float float3 = contaCorrente2.getLimite();
        contaCorrente2.setLimite(1.0f);
        java.lang.Class<?> wildcardClass6 = contaCorrente2.getClass();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 42.0f + "'", float3 == 42.0f);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3145");
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
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3146");
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
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3147");
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
    public void test3148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3148");
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
    public void test3149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3149");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(69.0f, 60.0f);
        contaCorrente2.setSaldo(55.0f);
    }

    @Test
    public void test3150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3150");
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
    public void test3151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3151");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 1L, 1.0f);
    }

    @Test
    public void test3152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3152");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((-57.0f), 44.0f);
        java.lang.Class<?> wildcardClass3 = contaCorrente2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test3153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3153");
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
    public void test3154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3154");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = codigos.Triangulo.classificaTriangulo((int) (short) 0, (int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type codigos.LadoInvalidoException; message: lado invalido");
        } catch (codigos.LadoInvalidoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3155");
        java.lang.String str3 = codigos.Triangulo.classificaTriangulo((int) (short) 10, (int) (short) 10, (int) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "NAO FORMA TRIANGULO" + "'", str3, "NAO FORMA TRIANGULO");
    }

    @Test
    public void test3156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3156");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (short) -1, 97.0f);
        contaCorrente2.setSaldo(65.0f);
        contaCorrente2.setLimite(78.0f);
        float float7 = contaCorrente2.getSaldo();
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 65.0f + "'", float7 == 65.0f);
    }

    @Test
    public void test3157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3157");
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
    public void test3158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3158");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (-1), 2.0f);
        contaCorrente2.setLimite((-9.0f));
        float float5 = contaCorrente2.getLimite();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-9.0f) + "'", float5 == (-9.0f));
    }

    @Test
    public void test3159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3159");
        codigos.Words words0 = new codigos.Words();
        int int2 = words0.countWords("");
        int int4 = words0.countWords("");
        int int6 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int8 = words0.countWords("EQUILATERO");
        int int10 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
    }

    @Test
    public void test3160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3160");
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
    public void test3161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3161");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((-10.0f), (float) (short) 10);
        contaCorrente2.setSaldo(0.0f);
        float float5 = contaCorrente2.getSaldo();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
    }

    @Test
    public void test3162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3162");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(91.0f, (float) (short) 1);
    }

    @Test
    public void test3163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3163");
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
    public void test3164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3164");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(99.0f, (float) 'a');
        float float3 = contaCorrente2.getSaldo();
        float float4 = contaCorrente2.getSaldo();
        contaCorrente2.setLimite((float) (short) -1);
        contaCorrente2.setLimite((float) (short) 10);
        float float9 = contaCorrente2.getLimite();
        contaCorrente2.setLimite(2.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 99.0f + "'", float3 == 99.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 99.0f + "'", float4 == 99.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
    }

    @Test
    public void test3165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3165");
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
        java.lang.Throwable[] throwableArray84 = ladoInvalidoException1.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException86 = new codigos.LadoInvalidoException("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!");
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException86);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertNotNull(throwableArray60);
        org.junit.Assert.assertNotNull(throwableArray75);
        org.junit.Assert.assertNotNull(throwableArray77);
        org.junit.Assert.assertNotNull(throwableArray84);
    }

    @Test
    public void test3166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3166");
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
    public void test3167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3167");
        java.lang.String str3 = codigos.Triangulo.classificaTriangulo(4, (int) (byte) 10, 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "NAO FORMA TRIANGULO" + "'", str3, "NAO FORMA TRIANGULO");
    }

    @Test
    public void test3168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3168");
        java.lang.String str3 = codigos.Triangulo.classificaTriangulo((int) (short) 1, (int) '#', (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "NAO FORMA TRIANGULO" + "'", str3, "NAO FORMA TRIANGULO");
    }

    @Test
    public void test3169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3169");
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
    public void test3170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3170");
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
    public void test3171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3171");
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
    public void test3172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3172");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        float float3 = contaCorrente2.getSaldo();
        contaCorrente2.setSaldo(100.0f);
        contaCorrente2.setLimite(10.0f);
        float float8 = contaCorrente2.getSaldo();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
    }

    @Test
    public void test3173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3173");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (-1), 2.0f);
        contaCorrente2.setSaldo(65.0f);
        float float5 = contaCorrente2.getSaldo();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 65.0f + "'", float5 == 65.0f);
    }

    @Test
    public void test3174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3174");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = codigos.Triangulo.classificaTriangulo((-1), 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type codigos.LadoInvalidoException; message: lado invalido");
        } catch (codigos.LadoInvalidoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3175");
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
        java.lang.Throwable[] throwableArray89 = ladoInvalidoException25.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray49);
        org.junit.Assert.assertNotNull(throwableArray64);
        org.junit.Assert.assertNotNull(throwableArray66);
        org.junit.Assert.assertNotNull(throwableArray77);
        org.junit.Assert.assertNotNull(throwableArray87);
        org.junit.Assert.assertNotNull(throwableArray89);
    }

    @Test
    public void test3176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3176");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (float) (short) 100);
        contaCorrente2.setLimite(65.0f);
    }

    @Test
    public void test3177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3177");
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
        java.lang.Throwable[] throwableArray40 = ladoInvalidoException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertNotNull(throwableArray40);
    }

    @Test
    public void test3178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3178");
        codigos.Words words0 = new codigos.Words();
        int int2 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int4 = words0.countWords("NAO FORMA TRIANGULO");
        int int6 = words0.countWords("EQUILATERO");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test3179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3179");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(98.0f, 4.0f);
        contaCorrente2.setSaldo((float) '#');
    }

    @Test
    public void test3180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3180");
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
    public void test3181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3181");
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
    public void test3182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3182");
        codigos.Words words0 = new codigos.Words();
        int int2 = words0.countWords("");
        int int4 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!");
        int int6 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        int int8 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int10 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!");
        int int12 = words0.countWords("");
        int int14 = words0.countWords("codigos.LadoInvalidoException: NAO FORMA TRIANGULO");
        int int16 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
    }

    @Test
    public void test3183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3183");
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
    public void test3184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3184");
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
        java.lang.Throwable[] throwableArray47 = ladoInvalidoException42.getSuppressed();
        ladoInvalidoException24.addSuppressed((java.lang.Throwable) ladoInvalidoException42);
        java.lang.Throwable[] throwableArray49 = ladoInvalidoException42.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException51 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException53 = new codigos.LadoInvalidoException("");
        ladoInvalidoException51.addSuppressed((java.lang.Throwable) ladoInvalidoException53);
        codigos.LadoInvalidoException ladoInvalidoException56 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException58 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException60 = new codigos.LadoInvalidoException("");
        ladoInvalidoException58.addSuppressed((java.lang.Throwable) ladoInvalidoException60);
        ladoInvalidoException56.addSuppressed((java.lang.Throwable) ladoInvalidoException60);
        java.lang.Throwable[] throwableArray63 = ladoInvalidoException60.getSuppressed();
        ladoInvalidoException53.addSuppressed((java.lang.Throwable) ladoInvalidoException60);
        codigos.LadoInvalidoException ladoInvalidoException66 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException68 = new codigos.LadoInvalidoException("");
        ladoInvalidoException66.addSuppressed((java.lang.Throwable) ladoInvalidoException68);
        codigos.LadoInvalidoException ladoInvalidoException71 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException73 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException75 = new codigos.LadoInvalidoException("");
        ladoInvalidoException73.addSuppressed((java.lang.Throwable) ladoInvalidoException75);
        ladoInvalidoException71.addSuppressed((java.lang.Throwable) ladoInvalidoException75);
        java.lang.Throwable[] throwableArray78 = ladoInvalidoException75.getSuppressed();
        ladoInvalidoException68.addSuppressed((java.lang.Throwable) ladoInvalidoException75);
        java.lang.Throwable[] throwableArray80 = ladoInvalidoException75.getSuppressed();
        ladoInvalidoException60.addSuppressed((java.lang.Throwable) ladoInvalidoException75);
        codigos.LadoInvalidoException ladoInvalidoException83 = new codigos.LadoInvalidoException("codigos.LadoInvalidoException: hi!");
        ladoInvalidoException75.addSuppressed((java.lang.Throwable) ladoInvalidoException83);
        java.lang.Throwable[] throwableArray85 = ladoInvalidoException75.getSuppressed();
        ladoInvalidoException42.addSuppressed((java.lang.Throwable) ladoInvalidoException75);
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException75);
        java.lang.Throwable[] throwableArray88 = ladoInvalidoException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(throwableArray45);
        org.junit.Assert.assertNotNull(throwableArray47);
        org.junit.Assert.assertNotNull(throwableArray49);
        org.junit.Assert.assertNotNull(throwableArray63);
        org.junit.Assert.assertNotNull(throwableArray78);
        org.junit.Assert.assertNotNull(throwableArray80);
        org.junit.Assert.assertNotNull(throwableArray85);
        org.junit.Assert.assertNotNull(throwableArray88);
    }

    @Test
    public void test3185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3185");
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
    public void test3186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3186");
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
        contaCorrente2.setSaldo((float) 100);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 100.0f + "'", float12 == 100.0f);
    }

    @Test
    public void test3187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3187");
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
    public void test3188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3188");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((-58.0f), 58.0f);
    }
}

