package com.journalServer.config;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by rocti on 26.02.2017.
 */
@Configuration
@EnableJpaRepositories("com.journalServer.repository")
@EnableTransactionManagement
@PropertySource("classpath:db.properties")
@ComponentScan("com.journalServer")
public class DBConfig {

    @Resource
    private Environment environment;

    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
        LocalContainerEntityManagerFactoryBean entityManager = new LocalContainerEntityManagerFactoryBean();
        entityManager.setDataSource(dataSource());
        entityManager.setPackagesToScan(environment.getRequiredProperty("db.entity.package"));

        entityManager.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
        entityManager.setJpaProperties(getHibernateProperties());

        return entityManager;
    }

    @Bean
    public DataSource dataSource(){
        BasicDataSource basicDataSource = new BasicDataSource();
        basicDataSource.setUrl(environment.getRequiredProperty("db.url"));
        basicDataSource.setDriverClassName(environment.getRequiredProperty("db.driver"));
        basicDataSource.setUsername(environment.getRequiredProperty("db.username"));
        basicDataSource.setPassword(environment.getRequiredProperty("db.password"));

        basicDataSource.setInitialSize(Integer.valueOf(environment.getRequiredProperty("db.initialSize")));
        basicDataSource.setMinIdle(Integer.valueOf(environment.getRequiredProperty("db.minIdle")));
        basicDataSource.setMaxIdle(Integer.valueOf(environment.getRequiredProperty("db.maxIdle")));
        basicDataSource.setTimeBetweenEvictionRunsMillis(Long.valueOf(environment.getRequiredProperty("db.timeBetweenEvictionRunsMillis")));
        basicDataSource.setMinEvictableIdleTimeMillis(Long.valueOf(environment.getRequiredProperty("db.minEvictableIdleTimeMillis")));
        basicDataSource.setTestOnBorrow(Boolean.valueOf(environment.getRequiredProperty("db.testOnBorrow")));
        basicDataSource.setValidationQuery(environment.getRequiredProperty("db.validationQuery"));

        return basicDataSource;
    }

    @Bean
    public PlatformTransactionManager transactionManager(){
        JpaTransactionManager manager = new JpaTransactionManager();
        manager.setEntityManagerFactory(entityManagerFactory().getObject());

        return manager;
    }

    public Properties getHibernateProperties() {

        try {
            Properties properties = new Properties();
            InputStream inputStream = getClass().getClassLoader().getResourceAsStream("hibernate.properties");
            properties.load(inputStream);

            return properties;
        } catch (IOException e) {
            throw new  IllegalArgumentException("Can't find 'hibernate.properties' in classpath!",e);
        }

    }
}
