package subsistema1.crm;

public class CrmService {
	private CrmService(){}
	public void graverCliente(String name, String cep, String cidade, String estado){
		System.out.println("Cliente salvo no sistema");
		System.out.println("Nome: " + name);
		System.out.println("CEP: " + cep);
		System.out.println("Cidade: " + cidade);
		System.out.println("Estado: " + estado);
		
	}
}
