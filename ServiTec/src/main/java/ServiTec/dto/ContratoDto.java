package ServiTec.dto;

public class ContratoDto {

	private int nContrato;
	
	private ClienteDto clienteDto;
	
	private String fDesde;

	private String fHasta;

	private int nPeriodicidad;
	
	// Constructor x defecto
	public ContratoDto() {}

	// Constructor general
	public ContratoDto
		(int nContrato, ClienteDto clienteDto, String fDesde, String fHasta, int nPeriodicidad) 
	{
		this.nContrato = nContrato;
		this.clienteDto = clienteDto;
		this.fDesde = fDesde;
		this.fHasta = fHasta;
		this.nPeriodicidad = nPeriodicidad;
	}

	
	public int getnContrato() {
		return nContrato;
	}

	public void setnContrato(int nContrato) {
		this.nContrato = nContrato;
	}

	public ClienteDto getCliente() {
		return clienteDto;
	}

	public void setCliente(ClienteDto clienteDto) {
		this.clienteDto = clienteDto;
	}

	public String getfDesde() {
		return fDesde;
	}

	public void setfDesde(String fDesde) {
		this.fDesde = fDesde;
	}

	public String getfHasta() {
		return fHasta;
	}

	public void setfHasta(String fHasta) {
		this.fHasta = fHasta;
	}

	public int getnPeriodicidad() {
		return nPeriodicidad;
	}

	public void setnPeriodicidad(int nPeriodicidad) {
		this.nPeriodicidad = nPeriodicidad;
	}

}
