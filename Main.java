import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[], nEelementos, aux; //Instanciamos las variables junto con el arreglo correspondiente

        nEelementos = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de elementos del arreglo: ")); //Usamos ventanas emergentes para pedir datos
        arreglo = new int[nEelementos]; //Creamos el arreglo con la cantidad N de elementos ingresados

        for (int i = 0; i < nEelementos; i++) { //Pedimos y guardamos los datos dela arreglo mediante connsola
            System.out.println("Digite los numeros del arreglo: ");
            arreglo[i] = entrada.nextInt(); //Guardamos los datos en el arreglo mediante consola
        }

        //Metodo Burbuja, metodo de ordenamiento de arreglos
        for (int i = 0; i < (nEelementos - 1); i++) { //Primer for
            for (int j = 0; j < (nEelementos - 1); j++) { //Segundo for
                if (arreglo[j] > arreglo[j + 1]) { //Si la posicion actual es mayor a la siguiente, debemos hacer un cambio para poder ordenarlo
                    aux = arreglo[j]; //Igualamos la variable aux como posicion actual
                    arreglo[j] = arreglo[j + 1]; //hacemos el cambio de la posicio nactual con la posicion siguiente
                    arreglo[j + 1] = aux; //Finalizamos actualizando la variable aux para haci tener el cambio de posicion
                }
            }
        }

        System.out.println("Mostrando el arreglo resultante creciente: "); //Mostramos el arreglo ordenado con el metodo burbuja
        for (int i = 0; i < nEelementos; i++) { //Datos mostrados de manera creciente
            System.out.print(arreglo[i] + " - ");
        }

        System.out.println("Mostrando el arreglo resultante decreciente: "); //Mostramos el arreglo ordenado con el metodo burbuja
        for (int i = (nEelementos - 1); i >= 0; i--) { //Datos mostrados de manera decreciente, se utiliza una vuelta menos que la cantidad de elementos, siempre
            System.out.print(arreglo[i] + " - ");
        }
    }
}