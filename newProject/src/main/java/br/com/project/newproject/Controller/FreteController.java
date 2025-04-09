package br.com.project.newproject.Controller;

import br.com.project.newproject.Service.FreteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fretes")
public class FreteController {
    @Autowired
    FreteService freteService;

    @GetMapping
    public String calcularFrete(@RequestParam String modalidade, @RequestParam Double peso){
        Double valor = freteService.calculaFrete(modalidade, peso);
        return "Frete(" + modalidade + ") peso:" + peso + "KG = R$" + valor;
    }

}
