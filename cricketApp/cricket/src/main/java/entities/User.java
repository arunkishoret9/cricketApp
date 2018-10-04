package entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;


import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "User")
public class User {

    @Id
    @Column(name = "USER")
    @NotNull @NotEmpty @NotBlank
    private String userName;

    @Column(name = "EMAIL")
    @NotNull @NotEmpty @NotBlank
    private String email;

    @Column(name="PASSWORD")
    @NotNull @NotEmpty @NotBlank
    private String password;
}
