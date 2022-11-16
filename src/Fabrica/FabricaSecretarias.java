package Fabrica;
import interfaces.Persona;
import interfaces.PersonaTrabajo;

import javax.swing.JOptionPane;

import clases.tipoempleado.Secretaria;

/**
 * Clase que permite la creacion de un objeto Administrativo / Buseta
 * @author chenao
 *
 */
public class FabricaSecretarias implements PersonaTrabajo{
 @Override
 public Persona crearHumano() {
  Secretaria miSecretarias=new Secretaria();
  miSecretarias.setCodigo(miSecretarias.generarCodigo());
  miSecretarias.setNombre(miSecretarias.crearNombre());
 JOptionPane.showMessageDialog(null, "Se ha creado un nuevo Objeto Secretaria");
  return miSecretarias;
 }
}