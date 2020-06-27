package xin.keepmoving.config;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * <p>@author: NirvanaFire(nirvanafire@gmail.com)
 * <p>@description: wxfw
 * <p>@since: v1.1
 **/
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PageInfo implements Serializable {

    private int current = 0;

    private int size = 10;
}
