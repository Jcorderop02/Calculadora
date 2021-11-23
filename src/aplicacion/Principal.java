/*Copyright [2021] [Juan Cordero]
  Licensed under the Apache License, Version 2.0 (the "License");
  you may not use this file except in compliance with the License.
  You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.*/

/**
 * Es la clase
 *
 * @author Juan Cordero
 * @version 1.0 18/11/21
 */
package aplicacion;

import java.util.Scanner;

public class Principal {
    static int estado = -1;
    static int NOMBRE = 0;
    static int OPERACION = 1;
    static int ESTADO_FINAL = 5;

    public static void main(String[] args) {
        System.out.println("Bienvenido");
        System.out.println("Introduzca una operación");
        String nombre;
        estado = OPERACION;
        Scanner sc = new Scanner(System.in);
        String respuesta;

        //Funciona con todo tipo de operaciones, pero con el mismo signo
        while (estado == OPERACION) {
            respuesta = sc.nextLine().replaceAll("\\s", "");
            if (!exitOrHelp(respuesta)) {
                if (respuesta.contains("+")) {
                    double solucion = 0;
                    String[] numeros = respuesta.split("\\+");

                    for (String a : numeros) {
                        solucion = solucion + Double.parseDouble(a);
                    }
                    System.out.println(solucion);
                    System.out.println("Introduzca otra operación");
                } else if (respuesta.contains("-")) {
                    double solucion = 0;
                    String[] numeros = respuesta.split("-");

                    for (String a : numeros) {
                        solucion = solucion - Double.parseDouble(a);
                    }
                    System.out.println(solucion);
                    System.out.println("Introduzca otra operación");

                } else if (respuesta.contains("*") || (respuesta.contains("x"))) {
                    double solucion = 1;
                    String[] numeros = respuesta.split("\\*");

                    for (String t : numeros) {
                        solucion = solucion * Double.parseDouble(t);
                    }
                    System.out.println(solucion);
                    System.out.println("Introduzca otra operación");
                } else if (respuesta.contains("/")) {
                    double solucion = 0;
                    String[] numeros = respuesta.split("/");
                    solucion = Double.parseDouble(numeros[0]) / Double.parseDouble(numeros[1]);

                    if (numeros.length > 2) {
                        for (int r = 2; r < numeros.length; r++) {
                            solucion = solucion / Double.parseDouble(numeros[r]);
                        }
                    }
                    System.out.println(solucion);
                    System.out.println("Introduzca otra operación");
                } else {
                    System.out.println("No introdujiste ninguno de estos operandos: '+,-,*,/'");
                }
            }
        }
        sc.close();
    }

    public static boolean exitOrHelp(String respuesta) {

        if (respuesta.equalsIgnoreCase("help")) {
            help();
            return true;
        } else if (respuesta.equalsIgnoreCase("exit")) {
            estado = ESTADO_FINAL;
            return true;
        }
        return false;
    }

    private static void help() {
        System.out.println("A");
    }
}

