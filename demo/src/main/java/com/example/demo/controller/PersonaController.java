package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Persona;
import com.example.demo.model.Vehiculo;
import com.example.demo.repository.PersonaRepository;


@RestController
@RequestMapping("/personas")
public class PersonaController {

    @Autowired private PersonaRepository repository;

    @PostMapping
    public Persona almacenar (@RequestBody Persona persona) {
        //va vehiculo por vehiculo diciendo que pertenece a persona
        for(Vehiculo v: persona.getVehiculos()) {
            v.setPersona(persona);
        }
        return repository.save(persona);
    }
    @GetMapping
    public List<Persona> obtenerPersona() {
        return repository.findAll();
    }


    // ELIMINAR UNA PERSONA
    /*@DeleteMapping("/{rut}")
    public ResponseEntity<String> eliminar(@PathVariable String rut) {
        if(PersonaRepository.existsById(rut)) {
            PersonaRepository.deleteById(rut);
            return ResponseEntity.status(HTTpStatus.No)
        }
    }*/


}

