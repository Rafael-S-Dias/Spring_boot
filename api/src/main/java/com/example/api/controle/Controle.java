package com.example.api.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.api.modelo.Pessoa;
import com.example.api.repositorio.Repositorio;

@RestController
public class Controle {
    
    @GetMapping("")
    public String mensagem(){
        return "Salve fuboca";
    }

    @GetMapping("/boasVindas")
    public String boasVindas(){
        return "Seja bem vindo ";
    }

    @GetMapping("/boasVindas/{nome}")
    public String boasVindas(@PathVariable String nome){
        return "Seja bem vindo "+nome;
    }

    @PostMapping("/pessoa")
    public Pessoa pessoa(@RequestBody Pessoa p){
        return p;
    }

    @Autowired
    private Repositorio acao;

    @PostMapping("/api")
    public Pessoa cadastrar(@RequestBody Pessoa obj) {

        return acao.save(obj);
    }
    
}
