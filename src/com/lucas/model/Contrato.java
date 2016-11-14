package com.lucas.model;
/*(número Contrato, fecha 
 * alta, fecha última modificación, monto).
 */
public class Contrato {
	private String numero;
	private String fechaModificado;
	private Float monto;
	private Patente patente;

	public Contrato() {

	}

	public Contrato(String numero, String fechaModificado, Float monto) {
		this.numero = numero;
		this.fechaModificado = fechaModificado;
		this.monto = monto;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getFechaModificado() {
		return fechaModificado;
	}

	public void setFechaModificado(String fechaModificado) {
		this.fechaModificado = fechaModificado;
	}

	public Float getMonto() {
		return monto;
	}

	public void setMonto(Float monto) {
		this.monto = monto;
	}

	public Patente getPatente() {
		return patente;
	}

	public void setPatente(Patente patente) {
		this.patente = patente;
	}
	
	
	
	
	
	
	
	

}
