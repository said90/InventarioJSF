package Modelo;
// Generated 11-dic-2016 14:00:55 by Hibernate Tools 4.3.1


import java.math.BigDecimal;

/**
 * Detallefactura generated by hbm2java
 */
public class Detallefactura  implements java.io.Serializable {


     private Integer codDetalle;
     private Factura factura;
     private Producto producto;
     private String codBarra;
     private String nombreProducto;
     private Integer cantidad;
     private BigDecimal precioVenta;
     private BigDecimal total;

    public Detallefactura() {
    }

    public Detallefactura(Factura factura, Producto producto, String codBarra, String nombreProducto, Integer cantidad, BigDecimal precioVenta, BigDecimal total) {
       this.factura = factura;
       this.producto = producto;
       this.codBarra = codBarra;
       this.nombreProducto = nombreProducto;
       this.cantidad = cantidad;
       this.precioVenta = precioVenta;
       this.total = total;
    }
   
    public Integer getCodDetalle() {
        return this.codDetalle;
    }
    
    public void setCodDetalle(Integer codDetalle) {
        this.codDetalle = codDetalle;
    }
    public Factura getFactura() {
        return this.factura;
    }
    
    public void setFactura(Factura factura) {
        this.factura = factura;
    }
    public Producto getProducto() {
        return this.producto;
    }
    
    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    public String getCodBarra() {
        return this.codBarra;
    }
    
    public void setCodBarra(String codBarra) {
        this.codBarra = codBarra;
    }
    public String getNombreProducto() {
        return this.nombreProducto;
    }
    
    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }
    public Integer getCantidad() {
        return this.cantidad;
    }
    
    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
    public BigDecimal getPrecioVenta() {
        return this.precioVenta;
    }
    
    public void setPrecioVenta(BigDecimal precioVenta) {
        this.precioVenta = precioVenta;
    }
    public BigDecimal getTotal() {
        return this.total;
    }
    
    public void setTotal(BigDecimal total) {
        this.total = total;
    }




}


