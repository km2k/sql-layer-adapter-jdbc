/*-------------------------------------------------------------------------
*
* Copyright (c) 2004-2011, PostgreSQL Global Development Group
*
*
*-------------------------------------------------------------------------
*/
package com.foundationdb.sql.jdbc.ds.jdbc4;

import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;

import com.foundationdb.sql.jdbc.ds.jdbc23.AbstractJdbc23PoolingDataSource;

public abstract class AbstractJdbc4PoolingDataSource extends AbstractJdbc23PoolingDataSource 
{

    public boolean isWrapperFor(Class<?> iface) throws SQLException
    {
        return iface.isAssignableFrom(getClass());
    }

    public <T> T unwrap(Class<T> iface) throws SQLException
    {
        if (iface.isAssignableFrom(getClass()))
        {
            return (T) this;
        }
        throw new SQLException("Cannot unwrap to " + iface.getName());
    }

    public java.util.logging.Logger getParentLogger() throws SQLFeatureNotSupportedException
    {
        throw com.foundationdb.sql.jdbc.Driver.notImplemented(this.getClass(), "getParentLogger()");
    }

}
