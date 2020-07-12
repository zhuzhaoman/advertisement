package com.zzm.common.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author zhuzhaoman
 * @date 2020/7/12 0012 20:04
 * @description 通用返回对象
 */
@Data
@NoArgsConstructor // 无参构造函数
@AllArgsConstructor // 全参构造函数
public class CommonResponse<T> implements Serializable {

    private Integer code;
    private String msg;
    private T data;

    public CommonResponse(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
