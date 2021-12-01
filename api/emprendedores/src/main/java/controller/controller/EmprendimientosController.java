package controller.controller;

import entity.entity.Emprendedores;
import entity.entity.Emprendimientos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.service.IEmprendedoresService;
import service.service.IEmprendimientosService;

import java.util.List;

public class EmprendimientosController {

    @Autowired
    private IEmprendimientosService emprendimientosService;

    @GetMapping("/emprendimientos")
    public List<Emprendimientos> findAll(){
        //retornará todos los usuarios
        return emprendimientosService.findAll();
    }

    @GetMapping("/emprendimientos/{emprendimientosId}")
    public Emprendimientos getEmprendimientos(@PathVariable int emprendimientosId){
        Emprendimientos emprendimientos = emprendimientosService.findById(emprendimientosId);

        if(emprendimientos == null) {
            throw new RuntimeException("emprendimientos id not found -"+emprendimientosId);
        }
        //retornará al emprendimientos con id pasado en la url
        return emprendimientos;
    }

    @PostMapping("/emprendimientos")
    public Emprendimientos addEmprendimientos(@RequestBody Emprendimientos emprendimientos) {
        emprendimientos.setId(0);

        //Este metodo guardará al emprendedores enviado
        emprendimientosService.save(emprendimientos);

        return emprendimientos;

    }

    @PutMapping("/emprendimientos")
    public Emprendimientos updateEmprendimientos(@RequestBody Emprendimientos emprendimientos) {

        emprendimientosService.save(emprendimientos);

        //este metodo actualizará al emprendimientos enviado

        return emprendimientos;
    }

    @DeleteMapping("emprendimientos/{emprendimientosId}")
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
