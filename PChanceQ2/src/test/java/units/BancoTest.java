package units;

import static org.junit.Assert.*;

import org.junit.Test;

import sources.Banco;

public class BancoTest {

	
	@Test
	public void testaConflito() {
		Banco.criaConta("Roberto", "12345678");
		
		assertFalse(Banco.criaConta("Roberto", "5837379"));
	}

}
