package model.competicion;

import java.time.LocalDate;

public class PlazoCancelacionDto {

	public String id;
	public double porcentaje;
	public LocalDate fechaInicio;
	public LocalDate fechaFin;
	public String idCompeticion;

	public String getFechaInicio() {
		return fechaInicio.toString();
	}

	public void setFechaInicio(String fechaInicio) {
		this.fechaInicio = LocalDate.parse(fechaInicio);
	}

	public String getFechaFin() {
		return fechaFin.toString();
	}

	public void setFechaFin(String fechaFin) {
		this.fechaFin = LocalDate.parse(fechaFin);
	}

	public String getCuota() {
		return porcentaje + "";
	}

	public void setCuota(String porcentaje) {
		this.porcentaje= Double.parseDouble(porcentaje);
	}

	public String getIdCompeticion() {
		return idCompeticion;
	}

	public void setIdCompeticion(String idCompeticion) {
		this.idCompeticion = idCompeticion;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	
	
	

}
