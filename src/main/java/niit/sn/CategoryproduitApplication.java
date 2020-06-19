package niit.sn;

import niit.sn.dao.CategoryRepository;
import niit.sn.dao.ProduitsRepository;
import niit.sn.entities.Category;
import niit.sn.entities.Produits;
import niit.sn.service.ProduitsServieces;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;

@SpringBootApplication
public class CategoryproduitApplication {


    public static void main(String[] args) {
        SpringApplication.run(CategoryproduitApplication.class, args);
    }

        @Bean
        CommandLineRunner start(ProduitsRepository produitsRepository, CategoryRepository categoryRepository, ProduitsServieces produitsServieces){
            return args -> {
   // repositoryRestConfiguration.exposeIdsFor(Products.class, Category.class);
             //  Category category=new Category("IMPRIMENTES",new ArrayList<>());
              // categoryRepository.save(category);
 /*
                Produits produits=new Produits("Iphone",
                        1000.00,null,"12/04/1999",
                        "6s",false,false,false,null);
                produitsRepository.save(produits);


           Category category=new Category();
           category.setName_category("ORDINATEURS");
           category.setProduits(new ArrayList<>());
           categoryRepository.save(category);




           Produits produits=new Produits();
           produits.setName_produits("DELL");
           produits.setPrice_produit(1045);
           produits.setPhoto_produits(null);
           produits.setDate_production("19/05/2020");
           produits.setDescription_produit("Core-i7");
           produits.setPromotion_produits(true);
           produits.setSeletecd_produits(false);
           produits.setDisponible_produits(true);
           produits.setCategory(categoryRepository.findById(id_cat).get());
           produitsRepository.save(produits);

 Category category=new Category();
 long id=categoryRepository.findById().get();
 produitsServieces.saveProduits("DELL", 1045, null,"11/02/2015",
         "Core-i7", false, false, true, );
*/

            produitsServieces.getProduitsDisponible().forEach(c->{
                System.out.println(c.getName_produits());
                System.out.println(c.getPrice_produit());
                System.out.println(c.getDate_production());
                System.out.println(c.getDescription_produit());
                System.out.println(c.getCategory().getName_category());

            });

        };
    }


}
