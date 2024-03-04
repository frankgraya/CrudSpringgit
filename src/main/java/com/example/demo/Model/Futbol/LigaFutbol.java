package com.example.demo.Model.Futbol;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "liga_futbol")
public class LigaFutbol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "VARCHAR(100)", nullable = false)
    private String nombre;

    @Column(name = "fehc_inicio", columnDefinition = "DATE")
    private LocalDate fechaIncio;

    @Column(name = "fehc_cierre", columnDefinition = "DATE")
    private LocalDate fechaCierre;
}
