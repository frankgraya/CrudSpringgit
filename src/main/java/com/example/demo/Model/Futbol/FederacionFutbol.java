package com.example.demo.Model.Futbol;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "feredaracion_futbol")
public class FederacionFutbol
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Genera automáticamente valores para la clave primaria
    private Long id;

    @Column(columnDefinition = "VARCHAR(100)", nullable = false) // Especifica las propiedades de la columna en la base de datos
    private String nombre; // Nombre del equipo

    @Column(columnDefinition = "VARCHAR(100)", nullable = false) // Especifica las propiedades de la columna en la base de datos
    private String presidente; // Nombre del equipo

    @Column(columnDefinition = "VARCHAR(100)", nullable = false) // Especifica las propiedades de la columna en la base de datos
    private String pais; // Nombre del equipo

    @OneToMany(targetEntity = Equipo.class, mappedBy = "federacionFutbol", fetch = FetchType.LAZY)// Relacion uno a muchos con equipo
    private List<Equipo> equipos;

}
