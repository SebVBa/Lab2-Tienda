/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clientes;

/**
 *
 * @author ilope
 */
public class PagoEfectivo implements StrategyPago{
    @Override
    public void procesarPago(double monto, String detalles) {
        System.out.println("💵 Pago en efectivo recibido. Monto: ₡" + monto);
    }
}
