package ru.itis.springbootapp.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.Authentication;
import ru.itis.springbootapp.security.UserDetailsImpl;

@Aspect
@Configuration
public class HelloPageAspect {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Before("execution(public String ru.itis.springbootapp.controllers.HelloController.getHello(*)) && args(authentication))")
    public void before(JoinPoint joinPoint, Authentication authentication){
        UserDetailsImpl userDetails = (UserDetailsImpl)authentication.getPrincipal();
        logger.info(userDetails.getUsername());
    }
}
