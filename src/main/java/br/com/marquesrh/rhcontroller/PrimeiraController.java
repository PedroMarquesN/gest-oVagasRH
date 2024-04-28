package br.com.marquesrh.rhcontroller;

import jakarta.websocket.server.PathParam;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/primeiraController")
public class PrimeiraController {

    @GetMapping("/primeiroMetodo/{id}")
    public String primeiroMetodo(@PathVariable String id) {
        return "Primeiro método da primeira controller" + id;
    }

    @GetMapping("/segundoMetodo")
    public String segundoMetodo(@RequestParam String id) {
        return "Segundo método da primeira controller" + id;
    }


    @GetMapping("/terceiroMetodo")
    public String terceiroMetodo(@RequestParam Map<String, String> params) {
        return "Terceiro método da primeira controller" + params.entrySet();
    }

    @PostMapping("/metodoComBody")
    public String metodoComBody(@RequestBody Pessoa body) {
        return "Método com body " + body;
    }

    @GetMapping("/metodorResponseEntity/{id}")
    public ResponseEntity<Object> metodorResponseEntity(@PathVariable long id) {
        var pessoa = new Pessoa("João", "Silva");
        if (id == 1) {
            return ResponseEntity.status(200).body(pessoa);
        }
        return ResponseEntity.badRequest().body("Pessoa não encontrada");
    }

    record Pessoa(String nome, String sobrenome) {
    }



}
