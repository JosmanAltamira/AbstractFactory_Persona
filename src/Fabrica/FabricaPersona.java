package Fabrica;

import interfaces.Persona;
import interfaces.PersonaTrabajo;

/**
 * Clase que permite la creacion de un servicio 
 * @author chenao
 *
 */
public class FabricaPersona {
 public static void crearCrearPersona(PersonaTrabajo factory){
  /**Aplicamos Polimorfismo*/
  Persona objetoHumano= factory.crearHumano();
  objetoHumano.codigoDeHumano();
 
 }
}