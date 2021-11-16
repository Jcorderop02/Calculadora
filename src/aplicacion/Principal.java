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
 * Es la clase Principal del programa que procesará una petición
 *
 * @author Juan Cordero
 * @version 1.0 19/10/21
 */
package aplicacion;

import java.util.Scanner;

public class Principal {
    static int estado = -1;
    static int NOMBRE = 0;
    static int OPERACION = 1;
    static int ESTADO_FINAL = 5;
    public static void main(String[] args){
        System.out.println("Bienvenido");
        String nombre = "";
        estado = NOMBRE;
        Scanner sc = new Scanner(System.in);
        String respuesta= "";

        while (estado == NOMBRE){
            System.out.println("Indique su nombre para iniciar la calculadora");
            respuesta = sc.next();
            if (!exitOrHelp(respuesta)){
                nombre = respuesta;
                estado = OPERACION;
            }
        }

        while(estado == OPERACION){
            System.out.println("Introduzca su operación");
            respuesta = sc.next();
            if (!exitOrHelp(respuesta)){
                if (respuesta.contains("+")){
                    int x = Character.getNumericValue(respuesta.charAt(0));
                    int y = Character.getNumericValue(respuesta.charAt(2));
                    System.out.println(x+y);
                } else if(respuesta.contains("-")){
                    int x = Character.getNumericValue(respuesta.charAt(0));
                    int y = Character.getNumericValue(respuesta.charAt(2));
                    System.out.println(x-y);
                } else if(respuesta.contains("*") || respuesta.contains("x")){
                    int x = Character.getNumericValue(respuesta.charAt(0));
                    int y = Character.getNumericValue(respuesta.charAt(2));

                } else if(respuesta.contains("/")){
                    int x = Character.getNumericValue(respuesta.charAt(0));
                    int y = Character.getNumericValue(respuesta.charAt(2));
                    System.out.println(x/y);
                } else {
                    System.out.println("No introdujiste ninguno de estos operandos: '+,-,*,/'");
                }
            }
        }
    }

    public static boolean exitOrHelp(String respuesta){
        if (respuesta.equalsIgnoreCase("help")){
            help();
            return true;
        } else if (respuesta.equalsIgnoreCase("exit")){
            estado = ESTADO_FINAL;
            return true;
        }
        return false;
    }

    private static void help(){
        System.out.println("A");
    }
}