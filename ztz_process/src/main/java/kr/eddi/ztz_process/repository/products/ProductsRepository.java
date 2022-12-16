package kr.eddi.ztz_process.repository.products;

import kr.eddi.ztz_process.entity.products.Local;
import kr.eddi.ztz_process.entity.products.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface ProductsRepository extends JpaRepository<Product, Long> {
    @Query("select p from Product p where p.classification.local = :local")
    List<Product> filterLoco(Local local);
}