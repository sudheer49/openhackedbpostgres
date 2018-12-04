package com.infosys.openhack.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infosys.openhack.helper.DMLHelper;
import com.infosys.openhack.model.Table;
import com.infosys.openhack.repository.DMLRepository;

@Service
public class DMLService {
	
	@Autowired
	private DMLRepository dmlRepositry;
	
	public void insert(Table to)
	{
		dmlRepositry.insertData(DMLHelper.insertQuery(to));
	}
	public void update(Table to)
	{
		dmlRepositry.insertData(DMLHelper.updateQuery(to));
	}
	public void delete(Table to)
	{
		dmlRepositry.insertData(DMLHelper.deleteQuery(to));
	}
}
