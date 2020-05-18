package com.zs.webflux.dao;

import com.zs.webflux.bean.Love;
import org.reactivestreams.Publisher;
import org.springframework.data.domain.Sort;
import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.data.repository.reactive.ReactiveSortingRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @author: zhanghua
 * @aim:
 * @date: 2020/5/18 7:19 下午
 */
@Repository
public interface LoveDao extends ReactiveCrudRepository<Love,Long> {
    @Query("select * from love where name= :name")
    Flux<Love> findByName(String name);
}
