package com.maozi.base.api.impl.rest;

import com.maozi.base.BaseEnum;
import com.maozi.base.annotation.Get;
import com.maozi.base.annotation.RestService;
import com.maozi.base.error.code.SystemErrorCode;
import com.maozi.base.result.EnumResult;
import com.maozi.common.BaseCommon;
import com.maozi.common.result.AbstractBaseResult;
import com.maozi.common.result.error.ErrorResult;
import com.maozi.mvc.config.enums.EnumConfig;
import io.swagger.v3.oas.annotations.tags.Tag;
import java.util.List;
import java.util.Map;
import org.springframework.web.bind.annotation.PathVariable;


@RestService
@Tag(name = "【全局】枚举常量")
public class RestApplicationCode extends BaseCommon<SystemErrorCode> {

	private static final String PATH = "/application";

	@Get(value = PATH + "/enum/list",description = "【服务枚举】列表")
	public AbstractBaseResult<Map<String, List<BaseEnum>>> list() {
		return success(EnumConfig.enums);
	}

	@Get(value = PATH + "/enum/{name}/get",description = "【服务枚举】详情")
	public AbstractBaseResult<List<BaseEnum>> get(@PathVariable("name") String name) {
		return success(EnumConfig.enums.get(name));
	}

	@Get(value = PATH + "/error",description = "【服务测试】测试失败结果")
	public ErrorResult error() {
		return error(getCodes().SYSTEM_ERROR);
	}

	@Get(value = PATH + "/base/enum",description = "【服务测试】模板枚举")
	public AbstractBaseResult<EnumResult> baseEnum() {
		return success(EnumResult.builder().value(0).desc("测试枚举").build());
	}

}
