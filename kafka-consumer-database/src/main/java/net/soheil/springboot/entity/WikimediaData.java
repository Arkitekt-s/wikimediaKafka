package net.soheil.springboot.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.w3c.dom.Text;

import java.sql.Blob;

@Entity
@Table(name = "wikimedia_recent_changes")
@Getter
@Setter
public class WikimediaData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Lob // Large Object
    @Column(columnDefinition = "TEXT")
    private String wikiEventData;

}
