package org.yunai.online_class.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.yunai.online_class.utils.JsonData;

/**
 * 异常处理类
 */
@ControllerAdvice
public class CustomExceptionHandler {


    private final static Logger logger = LoggerFactory.getLogger(CustomExceptionHandler.class);


    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public JsonData handle(Exception e){

        logger.error("[ 系统异常 ]{}",e);

        if( e instanceof YAException){

            YAException yaException = (YAException) e;

            return JsonData.buildError(yaException.getCode(),yaException.getMsg());

        }else {

            return JsonData.buildError("全局异常，未知错误");

        }


    }

}
