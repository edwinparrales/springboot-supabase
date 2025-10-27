package demo.model;


import demo.repository.CategoriaRepository;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Optional;

public  class CategoriaModel implements Serializable {
    private  Integer id;

    private  LocalDate createat;

    private  String nombrecategoria;
    CategoriaModel() {}

    private CategoriaModel(Builder builder) {
        this.id = builder.id;
        this.createat = builder.createat;
        this.nombrecategoria = builder.nombrecategoria;
    }

    public Integer getId() {
        return id;
    }

    public LocalDate getCreateat() {
        return createat;
    }

    public String getNombrecategoria() {
        return nombrecategoria;
    }

    public static class Builder {
        private Integer id;
        private LocalDate createat;
        private String nombrecategoria;

        public Builder id(Integer id) {
            this.id = id;
            return this;
        }
        public Builder createat(LocalDate createat) {
            this.createat = createat;
            return this;
        }
        public Builder nombrecategoria(String nombrecategoria) {
            this.nombrecategoria = nombrecategoria;
            return this;
        }
        public CategoriaModel build() {
            return new CategoriaModel(this);
        }


    }

}
