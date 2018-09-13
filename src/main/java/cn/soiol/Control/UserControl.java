package cn.soiol.Control;

import cn.soiol.Service.UserService;
import cn.soiol.entity.TableBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.*;

@RestController
public class UserControl {
    @Autowired
    private UserService userService;

    public Map<String,Object> userMap = new HashMap<>();

    //插入控制
    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    public int InsertControl(HttpServletRequest request, HttpServletResponse response){
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html; charset=utf-8");
        try {
            userMap.clear();
            Enumeration paramNames = request.getParameterNames();
            while (paramNames.hasMoreElements()) {
                String param = (String) paramNames.nextElement();
                String value = new String(request.getParameter(param).getBytes("UTF-8"), "UTF-8");
                if(param != "uid") {
                    userMap.put(param, value);
                }else {
                    int uid = Integer.parseInt(value);
                    userMap.put(param,uid);
                }
            }
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String time = simpleDateFormat.format(new Date());
            userMap.put("time",time);
            int result = userService.InsertService(userMap);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }
    //查找全部控制
    @RequestMapping(value = "/selectall",method = RequestMethod.POST)
    public List<TableBean> SelectAllControl(){
        return userService.selectAllService();
    }

    //查找单个控制
    @RequestMapping(value = "/select",method = RequestMethod.POST)
    public List<TableBean> selectControl(HttpServletRequest request, HttpServletResponse response) throws UnsupportedEncodingException {
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html; charset=utf-8");
        String param = new String(request.getParameter("param").getBytes("UTF-8"),"UTF-8");
        String value = new String(request.getParameter("value").getBytes("UTF-8"),"UTF-8");
        try {
            return userService.selectService(param,value);
        } catch (Exception e) {
            e.printStackTrace();
            return new ArrayList<TableBean>();
        }
    }
}
