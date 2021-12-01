package com.example.emprendedores.controller;

import com.example.emprendedores.entity.Emprendimientos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.example.emprendedores.service.IEmprendimientosService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.PUT,RequestMethod.POST,RequestMethod.DELETE})
@RequestMapping("emprendimientos")
public class EmprendimientosController {

    @Autowired
    private IEmprendimientosService emprendimientosService;

    @GetMapping("/all")
    public List<Emprendimientos> findAll(){
        //retornará todos los usuarios
        return emprendimientosService.findAll();
    }

    @GetMapping("get/{emprendimientosId}")
    public Emprendimientos getEmprendimientos(@PathVariable int emprendimientosId){
        Emprendimientos emprendimientos = emprendimientosService.findById(emprendimientosId);

        if(emprendimientos == null) {
            throw new RuntimeException("emprendimientos id not found -"+emprendimientosId);
        }
        //retornará al emprendimientos con id pasado en la url
        return emprendimientos;
    }

    @PostMapping("/add")
    public Emprendimientos addEmprendimientos(@RequestBody Emprendimientos emprendimientos) {
        emprendimientos.setId(0);

        //Este metodo guardará al emprendedores enviado
        emprendimientosService.save(emprendimientos);

        return emprendimientos;

    }

    @PutMapping("/update")
    public Emprendimientos updateEmprendimientos(@RequestBody Emprendimientos emprendimientos) {

        emprendimientosService.save(emprendimientos);

        //este metodo actualizará al emprendimientos enviado

        return emprendimientos;
    }

    @DeleteMapping("delete/{emprendimientosId}")
    public String deteteEmprendimientos(@PathVariable int emprendimientosId) {

        Emprendimientos emprendimientos = emprendimientosService.findById(emprendimientosId);

        if(emprendimientos == null) {
            throw new RuntimeException("emprendimientos id not found -"+emprendimientosId);
        }

        emprendimientosService.deleteById(emprendimientosId);

        //Esto método, recibira el id de un emprendimientos por URL y se borrará de la bd.
        return "Deleted emprendimientos id - "+emprendimientosId;
    }
}
