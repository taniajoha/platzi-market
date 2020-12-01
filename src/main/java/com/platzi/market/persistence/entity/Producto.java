package com.platzi.market.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name= "PRODUCTOS")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name ="ID_PRODUCTO")
    private Integer IDPRODUCTO;

    private String NOMBRE;

    @Column (name ="ID_CATEGORIA")
    private Integer IDCATEGORIA;

    @Column (name ="CODIGO_BARRAS")
    private String CODIGOBARRAS;

    @Column (name ="PRECIO_VENTA")
    private Double PRECIOVENTA;

    @Column (name ="CANTIDAD_STOCK")
    private Integer CANTIDADSTOCK;

    private Boolean ESTADO;

    @ManyToOne
    @JoinColumn(name= "ID_CATEGORIA", insertable = false, updatable = false)
    private Categoria categoria;

    public Integer getIDPRODUCTO() {
        return IDPRODUCTO;
    }

    public void setIDPRODUCTO(Integer IDPRODUCTO) {
        this.IDPRODUCTO = IDPRODUCTO;
    }

    public String getNOMBRE() {
        return NOMBRE;
    }

    public void setNOMBRE(String NOMBRE) {
        this.NOMBRE = NOMBRE;
    }

    public Integer getIDCATEGORIA() {
        return IDCATEGORIA;
    }

    public void setIDCATEGORIA(Integer IDCATEGORIA) {
        this.IDCATEGORIA = IDCATEGORIA;
    }

    public String getCODIGOBARRAS() {
        return CODIGOBARRAS;
    }

    public void setCODIGOBARRAS(String CODIGOBARRAS) {
        this.CODIGOBARRAS = CODIGOBARRAS;
    }

    public Double getPRECIOVENTA() {
        return PRECIOVENTA;
    }

    public void setPRECIOVENTA(Double PRECIOVENTA) {
        this.PRECIOVENTA = PRECIOVENTA;
    }

    public Integer getCANTIDADSTOCK() {
        return CANTIDADSTOCK;
    }

    public void setCANTIDADSTOCK(Integer CANTIDADSTOCK) {
        this.CANTIDADSTOCK = CANTIDADSTOCK;
    }

    public Boolean getEstado() {
        return ESTADO;
    }

    public void setEstado(Boolean estado) {
        this.ESTADO = estado;
    }
}
