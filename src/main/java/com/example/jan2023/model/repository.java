package com.example.jan2023.model;

import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.stereotype.Repository;

public class repository {
    @Repository
    public interface employrepository extends JpaRepositoriesAutoConfiguration <employ,Integer>{

    }
}

