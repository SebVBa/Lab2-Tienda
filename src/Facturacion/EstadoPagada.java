/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Facturacion;

/**
 *
 * @author sebas
 */
public class EstadoPagada implements EstadoFactura{

    @Override
    public void emitida(Factura factura) {
        System.out.println("La factura ya fue pagada, no se puede emitir otra vez");
    }

    @Override
    public void pagada(Factura factura) {
        System.out.println("La factura ya está pagada");
    }

    @Override
    public void anulada(Factura factura) {
        System.out.println("Factura anulada");
        factura.setEstado(new EstadoAnulada());
    }

    @Override
    public void Pendiente(Factura factura) {
        System.out.println("No se puede volver a pendiente, ya está pagada");
    }
    
}
