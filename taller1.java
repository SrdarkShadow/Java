package Talller1;

import java.io.*;

public class Taller1 {

    public static void main(String[] args) throws IOException {

        // Hacer menu que esocja area y pelimetro de tres figuras, que sea constante y
        // te diga que si quieres regresar, capturar errores individuales
        // triangulo, cuadrado, circulo,
        // menu con ciclo repetitivo
        // Declaración de variables de control
        int opcion;
        int lado1 = 0, lado2 = 0, lado3 = 0;
        int a = 1, b = 0, c = 0;
        int perimetro;
        float area;
        boolean ciclom = true; // Ciclo general
        boolean ciclot = true; // Ciclo triangulo
        String red = "\033[31m";
        String reset = "\u001B[0m";

        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));

        while (ciclom) {

            System.out.println("Seleccione la figura trigonometrica a evaluar");
            System.out.println("1. Triangulo");
            System.out.println("2. Circulo");
            System.out.println("3. Rectangulo");
            opcion = Integer.parseInt(lector.readLine());
            // Ciclo de primer figura
            boolean salirt = true;
            while (ciclot) {
                if (opcion == 1) {
                    try {

                        if (a == 1) {
                            a = 1;
                            System.out.println("Ingrese el primer lado");
                            lado1 = Integer.parseInt(lector.readLine());
                            a = 0;
                            b = 1;
                        } else if (b == 1) {
                            System.out.println("Ingrese el segundo lado");
                            lado2 = Integer.parseInt(lector.readLine());
                            b = 0;
                            c = 1;

                        } else if (c == 1) {
                            System.out.println("Ingrese el tercer lado");
                            lado3 = Integer.parseInt(lector.readLine());
                            c = 0;
                            salirt = false;
                        } else if (salirt == false) {
                            area = (lado1 + lado2) / 2;
                            perimetro = lado1 + lado2 + lado3;
                            System.out.println(
                                    "El area del triangulo es: " + area + " y el perimetro de un triangulo es "
                                            + perimetro);
                            ciclot = false;
                        }

                    } catch (Exception e) {
                        System.out.println(red
                                + "Ha ocurrido un error en la ejecución, vuelva a escribir un valor válido" + reset);

                        // TODO: handle exception
                    }
                }

                if (opcion == 2) {
                    try {
                        System.out.println("que paso acá?");
                        ciclot = false;

                    } catch (Exception e) {
                        // TODO: handle exception
                    }
                }

                if (opcion == 3) {
                    try {

                    } catch (Exception e) {
                        // TODO: handle exception
                    }

                }
                System.out.println("Escriba EXIT si desea salir o CONT para continuar...");

            }

        }

    }
}
