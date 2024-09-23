package com.lbccc.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "games", schema = "lbccc_games_and_events")
public class Game {
    @Id
    @Column(name = "game_id", nullable = false, length = 50)
    private String gameId;

    @Column(name = "white_player_id", length = 50)
    private String whitePlayerId;

    @Column(name = "black_player_id", length = 50)
    private String blackPlayerId;

    @Column(name = "result", length = 50)
    private String result;

    @Column(name = "date_played", nullable = false)
    private LocalDate datePlayed;

    @Lob
    @Column(name = "pgn_data", nullable = false)
    private String pgnData;

    @Column(name = "fen_data")
    private String fenData;

}