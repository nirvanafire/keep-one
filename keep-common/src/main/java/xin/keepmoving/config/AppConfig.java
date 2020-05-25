package xin.keepmoving.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * <p>@author: NirvanaFire(nirvanafire@gmail.com)
 * <p>@description: keep-one
 * <p>@since: v1.1
 **/
@Configuration
@ComponentScan("xin.keepmoving")
@MapperScan(basePackages = {"xin.keepmoving.mapper"})
public class AppConfig {
}
