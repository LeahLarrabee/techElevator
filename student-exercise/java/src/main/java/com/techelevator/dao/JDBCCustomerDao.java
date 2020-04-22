package com.techelevator.dao;

import com.techelevator.dao.model.Customer;

import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;

import com.techelevator.dao.model.Film;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

/**
 * JDBCCustomerDao
 */
@Component
public class JDBCCustomerDao implements CustomerDao {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public JDBCCustomerDao(DataSource dataSource) {

        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public List<Customer> searchAndSortCustomers(String search, String sort) {
        List<Customer> matchingCust = new ArrayList<>();


        String custSearchSql = "SELECT first_name, last_name, email, activebool" +
                " FROM customer" +
                " WHERE first_name ILIKE ? OR last_name = ?" +
                " ORDER BY " + sort;
        SqlRowSet results = jdbcTemplate.queryForRowSet(custSearchSql, ("%"+search.toUpperCase()+"%"), ("%"+search.toUpperCase()+"%"));
        while (results.next()) {
            matchingCust.add(mapRowToCustomer(results));
        }
        return matchingCust;
    }

    private Customer mapRowToCustomer(SqlRowSet results) {
        Customer custRow = new Customer();
        custRow.setFirstName(results.getString("first_name"));
        custRow.setLastName(results.getString("last_name"));
        custRow.setEmail(results.getString("email"));
        custRow.setActive(results.getBoolean("activebool"));
        return custRow;
    }
}