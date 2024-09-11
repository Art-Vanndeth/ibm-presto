// src/main/java/dev/dcoder/ibmpresto/service/PrestoQueryService.java
package dev.dcoder.ibmpresto.service;

import dev.dcoder.ibmpresto.model.Person;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PrestoQueryService {

    private final JdbcTemplate jdbcTemplate;

    public List<Person> getAllPersons() {
        String query = "SELECT * FROM iceberg_data.house.person";
        return jdbcTemplate.query(query, new PersonRowMapper());
    }

    private static class PersonRowMapper implements RowMapper<Person> {
        @Override
        public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
            Person person = new Person();
            person.setId(rs.getLong("id"));
            person.setSeason(rs.getString("season"));
            person.setCity(rs.getString("city"));
            person.setDate(rs.getString("date"));
            person.setMatchType(rs.getString("match_type"));
            person.setPlayerOfMatch(rs.getString("player_of_match"));
            return person;
        }
    }
}