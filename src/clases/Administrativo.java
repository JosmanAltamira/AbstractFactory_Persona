package clases;

import interfaces.Persona;

import javax.swing.JOptionPane;

/**
 *  clase que establece el codigo del servicio de Administrativo / busetas
 * @author chenao
 */

public class Administrativo implements Persona{
 
 private int codigo;
 private String nombre;

 public String getNombre(){
    return nombre;
 }

 public void setNombre(String nombre){
    this.nombre=nombre;
 }
 public int generarCodigo()
 {
  int codigoAdministrativo=(int) (Math.random()*9999);
  return codigoAdministrativo;
 }
 public int getCodigo() {
  return codigo;
 }
 public void setCodigo(int codigo) {
  this.codigo = codigo;
 }
 
 public String crearNombre(){
    String nombre;
    nombre=JOptionPane.showInputDialog(null, "Ingrese su nombre:");
    return nombre;
 }

 @Override
 public void codigoDeHumano() {
    JOptionPane.showMessageDialog(null,"El Codigo de el administrativo es : "+getCodigo()+"Y el nombre es : "+getNombre());
 }
}
