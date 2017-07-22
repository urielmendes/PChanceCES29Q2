package units;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import sources.Banco;

public class BancoIT {
	
	@Before
	public void setUp(){
		Banco.criaConta("Joao", "98765432");
	}
	
	@Test(expected = Exception.class)
	public void testaSenhaIncorretaSaldo() throws Exception {
		Banco.verSaldo("Joao", "12345678");
	}
	
	@Test(expected = Exception.class)
	public void testaSenhaIncorretaSaque() throws Exception {
		Banco.verSaldo("Joao", "12345678");
	}
	
	@Test
	public void testaConflitoNome(){
		assertFalse(Banco.criaConta("Joao", "23456789"));
	}
	
	@Test(expected = Exception.class)
	public void testaUsuarioInexistent() throws Exception{
		Banco.verSaldo("Roberto", "98765432");
	}
}
