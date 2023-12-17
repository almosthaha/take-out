package com.sky.annotation;

import com.sky.enumeration.OperationType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *  自定义注解:用于标识某个方法需要进行功能字段自动填充处理
 */

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface AutoFill {

    /**
     * 使用注解的时候,注解的属性一定要作为形参
     * value为特殊注解,这里的value为特殊名称,当属性只有value时,
     * 可以直接为注解进行赋值,value可以不用写
     * 当由多个属性的时候,注解的value名称一定要写
     * @return
     */
    OperationType value();
}
