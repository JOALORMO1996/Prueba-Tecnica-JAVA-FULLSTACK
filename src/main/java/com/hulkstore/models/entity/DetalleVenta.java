package com.hulkstore.models.entity;

import jakarta.persistence.*;

import java.util.Optional;

@Entity
public class DetalleVenta {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Integer idDetalleVenta;

    @ManyToOne(optional = false, cascade = CascadeType.DETACH, fetch = FetchType.EAGER)
    private Producto producto;

    private Venta venta;

    private int cantidad;


    public DetalleVenta() {
    }

    public DetalleVenta(Integer idDetalleVenta, Producto producto, Venta venta, int cantidad) {
        this.idDetalleVenta = idDetalleVenta;
        this.producto = producto;
        this.venta = venta;
        this.cantidad = cantidad;
    }

    public Integer getIdDetalleVenta() {
        return idDetalleVenta;
    }

    public void setIdDetalleVenta(Integer idDetalleVenta) {
        this.idDetalleVenta = idDetalleVenta;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
