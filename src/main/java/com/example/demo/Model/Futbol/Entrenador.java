package com.example.demo.Model.Futbol;

import lombok.*;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "entrenador")
public class Entrenador
{
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
    private String nacionalidad;
}
