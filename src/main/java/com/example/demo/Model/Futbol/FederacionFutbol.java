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
    private String nombre; // Nombre de la federacion

    @Column(columnDefinition = "VARCHAR(100)", nullable = false) // Especifica las propiedades de la columna en la base de datos
    private String presidente; // Presidente de la federacion

    @Column(columnDefinition = "VARCHAR(100)", nullable = false) // Especifica las propiedades de la columna en la base de datos
    private String pais; // Pais de la federacion

    // Relacion uno a muchos con equipo
    @OneToMany(targetEntity = Equipo.class, mappedBy = "federacionFutbol", fetch = FetchType.LAZY)
    private List<Equipo> equipos;

}
