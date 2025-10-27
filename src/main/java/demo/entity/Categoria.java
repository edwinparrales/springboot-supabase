package demo.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "categorias")
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idcategoria", nullable = false)
    private Integer id;

    @Column(name = "createat")
    private LocalDate createat;

    @Column(name = "nombrecategoria")
    private String nombrecategoria;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getCreateat() {
        return createat;
    }

    public void setCreateat(LocalDate createat) {
        this.createat = createat;
    }

    public String getNombrecategoria() {
        return nombrecategoria;
    }

    public void setNombrecategoria(String nombrecategoria) {
        this.nombrecategoria = nombrecategoria;
    }

}