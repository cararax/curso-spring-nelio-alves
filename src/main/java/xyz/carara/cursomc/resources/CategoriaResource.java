package xyz.carara.cursomc.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import xyz.carara.cursomc.domain.Categoria;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResource {

    @RequestMapping(method = RequestMethod.GET)
    public List<Categoria> listar(){
        Categoria ca1 = new Categoria(1, "informatica");
        Categoria ca2 = new Categoria(2, "asdasdasdas");

        List<Categoria> lista = new ArrayList<>();
        lista.add(ca1);
        lista.add(ca2);

        return lista;
    }



}
