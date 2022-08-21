package io.a10.musicapp.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RelaseDate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    private Long year;
    @OneToOne
    private Edition edition;
    @OneToOne
    private Performer performer;

    public RelaseDate(Long id, Long year) {
        this.id = id;
        this.year = year;
    }
}
