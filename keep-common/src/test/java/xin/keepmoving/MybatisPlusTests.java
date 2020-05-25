package xin.keepmoving;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import xin.keepmoving.domain.User;
import xin.keepmoving.mapper.UserMapper;

import java.util.List;

/**
 * <p>@author: NirvanaFire(nirvanafire@gmail.com)
 * <p>@description: keep-one
 * <p>@since: v1.1
 **/
@RunWith(SpringRunner.class)
//@SpringBootTest(classes = KeepOneCommonApplication.class)
@SpringBootTest
public class MybatisPlusTests {

    @Autowired
    UserMapper userMapper;

    @Test
    public void testQuery() {

        System.out.println("Test");

        List<User> users = userMapper.selectList(null);

        Assert.assertNotNull(users);

        System.out.println(users.size());
    }

    @Test
    public void testSelectPage() {

        Page<User> page = new Page<>();

        IPage<User> userIPage = userMapper.permissionPage(page, null);

        Assert.assertNotNull(userIPage);

        System.out.println(userIPage.getRecords().size());
    }
}
