/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.FastPay.model;

import java.io.Serializable;

/**
 *
 * @author David
 */
public class Producto {
    private int cantidad;
    private int codigo;
    private String nombre;
    private double precio;
    private Object descripcion;

    public Producto(){}
    
    public Producto(int cantidad, int codigo, String nombre, double precio, Object descripcion){
        this.cantidad = cantidad;
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
    }

    public Producto(int leerCodigo, String leerNombre, double leerPrecio, Object leerDescripcion) {
      this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;  
    }

    
    
    public int getCantidad() {
        return cantidad;
    }

    /**
     * @return the codigo
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the precio
     */
   
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * @return the descripcion
     */
    public Object getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(Object descripcion) {
        this.descripcion = descripcion;
    }
    
}
