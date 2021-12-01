package controller.controller;

import entity.entity.Emprendedores;
import service.service.EmprendedoresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.service.IEmprendedoresService;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.PUT,RequestMethod.POST,RequestMethod.DELETE})
@RequestMapping("/api")

public class EmprendedoresController {

    @Autowired
    private IEmprendedoresService emprendedoresService;

    @GetMapping("/emprendedores")
    public List<Emprendedores> findAll(){
        //retornará todos los usuarios
        return emprendedoresService.findAll();
    }

    @GetMapping("/emprendedores/{emprendedoresId}")
    public Emprendedores getEmprendedores(@PathVariable int emprendedoresId){
        Emprendedores emprendedores = emprendedoresService.findById(emprendedoresId);

        if(emprendedores == null) {
            throw new RuntimeException("Emprendedores id not found -"+emprendedoresId);
        }
        //retornará al usuario con id pasado en la url
        return emprendedores;
    }

    @PostMapping("/emprendedores")
    public Emprendedores addEmprendedores(@RequestBody Emprendedores emprendedores) {
        emprendedores.setId(0);

        //Este metodo guardará al emprendedores enviado
        emprendedoresService.save(emprendedores);

        return emprendedores;

    }

    @PutMapping("/emprendedores")
    public Emprendedores updateEmprendedores(@RequestBody Emprendedores emprendedores) {

        emprendedoresService.save(emprendedores);

        //este metodo actualizará al emprendedores enviado

        return emprendedores;
    }

    @DeleteMapping("emprendedores/{emprendedoresId}")
    public String deteteUser(@PathVariable int emprendedoresId) {

        Emprendedores user = emprendedoresService.findById(emprendedoresId);

        if(user == null) {
            throw new RuntimeException("emprendedores id not found -"+emprendedoresId);
        }

        emprendedoresService.deleteById(emprendedoresId);

        //Esto método, recibira el id de un usuario por URL y se borrará de la bd.
        return "Deleted emprendedores id - "+emprendedoresId;
    }

}
