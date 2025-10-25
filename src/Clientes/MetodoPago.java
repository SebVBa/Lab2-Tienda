/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clientes;

/**
 *
 * @author jprod
 */
public class MetodoPago {
    private int id;
    private TipoMetodoPago tipo;
    private String detalles;
    private StrategyPago estrategia;

    public MetodoPago(int id, TipoMetodoPago tipo, String detalles) {
        this.id = id;
        this.tipo = tipo;
        this.detalles = detalles;
        this.estrategia = crearEstrategia(tipo);
    }

    private StrategyPago crearEstrategia(TipoMetodoPago tipo) {
        return switch (tipo) {
            case TARJETA -> new PagoTarjeta();
            case TRANSFERENCIA -> new PagoTransferencia();
            case EFECTIVO -> new PagoEfectivo();
        };
    }

    public void ejecutarPago(double monto) {
        estrategia.procesarPago(monto, detalles);
    }

    public int getId() { return id; }
    public TipoMetodoPago getTipo() { return tipo; }
    public String getDetalles() { return detalles; }

    @Override
    public String toString() {
        return "MetodoPago{id=" + id + ", tipo=" + tipo + ", detalles='" + detalles + "'}";
    }
}