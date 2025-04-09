package br.com.project.newproject.Service;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class FreteService {
    private final List<FreteStrategy> estrategias;

    public FreteService(List<FreteStrategy> estrategias) {
        this.estrategias = estrategias;
    }

    public double calculaFrete(String modalidade, double peso) {
        return estrategias.stream()
                .filter(e -> e.modalidade().equalsIgnoreCase(modalidade))
                .findFirst()
                .orElseThrow(()-> new IllegalArgumentException("Modalidade invalida"))
                .calcularFrete(peso);
    }

}
