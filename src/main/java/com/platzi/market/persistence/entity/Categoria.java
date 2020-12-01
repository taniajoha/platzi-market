package com.platzi.market.persistence.entity;


import javax.lang.model.element.Name;
import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import java.security.PrivateKey;
import java.util.List;

@Entity
@Table(name="CATEGORIAS")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_CATEGORIA")
    private Integer IDCATEGORIA;

    private String DESCRIPCION;

    private Boolean ESTADO;

    @OneToMany(mappedBy = "categoria")
    private List<Producto> productos;

    public Integer getIDCATEGORIA() {
        return IDCATEGORIA;
    }

    public void setIDCATEGORIA(Integer IDCATEGORIA) {
        this.IDCATEGORIA = IDCATEGORIA;
    }

    public String getDESCRIPCION() {
        return DESCRIPCION;
    }

    public void setDESCRIPCION(String DESCRIPCION) {
        this.DESCRIPCION = DESCRIPCION;
    }

    public Boolean getESTADO() {
        return ESTADO;
    }

    public void setESTADO(Boolean ESTADO) {
        this.ESTADO = ESTADO;
    }
}
