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

    public boolean getMotorCombustionEncendido() {
        return motorCombustionEncendido;
    }

    public void setMotorCombustionEncendido(boolean motorCombustionEncendido) {
        this.motorCombustionEncendido = motorCombustionEncendido;
    }

    public int getLitrosCombustible() {
        return litrosCombustible;
    }

    public void setLitrosCombustible(int litrosCombustible) {
        this.litrosCombustible = litrosCombustible;
    }

    @Override
    public void arrancar() {
        if (litrosCombustible > 0) {
            litrosCombustible--;
            motorCombustionEncendido = true;
            System.out.println("El coche ha arrancado. Se ha consumido 1 litro de combustible.");
        } else {
            motorCombustionEncendido = false;
            System.out.println("El coche no puede arrancar porque no tiene combustible.");
        }
    }

}
