package xin.keepmoving.admin.controller;

import com.qhkj.wxfw.common.R;
import com.qhkj.wxfw.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import xin.keepmoving.config.R;

import javax.servlet.http.HttpSession;

/**
 * <p>@author: NirvanaFire(nirvanafire@gmail.com)
 * <p>@description: wxfw
 * <p>@since: v1.1
 **/
@RestController
public class IndexController {

    @Autowired
    IUserService userService;

    @PostMapping("/login")
    public R login(HttpSession session, String username, String password) {

        return userService.login(session,
                username, password);
    }
}
