import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest7 {

    public static boolean debug = false;

    @Test
    public void test3501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3501");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = codigos.Triangulo.classificaTriangulo((int) 'a', 4, (-1));
            org.junit.Assert.fail("Expected exception of type codigos.LadoInvalidoException; message: lado invalido");
        } catch (codigos.LadoInvalidoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
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
        codigos.LadoInvalidoException ladoInvalidoException62 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException64 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException66 = new codigos.LadoInvalidoException("");
        ladoInvalidoException64.addSuppressed((java.lang.Throwable) ladoInvalidoException66);
        ladoInvalidoException62.addSuppressed((java.lang.Throwable) ladoInvalidoException66);
        java.lang.Throwable[] throwableArray69 = ladoInvalidoException66.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException71 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException73 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException75 = new codigos.LadoInvalidoException("");
        ladoInvalidoException73.addSuppressed((java.lang.Throwable) ladoInvalidoException75);
        ladoInvalidoException71.addSuppressed((java.lang.Throwable) ladoInvalidoException75);
        java.lang.Throwable[] throwableArray78 = ladoInvalidoException71.getSuppressed();
        ladoInvalidoException66.addSuppressed((java.lang.Throwable) ladoInvalidoException71);
        ladoInvalidoException6.addSuppressed((java.lang.Throwable) ladoInvalidoException71);
        java.lang.String str81 = ladoInvalidoException6.toString();
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertNotNull(throwableArray53);
        org.junit.Assert.assertNotNull(throwableArray55);
        org.junit.Assert.assertNotNull(throwableArray57);
        org.junit.Assert.assertNotNull(throwableArray58);
        org.junit.Assert.assertNotNull(throwableArray69);
        org.junit.Assert.assertNotNull(throwableArray78);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "codigos.LadoInvalidoException: hi!" + "'", str81, "codigos.LadoInvalidoException: hi!");
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
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
        float float19 = contaCorrente2.getLimite();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 100.0f + "'", float14 == 100.0f);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 10.0f + "'", float19 == 10.0f);
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) '#', (float) (short) 10);
        contaCorrente2.setSaldo((float) (short) 100);
        float float6 = contaCorrente2.saque((float) (byte) 10);
        float float7 = contaCorrente2.getLimite();
        contaCorrente2.setLimite((float) (byte) 100);
        contaCorrente2.setSaldo((-8.0f));
        contaCorrente2.setLimite((-16.0f));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 90.0f + "'", float6 == 90.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) ' ', 1.0f);
        float float3 = contaCorrente2.getLimite();
        contaCorrente2.setLimite((-11.0f));
        contaCorrente2.setLimite(88.0f);
        float float8 = contaCorrente2.getSaldo();
        contaCorrente2.setLimite((float) 6);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 32.0f + "'", float8 == 32.0f);
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
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
        float float24 = contaCorrente2.getLimite();
        java.lang.Class<?> wildcardClass25 = contaCorrente2.getClass();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 99.0f + "'", float9 == 99.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 97.0f + "'", float20 == 97.0f);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 97.0f + "'", float21 == 97.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + (-29.0f) + "'", float24 == (-29.0f));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 1, 90.0f);
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
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
        java.lang.String str96 = ladoInvalidoException15.toString();
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
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "codigos.LadoInvalidoException: " + "'", str96, "codigos.LadoInvalidoException: ");
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 100L, (float) 10);
        float float3 = contaCorrente2.getSaldo();
        float float4 = contaCorrente2.getLimite();
        contaCorrente2.setLimite(99.0f);
        float float8 = contaCorrente2.saque(42.0f);
        float float9 = contaCorrente2.getLimite();
        java.lang.Class<?> wildcardClass10 = contaCorrente2.getClass();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 58.0f + "'", float8 == 58.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 99.0f + "'", float9 == 99.0f);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(32.0f, 99.0f);
        float float4 = contaCorrente2.saque(5.0f);
        float float5 = contaCorrente2.getSaldo();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 27.0f + "'", float4 == 27.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 27.0f + "'", float5 == 27.0f);
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
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
        float float22 = contaCorrente2.getSaldo();
        float float23 = contaCorrente2.getLimite();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 99.0f + "'", float9 == 99.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 97.0f + "'", float20 == 97.0f);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + (-1.0f) + "'", float21 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 97.0f + "'", float22 == 97.0f);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + (-1.0f) + "'", float23 == (-1.0f));
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(32.0f, (float) 10L);
        contaCorrente2.setSaldo(67.0f);
        contaCorrente2.setLimite(91.0f);
        float float7 = contaCorrente2.getSaldo();
        float float8 = contaCorrente2.getLimite();
        // The following exception was thrown during execution in test generation
        try {
            float float10 = contaCorrente2.saque((-10.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Valor invalido");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 67.0f + "'", float7 == 67.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 91.0f + "'", float8 == 91.0f);
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) ' ', 1.0f);
        float float3 = contaCorrente2.getLimite();
        contaCorrente2.setLimite((-11.0f));
        contaCorrente2.setSaldo((float) (byte) 0);
        contaCorrente2.setSaldo((-1.0f));
        float float10 = contaCorrente2.getSaldo();
        contaCorrente2.setSaldo((float) 3);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-1.0f) + "'", float10 == (-1.0f));
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(99.0f, (float) 'a');
        float float3 = contaCorrente2.getLimite();
        contaCorrente2.setSaldo((-10.0f));
        float float7 = contaCorrente2.saque((float) (short) 1);
        contaCorrente2.setSaldo((float) 10L);
        contaCorrente2.setLimite(31.0f);
        contaCorrente2.setSaldo(60.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-11.0f) + "'", float7 == (-11.0f));
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
        codigos.LadoInvalidoException ladoInvalidoException1 = new codigos.LadoInvalidoException("codigos.LadoInvalidoException: hi!");
        codigos.LadoInvalidoException ladoInvalidoException3 = new codigos.LadoInvalidoException("hi!");
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException3);
        java.lang.Throwable[] throwableArray5 = ladoInvalidoException3.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException7 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException9 = new codigos.LadoInvalidoException("");
        ladoInvalidoException7.addSuppressed((java.lang.Throwable) ladoInvalidoException9);
        codigos.LadoInvalidoException ladoInvalidoException12 = new codigos.LadoInvalidoException("hi!");
        ladoInvalidoException9.addSuppressed((java.lang.Throwable) ladoInvalidoException12);
        java.lang.Throwable[] throwableArray14 = ladoInvalidoException12.getSuppressed();
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
        ladoInvalidoException25.addSuppressed((java.lang.Throwable) ladoInvalidoException40);
        java.lang.Throwable[] throwableArray47 = ladoInvalidoException25.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException49 = new codigos.LadoInvalidoException("hi!");
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
        ladoInvalidoException49.addSuppressed((java.lang.Throwable) ladoInvalidoException60);
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
        java.lang.Throwable[] throwableArray86 = ladoInvalidoException81.getSuppressed();
        ladoInvalidoException69.addSuppressed((java.lang.Throwable) ladoInvalidoException81);
        java.lang.Throwable[] throwableArray88 = ladoInvalidoException81.getSuppressed();
        ladoInvalidoException49.addSuppressed((java.lang.Throwable) ladoInvalidoException81);
        ladoInvalidoException25.addSuppressed((java.lang.Throwable) ladoInvalidoException81);
        java.lang.Throwable[] throwableArray91 = ladoInvalidoException81.getSuppressed();
        java.lang.Throwable[] throwableArray92 = ladoInvalidoException81.getSuppressed();
        java.lang.Throwable[] throwableArray93 = ladoInvalidoException81.getSuppressed();
        ladoInvalidoException12.addSuppressed((java.lang.Throwable) ladoInvalidoException81);
        ladoInvalidoException3.addSuppressed((java.lang.Throwable) ladoInvalidoException81);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertNotNull(throwableArray45);
        org.junit.Assert.assertNotNull(throwableArray47);
        org.junit.Assert.assertNotNull(throwableArray63);
        org.junit.Assert.assertNotNull(throwableArray84);
        org.junit.Assert.assertNotNull(throwableArray86);
        org.junit.Assert.assertNotNull(throwableArray88);
        org.junit.Assert.assertNotNull(throwableArray91);
        org.junit.Assert.assertNotNull(throwableArray92);
        org.junit.Assert.assertNotNull(throwableArray93);
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
        codigos.Words words0 = new codigos.Words();
        int int2 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int4 = words0.countWords("NAO FORMA TRIANGULO");
        int int6 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int8 = words0.countWords("NAO FORMA TRIANGULO");
        int int10 = words0.countWords("NAO FORMA TRIANGULO");
        int int12 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        int int14 = words0.countWords("EQUILATERO");
        int int16 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!");
        int int18 = words0.countWords("codigos.LadoInvalidoException: ISOSCELES");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
        boolean boolean1 = codigos.Identifier.validaIdentificador("codigos.LadoInvalidoException: ISOSCELES");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(90.0f, 0.0f);
        float float3 = contaCorrente2.getSaldo();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 90.0f + "'", float3 == 90.0f);
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", 1.0f);
        float float8 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: hi!", (float) (short) 10);
        float float12 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: hi!", (float) 2);
        float float16 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ", (float) 'a');
        float float20 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!", 0.0f);
        float float24 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: hi!", (-41.0f));
        float float28 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!", (-48.0f));
        float float32 = pedido0.calculaTaxaDesconto(false, "hi!", 2.0f);
        float float36 = pedido0.calculaTaxaDesconto(true, "", (-87.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 10.0f + "'", float20 == 10.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 10.0f + "'", float24 == 10.0f);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 0.0f + "'", float28 == 0.0f);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 0.0f + "'", float32 == 0.0f);
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 10.0f + "'", float36 == 10.0f);
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(80.0f, (float) 10);
        contaCorrente2.setLimite(7.0f);
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", 1.0f);
        float float8 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: hi!", (float) (short) 10);
        float float12 = pedido0.calculaTaxaDesconto(true, "NAO FORMA TRIANGULO", (float) 0L);
        float float16 = pedido0.calculaTaxaDesconto(true, "", 1.0f);
        float float20 = pedido0.calculaTaxaDesconto(false, "NAO FORMA TRIANGULO", (float) (-1L));
        float float24 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!", (float) 100);
        float float28 = pedido0.calculaTaxaDesconto(true, "NAO FORMA TRIANGULO", 100.0f);
        float float32 = pedido0.calculaTaxaDesconto(false, "hi!", (-1.0f));
        java.lang.Class<?> wildcardClass33 = pedido0.getClass();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10.0f + "'", float12 == 10.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.0f + "'", float24 == 0.0f);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 10.0f + "'", float28 == 10.0f);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 0.0f + "'", float32 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((-3.0f), (float) (short) 100);
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 100L, (float) 10);
        float float3 = contaCorrente2.getSaldo();
        float float4 = contaCorrente2.getLimite();
        float float6 = contaCorrente2.saque((float) 1L);
        float float7 = contaCorrente2.getLimite();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 99.0f + "'", float6 == 99.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((-1.0f), 68.0f);
        float float3 = contaCorrente2.getLimite();
        float float4 = contaCorrente2.getSaldo();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 68.0f + "'", float3 == 68.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.0f) + "'", float4 == (-1.0f));
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
        codigos.Words words0 = new codigos.Words();
        int int2 = words0.countWords("codigos.LadoInvalidoException: ");
        int int4 = words0.countWords("");
        int int6 = words0.countWords("ESCALENO");
        int int8 = words0.countWords("");
        int int10 = words0.countWords("codigos.LadoInvalidoException: EQUILATERO");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = codigos.Triangulo.classificaTriangulo(5, 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type codigos.LadoInvalidoException; message: lado invalido");
        } catch (codigos.LadoInvalidoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(32.0f, (-35.0f));
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
        codigos.LadoInvalidoException ladoInvalidoException1 = new codigos.LadoInvalidoException("ISOSCELES");
        codigos.LadoInvalidoException ladoInvalidoException3 = new codigos.LadoInvalidoException("");
        java.lang.Throwable[] throwableArray4 = ladoInvalidoException3.getSuppressed();
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
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException3);
        java.lang.Throwable[] throwableArray64 = ladoInvalidoException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray41);
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertNotNull(throwableArray58);
        org.junit.Assert.assertNotNull(throwableArray60);
        org.junit.Assert.assertNotNull(throwableArray64);
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(98.0f, 4.0f);
        contaCorrente2.setSaldo((float) '#');
        // The following exception was thrown during execution in test generation
        try {
            float float6 = contaCorrente2.saque(98.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Saldo Insuficiente");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 0L, (float) (short) 100);
        contaCorrente2.setLimite(88.0f);
        float float5 = contaCorrente2.getLimite();
        float float6 = contaCorrente2.getSaldo();
        float float7 = contaCorrente2.getSaldo();
        float float9 = contaCorrente2.saque((float) 1);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 88.0f + "'", float5 == 88.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", 1.0f);
        float float8 = pedido0.calculaTaxaDesconto(false, "NAO FORMA TRIANGULO", 10.0f);
        float float12 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: ", (float) (-1L));
        float float16 = pedido0.calculaTaxaDesconto(false, "NAO FORMA TRIANGULO", (-10.0f));
        float float20 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: ", (float) 100);
        float float24 = pedido0.calculaTaxaDesconto(true, "ISOSCELES", (float) 0);
        float float28 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!", (float) 5);
        float float32 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: ESCALENO", 27.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 10.0f + "'", float24 == 10.0f);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 10.0f + "'", float28 == 10.0f);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 0.0f + "'", float32 == 0.0f);
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
        codigos.Words words0 = new codigos.Words();
        int int2 = words0.countWords("");
        int int4 = words0.countWords("");
        int int6 = words0.countWords("codigos.LadoInvalidoException: ");
        int int8 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!");
        int int10 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int12 = words0.countWords("codigos.LadoInvalidoException: ");
        int int14 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        int int16 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!");
        int int18 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 10, 0.0f);
        float float3 = contaCorrente2.getSaldo();
        float float5 = contaCorrente2.saque(1.0f);
        contaCorrente2.setLimite(10.0f);
        contaCorrente2.setLimite((float) (byte) 100);
        float float10 = contaCorrente2.getSaldo();
        float float11 = contaCorrente2.getSaldo();
        float float12 = contaCorrente2.getLimite();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 9.0f + "'", float5 == 9.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 9.0f + "'", float10 == 9.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 9.0f + "'", float11 == 9.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 100.0f + "'", float12 == 100.0f);
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", 1.0f);
        float float8 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: hi!", (float) (short) 10);
        float float12 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: ", (float) '4');
        float float16 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!", (-1.0f));
        float float20 = pedido0.calculaTaxaDesconto(false, "", (float) (short) 100);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(78.0f, (float) (-1L));
        float float4 = contaCorrente2.saque((float) 5);
        contaCorrente2.setSaldo(84.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 73.0f + "'", float4 == 73.0f);
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        float float3 = contaCorrente2.getLimite();
        float float4 = contaCorrente2.getSaldo();
        float float5 = contaCorrente2.getLimite();
        float float6 = contaCorrente2.getSaldo();
        contaCorrente2.setLimite((float) (byte) 10);
        float float9 = contaCorrente2.getLimite();
        contaCorrente2.setLimite(100.0f);
        float float12 = contaCorrente2.getSaldo();
        contaCorrente2.setSaldo((float) '4');
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 100.0f + "'", float12 == 100.0f);
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
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
        java.lang.Throwable[] throwableArray38 = ladoInvalidoException23.getSuppressed();
        java.lang.Throwable[] throwableArray39 = ladoInvalidoException23.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException41 = new codigos.LadoInvalidoException("EQUILATERO");
        ladoInvalidoException23.addSuppressed((java.lang.Throwable) ladoInvalidoException41);
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
        java.lang.Throwable[] throwableArray65 = ladoInvalidoException58.getSuppressed();
        java.lang.Throwable[] throwableArray66 = ladoInvalidoException58.getSuppressed();
        ladoInvalidoException41.addSuppressed((java.lang.Throwable) ladoInvalidoException58);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertNotNull(throwableArray61);
        org.junit.Assert.assertNotNull(throwableArray63);
        org.junit.Assert.assertNotNull(throwableArray65);
        org.junit.Assert.assertNotNull(throwableArray66);
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(13.0f, (-45.0f));
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = codigos.Triangulo.classificaTriangulo((-1), (-1), (-1));
            org.junit.Assert.fail("Expected exception of type codigos.LadoInvalidoException; message: lado invalido");
        } catch (codigos.LadoInvalidoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 10, 0.0f);
        contaCorrente2.setSaldo((float) (byte) 0);
        float float5 = contaCorrente2.getSaldo();
        contaCorrente2.setSaldo((float) 0);
        float float8 = contaCorrente2.getSaldo();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 4, 23.0f);
        contaCorrente2.setLimite(0.0f);
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3542");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", (float) (short) -1);
        float float8 = pedido0.calculaTaxaDesconto(true, "NAO FORMA TRIANGULO", (float) (byte) 0);
        float float12 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: hi!", (float) (short) 100);
        float float16 = pedido0.calculaTaxaDesconto(false, "ESCALENO", 35.0f);
        float float20 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!", 96.0f);
        float float24 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: hi!", 87.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10.0f + "'", float12 == 10.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 10.0f + "'", float20 == 10.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 10.0f + "'", float24 == 10.0f);
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3543");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (-1), 2.0f);
        contaCorrente2.setSaldo(81.0f);
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3544");
        java.lang.String str3 = codigos.Triangulo.classificaTriangulo(10, 4, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "NAO FORMA TRIANGULO" + "'", str3, "NAO FORMA TRIANGULO");
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3545");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", 1.0f);
        float float8 = pedido0.calculaTaxaDesconto(false, "", (float) 1);
        float float12 = pedido0.calculaTaxaDesconto(false, "hi!", (float) (short) 100);
        float float16 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ", (float) (-1));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3546");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(13.0f, (-86.0f));
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3547");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        float float3 = contaCorrente2.getLimite();
        float float4 = contaCorrente2.getSaldo();
        float float5 = contaCorrente2.getLimite();
        float float6 = contaCorrente2.getSaldo();
        contaCorrente2.setLimite((float) (byte) 10);
        contaCorrente2.setSaldo((float) 100L);
        contaCorrente2.setSaldo(90.0f);
        contaCorrente2.setSaldo((float) 0);
        float float15 = contaCorrente2.getSaldo();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.0f + "'", float15 == 0.0f);
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3548");
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
        java.lang.Throwable[] throwableArray89 = ladoInvalidoException84.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertNotNull(throwableArray64);
        org.junit.Assert.assertNotNull(throwableArray79);
        org.junit.Assert.assertNotNull(throwableArray81);
        org.junit.Assert.assertNotNull(throwableArray87);
        org.junit.Assert.assertNotNull(throwableArray89);
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3549");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(90.0f, (float) (-1));
        contaCorrente2.setLimite((float) 0);
        contaCorrente2.setSaldo((float) 'a');
        contaCorrente2.setLimite(0.0f);
        float float10 = contaCorrente2.saque(55.0f);
        float float11 = contaCorrente2.getLimite();
        contaCorrente2.setSaldo((float) 10L);
        contaCorrente2.setLimite((-87.0f));
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 42.0f + "'", float10 == 42.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3550");
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
        java.lang.String str84 = ladoInvalidoException73.toString();
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
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "codigos.LadoInvalidoException: " + "'", str84, "codigos.LadoInvalidoException: ");
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3551");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 10, 81.0f);
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3552");
        codigos.Words words0 = new codigos.Words();
        int int2 = words0.countWords("");
        int int4 = words0.countWords("NAO FORMA TRIANGULO");
        int int6 = words0.countWords("codigos.LadoInvalidoException: ");
        int int8 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        int int10 = words0.countWords("NAO FORMA TRIANGULO");
        int int12 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        int int14 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        int int16 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3553");
        codigos.Words words0 = new codigos.Words();
        int int2 = words0.countWords("");
        int int4 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!");
        int int6 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        int int8 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int10 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!");
        int int12 = words0.countWords("");
        int int14 = words0.countWords("codigos.LadoInvalidoException: NAO FORMA TRIANGULO");
        int int16 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: NAO FORMA TRIANGULO");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3554");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 2, 9.0f);
        float float3 = contaCorrente2.getSaldo();
        float float4 = contaCorrente2.getLimite();
        contaCorrente2.setLimite(90.0f);
        float float8 = contaCorrente2.saque((float) 10);
        float float10 = contaCorrente2.saque(79.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3 == 2.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 9.0f + "'", float4 == 9.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-8.0f) + "'", float8 == (-8.0f));
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-87.0f) + "'", float10 == (-87.0f));
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3555");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((-10.0f), (float) (byte) -1);
        float float3 = contaCorrente2.getLimite();
        float float4 = contaCorrente2.getSaldo();
        contaCorrente2.setLimite((-32.0f));
        contaCorrente2.setSaldo(16.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-10.0f) + "'", float4 == (-10.0f));
    }

    @Test
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3556");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = codigos.Triangulo.classificaTriangulo((int) 'a', (int) (byte) 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type codigos.LadoInvalidoException; message: lado invalido");
        } catch (codigos.LadoInvalidoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3557");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (short) 1, 19.0f);
    }

    @Test
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3558");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 100L, (float) 10);
        float float3 = contaCorrente2.getSaldo();
        float float4 = contaCorrente2.getLimite();
        float float5 = contaCorrente2.getSaldo();
        float float6 = contaCorrente2.getLimite();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 100.0f + "'", float5 == 100.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
    }

    @Test
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3559");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(31.0f, 1.0f);
        contaCorrente2.setSaldo((float) (short) 10);
        contaCorrente2.setSaldo((float) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            float float8 = contaCorrente2.saque(84.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Saldo Insuficiente");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
    }

    @Test
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3560");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) ' ', 1.0f);
        float float3 = contaCorrente2.getLimite();
        contaCorrente2.setLimite((-11.0f));
        float float6 = contaCorrente2.getSaldo();
        float float7 = contaCorrente2.getSaldo();
        contaCorrente2.setSaldo(4.0f);
        contaCorrente2.setLimite(68.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 32.0f + "'", float6 == 32.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 32.0f + "'", float7 == 32.0f);
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3561");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) ' ', 1.0f);
        float float3 = contaCorrente2.getLimite();
        contaCorrente2.setLimite((-11.0f));
        contaCorrente2.setSaldo((float) (byte) 0);
        contaCorrente2.setSaldo((-1.0f));
        float float10 = contaCorrente2.getSaldo();
        contaCorrente2.setLimite((float) 5);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-1.0f) + "'", float10 == (-1.0f));
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3562");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 10, 0.0f);
        contaCorrente2.setLimite((-48.0f));
        // The following exception was thrown during execution in test generation
        try {
            float float6 = contaCorrente2.saque(92.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Saldo Insuficiente");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
    }

    @Test
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3563");
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
        codigos.LadoInvalidoException ladoInvalidoException49 = new codigos.LadoInvalidoException("codigos.LadoInvalidoException: hi!");
        ladoInvalidoException41.addSuppressed((java.lang.Throwable) ladoInvalidoException49);
        java.lang.Throwable[] throwableArray51 = ladoInvalidoException49.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException53 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException55 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException57 = new codigos.LadoInvalidoException("");
        ladoInvalidoException55.addSuppressed((java.lang.Throwable) ladoInvalidoException57);
        ladoInvalidoException53.addSuppressed((java.lang.Throwable) ladoInvalidoException57);
        java.lang.Throwable[] throwableArray60 = ladoInvalidoException57.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException62 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException64 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException66 = new codigos.LadoInvalidoException("");
        ladoInvalidoException64.addSuppressed((java.lang.Throwable) ladoInvalidoException66);
        ladoInvalidoException62.addSuppressed((java.lang.Throwable) ladoInvalidoException66);
        java.lang.Throwable[] throwableArray69 = ladoInvalidoException62.getSuppressed();
        ladoInvalidoException57.addSuppressed((java.lang.Throwable) ladoInvalidoException62);
        java.lang.Throwable[] throwableArray71 = ladoInvalidoException62.getSuppressed();
        ladoInvalidoException49.addSuppressed((java.lang.Throwable) ladoInvalidoException62);
        codigos.LadoInvalidoException ladoInvalidoException74 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException76 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException78 = new codigos.LadoInvalidoException("");
        ladoInvalidoException76.addSuppressed((java.lang.Throwable) ladoInvalidoException78);
        ladoInvalidoException74.addSuppressed((java.lang.Throwable) ladoInvalidoException78);
        java.lang.Throwable[] throwableArray81 = ladoInvalidoException78.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException83 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException85 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException87 = new codigos.LadoInvalidoException("");
        ladoInvalidoException85.addSuppressed((java.lang.Throwable) ladoInvalidoException87);
        ladoInvalidoException83.addSuppressed((java.lang.Throwable) ladoInvalidoException87);
        java.lang.Throwable[] throwableArray90 = ladoInvalidoException83.getSuppressed();
        ladoInvalidoException78.addSuppressed((java.lang.Throwable) ladoInvalidoException83);
        java.lang.Throwable[] throwableArray92 = ladoInvalidoException83.getSuppressed();
        ladoInvalidoException49.addSuppressed((java.lang.Throwable) ladoInvalidoException83);
        ladoInvalidoException3.addSuppressed((java.lang.Throwable) ladoInvalidoException83);
        java.lang.Throwable throwable95 = null;
        // The following exception was thrown during execution in test generation
        try {
            ladoInvalidoException83.addSuppressed(throwable95);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertNotNull(throwableArray46);
        org.junit.Assert.assertNotNull(throwableArray51);
        org.junit.Assert.assertNotNull(throwableArray60);
        org.junit.Assert.assertNotNull(throwableArray69);
        org.junit.Assert.assertNotNull(throwableArray71);
        org.junit.Assert.assertNotNull(throwableArray81);
        org.junit.Assert.assertNotNull(throwableArray90);
        org.junit.Assert.assertNotNull(throwableArray92);
    }

    @Test
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3564");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        float float3 = contaCorrente2.getSaldo();
        contaCorrente2.setSaldo(100.0f);
        contaCorrente2.setLimite(0.0f);
        float float8 = contaCorrente2.getSaldo();
        float float9 = contaCorrente2.getSaldo();
        float float11 = contaCorrente2.saque(2.0f);
        java.lang.Class<?> wildcardClass12 = contaCorrente2.getClass();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 100.0f + "'", float9 == 100.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 98.0f + "'", float11 == 98.0f);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3565");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((-58.0f), 7.0f);
        float float3 = contaCorrente2.getSaldo();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-58.0f) + "'", float3 == (-58.0f));
    }

    @Test
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3566");
        java.lang.String str3 = codigos.Triangulo.classificaTriangulo(7, 10, (int) '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "NAO FORMA TRIANGULO" + "'", str3, "NAO FORMA TRIANGULO");
    }

    @Test
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3567");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 0, 68.0f);
        float float3 = contaCorrente2.getSaldo();
        float float4 = contaCorrente2.getLimite();
        contaCorrente2.setLimite(10.0f);
        // The following exception was thrown during execution in test generation
        try {
            float float8 = contaCorrente2.saque(27.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Saldo Insuficiente");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 68.0f + "'", float4 == 68.0f);
    }

    @Test
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3568");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((-45.0f), 98.0f);
        float float3 = contaCorrente2.getLimite();
        // The following exception was thrown during execution in test generation
        try {
            float float5 = contaCorrente2.saque((-45.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Valor invalido");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 98.0f + "'", float3 == 98.0f);
    }

    @Test
    public void test3569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3569");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = codigos.Triangulo.classificaTriangulo((-1), 6, 2);
            org.junit.Assert.fail("Expected exception of type codigos.LadoInvalidoException; message: lado invalido");
        } catch (codigos.LadoInvalidoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3570");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((-11.0f), (-68.0f));
        float float3 = contaCorrente2.getSaldo();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-11.0f) + "'", float3 == (-11.0f));
    }

    @Test
    public void test3571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3571");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(80.0f, 92.0f);
        // The following exception was thrown during execution in test generation
        try {
            float float4 = contaCorrente2.saque((-14.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Valor invalido");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
    }

    @Test
    public void test3572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3572");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", 1.0f);
        float float8 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: hi!", (float) (short) 10);
        float float12 = pedido0.calculaTaxaDesconto(false, "NAO FORMA TRIANGULO", (-48.0f));
        float float16 = pedido0.calculaTaxaDesconto(false, "ESCALENO", 52.0f);
        float float20 = pedido0.calculaTaxaDesconto(true, "NAO FORMA TRIANGULO", (-48.0f));
        float float24 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: ESCALENO", 0.0f);
        float float28 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: EQUILATERO", (-24.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 10.0f + "'", float20 == 10.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.0f + "'", float24 == 0.0f);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 10.0f + "'", float28 == 10.0f);
    }

    @Test
    public void test3573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3573");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(99.0f, (float) 'a');
        float float3 = contaCorrente2.getLimite();
        contaCorrente2.setSaldo((-10.0f));
        float float7 = contaCorrente2.saque((float) (short) 1);
        contaCorrente2.setSaldo((float) 10L);
        contaCorrente2.setLimite(31.0f);
        float float12 = contaCorrente2.getSaldo();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-11.0f) + "'", float7 == (-11.0f));
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10.0f + "'", float12 == 10.0f);
    }

    @Test
    public void test3574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3574");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(false, "NAO FORMA TRIANGULO", (float) '4');
        float float8 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: hi!", 0.0f);
        float float12 = pedido0.calculaTaxaDesconto(false, "ESCALENO", 0.0f);
        float float16 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ", (-59.0f));
        float float20 = pedido0.calculaTaxaDesconto(false, "EQUILATERO", 30.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
    }

    @Test
    public void test3575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3575");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(1.0f, 42.0f);
        contaCorrente2.setLimite((-1.0f));
        float float5 = contaCorrente2.getLimite();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
    }

    @Test
    public void test3576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3576");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 10, 67.0f);
        float float3 = contaCorrente2.getLimite();
        // The following exception was thrown during execution in test generation
        try {
            float float5 = contaCorrente2.saque((float) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Valor invalido");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 67.0f + "'", float3 == 67.0f);
    }

    @Test
    public void test3577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3577");
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
        contaCorrente2.setSaldo((-41.0f));
        java.lang.Class<?> wildcardClass21 = contaCorrente2.getClass();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 10.0f + "'", float14 == 10.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 91.0f + "'", float16 == 91.0f);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3578");
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
        java.lang.String str54 = ladoInvalidoException42.toString();
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray45);
        org.junit.Assert.assertNotNull(throwableArray47);
        org.junit.Assert.assertNotNull(throwableArray52);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "codigos.LadoInvalidoException: " + "'", str54, "codigos.LadoInvalidoException: ");
    }

    @Test
    public void test3579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3579");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(35.0f, (-9.0f));
        float float3 = contaCorrente2.getSaldo();
        contaCorrente2.setSaldo((-56.0f));
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 35.0f + "'", float3 == 35.0f);
    }

    @Test
    public void test3580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3580");
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
        int int22 = words0.countWords("codigos.LadoInvalidoException: ESCALENO");
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test3581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3581");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(5.0f, 9.0f);
    }

    @Test
    public void test3582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3582");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(1.0f, 42.0f);
        float float3 = contaCorrente2.getLimite();
        contaCorrente2.setLimite(1.0f);
        contaCorrente2.setLimite((float) 6);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 42.0f + "'", float3 == 42.0f);
    }

    @Test
    public void test3583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3583");
        codigos.Words words0 = new codigos.Words();
        int int2 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int4 = words0.countWords("NAO FORMA TRIANGULO");
        int int6 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int8 = words0.countWords("NAO FORMA TRIANGULO");
        int int10 = words0.countWords("");
        int int12 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int14 = words0.countWords("");
        int int16 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
    }

    @Test
    public void test3584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3584");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        float float3 = contaCorrente2.getLimite();
        float float4 = contaCorrente2.getSaldo();
        float float5 = contaCorrente2.getSaldo();
        float float6 = contaCorrente2.getLimite();
        contaCorrente2.setLimite((float) '4');
        java.lang.Class<?> wildcardClass9 = contaCorrente2.getClass();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 100.0f + "'", float5 == 100.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-1.0f) + "'", float6 == (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3585");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(0.0f, (-62.0f));
    }

    @Test
    public void test3586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3586");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(99.0f, (float) 'a');
        float float3 = contaCorrente2.getLimite();
        contaCorrente2.setSaldo((float) 100);
        float float7 = contaCorrente2.saque((float) 10);
        float float8 = contaCorrente2.getSaldo();
        contaCorrente2.setLimite(66.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 90.0f + "'", float7 == 90.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 90.0f + "'", float8 == 90.0f);
    }

    @Test
    public void test3587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3587");
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
        codigos.LadoInvalidoException ladoInvalidoException35 = new codigos.LadoInvalidoException("");
        ladoInvalidoException33.addSuppressed((java.lang.Throwable) ladoInvalidoException35);
        ladoInvalidoException31.addSuppressed((java.lang.Throwable) ladoInvalidoException35);
        java.lang.Throwable[] throwableArray38 = ladoInvalidoException35.getSuppressed();
        ladoInvalidoException28.addSuppressed((java.lang.Throwable) ladoInvalidoException35);
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
        ladoInvalidoException35.addSuppressed((java.lang.Throwable) ladoInvalidoException50);
        codigos.LadoInvalidoException ladoInvalidoException58 = new codigos.LadoInvalidoException("codigos.LadoInvalidoException: hi!");
        ladoInvalidoException50.addSuppressed((java.lang.Throwable) ladoInvalidoException58);
        java.lang.Throwable[] throwableArray60 = ladoInvalidoException58.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException62 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException64 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException66 = new codigos.LadoInvalidoException("");
        ladoInvalidoException64.addSuppressed((java.lang.Throwable) ladoInvalidoException66);
        ladoInvalidoException62.addSuppressed((java.lang.Throwable) ladoInvalidoException66);
        java.lang.Throwable[] throwableArray69 = ladoInvalidoException66.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException71 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException73 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException75 = new codigos.LadoInvalidoException("");
        ladoInvalidoException73.addSuppressed((java.lang.Throwable) ladoInvalidoException75);
        ladoInvalidoException71.addSuppressed((java.lang.Throwable) ladoInvalidoException75);
        java.lang.Throwable[] throwableArray78 = ladoInvalidoException71.getSuppressed();
        ladoInvalidoException66.addSuppressed((java.lang.Throwable) ladoInvalidoException71);
        java.lang.Throwable[] throwableArray80 = ladoInvalidoException71.getSuppressed();
        ladoInvalidoException58.addSuppressed((java.lang.Throwable) ladoInvalidoException71);
        java.lang.Throwable[] throwableArray82 = ladoInvalidoException58.getSuppressed();
        java.lang.Throwable[] throwableArray83 = ladoInvalidoException58.getSuppressed();
        java.lang.Throwable[] throwableArray84 = ladoInvalidoException58.getSuppressed();
        ladoInvalidoException5.addSuppressed((java.lang.Throwable) ladoInvalidoException58);
        java.lang.Throwable[] throwableArray86 = ladoInvalidoException58.getSuppressed();
        java.lang.String str87 = ladoInvalidoException58.toString();
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertNotNull(throwableArray53);
        org.junit.Assert.assertNotNull(throwableArray55);
        org.junit.Assert.assertNotNull(throwableArray60);
        org.junit.Assert.assertNotNull(throwableArray69);
        org.junit.Assert.assertNotNull(throwableArray78);
        org.junit.Assert.assertNotNull(throwableArray80);
        org.junit.Assert.assertNotNull(throwableArray82);
        org.junit.Assert.assertNotNull(throwableArray83);
        org.junit.Assert.assertNotNull(throwableArray84);
        org.junit.Assert.assertNotNull(throwableArray86);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!" + "'", str87, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!");
    }

    @Test
    public void test3588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3588");
        codigos.Words words0 = new codigos.Words();
        int int2 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int4 = words0.countWords("NAO FORMA TRIANGULO");
        int int6 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int8 = words0.countWords("NAO FORMA TRIANGULO");
        int int10 = words0.countWords("");
        int int12 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        int int14 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        int int16 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!");
        int int18 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
    }

    @Test
    public void test3589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3589");
        codigos.LadoInvalidoException ladoInvalidoException1 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException3 = new codigos.LadoInvalidoException("");
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException3);
        java.lang.Throwable[] throwableArray5 = ladoInvalidoException3.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException7 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException9 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException11 = new codigos.LadoInvalidoException("");
        ladoInvalidoException9.addSuppressed((java.lang.Throwable) ladoInvalidoException11);
        ladoInvalidoException7.addSuppressed((java.lang.Throwable) ladoInvalidoException11);
        java.lang.Throwable[] throwableArray14 = ladoInvalidoException7.getSuppressed();
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
        ladoInvalidoException25.addSuppressed((java.lang.Throwable) ladoInvalidoException40);
        codigos.LadoInvalidoException ladoInvalidoException48 = new codigos.LadoInvalidoException("codigos.LadoInvalidoException: hi!");
        ladoInvalidoException40.addSuppressed((java.lang.Throwable) ladoInvalidoException48);
        java.lang.Throwable[] throwableArray50 = ladoInvalidoException48.getSuppressed();
        ladoInvalidoException7.addSuppressed((java.lang.Throwable) ladoInvalidoException48);
        codigos.LadoInvalidoException ladoInvalidoException53 = new codigos.LadoInvalidoException("codigos.LadoInvalidoException: hi!");
        codigos.LadoInvalidoException ladoInvalidoException55 = new codigos.LadoInvalidoException("hi!");
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
        ladoInvalidoException67.addSuppressed((java.lang.Throwable) ladoInvalidoException82);
        codigos.LadoInvalidoException ladoInvalidoException90 = new codigos.LadoInvalidoException("codigos.LadoInvalidoException: hi!");
        ladoInvalidoException82.addSuppressed((java.lang.Throwable) ladoInvalidoException90);
        ladoInvalidoException55.addSuppressed((java.lang.Throwable) ladoInvalidoException90);
        java.lang.Throwable[] throwableArray93 = ladoInvalidoException90.getSuppressed();
        ladoInvalidoException48.addSuppressed((java.lang.Throwable) ladoInvalidoException90);
        ladoInvalidoException3.addSuppressed((java.lang.Throwable) ladoInvalidoException90);
        java.lang.Class<?> wildcardClass96 = ladoInvalidoException90.getClass();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertNotNull(throwableArray45);
        org.junit.Assert.assertNotNull(throwableArray50);
        org.junit.Assert.assertNotNull(throwableArray70);
        org.junit.Assert.assertNotNull(throwableArray85);
        org.junit.Assert.assertNotNull(throwableArray87);
        org.junit.Assert.assertNotNull(throwableArray93);
        org.junit.Assert.assertNotNull(wildcardClass96);
    }

    @Test
    public void test3590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3590");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", 1.0f);
        float float8 = pedido0.calculaTaxaDesconto(false, "NAO FORMA TRIANGULO", 10.0f);
        float float12 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: ", (float) (-1L));
        float float16 = pedido0.calculaTaxaDesconto(true, "ISOSCELES", 55.0f);
        float float20 = pedido0.calculaTaxaDesconto(true, "", 0.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 10.0f + "'", float20 == 10.0f);
    }

    @Test
    public void test3591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3591");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", (float) (short) -1);
        float float8 = pedido0.calculaTaxaDesconto(true, "NAO FORMA TRIANGULO", (float) (byte) 0);
        float float12 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: hi!", (float) (-1L));
        float float16 = pedido0.calculaTaxaDesconto(true, "", (float) (byte) 10);
        float float20 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ", 35.0f);
        float float24 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: NAO FORMA TRIANGULO", (float) (-1L));
        float float28 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: NAO FORMA TRIANGULO", (float) (byte) 1);
        float float32 = pedido0.calculaTaxaDesconto(true, "hi!", (float) (byte) -1);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 10.0f + "'", float20 == 10.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.0f + "'", float24 == 0.0f);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 10.0f + "'", float28 == 10.0f);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 10.0f + "'", float32 == 10.0f);
    }

    @Test
    public void test3592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3592");
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
        codigos.LadoInvalidoException ladoInvalidoException80 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException82 = new codigos.LadoInvalidoException("");
        ladoInvalidoException80.addSuppressed((java.lang.Throwable) ladoInvalidoException82);
        java.lang.Throwable[] throwableArray84 = ladoInvalidoException80.getSuppressed();
        java.lang.Throwable[] throwableArray85 = ladoInvalidoException80.getSuppressed();
        java.lang.Throwable[] throwableArray86 = ladoInvalidoException80.getSuppressed();
        ladoInvalidoException67.addSuppressed((java.lang.Throwable) ladoInvalidoException80);
        java.lang.String str88 = ladoInvalidoException67.toString();
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
        org.junit.Assert.assertNotNull(throwableArray84);
        org.junit.Assert.assertNotNull(throwableArray85);
        org.junit.Assert.assertNotNull(throwableArray86);
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "codigos.LadoInvalidoException: " + "'", str88, "codigos.LadoInvalidoException: ");
    }

    @Test
    public void test3593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3593");
        codigos.LadoInvalidoException ladoInvalidoException1 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException3 = new codigos.LadoInvalidoException("");
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException3);
        codigos.LadoInvalidoException ladoInvalidoException6 = new codigos.LadoInvalidoException("hi!");
        ladoInvalidoException3.addSuppressed((java.lang.Throwable) ladoInvalidoException6);
        java.lang.Throwable[] throwableArray8 = ladoInvalidoException6.getSuppressed();
        java.lang.Throwable[] throwableArray9 = ladoInvalidoException6.getSuppressed();
        java.lang.Throwable[] throwableArray10 = ladoInvalidoException6.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException12 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException14 = new codigos.LadoInvalidoException("");
        ladoInvalidoException12.addSuppressed((java.lang.Throwable) ladoInvalidoException14);
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
        ladoInvalidoException14.addSuppressed((java.lang.Throwable) ladoInvalidoException19);
        java.lang.Throwable[] throwableArray32 = ladoInvalidoException14.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException34 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException36 = new codigos.LadoInvalidoException("");
        ladoInvalidoException34.addSuppressed((java.lang.Throwable) ladoInvalidoException36);
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
        ladoInvalidoException36.addSuppressed((java.lang.Throwable) ladoInvalidoException48);
        java.lang.Throwable[] throwableArray55 = ladoInvalidoException48.getSuppressed();
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
        ladoInvalidoException48.addSuppressed((java.lang.Throwable) ladoInvalidoException61);
        ladoInvalidoException14.addSuppressed((java.lang.Throwable) ladoInvalidoException61);
        ladoInvalidoException6.addSuppressed((java.lang.Throwable) ladoInvalidoException61);
        java.lang.String str78 = ladoInvalidoException61.toString();
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNotNull(throwableArray51);
        org.junit.Assert.assertNotNull(throwableArray53);
        org.junit.Assert.assertNotNull(throwableArray55);
        org.junit.Assert.assertNotNull(throwableArray64);
        org.junit.Assert.assertNotNull(throwableArray73);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "codigos.LadoInvalidoException: " + "'", str78, "codigos.LadoInvalidoException: ");
    }

    @Test
    public void test3594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3594");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        float float3 = contaCorrente2.getLimite();
        float float4 = contaCorrente2.getLimite();
        contaCorrente2.setSaldo(88.0f);
        float float7 = contaCorrente2.getSaldo();
        contaCorrente2.setLimite(52.0f);
        contaCorrente2.setSaldo((-3.0f));
        contaCorrente2.setLimite(83.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.0f) + "'", float4 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 88.0f + "'", float7 == 88.0f);
    }

    @Test
    public void test3595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3595");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = codigos.Triangulo.classificaTriangulo((int) (short) -1, (int) (short) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type codigos.LadoInvalidoException; message: lado invalido");
        } catch (codigos.LadoInvalidoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3596");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        float float3 = contaCorrente2.getLimite();
        float float4 = contaCorrente2.getSaldo();
        float float5 = contaCorrente2.getLimite();
        float float6 = contaCorrente2.getSaldo();
        java.lang.Class<?> wildcardClass7 = contaCorrente2.getClass();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3597");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(32.0f, (float) (byte) 0);
        contaCorrente2.setSaldo(10.0f);
        contaCorrente2.setLimite(9.0f);
        contaCorrente2.setLimite((float) ' ');
        contaCorrente2.setLimite(30.0f);
        float float11 = contaCorrente2.getSaldo();
        contaCorrente2.setLimite(0.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
    }

    @Test
    public void test3598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3598");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(99.0f, (float) 'a');
        float float3 = contaCorrente2.getLimite();
        contaCorrente2.setSaldo((float) 100);
        float float7 = contaCorrente2.saque((float) 10);
        contaCorrente2.setSaldo(0.0f);
        float float10 = contaCorrente2.getLimite();
        contaCorrente2.setLimite(27.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 90.0f + "'", float7 == 90.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 97.0f + "'", float10 == 97.0f);
    }

    @Test
    public void test3599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3599");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(0.0f, (float) 100L);
        float float3 = contaCorrente2.getSaldo();
        contaCorrente2.setSaldo((float) (byte) 100);
        float float7 = contaCorrente2.saque((float) 1L);
        contaCorrente2.setSaldo(90.0f);
        float float10 = contaCorrente2.getLimite();
        contaCorrente2.setSaldo(98.0f);
        float float13 = contaCorrente2.getSaldo();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 99.0f + "'", float7 == 99.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 100.0f + "'", float10 == 100.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 98.0f + "'", float13 == 98.0f);
    }

    @Test
    public void test3600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3600");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = codigos.Triangulo.classificaTriangulo(0, 7, 5);
            org.junit.Assert.fail("Expected exception of type codigos.LadoInvalidoException; message: lado invalido");
        } catch (codigos.LadoInvalidoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3601");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = codigos.Triangulo.classificaTriangulo(6, (-1), 0);
            org.junit.Assert.fail("Expected exception of type codigos.LadoInvalidoException; message: lado invalido");
        } catch (codigos.LadoInvalidoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3602");
        codigos.Words words0 = new codigos.Words();
        int int2 = words0.countWords("codigos.LadoInvalidoException: ");
        int int4 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!");
        int int6 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!");
        int int8 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int10 = words0.countWords("codigos.LadoInvalidoException: EQUILATERO");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test3603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3603");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(97.0f, 99.0f);
        float float3 = contaCorrente2.getSaldo();
        contaCorrente2.setLimite(10.0f);
        float float6 = contaCorrente2.getLimite();
        float float7 = contaCorrente2.getLimite();
        float float8 = contaCorrente2.getSaldo();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 97.0f + "'", float8 == 97.0f);
    }

    @Test
    public void test3604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3604");
        codigos.Words words0 = new codigos.Words();
        int int2 = words0.countWords("codigos.LadoInvalidoException: ");
        int int4 = words0.countWords("hi!");
        int int6 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!");
        int int8 = words0.countWords("hi!");
        int int10 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        int int12 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!");
        int int14 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: NAO FORMA TRIANGULO");
        int int16 = words0.countWords("");
        int int18 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!");
        int int20 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 5 + "'", int20 == 5);
    }

    @Test
    public void test3605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3605");
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
        codigos.LadoInvalidoException ladoInvalidoException19 = new codigos.LadoInvalidoException("hi!");
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
        ladoInvalidoException19.addSuppressed((java.lang.Throwable) ladoInvalidoException30);
        codigos.LadoInvalidoException ladoInvalidoException37 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException39 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException41 = new codigos.LadoInvalidoException("");
        ladoInvalidoException39.addSuppressed((java.lang.Throwable) ladoInvalidoException41);
        ladoInvalidoException37.addSuppressed((java.lang.Throwable) ladoInvalidoException41);
        java.lang.Throwable[] throwableArray44 = ladoInvalidoException41.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException46 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException48 = new codigos.LadoInvalidoException("");
        ladoInvalidoException46.addSuppressed((java.lang.Throwable) ladoInvalidoException48);
        codigos.LadoInvalidoException ladoInvalidoException51 = new codigos.LadoInvalidoException("hi!");
        ladoInvalidoException48.addSuppressed((java.lang.Throwable) ladoInvalidoException51);
        ladoInvalidoException41.addSuppressed((java.lang.Throwable) ladoInvalidoException51);
        java.lang.Throwable[] throwableArray54 = ladoInvalidoException41.getSuppressed();
        ladoInvalidoException19.addSuppressed((java.lang.Throwable) ladoInvalidoException41);
        java.lang.Throwable[] throwableArray56 = ladoInvalidoException19.getSuppressed();
        java.lang.Throwable[] throwableArray57 = ladoInvalidoException19.getSuppressed();
        ladoInvalidoException15.addSuppressed((java.lang.Throwable) ladoInvalidoException19);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertNotNull(throwableArray54);
        org.junit.Assert.assertNotNull(throwableArray56);
        org.junit.Assert.assertNotNull(throwableArray57);
    }

    @Test
    public void test3606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3606");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", (float) (short) -1);
        float float8 = pedido0.calculaTaxaDesconto(true, "NAO FORMA TRIANGULO", (float) (byte) 0);
        float float12 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: hi!", (float) (-1L));
        float float16 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!", (float) 10);
        float float20 = pedido0.calculaTaxaDesconto(true, "NAO FORMA TRIANGULO", (float) ' ');
        float float24 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: NAO FORMA TRIANGULO", 28.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 10.0f + "'", float20 == 10.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.0f + "'", float24 == 0.0f);
    }

    @Test
    public void test3607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3607");
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
        java.lang.Throwable[] throwableArray87 = ladoInvalidoException61.getSuppressed();
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
        org.junit.Assert.assertNotNull(throwableArray87);
    }

    @Test
    public void test3608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3608");
        codigos.Words words0 = new codigos.Words();
        int int2 = words0.countWords("codigos.LadoInvalidoException: ");
        int int4 = words0.countWords("NAO FORMA TRIANGULO");
        int int6 = words0.countWords("");
        int int8 = words0.countWords("hi!");
        int int10 = words0.countWords("codigos.LadoInvalidoException: ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test3609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3609");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 0, (float) 10L);
        float float3 = contaCorrente2.getSaldo();
        float float4 = contaCorrente2.getSaldo();
        contaCorrente2.setSaldo((-86.0f));
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
    }

    @Test
    public void test3610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3610");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((-45.0f), 97.0f);
    }

    @Test
    public void test3611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3611");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(80.0f, (-86.0f));
    }

    @Test
    public void test3612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3612");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 1, 32.0f);
        contaCorrente2.setSaldo(2.0f);
        // The following exception was thrown during execution in test generation
        try {
            float float6 = contaCorrente2.saque((float) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Valor invalido");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
    }

    @Test
    public void test3613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3613");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(1.0f, 1.0f);
        contaCorrente2.setSaldo((-45.0f));
        float float5 = contaCorrente2.getSaldo();
        contaCorrente2.setLimite(2.0f);
        contaCorrente2.setLimite(99.0f);
        // The following exception was thrown during execution in test generation
        try {
            float float11 = contaCorrente2.saque((-10.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Valor invalido");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-45.0f) + "'", float5 == (-45.0f));
    }

    @Test
    public void test3614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3614");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", (float) (short) -1);
        float float8 = pedido0.calculaTaxaDesconto(true, "NAO FORMA TRIANGULO", (float) (byte) 0);
        float float12 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: hi!", (float) (short) 100);
        float float16 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ", (float) (byte) 1);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10.0f + "'", float12 == 10.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
    }

    @Test
    public void test3615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3615");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(78.0f, 34.0f);
    }

    @Test
    public void test3616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3616");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 1L, 96.0f);
        contaCorrente2.setSaldo((float) (short) 0);
        float float5 = contaCorrente2.getSaldo();
        // The following exception was thrown during execution in test generation
        try {
            float float7 = contaCorrente2.saque((float) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Valor invalido");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
    }

    @Test
    public void test3617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3617");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) ' ', 1.0f);
        float float3 = contaCorrente2.getLimite();
        contaCorrente2.setLimite((-11.0f));
        float float6 = contaCorrente2.getLimite();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-11.0f) + "'", float6 == (-11.0f));
    }

    @Test
    public void test3618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3618");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 10, 0.0f);
        float float3 = contaCorrente2.getSaldo();
        float float5 = contaCorrente2.saque(1.0f);
        contaCorrente2.setSaldo(100.0f);
        contaCorrente2.setLimite(2.0f);
        contaCorrente2.setSaldo((float) '#');
        float float12 = contaCorrente2.getSaldo();
        float float13 = contaCorrente2.getSaldo();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 9.0f + "'", float5 == 9.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 35.0f + "'", float12 == 35.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 35.0f + "'", float13 == 35.0f);
    }

    @Test
    public void test3619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3619");
        java.lang.String str3 = codigos.Triangulo.classificaTriangulo(10, 10, 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ISOSCELES" + "'", str3, "ISOSCELES");
    }

    @Test
    public void test3620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3620");
        codigos.LadoInvalidoException ladoInvalidoException1 = new codigos.LadoInvalidoException("");
        java.lang.Throwable[] throwableArray2 = ladoInvalidoException1.getSuppressed();
        java.lang.Throwable[] throwableArray3 = ladoInvalidoException1.getSuppressed();
        java.lang.Throwable[] throwableArray4 = ladoInvalidoException1.getSuppressed();
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
        codigos.LadoInvalidoException ladoInvalidoException24 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException26 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException28 = new codigos.LadoInvalidoException("");
        ladoInvalidoException26.addSuppressed((java.lang.Throwable) ladoInvalidoException28);
        ladoInvalidoException24.addSuppressed((java.lang.Throwable) ladoInvalidoException28);
        java.lang.Throwable[] throwableArray31 = ladoInvalidoException28.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException33 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException35 = new codigos.LadoInvalidoException("");
        ladoInvalidoException33.addSuppressed((java.lang.Throwable) ladoInvalidoException35);
        codigos.LadoInvalidoException ladoInvalidoException38 = new codigos.LadoInvalidoException("hi!");
        ladoInvalidoException35.addSuppressed((java.lang.Throwable) ladoInvalidoException38);
        ladoInvalidoException28.addSuppressed((java.lang.Throwable) ladoInvalidoException38);
        java.lang.Throwable[] throwableArray41 = ladoInvalidoException28.getSuppressed();
        ladoInvalidoException6.addSuppressed((java.lang.Throwable) ladoInvalidoException28);
        java.lang.Throwable[] throwableArray43 = ladoInvalidoException6.getSuppressed();
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException6);
        java.lang.Class<?> wildcardClass45 = ladoInvalidoException6.getClass();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(throwableArray41);
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test3621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3621");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 5, (float) 100);
        float float3 = contaCorrente2.getSaldo();
        contaCorrente2.setSaldo((float) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            float float7 = contaCorrente2.saque((-59.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Valor invalido");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 5.0f + "'", float3 == 5.0f);
    }

    @Test
    public void test3622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3622");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(97.0f, 99.0f);
        float float3 = contaCorrente2.getSaldo();
        contaCorrente2.setLimite(10.0f);
        float float6 = contaCorrente2.getSaldo();
        contaCorrente2.setLimite(88.0f);
        float float9 = contaCorrente2.getLimite();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 97.0f + "'", float6 == 97.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 88.0f + "'", float9 == 88.0f);
    }

    @Test
    public void test3623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3623");
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
        java.lang.Throwable[] throwableArray63 = ladoInvalidoException20.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray41);
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertNotNull(throwableArray58);
        org.junit.Assert.assertNotNull(throwableArray60);
        org.junit.Assert.assertNotNull(throwableArray63);
    }

    @Test
    public void test3624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3624");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(97.0f, 99.0f);
        float float4 = contaCorrente2.saque(9.0f);
        float float5 = contaCorrente2.getSaldo();
        contaCorrente2.setSaldo(88.0f);
        float float8 = contaCorrente2.getLimite();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 88.0f + "'", float4 == 88.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 88.0f + "'", float5 == 88.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 99.0f + "'", float8 == 99.0f);
    }

    @Test
    public void test3625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3625");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(90.0f, (float) (-1));
        contaCorrente2.setLimite((float) 0);
        contaCorrente2.setSaldo(98.0f);
        float float7 = contaCorrente2.getLimite();
        float float9 = contaCorrente2.saque(2.0f);
        float float10 = contaCorrente2.getSaldo();
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 96.0f + "'", float9 == 96.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 96.0f + "'", float10 == 96.0f);
    }

    @Test
    public void test3626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3626");
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
        java.lang.String str99 = ladoInvalidoException1.toString();
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
        org.junit.Assert.assertEquals("'" + str99 + "' != '" + "codigos.LadoInvalidoException: NAO FORMA TRIANGULO" + "'", str99, "codigos.LadoInvalidoException: NAO FORMA TRIANGULO");
    }

    @Test
    public void test3627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3627");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 10, (float) 'a');
        float float4 = contaCorrente2.saque(96.0f);
        float float5 = contaCorrente2.getSaldo();
        contaCorrente2.setSaldo(96.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-86.0f) + "'", float4 == (-86.0f));
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-86.0f) + "'", float5 == (-86.0f));
    }

    @Test
    public void test3628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3628");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", 1.0f);
        float float8 = pedido0.calculaTaxaDesconto(false, "", (float) 1);
        float float12 = pedido0.calculaTaxaDesconto(false, "hi!", (float) (short) 100);
        float float16 = pedido0.calculaTaxaDesconto(true, "ESCALENO", (float) 2);
        float float20 = pedido0.calculaTaxaDesconto(false, "", (float) (byte) 100);
        float float24 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: ", 90.0f);
        float float28 = pedido0.calculaTaxaDesconto(true, "EQUILATERO", 8.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 10.0f + "'", float24 == 10.0f);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 10.0f + "'", float28 == 10.0f);
    }

    @Test
    public void test3629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3629");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", 1.0f);
        float float8 = pedido0.calculaTaxaDesconto(false, "", (float) 1);
        float float12 = pedido0.calculaTaxaDesconto(false, "hi!", (float) (short) 100);
        float float16 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ", 42.0f);
        java.lang.Class<?> wildcardClass17 = pedido0.getClass();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3630");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(96.0f, (-68.0f));
        // The following exception was thrown during execution in test generation
        try {
            float float4 = contaCorrente2.saque(91.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Saldo Insuficiente");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
    }

    @Test
    public void test3631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3631");
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
        contaCorrente2.setSaldo((float) (byte) 0);
        contaCorrente2.setSaldo((-2.0f));
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 10.0f + "'", float17 == 10.0f);
    }

    @Test
    public void test3632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3632");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 0, (float) (byte) 1);
        float float3 = contaCorrente2.getLimite();
        // The following exception was thrown during execution in test generation
        try {
            float float5 = contaCorrente2.saque(84.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Saldo Insuficiente");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void test3633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3633");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "hi!", (float) 1L);
        float float8 = pedido0.calculaTaxaDesconto(true, "ESCALENO", (float) (byte) 10);
        float float12 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!", 7.0f);
        float float16 = pedido0.calculaTaxaDesconto(true, "ESCALENO", (float) ' ');
        float float20 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ", (float) 3);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
    }

    @Test
    public void test3634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3634");
        java.lang.String str3 = codigos.Triangulo.classificaTriangulo((int) (byte) 100, (int) (short) 10, 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "NAO FORMA TRIANGULO" + "'", str3, "NAO FORMA TRIANGULO");
    }

    @Test
    public void test3635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3635");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 5, (float) 3);
        float float3 = contaCorrente2.getLimite();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 3.0f + "'", float3 == 3.0f);
    }

    @Test
    public void test3636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3636");
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
        java.lang.Throwable[] throwableArray57 = ladoInvalidoException33.getSuppressed();
        java.lang.Throwable[] throwableArray58 = ladoInvalidoException33.getSuppressed();
        java.lang.Throwable[] throwableArray59 = ladoInvalidoException33.getSuppressed();
        java.lang.Throwable[] throwableArray60 = ladoInvalidoException33.getSuppressed();
        java.lang.String str61 = ladoInvalidoException33.toString();
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertNotNull(throwableArray53);
        org.junit.Assert.assertNotNull(throwableArray55);
        org.junit.Assert.assertNotNull(throwableArray57);
        org.junit.Assert.assertNotNull(throwableArray58);
        org.junit.Assert.assertNotNull(throwableArray59);
        org.junit.Assert.assertNotNull(throwableArray60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!" + "'", str61, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!");
    }

    @Test
    public void test3637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3637");
        java.lang.String str3 = codigos.Triangulo.classificaTriangulo(4, 5, 2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ESCALENO" + "'", str3, "ESCALENO");
    }

    @Test
    public void test3638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3638");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(false, "NAO FORMA TRIANGULO", (float) '4');
        float float8 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: hi!", 0.0f);
        float float12 = pedido0.calculaTaxaDesconto(false, "ESCALENO", 0.0f);
        float float16 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: ", 51.0f);
        float float20 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: hi!", (float) (short) 10);
        float float24 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ", (float) (-1));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 10.0f + "'", float20 == 10.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 10.0f + "'", float24 == 10.0f);
    }

    @Test
    public void test3639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3639");
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
        codigos.LadoInvalidoException ladoInvalidoException37 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException39 = new codigos.LadoInvalidoException("");
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
        java.lang.Throwable[] throwableArray56 = ladoInvalidoException51.getSuppressed();
        ladoInvalidoException39.addSuppressed((java.lang.Throwable) ladoInvalidoException51);
        java.lang.Throwable[] throwableArray58 = ladoInvalidoException51.getSuppressed();
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
        ladoInvalidoException51.addSuppressed((java.lang.Throwable) ladoInvalidoException69);
        codigos.LadoInvalidoException ladoInvalidoException77 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException79 = new codigos.LadoInvalidoException("");
        ladoInvalidoException77.addSuppressed((java.lang.Throwable) ladoInvalidoException79);
        codigos.LadoInvalidoException ladoInvalidoException82 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException84 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException86 = new codigos.LadoInvalidoException("");
        ladoInvalidoException84.addSuppressed((java.lang.Throwable) ladoInvalidoException86);
        ladoInvalidoException82.addSuppressed((java.lang.Throwable) ladoInvalidoException86);
        java.lang.Throwable[] throwableArray89 = ladoInvalidoException86.getSuppressed();
        ladoInvalidoException79.addSuppressed((java.lang.Throwable) ladoInvalidoException86);
        java.lang.Throwable[] throwableArray91 = ladoInvalidoException86.getSuppressed();
        ladoInvalidoException51.addSuppressed((java.lang.Throwable) ladoInvalidoException86);
        java.lang.Throwable[] throwableArray93 = ladoInvalidoException86.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException95 = new codigos.LadoInvalidoException("codigos.LadoInvalidoException: hi!");
        java.lang.Throwable[] throwableArray96 = ladoInvalidoException95.getSuppressed();
        ladoInvalidoException86.addSuppressed((java.lang.Throwable) ladoInvalidoException95);
        ladoInvalidoException10.addSuppressed((java.lang.Throwable) ladoInvalidoException86);
        java.lang.String str99 = ladoInvalidoException10.toString();
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNotNull(throwableArray54);
        org.junit.Assert.assertNotNull(throwableArray56);
        org.junit.Assert.assertNotNull(throwableArray58);
        org.junit.Assert.assertNotNull(throwableArray72);
        org.junit.Assert.assertNotNull(throwableArray74);
        org.junit.Assert.assertNotNull(throwableArray89);
        org.junit.Assert.assertNotNull(throwableArray91);
        org.junit.Assert.assertNotNull(throwableArray93);
        org.junit.Assert.assertNotNull(throwableArray96);
        org.junit.Assert.assertEquals("'" + str99 + "' != '" + "codigos.LadoInvalidoException: " + "'", str99, "codigos.LadoInvalidoException: ");
    }

    @Test
    public void test3640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3640");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", 1.0f);
        float float8 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: hi!", (float) (short) 10);
        float float12 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: ", (float) '4');
        float float16 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!", (-1.0f));
        float float20 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: NAO FORMA TRIANGULO", (-57.0f));
        float float24 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ", 83.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 10.0f + "'", float20 == 10.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.0f + "'", float24 == 0.0f);
    }

    @Test
    public void test3641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3641");
        java.lang.String str3 = codigos.Triangulo.classificaTriangulo(1, (int) (byte) 1, 4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "NAO FORMA TRIANGULO" + "'", str3, "NAO FORMA TRIANGULO");
    }

    @Test
    public void test3642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3642");
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
        float float44 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ", 79.0f);
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
        org.junit.Assert.assertTrue("'" + float44 + "' != '" + 0.0f + "'", float44 == 0.0f);
    }

    @Test
    public void test3643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3643");
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
        java.lang.Throwable throwable62 = null;
        // The following exception was thrown during execution in test generation
        try {
            ladoInvalidoException1.addSuppressed(throwable62);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    public void test3644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3644");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", 1.0f);
        float float8 = pedido0.calculaTaxaDesconto(false, "hi!", (float) (short) 10);
        float float12 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ", 68.0f);
        float float16 = pedido0.calculaTaxaDesconto(true, "ESCALENO", (float) (byte) 10);
        float float20 = pedido0.calculaTaxaDesconto(true, "EQUILATERO", 16.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10.0f + "'", float12 == 10.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 10.0f + "'", float20 == 10.0f);
    }

    @Test
    public void test3645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3645");
        codigos.LadoInvalidoException ladoInvalidoException1 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException3 = new codigos.LadoInvalidoException("");
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException3);
        codigos.LadoInvalidoException ladoInvalidoException6 = new codigos.LadoInvalidoException("hi!");
        ladoInvalidoException3.addSuppressed((java.lang.Throwable) ladoInvalidoException6);
        java.lang.Throwable[] throwableArray8 = ladoInvalidoException6.getSuppressed();
        java.lang.Throwable[] throwableArray9 = ladoInvalidoException6.getSuppressed();
        java.lang.Throwable[] throwableArray10 = ladoInvalidoException6.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException12 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException14 = new codigos.LadoInvalidoException("");
        ladoInvalidoException12.addSuppressed((java.lang.Throwable) ladoInvalidoException14);
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
        ladoInvalidoException14.addSuppressed((java.lang.Throwable) ladoInvalidoException19);
        java.lang.Throwable[] throwableArray32 = ladoInvalidoException14.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException34 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException36 = new codigos.LadoInvalidoException("");
        ladoInvalidoException34.addSuppressed((java.lang.Throwable) ladoInvalidoException36);
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
        ladoInvalidoException36.addSuppressed((java.lang.Throwable) ladoInvalidoException48);
        java.lang.Throwable[] throwableArray55 = ladoInvalidoException48.getSuppressed();
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
        ladoInvalidoException48.addSuppressed((java.lang.Throwable) ladoInvalidoException61);
        ladoInvalidoException14.addSuppressed((java.lang.Throwable) ladoInvalidoException61);
        ladoInvalidoException6.addSuppressed((java.lang.Throwable) ladoInvalidoException61);
        java.lang.Throwable[] throwableArray78 = ladoInvalidoException61.getSuppressed();
        java.lang.String str79 = ladoInvalidoException61.toString();
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNotNull(throwableArray51);
        org.junit.Assert.assertNotNull(throwableArray53);
        org.junit.Assert.assertNotNull(throwableArray55);
        org.junit.Assert.assertNotNull(throwableArray64);
        org.junit.Assert.assertNotNull(throwableArray73);
        org.junit.Assert.assertNotNull(throwableArray78);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "codigos.LadoInvalidoException: " + "'", str79, "codigos.LadoInvalidoException: ");
    }

    @Test
    public void test3646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3646");
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
        java.lang.Throwable[] throwableArray35 = ladoInvalidoException28.getSuppressed();
        java.lang.Throwable[] throwableArray36 = ladoInvalidoException28.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray34);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray36);
    }

    @Test
    public void test3647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3647");
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
        java.lang.Throwable[] throwableArray72 = ladoInvalidoException6.getSuppressed();
        java.lang.String str73 = ladoInvalidoException6.toString();
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertNotNull(throwableArray46);
        org.junit.Assert.assertNotNull(throwableArray61);
        org.junit.Assert.assertNotNull(throwableArray63);
        org.junit.Assert.assertNotNull(throwableArray72);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "codigos.LadoInvalidoException: hi!" + "'", str73, "codigos.LadoInvalidoException: hi!");
    }

    @Test
    public void test3648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3648");
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
        float float40 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: EQUILATERO", (-2.0f));
        float float44 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!", 0.0f);
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
        org.junit.Assert.assertTrue("'" + float44 + "' != '" + 10.0f + "'", float44 == 10.0f);
    }

    @Test
    public void test3649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3649");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (short) 10, (float) ' ');
        // The following exception was thrown during execution in test generation
        try {
            float float4 = contaCorrente2.saque(66.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Saldo Insuficiente");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
    }

    @Test
    public void test3650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3650");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 1, (float) 0);
        contaCorrente2.setLimite(98.0f);
    }

    @Test
    public void test3651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3651");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 10, 0.0f);
        float float3 = contaCorrente2.getSaldo();
        float float5 = contaCorrente2.saque(1.0f);
        contaCorrente2.setSaldo(100.0f);
        contaCorrente2.setLimite(2.0f);
        float float10 = contaCorrente2.getSaldo();
        float float11 = contaCorrente2.getSaldo();
        java.lang.Class<?> wildcardClass12 = contaCorrente2.getClass();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 9.0f + "'", float5 == 9.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 100.0f + "'", float10 == 100.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 100.0f + "'", float11 == 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3652");
        java.lang.String str3 = codigos.Triangulo.classificaTriangulo(7, 2, (int) '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "NAO FORMA TRIANGULO" + "'", str3, "NAO FORMA TRIANGULO");
    }

    @Test
    public void test3653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3653");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(67.0f, 0.0f);
        java.lang.Class<?> wildcardClass3 = contaCorrente2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test3654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3654");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 10, 0.0f);
        float float3 = contaCorrente2.getSaldo();
        float float4 = contaCorrente2.getLimite();
        contaCorrente2.setSaldo((float) ' ');
        contaCorrente2.setSaldo((float) 100);
        float float9 = contaCorrente2.getSaldo();
        contaCorrente2.setSaldo(99.0f);
        contaCorrente2.setSaldo((float) (-1));
        contaCorrente2.setLimite((float) 5);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 100.0f + "'", float9 == 100.0f);
    }

    @Test
    public void test3655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3655");
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
        codigos.LadoInvalidoException ladoInvalidoException89 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException91 = new codigos.LadoInvalidoException("");
        ladoInvalidoException89.addSuppressed((java.lang.Throwable) ladoInvalidoException91);
        java.lang.Throwable[] throwableArray93 = ladoInvalidoException89.getSuppressed();
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException89);
        java.lang.String str95 = ladoInvalidoException1.toString();
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
        org.junit.Assert.assertNotNull(throwableArray93);
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "codigos.LadoInvalidoException: " + "'", str95, "codigos.LadoInvalidoException: ");
    }

    @Test
    public void test3656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3656");
        codigos.Words words0 = new codigos.Words();
        int int2 = words0.countWords("codigos.LadoInvalidoException: ");
        int int4 = words0.countWords("NAO FORMA TRIANGULO");
        int int6 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!");
        int int8 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
    }

    @Test
    public void test3657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3657");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(44.0f, 8.0f);
    }

    @Test
    public void test3658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3658");
        codigos.Words words0 = new codigos.Words();
        int int2 = words0.countWords("");
        int int4 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!");
        int int6 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        int int8 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int10 = words0.countWords("NAO FORMA TRIANGULO");
        int int12 = words0.countWords("");
        int int14 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!");
        int int16 = words0.countWords("codigos.LadoInvalidoException: EQUILATERO");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test3659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3659");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 'a', (float) 10);
        float float4 = contaCorrente2.saque((float) 1);
        float float5 = contaCorrente2.getLimite();
        contaCorrente2.setSaldo((float) (short) -1);
        contaCorrente2.setLimite(0.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 96.0f + "'", float4 == 96.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10.0f + "'", float5 == 10.0f);
    }

    @Test
    public void test3660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3660");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (float) 5);
    }

    @Test
    public void test3661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3661");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        float float3 = contaCorrente2.getSaldo();
        contaCorrente2.setSaldo(100.0f);
        float float7 = contaCorrente2.saque((float) (byte) 10);
        float float8 = contaCorrente2.getSaldo();
        contaCorrente2.setSaldo((float) (short) 0);
        float float11 = contaCorrente2.getSaldo();
        // The following exception was thrown during execution in test generation
        try {
            float float13 = contaCorrente2.saque(21.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Saldo Insuficiente");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 90.0f + "'", float7 == 90.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 90.0f + "'", float8 == 90.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
    }

    @Test
    public void test3662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3662");
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
        codigos.LadoInvalidoException ladoInvalidoException48 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException50 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException52 = new codigos.LadoInvalidoException("");
        ladoInvalidoException50.addSuppressed((java.lang.Throwable) ladoInvalidoException52);
        ladoInvalidoException48.addSuppressed((java.lang.Throwable) ladoInvalidoException52);
        java.lang.Throwable[] throwableArray55 = ladoInvalidoException52.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException57 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException59 = new codigos.LadoInvalidoException("");
        ladoInvalidoException57.addSuppressed((java.lang.Throwable) ladoInvalidoException59);
        codigos.LadoInvalidoException ladoInvalidoException62 = new codigos.LadoInvalidoException("hi!");
        ladoInvalidoException59.addSuppressed((java.lang.Throwable) ladoInvalidoException62);
        ladoInvalidoException52.addSuppressed((java.lang.Throwable) ladoInvalidoException62);
        ladoInvalidoException42.addSuppressed((java.lang.Throwable) ladoInvalidoException62);
        java.lang.Throwable[] throwableArray66 = ladoInvalidoException42.getSuppressed();
        java.lang.Throwable[] throwableArray67 = ladoInvalidoException42.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertNotNull(throwableArray46);
        org.junit.Assert.assertNotNull(throwableArray55);
        org.junit.Assert.assertNotNull(throwableArray66);
        org.junit.Assert.assertNotNull(throwableArray67);
    }

    @Test
    public void test3663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3663");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", 1.0f);
        float float8 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: hi!", (float) (short) 10);
        float float12 = pedido0.calculaTaxaDesconto(true, "NAO FORMA TRIANGULO", (float) 0L);
        float float16 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!", (float) 0L);
        float float20 = pedido0.calculaTaxaDesconto(false, "", (float) '4');
        float float24 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ", (-56.0f));
        float float28 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ", (float) (short) 100);
        float float32 = pedido0.calculaTaxaDesconto(true, "", (-57.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10.0f + "'", float12 == 10.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.0f + "'", float24 == 0.0f);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 10.0f + "'", float28 == 10.0f);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 10.0f + "'", float32 == 10.0f);
    }

    @Test
    public void test3664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3664");
        codigos.Words words0 = new codigos.Words();
        int int2 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int4 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int6 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        int int8 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        int int10 = words0.countWords("codigos.LadoInvalidoException: ISOSCELES");
        int int12 = words0.countWords("codigos.LadoInvalidoException: ISOSCELES");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test3665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3665");
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
        java.lang.Throwable throwable98 = null;
        // The following exception was thrown during execution in test generation
        try {
            ladoInvalidoException47.addSuppressed(throwable98);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray50);
        org.junit.Assert.assertNotNull(throwableArray52);
        org.junit.Assert.assertNotNull(throwableArray73);
        org.junit.Assert.assertNotNull(throwableArray88);
        org.junit.Assert.assertNotNull(throwableArray90);
        org.junit.Assert.assertNotNull(throwableArray96);
    }

    @Test
    public void test3666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3666");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", 1.0f);
        float float8 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: hi!", (float) (short) 10);
        float float12 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: hi!", (float) 2);
        float float16 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: ", 32.0f);
        float float20 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!", (float) 3);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
    }

    @Test
    public void test3667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3667");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(43.0f, 65.0f);
    }

    @Test
    public void test3668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3668");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(99.0f, (float) 'a');
        float float3 = contaCorrente2.getLimite();
        contaCorrente2.setSaldo((float) '4');
        contaCorrente2.setLimite((float) 100L);
        float float9 = contaCorrente2.saque((float) 100L);
        contaCorrente2.setLimite(23.0f);
        float float12 = contaCorrente2.getSaldo();
        // The following exception was thrown during execution in test generation
        try {
            float float14 = contaCorrente2.saque((-32.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Valor invalido");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-48.0f) + "'", float9 == (-48.0f));
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-48.0f) + "'", float12 == (-48.0f));
    }

    @Test
    public void test3669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3669");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", 1.0f);
        float float8 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: hi!", (float) (short) 10);
        float float12 = pedido0.calculaTaxaDesconto(false, "NAO FORMA TRIANGULO", (-48.0f));
        float float16 = pedido0.calculaTaxaDesconto(false, "ESCALENO", 52.0f);
        float float20 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: ", (float) '4');
        float float24 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!", (float) 5);
        float float28 = pedido0.calculaTaxaDesconto(true, "EQUILATERO", (-90.0f));
        float float32 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ", 31.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 10.0f + "'", float24 == 10.0f);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 10.0f + "'", float28 == 10.0f);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 0.0f + "'", float32 == 0.0f);
    }

    @Test
    public void test3670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3670");
        codigos.Words words0 = new codigos.Words();
        int int2 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int4 = words0.countWords("NAO FORMA TRIANGULO");
        int int6 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int8 = words0.countWords("NAO FORMA TRIANGULO");
        int int10 = words0.countWords("");
        int int12 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int14 = words0.countWords("codigos.LadoInvalidoException: ");
        int int16 = words0.countWords("");
        int int18 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int20 = words0.countWords("ESCALENO");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test3671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3671");
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
        int int22 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!");
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
    }

    @Test
    public void test3672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3672");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        float float3 = contaCorrente2.getSaldo();
        contaCorrente2.setSaldo(100.0f);
        float float6 = contaCorrente2.getLimite();
        contaCorrente2.setSaldo((float) (byte) -1);
        contaCorrente2.setSaldo(62.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-1.0f) + "'", float6 == (-1.0f));
    }

    @Test
    public void test3673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3673");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 0L, (float) (short) 100);
        contaCorrente2.setLimite(88.0f);
        contaCorrente2.setSaldo(99.0f);
        contaCorrente2.setSaldo(52.0f);
        float float10 = contaCorrente2.saque(4.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 48.0f + "'", float10 == 48.0f);
    }

    @Test
    public void test3674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3674");
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
        contaCorrente2.setSaldo(52.0f);
        // The following exception was thrown during execution in test generation
        try {
            float float24 = contaCorrente2.saque(0.0f);
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
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 32.0f + "'", float18 == 32.0f);
    }

    @Test
    public void test3675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3675");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 10, 67.0f);
        float float3 = contaCorrente2.getSaldo();
        java.lang.Class<?> wildcardClass4 = contaCorrente2.getClass();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3676");
        codigos.Words words0 = new codigos.Words();
        int int2 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int4 = words0.countWords("NAO FORMA TRIANGULO");
        int int6 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int8 = words0.countWords("NAO FORMA TRIANGULO");
        int int10 = words0.countWords("NAO FORMA TRIANGULO");
        int int12 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!");
        int int14 = words0.countWords("codigos.LadoInvalidoException: NAO FORMA TRIANGULO");
        int int16 = words0.countWords("codigos.LadoInvalidoException: NAO FORMA TRIANGULO");
        int int18 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        java.lang.Class<?> wildcardClass19 = words0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3677");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(90.0f, (float) 1L);
        float float3 = contaCorrente2.getSaldo();
        contaCorrente2.setSaldo(45.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 90.0f + "'", float3 == 90.0f);
    }

    @Test
    public void test3678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3678");
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
        java.lang.String str36 = ladoInvalidoException25.toString();
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "codigos.LadoInvalidoException: " + "'", str36, "codigos.LadoInvalidoException: ");
    }

    @Test
    public void test3679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3679");
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
        java.lang.Class<?> wildcardClass80 = ladoInvalidoException67.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass80);
    }

    @Test
    public void test3680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3680");
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
        int int22 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
    }

    @Test
    public void test3681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3681");
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
        java.lang.Throwable[] throwableArray92 = ladoInvalidoException61.getSuppressed();
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
        org.junit.Assert.assertNotNull(throwableArray92);
    }

    @Test
    public void test3682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3682");
        java.lang.String str3 = codigos.Triangulo.classificaTriangulo((int) '4', (int) '#', 6);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "NAO FORMA TRIANGULO" + "'", str3, "NAO FORMA TRIANGULO");
    }

    @Test
    public void test3683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3683");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(51.0f, (float) (short) 0);
        float float3 = contaCorrente2.getSaldo();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 51.0f + "'", float3 == 51.0f);
    }

    @Test
    public void test3684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3684");
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
        float float44 = pedido0.calculaTaxaDesconto(false, "ESCALENO", 30.0f);
        float float48 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: ", 13.0f);
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
        org.junit.Assert.assertTrue("'" + float44 + "' != '" + 0.0f + "'", float44 == 0.0f);
        org.junit.Assert.assertTrue("'" + float48 + "' != '" + 0.0f + "'", float48 == 0.0f);
    }

    @Test
    public void test3685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3685");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 'a', (float) 10);
        contaCorrente2.setSaldo((float) 100L);
        float float5 = contaCorrente2.getSaldo();
        float float6 = contaCorrente2.getLimite();
        float float7 = contaCorrente2.getSaldo();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 100.0f + "'", float5 == 100.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
    }

    @Test
    public void test3686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3686");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", (float) (short) -1);
        float float8 = pedido0.calculaTaxaDesconto(true, "NAO FORMA TRIANGULO", (float) (byte) 0);
        float float12 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: hi!", (float) (short) 100);
        float float16 = pedido0.calculaTaxaDesconto(false, "ESCALENO", 35.0f);
        float float20 = pedido0.calculaTaxaDesconto(true, "hi!", (float) '4');
        float float24 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ", 52.0f);
        float float28 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", (-68.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10.0f + "'", float12 == 10.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 10.0f + "'", float20 == 10.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.0f + "'", float24 == 0.0f);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 10.0f + "'", float28 == 10.0f);
    }

    @Test
    public void test3687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3687");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        float float3 = contaCorrente2.getLimite();
        float float4 = contaCorrente2.getLimite();
        contaCorrente2.setSaldo((float) (short) 1);
        contaCorrente2.setLimite((float) 10);
        // The following exception was thrown during execution in test generation
        try {
            float float10 = contaCorrente2.saque(44.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Saldo Insuficiente");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.0f) + "'", float4 == (-1.0f));
    }

    @Test
    public void test3688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3688");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((-2.0f), 90.0f);
        // The following exception was thrown during execution in test generation
        try {
            float float4 = contaCorrente2.saque(89.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Saldo Insuficiente");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
    }

    @Test
    public void test3689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3689");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 1, (float) (short) 100);
        contaCorrente2.setSaldo((float) 2);
        contaCorrente2.setLimite((float) (byte) -1);
        float float7 = contaCorrente2.getSaldo();
        contaCorrente2.setLimite(32.0f);
        float float10 = contaCorrente2.getLimite();
        float float11 = contaCorrente2.getLimite();
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 2.0f + "'", float7 == 2.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 32.0f + "'", float10 == 32.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 32.0f + "'", float11 == 32.0f);
    }

    @Test
    public void test3690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3690");
        java.lang.String str3 = codigos.Triangulo.classificaTriangulo(5, 100, 2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "NAO FORMA TRIANGULO" + "'", str3, "NAO FORMA TRIANGULO");
    }

    @Test
    public void test3691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3691");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(5.0f, (-2.0f));
    }

    @Test
    public void test3692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3692");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) '#', 2.0f);
        float float3 = contaCorrente2.getSaldo();
        float float4 = contaCorrente2.getSaldo();
        float float5 = contaCorrente2.getSaldo();
        float float7 = contaCorrente2.saque(4.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 35.0f + "'", float3 == 35.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 35.0f + "'", float4 == 35.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 35.0f + "'", float5 == 35.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 31.0f + "'", float7 == 31.0f);
    }

    @Test
    public void test3693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3693");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(91.0f, (float) 2);
        float float3 = contaCorrente2.getLimite();
        contaCorrente2.setLimite(30.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3 == 2.0f);
    }

    @Test
    public void test3694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3694");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) '4', (-88.0f));
        float float3 = contaCorrente2.getLimite();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-88.0f) + "'", float3 == (-88.0f));
    }

    @Test
    public void test3695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3695");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(47.0f, (-90.0f));
        contaCorrente2.setSaldo((float) (short) 100);
    }

    @Test
    public void test3696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3696");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(1.0f, (float) 0L);
        contaCorrente2.setSaldo((float) 'a');
        contaCorrente2.setLimite((float) 10L);
        contaCorrente2.setSaldo((float) (short) 0);
        contaCorrente2.setLimite((float) (byte) 10);
        float float11 = contaCorrente2.getSaldo();
        contaCorrente2.setSaldo(92.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
    }

    @Test
    public void test3697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3697");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 100, 97.0f);
        java.lang.Class<?> wildcardClass3 = contaCorrente2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test3698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3698");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(35.0f, 52.0f);
    }

    @Test
    public void test3699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3699");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        float float3 = contaCorrente2.getLimite();
        float float4 = contaCorrente2.getSaldo();
        float float5 = contaCorrente2.getLimite();
        float float6 = contaCorrente2.getSaldo();
        contaCorrente2.setLimite((float) (byte) 10);
        contaCorrente2.setSaldo((float) 100L);
        contaCorrente2.setSaldo(90.0f);
        contaCorrente2.setLimite((float) ' ');
        contaCorrente2.setLimite((-56.0f));
        // The following exception was thrown during execution in test generation
        try {
            float float18 = contaCorrente2.saque((-50.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Valor invalido");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
    }

    @Test
    public void test3700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3700");
        codigos.LadoInvalidoException ladoInvalidoException1 = new codigos.LadoInvalidoException("codigos.LadoInvalidoException: hi!");
        codigos.LadoInvalidoException ladoInvalidoException3 = new codigos.LadoInvalidoException("hi!");
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException3);
        codigos.LadoInvalidoException ladoInvalidoException6 = new codigos.LadoInvalidoException("ESCALENO");
        java.lang.Throwable[] throwableArray7 = ladoInvalidoException6.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException9 = new codigos.LadoInvalidoException("");
        java.lang.Throwable[] throwableArray10 = ladoInvalidoException9.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException12 = new codigos.LadoInvalidoException("hi!");
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
        ladoInvalidoException12.addSuppressed((java.lang.Throwable) ladoInvalidoException23);
        codigos.LadoInvalidoException ladoInvalidoException30 = new codigos.LadoInvalidoException("codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!");
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
        codigos.LadoInvalidoException ladoInvalidoException48 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException50 = new codigos.LadoInvalidoException("");
        ladoInvalidoException48.addSuppressed((java.lang.Throwable) ladoInvalidoException50);
        codigos.LadoInvalidoException ladoInvalidoException53 = new codigos.LadoInvalidoException("hi!");
        ladoInvalidoException50.addSuppressed((java.lang.Throwable) ladoInvalidoException53);
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
        ladoInvalidoException50.addSuppressed((java.lang.Throwable) ladoInvalidoException65);
        ladoInvalidoException41.addSuppressed((java.lang.Throwable) ladoInvalidoException50);
        ladoInvalidoException30.addSuppressed((java.lang.Throwable) ladoInvalidoException41);
        ladoInvalidoException23.addSuppressed((java.lang.Throwable) ladoInvalidoException30);
        ladoInvalidoException9.addSuppressed((java.lang.Throwable) ladoInvalidoException23);
        ladoInvalidoException6.addSuppressed((java.lang.Throwable) ladoInvalidoException23);
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException23);
        java.lang.Throwable[] throwableArray94 = ladoInvalidoException23.getSuppressed();
        java.lang.Throwable[] throwableArray95 = ladoInvalidoException23.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertNotNull(throwableArray46);
        org.junit.Assert.assertNotNull(throwableArray68);
        org.junit.Assert.assertNotNull(throwableArray83);
        org.junit.Assert.assertNotNull(throwableArray85);
        org.junit.Assert.assertNotNull(throwableArray94);
        org.junit.Assert.assertNotNull(throwableArray95);
    }

    @Test
    public void test3701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3701");
        java.lang.String str3 = codigos.Triangulo.classificaTriangulo((int) ' ', 4, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "NAO FORMA TRIANGULO" + "'", str3, "NAO FORMA TRIANGULO");
    }

    @Test
    public void test3702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3702");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(67.0f, (float) 100);
        float float3 = contaCorrente2.getSaldo();
        contaCorrente2.setSaldo((-11.0f));
        contaCorrente2.setLimite((float) ' ');
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 67.0f + "'", float3 == 67.0f);
    }

    @Test
    public void test3703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3703");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((-88.0f), (float) 'a');
        contaCorrente2.setLimite((-2.0f));
    }

    @Test
    public void test3704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3704");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", (float) (short) -1);
        float float8 = pedido0.calculaTaxaDesconto(true, "NAO FORMA TRIANGULO", (float) (byte) 0);
        float float12 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: hi!", (float) (short) 100);
        float float16 = pedido0.calculaTaxaDesconto(false, "ESCALENO", 89.0f);
        float float20 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ", (float) 1);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10.0f + "'", float12 == 10.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 10.0f + "'", float20 == 10.0f);
    }

    @Test
    public void test3705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3705");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        float float3 = contaCorrente2.getSaldo();
        contaCorrente2.setSaldo(100.0f);
        contaCorrente2.setLimite(10.0f);
        contaCorrente2.setLimite(0.0f);
        contaCorrente2.setLimite((float) (short) 10);
        contaCorrente2.setLimite((float) 'a');
        float float15 = contaCorrente2.saque(2.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 98.0f + "'", float15 == 98.0f);
    }

    @Test
    public void test3706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3706");
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
        java.lang.Throwable[] throwableArray86 = ladoInvalidoException3.getSuppressed();
        java.lang.Throwable[] throwableArray87 = ladoInvalidoException3.getSuppressed();
        java.lang.Class<?> wildcardClass88 = ladoInvalidoException3.getClass();
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertNotNull(throwableArray40);
        org.junit.Assert.assertNotNull(throwableArray62);
        org.junit.Assert.assertNotNull(throwableArray77);
        org.junit.Assert.assertNotNull(throwableArray79);
        org.junit.Assert.assertNotNull(throwableArray86);
        org.junit.Assert.assertNotNull(throwableArray87);
        org.junit.Assert.assertNotNull(wildcardClass88);
    }

    @Test
    public void test3707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3707");
        java.lang.String str3 = codigos.Triangulo.classificaTriangulo((int) (byte) 100, 100, (int) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ISOSCELES" + "'", str3, "ISOSCELES");
    }

    @Test
    public void test3708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3708");
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
        java.lang.Throwable[] throwableArray87 = ladoInvalidoException79.getSuppressed();
        java.lang.Throwable[] throwableArray88 = ladoInvalidoException79.getSuppressed();
        java.lang.Throwable[] throwableArray89 = ladoInvalidoException79.getSuppressed();
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
        org.junit.Assert.assertNotNull(throwableArray88);
        org.junit.Assert.assertNotNull(throwableArray89);
    }

    @Test
    public void test3709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3709");
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
        java.lang.Throwable[] throwableArray77 = ladoInvalidoException68.getSuppressed();
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
    public void test3710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3710");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(1.0f, 42.0f);
        contaCorrente2.setLimite((-1.0f));
        float float5 = contaCorrente2.getSaldo();
        float float6 = contaCorrente2.getLimite();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-1.0f) + "'", float6 == (-1.0f));
    }

    @Test
    public void test3711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3711");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = codigos.Triangulo.classificaTriangulo(0, 7, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type codigos.LadoInvalidoException; message: lado invalido");
        } catch (codigos.LadoInvalidoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3712");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = codigos.Triangulo.classificaTriangulo(6, (int) (short) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type codigos.LadoInvalidoException; message: lado invalido");
        } catch (codigos.LadoInvalidoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3713");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) ' ', (float) '4');
        // The following exception was thrown during execution in test generation
        try {
            float float4 = contaCorrente2.saque((-25.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Valor invalido");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
    }

    @Test
    public void test3714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3714");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 10, 0.0f);
        contaCorrente2.setSaldo((float) (byte) 0);
        float float5 = contaCorrente2.getSaldo();
        contaCorrente2.setSaldo((float) 0);
        contaCorrente2.setLimite((float) (byte) 10);
        contaCorrente2.setLimite((float) 0);
        contaCorrente2.setSaldo((-86.0f));
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
    }

    @Test
    public void test3715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3715");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        float float3 = contaCorrente2.getLimite();
        float float4 = contaCorrente2.getSaldo();
        float float5 = contaCorrente2.getSaldo();
        float float6 = contaCorrente2.getLimite();
        contaCorrente2.setLimite(68.0f);
        float float9 = contaCorrente2.getLimite();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 100.0f + "'", float5 == 100.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-1.0f) + "'", float6 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 68.0f + "'", float9 == 68.0f);
    }

    @Test
    public void test3716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3716");
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
        java.lang.String str87 = ladoInvalidoException15.toString();
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
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "codigos.LadoInvalidoException: " + "'", str87, "codigos.LadoInvalidoException: ");
    }

    @Test
    public void test3717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3717");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((-32.0f), 67.0f);
        float float3 = contaCorrente2.getLimite();
        contaCorrente2.setLimite(81.0f);
        float float6 = contaCorrente2.getLimite();
        float float7 = contaCorrente2.getSaldo();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 67.0f + "'", float3 == 67.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 81.0f + "'", float6 == 81.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-32.0f) + "'", float7 == (-32.0f));
    }

    @Test
    public void test3718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3718");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        float float3 = contaCorrente2.getLimite();
        float float4 = contaCorrente2.getSaldo();
        float float5 = contaCorrente2.getLimite();
        float float6 = contaCorrente2.getSaldo();
        contaCorrente2.setLimite((float) (byte) 10);
        contaCorrente2.setSaldo((float) 100L);
        contaCorrente2.setLimite((float) (byte) 10);
        float float13 = contaCorrente2.getSaldo();
        float float15 = contaCorrente2.saque(65.0f);
        float float17 = contaCorrente2.saque((float) (short) 1);
        float float18 = contaCorrente2.getSaldo();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 100.0f + "'", float13 == 100.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 35.0f + "'", float15 == 35.0f);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 34.0f + "'", float17 == 34.0f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 34.0f + "'", float18 == 34.0f);
    }

    @Test
    public void test3719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3719");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(99.0f, (float) 'a');
        float float3 = contaCorrente2.getLimite();
        contaCorrente2.setSaldo((-10.0f));
        float float7 = contaCorrente2.saque((float) (short) 1);
        float float8 = contaCorrente2.getLimite();
        float float9 = contaCorrente2.getLimite();
        contaCorrente2.setSaldo((float) '#');
        contaCorrente2.setSaldo(8.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-11.0f) + "'", float7 == (-11.0f));
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 97.0f + "'", float8 == 97.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 97.0f + "'", float9 == 97.0f);
    }

    @Test
    public void test3720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3720");
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
        java.lang.Throwable[] throwableArray87 = ladoInvalidoException9.getSuppressed();
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
        org.junit.Assert.assertNotNull(throwableArray87);
    }

    @Test
    public void test3721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3721");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = codigos.Triangulo.classificaTriangulo((-1), 4, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type codigos.LadoInvalidoException; message: lado invalido");
        } catch (codigos.LadoInvalidoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3722");
        java.lang.String str3 = codigos.Triangulo.classificaTriangulo(4, 100, 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "NAO FORMA TRIANGULO" + "'", str3, "NAO FORMA TRIANGULO");
    }

    @Test
    public void test3723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3723");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 1L, 96.0f);
        contaCorrente2.setSaldo(0.0f);
        float float5 = contaCorrente2.getLimite();
        contaCorrente2.setLimite((float) 3);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 96.0f + "'", float5 == 96.0f);
    }

    @Test
    public void test3724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3724");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(12.0f, 23.0f);
    }

    @Test
    public void test3725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3725");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (short) 10, (float) (byte) -1);
        contaCorrente2.setLimite((-56.0f));
        float float5 = contaCorrente2.getSaldo();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10.0f + "'", float5 == 10.0f);
    }

    @Test
    public void test3726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3726");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 0, (float) ' ');
        float float4 = contaCorrente2.saque((float) (byte) 1);
        contaCorrente2.setSaldo(45.0f);
        contaCorrente2.setLimite(66.0f);
        float float9 = contaCorrente2.getLimite();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.0f) + "'", float4 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 66.0f + "'", float9 == 66.0f);
    }

    @Test
    public void test3727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3727");
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
        java.lang.Throwable[] throwableArray30 = ladoInvalidoException18.getSuppressed();
        java.lang.Throwable[] throwableArray31 = ladoInvalidoException18.getSuppressed();
        ladoInvalidoException4.addSuppressed((java.lang.Throwable) ladoInvalidoException18);
        java.lang.Throwable[] throwableArray33 = ladoInvalidoException18.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException35 = new codigos.LadoInvalidoException("");
        java.lang.Throwable[] throwableArray36 = ladoInvalidoException35.getSuppressed();
        java.lang.Throwable[] throwableArray37 = ladoInvalidoException35.getSuppressed();
        java.lang.Throwable[] throwableArray38 = ladoInvalidoException35.getSuppressed();
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
        java.lang.Throwable[] throwableArray54 = ladoInvalidoException42.getSuppressed();
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
        java.lang.Throwable[] throwableArray78 = ladoInvalidoException70.getSuppressed();
        ladoInvalidoException42.addSuppressed((java.lang.Throwable) ladoInvalidoException70);
        ladoInvalidoException35.addSuppressed((java.lang.Throwable) ladoInvalidoException42);
        ladoInvalidoException18.addSuppressed((java.lang.Throwable) ladoInvalidoException35);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertNotNull(throwableArray52);
        org.junit.Assert.assertNotNull(throwableArray54);
        org.junit.Assert.assertNotNull(throwableArray73);
        org.junit.Assert.assertNotNull(throwableArray75);
        org.junit.Assert.assertNotNull(throwableArray77);
        org.junit.Assert.assertNotNull(throwableArray78);
    }

    @Test
    public void test3728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3728");
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
        java.lang.Throwable[] throwableArray89 = ladoInvalidoException42.getSuppressed();
        java.lang.Throwable[] throwableArray90 = ladoInvalidoException42.getSuppressed();
        java.lang.Throwable[] throwableArray91 = ladoInvalidoException42.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertNotNull(throwableArray64);
        org.junit.Assert.assertNotNull(throwableArray79);
        org.junit.Assert.assertNotNull(throwableArray81);
        org.junit.Assert.assertNotNull(throwableArray87);
        org.junit.Assert.assertNotNull(throwableArray89);
        org.junit.Assert.assertNotNull(throwableArray90);
        org.junit.Assert.assertNotNull(throwableArray91);
    }

    @Test
    public void test3729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3729");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(52.0f, 88.0f);
        float float4 = contaCorrente2.saque(97.0f);
        float float5 = contaCorrente2.getLimite();
        float float7 = contaCorrente2.saque(7.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-45.0f) + "'", float4 == (-45.0f));
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 88.0f + "'", float5 == 88.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-52.0f) + "'", float7 == (-52.0f));
    }

    @Test
    public void test3730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3730");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(23.0f, 89.0f);
        float float3 = contaCorrente2.getSaldo();
        contaCorrente2.setLimite(10.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 23.0f + "'", float3 == 23.0f);
    }

    @Test
    public void test3731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3731");
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
        java.lang.Throwable[] throwableArray26 = ladoInvalidoException15.getSuppressed();
        java.lang.Throwable[] throwableArray27 = ladoInvalidoException15.getSuppressed();
        java.lang.String str28 = ladoInvalidoException15.toString();
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "codigos.LadoInvalidoException: " + "'", str28, "codigos.LadoInvalidoException: ");
    }

    @Test
    public void test3732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3732");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        float float3 = contaCorrente2.getLimite();
        float float4 = contaCorrente2.getSaldo();
        float float5 = contaCorrente2.getLimite();
        float float6 = contaCorrente2.getLimite();
        contaCorrente2.setLimite(16.0f);
        contaCorrente2.setSaldo(13.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-1.0f) + "'", float6 == (-1.0f));
    }

    @Test
    public void test3733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3733");
        boolean boolean1 = codigos.Identifier.validaIdentificador("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3734");
        codigos.Words words0 = new codigos.Words();
        int int2 = words0.countWords("codigos.LadoInvalidoException: ");
        int int4 = words0.countWords("NAO FORMA TRIANGULO");
        int int6 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int8 = words0.countWords("codigos.LadoInvalidoException: ESCALENO");
        int int10 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        int int12 = words0.countWords("codigos.LadoInvalidoException: ISOSCELES");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test3735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3735");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(97.0f, (float) 1L);
    }

    @Test
    public void test3736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3736");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", 1.0f);
        float float8 = pedido0.calculaTaxaDesconto(false, "", (float) 1);
        float float12 = pedido0.calculaTaxaDesconto(false, "hi!", (float) (short) 100);
        float float16 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: hi!", (float) '#');
        float float20 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ", (float) (short) 0);
        float float24 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ", 0.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.0f + "'", float24 == 0.0f);
    }

    @Test
    public void test3737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3737");
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
        java.lang.Throwable[] throwableArray27 = ladoInvalidoException3.getSuppressed();
        java.lang.Throwable[] throwableArray28 = ladoInvalidoException3.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray28);
    }

    @Test
    public void test3738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3738");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) '#', 2.0f);
        float float3 = contaCorrente2.getSaldo();
        float float4 = contaCorrente2.getLimite();
        contaCorrente2.setLimite((float) 3);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 35.0f + "'", float3 == 35.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 2.0f + "'", float4 == 2.0f);
    }

    @Test
    public void test3739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3739");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 1, (float) 10L);
    }

    @Test
    public void test3740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3740");
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
        java.lang.Throwable[] throwableArray64 = ladoInvalidoException42.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException66 = new codigos.LadoInvalidoException("codigos.LadoInvalidoException: hi!");
        ladoInvalidoException42.addSuppressed((java.lang.Throwable) ladoInvalidoException66);
        ladoInvalidoException3.addSuppressed((java.lang.Throwable) ladoInvalidoException42);
        java.lang.String str69 = ladoInvalidoException3.toString();
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray45);
        org.junit.Assert.assertNotNull(throwableArray60);
        org.junit.Assert.assertNotNull(throwableArray62);
        org.junit.Assert.assertNotNull(throwableArray64);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "codigos.LadoInvalidoException: " + "'", str69, "codigos.LadoInvalidoException: ");
    }

    @Test
    public void test3741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3741");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", 1.0f);
        float float8 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: hi!", (float) (short) 10);
        float float12 = pedido0.calculaTaxaDesconto(true, "NAO FORMA TRIANGULO", (float) 0L);
        float float16 = pedido0.calculaTaxaDesconto(true, "", 1.0f);
        float float20 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: hi!", (-9.0f));
        float float24 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: NAO FORMA TRIANGULO", 28.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10.0f + "'", float12 == 10.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 10.0f + "'", float20 == 10.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.0f + "'", float24 == 0.0f);
    }

    @Test
    public void test3742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3742");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(0.0f, 12.0f);
        contaCorrente2.setSaldo(87.0f);
    }

    @Test
    public void test3743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3743");
        codigos.Words words0 = new codigos.Words();
        int int2 = words0.countWords("codigos.LadoInvalidoException: ");
        int int4 = words0.countWords("");
        int int6 = words0.countWords("ESCALENO");
        int int8 = words0.countWords("");
        int int10 = words0.countWords("codigos.LadoInvalidoException: NAO FORMA TRIANGULO");
        int int12 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test3744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3744");
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
        float float20 = contaCorrente2.getSaldo();
        java.lang.Class<?> wildcardClass21 = contaCorrente2.getClass();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 10.0f + "'", float17 == 10.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 10.0f + "'", float20 == 10.0f);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3745");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 0L, (float) 10);
        contaCorrente2.setSaldo((float) 2);
        float float5 = contaCorrente2.getSaldo();
        contaCorrente2.setLimite(0.0f);
        java.lang.Class<?> wildcardClass8 = contaCorrente2.getClass();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 2.0f + "'", float5 == 2.0f);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3746");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) '#', (float) (short) 10);
        contaCorrente2.setSaldo((float) (short) 100);
        float float5 = contaCorrente2.getLimite();
        contaCorrente2.setSaldo((float) '4');
        // The following exception was thrown during execution in test generation
        try {
            float float9 = contaCorrente2.saque((-5.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Valor invalido");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10.0f + "'", float5 == 10.0f);
    }

    @Test
    public void test3747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3747");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((-58.0f), 92.0f);
        float float3 = contaCorrente2.getSaldo();
        contaCorrente2.setLimite(56.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-58.0f) + "'", float3 == (-58.0f));
    }

    @Test
    public void test3748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3748");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", (float) (short) -1);
        float float8 = pedido0.calculaTaxaDesconto(true, "NAO FORMA TRIANGULO", (float) (byte) 0);
        float float12 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: hi!", (float) (short) 100);
        float float16 = pedido0.calculaTaxaDesconto(false, "ESCALENO", 35.0f);
        float float20 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ", 23.0f);
        float float24 = pedido0.calculaTaxaDesconto(false, "NAO FORMA TRIANGULO", 0.0f);
        float float28 = pedido0.calculaTaxaDesconto(false, "EQUILATERO", 47.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10.0f + "'", float12 == 10.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 10.0f + "'", float20 == 10.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.0f + "'", float24 == 0.0f);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 0.0f + "'", float28 == 0.0f);
    }

    @Test
    public void test3749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3749");
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
        java.lang.String str58 = ladoInvalidoException10.toString();
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertNotNull(throwableArray52);
        org.junit.Assert.assertNotNull(throwableArray54);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "codigos.LadoInvalidoException: " + "'", str58, "codigos.LadoInvalidoException: ");
    }

    @Test
    public void test3750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3750");
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
        java.lang.Class<?> wildcardClass61 = ladoInvalidoException6.getClass();
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
    public void test3751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3751");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(99.0f, (float) 'a');
        float float3 = contaCorrente2.getSaldo();
        float float4 = contaCorrente2.getSaldo();
        contaCorrente2.setLimite((float) (short) -1);
        contaCorrente2.setLimite((float) (short) 10);
        float float9 = contaCorrente2.getLimite();
        contaCorrente2.setLimite(2.0f);
        float float12 = contaCorrente2.getSaldo();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 99.0f + "'", float3 == 99.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 99.0f + "'", float4 == 99.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 99.0f + "'", float12 == 99.0f);
    }

    @Test
    public void test3752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3752");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = codigos.Triangulo.classificaTriangulo((-1), (int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type codigos.LadoInvalidoException; message: lado invalido");
        } catch (codigos.LadoInvalidoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3753");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (-1L), 91.0f);
        contaCorrente2.setSaldo((float) (short) 100);
    }

    @Test
    public void test3754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3754");
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
        float float44 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: NAO FORMA TRIANGULO", 67.0f);
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
        org.junit.Assert.assertTrue("'" + float44 + "' != '" + 10.0f + "'", float44 == 10.0f);
    }

    @Test
    public void test3755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3755");
        codigos.Words words0 = new codigos.Words();
        int int2 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int4 = words0.countWords("NAO FORMA TRIANGULO");
        int int6 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int8 = words0.countWords("NAO FORMA TRIANGULO");
        int int10 = words0.countWords("");
        int int12 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        int int14 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        int int16 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        int int18 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
    }

    @Test
    public void test3756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3756");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 0, (float) 10L);
        float float3 = contaCorrente2.getSaldo();
        contaCorrente2.setSaldo(0.0f);
        float float6 = contaCorrente2.getSaldo();
        float float7 = contaCorrente2.getLimite();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
    }

    @Test
    public void test3757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3757");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!", 97.0f);
        float float8 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: hi!", 45.0f);
        float float12 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!", (float) 2);
        float float16 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!", (float) 5);
        float float20 = pedido0.calculaTaxaDesconto(true, "ISOSCELES", 89.0f);
        float float24 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: EQUILATERO", 19.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 10.0f + "'", float20 == 10.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 10.0f + "'", float24 == 10.0f);
    }

    @Test
    public void test3758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3758");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(0.0f, 44.0f);
    }

    @Test
    public void test3759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3759");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(45.0f, 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            float float4 = contaCorrente2.saque((-68.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Valor invalido");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
    }

    @Test
    public void test3760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3760");
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
        codigos.LadoInvalidoException ladoInvalidoException63 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException65 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException67 = new codigos.LadoInvalidoException("");
        ladoInvalidoException65.addSuppressed((java.lang.Throwable) ladoInvalidoException67);
        ladoInvalidoException63.addSuppressed((java.lang.Throwable) ladoInvalidoException67);
        java.lang.Throwable[] throwableArray70 = ladoInvalidoException67.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException72 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException74 = new codigos.LadoInvalidoException("");
        ladoInvalidoException72.addSuppressed((java.lang.Throwable) ladoInvalidoException74);
        codigos.LadoInvalidoException ladoInvalidoException77 = new codigos.LadoInvalidoException("hi!");
        ladoInvalidoException74.addSuppressed((java.lang.Throwable) ladoInvalidoException77);
        ladoInvalidoException67.addSuppressed((java.lang.Throwable) ladoInvalidoException77);
        codigos.LadoInvalidoException ladoInvalidoException81 = new codigos.LadoInvalidoException("codigos.LadoInvalidoException: hi!");
        codigos.LadoInvalidoException ladoInvalidoException83 = new codigos.LadoInvalidoException("hi!");
        ladoInvalidoException81.addSuppressed((java.lang.Throwable) ladoInvalidoException83);
        java.lang.Throwable[] throwableArray85 = ladoInvalidoException83.getSuppressed();
        ladoInvalidoException67.addSuppressed((java.lang.Throwable) ladoInvalidoException83);
        ladoInvalidoException59.addSuppressed((java.lang.Throwable) ladoInvalidoException67);
        java.lang.Throwable[] throwableArray88 = ladoInvalidoException59.getSuppressed();
        java.lang.Throwable[] throwableArray89 = ladoInvalidoException59.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertNotNull(throwableArray53);
        org.junit.Assert.assertNotNull(throwableArray55);
        org.junit.Assert.assertNotNull(throwableArray57);
        org.junit.Assert.assertNotNull(throwableArray60);
        org.junit.Assert.assertNotNull(throwableArray70);
        org.junit.Assert.assertNotNull(throwableArray85);
        org.junit.Assert.assertNotNull(throwableArray88);
        org.junit.Assert.assertNotNull(throwableArray89);
    }

    @Test
    public void test3761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3761");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", 1.0f);
        float float8 = pedido0.calculaTaxaDesconto(false, "NAO FORMA TRIANGULO", 10.0f);
        float float12 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: ", (float) (-1L));
        float float16 = pedido0.calculaTaxaDesconto(false, "NAO FORMA TRIANGULO", (-10.0f));
        float float20 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: ", (float) 100);
        float float24 = pedido0.calculaTaxaDesconto(true, "ISOSCELES", (float) 0);
        float float28 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!", (float) 5);
        float float32 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ", (-66.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 10.0f + "'", float24 == 10.0f);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 10.0f + "'", float28 == 10.0f);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 0.0f + "'", float32 == 0.0f);
    }

    @Test
    public void test3762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3762");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", 1.0f);
        float float8 = pedido0.calculaTaxaDesconto(false, "", (float) 1);
        float float12 = pedido0.calculaTaxaDesconto(false, "hi!", (float) (short) 100);
        float float16 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: hi!", (float) '#');
        float float20 = pedido0.calculaTaxaDesconto(true, "hi!", (float) 100);
        float float24 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: hi!", 0.0f);
        float float28 = pedido0.calculaTaxaDesconto(true, "ESCALENO", 3.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 10.0f + "'", float20 == 10.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.0f + "'", float24 == 0.0f);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 10.0f + "'", float28 == 10.0f);
    }

    @Test
    public void test3763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3763");
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
        java.lang.String str87 = ladoInvalidoException9.toString();
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
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "codigos.LadoInvalidoException: ESCALENO" + "'", str87, "codigos.LadoInvalidoException: ESCALENO");
    }

    @Test
    public void test3764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3764");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 4, (float) 100);
        contaCorrente2.setLimite(4.0f);
        contaCorrente2.setSaldo(1.0f);
    }

    @Test
    public void test3765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3765");
        codigos.Words words0 = new codigos.Words();
        int int2 = words0.countWords("");
        int int4 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!");
        int int6 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        int int8 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        int int10 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!");
        int int12 = words0.countWords("codigos.LadoInvalidoException: EQUILATERO");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test3766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3766");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        float float3 = contaCorrente2.getLimite();
        float float4 = contaCorrente2.getSaldo();
        float float5 = contaCorrente2.getLimite();
        contaCorrente2.setSaldo((-1.0f));
        contaCorrente2.setSaldo(0.0f);
        float float10 = contaCorrente2.getLimite();
        contaCorrente2.setSaldo((float) (byte) -1);
        contaCorrente2.setSaldo((-10.0f));
        contaCorrente2.setSaldo((float) 100L);
        float float17 = contaCorrente2.getSaldo();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-1.0f) + "'", float10 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 100.0f + "'", float17 == 100.0f);
    }

    @Test
    public void test3767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3767");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        float float3 = contaCorrente2.getSaldo();
        contaCorrente2.setSaldo(100.0f);
        contaCorrente2.setLimite(10.0f);
        float float8 = contaCorrente2.getLimite();
        contaCorrente2.setLimite(90.0f);
        // The following exception was thrown during execution in test generation
        try {
            float float12 = contaCorrente2.saque((-45.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Valor invalido");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
    }

    @Test
    public void test3768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3768");
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
        java.lang.Throwable[] throwableArray87 = ladoInvalidoException79.getSuppressed();
        java.lang.Throwable[] throwableArray88 = ladoInvalidoException79.getSuppressed();
        java.lang.Class<?> wildcardClass89 = ladoInvalidoException79.getClass();
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
        org.junit.Assert.assertNotNull(throwableArray88);
        org.junit.Assert.assertNotNull(wildcardClass89);
    }

    @Test
    public void test3769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3769");
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
        float float15 = contaCorrente2.getLimite();
        float float16 = contaCorrente2.getLimite();
        float float17 = contaCorrente2.getLimite();
        float float19 = contaCorrente2.saque(79.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 100.0f + "'", float14 == 100.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10.0f + "'", float15 == 10.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 10.0f + "'", float17 == 10.0f);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 21.0f + "'", float19 == 21.0f);
    }

    @Test
    public void test3770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3770");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) '#', 100.0f);
        contaCorrente2.setLimite((float) (byte) 1);
        float float5 = contaCorrente2.getSaldo();
        float float6 = contaCorrente2.getLimite();
        float float7 = contaCorrente2.getLimite();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 35.0f + "'", float5 == 35.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 1.0f + "'", float7 == 1.0f);
    }

    @Test
    public void test3771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3771");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = codigos.Triangulo.classificaTriangulo((int) (short) 1, (int) (short) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type codigos.LadoInvalidoException; message: lado invalido");
        } catch (codigos.LadoInvalidoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3772");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) '#', 2.0f);
        float float3 = contaCorrente2.getLimite();
        float float4 = contaCorrente2.getLimite();
        float float5 = contaCorrente2.getSaldo();
        float float7 = contaCorrente2.saque((float) 2);
        float float8 = contaCorrente2.getSaldo();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3 == 2.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 2.0f + "'", float4 == 2.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 35.0f + "'", float5 == 35.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 33.0f + "'", float7 == 33.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 33.0f + "'", float8 == 33.0f);
    }

    @Test
    public void test3773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3773");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 1, 100.0f);
        float float4 = contaCorrente2.saque(29.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-28.0f) + "'", float4 == (-28.0f));
    }

    @Test
    public void test3774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3774");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(97.0f, 99.0f);
        float float3 = contaCorrente2.getSaldo();
        contaCorrente2.setLimite(10.0f);
        float float6 = contaCorrente2.getSaldo();
        contaCorrente2.setLimite(88.0f);
        contaCorrente2.setSaldo(96.0f);
        contaCorrente2.setLimite(99.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 97.0f + "'", float6 == 97.0f);
    }

    @Test
    public void test3775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3775");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", (float) (short) -1);
        float float8 = pedido0.calculaTaxaDesconto(true, "NAO FORMA TRIANGULO", (float) (byte) 0);
        float float12 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: hi!", (float) (short) 100);
        float float16 = pedido0.calculaTaxaDesconto(false, "ESCALENO", 89.0f);
        float float20 = pedido0.calculaTaxaDesconto(false, "", 91.0f);
        float float24 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ", (float) (-1));
        float float28 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: hi!", 43.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10.0f + "'", float12 == 10.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.0f + "'", float24 == 0.0f);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 10.0f + "'", float28 == 10.0f);
    }

    @Test
    public void test3776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3776");
        codigos.Words words0 = new codigos.Words();
        int int2 = words0.countWords("");
        int int4 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!");
        int int6 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        int int8 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int10 = words0.countWords("NAO FORMA TRIANGULO");
        int int12 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        int int14 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int16 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
    }

    @Test
    public void test3777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3777");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        contaCorrente2.setLimite((float) 0L);
        float float6 = contaCorrente2.saque((float) 10L);
        float float7 = contaCorrente2.getLimite();
        float float8 = contaCorrente2.getLimite();
        float float9 = contaCorrente2.getLimite();
        contaCorrente2.setLimite(0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 90.0f + "'", float6 == 90.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
    }

    @Test
    public void test3778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3778");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", 1.0f);
        float float8 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: hi!", (float) (short) 10);
        float float12 = pedido0.calculaTaxaDesconto(false, "NAO FORMA TRIANGULO", (-48.0f));
        float float16 = pedido0.calculaTaxaDesconto(false, "ESCALENO", 52.0f);
        float float20 = pedido0.calculaTaxaDesconto(true, "NAO FORMA TRIANGULO", (-48.0f));
        float float24 = pedido0.calculaTaxaDesconto(false, "ISOSCELES", (-90.0f));
        float float28 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: hi!", (float) (short) 100);
        float float32 = pedido0.calculaTaxaDesconto(false, "ISOSCELES", (float) (byte) 10);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 10.0f + "'", float20 == 10.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.0f + "'", float24 == 0.0f);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 10.0f + "'", float28 == 10.0f);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 0.0f + "'", float32 == 0.0f);
    }

    @Test
    public void test3779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3779");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 0, 89.0f);
        float float3 = contaCorrente2.getSaldo();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test3780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3780");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 100L, (float) 10);
        float float3 = contaCorrente2.getSaldo();
        float float4 = contaCorrente2.getLimite();
        contaCorrente2.setLimite(99.0f);
        contaCorrente2.setSaldo(10.0f);
        contaCorrente2.setLimite(99.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
    }

    @Test
    public void test3781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3781");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(32.0f, 0.0f);
        contaCorrente2.setSaldo(16.0f);
    }

    @Test
    public void test3782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3782");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(4.0f, (-9.0f));
        java.lang.Class<?> wildcardClass3 = contaCorrente2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test3783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3783");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = codigos.Triangulo.classificaTriangulo((int) ' ', (-1), 7);
            org.junit.Assert.fail("Expected exception of type codigos.LadoInvalidoException; message: lado invalido");
        } catch (codigos.LadoInvalidoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3784");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 10, 0.0f);
        contaCorrente2.setLimite((-48.0f));
        contaCorrente2.setSaldo(3.0f);
        contaCorrente2.setLimite(55.0f);
        float float9 = contaCorrente2.getLimite();
        java.lang.Class<?> wildcardClass10 = contaCorrente2.getClass();
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 55.0f + "'", float9 == 55.0f);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3785");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        float float3 = contaCorrente2.getLimite();
        float float4 = contaCorrente2.getSaldo();
        float float5 = contaCorrente2.getLimite();
        float float6 = contaCorrente2.getSaldo();
        contaCorrente2.setLimite((float) (byte) 10);
        contaCorrente2.setLimite((float) 100);
        float float11 = contaCorrente2.getSaldo();
        float float12 = contaCorrente2.getLimite();
        contaCorrente2.setSaldo(90.0f);
        java.lang.Class<?> wildcardClass15 = contaCorrente2.getClass();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 100.0f + "'", float11 == 100.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 100.0f + "'", float12 == 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3786");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(97.0f, 99.0f);
        float float3 = contaCorrente2.getSaldo();
        float float4 = contaCorrente2.getSaldo();
        float float5 = contaCorrente2.getLimite();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 97.0f + "'", float4 == 97.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 99.0f + "'", float5 == 99.0f);
    }

    @Test
    public void test3787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3787");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        float float3 = contaCorrente2.getLimite();
        float float4 = contaCorrente2.getLimite();
        contaCorrente2.setSaldo(88.0f);
        float float7 = contaCorrente2.getSaldo();
        contaCorrente2.setLimite(52.0f);
        contaCorrente2.setSaldo(51.0f);
        contaCorrente2.setSaldo((float) '4');
        // The following exception was thrown during execution in test generation
        try {
            float float15 = contaCorrente2.saque((float) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Valor invalido");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.0f) + "'", float4 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 88.0f + "'", float7 == 88.0f);
    }

    @Test
    public void test3788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3788");
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
        codigos.LadoInvalidoException ladoInvalidoException56 = new codigos.LadoInvalidoException("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!");
        ladoInvalidoException47.addSuppressed((java.lang.Throwable) ladoInvalidoException56);
        java.lang.String str58 = ladoInvalidoException56.toString();
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray50);
        org.junit.Assert.assertNotNull(throwableArray52);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!" + "'", str58, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!");
    }

    @Test
    public void test3789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3789");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", 1.0f);
        float float8 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: hi!", (float) (short) 10);
        float float12 = pedido0.calculaTaxaDesconto(true, "NAO FORMA TRIANGULO", (float) 0L);
        float float16 = pedido0.calculaTaxaDesconto(true, "", 1.0f);
        float float20 = pedido0.calculaTaxaDesconto(false, "NAO FORMA TRIANGULO", (float) (-1L));
        float float24 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!", (float) 100);
        float float28 = pedido0.calculaTaxaDesconto(true, "NAO FORMA TRIANGULO", 100.0f);
        float float32 = pedido0.calculaTaxaDesconto(false, "hi!", (-1.0f));
        float float36 = pedido0.calculaTaxaDesconto(false, "NAO FORMA TRIANGULO", 32.0f);
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
    public void test3790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3790");
        codigos.Words words0 = new codigos.Words();
        int int2 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int4 = words0.countWords("NAO FORMA TRIANGULO");
        int int6 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int8 = words0.countWords("NAO FORMA TRIANGULO");
        int int10 = words0.countWords("");
        int int12 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        int int14 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        int int16 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        int int18 = words0.countWords("codigos.LadoInvalidoException: ESCALENO");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test3791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3791");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(67.0f, 0.0f);
        float float4 = contaCorrente2.saque((float) 10);
        contaCorrente2.setLimite((float) 10);
        float float7 = contaCorrente2.getLimite();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 57.0f + "'", float4 == 57.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
    }

    @Test
    public void test3792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3792");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        float float3 = contaCorrente2.getLimite();
        float float4 = contaCorrente2.getSaldo();
        float float5 = contaCorrente2.getSaldo();
        float float6 = contaCorrente2.getLimite();
        contaCorrente2.setSaldo(32.0f);
        contaCorrente2.setSaldo(96.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 100.0f + "'", float5 == 100.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-1.0f) + "'", float6 == (-1.0f));
    }

    @Test
    public void test3793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3793");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(1.0f, 1.0f);
        contaCorrente2.setSaldo((float) 100);
        float float6 = contaCorrente2.saque((float) 100);
        float float7 = contaCorrente2.getLimite();
        contaCorrente2.setSaldo((float) 10);
        contaCorrente2.setLimite(81.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 1.0f + "'", float7 == 1.0f);
    }

    @Test
    public void test3794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3794");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", (float) (short) -1);
        float float8 = pedido0.calculaTaxaDesconto(true, "NAO FORMA TRIANGULO", (float) (byte) 0);
        float float12 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: hi!", (float) (-1L));
        float float16 = pedido0.calculaTaxaDesconto(true, "", (float) (byte) 10);
        float float20 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ", 35.0f);
        float float24 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: NAO FORMA TRIANGULO", (float) (-1L));
        float float28 = pedido0.calculaTaxaDesconto(true, "", 55.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 10.0f + "'", float20 == 10.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.0f + "'", float24 == 0.0f);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 10.0f + "'", float28 == 10.0f);
    }

    @Test
    public void test3795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3795");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) '#', 100.0f);
        contaCorrente2.setLimite((float) (byte) 1);
        java.lang.Class<?> wildcardClass5 = contaCorrente2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3796");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(99.0f, (float) 'a');
        float float3 = contaCorrente2.getLimite();
        contaCorrente2.setSaldo((float) 100);
        float float7 = contaCorrente2.saque(35.0f);
        float float9 = contaCorrente2.saque(56.0f);
        float float10 = contaCorrente2.getLimite();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 65.0f + "'", float7 == 65.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 9.0f + "'", float9 == 9.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 97.0f + "'", float10 == 97.0f);
    }

    @Test
    public void test3797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3797");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(13.0f, (-57.0f));
    }

    @Test
    public void test3798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3798");
        java.lang.String str3 = codigos.Triangulo.classificaTriangulo(7, 3, (int) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "NAO FORMA TRIANGULO" + "'", str3, "NAO FORMA TRIANGULO");
    }

    @Test
    public void test3799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3799");
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
        codigos.LadoInvalidoException ladoInvalidoException45 = new codigos.LadoInvalidoException("");
        ladoInvalidoException43.addSuppressed((java.lang.Throwable) ladoInvalidoException45);
        codigos.LadoInvalidoException ladoInvalidoException48 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException50 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException52 = new codigos.LadoInvalidoException("");
        ladoInvalidoException50.addSuppressed((java.lang.Throwable) ladoInvalidoException52);
        ladoInvalidoException48.addSuppressed((java.lang.Throwable) ladoInvalidoException52);
        java.lang.Throwable[] throwableArray55 = ladoInvalidoException52.getSuppressed();
        ladoInvalidoException45.addSuppressed((java.lang.Throwable) ladoInvalidoException52);
        ladoInvalidoException38.addSuppressed((java.lang.Throwable) ladoInvalidoException52);
        codigos.LadoInvalidoException ladoInvalidoException59 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException61 = new codigos.LadoInvalidoException("");
        ladoInvalidoException59.addSuppressed((java.lang.Throwable) ladoInvalidoException61);
        codigos.LadoInvalidoException ladoInvalidoException64 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException66 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException68 = new codigos.LadoInvalidoException("");
        ladoInvalidoException66.addSuppressed((java.lang.Throwable) ladoInvalidoException68);
        ladoInvalidoException64.addSuppressed((java.lang.Throwable) ladoInvalidoException68);
        java.lang.Throwable[] throwableArray71 = ladoInvalidoException68.getSuppressed();
        ladoInvalidoException61.addSuppressed((java.lang.Throwable) ladoInvalidoException68);
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
        ladoInvalidoException68.addSuppressed((java.lang.Throwable) ladoInvalidoException83);
        codigos.LadoInvalidoException ladoInvalidoException91 = new codigos.LadoInvalidoException("codigos.LadoInvalidoException: hi!");
        ladoInvalidoException83.addSuppressed((java.lang.Throwable) ladoInvalidoException91);
        ladoInvalidoException52.addSuppressed((java.lang.Throwable) ladoInvalidoException83);
        java.lang.Throwable[] throwableArray94 = ladoInvalidoException83.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray41);
        org.junit.Assert.assertNotNull(throwableArray55);
        org.junit.Assert.assertNotNull(throwableArray71);
        org.junit.Assert.assertNotNull(throwableArray86);
        org.junit.Assert.assertNotNull(throwableArray88);
        org.junit.Assert.assertNotNull(throwableArray94);
    }

    @Test
    public void test3800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3800");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((-25.0f), 21.0f);
    }

    @Test
    public void test3801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3801");
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
        codigos.LadoInvalidoException ladoInvalidoException35 = new codigos.LadoInvalidoException("hi!");
        ladoInvalidoException33.addSuppressed((java.lang.Throwable) ladoInvalidoException35);
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
        ladoInvalidoException47.addSuppressed((java.lang.Throwable) ladoInvalidoException62);
        codigos.LadoInvalidoException ladoInvalidoException70 = new codigos.LadoInvalidoException("codigos.LadoInvalidoException: hi!");
        ladoInvalidoException62.addSuppressed((java.lang.Throwable) ladoInvalidoException70);
        ladoInvalidoException35.addSuppressed((java.lang.Throwable) ladoInvalidoException70);
        java.lang.Throwable[] throwableArray73 = ladoInvalidoException70.getSuppressed();
        ladoInvalidoException25.addSuppressed((java.lang.Throwable) ladoInvalidoException70);
        java.lang.Throwable[] throwableArray75 = ladoInvalidoException25.getSuppressed();
        java.lang.Throwable[] throwableArray76 = ladoInvalidoException25.getSuppressed();
        java.lang.Throwable[] throwableArray77 = ladoInvalidoException25.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray50);
        org.junit.Assert.assertNotNull(throwableArray65);
        org.junit.Assert.assertNotNull(throwableArray67);
        org.junit.Assert.assertNotNull(throwableArray73);
        org.junit.Assert.assertNotNull(throwableArray75);
        org.junit.Assert.assertNotNull(throwableArray76);
        org.junit.Assert.assertNotNull(throwableArray77);
    }

    @Test
    public void test3802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3802");
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
        codigos.LadoInvalidoException ladoInvalidoException20 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException22 = new codigos.LadoInvalidoException("");
        ladoInvalidoException20.addSuppressed((java.lang.Throwable) ladoInvalidoException22);
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
        ladoInvalidoException22.addSuppressed((java.lang.Throwable) ladoInvalidoException34);
        java.lang.Throwable[] throwableArray41 = ladoInvalidoException34.getSuppressed();
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
        ladoInvalidoException34.addSuppressed((java.lang.Throwable) ladoInvalidoException52);
        codigos.LadoInvalidoException ladoInvalidoException60 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException62 = new codigos.LadoInvalidoException("");
        ladoInvalidoException60.addSuppressed((java.lang.Throwable) ladoInvalidoException62);
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
        ladoInvalidoException62.addSuppressed((java.lang.Throwable) ladoInvalidoException74);
        ladoInvalidoException34.addSuppressed((java.lang.Throwable) ladoInvalidoException74);
        java.lang.Throwable[] throwableArray82 = ladoInvalidoException34.getSuppressed();
        ladoInvalidoException12.addSuppressed((java.lang.Throwable) ladoInvalidoException34);
        java.lang.String str84 = ladoInvalidoException34.toString();
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertNotNull(throwableArray41);
        org.junit.Assert.assertNotNull(throwableArray55);
        org.junit.Assert.assertNotNull(throwableArray57);
        org.junit.Assert.assertNotNull(throwableArray77);
        org.junit.Assert.assertNotNull(throwableArray79);
        org.junit.Assert.assertNotNull(throwableArray82);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "codigos.LadoInvalidoException: " + "'", str84, "codigos.LadoInvalidoException: ");
    }

    @Test
    public void test3803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3803");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", (float) (short) -1);
        float float8 = pedido0.calculaTaxaDesconto(true, "", (float) 2);
        float float12 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: ESCALENO", 90.0f);
        float float16 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!", 81.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
    }

    @Test
    public void test3804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3804");
        codigos.Words words0 = new codigos.Words();
        int int2 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int4 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int6 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        int int8 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        int int10 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
    }

    @Test
    public void test3805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3805");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = codigos.Triangulo.classificaTriangulo(0, 7, (-1));
            org.junit.Assert.fail("Expected exception of type codigos.LadoInvalidoException; message: lado invalido");
        } catch (codigos.LadoInvalidoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3806");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((-9.0f), 37.0f);
    }

    @Test
    public void test3807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3807");
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
        int int24 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!");
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
    }

    @Test
    public void test3808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3808");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (short) 10, (float) ' ');
        contaCorrente2.setLimite((float) (byte) 0);
        float float5 = contaCorrente2.getSaldo();
        contaCorrente2.setSaldo((float) 1);
        float float8 = contaCorrente2.getSaldo();
        float float9 = contaCorrente2.getLimite();
        // The following exception was thrown during execution in test generation
        try {
            float float11 = contaCorrente2.saque((float) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Saldo Insuficiente");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10.0f + "'", float5 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
    }

    @Test
    public void test3809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3809");
        codigos.Words words0 = new codigos.Words();
        int int2 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int4 = words0.countWords("NAO FORMA TRIANGULO");
        int int6 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int8 = words0.countWords("hi!");
        int int10 = words0.countWords("hi!");
        int int12 = words0.countWords("NAO FORMA TRIANGULO");
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
    public void test3810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3810");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", 1.0f);
        float float8 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: hi!", (float) (short) 10);
        float float12 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: hi!", (float) 2);
        float float16 = pedido0.calculaTaxaDesconto(false, "hi!", 88.0f);
        float float20 = pedido0.calculaTaxaDesconto(false, "hi!", (float) (byte) -1);
        float float24 = pedido0.calculaTaxaDesconto(false, "", 0.0f);
        float float28 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ", (float) 100L);
        float float32 = pedido0.calculaTaxaDesconto(false, "", (float) 1);
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
    public void test3811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3811");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(90.0f, (float) (-1));
        contaCorrente2.setLimite((float) 0);
        float float5 = contaCorrente2.getSaldo();
        contaCorrente2.setLimite(67.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 90.0f + "'", float5 == 90.0f);
    }

    @Test
    public void test3812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3812");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", 1.0f);
        float float8 = pedido0.calculaTaxaDesconto(false, "", (float) 1);
        float float12 = pedido0.calculaTaxaDesconto(false, "hi!", (float) (short) 100);
        float float16 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: hi!", (float) '#');
        float float20 = pedido0.calculaTaxaDesconto(true, "hi!", (float) 100);
        float float24 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: hi!", 0.0f);
        float float28 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ", 97.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 10.0f + "'", float20 == 10.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.0f + "'", float24 == 0.0f);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 10.0f + "'", float28 == 10.0f);
    }

    @Test
    public void test3813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3813");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) '#', 2.0f);
        float float3 = contaCorrente2.getLimite();
        float float4 = contaCorrente2.getLimite();
        float float5 = contaCorrente2.getLimite();
        float float6 = contaCorrente2.getSaldo();
        java.lang.Class<?> wildcardClass7 = contaCorrente2.getClass();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3 == 2.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 2.0f + "'", float4 == 2.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 2.0f + "'", float5 == 2.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 35.0f + "'", float6 == 35.0f);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3814");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((-48.0f), 99.0f);
        float float4 = contaCorrente2.saque(22.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-70.0f) + "'", float4 == (-70.0f));
    }

    @Test
    public void test3815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3815");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (short) 100, 99.0f);
        contaCorrente2.setSaldo((float) 10);
        contaCorrente2.setLimite(97.0f);
        float float7 = contaCorrente2.getLimite();
        contaCorrente2.setLimite((float) 100);
        contaCorrente2.setSaldo((float) (-1));
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 97.0f + "'", float7 == 97.0f);
    }

    @Test
    public void test3816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3816");
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
        float float40 = pedido0.calculaTaxaDesconto(false, "EQUILATERO", 0.0f);
        float float44 = pedido0.calculaTaxaDesconto(false, "EQUILATERO", 1.0f);
        java.lang.Class<?> wildcardClass45 = pedido0.getClass();
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
        org.junit.Assert.assertTrue("'" + float44 + "' != '" + 0.0f + "'", float44 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test3817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3817");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(99.0f, (float) 'a');
        float float3 = contaCorrente2.getSaldo();
        float float4 = contaCorrente2.getSaldo();
        contaCorrente2.setLimite((float) (short) -1);
        contaCorrente2.setLimite((float) (short) 10);
        float float9 = contaCorrente2.getLimite();
        contaCorrente2.setSaldo(21.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 99.0f + "'", float3 == 99.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 99.0f + "'", float4 == 99.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
    }

    @Test
    public void test3818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3818");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(55.0f, (-56.0f));
        contaCorrente2.setLimite(88.0f);
    }

    @Test
    public void test3819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3819");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((-57.0f), 47.0f);
    }

    @Test
    public void test3820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3820");
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
        java.lang.Throwable[] throwableArray94 = ladoInvalidoException6.getSuppressed();
        java.lang.Throwable[] throwableArray95 = ladoInvalidoException6.getSuppressed();
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
        org.junit.Assert.assertNotNull(throwableArray94);
        org.junit.Assert.assertNotNull(throwableArray95);
    }

    @Test
    public void test3821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3821");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (short) -1, (-41.0f));
        float float3 = contaCorrente2.getLimite();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-41.0f) + "'", float3 == (-41.0f));
    }

    @Test
    public void test3822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3822");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        float float3 = contaCorrente2.getLimite();
        float float4 = contaCorrente2.getSaldo();
        float float5 = contaCorrente2.getLimite();
        float float6 = contaCorrente2.getSaldo();
        contaCorrente2.setLimite((float) (byte) 10);
        contaCorrente2.setSaldo((float) 100L);
        float float11 = contaCorrente2.getLimite();
        contaCorrente2.setLimite((float) (short) 10);
        contaCorrente2.setSaldo((float) 2);
        float float16 = contaCorrente2.getLimite();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
    }

    @Test
    public void test3823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3823");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 100L, (float) 10);
        float float3 = contaCorrente2.getSaldo();
        float float4 = contaCorrente2.getLimite();
        float float6 = contaCorrente2.saque((float) 1L);
        contaCorrente2.setLimite((float) 1);
        float float10 = contaCorrente2.saque((float) (byte) 10);
        float float11 = contaCorrente2.getLimite();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 99.0f + "'", float6 == 99.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 89.0f + "'", float10 == 89.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
    }

    @Test
    public void test3824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3824");
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
        int int20 = words0.countWords("NAO FORMA TRIANGULO");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test3825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3825");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(47.0f, 52.0f);
    }

    @Test
    public void test3826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3826");
        codigos.Words words0 = new codigos.Words();
        int int2 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int4 = words0.countWords("NAO FORMA TRIANGULO");
        int int6 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int8 = words0.countWords("NAO FORMA TRIANGULO");
        int int10 = words0.countWords("");
        int int12 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        int int14 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        int int16 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        int int18 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
    }

    @Test
    public void test3827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3827");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(0.0f, (-56.0f));
        float float3 = contaCorrente2.getLimite();
        java.lang.Class<?> wildcardClass4 = contaCorrente2.getClass();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-56.0f) + "'", float3 == (-56.0f));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3828");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(68.0f, 91.0f);
        contaCorrente2.setLimite(22.0f);
    }

    @Test
    public void test3829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3829");
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
        java.lang.Throwable[] throwableArray38 = ladoInvalidoException23.getSuppressed();
        java.lang.Throwable[] throwableArray39 = ladoInvalidoException23.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException41 = new codigos.LadoInvalidoException("EQUILATERO");
        ladoInvalidoException23.addSuppressed((java.lang.Throwable) ladoInvalidoException41);
        java.lang.Throwable[] throwableArray43 = ladoInvalidoException41.getSuppressed();
        java.lang.Throwable[] throwableArray44 = ladoInvalidoException41.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException46 = new codigos.LadoInvalidoException("");
        java.lang.Throwable[] throwableArray47 = ladoInvalidoException46.getSuppressed();
        java.lang.Throwable[] throwableArray48 = ladoInvalidoException46.getSuppressed();
        java.lang.Throwable[] throwableArray49 = ladoInvalidoException46.getSuppressed();
        ladoInvalidoException41.addSuppressed((java.lang.Throwable) ladoInvalidoException46);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertNotNull(throwableArray47);
        org.junit.Assert.assertNotNull(throwableArray48);
        org.junit.Assert.assertNotNull(throwableArray49);
    }

    @Test
    public void test3830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3830");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(27.0f, 31.0f);
        contaCorrente2.setSaldo(78.0f);
    }

    @Test
    public void test3831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3831");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 10, 0.0f);
        contaCorrente2.setSaldo((float) (byte) 0);
        float float5 = contaCorrente2.getSaldo();
        contaCorrente2.setSaldo((float) 0);
        contaCorrente2.setSaldo((float) 0L);
        contaCorrente2.setLimite(98.0f);
        contaCorrente2.setLimite(48.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
    }

    @Test
    public void test3832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3832");
        java.lang.String str3 = codigos.Triangulo.classificaTriangulo((int) (byte) 100, 3, 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "NAO FORMA TRIANGULO" + "'", str3, "NAO FORMA TRIANGULO");
    }

    @Test
    public void test3833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3833");
        java.lang.String str3 = codigos.Triangulo.classificaTriangulo(1, (int) (byte) 100, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "NAO FORMA TRIANGULO" + "'", str3, "NAO FORMA TRIANGULO");
    }

    @Test
    public void test3834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3834");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 10, 0.0f);
        contaCorrente2.setSaldo((float) (byte) 0);
        float float5 = contaCorrente2.getSaldo();
        contaCorrente2.setLimite((float) (byte) 1);
        float float8 = contaCorrente2.getSaldo();
        contaCorrente2.setSaldo(10.0f);
        contaCorrente2.setLimite(1.0f);
        contaCorrente2.setLimite((float) 0);
        float float15 = contaCorrente2.getSaldo();
        float float17 = contaCorrente2.saque((float) 6);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10.0f + "'", float15 == 10.0f);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 4.0f + "'", float17 == 4.0f);
    }

    @Test
    public void test3835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3835");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(99.0f, (float) 'a');
        float float3 = contaCorrente2.getSaldo();
        float float4 = contaCorrente2.getSaldo();
        contaCorrente2.setLimite((float) (short) -1);
        contaCorrente2.setLimite((float) (short) 10);
        float float9 = contaCorrente2.getSaldo();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 99.0f + "'", float3 == 99.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 99.0f + "'", float4 == 99.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 99.0f + "'", float9 == 99.0f);
    }

    @Test
    public void test3836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3836");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(32.0f, (float) (byte) 0);
        contaCorrente2.setSaldo((-48.0f));
        contaCorrente2.setSaldo((float) (short) -1);
        contaCorrente2.setSaldo(57.0f);
    }

    @Test
    public void test3837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3837");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 100L, (float) 10);
        float float4 = contaCorrente2.saque((float) 100L);
        contaCorrente2.setLimite((float) (short) 100);
        contaCorrente2.setSaldo((float) 100);
        float float9 = contaCorrente2.getLimite();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 100.0f + "'", float9 == 100.0f);
    }

    @Test
    public void test3838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3838");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = codigos.Triangulo.classificaTriangulo((int) ' ', 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type codigos.LadoInvalidoException; message: lado invalido");
        } catch (codigos.LadoInvalidoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3839");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((-48.0f), (-50.0f));
    }

    @Test
    public void test3840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3840");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(0.0f, 42.0f);
        contaCorrente2.setSaldo((float) 1);
        float float5 = contaCorrente2.getSaldo();
        contaCorrente2.setLimite(32.0f);
        float float8 = contaCorrente2.getLimite();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 32.0f + "'", float8 == 32.0f);
    }

    @Test
    public void test3841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3841");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", 1.0f);
        float float8 = pedido0.calculaTaxaDesconto(false, "", (float) 1);
        float float12 = pedido0.calculaTaxaDesconto(false, "hi!", (float) (short) 100);
        float float16 = pedido0.calculaTaxaDesconto(true, "", (float) ' ');
        float float20 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: ", (float) 100);
        float float24 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: hi!", (float) (byte) -1);
        float float28 = pedido0.calculaTaxaDesconto(false, "", 84.0f);
        java.lang.Class<?> wildcardClass29 = pedido0.getClass();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 10.0f + "'", float24 == 10.0f);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 0.0f + "'", float28 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test3842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3842");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (short) 100, 55.0f);
        float float3 = contaCorrente2.getLimite();
        float float4 = contaCorrente2.getLimite();
        float float5 = contaCorrente2.getSaldo();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 55.0f + "'", float3 == 55.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 55.0f + "'", float4 == 55.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 100.0f + "'", float5 == 100.0f);
    }

    @Test
    public void test3843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3843");
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
        codigos.LadoInvalidoException ladoInvalidoException35 = new codigos.LadoInvalidoException("hi!");
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
        ladoInvalidoException35.addSuppressed((java.lang.Throwable) ladoInvalidoException46);
        codigos.LadoInvalidoException ladoInvalidoException53 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException55 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException57 = new codigos.LadoInvalidoException("");
        ladoInvalidoException55.addSuppressed((java.lang.Throwable) ladoInvalidoException57);
        ladoInvalidoException53.addSuppressed((java.lang.Throwable) ladoInvalidoException57);
        java.lang.Throwable[] throwableArray60 = ladoInvalidoException57.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException62 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException64 = new codigos.LadoInvalidoException("");
        ladoInvalidoException62.addSuppressed((java.lang.Throwable) ladoInvalidoException64);
        codigos.LadoInvalidoException ladoInvalidoException67 = new codigos.LadoInvalidoException("hi!");
        ladoInvalidoException64.addSuppressed((java.lang.Throwable) ladoInvalidoException67);
        ladoInvalidoException57.addSuppressed((java.lang.Throwable) ladoInvalidoException67);
        java.lang.Throwable[] throwableArray70 = ladoInvalidoException57.getSuppressed();
        ladoInvalidoException35.addSuppressed((java.lang.Throwable) ladoInvalidoException57);
        java.lang.Throwable[] throwableArray72 = ladoInvalidoException35.getSuppressed();
        java.lang.Throwable[] throwableArray73 = ladoInvalidoException35.getSuppressed();
        ladoInvalidoException28.addSuppressed((java.lang.Throwable) ladoInvalidoException35);
        java.lang.Throwable[] throwableArray75 = ladoInvalidoException28.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray49);
        org.junit.Assert.assertNotNull(throwableArray60);
        org.junit.Assert.assertNotNull(throwableArray70);
        org.junit.Assert.assertNotNull(throwableArray72);
        org.junit.Assert.assertNotNull(throwableArray73);
        org.junit.Assert.assertNotNull(throwableArray75);
    }

    @Test
    public void test3844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3844");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (short) 100, 51.0f);
        contaCorrente2.setSaldo(89.0f);
        contaCorrente2.setSaldo(91.0f);
    }

    @Test
    public void test3845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3845");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) '#', (float) (short) 10);
        contaCorrente2.setSaldo((float) (short) 100);
        float float6 = contaCorrente2.saque((float) (byte) 10);
        contaCorrente2.setLimite((-58.0f));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 90.0f + "'", float6 == 90.0f);
    }

    @Test
    public void test3846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3846");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        float float3 = contaCorrente2.getLimite();
        float float4 = contaCorrente2.getSaldo();
        float float5 = contaCorrente2.getLimite();
        float float6 = contaCorrente2.getSaldo();
        contaCorrente2.setLimite((float) (byte) 10);
        contaCorrente2.setSaldo((float) 100L);
        contaCorrente2.setLimite(100.0f);
        float float13 = contaCorrente2.getLimite();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 100.0f + "'", float13 == 100.0f);
    }

    @Test
    public void test3847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3847");
        java.lang.String str3 = codigos.Triangulo.classificaTriangulo(3, (int) (short) 1, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "NAO FORMA TRIANGULO" + "'", str3, "NAO FORMA TRIANGULO");
    }

    @Test
    public void test3848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3848");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        float float3 = contaCorrente2.getSaldo();
        contaCorrente2.setSaldo(100.0f);
        float float6 = contaCorrente2.getLimite();
        contaCorrente2.setLimite(99.0f);
        float float9 = contaCorrente2.getLimite();
        float float10 = contaCorrente2.getLimite();
        contaCorrente2.setSaldo((-46.0f));
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-1.0f) + "'", float6 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 99.0f + "'", float9 == 99.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 99.0f + "'", float10 == 99.0f);
    }

    @Test
    public void test3849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3849");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((-10.0f), (float) (byte) -1);
        float float3 = contaCorrente2.getLimite();
        float float4 = contaCorrente2.getSaldo();
        contaCorrente2.setSaldo((float) (short) 0);
        float float7 = contaCorrente2.getSaldo();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-10.0f) + "'", float4 == (-10.0f));
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
    }

    @Test
    public void test3850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3850");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 0, (float) ' ');
        contaCorrente2.setSaldo((float) (short) 10);
        float float5 = contaCorrente2.getSaldo();
        float float7 = contaCorrente2.saque((float) 6);
        float float8 = contaCorrente2.getSaldo();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10.0f + "'", float5 == 10.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 4.0f + "'", float7 == 4.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 4.0f + "'", float8 == 4.0f);
    }

    @Test
    public void test3851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3851");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 'a', (float) (-1L));
        float float4 = contaCorrente2.saque((float) '4');
        float float6 = contaCorrente2.saque((float) (short) 1);
        float float8 = contaCorrente2.saque(5.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 45.0f + "'", float4 == 45.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 44.0f + "'", float6 == 44.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 39.0f + "'", float8 == 39.0f);
    }

    @Test
    public void test3852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3852");
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
        int int22 = words0.countWords("ESCALENO");
        int int24 = words0.countWords("NAO FORMA TRIANGULO");
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test3853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3853");
        codigos.LadoInvalidoException ladoInvalidoException1 = new codigos.LadoInvalidoException("NAO FORMA TRIANGULO");
        java.lang.Throwable[] throwableArray2 = ladoInvalidoException1.getSuppressed();
        java.lang.Throwable[] throwableArray3 = ladoInvalidoException1.getSuppressed();
        java.lang.String str4 = ladoInvalidoException1.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "codigos.LadoInvalidoException: NAO FORMA TRIANGULO" + "'", str4, "codigos.LadoInvalidoException: NAO FORMA TRIANGULO");
    }

    @Test
    public void test3854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3854");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        float float3 = contaCorrente2.getSaldo();
        contaCorrente2.setSaldo(100.0f);
        contaCorrente2.setLimite(0.0f);
        float float8 = contaCorrente2.getSaldo();
        float float10 = contaCorrente2.saque((float) (byte) 1);
        java.lang.Class<?> wildcardClass11 = contaCorrente2.getClass();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 99.0f + "'", float10 == 99.0f);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3855");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (short) 0, 0.0f);
        contaCorrente2.setSaldo((float) 0L);
        contaCorrente2.setLimite(91.0f);
        contaCorrente2.setSaldo(35.0f);
        float float9 = contaCorrente2.getLimite();
        java.lang.Class<?> wildcardClass10 = contaCorrente2.getClass();
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 91.0f + "'", float9 == 91.0f);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3856");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((-10.0f), (float) (short) 10);
        contaCorrente2.setSaldo(0.0f);
        contaCorrente2.setLimite((-66.0f));
    }

    @Test
    public void test3857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3857");
        java.lang.String str3 = codigos.Triangulo.classificaTriangulo(10, (int) '4', 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "NAO FORMA TRIANGULO" + "'", str3, "NAO FORMA TRIANGULO");
    }

    @Test
    public void test3858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3858");
        codigos.LadoInvalidoException ladoInvalidoException1 = new codigos.LadoInvalidoException("ESCALENO");
        java.lang.Throwable[] throwableArray2 = ladoInvalidoException1.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException4 = new codigos.LadoInvalidoException("");
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException4);
        java.lang.Throwable[] throwableArray6 = ladoInvalidoException4.getSuppressed();
        java.lang.Throwable[] throwableArray7 = ladoInvalidoException4.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException9 = new codigos.LadoInvalidoException("codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        java.lang.Throwable[] throwableArray10 = ladoInvalidoException9.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException12 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException14 = new codigos.LadoInvalidoException("");
        ladoInvalidoException12.addSuppressed((java.lang.Throwable) ladoInvalidoException14);
        codigos.LadoInvalidoException ladoInvalidoException17 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException19 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException21 = new codigos.LadoInvalidoException("");
        ladoInvalidoException19.addSuppressed((java.lang.Throwable) ladoInvalidoException21);
        ladoInvalidoException17.addSuppressed((java.lang.Throwable) ladoInvalidoException21);
        java.lang.Throwable[] throwableArray24 = ladoInvalidoException21.getSuppressed();
        ladoInvalidoException14.addSuppressed((java.lang.Throwable) ladoInvalidoException21);
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
        ladoInvalidoException21.addSuppressed((java.lang.Throwable) ladoInvalidoException36);
        codigos.LadoInvalidoException ladoInvalidoException44 = new codigos.LadoInvalidoException("codigos.LadoInvalidoException: hi!");
        ladoInvalidoException36.addSuppressed((java.lang.Throwable) ladoInvalidoException44);
        java.lang.Throwable[] throwableArray46 = ladoInvalidoException44.getSuppressed();
        ladoInvalidoException9.addSuppressed((java.lang.Throwable) ladoInvalidoException44);
        codigos.LadoInvalidoException ladoInvalidoException49 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException51 = new codigos.LadoInvalidoException("");
        ladoInvalidoException49.addSuppressed((java.lang.Throwable) ladoInvalidoException51);
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
        ladoInvalidoException51.addSuppressed((java.lang.Throwable) ladoInvalidoException63);
        java.lang.Throwable[] throwableArray70 = ladoInvalidoException63.getSuppressed();
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
        ladoInvalidoException63.addSuppressed((java.lang.Throwable) ladoInvalidoException81);
        java.lang.Throwable[] throwableArray88 = ladoInvalidoException81.getSuppressed();
        ladoInvalidoException9.addSuppressed((java.lang.Throwable) ladoInvalidoException81);
        ladoInvalidoException4.addSuppressed((java.lang.Throwable) ladoInvalidoException81);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertNotNull(throwableArray41);
        org.junit.Assert.assertNotNull(throwableArray46);
        org.junit.Assert.assertNotNull(throwableArray66);
        org.junit.Assert.assertNotNull(throwableArray68);
        org.junit.Assert.assertNotNull(throwableArray70);
        org.junit.Assert.assertNotNull(throwableArray84);
        org.junit.Assert.assertNotNull(throwableArray86);
        org.junit.Assert.assertNotNull(throwableArray88);
    }

    @Test
    public void test3859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3859");
        java.lang.String str3 = codigos.Triangulo.classificaTriangulo((int) (byte) 100, (int) 'a', 6);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ESCALENO" + "'", str3, "ESCALENO");
    }

    @Test
    public void test3860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3860");
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
        java.lang.Throwable[] throwableArray18 = ladoInvalidoException15.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException20 = new codigos.LadoInvalidoException("codigos.LadoInvalidoException: ");
        java.lang.Throwable[] throwableArray21 = ladoInvalidoException20.getSuppressed();
        ladoInvalidoException15.addSuppressed((java.lang.Throwable) ladoInvalidoException20);
        java.lang.String str23 = ladoInvalidoException20.toString();
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "codigos.LadoInvalidoException: codigos.LadoInvalidoException: " + "'", str23, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
    }

    @Test
    public void test3861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3861");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(99.0f, (float) 'a');
        float float3 = contaCorrente2.getLimite();
        float float4 = contaCorrente2.getLimite();
        contaCorrente2.setSaldo((-1.0f));
        java.lang.Class<?> wildcardClass7 = contaCorrente2.getClass();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 97.0f + "'", float4 == 97.0f);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3862");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 'a', (-57.0f));
    }

    @Test
    public void test3863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3863");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 'a', (float) 10);
        float float4 = contaCorrente2.saque((float) 1);
        contaCorrente2.setLimite((float) 'a');
        float float7 = contaCorrente2.getSaldo();
        contaCorrente2.setLimite(35.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 96.0f + "'", float4 == 96.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 96.0f + "'", float7 == 96.0f);
    }

    @Test
    public void test3864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3864");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        float float3 = contaCorrente2.getSaldo();
        contaCorrente2.setSaldo(100.0f);
        contaCorrente2.setLimite(0.0f);
        float float8 = contaCorrente2.getSaldo();
        contaCorrente2.setSaldo((float) 10);
        contaCorrente2.setLimite((-87.0f));
        contaCorrente2.setLimite((float) (byte) 1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
    }

    @Test
    public void test3865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3865");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (short) 10, (float) ' ');
        contaCorrente2.setLimite((float) (byte) 0);
        float float5 = contaCorrente2.getSaldo();
        contaCorrente2.setSaldo((float) 1);
        float float8 = contaCorrente2.getLimite();
        contaCorrente2.setLimite((float) 0);
        contaCorrente2.setSaldo(45.0f);
        float float13 = contaCorrente2.getSaldo();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10.0f + "'", float5 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 45.0f + "'", float13 == 45.0f);
    }

    @Test
    public void test3866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3866");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 0L, (float) (short) 100);
        contaCorrente2.setLimite(88.0f);
        float float5 = contaCorrente2.getLimite();
        float float6 = contaCorrente2.getSaldo();
        float float8 = contaCorrente2.saque(79.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 88.0f + "'", float5 == 88.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-79.0f) + "'", float8 == (-79.0f));
    }

    @Test
    public void test3867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3867");
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
        int int22 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
    }

    @Test
    public void test3868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3868");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = codigos.Triangulo.classificaTriangulo((int) (byte) 1, (int) (short) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type codigos.LadoInvalidoException; message: lado invalido");
        } catch (codigos.LadoInvalidoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3869");
        codigos.LadoInvalidoException ladoInvalidoException1 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException3 = new codigos.LadoInvalidoException("");
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException3);
        codigos.LadoInvalidoException ladoInvalidoException6 = new codigos.LadoInvalidoException("hi!");
        ladoInvalidoException3.addSuppressed((java.lang.Throwable) ladoInvalidoException6);
        java.lang.Throwable[] throwableArray8 = ladoInvalidoException6.getSuppressed();
        java.lang.Throwable[] throwableArray9 = ladoInvalidoException6.getSuppressed();
        java.lang.Throwable[] throwableArray10 = ladoInvalidoException6.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException12 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException14 = new codigos.LadoInvalidoException("");
        ladoInvalidoException12.addSuppressed((java.lang.Throwable) ladoInvalidoException14);
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
        ladoInvalidoException14.addSuppressed((java.lang.Throwable) ladoInvalidoException19);
        java.lang.Throwable[] throwableArray32 = ladoInvalidoException14.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException34 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException36 = new codigos.LadoInvalidoException("");
        ladoInvalidoException34.addSuppressed((java.lang.Throwable) ladoInvalidoException36);
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
        ladoInvalidoException36.addSuppressed((java.lang.Throwable) ladoInvalidoException48);
        java.lang.Throwable[] throwableArray55 = ladoInvalidoException48.getSuppressed();
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
        ladoInvalidoException48.addSuppressed((java.lang.Throwable) ladoInvalidoException61);
        ladoInvalidoException14.addSuppressed((java.lang.Throwable) ladoInvalidoException61);
        ladoInvalidoException6.addSuppressed((java.lang.Throwable) ladoInvalidoException61);
        java.lang.Throwable[] throwableArray78 = ladoInvalidoException6.getSuppressed();
        java.lang.String str79 = ladoInvalidoException6.toString();
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNotNull(throwableArray51);
        org.junit.Assert.assertNotNull(throwableArray53);
        org.junit.Assert.assertNotNull(throwableArray55);
        org.junit.Assert.assertNotNull(throwableArray64);
        org.junit.Assert.assertNotNull(throwableArray73);
        org.junit.Assert.assertNotNull(throwableArray78);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "codigos.LadoInvalidoException: hi!" + "'", str79, "codigos.LadoInvalidoException: hi!");
    }

    @Test
    public void test3870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3870");
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
        // The following exception was thrown during execution in test generation
        try {
            float float23 = contaCorrente2.saque((-32.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Valor invalido");
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
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 8.0f + "'", float21 == 8.0f);
    }

    @Test
    public void test3871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3871");
        codigos.Words words0 = new codigos.Words();
        int int2 = words0.countWords("");
        int int4 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!");
        int int6 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        int int8 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int10 = words0.countWords("NAO FORMA TRIANGULO");
        int int12 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        int int14 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        int int16 = words0.countWords("codigos.LadoInvalidoException: NAO FORMA TRIANGULO");
        int int18 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        int int20 = words0.countWords("EQUILATERO");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test3872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3872");
        codigos.Words words0 = new codigos.Words();
        int int2 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int4 = words0.countWords("NAO FORMA TRIANGULO");
        int int6 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int8 = words0.countWords("hi!");
        int int10 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int12 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 7 + "'", int12 == 7);
    }

    @Test
    public void test3873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3873");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 1L, (float) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            float float4 = contaCorrente2.saque((-25.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Valor invalido");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
    }

    @Test
    public void test3874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3874");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((-32.0f), 31.0f);
        contaCorrente2.setLimite((float) 100);
        // The following exception was thrown during execution in test generation
        try {
            float float6 = contaCorrente2.saque((-32.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Valor invalido");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
    }

    @Test
    public void test3875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3875");
        codigos.LadoInvalidoException ladoInvalidoException1 = new codigos.LadoInvalidoException("codigos.LadoInvalidoException: hi!");
        codigos.LadoInvalidoException ladoInvalidoException3 = new codigos.LadoInvalidoException("hi!");
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException3);
        codigos.LadoInvalidoException ladoInvalidoException6 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException8 = new codigos.LadoInvalidoException("");
        ladoInvalidoException6.addSuppressed((java.lang.Throwable) ladoInvalidoException8);
        codigos.LadoInvalidoException ladoInvalidoException11 = new codigos.LadoInvalidoException("hi!");
        ladoInvalidoException8.addSuppressed((java.lang.Throwable) ladoInvalidoException11);
        java.lang.Throwable[] throwableArray13 = ladoInvalidoException8.getSuppressed();
        java.lang.Throwable[] throwableArray14 = ladoInvalidoException8.getSuppressed();
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
        codigos.LadoInvalidoException ladoInvalidoException32 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException34 = new codigos.LadoInvalidoException("");
        ladoInvalidoException32.addSuppressed((java.lang.Throwable) ladoInvalidoException34);
        codigos.LadoInvalidoException ladoInvalidoException37 = new codigos.LadoInvalidoException("hi!");
        ladoInvalidoException34.addSuppressed((java.lang.Throwable) ladoInvalidoException37);
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
        ladoInvalidoException34.addSuppressed((java.lang.Throwable) ladoInvalidoException49);
        ladoInvalidoException25.addSuppressed((java.lang.Throwable) ladoInvalidoException34);
        java.lang.Throwable[] throwableArray73 = ladoInvalidoException34.getSuppressed();
        ladoInvalidoException8.addSuppressed((java.lang.Throwable) ladoInvalidoException34);
        codigos.LadoInvalidoException ladoInvalidoException76 = new codigos.LadoInvalidoException("ISOSCELES");
        ladoInvalidoException8.addSuppressed((java.lang.Throwable) ladoInvalidoException76);
        java.lang.Throwable[] throwableArray78 = ladoInvalidoException76.getSuppressed();
        ladoInvalidoException3.addSuppressed((java.lang.Throwable) ladoInvalidoException76);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray52);
        org.junit.Assert.assertNotNull(throwableArray67);
        org.junit.Assert.assertNotNull(throwableArray69);
        org.junit.Assert.assertNotNull(throwableArray73);
        org.junit.Assert.assertNotNull(throwableArray78);
    }

    @Test
    public void test3876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3876");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 100L, (float) 10);
        float float3 = contaCorrente2.getSaldo();
        float float4 = contaCorrente2.getLimite();
        float float6 = contaCorrente2.saque((float) 1L);
        float float8 = contaCorrente2.saque(99.0f);
        float float9 = contaCorrente2.getSaldo();
        float float10 = contaCorrente2.getSaldo();
        // The following exception was thrown during execution in test generation
        try {
            float float12 = contaCorrente2.saque(80.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Saldo Insuficiente");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 99.0f + "'", float6 == 99.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
    }

    @Test
    public void test3877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3877");
        codigos.LadoInvalidoException ladoInvalidoException1 = new codigos.LadoInvalidoException("ESCALENO");
        java.lang.Throwable[] throwableArray2 = ladoInvalidoException1.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException4 = new codigos.LadoInvalidoException("");
        java.lang.Throwable[] throwableArray5 = ladoInvalidoException4.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException7 = new codigos.LadoInvalidoException("hi!");
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
        ladoInvalidoException7.addSuppressed((java.lang.Throwable) ladoInvalidoException18);
        codigos.LadoInvalidoException ladoInvalidoException25 = new codigos.LadoInvalidoException("codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!");
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
        codigos.LadoInvalidoException ladoInvalidoException43 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException45 = new codigos.LadoInvalidoException("");
        ladoInvalidoException43.addSuppressed((java.lang.Throwable) ladoInvalidoException45);
        codigos.LadoInvalidoException ladoInvalidoException48 = new codigos.LadoInvalidoException("hi!");
        ladoInvalidoException45.addSuppressed((java.lang.Throwable) ladoInvalidoException48);
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
        ladoInvalidoException45.addSuppressed((java.lang.Throwable) ladoInvalidoException60);
        ladoInvalidoException36.addSuppressed((java.lang.Throwable) ladoInvalidoException45);
        ladoInvalidoException25.addSuppressed((java.lang.Throwable) ladoInvalidoException36);
        ladoInvalidoException18.addSuppressed((java.lang.Throwable) ladoInvalidoException25);
        ladoInvalidoException4.addSuppressed((java.lang.Throwable) ladoInvalidoException18);
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException18);
        java.lang.Throwable[] throwableArray88 = ladoInvalidoException18.getSuppressed();
        java.lang.Throwable[] throwableArray89 = ladoInvalidoException18.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertNotNull(throwableArray41);
        org.junit.Assert.assertNotNull(throwableArray63);
        org.junit.Assert.assertNotNull(throwableArray78);
        org.junit.Assert.assertNotNull(throwableArray80);
        org.junit.Assert.assertNotNull(throwableArray88);
        org.junit.Assert.assertNotNull(throwableArray89);
    }

    @Test
    public void test3878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3878");
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
        java.lang.Throwable[] throwableArray67 = ladoInvalidoException54.getSuppressed();
        java.lang.Class<?> wildcardClass68 = ladoInvalidoException54.getClass();
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertNotNull(throwableArray57);
        org.junit.Assert.assertNotNull(throwableArray59);
        org.junit.Assert.assertNotNull(throwableArray64);
        org.junit.Assert.assertNotNull(throwableArray67);
        org.junit.Assert.assertNotNull(wildcardClass68);
    }

    @Test
    public void test3879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3879");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 10, (-10.0f));
    }

    @Test
    public void test3880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3880");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(32.0f, (-32.0f));
        contaCorrente2.setSaldo(99.0f);
        float float6 = contaCorrente2.saque(10.0f);
        float float7 = contaCorrente2.getLimite();
        contaCorrente2.setSaldo(84.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 89.0f + "'", float6 == 89.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-32.0f) + "'", float7 == (-32.0f));
    }

    @Test
    public void test3881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3881");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(35.0f, 42.0f);
        contaCorrente2.setLimite(90.0f);
        contaCorrente2.setSaldo((float) 0L);
    }

    @Test
    public void test3882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3882");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((-10.0f), (float) (byte) -1);
        float float3 = contaCorrente2.getSaldo();
        contaCorrente2.setLimite((float) 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-10.0f) + "'", float3 == (-10.0f));
    }

    @Test
    public void test3883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3883");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(52.0f, (float) 0L);
        contaCorrente2.setLimite((-56.0f));
        contaCorrente2.setSaldo(4.0f);
    }

    @Test
    public void test3884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3884");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 0L, (float) 10);
        contaCorrente2.setSaldo((float) 2);
        float float5 = contaCorrente2.getSaldo();
        contaCorrente2.setLimite(0.0f);
        contaCorrente2.setLimite((-58.0f));
        contaCorrente2.setSaldo(57.0f);
        contaCorrente2.setLimite(0.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 2.0f + "'", float5 == 2.0f);
    }

    @Test
    public void test3885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3885");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((-59.0f), 35.0f);
    }

    @Test
    public void test3886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3886");
        java.lang.String str3 = codigos.Triangulo.classificaTriangulo((int) (short) 1, (int) 'a', (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "NAO FORMA TRIANGULO" + "'", str3, "NAO FORMA TRIANGULO");
    }

    @Test
    public void test3887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3887");
        java.lang.String str3 = codigos.Triangulo.classificaTriangulo(10, 7, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ISOSCELES" + "'", str3, "ISOSCELES");
    }

    @Test
    public void test3888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3888");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        float float3 = contaCorrente2.getSaldo();
        contaCorrente2.setSaldo(100.0f);
        contaCorrente2.setLimite(10.0f);
        float float9 = contaCorrente2.saque((float) 1L);
        float float10 = contaCorrente2.getSaldo();
        java.lang.Class<?> wildcardClass11 = contaCorrente2.getClass();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 99.0f + "'", float9 == 99.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 99.0f + "'", float10 == 99.0f);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3889");
        codigos.Words words0 = new codigos.Words();
        int int2 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int4 = words0.countWords("NAO FORMA TRIANGULO");
        int int6 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int8 = words0.countWords("NAO FORMA TRIANGULO");
        int int10 = words0.countWords("NAO FORMA TRIANGULO");
        int int12 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!");
        int int14 = words0.countWords("codigos.LadoInvalidoException: NAO FORMA TRIANGULO");
        int int16 = words0.countWords("codigos.LadoInvalidoException: NAO FORMA TRIANGULO");
        int int18 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        int int20 = words0.countWords("codigos.LadoInvalidoException: NAO FORMA TRIANGULO");
        int int22 = words0.countWords("EQUILATERO");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test3890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3890");
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
        java.lang.String str90 = ladoInvalidoException25.toString();
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
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "codigos.LadoInvalidoException: " + "'", str90, "codigos.LadoInvalidoException: ");
    }

    @Test
    public void test3891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3891");
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
        contaCorrente2.setLimite(13.0f);
        contaCorrente2.setLimite((-62.0f));
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 10.0f + "'", float17 == 10.0f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 32.0f + "'", float18 == 32.0f);
    }

    @Test
    public void test3892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3892");
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
        java.lang.Throwable[] throwableArray82 = ladoInvalidoException79.getSuppressed();
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
        org.junit.Assert.assertNotNull(throwableArray82);
    }

    @Test
    public void test3893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3893");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 0, (float) 10L);
        contaCorrente2.setSaldo((float) (byte) 0);
        contaCorrente2.setLimite((float) 0L);
        contaCorrente2.setLimite(42.0f);
        // The following exception was thrown during execution in test generation
        try {
            float float10 = contaCorrente2.saque(65.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Saldo Insuficiente");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
    }

    @Test
    public void test3894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3894");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", 1.0f);
        float float8 = pedido0.calculaTaxaDesconto(false, "", (float) 1);
        float float12 = pedido0.calculaTaxaDesconto(false, "hi!", (float) (short) 100);
        float float16 = pedido0.calculaTaxaDesconto(true, "", (float) ' ');
        float float20 = pedido0.calculaTaxaDesconto(false, "", 66.0f);
        float float24 = pedido0.calculaTaxaDesconto(false, "", (float) (byte) -1);
        float float28 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ", (float) 100);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.0f + "'", float24 == 0.0f);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 0.0f + "'", float28 == 0.0f);
    }

    @Test
    public void test3895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3895");
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
        ladoInvalidoException46.addSuppressed((java.lang.Throwable) ladoInvalidoException48);
        codigos.LadoInvalidoException ladoInvalidoException51 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException53 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException55 = new codigos.LadoInvalidoException("");
        ladoInvalidoException53.addSuppressed((java.lang.Throwable) ladoInvalidoException55);
        ladoInvalidoException51.addSuppressed((java.lang.Throwable) ladoInvalidoException55);
        java.lang.Throwable[] throwableArray58 = ladoInvalidoException55.getSuppressed();
        ladoInvalidoException48.addSuppressed((java.lang.Throwable) ladoInvalidoException55);
        java.lang.Throwable[] throwableArray60 = ladoInvalidoException55.getSuppressed();
        ladoInvalidoException37.addSuppressed((java.lang.Throwable) ladoInvalidoException55);
        java.lang.Throwable[] throwableArray62 = ladoInvalidoException55.getSuppressed();
        ladoInvalidoException3.addSuppressed((java.lang.Throwable) ladoInvalidoException55);
        java.lang.Throwable throwable64 = null;
        // The following exception was thrown during execution in test generation
        try {
            ladoInvalidoException3.addSuppressed(throwable64);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray40);
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertNotNull(throwableArray58);
        org.junit.Assert.assertNotNull(throwableArray60);
        org.junit.Assert.assertNotNull(throwableArray62);
    }

    @Test
    public void test3896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3896");
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
        ladoInvalidoException15.addSuppressed((java.lang.Throwable) ladoInvalidoException57);
        java.lang.Throwable[] throwableArray65 = ladoInvalidoException15.getSuppressed();
        java.lang.String str66 = ladoInvalidoException15.toString();
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertNotNull(throwableArray46);
        org.junit.Assert.assertNotNull(throwableArray60);
        org.junit.Assert.assertNotNull(throwableArray62);
        org.junit.Assert.assertNotNull(throwableArray65);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "codigos.LadoInvalidoException: " + "'", str66, "codigos.LadoInvalidoException: ");
    }

    @Test
    public void test3897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3897");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((-46.0f), (-68.0f));
    }

    @Test
    public void test3898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3898");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(99.0f, (float) 'a');
        float float3 = contaCorrente2.getLimite();
        contaCorrente2.setSaldo((float) '4');
        float float6 = contaCorrente2.getLimite();
        float float8 = contaCorrente2.saque((float) 10);
        contaCorrente2.setSaldo(96.0f);
        float float11 = contaCorrente2.getLimite();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 97.0f + "'", float6 == 97.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 42.0f + "'", float8 == 42.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 97.0f + "'", float11 == 97.0f);
    }

    @Test
    public void test3899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3899");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(45.0f, 1.0f);
        contaCorrente2.setLimite((-57.0f));
        float float5 = contaCorrente2.getSaldo();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 45.0f + "'", float5 == 45.0f);
    }

    @Test
    public void test3900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3900");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", (float) (short) -1);
        float float8 = pedido0.calculaTaxaDesconto(true, "NAO FORMA TRIANGULO", (float) (byte) 0);
        float float12 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: hi!", (float) (short) 100);
        float float16 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: ", 35.0f);
        float float20 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: ", (float) (byte) -1);
        float float24 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ESCALENO", 9.0f);
        float float28 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", (float) '4');
        float float32 = pedido0.calculaTaxaDesconto(true, "ISOSCELES", 7.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10.0f + "'", float12 == 10.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 10.0f + "'", float20 == 10.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 10.0f + "'", float24 == 10.0f);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 10.0f + "'", float28 == 10.0f);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 10.0f + "'", float32 == 10.0f);
    }

    @Test
    public void test3901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3901");
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
        contaCorrente2.setSaldo((float) '4');
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 99.0f + "'", float9 == 99.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + (-1.0f) + "'", float14 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 100.0f + "'", float17 == 100.0f);
    }

    @Test
    public void test3902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3902");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 10, 0.0f);
        float float3 = contaCorrente2.getSaldo();
        float float4 = contaCorrente2.getLimite();
        contaCorrente2.setSaldo((float) ' ');
        contaCorrente2.setSaldo((float) 100);
        float float9 = contaCorrente2.getSaldo();
        java.lang.Class<?> wildcardClass10 = contaCorrente2.getClass();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 100.0f + "'", float9 == 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3903");
        codigos.LadoInvalidoException ladoInvalidoException1 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException3 = new codigos.LadoInvalidoException("");
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException3);
        codigos.LadoInvalidoException ladoInvalidoException6 = new codigos.LadoInvalidoException("hi!");
        ladoInvalidoException3.addSuppressed((java.lang.Throwable) ladoInvalidoException6);
        java.lang.Throwable[] throwableArray8 = ladoInvalidoException6.getSuppressed();
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
        codigos.LadoInvalidoException ladoInvalidoException57 = new codigos.LadoInvalidoException("codigos.LadoInvalidoException: hi!");
        ladoInvalidoException49.addSuppressed((java.lang.Throwable) ladoInvalidoException57);
        java.lang.Throwable[] throwableArray59 = ladoInvalidoException57.getSuppressed();
        ladoInvalidoException12.addSuppressed((java.lang.Throwable) ladoInvalidoException57);
        ladoInvalidoException6.addSuppressed((java.lang.Throwable) ladoInvalidoException57);
        java.lang.String str62 = ladoInvalidoException6.toString();
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertNotNull(throwableArray52);
        org.junit.Assert.assertNotNull(throwableArray54);
        org.junit.Assert.assertNotNull(throwableArray59);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "codigos.LadoInvalidoException: hi!" + "'", str62, "codigos.LadoInvalidoException: hi!");
    }

    @Test
    public void test3904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3904");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 5, 8.0f);
        float float4 = contaCorrente2.saque((float) 1L);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 4.0f + "'", float4 == 4.0f);
    }

    @Test
    public void test3905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3905");
        codigos.Words words0 = new codigos.Words();
        int int2 = words0.countWords("");
        int int4 = words0.countWords("");
        int int6 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int8 = words0.countWords("EQUILATERO");
        int int10 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!");
        int int12 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        int int14 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        java.lang.Class<?> wildcardClass15 = words0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3906");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((-62.0f), 66.0f);
        contaCorrente2.setSaldo(21.0f);
    }

    @Test
    public void test3907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3907");
        java.lang.String str3 = codigos.Triangulo.classificaTriangulo((int) (byte) 10, (int) (short) 1, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ISOSCELES" + "'", str3, "ISOSCELES");
    }

    @Test
    public void test3908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3908");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", 1.0f);
        float float8 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: hi!", (float) (short) 10);
        float float12 = pedido0.calculaTaxaDesconto(false, "NAO FORMA TRIANGULO", (-48.0f));
        float float16 = pedido0.calculaTaxaDesconto(false, "hi!", 10.0f);
        float float20 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!", (float) (byte) 100);
        float float24 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ", (float) (short) 100);
        float float28 = pedido0.calculaTaxaDesconto(true, "EQUILATERO", 12.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 10.0f + "'", float20 == 10.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.0f + "'", float24 == 0.0f);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 10.0f + "'", float28 == 10.0f);
    }

    @Test
    public void test3909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3909");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", (float) (short) -1);
        float float8 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: ", 9.0f);
        float float12 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!", 9.0f);
        float float16 = pedido0.calculaTaxaDesconto(false, "", (float) (-1L));
        float float20 = pedido0.calculaTaxaDesconto(true, "EQUILATERO", 32.0f);
        float float24 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ", (float) 5);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10.0f + "'", float12 == 10.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 10.0f + "'", float20 == 10.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.0f + "'", float24 == 0.0f);
    }

    @Test
    public void test3910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3910");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 10, 0.0f);
        contaCorrente2.setSaldo((float) (byte) 0);
        float float5 = contaCorrente2.getSaldo();
        contaCorrente2.setLimite((float) (byte) 1);
        float float8 = contaCorrente2.getSaldo();
        contaCorrente2.setLimite(32.0f);
        contaCorrente2.setSaldo((float) '4');
        float float13 = contaCorrente2.getSaldo();
        java.lang.Class<?> wildcardClass14 = contaCorrente2.getClass();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 52.0f + "'", float13 == 52.0f);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3911");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((-3.0f), 35.0f);
        contaCorrente2.setSaldo(90.0f);
        float float5 = contaCorrente2.getLimite();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 35.0f + "'", float5 == 35.0f);
    }

    @Test
    public void test3912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3912");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", 1.0f);
        float float8 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: hi!", (float) (short) 10);
        float float12 = pedido0.calculaTaxaDesconto(true, "NAO FORMA TRIANGULO", (float) 0L);
        float float16 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ", (float) (short) 1);
        float float20 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: hi!", (-96.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10.0f + "'", float12 == 10.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 10.0f + "'", float20 == 10.0f);
    }

    @Test
    public void test3913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3913");
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
        java.lang.Throwable[] throwableArray87 = ladoInvalidoException28.getSuppressed();
        java.lang.Throwable[] throwableArray88 = ladoInvalidoException28.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray47);
        org.junit.Assert.assertNotNull(throwableArray62);
        org.junit.Assert.assertNotNull(throwableArray64);
        org.junit.Assert.assertNotNull(throwableArray74);
        org.junit.Assert.assertNotNull(throwableArray84);
        org.junit.Assert.assertNotNull(throwableArray87);
        org.junit.Assert.assertNotNull(throwableArray88);
    }

    @Test
    public void test3914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3914");
        codigos.Words words0 = new codigos.Words();
        int int2 = words0.countWords("");
        int int4 = words0.countWords("");
        int int6 = words0.countWords("codigos.LadoInvalidoException: ");
        int int8 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!");
        int int10 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int12 = words0.countWords("codigos.LadoInvalidoException: ");
        int int14 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        int int16 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!");
        java.lang.Class<?> wildcardClass17 = words0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3915");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 100L, (float) 10);
        float float3 = contaCorrente2.getSaldo();
        float float4 = contaCorrente2.getLimite();
        float float6 = contaCorrente2.saque((float) 1L);
        contaCorrente2.setSaldo((float) 'a');
        float float10 = contaCorrente2.saque((float) (short) 100);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 99.0f + "'", float6 == 99.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-3.0f) + "'", float10 == (-3.0f));
    }

    @Test
    public void test3916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3916");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (short) 0, 0.0f);
        contaCorrente2.setLimite((float) 1L);
        contaCorrente2.setSaldo(45.0f);
        java.lang.Class<?> wildcardClass7 = contaCorrente2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3917");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        contaCorrente2.setLimite((float) 0L);
        contaCorrente2.setLimite((float) (short) 0);
        float float8 = contaCorrente2.saque(68.0f);
        contaCorrente2.setSaldo((-41.0f));
        float float11 = contaCorrente2.getLimite();
        float float12 = contaCorrente2.getSaldo();
        contaCorrente2.setSaldo((float) ' ');
        java.lang.Class<?> wildcardClass15 = contaCorrente2.getClass();
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 32.0f + "'", float8 == 32.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-41.0f) + "'", float12 == (-41.0f));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3918");
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
        codigos.LadoInvalidoException ladoInvalidoException45 = new codigos.LadoInvalidoException("");
        ladoInvalidoException43.addSuppressed((java.lang.Throwable) ladoInvalidoException45);
        codigos.LadoInvalidoException ladoInvalidoException48 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException50 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException52 = new codigos.LadoInvalidoException("");
        ladoInvalidoException50.addSuppressed((java.lang.Throwable) ladoInvalidoException52);
        ladoInvalidoException48.addSuppressed((java.lang.Throwable) ladoInvalidoException52);
        java.lang.Throwable[] throwableArray55 = ladoInvalidoException52.getSuppressed();
        ladoInvalidoException45.addSuppressed((java.lang.Throwable) ladoInvalidoException52);
        ladoInvalidoException38.addSuppressed((java.lang.Throwable) ladoInvalidoException52);
        codigos.LadoInvalidoException ladoInvalidoException59 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException61 = new codigos.LadoInvalidoException("");
        ladoInvalidoException59.addSuppressed((java.lang.Throwable) ladoInvalidoException61);
        codigos.LadoInvalidoException ladoInvalidoException64 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException66 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException68 = new codigos.LadoInvalidoException("");
        ladoInvalidoException66.addSuppressed((java.lang.Throwable) ladoInvalidoException68);
        ladoInvalidoException64.addSuppressed((java.lang.Throwable) ladoInvalidoException68);
        java.lang.Throwable[] throwableArray71 = ladoInvalidoException68.getSuppressed();
        ladoInvalidoException61.addSuppressed((java.lang.Throwable) ladoInvalidoException68);
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
        ladoInvalidoException68.addSuppressed((java.lang.Throwable) ladoInvalidoException83);
        codigos.LadoInvalidoException ladoInvalidoException91 = new codigos.LadoInvalidoException("codigos.LadoInvalidoException: hi!");
        ladoInvalidoException83.addSuppressed((java.lang.Throwable) ladoInvalidoException91);
        ladoInvalidoException52.addSuppressed((java.lang.Throwable) ladoInvalidoException83);
        java.lang.String str94 = ladoInvalidoException83.toString();
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray41);
        org.junit.Assert.assertNotNull(throwableArray55);
        org.junit.Assert.assertNotNull(throwableArray71);
        org.junit.Assert.assertNotNull(throwableArray86);
        org.junit.Assert.assertNotNull(throwableArray88);
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "codigos.LadoInvalidoException: " + "'", str94, "codigos.LadoInvalidoException: ");
    }

    @Test
    public void test3919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3919");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(51.0f, (-50.0f));
        // The following exception was thrown during execution in test generation
        try {
            float float4 = contaCorrente2.saque((-59.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Valor invalido");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
    }

    @Test
    public void test3920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3920");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", 1.0f);
        float float8 = pedido0.calculaTaxaDesconto(false, "hi!", (float) (short) 10);
        float float12 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ", 68.0f);
        float float16 = pedido0.calculaTaxaDesconto(true, "ESCALENO", (float) (byte) 10);
        float float20 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: NAO FORMA TRIANGULO", (float) (byte) 100);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10.0f + "'", float12 == 10.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
    }

    @Test
    public void test3921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3921");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", 1.0f);
        float float8 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: hi!", (float) (short) 10);
        float float12 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", (float) ' ');
        float float16 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!", (float) (short) -1);
        float float20 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!", 32.0f);
        float float24 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: hi!", 55.0f);
        float float28 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ESCALENO", (float) 0);
        java.lang.Class<?> wildcardClass29 = pedido0.getClass();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10.0f + "'", float12 == 10.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 10.0f + "'", float20 == 10.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.0f + "'", float24 == 0.0f);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 10.0f + "'", float28 == 10.0f);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test3922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3922");
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
        java.lang.Throwable[] throwableArray36 = ladoInvalidoException25.getSuppressed();
        java.lang.String str37 = ladoInvalidoException25.toString();
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "codigos.LadoInvalidoException: " + "'", str37, "codigos.LadoInvalidoException: ");
    }

    @Test
    public void test3923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3923");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(9.0f, 32.0f);
        float float4 = contaCorrente2.saque(9.0f);
        // The following exception was thrown during execution in test generation
        try {
            float float6 = contaCorrente2.saque(47.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Saldo Insuficiente");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
    }

    @Test
    public void test3924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3924");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", 1.0f);
        float float8 = pedido0.calculaTaxaDesconto(false, "NAO FORMA TRIANGULO", 10.0f);
        float float12 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: ", (float) (-1L));
        float float16 = pedido0.calculaTaxaDesconto(false, "NAO FORMA TRIANGULO", (float) 2);
        float float20 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", (float) 2);
        float float24 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ", 30.0f);
        float float28 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: NAO FORMA TRIANGULO", 32.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 10.0f + "'", float20 == 10.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.0f + "'", float24 == 0.0f);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 10.0f + "'", float28 == 10.0f);
    }

    @Test
    public void test3925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3925");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 10, 0.0f);
        contaCorrente2.setSaldo((float) (byte) 0);
        float float5 = contaCorrente2.getSaldo();
        contaCorrente2.setLimite((float) (byte) 1);
        float float8 = contaCorrente2.getSaldo();
        contaCorrente2.setLimite(0.0f);
        contaCorrente2.setLimite((-10.0f));
        float float13 = contaCorrente2.getLimite();
        float float14 = contaCorrente2.getSaldo();
        float float15 = contaCorrente2.getSaldo();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + (-10.0f) + "'", float13 == (-10.0f));
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.0f + "'", float15 == 0.0f);
    }

    @Test
    public void test3926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3926");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(3.0f, (-48.0f));
    }

    @Test
    public void test3927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3927");
        java.lang.String str3 = codigos.Triangulo.classificaTriangulo(6, (int) ' ', 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "NAO FORMA TRIANGULO" + "'", str3, "NAO FORMA TRIANGULO");
    }

    @Test
    public void test3928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3928");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(98.0f, 4.0f);
        float float3 = contaCorrente2.getSaldo();
        contaCorrente2.setLimite((float) 5);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 98.0f + "'", float3 == 98.0f);
    }

    @Test
    public void test3929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3929");
        codigos.Words words0 = new codigos.Words();
        int int2 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int4 = words0.countWords("NAO FORMA TRIANGULO");
        int int6 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int8 = words0.countWords("NAO FORMA TRIANGULO");
        int int10 = words0.countWords("");
        int int12 = words0.countWords("");
        int int14 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
    }

    @Test
    public void test3930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3930");
        codigos.Words words0 = new codigos.Words();
        int int2 = words0.countWords("");
        int int4 = words0.countWords("");
        int int6 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int8 = words0.countWords("codigos.LadoInvalidoException: NAO FORMA TRIANGULO");
        int int10 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        int int12 = words0.countWords("EQUILATERO");
        int int14 = words0.countWords("EQUILATERO");
        java.lang.Class<?> wildcardClass15 = words0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3931");
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
        java.lang.Throwable[] throwableArray43 = ladoInvalidoException28.getSuppressed();
        java.lang.Throwable[] throwableArray44 = ladoInvalidoException28.getSuppressed();
        java.lang.Throwable[] throwableArray45 = ladoInvalidoException28.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(throwableArray40);
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertNotNull(throwableArray45);
    }

    @Test
    public void test3932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3932");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        float float3 = contaCorrente2.getSaldo();
        contaCorrente2.setSaldo(100.0f);
        float float7 = contaCorrente2.saque((float) (byte) 10);
        contaCorrente2.setSaldo((float) 1L);
        contaCorrente2.setSaldo((float) 10L);
        // The following exception was thrown during execution in test generation
        try {
            float float13 = contaCorrente2.saque(100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Saldo Insuficiente");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 90.0f + "'", float7 == 90.0f);
    }

    @Test
    public void test3933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3933");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", 1.0f);
        float float8 = pedido0.calculaTaxaDesconto(false, "", (float) 1);
        float float12 = pedido0.calculaTaxaDesconto(true, "", 100.0f);
        float float16 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: ESCALENO", (-90.0f));
        float float20 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ", (float) 'a');
        float float24 = pedido0.calculaTaxaDesconto(true, "NAO FORMA TRIANGULO", (-11.0f));
        float float28 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: EQUILATERO", 65.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10.0f + "'", float12 == 10.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 10.0f + "'", float20 == 10.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 10.0f + "'", float24 == 10.0f);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 0.0f + "'", float28 == 0.0f);
    }

    @Test
    public void test3934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3934");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 'a', (float) 10);
        contaCorrente2.setSaldo((float) 100L);
        float float5 = contaCorrente2.getSaldo();
        float float6 = contaCorrente2.getLimite();
        contaCorrente2.setLimite(0.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 100.0f + "'", float5 == 100.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
    }

    @Test
    public void test3935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3935");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 10, 0.0f);
        float float3 = contaCorrente2.getSaldo();
        float float5 = contaCorrente2.saque(1.0f);
        contaCorrente2.setLimite(10.0f);
        contaCorrente2.setLimite((float) 10);
        contaCorrente2.setLimite(27.0f);
        float float12 = contaCorrente2.getSaldo();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 9.0f + "'", float5 == 9.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 9.0f + "'", float12 == 9.0f);
    }

    @Test
    public void test3936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3936");
        codigos.LadoInvalidoException ladoInvalidoException1 = new codigos.LadoInvalidoException("codigos.LadoInvalidoException: ISOSCELES");
        codigos.LadoInvalidoException ladoInvalidoException3 = new codigos.LadoInvalidoException("NAO FORMA TRIANGULO");
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
        codigos.LadoInvalidoException ladoInvalidoException20 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException22 = new codigos.LadoInvalidoException("");
        ladoInvalidoException20.addSuppressed((java.lang.Throwable) ladoInvalidoException22);
        codigos.LadoInvalidoException ladoInvalidoException25 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException27 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException29 = new codigos.LadoInvalidoException("");
        ladoInvalidoException27.addSuppressed((java.lang.Throwable) ladoInvalidoException29);
        ladoInvalidoException25.addSuppressed((java.lang.Throwable) ladoInvalidoException29);
        java.lang.Throwable[] throwableArray32 = ladoInvalidoException29.getSuppressed();
        ladoInvalidoException22.addSuppressed((java.lang.Throwable) ladoInvalidoException29);
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
        java.lang.Throwable[] throwableArray49 = ladoInvalidoException44.getSuppressed();
        ladoInvalidoException29.addSuppressed((java.lang.Throwable) ladoInvalidoException44);
        codigos.LadoInvalidoException ladoInvalidoException52 = new codigos.LadoInvalidoException("codigos.LadoInvalidoException: hi!");
        ladoInvalidoException44.addSuppressed((java.lang.Throwable) ladoInvalidoException52);
        java.lang.Throwable[] throwableArray54 = ladoInvalidoException52.getSuppressed();
        ladoInvalidoException7.addSuppressed((java.lang.Throwable) ladoInvalidoException52);
        ladoInvalidoException3.addSuppressed((java.lang.Throwable) ladoInvalidoException7);
        java.lang.Throwable[] throwableArray57 = ladoInvalidoException7.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException59 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException61 = new codigos.LadoInvalidoException("");
        ladoInvalidoException59.addSuppressed((java.lang.Throwable) ladoInvalidoException61);
        codigos.LadoInvalidoException ladoInvalidoException64 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException66 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException68 = new codigos.LadoInvalidoException("");
        ladoInvalidoException66.addSuppressed((java.lang.Throwable) ladoInvalidoException68);
        ladoInvalidoException64.addSuppressed((java.lang.Throwable) ladoInvalidoException68);
        java.lang.Throwable[] throwableArray71 = ladoInvalidoException68.getSuppressed();
        ladoInvalidoException61.addSuppressed((java.lang.Throwable) ladoInvalidoException68);
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
        ladoInvalidoException68.addSuppressed((java.lang.Throwable) ladoInvalidoException83);
        codigos.LadoInvalidoException ladoInvalidoException91 = new codigos.LadoInvalidoException("ESCALENO");
        ladoInvalidoException83.addSuppressed((java.lang.Throwable) ladoInvalidoException91);
        java.lang.Throwable[] throwableArray93 = ladoInvalidoException83.getSuppressed();
        java.lang.Throwable[] throwableArray94 = ladoInvalidoException83.getSuppressed();
        ladoInvalidoException7.addSuppressed((java.lang.Throwable) ladoInvalidoException83);
        ladoInvalidoException1.addSuppressed((java.lang.Throwable) ladoInvalidoException83);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNotNull(throwableArray47);
        org.junit.Assert.assertNotNull(throwableArray49);
        org.junit.Assert.assertNotNull(throwableArray54);
        org.junit.Assert.assertNotNull(throwableArray57);
        org.junit.Assert.assertNotNull(throwableArray71);
        org.junit.Assert.assertNotNull(throwableArray86);
        org.junit.Assert.assertNotNull(throwableArray88);
        org.junit.Assert.assertNotNull(throwableArray93);
        org.junit.Assert.assertNotNull(throwableArray94);
    }

    @Test
    public void test3937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3937");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = codigos.Triangulo.classificaTriangulo(100, (int) (short) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type codigos.LadoInvalidoException; message: lado invalido");
        } catch (codigos.LadoInvalidoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3938");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(0.0f, (float) '4');
        contaCorrente2.setSaldo(0.0f);
        // The following exception was thrown during execution in test generation
        try {
            float float6 = contaCorrente2.saque((-57.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Valor invalido");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
    }

    @Test
    public void test3939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3939");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((-50.0f), (float) 10L);
    }

    @Test
    public void test3940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3940");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(28.0f, 30.0f);
    }

    @Test
    public void test3941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3941");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", 1.0f);
        float float8 = pedido0.calculaTaxaDesconto(false, "NAO FORMA TRIANGULO", 10.0f);
        float float12 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: ", (float) (-1L));
        float float16 = pedido0.calculaTaxaDesconto(false, "NAO FORMA TRIANGULO", (float) 2);
        float float20 = pedido0.calculaTaxaDesconto(false, "", 88.0f);
        float float24 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!", 60.0f);
        float float28 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!", (float) '#');
        float float32 = pedido0.calculaTaxaDesconto(false, "EQUILATERO", (float) (byte) -1);
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
    public void test3942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3942");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(99.0f, (float) 'a');
        float float3 = contaCorrente2.getLimite();
        contaCorrente2.setSaldo((float) 100);
        float float7 = contaCorrente2.saque((float) 10);
        contaCorrente2.setSaldo(0.0f);
        contaCorrente2.setLimite(99.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 90.0f + "'", float7 == 90.0f);
    }

    @Test
    public void test3943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3943");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(3.0f, 96.0f);
        contaCorrente2.setSaldo(34.0f);
        float float5 = contaCorrente2.getLimite();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 96.0f + "'", float5 == 96.0f);
    }

    @Test
    public void test3944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3944");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        contaCorrente2.setLimite((float) 0L);
        contaCorrente2.setLimite((float) (short) 0);
        float float8 = contaCorrente2.saque(68.0f);
        contaCorrente2.setSaldo(2.0f);
        contaCorrente2.setLimite(12.0f);
        float float13 = contaCorrente2.getSaldo();
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 32.0f + "'", float8 == 32.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 2.0f + "'", float13 == 2.0f);
    }

    @Test
    public void test3945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3945");
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
        codigos.LadoInvalidoException ladoInvalidoException44 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException46 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException48 = new codigos.LadoInvalidoException("");
        ladoInvalidoException46.addSuppressed((java.lang.Throwable) ladoInvalidoException48);
        ladoInvalidoException44.addSuppressed((java.lang.Throwable) ladoInvalidoException48);
        java.lang.Throwable[] throwableArray51 = ladoInvalidoException48.getSuppressed();
        codigos.LadoInvalidoException ladoInvalidoException53 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException55 = new codigos.LadoInvalidoException("");
        codigos.LadoInvalidoException ladoInvalidoException57 = new codigos.LadoInvalidoException("");
        ladoInvalidoException55.addSuppressed((java.lang.Throwable) ladoInvalidoException57);
        ladoInvalidoException53.addSuppressed((java.lang.Throwable) ladoInvalidoException57);
        java.lang.Throwable[] throwableArray60 = ladoInvalidoException53.getSuppressed();
        ladoInvalidoException48.addSuppressed((java.lang.Throwable) ladoInvalidoException53);
        java.lang.Throwable[] throwableArray62 = ladoInvalidoException53.getSuppressed();
        ladoInvalidoException10.addSuppressed((java.lang.Throwable) ladoInvalidoException53);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray40);
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertNotNull(throwableArray51);
        org.junit.Assert.assertNotNull(throwableArray60);
        org.junit.Assert.assertNotNull(throwableArray62);
    }

    @Test
    public void test3946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3946");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(1.0f, (float) '4');
        float float3 = contaCorrente2.getLimite();
        float float5 = contaCorrente2.saque(42.0f);
        contaCorrente2.setSaldo((-2.0f));
        contaCorrente2.setLimite((float) 10L);
        contaCorrente2.setSaldo((-29.0f));
        float float12 = contaCorrente2.getSaldo();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 52.0f + "'", float3 == 52.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-41.0f) + "'", float5 == (-41.0f));
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-29.0f) + "'", float12 == (-29.0f));
    }

    @Test
    public void test3947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3947");
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
        codigos.LadoInvalidoException ladoInvalidoException89 = new codigos.LadoInvalidoException("codigos.LadoInvalidoException: hi!");
        ladoInvalidoException81.addSuppressed((java.lang.Throwable) ladoInvalidoException89);
        java.lang.Throwable[] throwableArray91 = ladoInvalidoException89.getSuppressed();
        ladoInvalidoException5.addSuppressed((java.lang.Throwable) ladoInvalidoException89);
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
    }

    @Test
    public void test3948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3948");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", 1.0f);
        float float8 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: hi!", (float) (short) 10);
        float float12 = pedido0.calculaTaxaDesconto(false, "NAO FORMA TRIANGULO", (-48.0f));
        float float16 = pedido0.calculaTaxaDesconto(false, "ESCALENO", 52.0f);
        float float20 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: ", (float) '4');
        float float24 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!", (float) 100);
        float float28 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!", (-11.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.0f + "'", float24 == 0.0f);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 0.0f + "'", float28 == 0.0f);
    }

    @Test
    public void test3949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3949");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", 1.0f);
        float float8 = pedido0.calculaTaxaDesconto(false, "NAO FORMA TRIANGULO", 10.0f);
        float float12 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: ", (float) (-1L));
        float float16 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ", (-2.0f));
        float float20 = pedido0.calculaTaxaDesconto(true, "", (-32.0f));
        float float24 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: hi!", (-30.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 10.0f + "'", float20 == 10.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 10.0f + "'", float24 == 10.0f);
    }

    @Test
    public void test3950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3950");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(100.0f, 87.0f);
    }

    @Test
    public void test3951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3951");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 10, 10.0f);
        float float3 = contaCorrente2.getSaldo();
        float float4 = contaCorrente2.getSaldo();
        float float5 = contaCorrente2.getSaldo();
        float float6 = contaCorrente2.getLimite();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10.0f + "'", float5 == 10.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
    }

    @Test
    public void test3952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3952");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", 1.0f);
        float float8 = pedido0.calculaTaxaDesconto(false, "", (float) 1);
        float float12 = pedido0.calculaTaxaDesconto(false, "hi!", (float) (short) 100);
        float float16 = pedido0.calculaTaxaDesconto(true, "", (float) ' ');
        float float20 = pedido0.calculaTaxaDesconto(false, "", (float) 0L);
        float float24 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!", 99.0f);
        float float28 = pedido0.calculaTaxaDesconto(true, "", (-41.0f));
        float float32 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", 16.0f);
        float float36 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ", (-25.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.0f + "'", float24 == 0.0f);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 10.0f + "'", float28 == 10.0f);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 10.0f + "'", float32 == 10.0f);
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 0.0f + "'", float36 == 0.0f);
    }

    @Test
    public void test3953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3953");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 6, 33.0f);
    }

    @Test
    public void test3954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3954");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", (float) (short) -1);
        float float8 = pedido0.calculaTaxaDesconto(true, "NAO FORMA TRIANGULO", (float) (byte) 0);
        float float12 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: hi!", (float) (short) 100);
        float float16 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: ", 35.0f);
        float float20 = pedido0.calculaTaxaDesconto(false, "hi!", 81.0f);
        float float24 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ", 13.0f);
        float float28 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: NAO FORMA TRIANGULO", 4.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10.0f + "'", float12 == 10.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.0f + "'", float24 == 0.0f);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 0.0f + "'", float28 == 0.0f);
    }

    @Test
    public void test3955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3955");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(10.0f, (-31.0f));
    }

    @Test
    public void test3956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3956");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(60.0f, (float) ' ');
    }

    @Test
    public void test3957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3957");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        float float3 = contaCorrente2.getLimite();
        float float4 = contaCorrente2.getSaldo();
        float float5 = contaCorrente2.getLimite();
        float float6 = contaCorrente2.getSaldo();
        contaCorrente2.setLimite((float) (byte) 10);
        contaCorrente2.setSaldo((float) 100L);
        contaCorrente2.setSaldo(90.0f);
        float float13 = contaCorrente2.getSaldo();
        contaCorrente2.setSaldo(0.0f);
        contaCorrente2.setLimite(45.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 90.0f + "'", float13 == 90.0f);
    }

    @Test
    public void test3958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3958");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 100L, 73.0f);
    }

    @Test
    public void test3959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3959");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 4, 23.0f);
        float float3 = contaCorrente2.getSaldo();
        contaCorrente2.setLimite(0.0f);
        java.lang.Class<?> wildcardClass6 = contaCorrente2.getClass();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 4.0f + "'", float3 == 4.0f);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3960");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 10, 0.0f);
        float float3 = contaCorrente2.getSaldo();
        float float5 = contaCorrente2.saque(1.0f);
        contaCorrente2.setSaldo((-45.0f));
        // The following exception was thrown during execution in test generation
        try {
            float float9 = contaCorrente2.saque((-79.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Valor invalido");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 9.0f + "'", float5 == 9.0f);
    }

    @Test
    public void test3961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3961");
        codigos.Words words0 = new codigos.Words();
        int int2 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int4 = words0.countWords("codigos.LadoInvalidoException: ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test3962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3962");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((-1.0f), (float) 100);
        float float4 = contaCorrente2.saque(2.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-3.0f) + "'", float4 == (-3.0f));
    }

    @Test
    public void test3963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3963");
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
        java.lang.Throwable throwable84 = null;
        // The following exception was thrown during execution in test generation
        try {
            ladoInvalidoException37.addSuppressed(throwable84);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test3964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3964");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(55.0f, (float) 10L);
        float float3 = contaCorrente2.getSaldo();
        float float4 = contaCorrente2.getLimite();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 55.0f + "'", float3 == 55.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
    }

    @Test
    public void test3965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3965");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(55.0f, (float) '#');
        java.lang.Class<?> wildcardClass3 = contaCorrente2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test3966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3966");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((-10.0f), (float) (byte) 100);
        float float3 = contaCorrente2.getLimite();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test3967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3967");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        float float3 = contaCorrente2.getLimite();
        float float4 = contaCorrente2.getSaldo();
        contaCorrente2.setLimite((-30.0f));
        contaCorrente2.setSaldo(81.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
    }

    @Test
    public void test3968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3968");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) ' ', 1.0f);
        float float3 = contaCorrente2.getLimite();
        contaCorrente2.setLimite((-11.0f));
        float float6 = contaCorrente2.getSaldo();
        float float7 = contaCorrente2.getSaldo();
        float float8 = contaCorrente2.getSaldo();
        float float10 = contaCorrente2.saque(9.0f);
        contaCorrente2.setSaldo((float) 1L);
        float float13 = contaCorrente2.getSaldo();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 32.0f + "'", float6 == 32.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 32.0f + "'", float7 == 32.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 32.0f + "'", float8 == 32.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 23.0f + "'", float10 == 23.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
    }

    @Test
    public void test3969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3969");
        codigos.Words words0 = new codigos.Words();
        int int2 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int4 = words0.countWords("NAO FORMA TRIANGULO");
        int int6 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int8 = words0.countWords("NAO FORMA TRIANGULO");
        int int10 = words0.countWords("NAO FORMA TRIANGULO");
        int int12 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!");
        int int14 = words0.countWords("codigos.LadoInvalidoException: NAO FORMA TRIANGULO");
        int int16 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
    }

    @Test
    public void test3970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3970");
        codigos.Words words0 = new codigos.Words();
        int int2 = words0.countWords("");
        int int4 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!");
        int int6 = words0.countWords("");
        int int8 = words0.countWords("codigos.LadoInvalidoException: ");
        int int10 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
    }

    @Test
    public void test3971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3971");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((-10.0f), (float) (byte) -1);
        float float3 = contaCorrente2.getLimite();
        float float4 = contaCorrente2.getSaldo();
        contaCorrente2.setSaldo((float) 4);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-10.0f) + "'", float4 == (-10.0f));
    }

    @Test
    public void test3972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3972");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 0, (-45.0f));
        contaCorrente2.setLimite(1.0f);
        float float5 = contaCorrente2.getSaldo();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
    }

    @Test
    public void test3973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3973");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 100L, (float) 10);
        float float3 = contaCorrente2.getSaldo();
        float float4 = contaCorrente2.getLimite();
        float float5 = contaCorrente2.getSaldo();
        contaCorrente2.setLimite(60.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 100.0f + "'", float5 == 100.0f);
    }

    @Test
    public void test3974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3974");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(9.0f, 32.0f);
        float float3 = contaCorrente2.getLimite();
        contaCorrente2.setLimite(97.0f);
        contaCorrente2.setSaldo(0.0f);
        float float8 = contaCorrente2.getLimite();
        contaCorrente2.setSaldo((-3.0f));
        float float12 = contaCorrente2.saque(89.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 32.0f + "'", float3 == 32.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 97.0f + "'", float8 == 97.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-92.0f) + "'", float12 == (-92.0f));
    }

    @Test
    public void test3975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3975");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (short) 10, (float) ' ');
        contaCorrente2.setLimite((float) (byte) 0);
        contaCorrente2.setLimite(11.0f);
    }

    @Test
    public void test3976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3976");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 'a', (float) 10);
        float float4 = contaCorrente2.saque((float) 1);
        float float5 = contaCorrente2.getLimite();
        contaCorrente2.setSaldo((float) (short) 10);
        contaCorrente2.setLimite(31.0f);
        float float10 = contaCorrente2.getLimite();
        float float11 = contaCorrente2.getLimite();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 96.0f + "'", float4 == 96.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10.0f + "'", float5 == 10.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 31.0f + "'", float10 == 31.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 31.0f + "'", float11 == 31.0f);
    }

    @Test
    public void test3977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3977");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (short) -1, 97.0f);
        contaCorrente2.setSaldo(65.0f);
        float float5 = contaCorrente2.getLimite();
        float float7 = contaCorrente2.saque(89.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 97.0f + "'", float5 == 97.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-24.0f) + "'", float7 == (-24.0f));
    }

    @Test
    public void test3978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3978");
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
        contaCorrente2.setSaldo((float) 100);
        contaCorrente2.setLimite((float) 10L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 100.0f + "'", float15 == 100.0f);
    }

    @Test
    public void test3979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3979");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = codigos.Triangulo.classificaTriangulo((-1), 2, 0);
            org.junit.Assert.fail("Expected exception of type codigos.LadoInvalidoException; message: lado invalido");
        } catch (codigos.LadoInvalidoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3980");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 1L, 96.0f);
        float float4 = contaCorrente2.saque(32.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-31.0f) + "'", float4 == (-31.0f));
    }

    @Test
    public void test3981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3981");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", (float) (short) -1);
        float float8 = pedido0.calculaTaxaDesconto(true, "NAO FORMA TRIANGULO", (float) (byte) 0);
        float float12 = pedido0.calculaTaxaDesconto(true, "", (float) 0L);
        float float16 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ESCALENO", (float) (byte) 10);
        float float20 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: ESCALENO", (-1.0f));
        float float24 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!", 56.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10.0f + "'", float12 == 10.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 10.0f + "'", float24 == 10.0f);
    }

    @Test
    public void test3982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3982");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 0, (-45.0f));
        contaCorrente2.setLimite(1.0f);
        contaCorrente2.setSaldo((-1.0f));
        float float7 = contaCorrente2.getLimite();
        contaCorrente2.setSaldo(84.0f);
        contaCorrente2.setSaldo((float) (byte) 1);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 1.0f + "'", float7 == 1.0f);
    }

    @Test
    public void test3983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3983");
        java.lang.String str3 = codigos.Triangulo.classificaTriangulo((int) (byte) 10, 4, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "NAO FORMA TRIANGULO" + "'", str3, "NAO FORMA TRIANGULO");
    }

    @Test
    public void test3984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3984");
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
        java.lang.String str89 = ladoInvalidoException8.toString();
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
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "codigos.LadoInvalidoException: " + "'", str89, "codigos.LadoInvalidoException: ");
    }

    @Test
    public void test3985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3985");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((-86.0f), (float) (short) 1);
    }

    @Test
    public void test3986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3986");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((-11.0f), (-32.0f));
        float float3 = contaCorrente2.getSaldo();
        // The following exception was thrown during execution in test generation
        try {
            float float5 = contaCorrente2.saque(87.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Saldo Insuficiente");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-11.0f) + "'", float3 == (-11.0f));
    }

    @Test
    public void test3987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3987");
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
        contaCorrente2.setLimite(96.0f);
        java.lang.Class<?> wildcardClass21 = contaCorrente2.getClass();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3988");
        codigos.Pedido pedido0 = new codigos.Pedido();
        float float4 = pedido0.calculaTaxaDesconto(true, "codigos.LadoInvalidoException: ", (float) (-1L));
        float float8 = pedido0.calculaTaxaDesconto(true, "EQUILATERO", (float) (byte) -1);
        float float12 = pedido0.calculaTaxaDesconto(false, "codigos.LadoInvalidoException: ", 80.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
    }

    @Test
    public void test3989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3989");
        codigos.Words words0 = new codigos.Words();
        int int2 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int4 = words0.countWords("NAO FORMA TRIANGULO");
        int int6 = words0.countWords("codigos.LadoInvalidoException: hi!");
        int int8 = words0.countWords("NAO FORMA TRIANGULO");
        int int10 = words0.countWords("");
        int int12 = words0.countWords("hi!");
        int int14 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!");
        int int16 = words0.countWords("codigos.LadoInvalidoException: EQUILATERO");
        int int18 = words0.countWords("codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: codigos.LadoInvalidoException: hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
    }

    @Test
    public void test3990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3990");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(16.0f, (-96.0f));
    }

    @Test
    public void test3991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3991");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = codigos.Triangulo.classificaTriangulo((int) (byte) 0, (int) (short) 1, 100);
            org.junit.Assert.fail("Expected exception of type codigos.LadoInvalidoException; message: lado invalido");
        } catch (codigos.LadoInvalidoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3992");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) 2, 9.0f);
        float float3 = contaCorrente2.getSaldo();
        float float5 = contaCorrente2.saque((float) 4);
        // The following exception was thrown during execution in test generation
        try {
            float float7 = contaCorrente2.saque((float) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Saldo Insuficiente");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3 == 2.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-2.0f) + "'", float5 == (-2.0f));
    }

    @Test
    public void test3993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3993");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 100, (-1.0f));
        contaCorrente2.setLimite((float) 0L);
        contaCorrente2.setLimite((float) (short) 0);
        float float8 = contaCorrente2.saque(68.0f);
        contaCorrente2.setSaldo((-41.0f));
        float float11 = contaCorrente2.getLimite();
        contaCorrente2.setSaldo(23.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 32.0f + "'", float8 == 32.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
    }

    @Test
    public void test3994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3994");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) 10, 0.0f);
        contaCorrente2.setSaldo((float) (byte) 0);
        float float5 = contaCorrente2.getSaldo();
        contaCorrente2.setLimite((float) (byte) 1);
        contaCorrente2.setLimite(68.0f);
        contaCorrente2.setSaldo(97.0f);
        float float12 = contaCorrente2.getLimite();
        contaCorrente2.setLimite((-66.0f));
        float float15 = contaCorrente2.getLimite();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 68.0f + "'", float12 == 68.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-66.0f) + "'", float15 == (-66.0f));
    }

    @Test
    public void test3995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3995");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((-90.0f), (float) (-1L));
        float float3 = contaCorrente2.getSaldo();
        float float4 = contaCorrente2.getSaldo();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-90.0f) + "'", float3 == (-90.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-90.0f) + "'", float4 == (-90.0f));
    }

    @Test
    public void test3996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3996");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente((float) (byte) -1, 0.0f);
    }

    @Test
    public void test3997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3997");
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
        codigos.LadoInvalidoException ladoInvalidoException90 = new codigos.LadoInvalidoException("codigos.LadoInvalidoException: hi!");
        codigos.LadoInvalidoException ladoInvalidoException92 = new codigos.LadoInvalidoException("hi!");
        ladoInvalidoException90.addSuppressed((java.lang.Throwable) ladoInvalidoException92);
        java.lang.Throwable[] throwableArray94 = ladoInvalidoException92.getSuppressed();
        java.lang.Throwable[] throwableArray95 = ladoInvalidoException92.getSuppressed();
        ladoInvalidoException84.addSuppressed((java.lang.Throwable) ladoInvalidoException92);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertNotNull(throwableArray64);
        org.junit.Assert.assertNotNull(throwableArray79);
        org.junit.Assert.assertNotNull(throwableArray81);
        org.junit.Assert.assertNotNull(throwableArray87);
        org.junit.Assert.assertNotNull(throwableArray94);
        org.junit.Assert.assertNotNull(throwableArray95);
    }

    @Test
    public void test3998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3998");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(92.0f, 29.0f);
    }

    @Test
    public void test3999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3999");
        codigos.ContaCorrente contaCorrente2 = new codigos.ContaCorrente(32.0f, (-32.0f));
        contaCorrente2.setSaldo(99.0f);
        contaCorrente2.setSaldo((-9.0f));
        contaCorrente2.setLimite(0.0f);
        float float9 = contaCorrente2.getLimite();
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
    }

    @Test
    public void test4000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test4000");
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
        int int22 = words0.countWords("");
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }
}

