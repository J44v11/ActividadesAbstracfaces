package net.salesianos.cochesdecombustion;

public class CocheCombustion extends Vehiculo {

    protected boolean motorCombustionEncendido;
    protected int litrosCombustible;

    public CocheCombustion(String color, int numeroPuertas, int numeroRuedas, String modelo, String matricula,
            boolean motorCombustionEncendido, int litrosCombustible) {
        super(color, numeroPuertas, numeroRuedas, modelo, matricula);
        this.motorCombustionEncendido = motorCombustionEncendido;
        this.litrosCombustible = litrosCombustible;
    }

}
