package main;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.util.Scanner;
import static main.Mensajes.PETICION_RADIO;
import static  main.Mensajes.MENSAJE_RESPUESTA;
public class Main {

 public static void main(String args[]) {

     Scanner teclado = new Scanner(System.in);
     double area;

     System.out.println(PETICION_RADIO.getMensaje());
     double radio = teclado.nextDouble();

     area = Geometria.PI  * Math.pow(radio,2);
     System.out.println(MENSAJE_RESPUESTA.getMensaje() +""+ area);

 }

}
