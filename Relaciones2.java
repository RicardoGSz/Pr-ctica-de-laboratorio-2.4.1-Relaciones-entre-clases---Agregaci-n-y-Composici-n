package relaciones2;

class CuerpoHumano {
    private Corazon corazon;
    private Pulmon pulmon;
    private Higado higado;
    private Apendice apendice;

    public CuerpoHumano(Corazon corazon, Pulmon pulmon, Higado higado, Apendice apendice) {
        this.corazon = corazon;
        this.pulmon = pulmon;
        this.higado = higado;
        this.apendice = apendice;
    }

    public Corazon getCorazon() {
        return corazon;
    }

    public void setCorazon(Corazon corazon) {
        this.corazon = corazon;
    }

    public Pulmon getPulmon() {
        return pulmon;
    }

    public void setPulmon(Pulmon pulmon) {
        this.pulmon = pulmon;
    }

    public Higado getHigado() {
        return higado;
    }

    public void setHigado(Higado higado) {
        this.higado = higado;
    }

    public Apendice getApendice() {
        return apendice;
    }

    public void setApendice(Apendice apendice) {
        this.apendice = apendice;
    }

    public void mostrarInfo() {
        System.out.println("Cuerpo humano:");
        System.out.println("Corazón: " + corazon.getTipo());
        System.out.println("Pulmón: " + pulmon.getTipo());
        System.out.println("Hígado: " + higado.getTipo());
        System.out.println("Apendice: " + apendice.getTipo());
    }
}

class Corazon {
    private String tipo;
    private int pulsaciones;

    public Corazon(String tipo, int pulsaciones) {
        this.tipo = tipo;
        this.pulsaciones = pulsaciones;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPulsaciones() {
        return pulsaciones;
    }

    public void setPulsaciones(int pulsaciones) {
        this.pulsaciones = pulsaciones;
    }
}

class Pulmon {
    private String tipo;
    private double capacidad;

    public Pulmon(String tipo, double capacidad) {
        this.tipo = tipo;
        this.capacidad = capacidad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }
}

class Higado {
    private String tipo;
    private double peso;

    public Higado(String tipo, double peso) {
        this.tipo = tipo;
        this.peso = peso;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}

class Apendice {
    private String tipo;
    private boolean presente;

    public Apendice(String tipo, boolean presente) {
        this.tipo = tipo;
        this.presente = presente;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isPresente() {
        return presente;
    }

    public void setPresente(boolean presente) {
        this.presente = presente;
    }
}

public class Relaciones2 {
    public static void main(String[] args) {
        Corazon corazon = new Corazon("Normal", 70);
        Pulmon pulmon = new Pulmon("Derecho", 3.5);
        Higado higado = new Higado("Normal", 1.5);
        Apendice apendice = new Apendice("Normal", true);

        CuerpoHumano cuerpoHumano = new CuerpoHumano(corazon, pulmon, higado, apendice);
        cuerpoHumano.mostrarInfo();
    }
}
