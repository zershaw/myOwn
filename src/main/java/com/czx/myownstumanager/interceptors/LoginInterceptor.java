package com.czx.myownstumanager.interceptors;

import com.czx.myownstumanager.pojo.Admin;
import com.czx.myownstumanager.pojo.Student;
import com.czx.myownstumanager.pojo.Teacher;
import com.czx.myownstumanager.util.Const;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws IOException{
        Admin user = (Admin)request.getSession().getAttribute(Const.ADMIN); // 得到session中名为“admin”的属性，并强转成admin对象
        Teacher teacher = (Teacher)request.getSession().getAttribute(Const.TEACHER);
        Student student = (Student)request.getSession().getAttribute(Const.STUDENT);
        if(!StringUtils.isEmpty(user) || StringUtils.isEmpty(teacher) || StringUtils.isEmpty(student)){
            return true;
        }

        // 失败则重定向
        // 试试就试试111111111111111111111111
        response.sendRedirect(request.getContextPath() + "system/login");
        return false;
    }
}
