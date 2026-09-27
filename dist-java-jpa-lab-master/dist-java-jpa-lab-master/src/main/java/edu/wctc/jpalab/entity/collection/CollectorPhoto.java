package edu.wctc.jpalab.entity.collection;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "photo", schema = "collection")
public class CollectorPhoto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "photo_id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "photo_collector_id")
    private Collector collector;

    @Column(name = "photo_filename")
    private String fileName;

    @Column(name = "photo_datestamp")
    private LocalDateTime dateStamp;

    @Column(name = "photo_visible")
    private String visible;

    public CollectorPhoto() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Collector getCollector() {
        return collector;
    }

    public void setCollector(Collector collector) {
        this.collector = collector;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public LocalDateTime getDateStamp() {
        return dateStamp;
    }

    public void setDateStamp(LocalDateTime dateStamp) {
        this.dateStamp = dateStamp;
    }

    public String getVisible() {
        return visible;
    }

    public void setVisible(String visible) {
        this.visible = visible;
    }
}
