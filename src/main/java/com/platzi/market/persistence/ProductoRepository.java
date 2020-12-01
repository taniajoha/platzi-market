package com.platzi.market.persistence;

import com.platzi.market.persistence.crud.ProductoCrudRepository;
import com.platzi.market.persistence.entity.Producto;
import com.sun.el.parser.AstTrue;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ProductoRepository {
    private ProductoCrudRepository productoCrudRepository;

    public List<Producto> getAll() {
        return (List<Producto>) productoCrudRepository.findAll();
    }

    public List<Producto> getByCategoria(int IDCATEGORIA){
        return  productoCrudRepository.findByIDCATEGORIAOrderByNOMBREAsc(IDCATEGORIA);
    }

    public Optional<List<Producto>> getESCASOS(int CANTIDAD){
        return productoCrudRepository.findByCANTIDADSTOCKLessThanAndESTADO(CANTIDAD, true);
    }
    public Optional<Producto> getProducto(int IDPRODUCTO){
        return  productoCrudRepository.findById(IDPRODUCTO);
    }

    public Producto save(Producto producto){
        return  productoCrudRepository.save(producto);
    }

    public void  delete(int IDPRODUCTO){
        productoCrudRepository.deleteById(IDPRODUCTO);
    }

}
