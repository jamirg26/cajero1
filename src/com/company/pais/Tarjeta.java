package com.company.pais;

import com.company.banco.Cliente;
import com.company.genero.Cuenta;

public class Tarjeta { //creamos clase tarjeta para los datos de la tarjeta todos de tipo privado
    private String id;
    private  int numTarjeta;
    private Cliente cliente;
    private Cuenta cuenta;

    public Tarjeta(String id, int numTarjeta, Cliente cliente, Cuenta cuenta) {
        this.id = id;
        this.numTarjeta = numTarjeta;
        this.cliente = cliente;
        this.cuenta = cuenta;

    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    public String getId() {
        return id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getNumTarjeta() {
        return numTarjeta;
    }

    public void setNumTarjeta(int numTarjeta) {
        this.numTarjeta = numTarjeta;
    }

    public void setId(String id) {
        this.id = id;
    }
}
