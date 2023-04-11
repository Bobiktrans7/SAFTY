package org.SAFTY.dao;

import org.SAFTY.models.Client;
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
    public void save(Client client) {
        jdbcTemplate.update("INSERT INTO Application(name, phone,gender,type_of_insurance, mail) VALUES(?, ?, ?, ?, ?)", client.getName(),
                client.getPhone(), client.getGender(), client.getType_of_insurance());
    }
}
