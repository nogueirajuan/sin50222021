/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 28 05:19:42 GMT 2021
 */

package codigos;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import codigos.ContaCorrente;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ContaCorrente_ESTest extends ContaCorrente_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ContaCorrente contaCorrente0 = new ContaCorrente(0.0F, 0.0F);
      try { 
        contaCorrente0.saque(0.0F);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Valor invalido
         //
         verifyException("codigos.ContaCorrente", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ContaCorrente contaCorrente0 = new ContaCorrente(1967.0F, 1967.0F);
      float float0 = contaCorrente0.saque(790.8525F);
      assertEquals(1176.1475F, contaCorrente0.getSaldo(), 0.01F);
      assertEquals(1176.1475F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ContaCorrente contaCorrente0 = new ContaCorrente(0.0F, 0.0F);
      contaCorrente0.setLimite(1.0F);
      float float0 = contaCorrente0.saque(1.0F);
      assertEquals((-1.0F), contaCorrente0.getSaldo(), 0.01F);
      assertEquals((-1.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ContaCorrente contaCorrente0 = new ContaCorrente(0.0F, 0.0F);
      float float0 = contaCorrente0.getSaldo();
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ContaCorrente contaCorrente0 = new ContaCorrente(0.0F, 0.0F);
      contaCorrente0.setSaldo((-1822.6544F));
      float float0 = contaCorrente0.getSaldo();
      assertEquals((-1822.6544F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ContaCorrente contaCorrente0 = new ContaCorrente(0.0F, 0.0F);
      float float0 = contaCorrente0.getLimite();
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ContaCorrente contaCorrente0 = new ContaCorrente((-2325.702F), 1591.6908F);
      float float0 = contaCorrente0.getLimite();
      assertEquals(1591.6908F, float0, 0.01F);
      assertEquals((-2325.702F), contaCorrente0.getSaldo(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ContaCorrente contaCorrente0 = new ContaCorrente((-2325.702F), 1591.6908F);
      try { 
        contaCorrente0.saque(1591.6908F);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Saldo Insuficiente
         //
         verifyException("codigos.ContaCorrente", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ContaCorrente contaCorrente0 = new ContaCorrente(2786.119F, 2786.119F);
      try { 
        contaCorrente0.saque((-753.2593F));
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Valor invalido
         //
         verifyException("codigos.ContaCorrente", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ContaCorrente contaCorrente0 = new ContaCorrente(2786.119F, 2786.119F);
      float float0 = contaCorrente0.saque(2786.119F);
      assertEquals(0.0F, contaCorrente0.getSaldo(), 0.01F);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ContaCorrente contaCorrente0 = new ContaCorrente((-425.23947F), (-425.23947F));
      float float0 = contaCorrente0.getLimite();
      assertEquals((-425.23947F), contaCorrente0.getSaldo(), 0.01F);
      assertEquals((-425.23947F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ContaCorrente contaCorrente0 = new ContaCorrente(2786.119F, 2786.119F);
      float float0 = contaCorrente0.getSaldo();
      assertEquals(2786.119F, float0, 0.01F);
      assertEquals(2786.119F, contaCorrente0.getLimite(), 0.01F);
  }
}
