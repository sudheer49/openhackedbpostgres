package com.infosys.openhack.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Table {

	private String tableName;
	private String[] columns;
	private String[] data;
	
	private String[] updateColumns;
	private String[] updateData;
	
	
}
