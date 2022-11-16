package Fabrica;
import interfaces.Persona;
import interfaces.PersonaTrabajo;

import javax.swing.JOptionPane;

import clases.Empleado;

/**
 * Clase que permite la creacion de un objeto Empleado / Taxi
 * @author chenao
 *
 */
public class FabricaEmpleados implements PersonaTrabajo{
 @Override
 public Persona crearHumano() {
  Empleado miEmpleado=new Empleado();
  miEmpleado.setCodigo(miEmpleado.generarCodigo());
  JOptionPane.showMessageDialog(null, "Se ha creado un nuevo Objeto Empleado");
  return miEmpleado;
 }
}