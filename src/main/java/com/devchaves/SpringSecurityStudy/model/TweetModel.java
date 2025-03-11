package com.devchaves.SpringSecurityStudy.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.Instant;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "tb_tweets")
public class TweetModel {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "tweet_id")
    private Long tweetId;

    private UserModel user;

    private String content;

    @CreationTimestamp
    private Instant createTimestamp;


}
