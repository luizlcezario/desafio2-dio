package subsistema2.cep;

public class CepApi {
	private static CepApi instance = new CepApi();

	private CepApi() {
	}

	public static CepApi getInstance() {
		return instance;
	}
	public Sttring recuperarCidade(String cep){
		return "São Paulo";
	}
	public Sttring recuperarEstado(String cep){
		return "São Paulo";
	}
}
