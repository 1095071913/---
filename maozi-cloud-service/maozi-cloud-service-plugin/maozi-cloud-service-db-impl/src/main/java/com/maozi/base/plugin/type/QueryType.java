package com.maozi.base.plugin.type;

import com.maozi.base.plugin.QueryBasePlugin;
import com.maozi.base.plugin.impl.query.QueryEqPlugin;
import com.maozi.base.plugin.impl.query.QueryGePlugin;
import com.maozi.base.plugin.impl.query.QueryInPlugin;
import com.maozi.base.plugin.impl.query.QueryLePlugin;
import com.maozi.base.plugin.impl.query.QueryLikePlugin;
import com.maozi.base.plugin.impl.query.QueryNePlugin;
import com.maozi.base.plugin.query.QueryBaseType;
import lombok.Getter;

@Getter
public enum QueryType {

	eq(QueryBaseType.eq,new QueryEqPlugin()),like(QueryBaseType.like,new QueryLikePlugin()),in(QueryBaseType.in,new QueryInPlugin()),ne(QueryBaseType.ne,new QueryNePlugin()),ge(QueryBaseType.ge,new QueryGePlugin()),le(QueryBaseType.le,new QueryLePlugin());
	
	QueryType(QueryBaseType type,QueryBasePlugin queryPlugin) {
		
		this.type = type;
		
		this.queryPlugin = queryPlugin;
		
	}
	
	private QueryBaseType type;
	
	private QueryBasePlugin queryPlugin;
	
	
	public static QueryType get(String type) {
		
		QueryType[] queryTypes = QueryType.values();
		
		for(QueryType queryType : queryTypes) {
			
			if(queryType.getType().getType().equals(type)) {
				return queryType;
			}
			
		}
		
		return null;
		
	}
	
}
