package com.campusdual.classroom;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exercise31 {


        public static void main(String[] args) {
            BufferedReader varBuffReader = null;
            try {
                varBuffReader = new BufferedReader(new FileReader("src/main/resources/lorem.txt"));
                String cadena = varBuffReader.readLine();
                while (cadena != null){
                    System.out.println(cadena);
                    cadena = varBuffReader.readLine();
                }
            } catch (IOException ex) {
                System.out.println("Error al leer el archivo");
            } finally {
                try {
                    if (varBuffReader != null) varBuffReader.close();
                } catch (IOException ex) {System.out.println("Error al cerrar el archivo");
                }
            }
        }

}
