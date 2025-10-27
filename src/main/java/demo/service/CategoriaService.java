package demo.service;

import demo.entity.Categoria;
import demo.model.CategoriaModel;
import demo.repository.CategoriaRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
@Service
public class CategoriaService {

    private final CategoriaRepository categoriaRepository;

    CategoriaService(CategoriaRepository categoriaRepository) {
        this.categoriaRepository = categoriaRepository;
    }

     public List<CategoriaModel> findAll() {
        List<Categoria> categorias = categoriaRepository.findAll();
        List<CategoriaModel> categoriasModel = categorias.stream().map( categoria -> {

            return toCategoriaModel(categoria);
        }).collect(Collectors.toList());
        return categoriasModel;
     }


    public CategoriaModel create(CategoriaModel categoriaModel) {
       Categoria categoria = toCategoria(categoriaModel);

       return toCategoriaModel(categoriaRepository.save(categoria));

    }



    //Convertir categoriaentity a categoriaModel

    private CategoriaModel toCategoriaModel(Categoria categoria) {
        return  new CategoriaModel.Builder()
                .id(categoria.getId())
                .nombrecategoria(categoria.getNombrecategoria())
                .createat(categoria.getCreateat()).

                build();



    }

    //convertir categoria model a categoriaentity

    private Categoria toCategoria(CategoriaModel categoriaModel) {
        Categoria categoria = new Categoria();
        categoria.setId(categoriaModel.getId());
        categoria.setNombrecategoria(categoriaModel.getNombrecategoria());
        categoria.setCreateat(categoriaModel.getCreateat());
        return categoria;

    }
}
