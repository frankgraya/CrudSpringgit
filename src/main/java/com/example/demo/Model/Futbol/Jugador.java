package com.example.demo.Model.Futbol;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "jugador")
public class Jugador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "VARCHAR(100)", nullable = false)
    private String nombre;

    @Column(name = "apellido_paterno",columnDefinition = "VARCHAR(100)", nullable = false)
    private String apellidoPaterno;

    @Column(name = "apellido_materno",columnDefinition = "VARCHAR(100)", nullable = false)
    private String apellidoMaterno;

    @Column(length = 10, nullable = false)
    private Integer edad;

    @Column(columnDefinition = "VARCHAR(100)", nullable = false)
    private String posicion;

    @ManyToOne(targetEntity = Equipo.class)
    private Equipo equipo;

}
