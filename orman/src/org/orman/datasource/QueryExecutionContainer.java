package org.orman.datasource;

import org.orman.sql.Query;

public interface QueryExecutionContainer {
	public void execute(Query q); // TODO update return type. create more usable interface
}