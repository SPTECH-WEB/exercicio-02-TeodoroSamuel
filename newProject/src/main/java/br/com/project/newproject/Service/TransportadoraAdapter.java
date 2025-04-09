package br.com.project.newproject.Service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class TransportadoraAdapter implements FreteStrategy{
        private final Transportadora transportadora;

    public TransportadoraAdapter() {
        this.transportadora = new Transportadora();
    }

    @Override
    public Double calcularFrete(Double peso) {
        return transportadora.pagarComTransportadora(peso);
    }

    @Override
    public String modalidade() {
        return transportadora.modalidade();
    }

}
