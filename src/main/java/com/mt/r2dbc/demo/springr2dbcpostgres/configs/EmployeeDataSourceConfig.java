package com.mt.r2dbc.demo.springr2dbcpostgres.configs;

import io.r2dbc.spi.Connection;
import io.r2dbc.spi.ConnectionFactories;
import io.r2dbc.spi.ConnectionFactory;
import io.r2dbc.spi.ConnectionFactoryOptions;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.r2dbc.config.AbstractR2dbcConfiguration;
import org.springframework.data.r2dbc.core.R2dbcEntityTemplate;
import reactor.core.publisher.Mono;

import static io.r2dbc.postgresql.PostgresqlConnectionFactoryProvider.SCHEMA;
import static io.r2dbc.spi.ConnectionFactoryOptions.*;

@Configuration
public class EmployeeDataSourceConfig extends AbstractR2dbcConfiguration {


    @Bean
    @Override
    public ConnectionFactory connectionFactory() {

        return ConnectionFactories.get(
                ConnectionFactoryOptions.builder()
                        .option(DRIVER, "postgresql")
                        .option(HOST, "localhost")
                        .option(PORT, 5433)
                        .option(USER, "postgres")
                        .option(PASSWORD, "")
                        .option(DATABASE, "spring_r2dbc_demo")
                        .option(SCHEMA,"r2dbc_demo")
                        .build()
        );
    }

    @Bean
    public Mono<Connection> getConnection(ConnectionFactory connectionFactory) {
        return Mono.from(connectionFactory.create());
    }

    @Bean
    public R2dbcEntityTemplate getR2dbcEntityTemplate(ConnectionFactory connectionFactory) {
        return new R2dbcEntityTemplate(connectionFactory);
    }
}
