package projetoepratica;

import java.util.Date;

public class pedido {

	Cliente cliente;
	private long id;
	private Date data;
	private double valorTotal;
	
	public void setId(int id){
		this.id = id;
	}
	
	public long getId(){
		return this.id;
	}
	public void setData(Date data){
		this.data = data;
	}
	public Date getData(){
		return this.data;
	}
	public void setValorTotal(double valorTotal){
		this.valorTotal = valorTotal;
	}
	public double getValorTotal(){
		return this.valorTotal;
	}
	
	
}
