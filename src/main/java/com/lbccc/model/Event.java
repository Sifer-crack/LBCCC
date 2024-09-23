package com.lbccc.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "events", schema = "lbccc_games_and_events")
public class Event {
    @Id
    @Column(name = "event_id", nullable = false, length = 50)
    private String eventId;

    @Column(name = "event_name", nullable = false)
    private String eventName;

    @Column(name = "event_date", nullable = false)
    private LocalDate eventDate;

    @Lob
    @Column(name = "event_type", nullable = false)
    private String eventType;

    @Lob
    @Column(name = "description")
    private String description;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "organizer_id")
    private Administrator organizer;

}