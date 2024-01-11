package ec.edu.espam.api.caja.domain;

import ec.edu.espam.api.caja.domain.enums.AccountTypeEnum;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
@Entity(name = "account")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "numero")
    @NotEmpty(message = "numero es requerido")
    private String number;

    @Column(name = "account_type")
    @NotNull(message = "tipo de cuenta es requerido")
    @Enumerated(EnumType.STRING)
    private AccountTypeEnum accountTypeEnum;

    @Column(name = "initial_balance")
    @NotNull(message = "balance Inicial es requerido")
    private BigDecimal initialBalance;

    @Column(name = "saldo")
    @NotNull(message = "saldo es requerido")
    private BigDecimal balance;

    @Column(name = "state")
    @NotNull(message = "estado es requerido")
    private Boolean state;

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "customer", nullable = false)
//    private Customer customer;
//
//    @OneToMany(mappedBy = "account")
//    private List<Motion> motions;
}
