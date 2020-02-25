package TTT;

import com.stylefeng.guns.rest.common.persistence.model.SysUser;
import com.stylefeng.guns.rest.common.persistence.dao.SysUserMapper;
import TTT.ISysUserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 管理员表 服务实现类
 * </p>
 *
 * @author jiangzh
 * @since 2019-09-15
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements ISysUserService {

}
