package br.com.marquesrh.rhcontroller.exceptions;

import lombok.Data;

@Data
public class ErrorMessageDTO {

    private String field;
    private String message;

    // Construtor existente sem argumentos
    public ErrorMessageDTO() {
    }

    // Novo construtor com dois argumentos
    public ErrorMessageDTO(String message, String field) {
        this.message = message;
        this.field = field;
    }
}
