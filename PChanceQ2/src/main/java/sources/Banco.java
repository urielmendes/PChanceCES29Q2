package sources;

import java.util.HashMap;

public class Banco {
	
	private Banco(){
		
	}
	
	//banco de dados
	private static HashMap<String,Conta> _bd = new HashMap<String, Conta>();
	
	public static boolean criaConta(String usuario, String senha){
		if(!_bd.containsKey(usuario)){
			_bd.put(usuario, new Conta(usuario, senha));
			return true;
		}
		return false;
	}
	
	public static int verSaldo(String usuario, String senha) throws Exception{
		if(_bd.containsKey(usuario) &&_bd.get(usuario).checaSenha(senha)){
			return _bd.get(usuario).verSaldo();
		}
		else
			throw new Exception("senha ou usuario invalido");
	}
	
	/*Qualquer pode depositar seu dinheiro em qualquer conta,
	 *entao nao sera solicitada senha*/
	public static boolean deposita(String usuario, int quantia){
		if(_bd.containsKey(usuario)){
			_bd.get(usuario).deposita(quantia);
			return true;
		}
		else
			return false;
	}
	
	public static boolean saca(String usuario, String senha, int quantia) throws Exception{
		if(_bd.containsKey(usuario) &&_bd.get(usuario).checaSenha(senha)){
			return _bd.get(usuario).saca(quantia);
		}
		else
			throw new Exception("senha ou usuario invalido"); 
	}
	
	

}
