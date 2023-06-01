package com.example.contato.controller;

import com.example.contato.entidade.Pessoa;
import com.example.contato.repositorio.RepositorioContato;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pessoa")
public class ContatoREST {

    // injeção de dependencia, dessa forma o spring cria o objeto
    @Autowired
    private RepositorioContato repositorio;

    @GetMapping
    public List<Pessoa> listarTodos() {
        return repositorio.findAll();
    }

    @PostMapping
    //@RequestBody converte os dados em JSON para objeto JAVA
    public void salvar (@RequestBody Pessoa pessoa) {
        if (pessoa.getId() > 0) {
            repositorio.save(pessoa);
        }
    }

    @PutMapping
    //@RequestBody converte os dados em JSON para objeto JAVA
    public void alterar (@RequestBody Pessoa pessoa) {
        if (pessoa.getId() > 0) {
            repositorio.save(pessoa);
        }
    }

    @DeleteMapping
    public void excluir (@RequestBody Pessoa pessoa) {
        repositorio.delete(pessoa);
    }
}
