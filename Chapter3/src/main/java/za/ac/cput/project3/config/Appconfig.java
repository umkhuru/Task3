package za.ac.cput.project3.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import za.ac.cput.project3.CollectionImpl;
import za.ac.cput.project3.CollectionInterface;

/**
 * Created by student on 2016/03/13.
 */
@Configuration
public class Appconfig {

    @Bean(name = "col")
    public CollectionInterface getCollectionInterface(){return new CollectionImpl();}
}
