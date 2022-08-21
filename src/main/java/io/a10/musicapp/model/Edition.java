package io.a10.musicapp.model;

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
    private RelaseDate relaseDate;
    @OneToOne
    private Title title;
    @OneToOne
    private Performer performer;

    public Edition(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
