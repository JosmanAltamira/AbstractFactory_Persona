package principal;
import javax.swing.JOptionPane;

import Fabrica.FabicaObreros;
import Fabrica.FabricaAdministrativos;
import Fabrica.FabricaEmpleados;
import Fabrica.FabricaPersona;
import Fabrica.FabricaSecretarias;

/**
 * clase principal del aplicativo donde se establecen las instancias 
 * de las personas y se ejecuta el aplicativo
 *
 */
public class Principal {

public static void main(String[] args) 
{


 FabricaAdministrativos administrativo=new FabricaAdministrativos();
 FabricaEmpleados empleado=new FabricaEmpleados();
 FabicaObreros obrero=new FabicaObreros();
 FabricaSecretarias secretaria=new FabricaSecretarias();
 String cad="",salida, cademp="";
 cad+="Ingrese la opción correspondiente para obtener el código del servicio\n";
 cad+="1. Código servicio de Administrativos\n";
 cad+="2. Código servicio de Empleados\n";
 try {
 do {
  try 
     {
  int opcion=Integer.parseInt(JOptionPane.showInputDialog(cad));
  switch (opcion)
  {
  case 1:FabricaPersona.crearCrearPersona(administrativo);
   break;
 case 2:
 cademp+="Ingrese opción para para obtener código del servicio\n";
 cademp+="1. Código servicio para Obreros\n";
 cademp+="2. Código servicio para Secretarias\n";
 try {
 do {
  try 
     {
  int opcionempleado=Integer.parseInt(JOptionPane.showInputDialog(cademp));
  switch (opcionempleado)
  {
  case 1:FabricaPersona.crearCrearPersona(obrero);
   break;
 case 2:FabricaPersona.crearCrearPersona(secretaria);
   break;
default:JOptionPane.showMessageDialog(null,"No es un valor de valido");
    break;
   }
  } catch (Exception e) {
 JOptionPane.showMessageDialog(null,"No es un parámetro valido");
  }
 salida=JOptionPane.showInputDialog("Desea consultar otro código de empleados? S/N");
 
 } while (salida.toUpperCase().equals("S"));
     } catch (Exception e) {
  JOptionPane.showMessageDialog(null,"Bye!!!");
  }
   break;
default:JOptionPane.showMessageDialog(null,"No es un valor valido");
    break;
   }
  } catch (Exception e) {
 JOptionPane.showMessageDialog(null,"No es un parámetro valido");
  }
 salida=JOptionPane.showInputDialog("Desea consultar otro código? S/N");
 
 } while (salida.toUpperCase().equals("S"));
     } catch (Exception e) {
  JOptionPane.showMessageDialog(null,"nos vemos!!!");
  }
 }
}