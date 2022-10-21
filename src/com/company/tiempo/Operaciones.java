package com.company.tiempo;

import com.company.banco.Cliente;
import com.company.genero.Cuenta;
import com.company.pais.Tarjeta;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Operaciones { //se crea clase operaciones para lo que el cliente va realizar en el  cajero

    private List<Tarjeta> tarjetas; //se declara una lista de tipo tarjeta
    private Tarjeta tarjetaIdentificada;

    /**
     * @param numTarjeta
     * @return
     */
    public boolean indentificar(int numTarjeta) { //devuelve tipo de dato boleano e introduce tipo de dato entero, lo que hay dentro de parentesis son parametros
        boolean resultado = false;
        for (Tarjeta tarjeta: tarjetas){
            if(numTarjeta==tarjeta.getNumTarjeta()) { //se pide numero de tarjeta con el metodo get
                resultado = true;
                tarjetaIdentificada= tarjeta;
            }
        }
         return resultado;

    } //crear metodo setter para tarjeta identificada

    public String deposito(int montoDeposito) { //resultado a devolver es un String independientemente lo que haya dentro de los parametros
        int saldo = tarjetaIdentificada.getCuenta().getSaldo();
        int resultado = saldo + montoDeposito;
        tarjetaIdentificada.getCuenta().setSaldo(resultado); //se cambia el valor del saldo con el metodo setter

        return "transacion con exito";//devuelve un mensaje
    }

    public String retiro(int montoRetirar) {
        int saldo = tarjetaIdentificada.getCuenta().getSaldo();
        if (saldo >= montoRetirar) {
            int retiro = saldo - montoRetirar;
            tarjetaIdentificada.getCuenta().setSaldo(retiro);
            return "transacion con exito";
        } else {
            return "Saldo insuficiente, no puede realizar la transacion";

        }
    }
    public int consulta() {
        return tarjetaIdentificada.getCuenta().getSaldo();
    }

    public Operaciones() { //inicializamos los objetos
        tarjetas= new ArrayList<>();
        Cliente cliente = new Cliente(0, "Jami", "Reyes");
        Cuenta cuenta = new Cuenta("ja", "cuenta smart", "123456", 5000, cliente);
       Tarjeta tarjeta = new Tarjeta("is", 12345, cliente, cuenta);
       tarjetas.add(tarjeta);

       Cliente cliente1 = new Cliente(1, "Isa", "Montero");
       Cuenta cuenta1 = new Cuenta("is","cuenta ahorro", "0000",  7000, cliente1);
        Tarjeta tarjeta1 = new Tarjeta("pa", 22222, cliente1, cuenta1);
        tarjetas.add(tarjeta1);

        Cliente cliente2 = new Cliente(2, "Anyelo", "Reyes");
        Cuenta cuenta2 = new Cuenta("re", "cuenta debito", "1111", 9000, cliente2);
        Tarjeta tarjeta2 = new Tarjeta("res", 33333, cliente2, cuenta2);
        tarjetas.add(tarjeta2);

        Cliente cliente3 = new Cliente(3, "Jamileth", "Guevara");
        Cuenta cuenta3 = new Cuenta("me", "cuenta online", "88888", 15000, cliente3);
        Tarjeta tarjeta3 = new Tarjeta("is", 55555, cliente3, cuenta3);
        tarjetas.add(tarjeta3);

        Cliente cliente4 = new Cliente(4, "Cindy", "Reyes");
        Cuenta cuenta4 = new Cuenta("ci", "cuenta big", "11111", 25000, cliente4);
        Tarjeta tarjeta4 = new Tarjeta("dy", 888888, cliente4, cuenta4);
        tarjetas.add(tarjeta4);

    }

    public void setTarjetaIdentificada(Tarjeta tarjetaIdentificada) {
        this.tarjetaIdentificada = tarjetaIdentificada;

    }

    public Optional<Tarjeta> getTarjetaIdentificada(){
        return Optional.ofNullable(this.tarjetaIdentificada);
    }
}


























