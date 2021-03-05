package cn.edu.whu.handler;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.UUID;

public class MyInterceptor implements HandlerInterceptor {

    //验证登录的用户信息，正确return true，其它return false
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("==拦截器的MyInterceptor的preHandle()");
        String loginName = "";
        //从Session中获取name值
        Object attr = request.getSession().getAttribute("name");
        if (attr!=null){
            loginName = (String) attr;
        }
        System.out.println(UUID.randomUUID().toString());
        //判断登录的账户，是否符合要求
        if (!"zs".equals(loginName)){
            //不能后文系统，给用户提示
            request.getRequestDispatcher("/tips.jsp").forward(request,response);
            return false;
        }

        return true;
    }

}
