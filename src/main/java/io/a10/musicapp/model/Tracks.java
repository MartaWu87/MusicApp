package io.a10.musicapp.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
    @JsonIgnore
    private Performer performer;
    @OneToOne
    private Edition edition;

    public Tracks(Long id, String track, long length, Edition edition) {
        this.id = id;
        this.track = track;
        this.length = length;
        this.edition = edition;
    }
}
