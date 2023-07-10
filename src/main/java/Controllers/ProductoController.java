package Controllers;

import Entities.ProductoEntity;
import Services.ProductoService;
import Services.ProductoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/producto")
public class ProductoController {
    @Autowired
    ProductoServiceImpl productoService;

    @GetMapping("/{nombre}")
    public ResponseEntity<ProductoEntity> buscarProductoPorNombre(@PathVariable String nombre) {
        return ResponseEntity.ok(productoService.buscarProductoPorNombre(nombre));
    }

    @GetMapping("categoria/{cat}")
            public ResponseEntity<List<ProductoEntity>> buscarProductoPorCategoria(@PathVariable String cat) {
        return ResponseEntity.ok((List<ProductoEntity>) productoService.buscarProductoPorCategoria(cat));
    }
    @GetMapping("/lista")
    public ResponseEntity<List<ProductoEntity>> ListaDeProductos(){
        return ResponseEntity.ok(productoService.ListaDeProductos());
    }

}
