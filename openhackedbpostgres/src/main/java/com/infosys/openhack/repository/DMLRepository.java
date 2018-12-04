package com.infosys.openhack.repository;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.stereotype.Repository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Repository
public class DMLRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;  
	public Boolean insertData(String query)
	{	
		
		 return jdbcTemplate.execute(query,new PreparedStatementCallback<Boolean>(){  
			    @Override  
			    public Boolean doInPreparedStatement(PreparedStatement ps)  
			            throws SQLException, DataAccessException {  
			              
			        return ps.execute();
			              
			    }  
			    });  
	}
}
