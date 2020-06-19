package niit.sn.service;

import niit.sn.entities.Category;
import niit.sn.entities.Produits;

import java.util.List;

public interface ProduitsServieces {

    public Produits saveProduits(String name_prods, double price_prod, String photo_prod, String date_prod, String descr_prod, boolean promo_prod, boolean selct_prod, boolean dispo_prod, Long idcat);
    public  Produits updateProduits(Produits produits);
    public List<Produits> getProduitsEnPromotion();
    public  List<Produits> getProduitsDisponible();
    public List<Produits> getProduitsSelectionnes();
    public Produits deleteProduits(long id);
    public List<Produits> getProduits();

}
