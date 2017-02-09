package com.ktds.ronanam.dao.support;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public interface QueryHandler {
	public String preparedQuery();
	public void mappingParameters(PreparedStatement stmt); 
	public Object getData(ResultSet rs);
}
