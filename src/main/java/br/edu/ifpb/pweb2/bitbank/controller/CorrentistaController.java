package br.edu.ifpb.pweb2.bitbank.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.edu.ifpb.pweb2.bitbank.model.Correntista;

@Controller
@RequestMapping("/correntistas")
public class CorrentistaController {
    
    @RequestMapping("/form")
    public String getForm(Correntista correntista, Model model){
        model.addAttribute("correntista", correntista);
        return "correntistas/form";
    }
}
