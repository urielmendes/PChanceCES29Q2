package sources;

public class Conta {
	
	private String _dono, _senha;
	private int _saldo;
	
	public Conta(String _owner, String _password) {
		super();
		this._dono = _owner;
		this._senha = _password;
		_saldo = 0;
	}

	public String verDono(){
		return this._dono;
	}
	
	
	public boolean saca(int money){
		if(_saldo >= money){
			_saldo = _saldo - money;
			return true;
		}
		else
			return false;
	}
	
	public int verSaldo(){
		return _saldo;
	}
	
	public void deposita(int money){
		_saldo = _saldo + money;
	}
	
	public boolean mudaSenha(){
		return true;
	}
	
	public boolean checaSenha(String password){
		if(password == this._senha)
			return true;
		else
			return false;
	}
}
