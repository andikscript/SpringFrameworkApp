package com.andikscript.runspring.repository;

import com.andikscript.runspring.model.Student;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class StudentImplRepository implements StudentRepository {

    private final JdbcTemplate jdbcTemplate;

    public StudentImplRepository(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public List<Student> getAllStudent() {
        String sql = "SELECT * FROM student ORDER BY id ASC";

        List<Student> studentList = jdbcTemplate.query(
                sql,
                new RowMapper<Student>() {
                    @Override
                    public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
                        return setResult(rs, rowNum);
                    }
                }
        );

        return studentList;
    }

    private Student setResult(ResultSet rs, int numRow) throws SQLException {
        Student student = new Student(
                rs.getInt("id"),
                rs.getString("name")
        );

        return student;
    }
}
