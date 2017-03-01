package com.journalServer.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by rocti on 26.02.2017.
 */
@Configuration
@EnableWebMvc
@ComponentScan("com.journalServer")
public class WebConfig extends WebMvcConfigurerAdapter{
}
