package org.SAFTY.dao;

import org.SAFTY.models.Application;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Component
public class ApplicationDAO {
    private final JdbcTemplate jdbcTemplate;
    @Autowired
    public ApplicationDAO(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }
    public List<Application> index() {
        return jdbcTemplate.query("SELECT * FROM Person", new BeanPropertyRowMapper<>(Application.class));
    }
    public void save(Application application) {
        jdbcTemplate.update("INSERT INTO Application VALUES(1, ?, ?, ?)", application.getName(), application.getAge(),
                application.getMail());
    }
}
