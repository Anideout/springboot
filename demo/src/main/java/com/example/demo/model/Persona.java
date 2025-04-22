package com.example.demo.model;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Persona {

   @Id
    private String rut;
    private String nombre;

    //"persona" indica con que campo de la clase vehiculo nos estamos uniendo 
    //en la clase Vehiculo debe existir un campo llamado persona
    // lista de vehiculo
    @OneToMany(mappedBy = "persona", cascade = CascadeType.ALL)
    private List<Vehiculo> vehiculos;

    
    public Persona() {
        this.rut = "";
        this.nombre = "";
        this.vehiculos = new ArrayList<Vehiculo>();
    }

    // alt + insert
    public void setRut(String rut) {
        this.rut = "";

    }

    public String getRut() {
        return this.rut;
    }
    public void setNombre(String nombre){
        this.nombre= nombre;
    }

    public String getNombre() {
        return this.nombre;
    }
    

    //alt + insert
    /**
     * @return List<Vehiculo> return the vehiculos
     */
    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    /**
     * @param vehiculos the vehiculos to set
     */
    public void setVehiculos(List<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

}
