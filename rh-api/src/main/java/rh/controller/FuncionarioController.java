package rh.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rh.model.Funcionario;
import rh.repository.FuncionarioRepository;

import java.util.List;

@RestController
@RequestMapping("/funcionarios")
public class FuncionarioController {

    @Autowired
    private FuncionarioRepository funcionarioRepository;


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Funcionario cadastrar(@RequestBody Funcionario funcionario){
        return funcionarioRepository.save(funcionario);
    }

    @GetMapping
    public List<Funcionario> listar(){
        return funcionarioRepository.findAll();
    }

    @GetMapping("/{funcionarioId}")
    public ResponseEntity<Funcionario> buscar(@PathVariable Long funcionarioId){
        return funcionarioRepository.findById(funcionarioId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{funcionarioId}")
    public ResponseEntity<Funcionario> atualizar(@PathVariable Long funcionarioId,
                                                 @RequestBody Funcionario funcionario){

        if(!funcionarioRepository.existsById(funcionarioId)){
            return ResponseEntity.notFound().build();
        }
        funcionario.setId(funcionarioId);
        Funcionario funcionarioAtualizado = funcionarioRepository.save(funcionario);
        return ResponseEntity.ok(funcionarioAtualizado);
    }
}
