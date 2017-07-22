package units;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import sources.Conta;

public class ContaTest {
	
	Conta conta;
	
	@Before
	public void setUp(){
		conta = new Conta("Maria","12345678");
	}

	@Test
	public void testaSaque() {
		assertFalse(conta.saca(300));
		conta.deposita(100);
		assertTrue(conta.saca(50));
	}

	@Test
	public void testaChecaSenha(){
		assertFalse(conta.checaSenha("12345689"));
		assertTrue(conta.checaSenha("12345678"));
	}
	
	@Test
	public void testaSaldo(){
		conta.deposita(250);
		assertEquals(250,conta.verSaldo());
	}
	
}
