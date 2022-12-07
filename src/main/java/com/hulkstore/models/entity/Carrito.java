package com.hulkstore.models.entity;

import jakarta.persistence.*;

@Entity
public class Carrito {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Producto producto;

    @ManyToOne(optional = false, cascade = CascadeType.DETACH, fetch = FetchType.EAGER)
    private Usuario cliente;

    private int cantidad;

    public Carrito() {
    }

    public Carrito(Integer idCarrito, Producto producto, Usuario cliente, int cantidad) {
        this.id = idCarrito;
        this.producto = producto;
        this.cliente = cliente;
        this.cantidad = cantidad;
    }

    public Integer getIdCarrito() {
        return id;
    }

    public void setIdCarrito(Integer idCarrito) {
        this.id= idCarrito;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Usuario getCliente() {
        return cliente;
    }

    public void setCliente(Usuario cliente) {
        this.cliente = cliente;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
