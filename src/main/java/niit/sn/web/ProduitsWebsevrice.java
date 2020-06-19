package niit.sn.web;

import niit.sn.entities.Produits;
import niit.sn.service.ProduitsServieces;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProduitsWebsevrice {

    private ProduitsServieces produitsServieces;

    public ProduitsWebsevrice(ProduitsServieces produitsServieces) {
        this.produitsServieces = produitsServieces;
    }

    @PostMapping("/addproducts")
    public Produits addProduits(@RequestBody ProduitsForm produitsForm){
        return produitsServieces.saveProduits(
                produitsForm.getName_produits(), produitsForm.getPrice_produit(), produitsForm.getPhoto_produits(),
                produitsForm.getDate_production(), produitsForm.getDescription_produit(), produitsForm.isDisponible_produits(),
                produitsForm.isPromotion_produits(), produitsForm.isSeletecd_produits(), produitsForm.getId_cat()
        );

    }
}
