package com.lucas.model;

/*nro. de dominio, fecha de alta, estado del bien) asociados a múltiples contratos 
 * (número Contrato, fecha alta, fecha última modificación, monto).
 */
public class Patente {
	private String numeroDominio;
	private String fechaAlta;
	private String estado;
		
	public Patente() {

	}

	public Patente(String numeroDominio, String fechaAlta, String estado) {
		this.numeroDominio = numeroDominio;
		this.fechaAlta = fechaAlta;
		this.estado = estado;
		
	}

	public String getNumeroDominio() {
		return numeroDominio;
	}

	public void setNumeroDominio(String numeroDominio) {
		this.numeroDominio = numeroDominio;
	}

	public String getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(String fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
		

}
