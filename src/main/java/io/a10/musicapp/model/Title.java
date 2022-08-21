package io.a10.musicapp.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Title {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    private String AlbumTitle;
    @OneToOne
    private Performer performer;

    public Title(Long id, String albumTitle) {
        this.id = id;
        AlbumTitle = albumTitle;
    }
}
