package br.com.marquesrh.rhcontroller.Di;

import org.springframework.stereotype.Service;

@Service
public class Funcionario {

    public String listarFuncionarios() {
        return "Listando funcionários";
    }
}
