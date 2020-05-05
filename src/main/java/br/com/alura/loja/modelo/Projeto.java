package br.com.alura.loja.modelo;

import com.google.gson.Gson;
import com.thoughtworks.xstream.XStream;

public class Projeto {
    String nome;
    Long Id;
    int anoDeInicio;

    public Projeto(String nome, Long id, int anoDeInicio) {
        this.nome = nome;
        Id = id;
        this.anoDeInicio = anoDeInicio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public int getAnoDeInicio() {
        return anoDeInicio;
    }

    public void setAnoDeInicio(int anoDeInicio) {
        this.anoDeInicio = anoDeInicio;
    }

    public String toXML() {
        return new XStream().toXML(this);
    }
    public String toJson(){
        return new Gson().toJson(this);
    }
}
