package niit.sn.web;

import niit.sn.entities.Category;

public class ProduitsForm {

    private String name_produits;
    private double price_produit;
    private String photo_produits;
    private String date_production;
    private String description_produit;
    private boolean promotion_produits;
    private boolean seletecd_produits;
    private boolean disponible_produits;
    private Long id_cat;

    public String getName_produits() {
        return name_produits;
    }

    public void setName_produits(String name_produits) {
        this.name_produits = name_produits;
    }

    public double getPrice_produit() {
        return price_produit;
    }

    public void setPrice_produit(double price_produit) {
        this.price_produit = price_produit;
    }

    public String getPhoto_produits() {
        return photo_produits;
    }

    public void setPhoto_produits(String photo_produits) {
        this.photo_produits = photo_produits;
    }

    public String getDate_production() {
        return date_production;
    }

    public void setDate_production(String date_production) {
        this.date_production = date_production;
    }

    public String getDescription_produit() {
        return description_produit;
    }

    public void setDescription_produit(String description_produit) {
        this.description_produit = description_produit;
    }

    public boolean isPromotion_produits() {
        return promotion_produits;
    }

    public void setPromotion_produits(boolean promotion_produits) {
        this.promotion_produits = promotion_produits;
    }

    public boolean isSeletecd_produits() {
        return seletecd_produits;
    }

    public void setSeletecd_produits(boolean seletecd_produits) {
        this.seletecd_produits = seletecd_produits;
    }

    public boolean isDisponible_produits() {
        return disponible_produits;
    }

    public void setDisponible_produits(boolean disponible_produits) {
        this.disponible_produits = disponible_produits;
    }

    public Long getId_cat() {
        return id_cat;
    }

    public void setId_cat(Long id_cat) {
        this.id_cat = id_cat;
    }
}
