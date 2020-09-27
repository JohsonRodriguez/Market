package com.project.market.persistence.mapper;


import com.project.market.domain.Category;
import com.project.market.persistence.entity.Categoria;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface CategoryMapper {
    //Mapeamos los campos de español a ingles

    @Mappings({
            @Mapping(source = "idCategoria", target = "categoryId"),
            @Mapping(source = "idCategoria", target = "categoryId"),
            @Mapping(source = "idCategoria", target = "categoryId"),
            @Mapping(source = "idCategoria", target = "categoryId"),
    })
    Category toCategory(Categoria categoria);

}
