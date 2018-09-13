package cn.soiol.mapper;

import cn.soiol.entity.TableBean;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

@Mapper
public interface UserDao {

    //插入操作
    @Insert("INSERT INTO user(name,grade,gender,campus,uid,section,time,special,phone,profile) VALUES(#{params.name},#{params.grade},#{params.gender},#{params.campus},${params.uid},#{params.section},#{params.time},#{params.special},#{params.phone},#{params.profile})")
    int insertUser(@Param("params") Map<String, Object> userMap) throws Exception;


    //查询全部数据
    @Select("SELECT * FROM user")
    List<TableBean> selectAllUser();

    //查询单个数据
    @Select("SELECT * FROM user WHERE ${param} = ${value}")
    List<TableBean> selectUser(@Param("param") String param, @Param("value") String value)throws Exception;
}
