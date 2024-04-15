package voiture.voiture;

public class Voiture {
    public String libelle;
    public Integer prix;
    public Integer poids;

    public Voiture(String libelle, Integer prix, Integer poids) {
        this.libelle = libelle;
        this.prix = prix;
        this.poids = poids;
    }

    public Voiture() {
    }

    public String getLibelle() {
        return libelle;
    }

    public Integer getPrix() {
        return prix;
    }

    public Integer getPoids() {
        return poids;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public void setPrix(Integer prix) {
        this.prix = prix;
    }

    public void setPoids(Integer poids) {
        this.poids = poids;
    }

    @Override
    public String toString() {
        return "Voiture{" +
                "libelle='" + getLibelle() + '\'' +
                ", prix=" + getPrix() +
                ", poids=" + getPoids() +
                '}';
    }
}
