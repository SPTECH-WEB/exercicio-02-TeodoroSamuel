package br.com.project.newproject.Service;

public class Transportadora {
    public Double pagarComTransportadora(Double valor){
        return valor * 1.20;
    }

    public String modalidade(){
        return "Transportadora";
    }
}
