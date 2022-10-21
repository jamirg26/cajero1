package com.company.genero;

import com.company.banco.Cliente;

/**
 *
 */

public class Cuenta {
    private String id; // String palabra reservada no primitiva para cadena varios caracteres
    private String nombreCuenta;
    private String iban;
    private int saldo; //palabra reservada primitiva tipo numerico enteros
    private Cliente cliente; // Cliente de la clase Cliente

    /**
     *
     * @param id
     * @param nombreCuenta
     * @param iban
     * @param saldo
     * @param cliente
     */

    public Cuenta(String id, String nombreCuenta, String iban, int saldo, Cliente cliente) {
        this.id = id;
        this.nombreCuenta = nombreCuenta;
        this.iban = iban;
        this.saldo = saldo;
        this.cliente = cliente;

    }

    /**
     *
     * @return
     * apicamos metodos getter y setter para dar acceso por ser de tipo privado en el programa
     */


    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getId() {
        return id;
    }

    public String getNombreCuenta() {
        return nombreCuenta;
    }

    public void setNombreCuenta(String nombreCuenta) {
        this.nombreCuenta = nombreCuenta;
    }

    public void setId(String id) {
        this.id = id;
    }
}
