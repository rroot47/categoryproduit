package niit.sn.dao;

import niit.sn.entities.Produits;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

@RepositoryRestResource
public interface ProduitsRepository extends JpaRepository<Produits, Long> {

    @Query("select p from Produits p where p.disponible_produits=true")
    @RestResource(path = "/Produits/ProduitsDisponoble")
    public  List<Produits> getProduitsDisponible();

    @Query("select p from Produits p where p.seletecd_produits=true")
    @RestResource(path = "/Produits/ProduitsSelectionnes")
    public List<Produits> getProduitsSelected();

    @Query("select p from Produits p where p.promotion_produits=true")
    @RestResource(path = "/Produits/ProduitsEnPromotion")
    public List<Produits> getProduitsEnPromotion();

    @RestResource(path = "/Produits/TotalProduits")
    public List<Produits> findAll();

}
