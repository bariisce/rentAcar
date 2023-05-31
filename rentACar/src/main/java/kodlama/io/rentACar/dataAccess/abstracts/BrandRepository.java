package kodlama.io.rentACar.dataAccess.abstracts;



import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.rentACar.entities.concretes.Brand;

public interface BrandRepository extends JpaRepository<Brand, Integer>{
	boolean existsByName(String name); // Concrete'ini yazmaya gerek yok çünkü Spring Jpa exists i gördüğü an name alanına göre veritabanına bakıp true false döndüren bir sorgu oluşturuyor.
}
