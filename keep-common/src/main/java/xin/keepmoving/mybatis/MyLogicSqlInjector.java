package xin.keepmoving.mybatis;

import com.baomidou.mybatisplus.core.injector.AbstractMethod;
import com.baomidou.mybatisplus.core.injector.DefaultSqlInjector;

import java.util.List;

/**
 * <p>@author: NirvanaFire(nirvanafire@gmail.com)
 * <p>@description: keep-one
 * <p>@since: v1.1
 **/
public class MyLogicSqlInjector extends DefaultSqlInjector {

    @Override
    public List<AbstractMethod> getMethodList(Class<?> mapperClass) {

        List<AbstractMethod> methodList = super.getMethodList(mapperClass);

        methodList.add(new PermissionPage());

        return methodList;
    }
}
