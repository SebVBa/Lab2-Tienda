/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Facturacion;

/**
 *
 * @author jprod
 */
public interface EstadoFactura {
    void emitida(Factura factura);
    void pagada(Factura factura);
    void anulada(Factura factura);
    void Pendiente(Factura factura);
}
