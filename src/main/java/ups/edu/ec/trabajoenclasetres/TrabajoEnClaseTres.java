/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ups.edu.ec.trabajoenclasetres;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author estem
 */
public  class TrabajoEnClaseTres {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Stack<Character> pilaChar = new Stack<>();
        System.out.println("Ingrese la cadena de textos: ");
        String ejemplo = entrada.nextLine();
        
        for (int i = 0; i < ejemplo.length(); i++) {
            char j = ejemplo.charAt(i);
            if (j == '(' || j == '[' || j == '{') {
                pilaChar.push(j);
                imprimir(pilaChar);
            }else if ((j == ']' && pilaChar.get(pilaChar.size() - 1) == '[') || (j == '}' && pilaChar.get(pilaChar.size() - 1) == '{') || (j == ')' && pilaChar.get(pilaChar.size()-1) == '(')) {
                    pilaChar.pop();
                    imprimir(pilaChar);
            }
        }
        
    }

    public static void imprimir(Stack<Character> pila) {
        for (char character : pila) {
            System.out.print(character);
        }
        System.out.println("");
    }
}
