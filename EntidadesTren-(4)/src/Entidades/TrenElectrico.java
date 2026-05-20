package Entidades;

import java.util.ArrayList;

/*
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class TrenElectrico extends Tren {

    //ATRIBUTOS
    protected ArrayList<Pasajero> pasajeros;

    //CONSTRUCTORES
    public TrenElectrico(int cantMaxPasajeros, String destino) {
        super(cantMaxPasajeros, destino);
        this.pasajeros = new ArrayList<>();
    }
    
    //PROPIEDADES
    @Override
    public ArrayList<Pasajero> getPasajeros() {
        return pasajeros;
    }
    
    //METODOS
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        sb.append("\n--- TREN ELECTRICO ---");
        sb.append(super.toString());
        
        return sb.toString();
    }

}