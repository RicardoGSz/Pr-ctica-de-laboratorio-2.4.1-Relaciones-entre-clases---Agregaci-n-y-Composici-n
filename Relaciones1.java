package relaciones1;
import java.util.Scanner;

class Rueda{
    int libras;
    int pul_rin;
    int peso;
    
    public void Rueda(int libras, int pul_rin, int peso){
        this.libras = libras;
        this.pul_rin = pul_rin;
        this.peso = peso;
    }
    
    public int getRodada(){
        return libras;
    }
    
    public int getRin(){
        return pul_rin;
    }
    
    public int getPeso(){
        return peso;
    }
}

class Cuadro{
    String material;
    String tipo;
    double tamaño;
    
    public void Cuadro(String material, String tipo, double tamaño){
        this.material = material;
        this.tipo = tipo;
        this.tamaño = tamaño;
    }
    
    public String getMaterial(){
        return material;
    }
    
    public String getTipo(){
        return tipo;
    }
    
    public double getTamano(){
        return tamaño;
    }
}

class Bicicleta{
    String color;
    String tipo_estructura;
    String asiento;
    Cuadro cuadro = new Cuadro();
    Rueda rueda = new Rueda();
    
    public void Bicicleta(String color, String tipo_estructura, String asiento){
        this.color = color;
        this.tipo_estructura = tipo_estructura;
        this.asiento = asiento;
    }
    
    public String getColor(){
        return color;
    }
    
    public String getTipo(){
        return tipo_estructura;
    }
    
    public String getAsiento(){
        return asiento;
    }
    
}


public class Relaciones1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Bicicleta bici = new Bicicleta();
        
        System.out.println("Ingresa el color de la bicicleta");
        bici.color = entrada.nextLine();
        System.out.println("Ingresa el tipo de bicicleta que es: ");
        bici.tipo_estructura = entrada.nextLine();
        System.out.println("Ingresa el tipo de asiento: ");
        bici.asiento = entrada.nextLine();
        
        System.out.println("Ingresa las libras de la llanta: ");
        bici.rueda.libras = entrada.nextInt();
        System.out.println("Ingresa las pulgadas de rin: ");
        bici.rueda.pul_rin = entrada.nextInt();
        System.out.println("Ingresa el peso de una llanta: ");
        bici.rueda.peso = entrada.nextInt();
        
        System.out.println("Ingrese el tipo de material del cuadro: ");
        bici.cuadro.material = entrada.next();
        System.out.println("Ingrese el tipo de bicicleta que es: ");
        bici.cuadro.tipo = entrada.next();
        System.out.println("Ingresa el tamaño de la bicicleta: ");
        bici.cuadro.tamaño = entrada.nextDouble();
        
        System.out.println("Color: " + bici.getColor());
        System.out.println("Tipo de estructura: " + bici.getTipo());
        System.out.println("Tipo de asiento: " + bici.getAsiento());
        
        System.out.println("Libras de cada llanta: " + bici.rueda.getRodada());
        System.out.println("Tamaño del rin: " + bici.rueda.getRin());
        System.out.println("El peso de una llanta es de: " + bici.rueda.getPeso());
        
        System.out.println("Material del cuadro: " + bici.cuadro.getMaterial());
        System.out.println("Tipo de bicicleta: " + bici.cuadro.getTipo());
        System.out.println("El tamaño de la bicicleta: " + bici.cuadro.getTamano());
    }
}
