package ec.edu.espam.api.caja.domain;

import ec.edu.espam.api.caja.domain.enums.MovementTypeEnum;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;
@Entity(name = "motion")
@Data
public class Motion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "date", nullable = false)
    @NotNull(message = "Fecha es requerido")
    private LocalDate date;

    @Column(name = "tipo", nullable = false)
    @NotNull(message = "Tipo de movimiento es requerido")
    @Enumerated(EnumType.STRING)
    private MovementTypeEnum movementTypeEnum;

    @Column(name = "monto", nullable = false)
    @NotNull(message = "Monto es requerido")
    private BigDecimal amount;

    @Column(name = "balance", nullable = false)
    @NotNull(message = "balance es requerido")
    private BigDecimal balance;

    @NotNull(message = "Cuenta es requerido")
    @ManyToOne(fetch = FetchType.LAZY)
    private Account account;
}
