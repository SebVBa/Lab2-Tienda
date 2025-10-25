/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Facturacion;

/**
 *
 * @author sebas
 */
public class EstadoAnulada implements EstadoFactura {

    @Override
    public void emitida(Factura factura) {
        System.out.println("La factura está anulada");
    }

    @Override
    public void pagada(Factura factura) {
        System.out.println("La factura está anulada");    }

    @Override
    public void anulada(Factura factura) {
        System.out.println("La factura está anulada");
    }

    @Override
    public void Pendiente(Factura factura) {
        System.out.println("La factura está anulada");
    }
    
}
