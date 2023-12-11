package service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import model.Pedido;

public class PedidoService {
	//ArrayList<Pedido> pedidos=new ArrayList<>();
	List<Pedido> pedidos=new ArrayList<>();
	
	public void guardarPedido(String producto, LocalDate fechaPedido,double precio) {
		pedidos.add(new Pedido(producto,fechaPedido,precio));
	}
	
	/*public Pedido pedidoMasReciente() {
		Pedido pedido=pedidos.get(0);
		LocalDate fechaReciente=pedido.getFechaPedido();
		for(Pedido p:pedidos) {
			if(p.getFechaPedido().isAfter(fechaReciente)) { //si encontramos una fecha más reciente, actualizamos variables
				fechaReciente=p.getFechaPedido();
				pedido=p;
			}
		}
		return pedido;
	}*/
	
	// **** CON STREAM ****
	public Pedido pedidoMasReciente() {
		return pedidos.stream()//Stream<Pedido>
				.max((a,b)->a.getFechaPedido().compareTo(b.getFechaPedido()))//encapsulado en un Optional
				.orElse(null);
	}
	
	/*public ArrayList<Pedido> pedidosPrecio(double precioMax) {
		ArrayList<Pedido> resultado=new ArrayList<Pedido>();
		for(Pedido p:pedidos) {
			if(p.getPrecio()<precioMax) {
				resultado.add(p);
			}
		}
		return resultado;
	}*/
	
	// **** CON STREAM ****
	public List<Pedido> pedidosPrecio(double precioMax){
		return pedidos.stream()
			.filter(p->p.getPrecio()<precioMax)//Stream<Pedido>
			.toList();			
	}
	
	/*public ArrayList<Pedido> anteriores(int meses){
		ArrayList<Pedido> resultado=new ArrayList<Pedido>();
		//fecha actual
		//LocalDate referencia=LocalDate.now();
		//fecha del pedido
		//LocalDate fechaPedido=fechaHoy.minusMonths(meses);
		//De una vez
		LocalDate referencia=LocalDate.now().minusMonths(meses);
		for(Pedido p:pedidos) {	
			if(p.getFechaPedido().isBefore(referencia)) {
			resultado.add(p);
			}
		}
		return resultado;
	}*/
	
	// **** CON STREAM ****
	public List<Pedido> anteriores(int meses){
		return pedidos.stream()
				.filter(p->p.getFechaPedido().isBefore(LocalDate.now().minusMonths(meses)))
				.toList();
	}
	
	//Nuevo método
	//Devuelve una tabla con una partición de pedidos, caros los que tienen un precio superior a la media
	//y baratos los que tienen un precio inferior a la media
	public Map<Boolean,List<Pedido>> pedidosAgrupados(){
		double media=pedidos.stream()
				.collect(Collectors.averagingDouble(p->p.getPrecio()));
		return pedidos.stream()
				.collect(Collectors.partitioningBy(p->p.getPrecio()>media));		
	}

}
