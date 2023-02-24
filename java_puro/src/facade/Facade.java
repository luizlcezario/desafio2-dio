package facade;

import subsistema2.cep.CepApi;
import subsistema1.crm.CrmService;
public class Facade {
	private static Facade instance = new Facade();
	private Facade(){}
	public getInstance(){
		return instance;
	}
	public void migrarCliente(String name,String cep){
		String cidade = CepApi.getInstance().recuperarCidade(cep);
		String estao = CepApi.getInstance().recuperarCidade(cep);
		CrmService.graverCliente(name,cep,cidade,estado);
	}
}
