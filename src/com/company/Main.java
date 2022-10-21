package com.company;

import com.company.tiempo.Operaciones; //con operaciones tenemos todos los datos

import java.util.Scanner;

public class Main { //clase principal desde aqui se ejecuta el proyecto siempre tiene que haber un main

    public static void main(String[] args) {
	Operaciones operaciones = new Operaciones();
        Scanner scr = new Scanner(System.in);
        do{
            operaciones.getTarjetaIdentificada()
                    .ifPresentOrElse(
                            tarjeta -> mostrarmenu(operaciones, scr)
                            ,
                            ()->pedirTrajeta(operaciones, scr));

        }while (true);
    }
    private static void pedirTrajeta(Operaciones operaciones, Scanner scr) {//todo lo que esta dentro de esta funcion solo pertenece a estas funcion porque ser tipo void no se puede utilizar en otro lado del programa
        System.out.println("INGRESA EL NUMERO DE TARJETA ");
        int numeroTarjeta = scr.nextInt();
        boolean resultado = operaciones.indentificar(numeroTarjeta);
        if (resultado){
            System.out.println("BIENVENIDO");
            mostrarmenu(operaciones, scr);
        }else{
            System.out.println("TARJETA INVALIDA");
        }
    }
    private static void mostrarmenu(Operaciones operaciones, Scanner scr) {
        System.out.println("DIGITE UNA OPCION");
        System.out.println("1. CONSULTAR SALDO");
        System.out.println("2. RETIRAR EFECTIVO");
        System.out.println("3. DEPOSITAR EFCTIVO");
        System.out.println("4. SALIR");
        int opcion =scr.nextInt();
        aplicarAcciones(opcion,operaciones,scr);
    }
    public static void aplicarAcciones (int opcion, Operaciones operaciones, Scanner src){
        switch (opcion){
            case 1:
                int saldo = operaciones.consulta();
                System.out.println("SU SALDO ES " +saldo);
                break;

            case 2:
                System.out.println("CUANTO DESEA RETIRAR");
                int montodelRetiro = src.nextInt();
                String resultadodelaOperacion = operaciones.retiro(montodelRetiro);
                System.out.println(resultadodelaOperacion);
                break;

            case 3:
                System.out.println("CUANTO DESEA DEPOSITAR");
                int montodelDeposito = src.nextInt();
                String resultado = operaciones.deposito(montodelDeposito);
                System.out.println(resultado);
                break;

            case 4:
                System.out.println("VUELVE PRONTO");
                operaciones.setTarjetaIdentificada(null);

                break;

            default:
                System.out.println("NO ENTIENDO QUE DESEA REALIZAR");


        }

    }

}

