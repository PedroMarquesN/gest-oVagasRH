package br.com.marquesrh.rhcontroller.modules.companies;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import org.hibernate.validator.constraints.Length;


import java.util.UUID;

@Data
@Entity(name = "company")
public class CompanyEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Length(min = 3, message = "O nome deve ter no mínimo 3 caracteres")
    private String name;
    private String cnpj;
    @Pattern(regexp = "^[a-z0-9_-]{3,15}$", message = "Usuário inválido")
    private String username;
    @Email(message = "Email inválido")
    private String email;
    @Length(min = 6, message = "A senha deve ter no mínimo 6 caracteres")
    private String password;
    private String website;
    @Column(nullable = true)
    private String description;


}
