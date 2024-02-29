package com.mycompany.sistemacliente;

import java.util.Locale;
import java.util.Scanner;

public class SistemaCliente {

    public static void main(String[] args) {
               
 //nome = a endereço = b idade = c cpf = d sexo = e
        
Scanner teclado = new Scanner(System.in);
Scanner teclado2 = new Scanner(System.in);

String a,b;
int c;
String d;
char e;

System.out.println("Digite seu nome, endereço, idade, cpf e sexo:");

a = teclado.nextLine();
b = teclado.nextLine();
c = teclado2.nextInt();
d = teclado.nextLine();
e = teclado2.next().charAt(0);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        

teclado2.close();
teclado.close();



      
        
        
        
        
        
    }
}
