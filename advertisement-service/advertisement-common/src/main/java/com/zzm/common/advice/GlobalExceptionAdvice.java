package com.zzm.common.advice;

import com.zzm.common.exception.AllException;
import com.zzm.common.vo.CommonResponse;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

/**
 * @author zhuzhaoman
 * @date 2020/7/12 0012 20:26
 * @description 描述
 */
@RestControllerAdvice
public class GlobalExceptionAdvice {

    @ExceptionHandler(value = AllException.class)
    public CommonResponse<String> handlerAllException(HttpServletRequest request, AllException exception) {
        CommonResponse<String> response = new CommonResponse<>(-1, "business error");
        response.setData(exception.getMessage());

        return response;
    }

}
