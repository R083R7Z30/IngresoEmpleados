
package ec.edu.intsuperior.modelo;

public class Vehiculo {
    
   String marca;
   int modelo;
   int motor;
   public enum tipoCom {GASOLINA, BIOETANOL, DIESEL, BIODISESEL,GAS_NATURAL}
   tipoCom tipoCombustible;
   public enum tipoA {CIUDAD, SUBCOMPACTO, COMPACTO, FAMILIAR,EJECUTIVO, SUV}
   public tipoA tipoAutomóvil;
   int númeroPuertas;
   int cantidadAsientos;
   int velocidadMáxima;
   public enum tipoColor {BLANCO, NEGRO, ROJO, NARANJA,AMARILLO, VERDE, AZUL, VIOLETA}
   tipoColor color;
   public int velocidadActual = 0;

public Vehiculo(String marca, int modelo, int motor, tipoCom
tipoCombustible, tipoA tipoAutomóvil, int númeroPuertas, int
cantidadAsientos, int velocidadMáxima, tipoColor color) {
    this.marca = marca;
    this.modelo = modelo;
    this.motor = motor;
    this.tipoCombustible = tipoCombustible;
    this.tipoAutomóvil = tipoAutomóvil;
    this.númeroPuertas = númeroPuertas;
    this.cantidadAsientos = cantidadAsientos;
    this.velocidadMáxima = velocidadMáxima;
    this.color = color;
}

   String getMarca() {
    return marca;
}

   int getModelo() {
    return modelo;
}
   int getMotor() {
    return motor;
}
   tipoCom getTipoCombustible() {
    return tipoCombustible;
}
   tipoA getTipoAutomóvil() {
    return tipoAutomóvil;
}
   int getNúmeroPuertas() {
    return númeroPuertas;
}
   int getCantidadAsientos() {
    return cantidadAsientos;
}
   int getVelocidadMáxima() {
    return velocidadMáxima;
}
   tipoColor getColor() {
    return color;
}
   int getVelocidadActual() {
    return velocidadActual;
}
   public void setMarca(String marca) {
    this.marca = marca;
}
   public void setModelo(int modelo) {
    this.modelo = modelo;
}
   public void setMotor(int motor) {
    this.motor = motor;
}
   public void setTipoCombustible(tipoCom tipoCombustible) {
    this.tipoCombustible = tipoCombustible;
}
   public void setTipoAutomóvil(tipoA tipoAutomóvil) {
    this.tipoAutomóvil = tipoAutomóvil;
}
   public void setNúmeroPuertas(int númeroPuertas) {
    this.númeroPuertas = númeroPuertas;
}
   public void setCantidadAsientos(int cantidadAsientos) {
    this.cantidadAsientos = cantidadAsientos;
}
   public void setVelocidadMáxima(int velocidadMáxima) {
    this.velocidadMáxima = velocidadMáxima;
}
   public void setColor(tipoColor color) {
    this.color = color;
}
   public void setVelocidadActual(int velocidadActual) {
    this.velocidadActual = velocidadActual;
}
   public void acelerar(int incrementoVelocidad) {
     if (velocidadActual + incrementoVelocidad < velocidadMáxima) {

     velocidadActual = velocidadActual + incrementoVelocidad;
     } else {
   System.out.println("No se puede incrementar a una velocidad superior a la máxima del automóvil");
    }
  }
  public void desacelerar(int decrementoVelocidad) {

 if ((velocidadActual - decrementoVelocidad) > 0) {
   velocidadActual = velocidadActual - decrementoVelocidad;
    } else { 
  System.out.println("No se puede decrementar a una velocidad negativa");
   }
 }

  public void frenar() {
 velocidadActual = 0;
}

 public double calcularTiempoLlegada(int distancia) {
    return distancia/velocidadActual;
}

 public void imprimir() {
 System.out.println("Marca = “ + marca");
 System.out.println("Modelo = “ + modelo");
 System.out.println("Motor = “ + motor");
 System.out.println("Tipo de combustible = “ + tipoCombustible");
 System.out.println("Tipo de automóvil = “ + tipoAutomóvil");
 System.out.println("Número de puertas = “ + númeroPuertas"); 
 
 System.out.println("Cantidad de asientos = " + cantidadAsientos);
 System.out.println("Velocida máxima =" + velocidadMáxima);
 System.out.println("Color = " + color);
 }
}