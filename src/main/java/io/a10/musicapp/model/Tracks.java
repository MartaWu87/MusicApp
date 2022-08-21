package io.a10.musicapp.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Tracks {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String track;
    private long length;
@OneToOne
    private Performer performer;
    @OneToOne
    private Edition edition;

    public Tracks(Long id, String track, long length) {
        this.id = id;
        this.track = track;
        this.length = length;
    }
}
