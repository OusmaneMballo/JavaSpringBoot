package cours.java.rh_web_app_spring_boot.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
public class Specialite {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 30)
    private String libelle;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "service_id")
    private Service service;

    @JsonIgnore
    @ManyToMany(mappedBy = "specialites")
    private java.util.List<Medecin> medecins;

    public Specialite() {
    }

    public Specialite(int id, String libelle, Service service) {
        this.id = id;
        this.libelle = libelle;
        this.service = service;
    }

    public int getId() {
        return id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public java.util.List<Medecin> getMedecins() {
        return medecins;
    }

    public void setMedecins(java.util.List<Medecin> medecins) {
        this.medecins = medecins;
    }
}
