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
 *
 * @author Juan Cordero
 * @version 1.0 23/11/21
 */
package aplicacion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Principal {
    static int estado = -1;
    static int NOMBRE = 0;
    static int OPERACION = 1;
    static int ESTADO_FINAL = 5;

    public static void main(String[] args) {
        Principal p = new Principal();
        System.out.println("Bienvenido");
        System.out.println("Introduzca una operación");
        Scanner sc = new Scanner(System.in);
        String scan = sc.nextLine().replaceAll("\\s", "");
        String aux = scan;

        int i = 0;
        double resultado = 0;
        int pos1 = 0;
        int pos2 = 0;

        while (i != p.obtenerNumeroOperaciones(scan)) {
            String num1 = p.obtenerPrimerNumero(aux);
            String operacion = p.obtenerOperacion(aux);
            String num2 = p.obtenerSegundoNumero(aux);
            pos1 = p.obtenerPosicionPrimerNumero(aux);
            pos2 = p.obtenerPosicionSegundoNumero(aux);

            try {
                switch (operacion) {
                    case "x":
                    case "*":

                        resultado = Double.parseDouble(num1) * Double.parseDouble(num2);

                        break;
                    case "/":

                        resultado = Double.parseDouble(num1) / Double.parseDouble(num2);

                        break;
                    case "+":

                        resultado = Double.parseDouble(num1) + Double.parseDouble(num2);

                        break;
                    case "-":

                        resultado = Double.parseDouble(num1) - Double.parseDouble(num2);

                        break;
                    default:

                        throw new RuntimeException("Operación inválida");
                }

                aux = eliminarString(pos1, pos2, aux);
                aux = insertString(aux, String.valueOf(resultado), pos1 - 1);
                i++;

            } catch (Exception e) {
                throw new RuntimeException("Revisa tu operación, algo va mal");
            }
        }

        aux = p.eliminarUltimaOperacion(aux);
        System.out.println("Resultado " + aux);
        estado = OPERACION;
    }

    public static String eliminarString ( int pos1, int pos2, String string){

        StringBuilder sb = new StringBuilder(string);
        sb.delete(pos1, pos2);

        return sb.toString();
    }

    public static String insertString (String stringOriginal, String stringAInsertar,int index){

        StringBuffer newString = new StringBuffer(stringOriginal);
        newString.insert(index + 1, stringAInsertar);

        return newString.toString();
    }

    public String eliminarUltimaOperacion (String s){

        List<String> simbolos = new ArrayList<>(Arrays.asList("+", "-", "*", "x", "/"));
        int posicion1 = 0;

        for (char c : s.toCharArray()) {

            if (!simbolos.contains(String.valueOf(c))) {

                posicion1++;

            } else {

                break;
            }
        }
        return s.substring(0, posicion1);
    }

    public int obtenerPosicionPrimerNumero (String s){
        int posicion = 0;

        List<String> simbolos = new ArrayList<>(Arrays.asList("+", "-", "*", "x", "/"));
        if (s.indexOf('/') != -1) {

            int pos = s.indexOf('/');
            int posicion1 = 0;

            for (int i = pos - 1; i > -1; i--) {

                if (!simbolos.contains(String.valueOf(s.charAt(i)))) {

                    posicion1++;

                } else {

                    break;
                }
            }
            return pos - posicion1;
        }
        if (s.indexOf('*') != -1) {

            int pos = s.indexOf('*');

            int posicion1 = 0;

            for (int i = pos - 1; i > -1; i--) {

                if (!simbolos.contains(String.valueOf(s.charAt(i)))) {

                    posicion1++;

                } else {

                    break;
                }
            }
            return pos - posicion1;
        }
        if (s.indexOf('x') != -1) {

            int pos = s.indexOf('x');

            int posicion1 = 0;

            for (int i = pos - 1; i > -1; i--) {

                if (!simbolos.contains(String.valueOf(s.charAt(i)))) {

                    posicion1++;

                } else {

                    break;
                }
            }
            return pos - posicion1;
        }
        if (s.indexOf('+') != -1) {

            int pos = s.indexOf('+');

            int posicion1 = 0;

            for (int i = pos - 1; i > -1; i--) {

                if (!simbolos.contains(String.valueOf(s.charAt(i)))) {

                    posicion1++;

                } else {

                    break;
                }
            }
            return pos - posicion1;
        }
        if (s.indexOf('-') != -1) {

            int pos = s.indexOf('-');

            int posicion1 = 0;

            for (int i = pos - 1; i > -1; i--) {

                if (!simbolos.contains(String.valueOf(s.charAt(i)))) {

                    posicion1++;

                } else {

                    break;
                }
            }
            return pos - posicion1;
        }
        return -1;
    }

    public int obtenerPosicionSegundoNumero (String s){

        List<String> simbolos = new ArrayList<>(Arrays.asList("+", "-", "*", "x", "/"));

        if (s.indexOf('/') != -1) {

            int pos = s.indexOf('/');

            int posicion1 = 0;

            for (int i = pos + 1; i < s.length(); i++) {

                if (!simbolos.contains(String.valueOf(s.charAt(i)))) {

                    posicion1++;

                } else {

                    break;
                }
            }
            return pos + posicion1 + 1;
        }
        if (s.indexOf('*') != -1) {

            int pos = s.indexOf('*');

            int posicion1 = 0;

            for (int i = pos + 1; i < s.length(); i++) {

                if (!simbolos.contains(String.valueOf(s.charAt(i)))) {

                    posicion1++;

                } else {

                    break;
                }
            }
            return pos + posicion1 + 1;
        }
        if (s.indexOf('x') != -1) {

            int pos = s.indexOf('x');

            int posicion1 = 0;

            for (int i = pos + 1; i < s.length(); i++) {

                if (!simbolos.contains(String.valueOf(s.charAt(i)))) {

                    posicion1++;

                } else {

                    break;
                }
            }
            return pos + posicion1 + 1;
        }
        if (s.indexOf('+') != -1) {

            int pos = s.indexOf('+');

            int posicion1 = 0;

            for (int i = pos + 1; i < s.length(); i++) {

                if (!simbolos.contains(String.valueOf(s.charAt(i)))) {

                    posicion1++;

                } else {

                    break;
                }
            }
            return pos + posicion1 + 1;
        }
        if (s.indexOf('-') != -1) {

            int pos = s.indexOf('-');

            int posicion1 = 0;

            for (int i = pos + 1; i < s.length(); i++) {

                if (!simbolos.contains(String.valueOf(s.charAt(i)))) {

                    posicion1++;

                } else {

                    break;
                }
            }
            return pos + posicion1 + 1;
        }
        return -1;
    }

    public String obtenerPrimerNumero (String s){

        int posicion = 0;

        List<String> simbolos = new ArrayList<>(Arrays.asList("+", "-", "*", "x", "/"));

        if (s.indexOf('/') != -1) {

            int pos = s.indexOf('/');

            int posicion1 = 0;

            for (int i = s.indexOf('/') - 1; i > -1; i--) {

                if (!simbolos.contains(String.valueOf(s.charAt(i)))) {

                    posicion1++;

                } else {

                    break;
                }
            }

            return s.substring(pos - posicion1, pos);

        }
        if (s.indexOf('*') != -1) {

            int pos = s.indexOf('*');

            int posicion1 = 0;

            for (int i = s.indexOf('*') - 1; i > -1; i--) {

                if (!simbolos.contains(String.valueOf(s.charAt(i)))) {

                    posicion1++;

                } else {

                    break;
                }
            }

            return s.substring(pos - posicion1, pos);

        }
        if (s.indexOf('x') != -1) {

            int pos = s.indexOf('x');

            int posicion1 = 0;

            for (int i = s.indexOf('x') - 1; i > -1; i--) {

                if (!simbolos.contains(String.valueOf(s.charAt(i)))) {

                    posicion1++;

                } else {

                    break;
                }
            }

            return s.substring(pos - posicion1, pos);

        }
        if (s.indexOf('+') != -1) {

            int pos = s.indexOf('+');
            int posicion1 = 0;

            for (int i = s.indexOf('+') - 1; i > -1; i--) {

                if (!simbolos.contains(String.valueOf(s.charAt(i)))) {

                    posicion1++;

                } else {

                    break;
                }
            }

            return s.substring(pos - posicion1, pos);

        }
        if (s.indexOf('-') != -1) {

            int pos = s.indexOf('-');

            int posicion1 = 0;

            for (int i = s.indexOf('-') - 1; i > -1; i--) {

                if (!simbolos.contains(String.valueOf(s.charAt(i)))) {

                    posicion1++;

                } else {

                    break;
                }
            }

            return s.substring(pos - posicion1, pos);
        }
        return s;
    }

    public String obtenerSegundoNumero (String s){

        List<String> simbolos = new ArrayList<>(Arrays.asList("+", "-", "*", "x", "/"));

        if (s.indexOf('/') != -1) {

            int pos = s.indexOf('/');

            int posicion1 = 0;

            for (int i = s.indexOf('/') + 1; i < s.length(); i++) {

                if (!simbolos.contains(String.valueOf(s.charAt(i)))) {

                    posicion1++;

                } else {

                    break;
                }
            }

            return s.substring(pos + 1, pos + posicion1 + 1);

        }
        if (s.indexOf('*') != -1) {

            int pos = s.indexOf('*');

            int posicion1 = 0;

            for (int i = s.indexOf('*') + 1; i < s.length(); i++) {

                if (!simbolos.contains(String.valueOf(s.charAt(i)))) {

                    posicion1++;

                } else {

                    break;
                }
            }

            return s.substring(pos + 1, pos + posicion1 + 1);

        }
        if (s.indexOf('x') != -1) {

            int pos = s.indexOf('x');

            int posicion1 = 0;

            for (int i = s.indexOf('x') + 1; i < s.length(); i++) {

                if (!simbolos.contains(String.valueOf(s.charAt(i)))) {

                    posicion1++;

                } else {

                    break;
                }
            }

            return s.substring(pos + 1, pos + posicion1 + 1);

        }
        if (s.indexOf('+') != -1) {

            int pos = s.indexOf('+');

            int posicion1 = 0;

            for (int i = s.indexOf('+') + 1; i < s.length(); i++) {

                if (!simbolos.contains(String.valueOf(s.charAt(i)))) {

                    posicion1++;

                } else {

                    break;
                }
            }

            return s.substring(pos + 1, pos + posicion1 + 1);
        }
        if (s.indexOf('-') != -1) {

            int pos = s.indexOf('-');

            int posicion1 = 0;

            for (int i = s.indexOf('-') + 1; i < s.length(); i++) {

                if (!simbolos.contains(String.valueOf(s.charAt(i)))) {

                    posicion1++;

                } else {

                    break;
                }
            }

            return s.substring(pos + 1, pos + posicion1 + 1);
        }
        return s;
    }

        /*else {
            int posicion = 0;
            for (char c : s.toCharArray()) {

                if (!simbolos.contains(String.valueOf(c))) {
                    posicion++;
                } else {

                    return s.substring(0, posicion);

                }
            }
        }*/


    // Devuelve la posición del String donde está el primer signo indicado por parámetro (/, + , - , x)
    public int obtenerPosicionDeOperacion ( char operacion, String s){

        int posicion = 0;

        for (char c : s.toCharArray()) {

            if (c != operacion) {
                posicion++;
            } else {

                return posicion;
            }
        }
        return posicion;
    }

    public String obtenerOperacion (String s){

        int posicion = 0;

        List<String> simbolos = new ArrayList<>(Arrays.asList("/", "*", "x", "+", "-"));


        if (s.indexOf('/') != -1) {

            int posicionOperacion = obtenerPosicionDeOperacion('/', s);
            return s.substring(posicionOperacion, posicionOperacion + 1);
        } else if (s.indexOf('*') != -1) {

            int posicionOperacion = obtenerPosicionDeOperacion('*', s);
            return s.substring(posicionOperacion, posicionOperacion + 1);
        } else if (s.indexOf('x') != -1) {

            int posicionOperacion = obtenerPosicionDeOperacion('x', s);
            return s.substring(posicionOperacion, posicionOperacion + 1);

        } else {

            for (char c : s.toCharArray()) {

                if (!simbolos.contains(String.valueOf(c))) {
                    posicion++;
                } else {
                    return s.substring(posicion, posicion + 1);
                }
            }
        }
        return s;
    }

    public int obtenerNumeroOperaciones (String s){

        List<String> simbolos = new ArrayList<>(Arrays.asList("+", "-", "*", "x", "/"));
        int i = 0;

        for (char c : s.toCharArray()) {

            if (simbolos.contains(String.valueOf(c))) {
                i++;
            }
        }
        return i;
    }
}