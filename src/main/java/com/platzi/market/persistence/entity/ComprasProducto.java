package com.platzi.market.persistence.entity;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;

@Entity
@Table(name="COMPRAS_PRODUCTOS")
public class ComprasProducto {

    @EmbeddedId
    private ComprasProductoPK ID;

    private Integer CANTIDAD;

    private Integer TOTAL;

    private  Boolean ESTADO;

    @ManyToOne
    @JoinColumn(name = "ID_COMPRA",insertable = false,updatable = false)
    private Compra compra;


    @ManyToOne
    @JoinColumn(name = "ID_PRODUCTO",insertable = false,updatable = false)
    private Producto producto;

    public ComprasProductoPK getID() {
        return ID;
    }

    public void setID(ComprasProductoPK ID) {
        this.ID = ID;
    }

    public Integer getCANTIDAD() {
        return CANTIDAD;
    }

    public void setCANTIDAD(Integer CANTIDAD) {
        this.CANTIDAD = CANTIDAD;
    }

    public Integer getTOTAL() {
        return TOTAL;
    }

    public void setTOTAL(Integer TOTAL) {
        this.TOTAL = TOTAL;
    }

    public Boolean getESTADO() {
        return ESTADO;
    }

    public void setESTADO(Boolean ESTADO) {
        this.ESTADO = ESTADO;
    }
}
