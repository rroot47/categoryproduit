package niit.sn.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

@Entity
public class Category implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_cat;
    @Column(unique = true)
    private String name_category;
    @OneToMany(mappedBy = "category")
    private Collection<Produits> produits=new ArrayList<>();

    public Category() {
    }

    public Category(String name_category, Collection<Produits> produits) {

        this.name_category=name_category;
        this.produits=produits;
    }

    public Category(Long id_cat) {

       this.id_cat=id_cat;
    }

    public Long getId_cat() {
        return id_cat;
    }

    public void setId_cat(Long id_cat) {
        this.id_cat = id_cat;
    }

    public String getName_category() {
        return name_category;
    }

    public void setName_category(String name_category) {
        this.name_category = name_category;
    }

    public Collection<Produits> getProduits() {
        return produits;
    }

    public void setProduits(Collection<Produits> produits) {
        this.produits = produits;
    }
}
