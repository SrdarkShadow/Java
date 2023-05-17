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
        double perimetro;
        double area;
        boolean ciclom = true; // Ciclo general
        boolean ciclot = true; // Ciclo triangulo
        String red = "\033[31m";// salida de texto rojo
        String res = "\u001B[0m";// salida de texto blanco
        String ve = "\033[32m";// salida de texto cwesw
        String control;// Variable de salida del programa
        boolean ciclow = true;

        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
        while (ciclow) {

            try { // TRY GENERAL----------------------

                while (ciclom) { // Ciclo General para repetir las elecciónes

                    System.out.println("Seleccione la figura trigonometrica para evaluar el Area y el Perimetro ");
                    System.out.println("1. Triangulo");
                    System.out.println("2. Circulo");
                    System.out.println("3. Rectangulo");
                    opcion = Integer.parseInt(lector.readLine()); // aquí ocurre el bug de que si ingresas un valor que
                                                                  // no
                                                                  // sea numérico se rompe, arreglar eso
                                                                  // Solo pude arreglarlo cuando introduce un valor
                                                                  // numerico
                                                                  // arriba de 3
                    // Ciclo de las figuras
                    boolean salirt = true;
                    ciclot = true;
                    while (ciclot) {
                        if (opcion == 1) {
                            try {
                                /*--------------------inicio de if de Triangulo----------------------- */
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
                                            "El area del triangulo es: " + ve + area + res
                                                    + " y el perimetro de un triangulo es "
                                                    + ve + perimetro + res + "\n");
                                    ciclot = false;
                                    a = 1;
                                }

                            } catch (Exception e) {
                                System.out.println(red
                                        + "Ha ocurrido un error en la ejecución, vuelva a escribir un valor válido"
                                        + res);

                            }
                        }
                        /*--------------------------------Final de if de triangulo---------------------- */
                        /*--------------------------------inicio de if de circulo----------------------- */

                        if (opcion == 2) {
                            try {

                                if (a == 1) {
                                    a = 1;
                                    System.out.println("Ingrese el radio del circulo");
                                    lado1 = Integer.parseInt(lector.readLine());
                                    a = 0;
                                    salirt = false;
                                } else if (salirt == false) {
                                    area = (3.14) * (lado1 * lado1);
                                    perimetro = 2 * (3.14) * lado1;
                                    System.out.println(
                                            "El area del circulo es: " + ve + area + res
                                                    + " y el Perimetro de un circulo es "
                                                    + ve + perimetro + res + "\n");
                                    ciclot = false;
                                    a = 1;
                                }

                            } catch (Exception e) {
                                System.out.println(red
                                        + "Ha ocurrido un error en la ejecución, vuelva a escribir un valor válido"
                                        + res);
                            }
                        }
                        /*--------------------------------Final de if de circulo---------------------- */
                        /*--------------------------------inicio de if de rectangulo----------------------- */

                        if (opcion == 3) {
                            try {
                                if (a == 1) {
                                    a = 1;
                                    System.out.println("Ingrese la base");
                                    lado1 = Integer.parseInt(lector.readLine());
                                    a = 0;
                                    b = 1;
                                } else if (b == 1) {
                                    System.out.println("Ingrese la Altura");
                                    lado2 = Integer.parseInt(lector.readLine());
                                    b = 0;
                                    salirt = false;
                                } else if (salirt == false) {
                                    area = lado1 * lado2;
                                    perimetro = (lado1 + lado2) * 2;
                                    System.out.println(
                                            "El area del rectangulo es : " + ve + area + res
                                                    + " y el perimetro del rectangulo es: "
                                                    + ve + perimetro + res + "\n");
                                    ciclot = false;
                                    a = 1;
                                }

                            } catch (Exception e) {
                                System.out.println(red
                                        + "Ha ocurrido un error en la ejecución, vuelva a escribir un valor válido"
                                        + res);
                            }

                        }
                        // --------------------------If para controlar si ingresa un valor arriba de las
                        // opciones, se repita el bucle
                        if (opcion >= 4) {

                            System.out.println(red
                                    + "Porfavor ingrese un valor válido" + res);
                            ciclot = false;
                        }

                    } // Fin de ciclo de las figuras

                    // If para controlar si continuar en el programa o salir
                    System.out.println(
                            "Escriba " + red + "EXIT" + res + " si desea salir o " + ve + "CONT" + res
                                    + " para continuar...");
                    control = lector.readLine();

                    if (control.equals("EXIT")) {
                        ciclow = false;
                        break;

                    } else if (control.equals("CONT")) {
                        System.out.println("\n");
                    }

                } // Fin de ciclo general

            } catch (Exception e) {
                System.out.println(
                        "--------------------Ha ocurrido un gran error en el sistema-----------------------------------------");
                System.out.println(
                        "----------------------------------Intentelo nuevamente-----------------------------------------");

            }

        }

    }
}