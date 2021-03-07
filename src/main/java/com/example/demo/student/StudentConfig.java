package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner
            (StudentRepository repository){
                return args ->{
                         Student elif =    new Student(
                                    "Elif",
                                    LocalDate.of(2002, Month.AUGUST, 20),
                                    "elif.eker@gmail.com"

                            );
                   Student sabri= new Student(
                            "Sabri",
                            LocalDate.of(2001, Month.MAY, 20),
                            "sabri.eker@gmail.com"

                    );
                   repository.saveAll(
                           List.of(sabri, elif)
                   );
            } ;
    }
}
