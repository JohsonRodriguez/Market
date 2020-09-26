package com.project.market.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "COMPRAS") //nombre tal como esta la tabla en la base de datos
public class Compra {

    @Column(name = "id_compra")
    private Integer idCompra;
    
}
