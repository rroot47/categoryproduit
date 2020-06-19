package niit.sn.service;

import niit.sn.dao.CategoryRepository;
import niit.sn.dao.ProduitsRepository;
import niit.sn.entities.Category;
import niit.sn.entities.Produits;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ProduitsServiecesImplementation implements ProduitsServieces {

    private ProduitsRepository produitsRepository;
    private CategoryRepository categoryRepository;
    private Long id;

    public ProduitsServiecesImplementation(ProduitsRepository produitsRepository, CategoryRepository categoryRepository) {
        this.produitsRepository = produitsRepository;
        this.categoryRepository=categoryRepository;
    }


    @Override
    public Produits saveProduits(String name_prods, double price_prod, String photo_prod, String date_prod,
                                 String descr_prod, boolean promo_prod, boolean selct_prod, boolean dispo_prod, Long idcat) {

        Category category=categoryRepository.findById(idcat).get();
        Produits produits=new Produits();
        produits.setName_produits(name_prods);
        produits.setPrice_produit(price_prod);
        produits.setPhoto_produits(photo_prod);
        produits.setDate_production(date_prod);
        produits.setDescription_produit(descr_prod);
        produits.setPromotion_produits(promo_prod);
        produits.setSeletecd_produits(selct_prod);
        produits.setDisponible_produits(dispo_prod);
        produits.setCategory(category);

        return produitsRepository.save(produits);
    }

    @Override
    public Produits updateProduits(Produits produits) {
        return null;
    }

    @Override
    public List<Produits> getProduitsEnPromotion() {
        return produitsRepository.getProduitsEnPromotion();
    }

    @Override
    public List<Produits> getProduitsDisponible() {
        return produitsRepository.getProduitsDisponible();
    }

    @Override
    public List<Produits> getProduitsSelectionnes() {
        return produitsRepository.getProduitsEnPromotion();
    }

    @Override
    public Produits deleteProduits(long id) {
        return null;
    }

    @Override
    public List<Produits> getProduits() {
        return produitsRepository.findAll();
    }

}
