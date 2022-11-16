package clases.tipoempleado;

import interfaces.Persona;

import javax.swing.JOptionPane;

/**
 * clase que establece el codigo del servicio de Empleado / taxis
 * @author chenao
 */
public class Obrero implements Persona{
 private int codigo;
 private String nombre;

 public String getNombre(){
    return nombre;
 }

 public void setNombre(String nombre){
    this.nombre=nombre;
 }

 public String crearNombre(){
    String nombre;
    nombre=JOptionPane.showInputDialog(null, "Ingrese su nombre:");
    return nombre;
 }

 public int generarCodigo()
 {
  /**Generamos un codigo aleatorio para el taxi*/
  int codigoObrero=(int) (Math.random()*9999);
  return codigoObrero;
 }
 public int getCodigo() {
  return codigo;
 }
 public void setCodigo(int codigo) {
  this.codigo = codigo;
 }
 @Override
 public void codigoDeHumano() {
    JOptionPane.showMessageDialog(null,"El Codigo de el obrero es : "+getCodigo()+" Y el nombre es : "+getNombre());
 }
}
