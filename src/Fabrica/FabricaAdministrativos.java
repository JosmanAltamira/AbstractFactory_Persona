package Fabrica;
import interfaces.Persona;
import interfaces.PersonaTrabajo;

import javax.swing.JOptionPane;

import clases.Administrativo;

/**
 * Clase que permite la creacion de un objeto Administrativo / Buseta
 * @author chenao
 *
 */
public class FabricaAdministrativos implements PersonaTrabajo{
 @Override
 public Persona crearHumano() {
  Administrativo miAdministrativo=new Administrativo();
  miAdministrativo.setCodigo(miAdministrativo.generarCodigo());
  miAdministrativo.setNombre(miAdministrativo.crearNombre());
 JOptionPane.showMessageDialog(null, "Se ha creado un nuevo Objeto Administrativo");
  return miAdministrativo;
 }
}