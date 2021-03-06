/*-------------------------------------------------------------------------
*
* Copyright (c) 2004-2011, PostgreSQL Global Development Group
*
*
*-------------------------------------------------------------------------
*/
package com.foundationdb.sql.jdbc.jdbc3;

import com.foundationdb.sql.jdbc.core.*;

public class Jdbc3ResultSetMetaData extends com.foundationdb.sql.jdbc.jdbc2.AbstractJdbc2ResultSetMetaData implements java.sql.ResultSetMetaData
{

    public Jdbc3ResultSetMetaData(BaseConnection connection, Field[] fields)
    {
        super(connection, fields);
    }

}

