package com.zs.webflux.configuration;

import io.r2dbc.spi.ConnectionFactories;
import io.r2dbc.spi.ConnectionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.r2dbc.config.AbstractR2dbcConfiguration;
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories;

/**
 * @author: zhanghua
 * @aim: 数据库连接
 * @date: 2020/5/18 7:12 下午
 */
@Configuration
@EnableR2dbcRepositories
public class DatasourceConnection extends AbstractR2dbcConfiguration {
    @Bean
    @Override
    public ConnectionFactory connectionFactory() {
        return ConnectionFactories.get("r2dbc:mysql://root:zs520@127.0.0.1:3306/zs");    }
}
