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

    @Override
    public void pararMotor() {
        motorCombustionEncendido = false;
        System.out.println("El motor se ha parado.");
    }

    @Override
    public void mover() {
        if (motorCombustionEncendido == false) {
            System.out.println("El coche no se puede mover porque el motor no esta arrancado.");
            pararMotor();
        } else if (litrosCombustible > 0) {
            litrosCombustible--;
            System.out.println("El coche se ha movido. Se ha consumido 1 litro de combustible.");
        } else {
            System.out.println("El coche no se puede mover porque no tiene combustible.");
            pararMotor();
        }
    }

    // Este metodo lo cree para que se mostrara en la informacion del coche si el motor esta encendido o no, ya que el atributo es booleano 
    // y se lea mejor y mas claro todo.
    public String motorEncendido() {
        if (motorCombustionEncendido == true) {
            return "Si, el motor esta encendido";
        } else {
            return "No, el motor esta apagado";
        }
    }

    public void mostrarCocheCombustion() {
        System.out.println("--- Informacion del Coche ---");
        System.out.println("Color: " + color);
        System.out.println("Numero de puertas: " + numeroPuertas);
        System.out.println("Numero de ruedas: " + numeroRuedas);
        System.out.println("Modelo: " + modelo);
        System.out.println("Matricula: " + matricula);
        System.out.println("Motor encendido: " + motorEncendido());
        System.out.println("Litros de combustible: " + getLitrosCombustible());
        System.out.println();
    }

}
