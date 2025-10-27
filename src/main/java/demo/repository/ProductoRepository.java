package demo.repository;

import demo.entity.ProductosEnt;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<ProductosEnt, Long> {
}
