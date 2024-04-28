package br.com.marquesrh.rhcontroller.Di;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/funcionarios")
public class ControllerFuncionario {

    @Autowired
    Funcionario funcionario;

    @GetMapping("/listar")
    public String ListarFuncionarios(){
        return funcionario.listarFuncionarios();
    }
}
