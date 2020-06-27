package xin.keepmoving.admin.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;
import xin.keepmoving.admin.service.IUserService;
import xin.keepmoving.config.CustomProperties;
import xin.keepmoving.config.PageInfo;
import xin.keepmoving.config.R;
import xin.keepmoving.constants.CommonConstants;
import xin.keepmoving.domain.User;
import xin.keepmoving.mapper.UserMapper;

import javax.servlet.http.HttpSession;

/**
 * <p>@author: NirvanaFire(nirvanafire@gmail.com)
 * <p>@description: wxfw
 * <p>@since: v1.1
 **/
@Slf4j
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public R login(HttpSession session, String username, String password) {

        User user = userMapper.findByUsername(username);
        if (user != null) {
            String encodePassword = DigestUtils.md5Hex((password + user.getSalt()).getBytes());
            if (user.getPassword().equals(encodePassword)) {
                user.setPassword(null);
                user.setSalt(null);
                session.setAttribute(CommonConstants.LOGIN_USER, user);
                session.setAttribute("title", new CustomProperties().getTitle());
                return R.ok("/page/intentUser");
            }
        }

        return R.failed("用户名或密码错误");
    }

    @Override
    public Page<User> pageList(PageInfo pageInfo) {

        PageRequest pageable = PageRequest.of(pageInfo.getCurrent(), pageInfo.getSize(), Sort.Direction.DESC, "createdDate");

        Page<User> list = userRepository.findAll(pageable);

        return list;
    }

}
