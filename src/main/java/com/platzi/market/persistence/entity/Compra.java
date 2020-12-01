package com.platzi.market.persistence.entity;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name= "COMPRAS")

public class Compra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_COMPRA")
    private Integer IDCOMPRA;

    @Column(name = "ID_CLIENTE")
    private String IDCLIENTE;

    private LocalDateTime FECHA;

    @Column(name = "MEDIO_PAGO")
    private String MEDIOPAGO;

    private String COMENTARIO;

    private String ESTADO;

    @ManyToOne
    @JoinColumn(name = "ID_CLIENTE", insertable = false, updatable = false)
    private Cliente cliente;

    @OneToMany(mappedBy = "producto")
    private List<ComprasProducto> productos;

    public Integer getIDCOMPRA() {
        return IDCOMPRA;
    }

    public void setIDCOMPRA(Integer IDCOMPRA) {
        this.IDCOMPRA = IDCOMPRA;
    }

    public String getIDCLIENTE() {
        return IDCLIENTE;
    }

    public void setIDCLIENTE(String IDCLIENTE) {
        this.IDCLIENTE = IDCLIENTE;
    }

    public LocalDateTime getFECHA() {
        return FECHA;
    }

    public void setFECHA(LocalDateTime FECHA) {
        this.FECHA = FECHA;
    }

    public String getMEDIOPAGO() {
        return MEDIOPAGO;
    }

    public void setMEDIOPAGO(String MEDIOPAGO) {
        this.MEDIOPAGO = MEDIOPAGO;
    }

    public String getCOMENTARIO() {
        return COMENTARIO;
    }

    public void setCOMENTARIO(String COMENTARIO) {
        this.COMENTARIO = COMENTARIO;
    }

    public String getESTADO() {
        return ESTADO;
    }

    public void setESTADO(String ESTADO) {
        this.ESTADO = ESTADO;
    }
}
