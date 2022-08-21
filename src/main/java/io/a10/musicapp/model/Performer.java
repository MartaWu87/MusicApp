package io.a10.musicapp.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Performer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
       @OneToMany
    private List<Tracks> tracks;

    public Performer(Long id, String name) {
        this.id = id;
        this.name = name;
    }

//    @Override
//    public String toString() {
//        StringBuilder builder = new StringBuilder();
//        builder.append("Performer [id=");
//        builder.append(id);
//        builder.append(", name=");
//        builder.append(name);
//        builder.append(", edition=");
//        builder.append(edition);
//        builder.append(", relaseDate=");
//        builder.append(relaseDate);
//        builder.append(", title=");
//        builder.append(title);
//        builder.append(", tracks=");
//        builder.append(tracks);
//        builder.append("]");
//        return builder.toString();
//    }
}
