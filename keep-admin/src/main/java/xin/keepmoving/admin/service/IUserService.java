package xin.keepmoving.admin.service;

import com.qhkj.wxfw.common.PageInfo;
import com.qhkj.wxfw.common.R;
import com.qhkj.wxfw.domain.User;
import org.springframework.data.domain.Page;
import xin.keepmoving.config.PageInfo;
import xin.keepmoving.config.R;

import javax.servlet.http.HttpSession;

/**
 * <p>@author: NirvanaFire(nirvanafire@gmail.com)
 * <p>@description: wxfw
 * <p>@since: v1.1
 **/
public interface IUserService {
    R login(HttpSession session, String username, String password);

    Page<User> pageList(PageInfo pageInfo);
}
