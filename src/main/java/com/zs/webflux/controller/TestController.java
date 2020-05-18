package com.zs.webflux.controller;

import com.zs.webflux.bean.Love;
import com.zs.webflux.dao.LoveDao;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

/**
 * @author: zhanghua
 * @aim:
 * @date: 2020/5/18 7:16 下午
 */
@RestController
@RequiredArgsConstructor
public class TestController {
    private final @NonNull LoveDao loveDao;
    @GetMapping("/love")
    public Flux<Love> getMyLove(){
        return loveDao.findByName("张硕");
    }

}
