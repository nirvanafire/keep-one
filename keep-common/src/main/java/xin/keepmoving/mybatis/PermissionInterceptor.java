package xin.keepmoving.mybatis;

import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.plugin.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;

/**
 * <p>@author: NirvanaFire(nirvanafire@gmail.com)
 * <p>@description: keep-one
 * <p>@since: v1.1
 **/
@Intercepts({@Signature(type = StatementHandler.class, method = "prepare", args = {Connection.class, Integer.class})})
public class PermissionInterceptor implements Interceptor {

    private static Logger logger = LoggerFactory.getLogger(PermissionInterceptor.class);

    @Override
    public Object intercept(Invocation invocation) throws Throwable {

        StatementHandler statementHandler = (StatementHandler) invocation.getTarget();

        logger.warn("warning...");
        logger.debug(statementHandler.getBoundSql().getSql());

        return invocation.proceed();
    }

    @Override
    public Object plugin(Object target) {
        return Plugin.wrap(target, this);
    }

}
