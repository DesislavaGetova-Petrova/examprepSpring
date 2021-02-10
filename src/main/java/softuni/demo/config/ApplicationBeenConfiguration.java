package softuni.demo.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationBeenConfiguration {

    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }

}