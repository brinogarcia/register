package com.register.infra.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PatientMapper {

    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }

}
