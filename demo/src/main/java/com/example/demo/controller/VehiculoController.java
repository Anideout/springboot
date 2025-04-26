package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Vehiculo;
import com.example.demo.repository.VehiculoRepository;

@RestController
@RequestMapping("/vehiculos")
public class VehiculoController {

    @Autowired
     private VehiculoRepository repository;
    
    @GetMapping
    public List<Vehiculo> obtenerVehiculos(){
        return repository.findAll();
           
    }

    @GetMapping("/persona/{rut}")
    public List<Vehiculo> buscarPorRut(@PathVariable String rut) {
        return repository.findByPersonaRut(rut);
    }

    @DeleteMapping("/patente/{patente}")
    public ResponseEntity<String> eliminar(@PathVariable String patente) {
        Vehiculo vehiculo = VehiculoRepository.findByPatente(patente);
        if(vehiculo != null){
            VehiculoRepository.delete(vehiculo);
            return ResponseEntity.ok("Vehiculo eliminado correctamente");
        }else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
            .body("Vehiculo no encontrado");
        }
    }


}
