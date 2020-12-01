package com.platzi.market.persistence.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "CLIENTES")
public class Cliente {
    @Id
    private String ID;

    private String NOMBRE;
    private String APELLIDOS;
    private Integer CELULAR;
    private Integer DIRECCION;

    @Column(name = "CORREO_ELECTRONICO")
    private String CORREOELECTRONICO;

    @OneToMany(mappedBy = "cliente")
    private List<Compra> compras;


    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNOMBRE() {
        return NOMBRE;
    }

    public void setNOMBRE(String NOMBRE) {
        this.NOMBRE = NOMBRE;
    }

    public String getAPELLIDOS() {
        return APELLIDOS;
    }

    public void setAPELLIDOS(String APELLIDOS) {
        this.APELLIDOS = APELLIDOS;
    }

    public Integer getCELULAR() {
        return CELULAR;
    }

    public void setCELULAR(Integer CELULAR) {
        this.CELULAR = CELULAR;
    }

    public Integer getDIRECCION() {
        return DIRECCION;
    }

    public void setDIRECCION(Integer DIRECCION) {
        this.DIRECCION = DIRECCION;
    }

    public String getCORREOELECTRONICO() {
        return CORREOELECTRONICO;
    }

    public void setCORREOELECTRONICO(String CORREOELECTRONICO) {
        this.CORREOELECTRONICO = CORREOELECTRONICO;
    }
}
