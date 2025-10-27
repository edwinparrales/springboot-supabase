package demo.controller;

import demo.model.CategoriaModel;
import demo.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/categoria")
public class CategoriaController {
    @Autowired
    private CategoriaService categoriaService;


    @GetMapping
    public ResponseEntity<List<CategoriaModel>> findAll() {
        return new ResponseEntity<>(categoriaService.findAll(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<CategoriaModel> save(@RequestBody CategoriaModel categoriaModel) {

        return new ResponseEntity<>(categoriaService.create(categoriaModel),HttpStatus.CREATED);

    }
}
