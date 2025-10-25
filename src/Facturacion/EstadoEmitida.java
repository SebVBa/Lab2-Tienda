/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Facturacion;

/**
 *
 * @author sebas
 */
public class EstadoEmitida implements EstadoFactura{

    @Override
    public void emitida(Factura factura) {
        System.out.println("Ya está emitida");
    }

    @Override
    public void pagada(Factura factura) {
        System.out.println("Pagado");
        factura.setEstado(new EstadoPagada());
    }

    @Override
    public void anulada(Factura factura) {
        System.out.println("Factura anulada");
        factura.setEstado(new EstadoAnulada());
    }

    @Override
    public void Pendiente(Factura factura) {
        System.out.println("Volviendo a pendiente");
        factura.setEstado(new EstadoPendiente());
    }
    
}
