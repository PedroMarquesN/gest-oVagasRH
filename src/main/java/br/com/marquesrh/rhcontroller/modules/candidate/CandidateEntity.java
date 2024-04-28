package br.com.marquesrh.rhcontroller.modules.candidate;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import java.util.UUID;

@Data
public class CandidateEntity {
    private UUID id;
    private String name;
    @Pattern(regexp = "^[a-z0-9_-]{3,15}$", message = "Invalid username")
    private String username;
    @Email(message = "Invalid email")
    private String email;
    @Length(min = 6, message = "Password must have at least 6 characters")
    private String password;
    private String description;
    private String curriculum;

}
