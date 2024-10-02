// la funcionalidad de este programa se basa en elegir un número, y el programa va a evaluar si el número seleccionado es
// afortunado o desafortunado y es lo que se mostrará en la consola

import java.util.Scanner;

public class Codigo5 {
			//se agregó el main() ya que sin esto no se puede ejecutar
    public static void main(String[] args) {
        // se manda a llamar al scanner para que todo pueda ser leído en la consola
        Scanner s = new Scanner(System.in);
        
       // aquí se le pide al usuario que introduzca un número
        System.out.print("Introduzca un número: ");
        
       // el número se lee como un string así que se convierte a int 
        String ni = s.nextLine();
        int c = Integer.parseInt(ni);
        
        // aquí se inicializa el contadorpara desafortunado o afortunado
        int afo = 0;
        int noAfo = 0;
        
        // aquí se convierte el número a un entero
        int numero = c;
        
        // con este ciclo se evaluará cada número
        while (numero > 0) {
            // // aquí se obtiene el último digito del número
            int digito = numero % 10;
            
            // // se hace la verificación para saber si es afortunado
            if (digito == 3 || digito == 7 || digito == 8 || digito == 9) {
                afo++;  // si lo es, se incrementa el contador
            } else {
                noAfo++;  // si no es afortunado entonces se incrementa el número de desafortunados
            }
            
            // aquí se elimina el último digito del número
            numero /= 10;
        }
        
        // se determina si el numero es afortunado o no
        if (afo > noAfo) {
            System.out.println("El " + c + " es un número afortunado.");
        } else {
            System.out.println("El " + c + " no es un número afortunado.");
        }
        
        // y para finalizar se cierra el escaner
        s.close();
    }
}
