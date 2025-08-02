package empresa.com.app.model;

import java.util.Date;

public class Orden {
	private Integer id_orden;
	private Integer id_cliente;
	private Integer numero;
	private Date fechacreacion;
	private Date fecharecibida;
	private Double total;
	public Orden() {
	}
	public Orden(Integer id_orden, Integer id_cliente, Integer numero, Date fechacreacion, Date fecharecibida,
			Double total) {
		super();
		this.id_orden = id_orden;
		this.id_cliente = id_cliente;
		this.numero = numero;
		this.fechacreacion = fechacreacion;
		this.fecharecibida = fecharecibida;
		this.total = total;
	}
	public Integer getId_orden() {
		return id_orden;
	}
	public void setId_orden(Integer id_orden) {
		this.id_orden = id_orden;
	}
	public Integer getId_cliente() {
		return id_cliente;
	}
	public void setId_cliente(Integer id_cliente) {
		this.id_cliente = id_cliente;
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public Date getFechacreacion() {
		return fechacreacion;
	}
	public void setFechacreacion(Date fechacreacion) {
		this.fechacreacion = fechacreacion;
	}
	public Date getFecharecibida() {
		return fecharecibida;
	}
	public void setFecharecibida(Date fecharecibida) {
		this.fecharecibida = fecharecibida;
	}
	public Double getTotal() {
		return total;
	}
	public void setTotal(Double total) {
		this.total = total;
	}
	@Override
	public String toString() {
		return "Orden [id_orden=" + id_orden + ", id_cliente=" + id_cliente + ", numero=" + numero + ", fechacreacion="
				+ fechacreacion + ", fecharecibida=" + fecharecibida + ", total=" + total + "]";
	}
	
	
}
