package Modelo;
// Generated 11-dic-2016 14:00:55 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Factura generated by hbm2java
 */
public class Factura  implements java.io.Serializable {


     private Integer codFactura;
     private Cliente cliente;
     private Vendedor vendedor;
     private String numeroFactura;
     private BigDecimal totalVenta;
     private Date fechaRegistro;
     private Set<Detallefactura> detallefacturas = new HashSet<Detallefactura>(0);

    public Factura() {
    }

	
    public Factura(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
    public Factura(Cliente cliente, Vendedor vendedor, String numeroFactura, BigDecimal totalVenta, Date fechaRegistro, Set<Detallefactura> detallefacturas) {
       this.cliente = cliente;
       this.vendedor = vendedor;
       this.numeroFactura = numeroFactura;
       this.totalVenta = totalVenta;
       this.fechaRegistro = fechaRegistro;
       this.detallefacturas = detallefacturas;
    }
   
    public Integer getCodFactura() {
        return this.codFactura;
    }
    
    public void setCodFactura(Integer codFactura) {
        this.codFactura = codFactura;
    }
    public Cliente getCliente() {
        return this.cliente;
    }
    
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public Vendedor getVendedor() {
        return this.vendedor;
    }
    
    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }
    public String getNumeroFactura() {
        return this.numeroFactura;
    }
    
    public void setNumeroFactura(String numeroFactura) {
        this.numeroFactura = numeroFactura;
    }
    public BigDecimal getTotalVenta() {
        return this.totalVenta;
    }
    
    public void setTotalVenta(BigDecimal totalVenta) {
        this.totalVenta = totalVenta;
    }
    public Date getFechaRegistro() {
        return this.fechaRegistro;
    }
    
    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
    public Set<Detallefactura> getDetallefacturas() {
        return this.detallefacturas;
    }
    
    public void setDetallefacturas(Set<Detallefactura> detallefacturas) {
        this.detallefacturas = detallefacturas;
    }




}


