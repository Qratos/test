package com.chaoxuan.aspect;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.orm.jpa.vendor.OpenJpaDialect;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017/8/24 0024.
 */
@Aspect
@Component
public class MyAspect {
@Pointcut("execution(* com.chaoxuan.controller.HelloController.hello(..))")
private void doAspect(){}
    @AfterReturning(returning = "object",pointcut = "doAspect()")
    public void doAfter(Object object){
        //删除刚才生成的zip包
        System.out.println(object.toString());
        System.out.println("后置通知");
    }

}
