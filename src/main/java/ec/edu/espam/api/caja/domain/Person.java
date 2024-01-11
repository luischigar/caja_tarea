package ec.edu.espam.api.caja.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
@MappedSuperclass
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "identification")
    @NotEmpty(message = "Identificacion es requerido")
    private String identification;

    @Column(name = "name")
    @NotEmpty(message = "Nombre es requerido")
    private String name;

    @Column(name = "gender")
    @NotEmpty(message = "Genero es requerido")
    private String gender;

    @Column(name = "address")
    @NotEmpty(message = "Direccion es requerido")
    private String address;

    @Column(name = "phone")
    @NotEmpty(message = "Telefono es requerido")
    private String phone;

    @Column(name = "age")
    @NotNull(message = "Edad es requerido")
    private Integer age;
}
