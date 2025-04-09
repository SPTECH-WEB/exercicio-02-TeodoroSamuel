package br.com.project.newproject.Service;

import org.springframework.stereotype.Component;

@Component
public class Expressa implements FreteStrategy {
    @Override
    public Double calcularFrete(Double peso) {
        return peso * 1.75;
    }

    @Override
    public String modalidade() {
        return "Expressa";
    }
}
