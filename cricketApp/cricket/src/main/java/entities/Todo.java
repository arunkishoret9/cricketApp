package entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "TODO")
@Data
@AllArgsConstructor @NoArgsConstructor
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private String id;

    @Column(name = "DATE OF JOINING")
    private Date dateOfJoin;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "PRIORITY")
    private String priority;

    @Column(name = "FK_USER")
    private String fkUser;
}
