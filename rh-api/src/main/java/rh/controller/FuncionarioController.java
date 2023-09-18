package rh.controller;


import org.springframework.web.bind.annotation.*;
import rh.model.Funcionario;

@RestController
@RequestMapping("/funcionarios")
public class FuncionarioController {

    @GetMapping
    public String testar(){
        return "Testando API";
    }

    @PostMapping
    public Funcionario cadastrar(@RequestBody Funcionario funcionario){
        System.out.println(funcionario);
        return funcionario;
    }

}
