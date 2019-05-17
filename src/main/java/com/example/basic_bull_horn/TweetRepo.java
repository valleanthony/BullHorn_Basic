package com.example.basic_bull_horn;

import org.springframework.data.repository.CrudRepository;

public interface TweetRepo extends CrudRepository<Tweet,Long>{
}
