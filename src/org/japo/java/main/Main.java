/* 
 * Copyright 2019 Andrés Cosín Zamareño - Cousin183@gmail.com ..
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Andrés Cosín Zamareño - Cousin183@gmail.com .
 */
public class Main {

    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    public static void main(String[] args) {
        //Constantes
        int TENEDOR_CARNE = 3;
        int TENEDOR_PESCADO = 4;
        int ALTERNATIVA = 0;
        String CARNE = "carne";
        String PESCADO = "pescado";

        //Variables
        int puas;
        String comida;

        //Rótulo
        System.out.printf("Alternativa Tenedor  %n===================%n");

        //Scanner
        System.out.print("Tipo de comida .: ");
        comida = SCN.nextLine().toLowerCase();

        if (comida.equals(CARNE)) {
            puas = TENEDOR_CARNE;
        } else if (comida.equals(PESCADO)) {
            puas = TENEDOR_PESCADO;
        } else {
            puas = ALTERNATIVA;
        }

        //Separador
        System.out.println("---");

        //Mensaje
        System.out.printf("Tenedor con ....: %d púas%n", puas);
    }

}
