package Services;

import Entities.ProductoEntity;
import Repositories.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface ProductoService {


    ProductoEntity buscarProductoPorNombre(String nombre);
    ProductoEntity buscarProductoPorCategoria(String nombre);

    List<ProductoEntity> ListaDeProductos();
}
