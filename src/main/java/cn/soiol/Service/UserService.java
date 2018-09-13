package cn.soiol.Service;

import cn.soiol.entity.TableBean;
import cn.soiol.mapper.UserDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class UserService {
    @Resource
    private UserDao userDao;

    //插入服务
    public int InsertService(Map<String,Object> userMap) throws Exception {
        return userDao.insertUser(userMap);
    }

    //查询全部服务
    public List<TableBean> selectAllService(){
        return userDao.selectAllUser();
    }

    //查询单个服务
    public List<TableBean> selectService(String param,String value) throws Exception {
        return userDao.selectUser(param,value);
    }
}
