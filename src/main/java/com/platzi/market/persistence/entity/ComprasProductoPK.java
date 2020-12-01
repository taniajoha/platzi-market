package com.platzi.market.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class ComprasProductoPK implements Serializable {

    @Column(name = "ID_COMPRA")
    private Integer IDCOMPRA;

    @Column(name = "ID_PRODUCTO")
    private Integer IDPRODUCTO;

    public Integer getIDCOMPRA() {
        return IDCOMPRA;
    }

    public void setIDCOMPRA(Integer IDCOMPRA) {
        this.IDCOMPRA = IDCOMPRA;
    }

    public Integer getIDPRODUCTO() {
        return IDPRODUCTO;
    }

    public void setIDPRODUCTO(Integer IDPRODUCTO) {
        this.IDPRODUCTO = IDPRODUCTO;
    }
}
