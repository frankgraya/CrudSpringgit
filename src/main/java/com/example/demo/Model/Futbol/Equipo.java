package com.example.demo.Model.Futbol;
import lombok.*;
import javax.persistence.*;

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
}
