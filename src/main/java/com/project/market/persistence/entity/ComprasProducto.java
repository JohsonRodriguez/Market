package com.project.market.persistence.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "COMPRAS_PRODUCTOS")
public class ComprasProducto {

    @EmbeddedId //id generado de la tabla serialiable
    
private  ComprasProductoPk id;

}
