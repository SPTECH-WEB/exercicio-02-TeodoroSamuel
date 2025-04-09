package br.com.project.newproject.Service;

import org.springframework.stereotype.Component;

@Component
public class Economica implements FreteStrategy{
    @Override
    public Double calcularFrete(Double valor) {
        return valor * 1.15;
    }

    @Override
    public String modalidade() {
        return "Economica";
    }
}
