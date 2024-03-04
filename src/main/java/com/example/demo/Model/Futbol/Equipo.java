package com.example.demo.Model.Futbol;
import lombok.*;
import javax.persistence.*;
import java.util.List;

@Data // Anotación de Lombok para generar automáticamente getters, setters, toString, equals, hashCode
@AllArgsConstructor // Genera un constructor con todos los argumentos
@NoArgsConstructor // Genera un constructor sin argumentos
@Entity // Indica que esta clase es una entidad JPA
@Table(name = "equipo") // Especifica el nombre de la tabla en la base de datos

public class Equipo
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Genera automáticamente valores para la clave primaria
    private Long id;

    @Column(columnDefinition = "VARCHAR(100)", nullable = false) // Especifica las propiedades de la columna en la base de datos
    private String nombre; // Nombre del equipo

    @OneToOne(targetEntity = Entrenador.class) // Establece una relación uno a uno con la clase Entrenador
    private Entrenador entrenador; // Entrenador del equipo

    @OneToMany(targetEntity = Jugador.class, mappedBy = "equipo", fetch = FetchType.LAZY)// Relacion uno a muchos con jugador
    private List<Jugador> jugadores;

    @ManyToOne(targetEntity = FederacionFutbol.class) // Relacion de Muchos a uno con federacion
    private FederacionFutbol federacionFutbol;

    // Relacion de Muchos a Muchos con ligas de futbol
    @ManyToMany(targetEntity = LigaFutbol.class, fetch = FetchType.LAZY)
    @JoinTable(
            name = "equipo_liga",
            joinColumns = @JoinColumn(name = "equipo"),
            inverseJoinColumns = @JoinColumn(name = "liga")
    )
    private List<LigaFutbol> Ligas;
}
