package Fabrica;
import interfaces.Persona;
import interfaces.PersonaTrabajo;

import javax.swing.JOptionPane;

import clases.tipoempleado.Obrero;

/**
 * Clase que permite la creacion de un objeto Administrativo / Buseta
 * @author chenao
 *
 */
public class FabicaObreros implements PersonaTrabajo{
 @Override
 public Persona crearHumano() {
  Obrero miObreros=new Obrero();
  miObreros.setCodigo(miObreros.generarCodigo());
  miObreros.setNombre(miObreros.crearNombre());
 JOptionPane.showMessageDialog(null, "Se ha creado un nuevo Objeto Obrero");
  return miObreros;
 }
}