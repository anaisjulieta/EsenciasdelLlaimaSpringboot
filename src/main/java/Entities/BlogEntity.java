package Entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "blog")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class BlogEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer blog_id;
    private Date blog_fecha;
    private String blog_titulo;
    private String blog_contenido;

    @CreationTimestamp//Indica que el atributo siguiente es una fecha de creación
    private LocalDateTime createdAt;

    //@JsonBackReference
    //@ManyToOne
   //* @JoinColumn(name= "registro_id")//Indicamos el nombre de la columna donde está la llave foránea
    //private RegistroPacienteEntity pacienteConsulta; *//


}
