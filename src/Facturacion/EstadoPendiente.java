/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Facturacion;

/**
 *
 * @author sebas
 */
public class EstadoPendiente implements EstadoFactura{

    @Override
    public void emitida(Factura factura) {
        System.out.println("La factura fue emitida");
        factura.setEstado(new EstadoEmitida());
    }

    @Override
    public void pagada(Factura factura) {
        System.out.println("No se puede pagar, la fatura no se emitió");
    }

    @Override
    public void anulada(Factura factura) {
        System.out.println("Factura anulada");
        factura.setEstado(new EstadoAnulada());
    }

    @Override
    public void Pendiente(Factura factura) {
        System.out.println("Ya está en estado pendiente");
    }
    
}
