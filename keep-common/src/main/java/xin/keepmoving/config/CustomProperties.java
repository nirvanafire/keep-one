package xin.keepmoving.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * <p>@author: NirvanaFire(nirvanafire@gmail.com)
 * <p>@description: wxfw
 * <p>@since: v1.1
 **/
@Data
@ConfigurationProperties("nirvana")
public class CustomProperties {

    private String title;
}
