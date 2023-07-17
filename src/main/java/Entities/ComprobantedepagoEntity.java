package Entities;

import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "comprobantedepago")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class ComprobantedepagoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer comprobante_id;
    private Integer comprobante_sumatotal;
    private Integer orden_id;

    @CreationTimestamp//Indica que el atributo siguiente es una fecha de creación
    private LocalDateTime createdAt;



}

