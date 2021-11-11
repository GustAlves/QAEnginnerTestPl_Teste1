package br.com.zup.edu.recargadecelular.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
public class Recarga {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private BigDecimal valor;

    private String numero;

    private Operadora operadora;

    @Deprecated
    public Recarga(){}

    public Recarga(BigDecimal valor, String numero, Operadora operadora) {
        this.valor = valor;
        this.numero = numero;
        this.operadora = operadora;
    }
}
