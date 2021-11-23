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
 * @version 1.0 20/11/21
 */
package aplicacion;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        System.out.println("Bienvenido");
        System.out.println("Introduzca una operación");
        String nombre;
        Scanner sc = new Scanner(System.in);
        String respuesta;

        //Funciona solo con operaciones menores que 10
        double calc = 0;
        String scan = "2+4+4+2";
        int resta = scan.indexOf('/');

        while (resta > 0) {
            calc = Double.parseDouble(scan.substring(resta - 1, resta)) / Double.parseDouble(scan.substring(resta + 1, resta + 2));
            String new_scan = scan.substring(0, resta - 1) + (int) calc + scan.substring(resta + 2, scan.length());
            scan = new_scan;
            resta = scan.indexOf('/');
        }
        System.out.println("Scan 1: " + scan);
        int resta2 = scan.indexOf('*');
        while (resta2 > 0) {
            calc = Double.parseDouble(scan.substring(resta2 - 1, resta2)) * Double.parseDouble(scan.substring(resta2 + 1, resta2 + 2));
            String new_scan = scan.substring(0, resta2 - 1) + (int) calc + scan.substring(resta2 + 2, scan.length());
            scan = new_scan;
            resta2 = scan.indexOf('*');
        }
        System.out.println("Scan 2: " + scan);
        int resta3 = scan.indexOf('+');
        while (resta3 > 0) {
            calc = Double.parseDouble(scan.substring(resta3 - 1, resta3)) + Double.parseDouble(scan.substring(resta3 + 1, resta3 + 2));
            String new_scan = scan.substring(0, resta3 - 1) + (int) calc + scan.substring(resta3 + 2, scan.length());
            scan = new_scan;
            resta3 = scan.indexOf('+');
        }
        System.out.println("Scan 3: " + scan);
        int resta4 = scan.indexOf('-');
        while (resta4 > 0) {
            calc = Double.parseDouble(scan.substring(resta4 - 1, resta4)) - Double.parseDouble(scan.substring(resta4 + 1, resta4 + 2));
            String new_scan = scan.substring(0, resta4 - 1) + (int) calc + scan.substring(resta4 + 2, scan.length());
            scan = new_scan;
            resta4 = scan.indexOf('-');
        }
        System.out.println("Scan 4: " + scan);
    }
}
