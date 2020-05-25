package xin.keepmoving.mybatis;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import org.apache.ibatis.annotations.Param;

/**
 * <p>@author: NirvanaFire(nirvanafire@gmail.com)
 * <p>@description: keep-one
 * <p>@since: v1.1
 **/
public interface BasePermissionMapper<T> extends BaseMapper<T> {

    /**
     * 权限分页
     * @param page
     * @param queryWrapper
     * @return
     */
    /**
     * 根据 entity 条件，查询全部记录（并翻页）
     *  @param page         分页查询条件（可以为 RowBounds.DEFAULT）
     * @param queryWrapper 实体对象封装操作类（可以为 null）
     */
    <E extends IPage<T>> E permissionPage(IPage<T> page, @Param(Constants.WRAPPER) Wrapper<T> queryWrapper);
}
