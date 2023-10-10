/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.colegio;

/**
 *
 * @author emanu
 */
public class nomina {
    public void cobro(int _horas, double _precio,String _dia, String _fecha, double _preciofinal){
        horas = _horas;
        precio = _precio;
        dia = _dia;
        fecha = _fecha;
        preciofinal = _preciofinal;
    }
    
    private int horas;
    private double precio;
    private String dia;
    private String fecha;
    private double preciofinal;

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getPreciofinal() {
        return preciofinal;
    }

    public void setPreciofinal(double preciofinal) {
        this.preciofinal = preciofinal;
    }
    
}
