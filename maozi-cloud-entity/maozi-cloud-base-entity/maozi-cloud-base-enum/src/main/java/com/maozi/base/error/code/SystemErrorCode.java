package com.maozi.base.error.code;

import com.maozi.base.AbstractBaseCode;
import com.maozi.base.CodeData;
import org.springframework.stereotype.Component;

@Component
public class SystemErrorCode extends AbstractBaseCode {

    public final static CodeData NOT_EXIST_CODE_ERROR = new CodeData(0,"没有此编码");

    public final static CodeData SERVICE_RPC_ERROR = new CodeData(1,"服务调用失败");

    public final static CodeData FORBIDDEN_ERROR = new CodeData(2,"已被禁用");

    public final static CodeData SERVICE_NOT_EXIST_ERROR = new CodeData(3,"服务不存在");

    public final static CodeData DATA_NOT_EXIST_ERROR = new CodeData(4,"数据不存在");

    public final static CodeData DATA_EXIST_ERROR = new CodeData(5,"数据已存在");

    public final static CodeData NOT_SET_RESPONSE_ERROR = new CodeData(6,"服务端未设置返回类型");

    public final static CodeData PARAM_ERROR = new CodeData(400,"参数错误");

    public final static CodeData USER_AUTH_ERROR = new CodeData(401,"用户认证错误");

    public final static CodeData MALICE_REQUEST_ERROR = new CodeData(402,"恶意请求");

    public final static CodeData PERMISSION_ERROR = new CodeData(403,"权限不足");

    public final static CodeData NOT_RESOURCE_ERROR = new CodeData(404,"资源不存在");

    public final static CodeData REQUEST_METHOD_ERROR = new CodeData(405,"请求方法错误");

    public final static CodeData REQUEST_FORMAT_ERROR = new CodeData(415,"请求格式错误");

    public final static CodeData CURRENT_LIMITING_ERROR = new CodeData(429,"限流中");

    public final static CodeData SYSTEM_ERROR = new CodeData(500,"内部服务错误");

}
