package com.upto.park.interceptor;



import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class TokenInterceptor extends HandlerInterceptorAdapter {

    private static final String SSI_HEADER_TOKEN = "ssi-token";
    /**
     * get token from ssi-token or (other way)
     */
    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response, Object handler) throws Exception {


//        String token  = request.getHeader(SSI_HEADER_TOKEN);
//
//        if(CurrentUserUtil.isLogin(token)){
//            TokenHolder.getHolder().setToken(token);
//            return super.preHandle(request, response, handler);
//        }else{
//            response.setStatus(HttpStatus.FORBIDDEN.value());
//            return false;
//        }
        return true;

    }



    @Override
    public void postHandle(HttpServletRequest request,
                           HttpServletResponse response, Object handler,
                           ModelAndView modelAndView) throws Exception {
        super.postHandle(request, response, handler, modelAndView);
    }


    /**
     * recycle token ( webapp )
     */
    @Override
    public void afterCompletion(HttpServletRequest request,
                                HttpServletResponse response, Object handler, Exception ex)
            throws Exception {

//        TokenHolder.getHolder().remove();
        super.afterCompletion(request, response, handler, ex);
    }



}

