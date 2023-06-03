package com.example.contato.controller;

import com.example.contato.entidade.Pessoa;
import com.example.contato.repositorio.RepositorioContato;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contato")
public class ContatoREST {

    // injeção de dependencia, dessa forma o spring cria o objeto
    @Autowired
    private RepositorioContato repositorio;

    @GetMapping(path = "/consultar")
    @ResponseStatus(HttpStatus.OK)
    public List<Pessoa> listarTodos() {
        return repositorio.findAll();
    }

    @PostMapping(path = "/salvar")
    @ResponseStatus(HttpStatus.CREATED)
    //@RequestBody converte os dados em JSON para objeto JAVA
    public void salvar (@RequestBody Pessoa pessoa) {
        repositorio.save(pessoa);
    }

    @PutMapping(path = "/atualizar")
    @ResponseStatus(HttpStatus.OK)
    //@RequestBody converte os dados em JSON para objeto JAVA
    public void alterar (@RequestBody Pessoa pessoa) {
        if (pessoa.getId() > 0) {
            repositorio.save(pessoa);
        }
    }

    @DeleteMapping(path = "/excluir")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void excluir (@RequestBody Pessoa pessoa) {
        repositorio.delete(pessoa);
    }
}
