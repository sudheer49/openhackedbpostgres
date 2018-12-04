package com.infosys.openhack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.infosys.openhack.model.Table;
import com.infosys.openhack.service.DMLService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/DML")
@Slf4j
public class InsertController {
	
	
	@Autowired
	private DMLService dmlService ;
	
	@RequestMapping(value="/insert" , method = RequestMethod.POST)
	public String insertData(@RequestBody Table jsonInsert)
	{	
		dmlService.insert(jsonInsert);
		return "Data Inserted successfully";
	}
	
	@RequestMapping(value="/delete" , method = RequestMethod.DELETE)
	public String deleteData(@RequestBody Table jsonInsert)
	{	
		dmlService.delete(jsonInsert);
		return "Data deleted successfully";
	}
	
	@RequestMapping(value="/update" , method = RequestMethod.PUT)
	public String updateData(@RequestBody Table jsonInsert)
	{	
		dmlService.update(jsonInsert);
		return "Data deleted successfully";
	}

}
	
