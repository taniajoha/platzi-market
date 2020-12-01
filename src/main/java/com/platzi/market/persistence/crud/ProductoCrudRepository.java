package com.platzi.market.persistence.crud;

import com.platzi.market.persistence.entity.Producto;
import org.hibernate.mapping.Value;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import javax.management.ValueExp;
import java.util.List;
import java.util.Optional;

public interface ProductoCrudRepository extends CrudRepository <Producto, Integer>{
    // @Query(value = "SELECT * FROM productos Where ID_CATEGORIA = ?, nativeQuery=true")
    List<Producto> findByIDCATEGORIAOrderByNOMBREAsc(int IDCATEGORIA);
    Optional<List<Producto>>findByCANTIDADSTOCKLessThanAndESTADO(int CANTIDADSTOCK, boolean ESTADO);
}
