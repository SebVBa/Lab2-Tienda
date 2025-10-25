/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Facturacion;

import Clientes.Cliente;
import java.time.LocalDateTime;
import java.util.List;

/**
 *
 * @author Luisk
 */
public class FacturaMemento {
    private final int numero;
    private final Cliente cliente;
    private final LocalDateTime fecha;
    private final List<ItemFactura> items;
    private final EstadoFactura estado;

    public int getNumero() { 
        return numero; 
    }
    public Cliente getCliente() { 
        return cliente; 
    }
    public LocalDateTime getFecha() { 
        return fecha; 
    }
    public List<ItemFactura> getItems() { 
        return items; 
    }
    public EstadoFactura getEstado() { 
        return estado; 
    }
    
     public FacturaMemento(int numero, Cliente cliente, LocalDateTime fecha, List<ItemFactura> items, EstadoFactura estado) {
        this.numero = numero;
        this.cliente = cliente;
        this.fecha = fecha;
        this.items = List.copyOf(items); 
        this.estado = estado;
    }
}
