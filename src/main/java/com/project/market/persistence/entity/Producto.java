package com.project.market.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name="PRODUCTOS") //nombre tal como está en la tabla de la base de datos
public class Producto {

    @Id // porque es llave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY)//Para que cada registro se autoincremente en la llave primaria
    @Column(name = "id_producto")//Si el nombre de la tabla no es igual al de la variable colocar colum con el nombre real
    private Integer idProducto;
    private String nombre;
    @Column(name = "id_categoria")
    private Integer idCategoria;
    @Column(name = "codigo_barras")
    private String codigoBarras;
    @Column(name = "precio_venta")
    private Double precioVenta;
    @Column(name = "cantidad_stock")
    private Integer cantidadStock;
    private boolean estado;

    @ManyToOne//relacion muchos a pocos
    @JoinColumn(name = "id_categoria", insertable = false, updatable = false)//campo de relacion qu eimpide insertar y actualizar
    private Categoria categoria;//Tabla de productos relacionada con tabla categoria

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public Double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(Double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public Integer getCantidadStock() {
        return cantidadStock;
    }

    public void setCantidadStock(Integer cantidadStock) {
        this.cantidadStock = cantidadStock;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
