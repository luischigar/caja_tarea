package ec.edu.espam.api.caja.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.List;

@Data
@Entity(name = "customer")
public class Customer extends Person{

    @Column(name = "clue", nullable = false)
    @NotEmpty(message = "clave es requerido")
    private String clue;

    @Column(name = "state", nullable = false)
    @NotNull(message = "state es requerido")
    private Boolean state;

//    @OneToMany
//    private List<Account> accounts;
}
