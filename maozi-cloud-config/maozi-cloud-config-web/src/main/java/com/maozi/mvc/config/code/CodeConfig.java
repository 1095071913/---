package com.maozi.mvc.config.code;

import com.maozi.base.AbstractBaseCode;
import com.maozi.base.CodeData;
import com.maozi.base.error.code.SystemErrorCode;
import com.maozi.common.BaseCommon;
import com.maozi.utils.SpringUtil;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class CodeConfig {

    public static Map<Integer, CodeData> codes = new HashMap<Integer, CodeData>();

    public CodeConfig(){
        initCode();
    }

    private void initCode(){

        Map<String, AbstractBaseCode> codeBeans = SpringUtil.getBeansOfType(AbstractBaseCode.class);

        for(AbstractBaseCode codeBean : codeBeans.values()){

            try {

                for(Field field : codeBean.getClass().getDeclaredFields()){

                    field.setAccessible(true);

                    if(field.get(codeBean) instanceof CodeData<?> codeData){
                        codes.put(codeData.getCode(),codeData);
                    }

                }

            } catch (Exception e) {
                BaseCommon.error(e);
            }

        }

    }

    public static CodeData getCode(Integer code) {

        CodeData codeData = codes.get(code);

        return BaseCommon.isNull(codeData) ? SystemErrorCode.NOT_EXIST_CODE_ERROR : codeData;

    }
}