package io.a10.musicapp.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Edition {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @OneToOne
    @JsonIgnore
    private RelaseDate relaseDate;
    @OneToOne
    @JsonIgnore
    private Title title;
    @OneToOne
    @JsonIgnore
    private Performer performer;

    public Edition(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
