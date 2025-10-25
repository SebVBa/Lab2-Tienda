/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Facturacion;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 *
 * @author Luisk
 */
public class HistorialFacturas {
   private final Map<Integer, Stack<FacturaMemento>> historial = new HashMap<>();

    public void guardarEstado(Factura factura) {
        historial
            .computeIfAbsent(factura.getNumero(), k -> new Stack<>())
            .push(factura.crearMemento());
    }

    public void restaurarUltimoEstado(Factura factura) {
        Stack<FacturaMemento> pila = historial.get(factura.getNumero());
        if (pila != null && !pila.isEmpty()) {
            FacturaMemento memento = pila.pop();
            factura.restaurarDesdeMemento(memento);
        }
    }
}
