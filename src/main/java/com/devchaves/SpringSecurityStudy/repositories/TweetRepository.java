package com.devchaves.SpringSecurityStudy.repositories;

import com.devchaves.SpringSecurityStudy.model.TweetModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TweetRepository extends JpaRepository<TweetModel, Long> {
}
