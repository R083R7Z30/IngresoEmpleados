
package ec.edu.intsuperior.vista;

import ec.edu.intsuperior.modelo.Clase1;
import ec.edu.intsuperior.modelo.Vehiculo;

public class Aplicacion {
    public static void main(String[] args) {
        Clase1 obj=new Clase1();
        Clase1.metodoClase_1();
        Clase1.metodoClase_2();
        obj.metodoInstancia_1();
        obj.metodoInstancia_2();
        obj.metodoInstancia_3();
   
  Vehiculo auto1 = new
Vehiculo("Ford",2018,3,Vehiculo.tipoCom.DIESEL,Vehiculo.tipoA.EJECUTIVO,5,6,250,Vehiculo.tipoColor.NEGRO);
   auto1.imprimir();
   auto1.setVelocidadActual(100);
  System.out.println("Velocidad actual = " + auto1.velocidadActual);
   auto1.acelerar(20);
  System.out.println("Velocidad actual = " + auto1.velocidadActual);
   auto1.desacelerar(50);
  System.out.println("Velocidad actual = " + auto1.
   velocidadActual);
   auto1.frenar();
  System.out.println("Velocidad actual = " + auto1.velocidadActual);
   auto1.desacelerar(20);
 } 
}
