package com.infosys.openhack.helper;

import com.infosys.openhack.model.Table;

public class DMLHelper {
	
	public static String insertQuery(Table to)
	{
		String query="INSERT INTO "+to.getTableName()+"(" ;  
		for(String cName : to.getColumns())
		{
			query = query + cName + ",";
		}
		query = query.replaceAll(",$", "");
		
		query = query + ") values(";
		
		for(String cData : to.getData())
		{
			query = query +"'"+ cData + "',";
		}
		query = query.replaceAll(",$", "");
		
		query = query + ")";
		
		return query;
	}
	
	public static String deleteQuery(Table to)
	{
		String deleteQuery="DELETE FROM "+to.getTableName()  ;  
		
		if(to.getColumns().length > 0)
		{
			deleteQuery = deleteQuery + " WHERE ";
			for(int i=0;i<to.getColumns().length;i++)
			{
				deleteQuery = deleteQuery + to.getColumns()[i] + "= '" + to.getData()[i] +"'";
				
				if(i != to.getColumns().length -1)
				{
				deleteQuery = deleteQuery + " AND ";
				}
			}
			
		}
		
		return deleteQuery;
	}
	
	public static String updateQuery(Table to)
	{
		String updateQuery = "UPDATE "+to.getTableName() +" SET ";
		
		for(int i=0;i<to.getUpdateColumns().length;i++)
		{
			updateQuery = updateQuery + to.getUpdateColumns()[i] + " = '" + to.getUpdateData()[i] + "',";
		}
		updateQuery = updateQuery.replaceAll(",$", "");
		if(to.getColumns().length > 0)
		{
			updateQuery = updateQuery + " WHERE ";
			for(int i=0;i<to.getColumns().length;i++)
			{
				updateQuery = updateQuery + to.getColumns()[i] + "= '" + to.getData()[i] +"'";
				
				if(i != to.getColumns().length -1)
				{
					updateQuery = updateQuery + " AND ";
				}
			}
			
		}
		return updateQuery;
	}


}
